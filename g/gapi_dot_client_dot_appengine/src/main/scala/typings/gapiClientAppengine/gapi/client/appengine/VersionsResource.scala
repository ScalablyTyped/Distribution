package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAppengine.AnonPageToken
import typings.gapiClientAppengine.AnonPp
import typings.gapiClientAppengine.AnonPrettyPrint
import typings.gapiClientAppengine.AnonQuotaUser
import typings.gapiClientAppengine.AnonServicesId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionsResource extends js.Object {
  var instances: InstancesResource
  /** Deploys code and resource files to a new version. */
  def create(request: AnonPp): Request_[Operation]
  /** Deletes an existing Version resource. */
  def delete(request: AnonPrettyPrint): Request_[Operation]
  /** Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource. */
  def get(request: AnonQuotaUser): Request_[Version]
  /** Lists the versions of a service. */
  def list(request: AnonPageToken): Request_[ListVersionsResponse]
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
  def patch(request: AnonServicesId): Request_[Operation]
}

object VersionsResource {
  @scala.inline
  def apply(
    create: AnonPp => Request_[Operation],
    delete: AnonPrettyPrint => Request_[Operation],
    get: AnonQuotaUser => Request_[Version],
    instances: InstancesResource,
    list: AnonPageToken => Request_[ListVersionsResponse],
    patch: AnonServicesId => Request_[Operation]
  ): VersionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), instances = instances.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[VersionsResource]
  }
}

