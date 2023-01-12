package typings.expoXcpretty.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxWarningLineLength extends StObject {
  
  /** Sets the max character length for a warning before cropping the preview. Useful for minified files that can be upwards of a thousand characters long. */
  var maxWarningLineLength: js.UndefOr[Double] = js.undefined
  
  var projectRoot: String
}
object MaxWarningLineLength {
  
  inline def apply(projectRoot: String): MaxWarningLineLength = {
    val __obj = js.Dynamic.literal(projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxWarningLineLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxWarningLineLength] (val x: Self) extends AnyVal {
    
    inline def setMaxWarningLineLength(value: Double): Self = StObject.set(x, "maxWarningLineLength", value.asInstanceOf[js.Any])
    
    inline def setMaxWarningLineLengthUndefined: Self = StObject.set(x, "maxWarningLineLength", js.undefined)
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
  }
}
