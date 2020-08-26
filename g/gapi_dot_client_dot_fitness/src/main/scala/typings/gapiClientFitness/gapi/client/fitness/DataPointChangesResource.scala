package typings.gapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFitness.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPointChangesResource extends js.Object {
  /** Queries for user's data point changes for a particular data source. */
  def list(request: Alt): Request[ListDataPointChangesResponse] = js.native
}

object DataPointChangesResource {
  @scala.inline
  def apply(list: Alt => Request[ListDataPointChangesResponse]): DataPointChangesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DataPointChangesResource]
  }
  @scala.inline
  implicit class DataPointChangesResourceOps[Self <: DataPointChangesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setList(value: Alt => Request[ListDataPointChangesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

