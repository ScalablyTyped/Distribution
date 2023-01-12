package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.expoPrebuildConfigInts.`1`
import typings.expoPrebuildConfig.expoPrebuildConfigInts.`2`
import typings.expoPrebuildConfig.expoPrebuildConfigInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scales extends StObject {
  
  var scales: js.Array[`1` | `2` | `3`]
  
  var size: Double
}
object Scales {
  
  inline def apply(scales: js.Array[`1` | `2` | `3`], size: Double): Scales = {
    val __obj = js.Dynamic.literal(scales = scales.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scales]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scales] (val x: Self) extends AnyVal {
    
    inline def setScales(value: js.Array[`1` | `2` | `3`]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    
    inline def setScalesVarargs(value: (`1` | `2` | `3`)*): Self = StObject.set(x, "scales", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
