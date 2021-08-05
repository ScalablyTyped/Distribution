package typings.firebaseApp

import typings.firebaseApp.errorsMod.AppError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseAppStrings {
  
  @js.native
  sealed trait `app-deleted`
    extends StObject
       with AppError
  inline def `app-deleted`: `app-deleted` = "app-deleted".asInstanceOf[`app-deleted`]
  
  @js.native
  sealed trait `bad-app-name`
    extends StObject
       with AppError
  inline def `bad-app-name`: `bad-app-name` = "bad-app-name".asInstanceOf[`bad-app-name`]
  
  @js.native
  sealed trait `duplicate-app`
    extends StObject
       with AppError
  inline def `duplicate-app`: `duplicate-app` = "duplicate-app".asInstanceOf[`duplicate-app`]
  
  @js.native
  sealed trait `fire-js` extends StObject
  inline def `fire-js`: `fire-js` = "fire-js".asInstanceOf[`fire-js`]
  
  @js.native
  sealed trait `invalid-app-argument`
    extends StObject
       with AppError
  inline def `invalid-app-argument`: `invalid-app-argument` = "invalid-app-argument".asInstanceOf[`invalid-app-argument`]
  
  @js.native
  sealed trait `invalid-log-argument`
    extends StObject
       with AppError
  inline def `invalid-log-argument`: `invalid-log-argument` = "invalid-log-argument".asInstanceOf[`invalid-log-argument`]
  
  @js.native
  sealed trait `no-app`
    extends StObject
       with AppError
  inline def `no-app`: `no-app` = "no-app".asInstanceOf[`no-app`]
}
