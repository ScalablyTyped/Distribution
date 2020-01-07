package typings.googleapis.buildSrcApisAppsactivityV1Mod.appsactivity_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a renametype event.
  */
@js.native
trait Schema$Rename extends js.Object {
  /**
    * The new title.
    */
  var newTitle: js.UndefOr[String] = js.native
  /**
    * The old title.
    */
  var oldTitle: js.UndefOr[String] = js.native
}

object Schema$Rename {
  @scala.inline
  def apply(newTitle: String = null, oldTitle: String = null): Schema$Rename = {
    val __obj = js.Dynamic.literal()
    if (newTitle != null) __obj.updateDynamic("newTitle")(newTitle.asInstanceOf[js.Any])
    if (oldTitle != null) __obj.updateDynamic("oldTitle")(oldTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Rename]
  }
}

