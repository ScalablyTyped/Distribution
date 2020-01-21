package typings.firebaseFirestore.specTestRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecConfig extends js.Object {
  /** The number of active clients for this test run. */
  var numClients: Double
  /** A boolean to enable / disable GC. */
  var useGarbageCollection: Boolean
}

object SpecConfig {
  @scala.inline
  def apply(numClients: Double, useGarbageCollection: Boolean): SpecConfig = {
    val __obj = js.Dynamic.literal(numClients = numClients.asInstanceOf[js.Any], useGarbageCollection = useGarbageCollection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpecConfig]
  }
}

