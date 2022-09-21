package typings.expressRequestId

import typings.expressServeStaticCore.mod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler]
  inline def apply(options: Options): RequestHandler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @JSImport("express-request-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var attributeName: js.UndefOr[String] = js.undefined
    
    var clockseq: js.UndefOr[Double] = js.undefined
    
    var headerName: js.UndefOr[String] = js.undefined
    
    var msecs: js.UndefOr[js.Date] = js.undefined
    
    var node: js.UndefOr[js.Array[Double]] = js.undefined
    
    var nsecs: js.UndefOr[Double] = js.undefined
    
    var setHeader: js.UndefOr[Boolean] = js.undefined
    
    var uuidVersion: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
      
      inline def setClockseq(value: Double): Self = StObject.set(x, "clockseq", value.asInstanceOf[js.Any])
      
      inline def setClockseqUndefined: Self = StObject.set(x, "clockseq", js.undefined)
      
      inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
      
      inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
      
      inline def setMsecs(value: js.Date): Self = StObject.set(x, "msecs", value.asInstanceOf[js.Any])
      
      inline def setMsecsUndefined: Self = StObject.set(x, "msecs", js.undefined)
      
      inline def setNode(value: js.Array[Double]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setNodeVarargs(value: Double*): Self = StObject.set(x, "node", js.Array(value*))
      
      inline def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      inline def setNsecsUndefined: Self = StObject.set(x, "nsecs", js.undefined)
      
      inline def setSetHeader(value: Boolean): Self = StObject.set(x, "setHeader", value.asInstanceOf[js.Any])
      
      inline def setSetHeaderUndefined: Self = StObject.set(x, "setHeader", js.undefined)
      
      inline def setUuidVersion(value: String): Self = StObject.set(x, "uuidVersion", value.asInstanceOf[js.Any])
      
      inline def setUuidVersionUndefined: Self = StObject.set(x, "uuidVersion", js.undefined)
    }
  }
}
