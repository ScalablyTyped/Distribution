package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Disable this project as a shared VPC host project. */
  def disableXpnHost(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Disable a serivce resource (a.k.a service project) associated with this host project. */
  def disableXpnResource(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Enable this project as a shared VPC host project. */
  def enableXpnHost(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Enable service resource (a.k.a service project) for a host project, so that subnets in the host project can be used by instances in the service
    * project.
    */
  def enableXpnResource(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified Project resource. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Project]
  /** Get the shared VPC host project that this project links to. May be empty if no link exists. */
  def getXpnHost(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Project]
  /** Get service resources (a.k.a service project) associated with this host project. */
  def getXpnResources(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilterKey): gapiDotClientLib.gapiNs.clientNs.Request[ProjectsGetXpnResources]
  /** List all shared VPC host projects visible to the user in an organization. */
  def listXpnHosts(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilterKey): gapiDotClientLib.gapiNs.clientNs.Request[XpnHostList]
  /** Moves a persistent disk from one zone to another. */
  def moveDisk(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Moves an instance and its attached persistent disks from one zone to another. */
  def moveInstance(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets metadata common to all instances within the specified project using the data included in the request. */
  def setCommonInstanceMetadata(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the
    * usage export feature will be disabled.
    */
  def setUsageExportBucket(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object ProjectsResource {
  @scala.inline
  def apply(
    disableXpnHost: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    disableXpnResource: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    enableXpnHost: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    enableXpnResource: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    get: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp => gapiDotClientLib.gapiNs.clientNs.Request[Project],
    getXpnHost: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp => gapiDotClientLib.gapiNs.clientNs.Request[Project],
    getXpnResources: gapiDotClientDotComputeLib.Anon_AltFieldsFilterKey => gapiDotClientLib.gapiNs.clientNs.Request[ProjectsGetXpnResources],
    listXpnHosts: gapiDotClientDotComputeLib.Anon_AltFieldsFilterKey => gapiDotClientLib.gapiNs.clientNs.Request[XpnHostList],
    moveDisk: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    moveInstance: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    setCommonInstanceMetadata: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    setUsageExportBucket: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(disableXpnHost = js.Any.fromFunction1(disableXpnHost), disableXpnResource = js.Any.fromFunction1(disableXpnResource), enableXpnHost = js.Any.fromFunction1(enableXpnHost), enableXpnResource = js.Any.fromFunction1(enableXpnResource), get = js.Any.fromFunction1(get), getXpnHost = js.Any.fromFunction1(getXpnHost), getXpnResources = js.Any.fromFunction1(getXpnResources), listXpnHosts = js.Any.fromFunction1(listXpnHosts), moveDisk = js.Any.fromFunction1(moveDisk), moveInstance = js.Any.fromFunction1(moveInstance), setCommonInstanceMetadata = js.Any.fromFunction1(setCommonInstanceMetadata), setUsageExportBucket = js.Any.fromFunction1(setUsageExportBucket))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

