package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains floating text boxes settings.
  */
@js.native
trait FloatingTextBoxInfo extends FloatingObjectInfo {
  /**
    * Gets the sub-document representing the floating text box's content.
    */
  val contentSubDocument: SubDocument = js.native
}

object FloatingTextBoxInfo {
  @scala.inline
  def apply(contentSubDocument: SubDocument, parentSubDocument: SubDocument, position: Double): FloatingTextBoxInfo = {
    val __obj = js.Dynamic.literal(contentSubDocument = contentSubDocument.asInstanceOf[js.Any], parentSubDocument = parentSubDocument.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingTextBoxInfo]
  }
  @scala.inline
  implicit class FloatingTextBoxInfoOps[Self <: FloatingTextBoxInfo] (val x: Self) extends AnyVal {
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
    def setContentSubDocument(value: SubDocument): Self = this.set("contentSubDocument", value.asInstanceOf[js.Any])
  }
  
}

