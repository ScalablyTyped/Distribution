package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Pins extends js.Object {
  var analogChannel: scala.Double
  var mode: PIN_MODE
  var report: REPORTING
  var state: PIN_STATE | PULLUP_STATE
  var supportedModes: js.Array[PIN_MODE]
  var value: PIN_STATE | scala.Double
}

