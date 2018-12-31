package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkConfiguration extends js.Object {
  /** The emulation rule applying to the download traffic */
  var downRule: js.UndefOr[TrafficRule] = js.undefined
  /**
    * The unique opaque id for this network traffic configuration
    * @OutputOnly
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The emulation rule applying to the upload traffic */
  var upRule: js.UndefOr[TrafficRule] = js.undefined
}

