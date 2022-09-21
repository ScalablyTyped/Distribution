package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSerialPortOutput extends StObject {
  
  /**
    * [Output Only] The contents of the console output.
    */
  var contents: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#serialPortOutput for serial port output.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The position of the next byte of content, regardless of whether the content exists, following the output returned in the `contents` property. Use this value in the next request as the start parameter.
    */
  var next: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The starting byte position of the output that was returned. This should match the start parameter sent with the request. If the serial console output exceeds the size of the buffer (1 MB), older output is overwritten by newer content. The output start value will indicate the byte position of the output that was returned, which might be different than the `start` value that was specified in the request.
    */
  var start: js.UndefOr[String | Null] = js.undefined
}
object SchemaSerialPortOutput {
  
  inline def apply(): SchemaSerialPortOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSerialPortOutput]
  }
  
  extension [Self <: SchemaSerialPortOutput](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsNull: Self = StObject.set(x, "contents", null)
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
