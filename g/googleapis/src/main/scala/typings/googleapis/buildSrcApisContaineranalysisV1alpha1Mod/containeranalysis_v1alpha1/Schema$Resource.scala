package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource is an entity that can have metadata. E.g., a Docker image.
  */
@js.native
trait Schema$Resource extends js.Object {
  /**
    * The hash of the resource content. E.g., the Docker digest.
    */
  var contentHash: js.UndefOr[Schema$Hash] = js.native
  /**
    * The name of the resource. E.g., the name of a Docker image -
    * &quot;Debian&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The unique URI of the resource. E.g.,
    * &quot;https://gcr.io/project/image@sha256:foo&quot; for a Docker image.
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

