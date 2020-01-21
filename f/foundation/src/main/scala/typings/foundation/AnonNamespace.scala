package typings.foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNamespace extends js.Object {
  var namespace: String
}

object AnonNamespace {
  @scala.inline
  def apply(namespace: String): AnonNamespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNamespace]
  }
}

