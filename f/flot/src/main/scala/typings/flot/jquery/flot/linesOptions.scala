package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait linesOptions
  extends StObject
     with seriesTypeBase {
  
  var steps: js.UndefOr[Boolean] = js.undefined
}
object linesOptions {
  
  inline def apply(): linesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[linesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: linesOptions] (val x: Self) extends AnyVal {
    
    inline def setSteps(value: Boolean): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}
