package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InstanceProperties extends js.Object {
  /**
               * Enables instances created based on this template to send packets with source IP addresses other than their own and receive packets with destination IP
               * addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true.
               * If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
               */
  var canIpForward: js.UndefOr[scala.Boolean] = js.undefined
  /** An optional text description for the instances that are created from this instance template. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** An array of disks that are associated with the instances that are created from this template. */
  var disks: js.UndefOr[js.Array[AttachedDisk]] = js.undefined
  /** A list of guest accelerator cards' type and count to use for instances created from the instance template. */
  var guestAccelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.undefined
  /** Labels to apply to instances that are created from this template. */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The machine type to use for instances that are created from this template. */
  var machineType: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The metadata key/value pairs to assign to instances that are created from this template. These pairs can consist of custom metadata or predefined keys.
               * See Project and instance metadata for more information.
               */
  var metadata: js.UndefOr[Metadata] = js.undefined
  /**
               * Minimum cpu/platform to be used by this instance. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the
               * friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying
               * a Minimum CPU Platform.
               */
  var minCpuPlatform: js.UndefOr[java.lang.String] = js.undefined
  /** An array of network access configurations for this interface. */
  var networkInterfaces: js.UndefOr[js.Array[NetworkInterface]] = js.undefined
  /** Specifies the scheduling options for the instances that are created from this template. */
  var scheduling: js.UndefOr[Scheduling] = js.undefined
  /**
               * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from this
               * template. Use metadata queries to obtain the access tokens for these instances.
               */
  var serviceAccounts: js.UndefOr[js.Array[ServiceAccount]] = js.undefined
  /**
               * A list of tags to apply to the instances that are created from this template. The tags identify valid sources or targets for network firewalls. The
               * setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
               */
  var tags: js.UndefOr[Tags] = js.undefined
}

