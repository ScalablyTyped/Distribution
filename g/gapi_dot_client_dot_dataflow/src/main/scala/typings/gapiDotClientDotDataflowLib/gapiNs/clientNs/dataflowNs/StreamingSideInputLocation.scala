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

object StreamingSideInputLocation {
  @scala.inline
  def apply(stateFamily: java.lang.String = null, tag: java.lang.String = null): StreamingSideInputLocation = {
    val __obj = js.Dynamic.literal()
    if (stateFamily != null) __obj.updateDynamic("stateFamily")(stateFamily)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[StreamingSideInputLocation]
  }
}

