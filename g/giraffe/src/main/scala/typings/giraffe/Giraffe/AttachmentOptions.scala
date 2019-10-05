package typings.giraffe.Giraffe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentOptions extends js.Object {
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var suppressRender: js.UndefOr[Boolean] = js.undefined
}

object AttachmentOptions {
  @scala.inline
  def apply(
    forceRender: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    suppressRender: js.UndefOr[Boolean] = js.undefined
  ): AttachmentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(suppressRender)) __obj.updateDynamic("suppressRender")(suppressRender)
    __obj.asInstanceOf[AttachmentOptions]
  }
}

