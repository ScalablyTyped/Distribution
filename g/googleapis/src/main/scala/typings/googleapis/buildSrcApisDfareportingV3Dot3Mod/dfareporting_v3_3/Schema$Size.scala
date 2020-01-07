package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the dimensions of ads, placements, creatives, or creative
  * assets.
  */
@js.native
trait Schema$Size extends js.Object {
  /**
    * Height of this size. Acceptable values are 0 to 32767, inclusive.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * IAB standard size. This is a read-only, auto-generated field.
    */
  var iab: js.UndefOr[Boolean] = js.native
  /**
    * ID of this size. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#size&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Width of this size. Acceptable values are 0 to 32767, inclusive.
    */
  var width: js.UndefOr[Double] = js.native
}

object Schema$Size {
  @scala.inline
  def apply(
    height: Int | Double = null,
    iab: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    width: Int | Double = null
  ): Schema$Size = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(iab)) __obj.updateDynamic("iab")(iab.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Size]
  }
}

