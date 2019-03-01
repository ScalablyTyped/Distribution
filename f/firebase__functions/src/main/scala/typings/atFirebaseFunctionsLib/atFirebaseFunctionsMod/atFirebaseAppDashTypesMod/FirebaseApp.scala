package typings
package atFirebaseFunctionsLib.atFirebaseFunctionsMod.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var functions: js.UndefOr[
    js.Function1[
      /* region */ js.UndefOr[java.lang.String], 
      atFirebaseFunctionsDashTypesLib.atFirebaseFunctionsDashTypesMod.FirebaseFunctions
    ]
  ] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(
    functions: js.Function1[
      /* region */ js.UndefOr[java.lang.String], 
      atFirebaseFunctionsDashTypesLib.atFirebaseFunctionsDashTypesMod.FirebaseFunctions
    ] = null
  ): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions)
    __obj.asInstanceOf[FirebaseApp]
  }
}

