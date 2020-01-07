package typings.googleapis.buildSrcApisCloudfunctionsV1Mod.cloudfunctions_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes HttpsTrigger, could be used to connect web hooks to function.
  */
@js.native
trait Schema$HttpsTrigger extends js.Object {
  /**
    * Output only. The deployed url for the function.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$HttpsTrigger {
  @scala.inline
  def apply(url: String = null): Schema$HttpsTrigger = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HttpsTrigger]
  }
}

