package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SourceInstanceProperties extends js.Object {
  /**
    * Enables instances created based on this machine image to send packets
    * with source IP addresses other than their own and receive packets with
    * destination IP addresses other than their own. If these instances will be
    * used as an IP gateway or it will be set as the next-hop in a Route
    * resource, specify true. If unsure, leave this set to false. See the
    * Enable IP forwarding documentation for more information.
    */
  var canIpForward: js.UndefOr[Boolean] = js.native
  /**
    * Whether the instance created from the machine image should be protected
    * against deletion.
    */
  var deletionProtection: js.UndefOr[Boolean] = js.native
  /**
    * An optional text description for the instances that are created from this
    * machine image.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * An array of disks that are associated with the instances that are created
    * from this machine image.
    */
  var disks: js.UndefOr[js.Array[Schema$SavedAttachedDisk]] = js.native
  /**
    * A list of guest accelerator cards&#39; type and count to use for
    * instances created from the machine image.
    */
  var guestAccelerators: js.UndefOr[js.Array[Schema$AcceleratorConfig]] = js.native
  /**
    * Labels to apply to instances that are created from this machine image.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The machine type to use for instances that are created from this machine
    * image.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The metadata key/value pairs to assign to instances that are created from
    * this machine image. These pairs can consist of custom metadata or
    * predefined keys. See Project and instance metadata for more information.
    */
  var metadata: js.UndefOr[Schema$Metadata] = js.native
  /**
    * Minimum cpu/platform to be used by this instance. The instance may be
    * scheduled on the specified or newer cpu/platform. Applicable values are
    * the friendly names of CPU platforms, such as minCpuPlatform: &quot;Intel
    * Haswell&quot; or minCpuPlatform: &quot;Intel Sandy Bridge&quot;. For more
    * information, read Specifying a Minimum CPU Platform.
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
  /**
    * An array of network access configurations for this interface.
    */
  var networkInterfaces: js.UndefOr[js.Array[Schema$NetworkInterface]] = js.native
  /**
    * Specifies the scheduling options for the instances that are created from
    * this machine image.
    */
  var scheduling: js.UndefOr[Schema$Scheduling] = js.native
  /**
    * A list of service accounts with specified scopes. Access tokens for these
    * service accounts are available to the instances that are created from
    * this machine image. Use metadata queries to obtain the access tokens for
    * these instances.
    */
  var serviceAccounts: js.UndefOr[js.Array[Schema$ServiceAccount]] = js.native
  /**
    * A list of tags to apply to the instances that are created from this
    * machine image. The tags identify valid sources or targets for network
    * firewalls. The setTags method can modify this list of tags. Each tag
    * within the list must comply with RFC1035.
    */
  var tags: js.UndefOr[Schema$Tags] = js.native
}

object Schema$SourceInstanceProperties {
  @scala.inline
  def apply(
    canIpForward: js.UndefOr[Boolean] = js.undefined,
    deletionProtection: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    disks: js.Array[Schema$SavedAttachedDisk] = null,
    guestAccelerators: js.Array[Schema$AcceleratorConfig] = null,
    labels: StringDictionary[String] = null,
    machineType: String = null,
    metadata: Schema$Metadata = null,
    minCpuPlatform: String = null,
    networkInterfaces: js.Array[Schema$NetworkInterface] = null,
    scheduling: Schema$Scheduling = null,
    serviceAccounts: js.Array[Schema$ServiceAccount] = null,
    tags: Schema$Tags = null
  ): Schema$SourceInstanceProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canIpForward)) __obj.updateDynamic("canIpForward")(canIpForward.asInstanceOf[js.Any])
    if (!js.isUndefined(deletionProtection)) __obj.updateDynamic("deletionProtection")(deletionProtection.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (guestAccelerators != null) __obj.updateDynamic("guestAccelerators")(guestAccelerators.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (minCpuPlatform != null) __obj.updateDynamic("minCpuPlatform")(minCpuPlatform.asInstanceOf[js.Any])
    if (networkInterfaces != null) __obj.updateDynamic("networkInterfaces")(networkInterfaces.asInstanceOf[js.Any])
    if (scheduling != null) __obj.updateDynamic("scheduling")(scheduling.asInstanceOf[js.Any])
    if (serviceAccounts != null) __obj.updateDynamic("serviceAccounts")(serviceAccounts.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceInstanceProperties]
  }
}

