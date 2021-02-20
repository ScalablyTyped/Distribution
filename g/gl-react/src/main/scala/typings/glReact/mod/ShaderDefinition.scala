package typings.glReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderDefinition extends StObject {
  
  var frag: String = js.native
  
  var vert: js.UndefOr[String] = js.native
}
object ShaderDefinition {
  
  @scala.inline
  def apply(frag: String): ShaderDefinition = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDefinition]
  }
  
  @scala.inline
  implicit class ShaderDefinitionMutableBuilder[Self <: ShaderDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: String): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVert(value: String): Self = StObject.set(x, "vert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertUndefined: Self = StObject.set(x, "vert", js.undefined)
  }
}
