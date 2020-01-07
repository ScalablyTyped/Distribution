package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interval of time, with an absolute start and end.
  */
@js.native
trait Schema$TimeInterval extends js.Object {
  /**
    * The timestamp marking the end of the range (exclusive) for which data is
    * included.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The timestamp marking the start of the range (inclusive) for which data
    * is included.
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$TimeInterval {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): Schema$TimeInterval = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimeInterval]
  }
}

