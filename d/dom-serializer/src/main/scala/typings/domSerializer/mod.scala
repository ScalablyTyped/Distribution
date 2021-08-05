package typings.domSerializer

import typings.domSerializer.domSerializerStrings.foreign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dom-serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(nodes: js.Array[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(nodes: js.Array[js.Object], options: DomSerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(nodes: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(nodes: js.Object, options: DomSerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait DomSerializerOptions extends StObject {
    
    var decodeEntities: js.UndefOr[Boolean] = js.undefined
    
    var xmlMode: js.UndefOr[Boolean | foreign] = js.undefined
  }
  object DomSerializerOptions {
    
    inline def apply(): DomSerializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomSerializerOptions]
    }
    
    extension [Self <: DomSerializerOptions](x: Self) {
      
      inline def setDecodeEntities(value: Boolean): Self = StObject.set(x, "decodeEntities", value.asInstanceOf[js.Any])
      
      inline def setDecodeEntitiesUndefined: Self = StObject.set(x, "decodeEntities", js.undefined)
      
      inline def setXmlMode(value: Boolean | foreign): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
      
      inline def setXmlModeUndefined: Self = StObject.set(x, "xmlMode", js.undefined)
    }
  }
}
