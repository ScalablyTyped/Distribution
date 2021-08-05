package typings.exceljs.mod

import typings.exceljs.anon.Col
import typings.exceljs.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePosition extends StObject {
  
  var ext: Height
  
  var tl: Col
}
object ImagePosition {
  
  inline def apply(ext: Height, tl: Col): ImagePosition = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePosition]
  }
  
  extension [Self <: ImagePosition](x: Self) {
    
    inline def setExt(value: Height): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setTl(value: Col): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
  }
}
