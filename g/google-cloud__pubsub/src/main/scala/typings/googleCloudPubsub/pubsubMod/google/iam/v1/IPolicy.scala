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
  def apply(bindings: js.Array[IBinding] = null, etag: Uint8Array = null, version: Int | Double = null): IPolicy = {
    val __obj = js.Dynamic.literal()
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPolicy]
  }
}

