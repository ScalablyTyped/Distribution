package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsistencyPolicy extends js.Object {
  var defaultConsistencyLevel: ConsistencyLevel
  var maxStalenessIntervalInSeconds: scala.Double
  var maxStalenessPrefix: scala.Double
}

