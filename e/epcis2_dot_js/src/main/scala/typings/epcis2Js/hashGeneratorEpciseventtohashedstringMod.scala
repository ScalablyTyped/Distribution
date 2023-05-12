package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashGeneratorEpciseventtohashedstringMod {
  
  @JSImport("epcis2.js/hash_generator/EPCISEventToHashedString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventToHashedId(event: js.Object, context: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("eventToHashedId")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def eventToHashedId(event: js.Object, context: js.Object, throwError: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("eventToHashedId")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], throwError.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def preHashedStringToHashedString(preHash: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("preHashedStringToHashedString")(preHash.asInstanceOf[js.Any]).asInstanceOf[String]
}
