package typings.googleCloudDatastore.queryMod

import typings.googleCloudDatastore.googleCloudDatastoreStrings.eventual
import typings.googleCloudDatastore.googleCloudDatastoreStrings.strong
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var consistency: js.UndefOr[strong | eventual] = js.undefined
  var maxApiCalls: js.UndefOr[Double] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(consistency: strong | eventual = null, maxApiCalls: js.UndefOr[Double] = js.undefined): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (consistency != null) __obj.updateDynamic("consistency")(consistency.asInstanceOf[js.Any])
    if (!js.isUndefined(maxApiCalls)) __obj.updateDynamic("maxApiCalls")(maxApiCalls.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

