package typings.fsExtra

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingFlag extends js.Object {
  var encoding: String
  var flag: js.UndefOr[String] = js.undefined
}

object AnonEncodingFlag {
  @scala.inline
  def apply(encoding: String, flag: String = null): AnonEncodingFlag = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingFlag]
  }
}

