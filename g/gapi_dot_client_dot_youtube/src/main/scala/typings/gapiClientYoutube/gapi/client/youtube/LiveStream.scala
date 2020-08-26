package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveStream extends js.Object {
  /**
    * The cdn object defines the live stream's content delivery network (CDN) settings. These settings provide details about the manner in which you stream
    * your content to YouTube.
    */
  var cdn: js.UndefOr[CdnSettings] = js.native
  /** The content_details object contains information about the stream, including the closed captions ingestion URL. */
  var contentDetails: js.UndefOr[LiveStreamContentDetails] = js.native
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  /** The ID that YouTube assigns to uniquely identify the stream. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveStream". */
  var kind: js.UndefOr[String] = js.native
  /** The snippet object contains basic details about the stream, including its channel, title, and description. */
  var snippet: js.UndefOr[LiveStreamSnippet] = js.native
  /** The status object contains information about live stream's status. */
  var status: js.UndefOr[LiveStreamStatus] = js.native
}

object LiveStream {
  @scala.inline
  def apply(): LiveStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveStream]
  }
  @scala.inline
  implicit class LiveStreamOps[Self <: LiveStream] (val x: Self) extends AnyVal {
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
    def setCdn(value: CdnSettings): Self = this.set("cdn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdn: Self = this.set("cdn", js.undefined)
    @scala.inline
    def setContentDetails(value: LiveStreamContentDetails): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDetails: Self = this.set("contentDetails", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSnippet(value: LiveStreamSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    @scala.inline
    def setStatus(value: LiveStreamStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

