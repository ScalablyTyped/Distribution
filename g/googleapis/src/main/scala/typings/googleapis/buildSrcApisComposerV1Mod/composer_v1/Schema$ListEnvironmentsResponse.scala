package typings.googleapis.buildSrcApisComposerV1Mod.composer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The environments in a project and location.
  */
@js.native
trait Schema$ListEnvironmentsResponse extends js.Object {
  /**
    * The list of environments returned by a ListEnvironmentsRequest.
    */
  var environments: js.UndefOr[js.Array[Schema$Environment]] = js.native
  /**
    * The page token used to query for the next page if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListEnvironmentsResponse {
  @scala.inline
  def apply(environments: js.Array[Schema$Environment] = null, nextPageToken: String = null): Schema$ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (environments != null) __obj.updateDynamic("environments")(environments.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListEnvironmentsResponse]
  }
}

