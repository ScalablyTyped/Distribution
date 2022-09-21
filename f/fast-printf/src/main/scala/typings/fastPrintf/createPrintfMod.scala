package typings.fastPrintf

import typings.fastPrintf.typesMod.PlaceholderToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createPrintfMod {
  
  @JSImport("fast-printf/dist/src/createPrintf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPrintf(): Printf = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrintf")().asInstanceOf[Printf]
  inline def createPrintf(configuration: Configuration): Printf = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrintf")(configuration.asInstanceOf[js.Any]).asInstanceOf[Printf]
  
  trait Configuration extends StObject {
    
    def formatUnboundExpression(subject: String, token: PlaceholderToken, boundValues: js.Array[Any]): String
    @JSName("formatUnboundExpression")
    var formatUnboundExpression_Original: FormatUnboundExpression
  }
  object Configuration {
    
    inline def apply(
      formatUnboundExpression: (/* subject */ String, /* token */ PlaceholderToken, /* boundValues */ js.Array[Any]) => String
    ): Configuration = {
      val __obj = js.Dynamic.literal(formatUnboundExpression = js.Any.fromFunction3(formatUnboundExpression))
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setFormatUnboundExpression(
        value: (/* subject */ String, /* token */ PlaceholderToken, /* boundValues */ js.Array[Any]) => String
      ): Self = StObject.set(x, "formatUnboundExpression", js.Any.fromFunction3(value))
    }
  }
  
  type FormatUnboundExpression = js.Function3[
    /* subject */ String, 
    /* token */ PlaceholderToken, 
    /* boundValues */ js.Array[Any], 
    String
  ]
  
  @js.native
  trait Printf extends StObject {
    
    def apply(subject: String, boundValues: Any*): String = js.native
  }
}
