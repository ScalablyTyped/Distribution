package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaUpload extends js.Object {
  /**
    * A boolean that determines whether a notification for the completion of an
    * upload should be sent to the backend. These notifications will not be seen
    * by the client and will not consume quota.
    */
  var completeNotification: js.UndefOr[Boolean] = js.native
  /** Name of the Scotty dropzone to use for the current API. */
  var dropzone: js.UndefOr[String] = js.native
  /** Whether upload is enabled. */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Optional maximum acceptable size for an upload.
    * The size is specified in bytes.
    */
  var maxSize: js.UndefOr[String] = js.native
  /**
    * An array of mimetype patterns. Esf will only accept uploads that match one
    * of the given patterns.
    */
  var mimeTypes: js.UndefOr[js.Array[String]] = js.native
  /** Whether to receive a notification for progress changes of media upload. */
  var progressNotification: js.UndefOr[Boolean] = js.native
  /** Whether to receive a notification on the start of media upload. */
  var startNotification: js.UndefOr[Boolean] = js.native
  /**
    * DO NOT USE FIELDS BELOW THIS LINE UNTIL THIS WARNING IS REMOVED.
    *
    * Specify name of the upload service if one is used for upload.
    */
  var uploadService: js.UndefOr[String] = js.native
}

object MediaUpload {
  @scala.inline
  def apply(): MediaUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaUpload]
  }
  @scala.inline
  implicit class MediaUploadOps[Self <: MediaUpload] (val x: Self) extends AnyVal {
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
    def setCompleteNotification(value: Boolean): Self = this.set("completeNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleteNotification: Self = this.set("completeNotification", js.undefined)
    @scala.inline
    def setDropzone(value: String): Self = this.set("dropzone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropzone: Self = this.set("dropzone", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMaxSize(value: String): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setMimeTypesVarargs(value: String*): Self = this.set("mimeTypes", js.Array(value :_*))
    @scala.inline
    def setMimeTypes(value: js.Array[String]): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeTypes: Self = this.set("mimeTypes", js.undefined)
    @scala.inline
    def setProgressNotification(value: Boolean): Self = this.set("progressNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressNotification: Self = this.set("progressNotification", js.undefined)
    @scala.inline
    def setStartNotification(value: Boolean): Self = this.set("startNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartNotification: Self = this.set("startNotification", js.undefined)
    @scala.inline
    def setUploadService(value: String): Self = this.set("uploadService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadService: Self = this.set("uploadService", js.undefined)
  }
  
}

