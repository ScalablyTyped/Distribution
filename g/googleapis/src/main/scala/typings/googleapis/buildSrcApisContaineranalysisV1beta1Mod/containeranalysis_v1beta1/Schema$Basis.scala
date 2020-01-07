package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basis describes the base image portion (Note) of the DockerImage
  * relationship. Linked occurrences are derived from this or an equivalent
  * image via:   FROM &lt;Basis.resource_url&gt; Or an equivalent reference,
  * e.g. a tag of the resource_url.
  */
@js.native
trait Schema$Basis extends js.Object {
  /**
    * Required. Immutable. The fingerprint of the base image.
    */
  var fingerprint: js.UndefOr[Schema$Fingerprint] = js.native
  /**
    * Required. Immutable. The resource_url for the resource representing the
    * basis of associated occurrence images.
    */
  var resourceUrl: js.UndefOr[String] = js.native
}

object Schema$Basis {
  @scala.inline
  def apply(fingerprint: Schema$Fingerprint = null, resourceUrl: String = null): Schema$Basis = {
    val __obj = js.Dynamic.literal()
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (resourceUrl != null) __obj.updateDynamic("resourceUrl")(resourceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Basis]
  }
}

