package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opacity extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
}
object Opacity {
  
  @scala.inline
  def apply(): Opacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opacity]
  }
  
  @scala.inline
  implicit class OpacityMutableBuilder[Self <: Opacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
