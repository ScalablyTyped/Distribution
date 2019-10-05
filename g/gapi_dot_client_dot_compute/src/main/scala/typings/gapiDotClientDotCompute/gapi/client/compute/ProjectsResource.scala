package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_AltFieldsFilterKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Disable this project as a shared VPC host project. */
  def disableXpnHost(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Disable a serivce resource (a.k.a service project) associated with this host project. */
  def disableXpnResource(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Enable this project as a shared VPC host project. */
  def enableXpnHost(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /**
    * Enable service resource (a.k.a service project) for a host project, so that subnets in the host project can be used by instances in the service
    * project.
    */
  def enableXpnResource(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Returns the specified Project resource. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp): Request[Project]
  /** Get the shared VPC host project that this project links to. May be empty if no link exists. */
  def getXpnHost(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp): Request[Project]
  /** Get service resources (a.k.a service project) associated with this host project. */
  def getXpnResources(request: Anon_AltFieldsFilterKey): Request[ProjectsGetXpnResources]
  /** List all shared VPC host projects visible to the user in an organization. */
  def listXpnHosts(request: Anon_AltFieldsFilterKey): Request[XpnHostList]
  /** Moves a persistent disk from one zone to another. */
  def moveDisk(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Moves an instance and its attached persistent disks from one zone to another. */
  def moveInstance(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Sets metadata common to all instances within the specified project using the data included in the request. */
  def setCommonInstanceMetadata(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /**
    * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the
    * usage export feature will be disabled.
    */
  def setUsageExportBucket(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
}

object ProjectsResource {
  @scala.inline
  def apply(
    disableXpnHost: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    disableXpnResource: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    enableXpnHost: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    enableXpnResource: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp => Request[Project],
    getXpnHost: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp => Request[Project],
    getXpnResources: Anon_AltFieldsFilterKey => Request[ProjectsGetXpnResources],
    listXpnHosts: Anon_AltFieldsFilterKey => Request[XpnHostList],
    moveDisk: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    moveInstance: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    setCommonInstanceMetadata: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    setUsageExportBucket: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(disableXpnHost = js.Any.fromFunction1(disableXpnHost), disableXpnResource = js.Any.fromFunction1(disableXpnResource), enableXpnHost = js.Any.fromFunction1(enableXpnHost), enableXpnResource = js.Any.fromFunction1(enableXpnResource), get = js.Any.fromFunction1(get), getXpnHost = js.Any.fromFunction1(getXpnHost), getXpnResources = js.Any.fromFunction1(getXpnResources), listXpnHosts = js.Any.fromFunction1(listXpnHosts), moveDisk = js.Any.fromFunction1(moveDisk), moveInstance = js.Any.fromFunction1(moveInstance), setCommonInstanceMetadata = js.Any.fromFunction1(setCommonInstanceMetadata), setUsageExportBucket = js.Any.fromFunction1(setUsageExportBucket))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

