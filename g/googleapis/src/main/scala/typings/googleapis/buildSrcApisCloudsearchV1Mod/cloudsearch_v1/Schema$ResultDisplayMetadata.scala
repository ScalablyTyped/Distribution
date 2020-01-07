package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ResultDisplayMetadata extends js.Object {
  /**
    * The metalines content to be displayed with the result.
    */
  var metalines: js.UndefOr[js.Array[Schema$ResultDisplayLine]] = js.native
  /**
    * The display label for the object.
    */
  var objectTypeLabel: js.UndefOr[String] = js.native
}

object Schema$ResultDisplayMetadata {
  @scala.inline
  def apply(metalines: js.Array[Schema$ResultDisplayLine] = null, objectTypeLabel: String = null): Schema$ResultDisplayMetadata = {
    val __obj = js.Dynamic.literal()
    if (metalines != null) __obj.updateDynamic("metalines")(metalines.asInstanceOf[js.Any])
    if (objectTypeLabel != null) __obj.updateDynamic("objectTypeLabel")(objectTypeLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResultDisplayMetadata]
  }
}

