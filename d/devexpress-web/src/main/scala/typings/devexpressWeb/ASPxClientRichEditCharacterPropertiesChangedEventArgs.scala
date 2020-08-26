package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.CharacterPropertiesChanged event.
  */
@js.native
trait ASPxClientRichEditCharacterPropertiesChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the text buffer interval related to the changed characters.
    */
  var interval: Interval = js.native
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double = js.native
}

object ASPxClientRichEditCharacterPropertiesChangedEventArgs {
  @scala.inline
  def apply(interval: Interval, subDocumentId: Double): ASPxClientRichEditCharacterPropertiesChangedEventArgs = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditCharacterPropertiesChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientRichEditCharacterPropertiesChangedEventArgsOps[Self <: ASPxClientRichEditCharacterPropertiesChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setInterval(value: Interval): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubDocumentId(value: Double): Self = this.set("subDocumentId", value.asInstanceOf[js.Any])
  }
  
}

