package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a user-facing message with locale info. The maximum message length
  * is 4096 characters.
  */
@js.native
trait SchemaUserFacingMessage extends js.Object {
  /**
    * The default message displayed if no localized message is specified or the
    * user&#39;s locale doesn&#39;t match with any of the localized messages. A
    * default message must be provided if any localized messages are provided.
    */
  var defaultMessage: js.UndefOr[String] = js.native
  /**
    * A map containing &lt;locale, message&gt; pairs, where locale is a
    * well-formed BCP 47 language
    * (https://www.w3.org/International/articles/language-tags/) code, such as
    * en-US, es-ES, or fr.
    */
  var localizedMessages: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaUserFacingMessage {
  @scala.inline
  def apply(): SchemaUserFacingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserFacingMessage]
  }
  @scala.inline
  implicit class SchemaUserFacingMessageOps[Self <: SchemaUserFacingMessage] (val x: Self) extends AnyVal {
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
    def setDefaultMessage(value: String): Self = this.set("defaultMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMessage: Self = this.set("defaultMessage", js.undefined)
    @scala.inline
    def setLocalizedMessages(value: StringDictionary[String]): Self = this.set("localizedMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizedMessages: Self = this.set("localizedMessages", js.undefined)
  }
  
}

