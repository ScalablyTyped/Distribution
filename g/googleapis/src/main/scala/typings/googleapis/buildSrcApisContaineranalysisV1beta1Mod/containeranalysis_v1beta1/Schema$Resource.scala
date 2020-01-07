package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entity that can have metadata. For example, a Docker image.
  */
@js.native
trait Schema$Resource extends js.Object {
  /**
    * The hash of the resource content. For example, the Docker digest.
    */
  var contentHash: js.UndefOr[Schema$Hash] = js.native
  /**
    * The name of the resource. For example, the name of a Docker image -
    * &quot;Debian&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. The unique URI of the resource. For example,
    * `https://gcr.io/project/image@sha256:foo` for a Docker image.
    */
  var uri: js.UndefOr[String] = js.native
}

object Schema$Resource {
  @scala.inline
  def apply(contentHash: Schema$Hash = null, name: String = null, uri: String = null): Schema$Resource = {
    val __obj = js.Dynamic.literal()
    if (contentHash != null) __obj.updateDynamic("contentHash")(contentHash.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Resource]
  }
}

