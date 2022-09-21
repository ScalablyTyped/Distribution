package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMandatoryServiceAnnouncement extends StObject {
  
  /**
    * Detailed, freeform text describing the announcement
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One line summary of the announcement
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaMandatoryServiceAnnouncement {
  
  inline def apply(): SchemaMandatoryServiceAnnouncement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMandatoryServiceAnnouncement]
  }
  
  extension [Self <: SchemaMandatoryServiceAnnouncement](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
