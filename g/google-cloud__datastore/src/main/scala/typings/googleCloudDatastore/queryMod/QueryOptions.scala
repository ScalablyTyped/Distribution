package typings.googleCloudDatastore.queryMod

import typings.googleCloudDatastore.googleCloudDatastoreStrings.eventual
import typings.googleCloudDatastore.googleCloudDatastoreStrings.strong
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions extends js.Object {
  var consistency: js.UndefOr[strong | eventual] = js.native
  var maxApiCalls: js.UndefOr[Double] = js.native
}

object QueryOptions {
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
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
    def setConsistency(value: strong | eventual): Self = this.set("consistency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistency: Self = this.set("consistency", js.undefined)
    @scala.inline
    def setMaxApiCalls(value: Double): Self = this.set("maxApiCalls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxApiCalls: Self = this.set("maxApiCalls", js.undefined)
  }
  
}

