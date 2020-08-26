package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivitiesGenerateTagResponse extends js.Object {
  var floodlightActivityTag: js.UndefOr[String] = js.native
  var globalSiteTagGlobalSnippet: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
}

object FloodlightActivitiesGenerateTagResponse {
  @scala.inline
  def apply(): FloodlightActivitiesGenerateTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivitiesGenerateTagResponse]
  }
  @scala.inline
  implicit class FloodlightActivitiesGenerateTagResponseOps[Self <: FloodlightActivitiesGenerateTagResponse] (val x: Self) extends AnyVal {
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
    def setFloodlightActivityTag(value: String): Self = this.set("floodlightActivityTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityTag: Self = this.set("floodlightActivityTag", js.undefined)
    @scala.inline
    def setGlobalSiteTagGlobalSnippet(value: String): Self = this.set("globalSiteTagGlobalSnippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalSiteTagGlobalSnippet: Self = this.set("globalSiteTagGlobalSnippet", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

