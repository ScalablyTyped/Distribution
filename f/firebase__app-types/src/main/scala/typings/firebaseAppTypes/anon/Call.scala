package typings.firebaseAppTypes.anon

import org.scalablytyped.runtime.Instantiable0
import typings.firebaseAppTypes.mod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  /**
    * Retrieve an instance of a FirebaseApp.
    *
    * Usage: firebase.app()
    *
    * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
    */
  def apply(): FirebaseApp = js.native
  def apply(name: String): FirebaseApp = js.native
  
  /**
    * For testing FirebaseApp instances:
    *  app() instanceof firebase.app.App
    *
    * DO NOT call this constuctor directly (use firebase.app() instead).
    */
  var App: Instantiable0[FirebaseApp] = js.native
}
