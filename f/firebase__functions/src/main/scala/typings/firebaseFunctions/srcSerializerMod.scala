package typings.firebaseFunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSerializerMod {
  
  @JSImport("@firebase/functions/dist/src/serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(json: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(json.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def encode(data: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
}
