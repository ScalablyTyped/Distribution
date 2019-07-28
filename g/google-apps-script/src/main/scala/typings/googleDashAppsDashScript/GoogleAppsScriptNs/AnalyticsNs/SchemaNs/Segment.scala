package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  var created: js.UndefOr[String] = js.undefined
  var definition: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var segmentId: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
}

object Segment {
  @scala.inline
  def apply(
    created: String = null,
    definition: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    segmentId: String = null,
    selfLink: String = null,
    `type`: String = null,
    updated: String = null
  ): Segment = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Segment]
  }
}

