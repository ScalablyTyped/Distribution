package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathMatcher extends js.Object {
  /**
    * The full or partial URL to the BackendService resource. This will be used if none of the pathRules defined by this PathMatcher is matched by the URL's
    * path portion. For example, the following are all valid URLs to a BackendService resource:
    * - https://www.googleapis.com/compute/v1/projects/project/global/backendServices/backendService
    * - compute/v1/projects/project/global/backendServices/backendService
    * - global/backendServices/backendService
    */
  var defaultService: js.UndefOr[String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  /** The name to which this PathMatcher is referred by the HostRule. */
  var name: js.UndefOr[String] = js.undefined
  /** The list of path rules. */
  var pathRules: js.UndefOr[js.Array[PathRule]] = js.undefined
}

object PathMatcher {
  @scala.inline
  def apply(
    defaultService: String = null,
    description: String = null,
    name: String = null,
    pathRules: js.Array[PathRule] = null
  ): PathMatcher = {
    val __obj = js.Dynamic.literal()
    if (defaultService != null) __obj.updateDynamic("defaultService")(defaultService)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pathRules != null) __obj.updateDynamic("pathRules")(pathRules)
    __obj.asInstanceOf[PathMatcher]
  }
}

