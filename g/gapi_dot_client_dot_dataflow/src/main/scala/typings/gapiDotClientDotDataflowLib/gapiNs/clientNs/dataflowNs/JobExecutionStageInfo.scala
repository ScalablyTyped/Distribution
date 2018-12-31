package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecutionStageInfo extends js.Object {
  /**
    * The steps associated with the execution stage.
    * Note that stages may have several steps, and that a given step
    * might be run by more than one stage.
    */
  var stepName: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

