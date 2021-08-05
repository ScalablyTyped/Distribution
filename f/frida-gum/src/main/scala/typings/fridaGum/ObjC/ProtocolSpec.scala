package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtocolSpec extends StObject {
  
  var methods: js.UndefOr[StringDictionary[ProtocolMethodSpec]] = js.undefined
  
  /**
    * Name of the protocol.
    *
    * Omit this if you don’t care about the globally visible name and would like the runtime to auto-generate one
    * for you.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Protocols this protocol conforms to.
    */
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
}
object ProtocolSpec {
  
  inline def apply(): ProtocolSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtocolSpec]
  }
  
  extension [Self <: ProtocolSpec](x: Self) {
    
    inline def setMethods(value: StringDictionary[ProtocolMethodSpec]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
  }
}
