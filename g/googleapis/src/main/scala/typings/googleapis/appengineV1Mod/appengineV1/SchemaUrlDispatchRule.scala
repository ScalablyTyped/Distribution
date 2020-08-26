package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rules to match an HTTP request and dispatch that request to a service.
  */
@js.native
trait SchemaUrlDispatchRule extends js.Object {
  /**
    * Domain name to match against. The wildcard &quot;*&quot; is supported if
    * specified before a period: &quot;*.&quot;.Defaults to matching all
    * domains: &quot;*&quot;.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Pathname within the host. Must start with a &quot;/&quot;. A single
    * &quot;*&quot; can be included at the end of the path.The sum of the
    * lengths of the domain and path may not exceed 100 characters.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Resource ID of a service in this application that should serve the
    * matched request. The service must already exist. Example: default.
    */
  var service: js.UndefOr[String] = js.native
}

object SchemaUrlDispatchRule {
  @scala.inline
  def apply(): SchemaUrlDispatchRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlDispatchRule]
  }
  @scala.inline
  implicit class SchemaUrlDispatchRuleOps[Self <: SchemaUrlDispatchRule] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

