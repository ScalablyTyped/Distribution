package typings.googleapis.buildSrcApisCloudbillingV1Mod.cloudbilling_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the category hierarchy of a SKU.
  */
@js.native
trait Schema$Category extends js.Object {
  /**
    * The type of product the SKU refers to. Example: &quot;Compute&quot;,
    * &quot;Storage&quot;, &quot;Network&quot;, &quot;ApplicationServices&quot;
    * etc.
    */
  var resourceFamily: js.UndefOr[String] = js.native
  /**
    * A group classification for related SKUs. Example: &quot;RAM&quot;,
    * &quot;GPU&quot;, &quot;Prediction&quot;, &quot;Ops&quot;,
    * &quot;GoogleEgress&quot; etc.
    */
  var resourceGroup: js.UndefOr[String] = js.native
  /**
    * The display name of the service this SKU belongs to.
    */
  var serviceDisplayName: js.UndefOr[String] = js.native
  /**
    * Represents how the SKU is consumed. Example: &quot;OnDemand&quot;,
    * &quot;Preemptible&quot;, &quot;Commit1Mo&quot;, &quot;Commit1Yr&quot;
    * etc.
    */
  var usageType: js.UndefOr[String] = js.native
}

object Schema$Category {
  @scala.inline
  def apply(
    resourceFamily: String = null,
    resourceGroup: String = null,
    serviceDisplayName: String = null,
    usageType: String = null
  ): Schema$Category = {
    val __obj = js.Dynamic.literal()
    if (resourceFamily != null) __obj.updateDynamic("resourceFamily")(resourceFamily.asInstanceOf[js.Any])
    if (resourceGroup != null) __obj.updateDynamic("resourceGroup")(resourceGroup.asInstanceOf[js.Any])
    if (serviceDisplayName != null) __obj.updateDynamic("serviceDisplayName")(serviceDisplayName.asInstanceOf[js.Any])
    if (usageType != null) __obj.updateDynamic("usageType")(usageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Category]
  }
}

