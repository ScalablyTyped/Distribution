package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlDispatchRule extends js.Object {
  /** Domain name to match against. The wildcard "&#42;" is supported if specified before a period: "&#42;.".Defaults to matching all domains: "&#42;". */
  var domain: js.UndefOr[String] = js.native
  /**
    * Pathname within the host. Must start with a "/". A single "&#42;" can be included at the end of the path.The sum of the lengths of the domain and path may
    * not exceed 100 characters.
    */
  var path: js.UndefOr[String] = js.native
  /** Resource ID of a service in this application that should serve the matched request. The service must already exist. Example: default. */
  var service: js.UndefOr[String] = js.native
}

object UrlDispatchRule {
  @scala.inline
  def apply(): UrlDispatchRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlDispatchRule]
  }
  @scala.inline
  implicit class UrlDispatchRuleOps[Self <: UrlDispatchRule] (val x: Self) extends AnyVal {
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

