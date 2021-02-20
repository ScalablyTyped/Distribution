package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredictionSubstring extends StObject {
  
  /** length of the entered term. */
  var length: Double = js.native
  
  /** location of the entered term. */
  var offset: Double = js.native
}
object PredictionSubstring {
  
  @scala.inline
  def apply(length: Double, offset: Double): PredictionSubstring = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictionSubstring]
  }
  
  @scala.inline
  implicit class PredictionSubstringMutableBuilder[Self <: PredictionSubstring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
