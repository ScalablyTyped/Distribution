package typings.googleCloudPubsub.srcIamMod

import typings.googleCloudPubsub.iamMod.google.iam.v1.IBinding
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  etag ? :string | node.Buffer} & @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.Omit<@google-cloud/pubsub.@google-cloud/pubsub/build/proto/iam.google.iam.v1.IPolicy, 'etag'> */
trait Policy extends js.Object {
  var bindings: js.UndefOr[js.Array[IBinding]] = js.undefined
  var etag: js.UndefOr[String | Buffer] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object Policy {
  @scala.inline
  def apply(
    bindings: js.Array[IBinding] = null,
    etag: String | Buffer = null,
    version: js.UndefOr[Double] = js.undefined
  ): Policy = {
    val __obj = js.Dynamic.literal()
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
}

