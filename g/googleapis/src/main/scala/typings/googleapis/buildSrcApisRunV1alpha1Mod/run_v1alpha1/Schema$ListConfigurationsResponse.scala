package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListConfigurationsResponse is a list of Configuration resources.
  */
@js.native
trait Schema$ListConfigurationsResponse extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * List of Configurations.
    */
  var items: js.UndefOr[js.Array[Schema$Configuration]] = js.native
  /**
    * The kind of this resource, in this case &quot;ConfigurationList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this Configuration list.
    */
  var metadata: js.UndefOr[Schema$ListMeta] = js.native
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ListConfigurationsResponse {
  @scala.inline
  def apply(
    apiVersion: String = null,
    items: js.Array[Schema$Configuration] = null,
    kind: String = null,
    metadata: Schema$ListMeta = null,
    unreachable: js.Array[String] = null
  ): Schema$ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (unreachable != null) __obj.updateDynamic("unreachable")(unreachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListConfigurationsResponse]
  }
}

