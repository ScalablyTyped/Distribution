package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Project extends js.Object {
  /** Metadata key/value pairs available to all instances contained in this project. See Custom metadata for more information. */
  var commonInstanceMetadata: js.UndefOr[Metadata] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Default service account used by VMs running in this project. */
  var defaultServiceAccount: js.UndefOr[java.lang.String] = js.undefined
  /** An optional textual description of the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Restricted features enabled for use on this project. */
  var enabledFeatures: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * [Output Only] The unique identifier for the resource. This identifier is defined by the server. This is not the project ID, and is just a unique ID
               * used by Compute Engine to identify resources.
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#project for projects. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The project ID. For example: my-example-project. Use the project ID to make requests to Compute Engine. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Quotas assigned to this project. */
  var quotas: js.UndefOr[js.Array[Quota]] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are stored. */
  var usageExportLocation: js.UndefOr[UsageExportLocation] = js.undefined
  /** [Output Only] The role this project has in a shared VPC configuration. Currently only HOST projects are differentiated. */
  var xpnProjectStatus: js.UndefOr[java.lang.String] = js.undefined
}

