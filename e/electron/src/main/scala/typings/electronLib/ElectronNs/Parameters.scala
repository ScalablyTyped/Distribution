package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  /**
    * Set the device scale factor (if zero defaults to original device scale factor)
    * (default: 0).
    */
  var deviceScaleFactor: scala.Double
  /**
    * Scale of emulated view inside available space (not in fit to view mode)
    * (default: 1).
    */
  var scale: scala.Double
  /**
    * Specify the screen type to emulate (default: desktop):
    */
  var screenPosition: electronLib.electronLibStrings.desktop | electronLib.electronLibStrings.mobile
  /**
    * Set the emulated screen size (screenPosition == mobile).
    */
  var screenSize: Size
  /**
    * Position the view on the screen (screenPosition == mobile) (default: { x: 0, y:
    * 0 }).
    */
  var viewPosition: Point
  /**
    * Set the emulated view size (empty means no override)
    */
  var viewSize: Size
}

