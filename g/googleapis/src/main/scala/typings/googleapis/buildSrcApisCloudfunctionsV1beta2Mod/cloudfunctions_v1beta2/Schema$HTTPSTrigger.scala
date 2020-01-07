package typings.googleapis.buildSrcApisCloudfunctionsV1beta2Mod.cloudfunctions_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes HTTPSTrigger, could be used to connect web hooks to function.
  */
@js.native
trait Schema$HTTPSTrigger extends js.Object {
  /**
    * Output only. The deployed url for the function.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$HTTPSTrigger {
  @scala.inline
  def apply(url: String = null): Schema$HTTPSTrigger = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HTTPSTrigger]
  }
}

