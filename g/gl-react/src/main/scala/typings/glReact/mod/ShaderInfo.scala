package typings.glReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaderInfo extends StObject {
  
  var frag: String
  
  var vert: String
}
object ShaderInfo {
  
  @scala.inline
  def apply(frag: String, vert: String): ShaderInfo = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], vert = vert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderInfo]
  }
  
  @scala.inline
  implicit class ShaderInfoMutableBuilder[Self <: ShaderInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: String): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVert(value: String): Self = StObject.set(x, "vert", value.asInstanceOf[js.Any])
  }
}
