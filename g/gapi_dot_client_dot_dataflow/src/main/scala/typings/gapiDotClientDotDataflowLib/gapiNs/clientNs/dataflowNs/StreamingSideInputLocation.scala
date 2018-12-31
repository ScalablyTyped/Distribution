package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingSideInputLocation extends js.Object {
  /** Identifies the state family where this side input is stored. */
  var stateFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies the particular side input within the streaming Dataflow job. */
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

