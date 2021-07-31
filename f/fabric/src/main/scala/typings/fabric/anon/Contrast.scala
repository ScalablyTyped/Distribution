package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contrast extends StObject {
  
  var contrast: js.UndefOr[Double] = js.undefined
}
object Contrast {
  
  @scala.inline
  def apply(): Contrast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contrast]
  }
  
  @scala.inline
  implicit class ContrastMutableBuilder[Self <: Contrast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
  }
}
