package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathExtendedElement extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var typeName: js.UndefOr[String] = js.native
}
object PathExtendedElement {
  
  @scala.inline
  def apply(): PathExtendedElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathExtendedElement]
  }
  
  @scala.inline
  implicit class PathExtendedElementMutableBuilder[Self <: PathExtendedElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
