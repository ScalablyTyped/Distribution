package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Artifact describes a build product.
  */
@js.native
trait Schema$Artifact extends js.Object {
  /**
    * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
    * container.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * Artifact ID, if any; for container images, this will be a URL by digest
    * like `gcr.io/projectID/imagename@sha256:123456`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Related artifact names. This may be the path to a binary or jar file, or
    * in the case of a container build, the name used to push the container
    * image to Google Container Registry, as presented to `docker push`. Note
    * that a single Artifact ID can have multiple names, for example if two
    * tags are applied to one image.
    */
  var names: js.UndefOr[js.Array[String]] = js.native
}

object Schema$Artifact {
  @scala.inline
  def apply(checksum: String = null, id: String = null, names: js.Array[String] = null): Schema$Artifact = {
    val __obj = js.Dynamic.literal()
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Artifact]
  }
}

