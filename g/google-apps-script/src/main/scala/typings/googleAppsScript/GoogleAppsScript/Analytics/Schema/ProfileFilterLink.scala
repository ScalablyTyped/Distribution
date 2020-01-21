package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileFilterLink extends js.Object {
  var filterRef: js.UndefOr[FilterRef] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var profileRef: js.UndefOr[ProfileRef] = js.undefined
  var rank: js.UndefOr[Double] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object ProfileFilterLink {
  @scala.inline
  def apply(
    filterRef: FilterRef = null,
    id: String = null,
    kind: String = null,
    profileRef: ProfileRef = null,
    rank: Int | Double = null,
    selfLink: String = null
  ): ProfileFilterLink = {
    val __obj = js.Dynamic.literal()
    if (filterRef != null) __obj.updateDynamic("filterRef")(filterRef.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (profileRef != null) __obj.updateDynamic("profileRef")(profileRef.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileFilterLink]
  }
}

