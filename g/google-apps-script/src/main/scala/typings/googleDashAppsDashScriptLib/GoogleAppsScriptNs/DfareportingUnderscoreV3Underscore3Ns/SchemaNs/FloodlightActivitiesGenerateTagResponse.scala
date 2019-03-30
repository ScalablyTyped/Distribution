package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivitiesGenerateTagResponse extends js.Object {
  var floodlightActivityTag: js.UndefOr[java.lang.String] = js.undefined
  var globalSiteTagGlobalSnippet: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object FloodlightActivitiesGenerateTagResponse {
  @scala.inline
  def apply(
    floodlightActivityTag: java.lang.String = null,
    globalSiteTagGlobalSnippet: java.lang.String = null,
    kind: java.lang.String = null
  ): FloodlightActivitiesGenerateTagResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityTag != null) __obj.updateDynamic("floodlightActivityTag")(floodlightActivityTag)
    if (globalSiteTagGlobalSnippet != null) __obj.updateDynamic("globalSiteTagGlobalSnippet")(globalSiteTagGlobalSnippet)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[FloodlightActivitiesGenerateTagResponse]
  }
}

