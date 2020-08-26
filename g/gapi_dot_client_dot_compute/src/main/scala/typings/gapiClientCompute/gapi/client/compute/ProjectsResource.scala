package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.OauthtokenPrettyPrint
import typings.gapiClientCompute.anon.Orderby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  /** Disable this project as a shared VPC host project. */
  def disableXpnHost(request: AltFields): Request[Operation] = js.native
  /** Disable a serivce resource (a.k.a service project) associated with this host project. */
  def disableXpnResource(request: AltFields): Request[Operation] = js.native
  /** Enable this project as a shared VPC host project. */
  def enableXpnHost(request: AltFields): Request[Operation] = js.native
  /**
    * Enable service resource (a.k.a service project) for a host project, so that subnets in the host project can be used by instances in the service
    * project.
    */
  def enableXpnResource(request: AltFields): Request[Operation] = js.native
  /** Returns the specified Project resource. */
  def get(request: OauthtokenPrettyPrint): Request[Project] = js.native
  /** Get the shared VPC host project that this project links to. May be empty if no link exists. */
  def getXpnHost(request: OauthtokenPrettyPrint): Request[Project] = js.native
  /** Get service resources (a.k.a service project) associated with this host project. */
  def getXpnResources(request: Orderby): Request[ProjectsGetXpnResources] = js.native
  /** List all shared VPC host projects visible to the user in an organization. */
  def listXpnHosts(request: Orderby): Request[XpnHostList] = js.native
  /** Moves a persistent disk from one zone to another. */
  def moveDisk(request: AltFields): Request[Operation] = js.native
  /** Moves an instance and its attached persistent disks from one zone to another. */
  def moveInstance(request: AltFields): Request[Operation] = js.native
  /** Sets metadata common to all instances within the specified project using the data included in the request. */
  def setCommonInstanceMetadata(request: AltFields): Request[Operation] = js.native
  /**
    * Enables the usage export feature and sets the usage export bucket where reports are stored. If you provide an empty request body using this method, the
    * usage export feature will be disabled.
    */
  def setUsageExportBucket(request: AltFields): Request[Operation] = js.native
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
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisableXpnHost(value: AltFields => Request[Operation]): Self = this.set("disableXpnHost", js.Any.fromFunction1(value))
    @scala.inline
    def setDisableXpnResource(value: AltFields => Request[Operation]): Self = this.set("disableXpnResource", js.Any.fromFunction1(value))
    @scala.inline
    def setEnableXpnHost(value: AltFields => Request[Operation]): Self = this.set("enableXpnHost", js.Any.fromFunction1(value))
    @scala.inline
    def setEnableXpnResource(value: AltFields => Request[Operation]): Self = this.set("enableXpnResource", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: OauthtokenPrettyPrint => Request[Project]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetXpnHost(value: OauthtokenPrettyPrint => Request[Project]): Self = this.set("getXpnHost", js.Any.fromFunction1(value))
    @scala.inline
    def setGetXpnResources(value: Orderby => Request[ProjectsGetXpnResources]): Self = this.set("getXpnResources", js.Any.fromFunction1(value))
    @scala.inline
    def setListXpnHosts(value: Orderby => Request[XpnHostList]): Self = this.set("listXpnHosts", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveDisk(value: AltFields => Request[Operation]): Self = this.set("moveDisk", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveInstance(value: AltFields => Request[Operation]): Self = this.set("moveInstance", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCommonInstanceMetadata(value: AltFields => Request[Operation]): Self = this.set("setCommonInstanceMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUsageExportBucket(value: AltFields => Request[Operation]): Self = this.set("setUsageExportBucket", js.Any.fromFunction1(value))
  }
  
}

