package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base definition information for tools
  */
@js.native
trait ElementDefinitionBase extends Element {
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  /**
    * Max cardinality of the base element
    */
  var max: String = js.native
  /**
    * Min cardinality of the base element
    */
  var min: unsignedInt = js.native
  /**
    * Path that identifies the base element
    */
  var path: String = js.native
}

object ElementDefinitionBase {
  @scala.inline
  def apply(max: String, min: unsignedInt, path: String): ElementDefinitionBase = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionBase]
  }
  @scala.inline
  implicit class ElementDefinitionBaseOps[Self <: ElementDefinitionBase] (val x: Self) extends AnyVal {
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
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: unsignedInt): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def set_max(value: Element): Self = this.set("_max", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_max: Self = this.set("_max", js.undefined)
    @scala.inline
    def set_min(value: Element): Self = this.set("_min", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_min: Self = this.set("_min", js.undefined)
    @scala.inline
    def set_path(value: Element): Self = this.set("_path", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_path: Self = this.set("_path", js.undefined)
  }
  
}

