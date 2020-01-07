package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error message per source response.
  */
@js.native
trait Schema$ErrorMessage extends js.Object {
  var errorMessage: js.UndefOr[String] = js.native
  var source: js.UndefOr[Schema$Source] = js.native
}

object Schema$ErrorMessage {
  @scala.inline
  def apply(errorMessage: String = null, source: Schema$Source = null): Schema$ErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ErrorMessage]
  }
}

