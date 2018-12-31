package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotRestoreParams extends GenericParams {
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var repository: java.lang.String
  var snapshot: java.lang.String
  var waitForCompletion: js.UndefOr[scala.Boolean] = js.undefined
}

