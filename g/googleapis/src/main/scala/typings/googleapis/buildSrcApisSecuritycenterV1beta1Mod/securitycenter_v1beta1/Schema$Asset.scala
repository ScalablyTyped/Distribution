package typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Security Command Center&#39;s (Cloud SCC) representation of a Google
  * Cloud Platform (GCP) resource.  The Asset is a Cloud SCC resource that
  * captures information about a single GCP resource. All modifications to an
  * Asset are only within the context of Cloud SCC and don&#39;t affect the
  * referenced GCP resource.
  */
@js.native
trait Schema$Asset extends js.Object {
  /**
    * The time at which the asset was created in Cloud SCC.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The relative resource name of this asset. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: &quot;organizations/123/assets/456&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Resource managed properties. These properties are managed and defined by
    * the GCP resource and cannot be modified by the user.
    */
  var resourceProperties: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Cloud SCC managed properties. These properties are managed by Cloud SCC
    * and cannot be modified by the user.
    */
  var securityCenterProperties: js.UndefOr[Schema$SecurityCenterProperties] = js.native
  /**
    * User specified security marks. These marks are entirely managed by the
    * user and come from the SecurityMarks resource that belongs to the asset.
    */
  var securityMarks: js.UndefOr[Schema$SecurityMarks] = js.native
  /**
    * The time at which the asset was last updated, added, or deleted in Cloud
    * SCC.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object Schema$Asset {
  @scala.inline
  def apply(
    createTime: String = null,
    name: String = null,
    resourceProperties: StringDictionary[js.Any] = null,
    securityCenterProperties: Schema$SecurityCenterProperties = null,
    securityMarks: Schema$SecurityMarks = null,
    updateTime: String = null
  ): Schema$Asset = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceProperties != null) __obj.updateDynamic("resourceProperties")(resourceProperties.asInstanceOf[js.Any])
    if (securityCenterProperties != null) __obj.updateDynamic("securityCenterProperties")(securityCenterProperties.asInstanceOf[js.Any])
    if (securityMarks != null) __obj.updateDynamic("securityMarks")(securityMarks.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Asset]
  }
}

