package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonOauthtokenPrettyPrint
import typings.gapiClientCompute.AnonOrderby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Disable this project as a shared VPC host project. */
  def disableXpnHost(request: AnonAltFields): Request_[Operation]
  /** Disable a serivce resource (a.k.a service project) associated with this host project. */
  def disableXpnResource(request: AnonAltFields): Request_[Operation]
  /** Enable this project as a shared VPC host project. */
  def enableXpnHost(request: AnonAltFields): Request_[Operation]
  /**
    * Enable service resource (a.k.a service project) for a host project, so that subnets in the host project can be used by instances in the service
    * project.
    */
  def enableXpnResource(request: AnonAltFields): Request_[Operation]
  /** Returns the specified Project resource. */
  def get(request: AnonOauthtokenPrettyPrint): Request_[Project]
  /** Get the shared VPC host project that this project links to. May be empty if no link exists. */
  def getXpnHost(request: AnonOauthtokenPrettyPrint): Request_[Project]
  /** Get service resources (a.k.a service project) associated with this host project. */
  def getXpnResources(request: AnonOrderby): Request_[ProjectsGetXpnResources]
  /** List all shared VPC host projects visible to the user in an organization. */
  def listXpnHosts(request: AnonOrderby): Request_[XpnHostList]
  /** Moves a persistent disk from one zone to another. */
  def moveDisk(request: AnonAltFields): Request_[Operation]
  /** Moves an instance and its attached persistent disks from one zone to another. */
  def moveInstance(request: AnonAltFields): Request_[Operation]
  /** Sets metadata common to all instances within the specified project using the data included in the request. */
  def setCommonInstanceMetadata(request: AnonAltFields): Request_[Operation]
  /**
    * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the
    * usage export feature will be disabled.
    */
  def setUsageExportBucket(request: AnonAltFields): Request_[Operation]
}

object ProjectsResource {
  @scala.inline
  def apply(
    disableXpnHost: AnonAltFields => Request_[Operation],
    disableXpnResource: AnonAltFields => Request_[Operation],
    enableXpnHost: AnonAltFields => Request_[Operation],
    enableXpnResource: AnonAltFields => Request_[Operation],
    get: AnonOauthtokenPrettyPrint => Request_[Project],
    getXpnHost: AnonOauthtokenPrettyPrint => Request_[Project],
    getXpnResources: AnonOrderby => Request_[ProjectsGetXpnResources],
    listXpnHosts: AnonOrderby => Request_[XpnHostList],
    moveDisk: AnonAltFields => Request_[Operation],
    moveInstance: AnonAltFields => Request_[Operation],
    setCommonInstanceMetadata: AnonAltFields => Request_[Operation],
    setUsageExportBucket: AnonAltFields => Request_[Operation]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(disableXpnHost = js.Any.fromFunction1(disableXpnHost), disableXpnResource = js.Any.fromFunction1(disableXpnResource), enableXpnHost = js.Any.fromFunction1(enableXpnHost), enableXpnResource = js.Any.fromFunction1(enableXpnResource), get = js.Any.fromFunction1(get), getXpnHost = js.Any.fromFunction1(getXpnHost), getXpnResources = js.Any.fromFunction1(getXpnResources), listXpnHosts = js.Any.fromFunction1(listXpnHosts), moveDisk = js.Any.fromFunction1(moveDisk), moveInstance = js.Any.fromFunction1(moveInstance), setCommonInstanceMetadata = js.Any.fromFunction1(setCommonInstanceMetadata), setUsageExportBucket = js.Any.fromFunction1(setUsageExportBucket))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

