package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract numbering list definition that defines the appearance and behavior of numbered paragraphs in a document.
  */
@js.native
trait AbstractNumberingList extends js.Object {
  /**
    * Gets or sets a value indicating whether an abstract numbering list is deleted.
    */
  var deleted: Boolean = js.native
}

object AbstractNumberingList {
  @scala.inline
  def apply(deleted: Boolean): AbstractNumberingList = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractNumberingList]
  }
  @scala.inline
  implicit class AbstractNumberingListOps[Self <: AbstractNumberingList] (val x: Self) extends AnyVal {
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
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
  }
  
}

