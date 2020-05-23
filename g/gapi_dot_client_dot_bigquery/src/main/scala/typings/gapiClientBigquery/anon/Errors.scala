package typings.gapiClientBigquery.anon

import typings.gapiClientBigquery.gapi.client.bigquery.ErrorProto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  /** Error information for the row indicated by the index property. */
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  /** The index of the row that error applies to. */
  var index: js.UndefOr[Double] = js.undefined
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[ErrorProto] = null, index: js.UndefOr[Double] = js.undefined): Errors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

