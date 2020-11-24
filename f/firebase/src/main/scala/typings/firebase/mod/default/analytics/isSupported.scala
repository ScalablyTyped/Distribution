package typings.firebase.mod.default.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "analytics.isSupported")
@js.native
object isSupported extends js.Object {
  
  /**
    * An async function that returns true if current browser context supports initialization of analytics module
    * (`firebase.analytics()`).
    *
    * Returns false otherwise.
    *
    *
    */
  def apply(): js.Promise[Boolean] = js.native
}
