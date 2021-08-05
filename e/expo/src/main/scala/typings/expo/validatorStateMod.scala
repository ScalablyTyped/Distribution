package typings.expo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorStateMod {
  
  @JSImport("expo/build/environment/validatorState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setShouldThrowAnErrorOutsideOfExpo(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setShouldThrowAnErrorOutsideOfExpo")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def shouldThrowAnErrorOutsideOfExpo(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldThrowAnErrorOutsideOfExpo")().asInstanceOf[Boolean]
}
