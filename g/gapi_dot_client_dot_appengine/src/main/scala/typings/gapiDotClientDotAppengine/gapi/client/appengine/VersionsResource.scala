package typings.gapiDotClientDotAppengine.gapi.client.appengine

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPageSizePageToken
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrint
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUser
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserServicesId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionsResource extends js.Object {
  var instances: InstancesResource
  /** Deploys code and resource files to a new version. */
  def create(request: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp): Request[Operation]
  /** Deletes an existing Version resource. */
  def delete(request: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrint): Request[Operation]
  /** Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource. */
  def get(request: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUser): Request[Version]
  /** Lists the versions of a service. */
  def list(request: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPageSizePageToken): Request[ListVersionsResponse]
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
  def patch(
    request: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserServicesId
  ): Request[Operation]
}

object VersionsResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp => Request[Operation],
    delete: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrint => Request[Operation],
    get: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUser => Request[Version],
    instances: InstancesResource,
    list: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPageSizePageToken => Request[ListVersionsResponse],
    patch: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserServicesId => Request[Operation]
  ): VersionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), instances = instances, list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[VersionsResource]
  }
}

