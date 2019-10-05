package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetSnippet extends js.Object {
  var customId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isrc: js.UndefOr[String] = js.undefined
  var iswc: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var timeCreated: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AssetSnippet {
  @scala.inline
  def apply(
    customId: String = null,
    id: String = null,
    isrc: String = null,
    iswc: String = null,
    kind: String = null,
    timeCreated: String = null,
    title: String = null,
    `type`: String = null
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

