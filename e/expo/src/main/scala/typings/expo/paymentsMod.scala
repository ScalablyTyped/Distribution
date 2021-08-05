package typings.expo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentsMod {
  
  @JSImport("expo/build/Payments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo/build/Payments", JSImport.Default)
  @js.native
  val default: js.Any = js.native
  
  inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
}
