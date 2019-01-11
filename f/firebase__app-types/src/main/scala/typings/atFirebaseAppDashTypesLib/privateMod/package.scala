package typings
package atFirebaseAppDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object privateMod {
  type AppHook = js.Function2[
    /* event */ java.lang.String, 
    /* app */ atFirebaseAppDashTypesLib.atFirebaseAppDashTypesMod.FirebaseApp, 
    scala.Unit
  ]
  type FirebaseServiceFactory = js.Function3[
    /* app */ atFirebaseAppDashTypesLib.atFirebaseAppDashTypesMod.FirebaseApp, 
    /* extendApp */ js.UndefOr[
      js.Function1[/* props */ org.scalablytyped.runtime.StringDictionary[js.Any], scala.Unit]
    ], 
    /* instanceString */ js.UndefOr[java.lang.String], 
    FirebaseService
  ]
  type FirebaseServiceNamespace[T /* <: FirebaseService */] = js.Function1[
    /* app */ js.UndefOr[atFirebaseAppDashTypesLib.atFirebaseAppDashTypesMod.FirebaseApp], 
    T
  ]
}
