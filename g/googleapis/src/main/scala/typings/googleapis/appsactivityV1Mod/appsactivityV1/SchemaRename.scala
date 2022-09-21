package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRename extends StObject {
  
  /**
    * The new title.
    */
  var newTitle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The old title.
    */
  var oldTitle: js.UndefOr[String | Null] = js.undefined
}
object SchemaRename {
  
  inline def apply(): SchemaRename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRename]
  }
  
  extension [Self <: SchemaRename](x: Self) {
    
    inline def setNewTitle(value: String): Self = StObject.set(x, "newTitle", value.asInstanceOf[js.Any])
    
    inline def setNewTitleNull: Self = StObject.set(x, "newTitle", null)
    
    inline def setNewTitleUndefined: Self = StObject.set(x, "newTitle", js.undefined)
    
    inline def setOldTitle(value: String): Self = StObject.set(x, "oldTitle", value.asInstanceOf[js.Any])
    
    inline def setOldTitleNull: Self = StObject.set(x, "oldTitle", null)
    
    inline def setOldTitleUndefined: Self = StObject.set(x, "oldTitle", js.undefined)
  }
}
