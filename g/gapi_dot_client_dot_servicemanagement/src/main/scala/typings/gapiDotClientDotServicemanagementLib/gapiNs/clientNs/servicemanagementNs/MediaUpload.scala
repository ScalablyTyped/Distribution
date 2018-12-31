package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaUpload extends js.Object {
  /**
    * A boolean that determines whether a notification for the completion of an
    * upload should be sent to the backend. These notifications will not be seen
    * by the client and will not consume quota.
    */
  var completeNotification: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of the Scotty dropzone to use for the current API. */
  var dropzone: js.UndefOr[java.lang.String] = js.undefined
  /** Whether upload is enabled. */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional maximum acceptable size for an upload.
    * The size is specified in bytes.
    */
  var maxSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of mimetype patterns. Esf will only accept uploads that match one
    * of the given patterns.
    */
  var mimeTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether to receive a notification for progress changes of media upload. */
  var progressNotification: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to receive a notification on the start of media upload. */
  var startNotification: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * DO NOT USE FIELDS BELOW THIS LINE UNTIL THIS WARNING IS REMOVED.
    *
    * Specify name of the upload service if one is used for upload.
    */
  var uploadService: js.UndefOr[java.lang.String] = js.undefined
}

