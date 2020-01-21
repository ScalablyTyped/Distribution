package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirewallResource extends js.Object {
  var ingressRules: IngressRulesResource
}

object FirewallResource {
  @scala.inline
  def apply(ingressRules: IngressRulesResource): FirewallResource = {
    val __obj = js.Dynamic.literal(ingressRules = ingressRules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirewallResource]
  }
}

