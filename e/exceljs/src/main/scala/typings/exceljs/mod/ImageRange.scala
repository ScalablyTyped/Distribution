package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageRange extends StObject {
  
  var br: Anchor
  
  var tl: Anchor
}
object ImageRange {
  
  inline def apply(br: Anchor, tl: Anchor): ImageRange = {
    val __obj = js.Dynamic.literal(br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRange]
  }
  
  extension [Self <: ImageRange](x: Self) {
    
    inline def setBr(value: Anchor): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setTl(value: Anchor): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
  }
}
