package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nickname extends StObject {
  
  var metadata: FieldMetadata
  
  var `type`: NicknameType
  
  var value: String
}
object Nickname {
  
  @scala.inline
  def apply(metadata: FieldMetadata, `type`: NicknameType, value: String): Nickname = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nickname]
  }
  
  @scala.inline
  implicit class NicknameMutableBuilder[Self <: Nickname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NicknameType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
