package typings.gamequery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupOptions extends StObject {
  
  var height: js.UndefOr[Double] = js.native
  
  var overflow: js.UndefOr[String] = js.native
  
  var posx: js.UndefOr[Double] = js.native
  
  var posy: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object GroupOptions {
  
  @scala.inline
  def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  
  @scala.inline
  implicit class GroupOptionsMutableBuilder[Self <: GroupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setPosx(value: Double): Self = StObject.set(x, "posx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosxUndefined: Self = StObject.set(x, "posx", js.undefined)
    
    @scala.inline
    def setPosy(value: Double): Self = StObject.set(x, "posy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosyUndefined: Self = StObject.set(x, "posy", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
