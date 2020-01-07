package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of Page that are only relevant for pages with page_type
  * MASTER.
  */
@js.native
trait Schema$MasterProperties extends js.Object {
  /**
    * The human-readable name of the master.
    */
  var displayName: js.UndefOr[String] = js.native
}

object Schema$MasterProperties {
  @scala.inline
  def apply(displayName: String = null): Schema$MasterProperties = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MasterProperties]
  }
}

