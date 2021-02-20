package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorString extends StObject {
  
  /**
    * Color to multiply the image pixels with
    * @default #000000
    */
  var color: String = js.native
}
object ColorString {
  
  @scala.inline
  def apply(color: String): ColorString = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorString]
  }
  
  @scala.inline
  implicit class ColorStringMutableBuilder[Self <: ColorString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
