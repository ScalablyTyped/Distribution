package typings.firebaseAppCompat

import typings.firebaseAppCompat.srcErrorsMod.AppError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseAppCompatStrings {
  
  @js.native
  sealed trait `invalid-app-argument`
    extends StObject
       with AppError
       with typings.firebaseAppCompat.errorsMod.AppError
  inline def `invalid-app-argument`: `invalid-app-argument` = "invalid-app-argument".asInstanceOf[`invalid-app-argument`]
  
  @js.native
  sealed trait `no-app`
    extends StObject
       with AppError
       with typings.firebaseAppCompat.errorsMod.AppError
  inline def `no-app`: `no-app` = "no-app".asInstanceOf[`no-app`]
}
