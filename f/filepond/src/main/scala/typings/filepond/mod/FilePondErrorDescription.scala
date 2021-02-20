package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePondErrorDescription extends StObject {
  
  var body: String = js.native
  
  var code: Double = js.native
  
  var `type`: String = js.native
}
object FilePondErrorDescription {
  
  @scala.inline
  def apply(body: String, code: Double, `type`: String): FilePondErrorDescription = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondErrorDescription]
  }
  
  @scala.inline
  implicit class FilePondErrorDescriptionMutableBuilder[Self <: FilePondErrorDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
