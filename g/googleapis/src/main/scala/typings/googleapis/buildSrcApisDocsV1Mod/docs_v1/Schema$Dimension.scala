package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A magnitude in a single direction in the specified units.
  */
@js.native
trait Schema$Dimension extends js.Object {
  /**
    * The magnitude.
    */
  var magnitude: js.UndefOr[Double] = js.native
  /**
    * The units for magnitude.
    */
  var unit: js.UndefOr[String] = js.native
}

object Schema$Dimension {
  @scala.inline
  def apply(magnitude: Int | Double = null, unit: String = null): Schema$Dimension = {
    val __obj = js.Dynamic.literal()
    if (magnitude != null) __obj.updateDynamic("magnitude")(magnitude.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Dimension]
  }
}

