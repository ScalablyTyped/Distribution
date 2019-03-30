package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetSnippet extends js.Object {
  var customId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var isrc: js.UndefOr[java.lang.String] = js.undefined
  var iswc: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var timeCreated: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AssetSnippet {
  @scala.inline
  def apply(
    customId: java.lang.String = null,
    id: java.lang.String = null,
    isrc: java.lang.String = null,
    iswc: java.lang.String = null,
    kind: java.lang.String = null,
    timeCreated: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): AssetSnippet = {
    val __obj = js.Dynamic.literal()
    if (customId != null) __obj.updateDynamic("customId")(customId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (isrc != null) __obj.updateDynamic("isrc")(isrc)
    if (iswc != null) __obj.updateDynamic("iswc")(iswc)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AssetSnippet]
  }
}

