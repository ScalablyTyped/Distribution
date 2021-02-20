package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharIndex extends StObject {
  
  var charIndex: Double = js.native
  
  var lineIndex: Double = js.native
}
object CharIndex {
  
  @scala.inline
  def apply(charIndex: Double, lineIndex: Double): CharIndex = {
    val __obj = js.Dynamic.literal(charIndex = charIndex.asInstanceOf[js.Any], lineIndex = lineIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharIndex]
  }
  
  @scala.inline
  implicit class CharIndexMutableBuilder[Self <: CharIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharIndex(value: Double): Self = StObject.set(x, "charIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineIndex(value: Double): Self = StObject.set(x, "lineIndex", value.asInstanceOf[js.Any])
  }
}
