package typings
package atFirebaseAppDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Name extends js.Object {
  /**
       * For testing FirebaseApp instances:
       *  app() instanceof firebase.app.App
       *
       * DO NOT call this constuctor directly (use firebase.app() instead).
       */
  var App: ScalablyTyped.runtime.Instantiable0[atFirebaseAppDashTypesLib.appDashTypesMod.FirebaseApp] = js.native
  /**
       * Retrieve an instance of a FirebaseApp.
       *
       * Usage: firebase.app()
       *
       * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
       */
  def apply(): atFirebaseAppDashTypesLib.appDashTypesMod.FirebaseApp = js.native
  /**
       * Retrieve an instance of a FirebaseApp.
       *
       * Usage: firebase.app()
       *
       * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
       */
  def apply(name: java.lang.String): atFirebaseAppDashTypesLib.appDashTypesMod.FirebaseApp = js.native
}

