package typings.gapiDotClientDotBigquery

import typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs.ErrorProto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  /** Error information for the row indicated by the index property. */
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  /** The index of the row that error applies to. */
  var index: js.UndefOr[Double] = js.undefined
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Array[ErrorProto] = null, index: Int | Double = null): Anon_Errors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Errors]
  }
}

