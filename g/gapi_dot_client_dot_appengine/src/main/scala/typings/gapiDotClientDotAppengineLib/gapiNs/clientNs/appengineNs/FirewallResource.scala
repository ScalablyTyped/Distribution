package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirewallResource extends js.Object {
  var ingressRules: IngressRulesResource
}

object FirewallResource {
  @scala.inline
  def apply(ingressRules: IngressRulesResource): FirewallResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ingressRules")(ingressRules)
    __obj.asInstanceOf[FirewallResource]
  }
}

