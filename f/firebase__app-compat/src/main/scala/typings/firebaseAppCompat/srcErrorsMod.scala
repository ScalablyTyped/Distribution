package typings.firebaseAppCompat

import typings.firebaseAppCompat.anon.AppName
import typings.firebaseAppCompat.firebaseAppCompatStrings.`invalid-app-argument`
import typings.firebaseAppCompat.firebaseAppCompatStrings.`no-app`
import typings.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcErrorsMod {
  
  @JSImport("@firebase/app-compat/dist/src/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[AppError, ErrorParams] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAppCompat.firebaseAppCompatStrings.`no-app`
    - typings.firebaseAppCompat.firebaseAppCompatStrings.`invalid-app-argument`
  */
  trait AppError extends StObject
  object AppError {
    
    inline def INVALID_APP_ARGUMENT: `invalid-app-argument` = "invalid-app-argument".asInstanceOf[`invalid-app-argument`]
    
    inline def NO_APP: `no-app` = "no-app".asInstanceOf[`no-app`]
  }
  
  /* Inlined {[ key in @firebase/app-compat.@firebase/app-compat/dist/src/errors.AppError ]: {  appName :string}} */
  trait ErrorParams extends StObject {
    
    var `invalid-app-argument`: AppName
    
    var `no-app`: AppName
  }
  object ErrorParams {
    
    inline def apply(`invalid-app-argument`: AppName, `no-app`: AppName): ErrorParams = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("invalid-app-argument")(`invalid-app-argument`.asInstanceOf[js.Any])
      __obj.updateDynamic("no-app")(`no-app`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorParams]
    }
    
    extension [Self <: ErrorParams](x: Self) {
      
      inline def `setInvalid-app-argument`(value: AppName): Self = StObject.set(x, "invalid-app-argument", value.asInstanceOf[js.Any])
      
      inline def `setNo-app`(value: AppName): Self = StObject.set(x, "no-app", value.asInstanceOf[js.Any])
    }
  }
}
