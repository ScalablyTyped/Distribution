package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpace extends StObject {
  
  /**
    * The space's display name. For direct messages between humans, this field might be empty.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of the space. Format: spaces/{space\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether the space is a DM between a Chat app and a single human.
    */
  var singleUserBotDm: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Details about the space including description and rules.
    */
  var spaceDetails: js.UndefOr[SchemaSpaceDetails] = js.undefined
  
  /**
    * Output only. Whether messages are threaded in this space.
    */
  var threaded: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Deprecated: Use `singleUserBotDm` or `spaceType` (developer preview) instead. The type of a space.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSpace {
  
  inline def apply(): SchemaSpace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpace]
  }
  
  extension [Self <: SchemaSpace](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSingleUserBotDm(value: Boolean): Self = StObject.set(x, "singleUserBotDm", value.asInstanceOf[js.Any])
    
    inline def setSingleUserBotDmNull: Self = StObject.set(x, "singleUserBotDm", null)
    
    inline def setSingleUserBotDmUndefined: Self = StObject.set(x, "singleUserBotDm", js.undefined)
    
    inline def setSpaceDetails(value: SchemaSpaceDetails): Self = StObject.set(x, "spaceDetails", value.asInstanceOf[js.Any])
    
    inline def setSpaceDetailsUndefined: Self = StObject.set(x, "spaceDetails", js.undefined)
    
    inline def setThreaded(value: Boolean): Self = StObject.set(x, "threaded", value.asInstanceOf[js.Any])
    
    inline def setThreadedNull: Self = StObject.set(x, "threaded", null)
    
    inline def setThreadedUndefined: Self = StObject.set(x, "threaded", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
