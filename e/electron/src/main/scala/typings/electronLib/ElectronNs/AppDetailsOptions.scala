package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppDetailsOptions extends js.Object {
  /**
    * Index of the icon in appIconPath. Ignored when appIconPath is not set. Default
    * is 0.
    */
  var appIconIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Window's .
    */
  var appIconPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Window's . It has to be set, otherwise the other options will have no effect.
    */
  var appId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Window's .
    */
  var relaunchCommand: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Window's .
    */
  var relaunchDisplayName: js.UndefOr[java.lang.String] = js.undefined
}

