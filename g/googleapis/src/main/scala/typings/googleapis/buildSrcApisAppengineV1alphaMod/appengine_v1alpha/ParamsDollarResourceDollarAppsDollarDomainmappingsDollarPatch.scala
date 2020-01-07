package typings.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarAppsDollarDomainmappingsDollarPatch extends StandardParameters {
  /**
    * Part of `name`. Name of the resource to update. Example:
    * apps/myapp/domainMappings/example.com.
    */
  var appsId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var domainMappingsId: js.UndefOr[String] = js.native
  /**
    * Whether a managed certificate should be provided by App Engine. If true,
    * a certificate ID must be manually set in the DomainMapping resource to
    * configure SSL for this domain. If false, a managed certificate will be
    * provisioned and a certificate ID will be automatically populated. Only
    * applicable if ssl_settings.certificate_id is specified in the update
    * mask.
    */
  var noManagedCertificate: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$DomainMapping] = js.native
  /**
    * Standard field mask for the set of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

