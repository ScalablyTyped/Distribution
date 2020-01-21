package typings.googleCloudPubsub.pubsubMod.google.iam.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetPolicyOptions. */
trait IGetPolicyOptions extends js.Object {
  /** GetPolicyOptions requestedPolicyVersion */
  var requestedPolicyVersion: js.UndefOr[Double | Null] = js.undefined
}

object IGetPolicyOptions {
  @scala.inline
  def apply(requestedPolicyVersion: Int | Double = null): IGetPolicyOptions = {
    val __obj = js.Dynamic.literal()
    if (requestedPolicyVersion != null) __obj.updateDynamic("requestedPolicyVersion")(requestedPolicyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetPolicyOptions]
  }
}

