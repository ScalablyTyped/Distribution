package typings.gapiDotClientDotAppsactivity.gapi.client.appsactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parent extends js.Object {
  /** The parent's ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Whether this is the root folder. */
  var isRoot: js.UndefOr[Boolean] = js.undefined
  /** The parent's title. */
  var title: js.UndefOr[String] = js.undefined
}

object Parent {
  @scala.inline
  def apply(id: String = null, isRoot: js.UndefOr[Boolean] = js.undefined, title: String = null): Parent = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isRoot)) __obj.updateDynamic("isRoot")(isRoot.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
}

