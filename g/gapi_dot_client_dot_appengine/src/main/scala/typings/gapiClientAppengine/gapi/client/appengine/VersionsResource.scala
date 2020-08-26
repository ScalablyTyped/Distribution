package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAppengine.anon.PageToken
import typings.gapiClientAppengine.anon.Pp
import typings.gapiClientAppengine.anon.PrettyPrint
import typings.gapiClientAppengine.anon.QuotaUser
import typings.gapiClientAppengine.anon.ServicesId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionsResource extends js.Object {
  var instances: InstancesResource = js.native
  /** Deploys code and resource files to a new version. */
  def create(request: Pp): Request[Operation] = js.native
  /** Deletes an existing Version resource. */
  def delete(request: PrettyPrint): Request[Operation] = js.native
  /** Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource. */
  def get(request: QuotaUser): Request[Version] = js.native
  /** Lists the versions of a service. */
  def list(request: PageToken): Request[ListVersionsResponse] = js.native
  /**
    * Updates the specified Version resource. You can specify the following fields depending on the App Engine environment and type of scaling that the
    * version resource uses:
    * serving_status (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.serving_status):  For Version
    * resources that use basic scaling, manual scaling, or run in  the App Engine flexible environment.
    * instance_class (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.instance_class):  For Version
    * resources that run in the App Engine standard environment.
    * automatic_scaling.min_idle_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources
    * that use automatic scaling and run in the App  Engine standard environment.
    * automatic_scaling.max_idle_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources
    * that use automatic scaling and run in the App  Engine standard environment.
    * automatic_scaling.min_total_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources
    * that use automatic scaling and run in the App  Engine Flexible environment.
    * automatic_scaling.max_total_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources
    * that use automatic scaling and run in the App  Engine Flexible environment.
    * automatic_scaling.cool_down_period_sec
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources
    * that use automatic scaling and run in the App  Engine Flexible environment.
    * automatic_scaling.cpu_utilization.target_utilization
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources
    * that use automatic scaling and run in the App  Engine Flexible environment.
    */
  def patch(request: ServicesId): Request[Operation] = js.native
}

object VersionsResource {
  @scala.inline
  def apply(
    create: Pp => Request[Operation],
    delete: PrettyPrint => Request[Operation],
    get: QuotaUser => Request[Version],
    instances: InstancesResource,
    list: PageToken => Request[ListVersionsResponse],
    patch: ServicesId => Request[Operation]
  ): VersionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), instances = instances.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[VersionsResource]
  }
  @scala.inline
  implicit class VersionsResourceOps[Self <: VersionsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Pp => Request[Operation]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: PrettyPrint => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: QuotaUser => Request[Version]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInstances(value: InstancesResource): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: PageToken => Request[ListVersionsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: ServicesId => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
  }
  
}

