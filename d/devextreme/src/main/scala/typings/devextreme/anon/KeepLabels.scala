package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeepLabels extends StObject {
  
  var height: js.UndefOr[Double] = js.native
  
  var keepLabels: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object KeepLabels {
  
  @scala.inline
  def apply(): KeepLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeepLabels]
  }
  
  @scala.inline
  implicit class KeepLabelsMutableBuilder[Self <: KeepLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setKeepLabels(value: Boolean): Self = StObject.set(x, "keepLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepLabelsUndefined: Self = StObject.set(x, "keepLabels", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
