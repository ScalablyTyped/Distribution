package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A path-matching rule for a URL. If matched, will use the specified
  * BackendService to handle the traffic arriving at this URL.
  */
@js.native
trait SchemaPathRule extends js.Object {
  /**
    * The list of path patterns to match. Each must start with / and the only
    * place a * is allowed is at the end following a /. The string fed to the
    * path matcher does not include any text after the first ? or #, and those
    * chars are not allowed here.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
  /**
    * The full or partial URL of the backend service resource to which traffic
    * is directed if this rule is matched. If routeAction is additionally
    * specified, advanced routing actions like URL Rewrites, etc. take effect
    * prior to sending the request to the backend. However, if service is
    * specified, routeAction cannot contain any weightedBackendService s.
    * Conversely, if routeAction specifies any  weightedBackendServices,
    * service must not be specified. Only one of urlRedirect, service or
    * routeAction.weightedBackendService must be set.
    */
  var service: js.UndefOr[String] = js.native
}

object SchemaPathRule {
  @scala.inline
  def apply(): SchemaPathRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathRule]
  }
  @scala.inline
  implicit class SchemaPathRuleOps[Self <: SchemaPathRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

