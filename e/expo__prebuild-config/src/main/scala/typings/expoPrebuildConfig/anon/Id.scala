package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: String
  
  var placeholderIdentifier: js.UndefOr[String] = js.undefined
  
  var sceneMemberID: String
  
  var userLabel: String
}
object Id {
  
  inline def apply(id: String, sceneMemberID: String, userLabel: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sceneMemberID = sceneMemberID.asInstanceOf[js.Any], userLabel = userLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderIdentifier(value: String): Self = StObject.set(x, "placeholderIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderIdentifierUndefined: Self = StObject.set(x, "placeholderIdentifier", js.undefined)
    
    inline def setSceneMemberID(value: String): Self = StObject.set(x, "sceneMemberID", value.asInstanceOf[js.Any])
    
    inline def setUserLabel(value: String): Self = StObject.set(x, "userLabel", value.asInstanceOf[js.Any])
  }
}
