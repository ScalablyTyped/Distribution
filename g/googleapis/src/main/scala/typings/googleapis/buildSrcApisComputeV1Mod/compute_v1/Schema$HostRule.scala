package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UrlMaps A host-matching rule for a URL. If matched, will use the named
  * PathMatcher to select the BackendService.
  */
@js.native
trait Schema$HostRule extends js.Object {
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The list of host patterns to match. They must be valid hostnames, except
    * * will match any string of ([a-z0-9-.]*). In that case, * must be the
    * first character and must be followed in the pattern by either - or ..
    */
  var hosts: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the PathMatcher to use to match the path portion of the URL
    * if the hostRule matches the URL&#39;s host portion.
    */
  var pathMatcher: js.UndefOr[String] = js.native
}

object Schema$HostRule {
  @scala.inline
  def apply(description: String = null, hosts: js.Array[String] = null, pathMatcher: String = null): Schema$HostRule = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (pathMatcher != null) __obj.updateDynamic("pathMatcher")(pathMatcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HostRule]
  }
}

