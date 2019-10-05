package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentReference extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var isRoot: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var parentLink: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object ParentReference {
  @scala.inline
  def apply(
    id: String = null,
    isRoot: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    parentLink: String = null,
    selfLink: String = null
  ): ParentReference = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isRoot)) __obj.updateDynamic("isRoot")(isRoot)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[ParentReference]
  }
}

