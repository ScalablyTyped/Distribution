package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAltFieldsFilterKey
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrint
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Disable this project as a shared VPC host project. */
  def disableXpnHost(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Disable a serivce resource (a.k.a service project) associated with this host project. */
  def disableXpnResource(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Enable this project as a shared VPC host project. */
  def enableXpnHost(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /**
    * Enable service resource (a.k.a service project) for a host project, so that subnets in the host project can be used by instances in the service
    * project.
    */
  def enableXpnResource(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Returns the specified Project resource. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp): Request_[Project]
  /** Get the shared VPC host project that this project links to. May be empty if no link exists. */
  def getXpnHost(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp): Request_[Project]
  /** Get service resources (a.k.a service project) associated with this host project. */
  def getXpnResources(request: AnonAltFieldsFilterKey): Request_[ProjectsGetXpnResources]
  /** List all shared VPC host projects visible to the user in an organization. */
  def listXpnHosts(request: AnonAltFieldsFilterKey): Request_[XpnHostList]
  /** Moves a persistent disk from one zone to another. */
  def moveDisk(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Moves an instance and its attached persistent disks from one zone to another. */
  def moveInstance(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Sets metadata common to all instances within the specified project using the data included in the request. */
  def setCommonInstanceMetadata(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /**
    * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the
    * usage export feature will be disabled.
    */
  def setUsageExportBucket(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
}

object ProjectsResource {
  @scala.inline
  def apply(
    disableXpnHost: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    disableXpnResource: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    enableXpnHost: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    enableXpnResource: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    get: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp => Request_[Project],
    getXpnHost: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserUserIp => Request_[Project],
    getXpnResources: AnonAltFieldsFilterKey => Request_[ProjectsGetXpnResources],
    listXpnHosts: AnonAltFieldsFilterKey => Request_[XpnHostList],
    moveDisk: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    moveInstance: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    setCommonInstanceMetadata: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    setUsageExportBucket: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(disableXpnHost = js.Any.fromFunction1(disableXpnHost), disableXpnResource = js.Any.fromFunction1(disableXpnResource), enableXpnHost = js.Any.fromFunction1(enableXpnHost), enableXpnResource = js.Any.fromFunction1(enableXpnResource), get = js.Any.fromFunction1(get), getXpnHost = js.Any.fromFunction1(getXpnHost), getXpnResources = js.Any.fromFunction1(getXpnResources), listXpnHosts = js.Any.fromFunction1(listXpnHosts), moveDisk = js.Any.fromFunction1(moveDisk), moveInstance = js.Any.fromFunction1(moveInstance), setCommonInstanceMetadata = js.Any.fromFunction1(setCommonInstanceMetadata), setUsageExportBucket = js.Any.fromFunction1(setUsageExportBucket))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

