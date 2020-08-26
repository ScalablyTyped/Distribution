package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicensesResource extends js.Object {
  /** Returns the specified License resource. */
  def get(request: typings.gapiClientCompute.anon.License): Request[License] = js.native
}

object LicensesResource {
  @scala.inline
  def apply(get: typings.gapiClientCompute.anon.License => Request[License]): LicensesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[LicensesResource]
  }
  @scala.inline
  implicit class LicensesResourceOps[Self <: LicensesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: typings.gapiClientCompute.anon.License => Request[License]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

