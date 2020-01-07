package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListDomainMappingsResponse is a list of DomainMapping resources.
  */
@js.native
trait Schema$ListDomainMappingsResponse extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * List of DomainMappings.
    */
  var items: js.UndefOr[js.Array[Schema$DomainMapping]] = js.native
  /**
    * The kind of this resource, in this case &quot;DomainMappingList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this DomainMapping list.
    */
  var metadata: js.UndefOr[Schema$ListMeta] = js.native
}

object Schema$ListDomainMappingsResponse {
  @scala.inline
  def apply(
    apiVersion: String = null,
    items: js.Array[Schema$DomainMapping] = null,
    kind: String = null,
    metadata: Schema$ListMeta = null
  ): Schema$ListDomainMappingsResponse = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDomainMappingsResponse]
  }
}

