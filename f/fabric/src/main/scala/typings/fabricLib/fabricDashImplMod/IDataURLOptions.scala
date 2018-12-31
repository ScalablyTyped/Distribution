package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////////
// Data Object Interfaces - These intrface are not specific part of fabric,
// They are just helpful for for defining function parameters
//////////////////////////////////////////////////////////////////////////////
trait IDataURLOptions extends js.Object {
  /**
  	 * The format of the output image. Either "jpeg" or "png"
  	 */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Cropping height. Introduced in v1.2.14
  	 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Cropping left offset. Introduced in v1.2.14
  	 */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Multiplier to scale by
  	 */
  var multiplier: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Quality level (0..1). Only used for jpeg
  	 */
  var quality: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Cropping top offset. Introduced in v1.2.14
  	 */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Cropping width. Introduced in v1.2.14
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

