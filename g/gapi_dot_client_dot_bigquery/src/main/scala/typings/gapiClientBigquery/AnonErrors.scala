package typings.gapiClientBigquery

import typings.gapiClientBigquery.gapi.client.bigquery.ErrorProto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends js.Object {
  /** Error information for the row indicated by the index property. */
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  /** The index of the row that error applies to. */
  var index: js.UndefOr[Double] = js.undefined
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[ErrorProto] = null, index: Int | Double = null): AnonErrors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrors]
  }
}

