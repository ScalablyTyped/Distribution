package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarResourcesDollarPatientDollarGetDollareverything extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The response includes records prior to the end date. If no end date is
    * provided, all records subsequent to the start date are in scope.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * Name of the patient for which the information is required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The response includes records subsequent to the start date. If no start
    * date is provided, all records prior to the end date are in scope.
    */
  var start: js.UndefOr[String] = js.native
}

