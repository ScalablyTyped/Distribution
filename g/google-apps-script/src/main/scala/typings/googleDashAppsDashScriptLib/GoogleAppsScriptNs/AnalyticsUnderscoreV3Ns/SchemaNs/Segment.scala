package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  var created: js.UndefOr[java.lang.String] = js.undefined
  var definition: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var segmentId: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

object Segment {
  @scala.inline
  def apply(
    created: java.lang.String = null,
    definition: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    segmentId: java.lang.String = null,
    selfLink: java.lang.String = null,
    `type`: java.lang.String = null,
    updated: java.lang.String = null
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

