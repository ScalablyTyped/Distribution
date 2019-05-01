package typings
package endDashOfDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object endDashOfDashStreamMod {
  type Callback = js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  type Stream = nodeLib.NodeJSNs.ReadableStream | nodeLib.NodeJSNs.WritableStream
}
