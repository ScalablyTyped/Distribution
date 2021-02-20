package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageRange extends StObject {
  
  var br: Anchor = js.native
  
  var tl: Anchor = js.native
}
object ImageRange {
  
  @scala.inline
  def apply(br: Anchor, tl: Anchor): ImageRange = {
    val __obj = js.Dynamic.literal(br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRange]
  }
  
  @scala.inline
  implicit class ImageRangeMutableBuilder[Self <: ImageRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBr(value: Anchor): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTl(value: Anchor): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
  }
}
