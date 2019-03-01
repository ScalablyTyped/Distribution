package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPointChangesResource extends js.Object {
  /** Queries for user's data point changes for a particular data source. */
  def list(request: gapiDotClientDotFitnessLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ListDataPointChangesResponse]
}

object DataPointChangesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotFitnessLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListDataPointChangesResponse]
    ]
  ): DataPointChangesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[DataPointChangesResource]
  }
}

