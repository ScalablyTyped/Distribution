package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSnippet extends js.Object {
  var audioTrackType: js.UndefOr[String] = js.native
  var failureReason: js.UndefOr[String] = js.native
  var isAutoSynced: js.UndefOr[Boolean] = js.native
  var isCC: js.UndefOr[Boolean] = js.native
  var isDraft: js.UndefOr[Boolean] = js.native
  var isEasyReader: js.UndefOr[Boolean] = js.native
  var isLarge: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var lastUpdated: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var trackKind: js.UndefOr[String] = js.native
  var videoId: js.UndefOr[String] = js.native
}

object CaptionSnippet {
  @scala.inline
  def apply(): CaptionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSnippet]
  }
  @scala.inline
  implicit class CaptionSnippetOps[Self <: CaptionSnippet] (val x: Self) extends AnyVal {
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
    def setAudioTrackType(value: String): Self = this.set("audioTrackType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioTrackType: Self = this.set("audioTrackType", js.undefined)
    @scala.inline
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    @scala.inline
    def setIsAutoSynced(value: Boolean): Self = this.set("isAutoSynced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAutoSynced: Self = this.set("isAutoSynced", js.undefined)
    @scala.inline
    def setIsCC(value: Boolean): Self = this.set("isCC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCC: Self = this.set("isCC", js.undefined)
    @scala.inline
    def setIsDraft(value: Boolean): Self = this.set("isDraft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDraft: Self = this.set("isDraft", js.undefined)
    @scala.inline
    def setIsEasyReader(value: Boolean): Self = this.set("isEasyReader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEasyReader: Self = this.set("isEasyReader", js.undefined)
    @scala.inline
    def setIsLarge(value: Boolean): Self = this.set("isLarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLarge: Self = this.set("isLarge", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLastUpdated(value: String): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdated: Self = this.set("lastUpdated", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTrackKind(value: String): Self = this.set("trackKind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackKind: Self = this.set("trackKind", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
  
}

