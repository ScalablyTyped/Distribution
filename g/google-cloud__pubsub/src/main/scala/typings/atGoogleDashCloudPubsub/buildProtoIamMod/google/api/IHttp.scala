package typings.atGoogleDashCloudPubsub.buildProtoIamMod.google.api

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
  def apply(rules: js.Array[IHttpRule] = null): IHttp = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHttp]
  }
}

