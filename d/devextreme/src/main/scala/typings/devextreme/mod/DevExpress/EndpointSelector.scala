package typings.devextreme.mod.DevExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointSelector extends js.Object {
  /** Gets an endpoint with a specific key. */
  def urlFor(key: String): String
}

object EndpointSelector {
  @scala.inline
  def apply(urlFor: String => String): EndpointSelector = {
    val __obj = js.Dynamic.literal(urlFor = js.Any.fromFunction1(urlFor))
  
    __obj.asInstanceOf[EndpointSelector]
  }
}

