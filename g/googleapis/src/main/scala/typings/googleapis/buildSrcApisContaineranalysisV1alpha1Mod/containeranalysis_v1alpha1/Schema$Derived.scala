package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Derived describes the derived image portion (Occurrence) of the DockerImage
  * relationship.  This image would be produced from a Dockerfile with FROM
  * &lt;DockerImage.Basis in attached Note&gt;.
  */
@js.native
trait Schema$Derived extends js.Object {
  /**
    * Output only. This contains the base image URL for the derived image
    * occurrence.
    */
  var baseResourceUrl: js.UndefOr[String] = js.native
  /**
    * Output only. The number of layers by which this image differs from the
    * associated image basis.
    */
  var distance: js.UndefOr[Double] = js.native
  /**
    * The fingerprint of the derived image.
    */
  var fingerprint: js.UndefOr[Schema$Fingerprint] = js.native
  /**
    * This contains layer-specific metadata, if populated it has length
    * &quot;distance&quot; and is ordered with [distance] being the layer
    * immediately following the base image and [1] being the final layer.
    */
  var layerInfo: js.UndefOr[js.Array[Schema$Layer]] = js.native
}

object Schema$Derived {
  @scala.inline
  def apply(
    baseResourceUrl: String = null,
    distance: Int | Double = null,
    fingerprint: Schema$Fingerprint = null,
    layerInfo: js.Array[Schema$Layer] = null
  ): Schema$Derived = {
    val __obj = js.Dynamic.literal()
    if (baseResourceUrl != null) __obj.updateDynamic("baseResourceUrl")(baseResourceUrl.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (layerInfo != null) __obj.updateDynamic("layerInfo")(layerInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Derived]
  }
}

