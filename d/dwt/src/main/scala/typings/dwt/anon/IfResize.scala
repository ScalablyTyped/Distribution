package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfResize extends StObject {
  
  var ifResize: js.UndefOr[Boolean] = js.undefined
  
  var maxSize: js.UndefOr[Double] = js.undefined
  
  // Example: 26,
  var minSize: js.UndefOr[Double] = js.undefined
}
object IfResize {
  
  @scala.inline
  def apply(): IfResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfResize]
  }
  
  @scala.inline
  implicit class IfResizeMutableBuilder[Self <: IfResize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIfResize(value: Boolean): Self = StObject.set(x, "ifResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfResizeUndefined: Self = StObject.set(x, "ifResize", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
