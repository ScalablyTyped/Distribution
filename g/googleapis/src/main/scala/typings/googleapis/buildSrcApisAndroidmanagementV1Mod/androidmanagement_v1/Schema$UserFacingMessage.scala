package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a user-facing message with locale info. The maximum message length
  * is 4096 characters.
  */
@js.native
trait Schema$UserFacingMessage extends js.Object {
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

object Schema$UserFacingMessage {
  @scala.inline
  def apply(defaultMessage: String = null, localizedMessages: StringDictionary[String] = null): Schema$UserFacingMessage = {
    val __obj = js.Dynamic.literal()
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage.asInstanceOf[js.Any])
    if (localizedMessages != null) __obj.updateDynamic("localizedMessages")(localizedMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserFacingMessage]
  }
}

