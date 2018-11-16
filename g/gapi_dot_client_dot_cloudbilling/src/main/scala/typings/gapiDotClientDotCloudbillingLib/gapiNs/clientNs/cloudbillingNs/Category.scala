package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Category extends js.Object {
  /**
               * The type of product the SKU refers to.
               * Example: "Compute", "Storage", "Network", "ApplicationServices" etc.
               */
  var resourceFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A group classification for related SKUs.
               * Example: "RAM", "GPU", "Prediction", "Ops", "GoogleEgress" etc.
               */
  var resourceGroup: js.UndefOr[java.lang.String] = js.undefined
  /** The display name of the service this SKU belongs to. */
  var serviceDisplayName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Represents how the SKU is consumed.
               * Example: "OnDemand", "Preemptible", "Commit1Mo", "Commit1Yr" etc.
               */
  var usageType: js.UndefOr[java.lang.String] = js.undefined
}

