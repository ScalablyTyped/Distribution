package typings.googleCloudPubsub.pubsubMod.google.iam.v1

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Policy. */
trait IPolicy extends js.Object {
  /** Policy bindings */
  var bindings: js.UndefOr[js.Array[IBinding] | Null] = js.undefined
  /** Policy etag */
  var etag: js.UndefOr[Uint8Array | Null] = js.undefined
  /** Policy version */
  var version: js.UndefOr[Double | Null] = js.undefined
}

object IPolicy {
  @scala.inline
  def apply(
    bindings: js.UndefOr[Null | js.Array[IBinding]] = js.undefined,
    etag: js.UndefOr[Null | Uint8Array] = js.undefined,
    version: js.UndefOr[Null | Double] = js.undefined
  ): IPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bindings)) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (!js.isUndefined(etag)) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPolicy]
  }
}

