package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A user in Hangouts Chat.
  */
trait SchemaUser extends StObject {
  
  /**
    * The user&#39;s display name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Resource name, in the format &quot;users/ *&quot;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * User type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaUser {
  
  inline def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  extension [Self <: SchemaUser](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
