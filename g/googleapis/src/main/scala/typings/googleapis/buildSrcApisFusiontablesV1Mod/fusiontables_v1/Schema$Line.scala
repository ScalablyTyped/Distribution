package typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a line geometry.
  */
@js.native
trait Schema$Line extends js.Object {
  /**
    * The coordinates that define the line.
    */
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  /**
    * Type: A line geometry.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Line {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[Double]] = null, `type`: String = null): Schema$Line = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Line]
  }
}

