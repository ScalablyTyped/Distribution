package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Saturation extends StObject {
  
  var saturation: js.UndefOr[Double] = js.undefined
}
object Saturation {
  
  @scala.inline
  def apply(): Saturation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Saturation]
  }
  
  @scala.inline
  implicit class SaturationMutableBuilder[Self <: Saturation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
  }
}
