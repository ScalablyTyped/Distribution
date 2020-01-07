package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message from a batch update.
  */
@js.native
trait Schema$BatchUpdatePresentationResponse extends js.Object {
  /**
    * The presentation the updates were applied to.
    */
  var presentationId: js.UndefOr[String] = js.native
  /**
    * The reply of the updates.  This maps 1:1 with the updates, although
    * replies to some requests may be empty.
    */
  var replies: js.UndefOr[js.Array[Schema$Response]] = js.native
  /**
    * The updated write control after applying the request.
    */
  var writeControl: js.UndefOr[Schema$WriteControl] = js.native
}

object Schema$BatchUpdatePresentationResponse {
  @scala.inline
  def apply(
    presentationId: String = null,
    replies: js.Array[Schema$Response] = null,
    writeControl: Schema$WriteControl = null
  ): Schema$BatchUpdatePresentationResponse = {
    val __obj = js.Dynamic.literal()
    if (presentationId != null) __obj.updateDynamic("presentationId")(presentationId.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (writeControl != null) __obj.updateDynamic("writeControl")(writeControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchUpdatePresentationResponse]
  }
}

