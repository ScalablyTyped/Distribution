package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailsResource extends js.Object {
  /**
    * Lists thumbnails of images attached to a step.
    *
    * May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read from the project, or from any of the
    * images - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the step does not exist, or if any of the images do not exist
    */
  def list(request: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFieldsHistoryIdKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ListStepThumbnailsResponse]
}

object ThumbnailsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFieldsHistoryIdKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListStepThumbnailsResponse]
    ]
  ): ThumbnailsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[ThumbnailsResource]
  }
}

