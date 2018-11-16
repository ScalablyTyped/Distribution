package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PrintOptions extends js.Object {
  /**
       * Set the printer device name to use. Default is ''.
       */
  var deviceName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Also prints the background color and image of the web page. Default is false.
       */
  var printBackground: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Don't ask user for print settings. Default is false.
       */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

