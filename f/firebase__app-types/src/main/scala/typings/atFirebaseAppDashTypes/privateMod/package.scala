package typings.atFirebaseAppDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object privateMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp

  type AppHook = js.Function2[/* event */ String, /* app */ FirebaseApp, Unit]
  type FirebaseServiceFactory = js.Function3[
    /* app */ FirebaseApp, 
    /* extendApp */ js.UndefOr[js.Function1[/* props */ StringDictionary[js.Any], Unit]], 
    /* instanceString */ js.UndefOr[String], 
    FirebaseService
  ]
  type FirebaseServiceNamespace[T /* <: FirebaseService */] = js.Function1[/* app */ js.UndefOr[FirebaseApp], T]
}
