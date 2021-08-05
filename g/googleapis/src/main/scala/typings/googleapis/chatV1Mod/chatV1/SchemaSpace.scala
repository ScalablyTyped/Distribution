package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A room or DM in Hangouts Chat.
  */
trait SchemaSpace extends StObject {
  
  /**
    * Output only. The display name (only if the space is a room).
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Resource name of the space, in the form &quot;spaces/ *&quot;.  Example:
    * spaces/AAAAMpdlehYs
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The type of a space.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaSpace {
  
  inline def apply(): SchemaSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpace]
  }
  
  extension [Self <: SchemaSpace](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
