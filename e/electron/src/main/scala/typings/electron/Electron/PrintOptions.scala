package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintOptions extends js.Object {
  /**
    * Set the printer device name to use. Default is ''.
    */
  var deviceName: js.UndefOr[String] = js.undefined
  /**
    * Also prints the background color and image of the web page. Default is false.
    */
  var printBackground: js.UndefOr[Boolean] = js.undefined
  /**
    * Don't ask user for print settings. Default is false.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
}

object PrintOptions {
  @scala.inline
  def apply(
    deviceName: String = null,
    printBackground: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined
  ): PrintOptions = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    if (!js.isUndefined(printBackground)) __obj.updateDynamic("printBackground")(printBackground)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[PrintOptions]
  }
}

