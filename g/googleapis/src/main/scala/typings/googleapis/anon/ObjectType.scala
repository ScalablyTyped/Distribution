package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectType extends StObject {
  
  var content: js.UndefOr[String] = js.native
  
  var objectType: js.UndefOr[String] = js.native
  
  var originalContent: js.UndefOr[String] = js.native
}
object ObjectType {
  
  @scala.inline
  def apply(): ObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectType]
  }
  
  @scala.inline
  implicit class ObjectTypeMutableBuilder[Self <: ObjectType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    @scala.inline
    def setOriginalContent(value: String): Self = StObject.set(x, "originalContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalContentUndefined: Self = StObject.set(x, "originalContent", js.undefined)
  }
}
