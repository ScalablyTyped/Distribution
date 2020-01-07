package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for creating a Compute Engine Instance resource. Most fields are
  * identical to the corresponding Compute Engine resource.
  */
@js.native
trait Schema$VmParams extends js.Object {
  /**
    * Deprecated. Please use baseInstanceName instead.
    */
  var baseInstanceName: js.UndefOr[String] = js.native
  /**
    * Enables IP Forwarding, which allows this instance to receive packets
    * destined for a different IP address, and send packets with a different
    * source IP. See IP Forwarding for more information.
    */
  var canIpForward: js.UndefOr[Boolean] = js.native
  /**
    * An optional textual description of the instance.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A list of existing Persistent Disk resources to attach to each replica in
    * the pool. Each disk will be attached in read-only mode to every replica.
    */
  var disksToAttach: js.UndefOr[js.Array[Schema$ExistingDisk]] = js.native
  /**
    * A list of Disk resources to create and attach to each Replica in the
    * Pool. Currently, you can only define one disk and it must be a root
    * persistent disk. Note that Replica Pool will create a root persistent
    * disk for each replica.
    */
  var disksToCreate: js.UndefOr[js.Array[Schema$NewDisk]] = js.native
  /**
    * The machine type for this instance. The resource name (e.g.
    * n1-standard-1).
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The metadata key/value pairs assigned to this instance.
    */
  var metadata: js.UndefOr[Schema$Metadata] = js.native
  /**
    * A list of network interfaces for the instance. Currently only one
    * interface is supported by Google Compute Engine, ONE_TO_ONE_NAT.
    */
  var networkInterfaces: js.UndefOr[js.Array[Schema$NetworkInterface]] = js.native
  var onHostMaintenance: js.UndefOr[String] = js.native
  /**
    * A list of Service Accounts to enable for this instance.
    */
  var serviceAccounts: js.UndefOr[js.Array[Schema$ServiceAccount]] = js.native
  /**
    * A list of tags to apply to the Google Compute Engine instance to identify
    * resources.
    */
  var tags: js.UndefOr[Schema$Tag] = js.native
}

object Schema$VmParams {
  @scala.inline
  def apply(
    baseInstanceName: String = null,
    canIpForward: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    disksToAttach: js.Array[Schema$ExistingDisk] = null,
    disksToCreate: js.Array[Schema$NewDisk] = null,
    machineType: String = null,
    metadata: Schema$Metadata = null,
    networkInterfaces: js.Array[Schema$NetworkInterface] = null,
    onHostMaintenance: String = null,
    serviceAccounts: js.Array[Schema$ServiceAccount] = null,
    tags: Schema$Tag = null
  ): Schema$VmParams = {
    val __obj = js.Dynamic.literal()
    if (baseInstanceName != null) __obj.updateDynamic("baseInstanceName")(baseInstanceName.asInstanceOf[js.Any])
    if (!js.isUndefined(canIpForward)) __obj.updateDynamic("canIpForward")(canIpForward.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (disksToAttach != null) __obj.updateDynamic("disksToAttach")(disksToAttach.asInstanceOf[js.Any])
    if (disksToCreate != null) __obj.updateDynamic("disksToCreate")(disksToCreate.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (networkInterfaces != null) __obj.updateDynamic("networkInterfaces")(networkInterfaces.asInstanceOf[js.Any])
    if (onHostMaintenance != null) __obj.updateDynamic("onHostMaintenance")(onHostMaintenance.asInstanceOf[js.Any])
    if (serviceAccounts != null) __obj.updateDynamic("serviceAccounts")(serviceAccounts.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VmParams]
  }
}

