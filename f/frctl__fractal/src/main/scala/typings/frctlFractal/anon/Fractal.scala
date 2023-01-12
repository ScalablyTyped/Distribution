package typings.frctlFractal.anon

import typings.frctlFractal.mod.Fractal_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fractal extends StObject {
  
  var fractal: Fractal_
}
object Fractal {
  
  inline def apply(fractal: Fractal_): Fractal = {
    val __obj = js.Dynamic.literal(fractal = fractal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fractal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fractal] (val x: Self) extends AnyVal {
    
    inline def setFractal(value: Fractal_): Self = StObject.set(x, "fractal", value.asInstanceOf[js.Any])
  }
}
