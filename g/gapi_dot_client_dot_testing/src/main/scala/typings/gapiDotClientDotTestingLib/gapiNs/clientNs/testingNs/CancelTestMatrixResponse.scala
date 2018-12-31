package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelTestMatrixResponse extends js.Object {
  /**
    * The current rolled-up state of the test matrix.
    * If this state is already final, then the cancelation request will
    * have no effect.
    */
  var testState: js.UndefOr[java.lang.String] = js.undefined
}

