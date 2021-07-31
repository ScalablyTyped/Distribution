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
  
  @scala.inline
  def apply(): linesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[linesOptions]
  }
  
  @scala.inline
  implicit class linesOptionsMutableBuilder[Self <: linesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSteps(value: Boolean): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}
