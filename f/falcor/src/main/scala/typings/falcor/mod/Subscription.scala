package typings.falcor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("falcor", "Subscription")
@js.native
class Subscription () extends js.Object {
  
  /**
    * When this method is called on the Subscription, the Observable that created the Subscription will stop sending values to the callbacks passed when the Subscription was created.
    */
  def dispose(): Unit = js.native
}
