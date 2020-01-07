package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProductDestination extends js.Object {
  /**
    * The name of the destination.
    */
  var destinationName: js.UndefOr[String] = js.native
  /**
    * Whether the destination is required, excluded or should be validated.
    */
  var intention: js.UndefOr[String] = js.native
}

object Schema$ProductDestination {
  @scala.inline
  def apply(destinationName: String = null, intention: String = null): Schema$ProductDestination = {
    val __obj = js.Dynamic.literal()
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (intention != null) __obj.updateDynamic("intention")(intention.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductDestination]
  }
}

