package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for CreateSession.
  */
@js.native
trait Schema$CreateSessionRequest extends js.Object {
  /**
    * The session to create.
    */
  var session: js.UndefOr[Schema$Session] = js.native
}

object Schema$CreateSessionRequest {
  @scala.inline
  def apply(session: Schema$Session = null): Schema$CreateSessionRequest = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateSessionRequest]
  }
}

