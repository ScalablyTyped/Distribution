package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POP settings for an account.
  */
@js.native
trait Schema$PopSettings extends js.Object {
  /**
    * The range of messages which are accessible via POP.
    */
  var accessWindow: js.UndefOr[String] = js.native
  /**
    * The action that will be executed on a message after it has been fetched
    * via POP.
    */
  var disposition: js.UndefOr[String] = js.native
}

object Schema$PopSettings {
  @scala.inline
  def apply(accessWindow: String = null, disposition: String = null): Schema$PopSettings = {
    val __obj = js.Dynamic.literal()
    if (accessWindow != null) __obj.updateDynamic("accessWindow")(accessWindow.asInstanceOf[js.Any])
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PopSettings]
  }
}

