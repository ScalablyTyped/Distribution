package typings.elasticTransport

import typings.elasticTransport.elasticTransportStrings.constructor
import typings.elasticTransport.elasticTransportStrings.proto
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSerializerMod {
  
  @JSImport("@elastic/transport/lib/Serializer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Serializer {
    def this(opts: SerializerOptions) = this()
  }
  
  @js.native
  trait Serializer extends StObject {
    
    def deserialize[T](json: String): T = js.native
    
    def ndserialize(array: js.Array[(Record[String, Any]) | String]): String = js.native
    
    def qserialize(): String = js.native
    def qserialize(`object`: String): String = js.native
    def qserialize(`object`: Record[String, Any]): String = js.native
    
    def serialize(`object`: Record[String, Any]): String = js.native
  }
  
  trait SerializerOptions extends StObject {
    
    var enablePrototypePoisoningProtection: js.UndefOr[Boolean | proto | constructor] = js.undefined
  }
  object SerializerOptions {
    
    inline def apply(): SerializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializerOptions] (val x: Self) extends AnyVal {
      
      inline def setEnablePrototypePoisoningProtection(value: Boolean | proto | constructor): Self = StObject.set(x, "enablePrototypePoisoningProtection", value.asInstanceOf[js.Any])
      
      inline def setEnablePrototypePoisoningProtectionUndefined: Self = StObject.set(x, "enablePrototypePoisoningProtection", js.undefined)
    }
  }
}
