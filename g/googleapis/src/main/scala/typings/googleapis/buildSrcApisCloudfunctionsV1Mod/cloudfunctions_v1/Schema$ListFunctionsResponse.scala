package typings.googleapis.buildSrcApisCloudfunctionsV1Mod.cloudfunctions_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListFunctions` method.
  */
@js.native
trait Schema$ListFunctionsResponse extends js.Object {
  /**
    * The functions that match the request.
    */
  var functions: js.UndefOr[js.Array[Schema$CloudFunction]] = js.native
  /**
    * If not empty, indicates that there may be more functions that match the
    * request; this value should be passed in a new
    * google.cloud.functions.v1.ListFunctionsRequest to get more functions.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListFunctionsResponse {
  @scala.inline
  def apply(functions: js.Array[Schema$CloudFunction] = null, nextPageToken: String = null): Schema$ListFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListFunctionsResponse]
  }
}

