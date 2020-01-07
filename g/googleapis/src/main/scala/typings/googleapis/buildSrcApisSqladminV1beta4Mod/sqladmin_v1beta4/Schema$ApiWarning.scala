package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Admin API warning message.
  */
@js.native
trait Schema$ApiWarning extends js.Object {
  /**
    * Code to uniquely identify the warning type.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The warning message.
    */
  var message: js.UndefOr[String] = js.native
}

object Schema$ApiWarning {
  @scala.inline
  def apply(code: String = null, message: String = null): Schema$ApiWarning = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApiWarning]
  }
}

