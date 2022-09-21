package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommunalLabelTag extends StObject {
  
  /**
    * Gaia ID of the user who added the tag, if any. Not present for any tags automatically created by server-side processing.
    */
  var creatorUserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A string ID representing the label. Possible ID values are documented at go/chat-labels-howto:ids. Example: "^*t_p" for "Pinned".
    */
  var labelId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCommunalLabelTag {
  
  inline def apply(): SchemaCommunalLabelTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommunalLabelTag]
  }
  
  extension [Self <: SchemaCommunalLabelTag](x: Self) {
    
    inline def setCreatorUserId(value: String): Self = StObject.set(x, "creatorUserId", value.asInstanceOf[js.Any])
    
    inline def setCreatorUserIdNull: Self = StObject.set(x, "creatorUserId", null)
    
    inline def setCreatorUserIdUndefined: Self = StObject.set(x, "creatorUserId", js.undefined)
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdNull: Self = StObject.set(x, "labelId", null)
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
  }
}
