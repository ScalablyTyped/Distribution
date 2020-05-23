package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.OauthtokenPrettyPrint
import typings.gapiClientCompute.anon.Orderby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Disable this project as a shared VPC host project. */
  def disableXpnHost(request: AltFields): Request[Operation]
  /** Disable a serivce resource (a.k.a service project) associated with this host project. */
  def disableXpnResource(request: AltFields): Request[Operation]
  /** Enable this project as a shared VPC host project. */
  def enableXpnHost(request: AltFields): Request[Operation]
  /**
    * Enable service resource (a.k.a service project) for a host project, so that subnets in the host project can be used by instances in the service
    * project.
    */
  def enableXpnResource(request: AltFields): Request[Operation]
  /** Returns the specified Project resource. */
  def get(request: OauthtokenPrettyPrint): Request[Project]
  /** Get the shared VPC host project that this project links to. May be empty if no link exists. */
  def getXpnHost(request: OauthtokenPrettyPrint): Request[Project]
  /** Get service resources (a.k.a service project) associated with this host project. */
  def getXpnResources(request: Orderby): Request[ProjectsGetXpnResources]
  /** List all shared VPC host projects visible to the user in an organization. */
  def listXpnHosts(request: Orderby): Request[XpnHostList]
  /** Moves a persistent disk from one zone to another. */
  def moveDisk(request: AltFields): Request[Operation]
  /** Moves an instance and its attached persistent disks from one zone to another. */
  def moveInstance(request: AltFields): Request[Operation]
  /** Sets metadata common to all instances within the specified project using the data included in the request. */
  def setCommonInstanceMetadata(request: AltFields): Request[Operation]
  /**
    * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the
    * usage export feature will be disabled.
    */
  def setUsageExportBucket(request: AltFields): Request[Operation]
}

object ProjectsResource {
  @scala.inline
  def apply(
    disableXpnHost: AltFields => Request[Operation],
    disableXpnResource: AltFields => Request[Operation],
    enableXpnHost: AltFields => Request[Operation],
    enableXpnResource: AltFields => Request[Operation],
    get: OauthtokenPrettyPrint => Request[Project],
    getXpnHost: OauthtokenPrettyPrint => Request[Project],
    getXpnResources: Orderby => Request[ProjectsGetXpnResources],
    listXpnHosts: Orderby => Request[XpnHostList],
    moveDisk: AltFields => Request[Operation],
    moveInstance: AltFields => Request[Operation],
    setCommonInstanceMetadata: AltFields => Request[Operation],
    setUsageExportBucket: AltFields => Request[Operation]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(disableXpnHost = js.Any.fromFunction1(disableXpnHost), disableXpnResource = js.Any.fromFunction1(disableXpnResource), enableXpnHost = js.Any.fromFunction1(enableXpnHost), enableXpnResource = js.Any.fromFunction1(enableXpnResource), get = js.Any.fromFunction1(get), getXpnHost = js.Any.fromFunction1(getXpnHost), getXpnResources = js.Any.fromFunction1(getXpnResources), listXpnHosts = js.Any.fromFunction1(listXpnHosts), moveDisk = js.Any.fromFunction1(moveDisk), moveInstance = js.Any.fromFunction1(moveInstance), setCommonInstanceMetadata = js.Any.fromFunction1(setCommonInstanceMetadata), setUsageExportBucket = js.Any.fromFunction1(setUsageExportBucket))
    __obj.asInstanceOf[ProjectsResource]
  }
}

