package typings.gapiDotClientDotFitness.gapiNs.clientNs.fitnessNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotFitness.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPointChangesResource extends js.Object {
  /** Queries for user's data point changes for a particular data source. */
  def list(request: Anon_Alt): Request[ListDataPointChangesResponse]
}

object DataPointChangesResource {
  @scala.inline
  def apply(list: Anon_Alt => Request[ListDataPointChangesResponse]): DataPointChangesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DataPointChangesResource]
  }
}

