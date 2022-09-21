package typings.firebaseAppCheckCompat

import typings.firebaseAppCheckCompat.firebaseAppCheckCompatStrings.`use-before-activation`
import typings.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@firebase/app-check-compat/dist/src/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[AppCheckError, ErrorParams] = js.native
  
  object AppCheckError {
    
    inline def USE_BEFORE_ACTIVATION: `use-before-activation` = "use-before-activation".asInstanceOf[`use-before-activation`]
  }
  type AppCheckError = `use-before-activation`
  
  @js.native
  trait ErrorParams extends StObject
}
