package typings.firebaseApp

import typings.firebaseApp.anon.AppName
import typings.firebaseApp.firebaseAppStrings.`app-deleted`
import typings.firebaseApp.firebaseAppStrings.`bad-app-name`
import typings.firebaseApp.firebaseAppStrings.`duplicate-app`
import typings.firebaseApp.firebaseAppStrings.`invalid-app-argument`
import typings.firebaseApp.firebaseAppStrings.`invalid-log-argument`
import typings.firebaseApp.firebaseAppStrings.`no-app`
import typings.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@firebase/app/dist/packages/app/src/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[AppError, ErrorParams] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseApp.firebaseAppStrings.`no-app`
    - typings.firebaseApp.firebaseAppStrings.`bad-app-name`
    - typings.firebaseApp.firebaseAppStrings.`duplicate-app`
    - typings.firebaseApp.firebaseAppStrings.`app-deleted`
    - typings.firebaseApp.firebaseAppStrings.`invalid-app-argument`
    - typings.firebaseApp.firebaseAppStrings.`invalid-log-argument`
  */
  trait AppError extends StObject
  object AppError {
    
    @scala.inline
    def APP_DELETED: `app-deleted` = "app-deleted".asInstanceOf[`app-deleted`]
    
    @scala.inline
    def BAD_APP_NAME: `bad-app-name` = "bad-app-name".asInstanceOf[`bad-app-name`]
    
    @scala.inline
    def DUPLICATE_APP: `duplicate-app` = "duplicate-app".asInstanceOf[`duplicate-app`]
    
    @scala.inline
    def INVALID_APP_ARGUMENT: `invalid-app-argument` = "invalid-app-argument".asInstanceOf[`invalid-app-argument`]
    
    @scala.inline
    def INVALID_LOG_ARGUMENT: `invalid-log-argument` = "invalid-log-argument".asInstanceOf[`invalid-log-argument`]
    
    @scala.inline
    def NO_APP: `no-app` = "no-app".asInstanceOf[`no-app`]
  }
  
  /* Inlined {[ key in @firebase/app.@firebase/app/dist/packages/app/src/errors.AppError ]: {  appName :string}} */
  @js.native
  trait ErrorParams extends StObject {
    
    var `app-deleted`: AppName = js.native
    
    var `bad-app-name`: AppName = js.native
    
    var `duplicate-app`: AppName = js.native
    
    var `invalid-app-argument`: AppName = js.native
    
    var `invalid-log-argument`: AppName = js.native
    
    var `no-app`: AppName = js.native
  }
  object ErrorParams {
    
    @scala.inline
    def apply(
      `app-deleted`: AppName,
      `bad-app-name`: AppName,
      `duplicate-app`: AppName,
      `invalid-app-argument`: AppName,
      `invalid-log-argument`: AppName,
      `no-app`: AppName
    ): ErrorParams = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("app-deleted")(`app-deleted`.asInstanceOf[js.Any])
      __obj.updateDynamic("bad-app-name")(`bad-app-name`.asInstanceOf[js.Any])
      __obj.updateDynamic("duplicate-app")(`duplicate-app`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-app-argument")(`invalid-app-argument`.asInstanceOf[js.Any])
      __obj.updateDynamic("invalid-log-argument")(`invalid-log-argument`.asInstanceOf[js.Any])
      __obj.updateDynamic("no-app")(`no-app`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorParams]
    }
    
    @scala.inline
    implicit class ErrorParamsMutableBuilder[Self <: ErrorParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setApp-deleted`(value: AppName): Self = StObject.set(x, "app-deleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBad-app-name`(value: AppName): Self = StObject.set(x, "bad-app-name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDuplicate-app`(value: AppName): Self = StObject.set(x, "duplicate-app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setInvalid-app-argument`(value: AppName): Self = StObject.set(x, "invalid-app-argument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setInvalid-log-argument`(value: AppName): Self = StObject.set(x, "invalid-log-argument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-app`(value: AppName): Self = StObject.set(x, "no-app", value.asInstanceOf[js.Any])
    }
  }
}
