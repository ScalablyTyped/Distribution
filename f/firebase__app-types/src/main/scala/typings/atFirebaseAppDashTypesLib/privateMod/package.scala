package typings
package atFirebaseAppDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object privateMod {
  type AppHook = js.Function2[
    /* event */ java.lang.String, 
    /* app */ atFirebaseAppDashTypesLib.appDashTypesMod.FirebaseApp, 
    scala.Unit
  ]
  type FirebaseServiceFactory = js.Function3[
    /* app */ atFirebaseAppDashTypesLib.appDashTypesMod.FirebaseApp, 
    /* extendApp */ js.UndefOr[
      js.Function1[/* props */ org.scalablytyped.runtime.StringDictionary[js.Any], scala.Unit]
    ], 
    /* instanceString */ js.UndefOr[java.lang.String], 
    FirebaseService
  ]
  type FirebaseServiceNamespace[T /* <: FirebaseService */] = js.Function1[/* app */ js.UndefOr[atFirebaseAppDashTypesLib.appDashTypesMod.FirebaseApp], T]
}
