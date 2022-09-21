package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.FolderName
import typings.googleapis.anon.MatchMyInterests
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUsersettings extends StObject {
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User settings in sub-objects, each for different purposes.
    */
  var notesExport: js.UndefOr[FolderName | Null] = js.undefined
  
  var notification: js.UndefOr[MatchMyInterests | Null] = js.undefined
}
object SchemaUsersettings {
  
  inline def apply(): SchemaUsersettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsersettings]
  }
  
  extension [Self <: SchemaUsersettings](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNotesExport(value: FolderName): Self = StObject.set(x, "notesExport", value.asInstanceOf[js.Any])
    
    inline def setNotesExportNull: Self = StObject.set(x, "notesExport", null)
    
    inline def setNotesExportUndefined: Self = StObject.set(x, "notesExport", js.undefined)
    
    inline def setNotification(value: MatchMyInterests): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationNull: Self = StObject.set(x, "notification", null)
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
  }
}
