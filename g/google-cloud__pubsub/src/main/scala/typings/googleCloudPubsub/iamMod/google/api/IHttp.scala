package typings.googleCloudPubsub.iamMod.google.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Http. */
trait IHttp extends js.Object {
  /** Http rules */
  var rules: js.UndefOr[js.Array[IHttpRule] | Null] = js.undefined
}

object IHttp {
  @scala.inline
  def apply(rules: js.UndefOr[Null | js.Array[IHttpRule]] = js.undefined): IHttp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rules)) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHttp]
  }
}

