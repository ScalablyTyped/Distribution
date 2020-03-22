package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object remoteLoggingMod {
  type LogData = java.lang.String | typings.expo.remoteLoggingMod.LogErrorData
  type TransportErrorListener = js.Function1[/* event */ typings.expo.AnonResponse, scala.Unit]
}
