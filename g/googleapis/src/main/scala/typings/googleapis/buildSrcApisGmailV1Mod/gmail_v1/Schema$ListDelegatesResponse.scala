package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListDelegates method.
  */
@js.native
trait Schema$ListDelegatesResponse extends js.Object {
  /**
    * List of the user&#39;s delegates (with any verification status).
    */
  var delegates: js.UndefOr[js.Array[Schema$Delegate]] = js.native
}

object Schema$ListDelegatesResponse {
  @scala.inline
  def apply(delegates: js.Array[Schema$Delegate] = null): Schema$ListDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    if (delegates != null) __obj.updateDynamic("delegates")(delegates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDelegatesResponse]
  }
}

