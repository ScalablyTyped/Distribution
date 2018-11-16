package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/master/lib/firmata.js#L429-L451

trait Options extends js.Object {
  var analogPins: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var pins: js.UndefOr[js.Array[Pins]] = js.undefined
  var reportVersionTimeout: js.UndefOr[scala.Double] = js.undefined
  var samplingInterval: js.UndefOr[scala.Double] = js.undefined
  var serialport: js.UndefOr[Options] = js.undefined
  var skipCapabilities: js.UndefOr[scala.Boolean] = js.undefined
}

