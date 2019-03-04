package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionsResource extends js.Object {
  var instances: InstancesResource
  /** Deploys code and resource files to a new version. */
  def create(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes an existing Version resource. */
  def delete(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrint
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource. */
  def get(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[Version]
  /** Lists the versions of a service. */
  def list(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPageSizePageToken
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListVersionsResponse]
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
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserServicesId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object VersionsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    delete: js.Function1[
      gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUser, 
      gapiDotClientLib.gapiNs.clientNs.Request[Version]
    ],
    instances: InstancesResource,
    list: js.Function1[
      gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPageSizePageToken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListVersionsResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserServicesId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): VersionsResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, instances = instances, list = list, patch = patch)
  
    __obj.asInstanceOf[VersionsResource]
  }
}

