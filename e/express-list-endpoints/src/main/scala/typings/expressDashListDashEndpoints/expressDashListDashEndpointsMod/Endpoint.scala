package typings.expressDashListDashEndpoints.expressDashListDashEndpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  var methods: js.Array[String]
  var path: String
}

object Endpoint {
  @scala.inline
  def apply(methods: js.Array[String], path: String): Endpoint = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Endpoint]
  }
}

