package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadingOptions extends StObject {
  
  var encoding: js.UndefOr[EncodingType | "utf8" | "base64"] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[Double] = js.undefined
}
object ReadingOptions {
  
  inline def apply(): ReadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadingOptions]
  }
  
  extension [Self <: ReadingOptions](x: Self) {
    
    inline def setEncoding(value: EncodingType | "utf8" | "base64"): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
