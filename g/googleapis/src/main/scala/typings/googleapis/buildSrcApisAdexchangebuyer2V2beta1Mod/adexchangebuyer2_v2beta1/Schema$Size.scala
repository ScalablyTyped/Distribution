package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message depicting the size of the creative. The units of width and height
  * depend on the type of the targeting.
  */
@js.native
trait Schema$Size extends js.Object {
  /**
    * The height of the creative.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The width of the creative
    */
  var width: js.UndefOr[Double] = js.native
}

object Schema$Size {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): Schema$Size = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Size]
  }
}

