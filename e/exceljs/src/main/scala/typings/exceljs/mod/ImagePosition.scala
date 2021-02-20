package typings.exceljs.mod

import typings.exceljs.anon.Col
import typings.exceljs.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePosition extends StObject {
  
  var ext: Height = js.native
  
  var tl: Col = js.native
}
object ImagePosition {
  
  @scala.inline
  def apply(ext: Height, tl: Col): ImagePosition = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePosition]
  }
  
  @scala.inline
  implicit class ImagePositionMutableBuilder[Self <: ImagePosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: Height): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTl(value: Col): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
  }
}
