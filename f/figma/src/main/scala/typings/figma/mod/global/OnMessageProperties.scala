package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnMessageProperties extends StObject {
  
  var origin: String
}
object OnMessageProperties {
  
  @scala.inline
  def apply(origin: String): OnMessageProperties = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMessageProperties]
  }
  
  @scala.inline
  implicit class OnMessagePropertiesMutableBuilder[Self <: OnMessageProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
