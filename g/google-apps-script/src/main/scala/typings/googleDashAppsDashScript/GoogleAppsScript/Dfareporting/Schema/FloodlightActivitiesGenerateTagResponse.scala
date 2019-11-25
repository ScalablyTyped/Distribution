package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivitiesGenerateTagResponse extends js.Object {
  var floodlightActivityTag: js.UndefOr[String] = js.undefined
  var globalSiteTagGlobalSnippet: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object FloodlightActivitiesGenerateTagResponse {
  @scala.inline
  def apply(
    floodlightActivityTag: String = null,
    globalSiteTagGlobalSnippet: String = null,
    kind: String = null
  ): FloodlightActivitiesGenerateTagResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityTag != null) __obj.updateDynamic("floodlightActivityTag")(floodlightActivityTag.asInstanceOf[js.Any])
    if (globalSiteTagGlobalSnippet != null) __obj.updateDynamic("globalSiteTagGlobalSnippet")(globalSiteTagGlobalSnippet.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloodlightActivitiesGenerateTagResponse]
  }
}

