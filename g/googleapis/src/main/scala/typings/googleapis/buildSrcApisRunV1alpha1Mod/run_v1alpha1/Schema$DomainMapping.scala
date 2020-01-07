package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource to hold the state and status of a user&#39;s domain mapping.
  */
@js.native
trait Schema$DomainMapping extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * The kind of resource, in this case &quot;DomainMapping&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this BuildTemplate.
    */
  var metadata: js.UndefOr[Schema$ObjectMeta] = js.native
  /**
    * The spec for this DomainMapping.
    */
  var spec: js.UndefOr[Schema$DomainMappingSpec] = js.native
  /**
    * The current status of the DomainMapping.
    */
  var status: js.UndefOr[Schema$DomainMappingStatus] = js.native
}

object Schema$DomainMapping {
  @scala.inline
  def apply(
    apiVersion: String = null,
    kind: String = null,
    metadata: Schema$ObjectMeta = null,
    spec: Schema$DomainMappingSpec = null,
    status: Schema$DomainMappingStatus = null
  ): Schema$DomainMapping = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DomainMapping]
  }
}

