package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Links records for 'same' item
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Linkage extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  /**
    * Whether this linkage assertion is active or not
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Who is responsible for linkages
    */
  var author: js.UndefOr[Reference] = js.native
  /**
    * Item to be linked
    */
  var item: js.Array[LinkageItem] = js.native
}

object Linkage {
  @scala.inline
  def apply(item: js.Array[LinkageItem]): Linkage = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linkage]
  }
  @scala.inline
  implicit class LinkageOps[Self <: Linkage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemVarargs(value: LinkageItem*): Self = this.set("item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[LinkageItem]): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def set_active(value: Element): Self = this.set("_active", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_active: Self = this.set("_active", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAuthor(value: Reference): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
  }
  
}

