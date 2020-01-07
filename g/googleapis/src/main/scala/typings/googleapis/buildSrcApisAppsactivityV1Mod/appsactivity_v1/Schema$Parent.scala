package typings.googleapis.buildSrcApisAppsactivityV1Mod.appsactivity_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a parent object. For example, a folder in Drive
  * is a parent for all files within it.
  */
@js.native
trait Schema$Parent extends js.Object {
  /**
    * The parent&#39;s ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether this is the root folder.
    */
  var isRoot: js.UndefOr[Boolean] = js.native
  /**
    * The parent&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$Parent {
  @scala.inline
  def apply(id: String = null, isRoot: js.UndefOr[Boolean] = js.undefined, title: String = null): Schema$Parent = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isRoot)) __obj.updateDynamic("isRoot")(isRoot.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Parent]
  }
}

