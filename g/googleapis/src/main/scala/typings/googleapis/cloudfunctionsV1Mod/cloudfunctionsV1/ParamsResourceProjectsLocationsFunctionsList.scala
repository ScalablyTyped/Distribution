package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsFunctionsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Maximum number of functions to return per call.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value returned by the last `ListFunctionsResponse`; indicates that
    * this is a continuation of a prior `ListFunctions` call, and that the
    * system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The project and location from which the function should be listed,
    * specified in the format `projects/x/locations/x` If you want to list
    * functions in all locations, use "-" in place of a location.
    */
  var parent: js.UndefOr[String] = js.native
}

