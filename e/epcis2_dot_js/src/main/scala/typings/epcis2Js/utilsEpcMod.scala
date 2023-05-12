package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsEpcMod {
  
  @JSImport("epcis2.js/utils/epc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(epc: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(epc.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def default(epc: Any, customOptions: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(epc.asInstanceOf[js.Any], customOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
}
