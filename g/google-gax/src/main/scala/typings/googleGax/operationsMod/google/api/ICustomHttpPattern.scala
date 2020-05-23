package typings.googleGax.operationsMod.google.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CustomHttpPattern. */
trait ICustomHttpPattern extends js.Object {
  /** CustomHttpPattern kind */
  var kind: js.UndefOr[String | Null] = js.undefined
  /** CustomHttpPattern path */
  var path: js.UndefOr[String | Null] = js.undefined
}

object ICustomHttpPattern {
  @scala.inline
  def apply(kind: js.UndefOr[Null | String] = js.undefined, path: js.UndefOr[Null | String] = js.undefined): ICustomHttpPattern = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(kind)) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomHttpPattern]
  }
}

