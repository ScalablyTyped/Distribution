package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendWorkerMessagesRequest extends js.Object {
  /** The location which contains the job */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** The WorkerMessages to send. */
  var workerMessages: js.UndefOr[js.Array[WorkerMessage]] = js.undefined
}

