package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Collection.ArchiveCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminGroupsMigration extends StObject {
  
  var Archive: js.UndefOr[ArchiveCollection] = js.undefined
}
object AdminGroupsMigration {
  
  inline def apply(): AdminGroupsMigration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminGroupsMigration]
  }
  
  object Collection {
    
    @js.native
    trait ArchiveCollection extends StObject {
      
      // Inserts a new mail into the archive of the Google group.
      def insert(groupId: String): typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Schema.Groups = js.native
      // Inserts a new mail into the archive of the Google group.
      def insert(groupId: String, mediaData: Any): typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Schema.Groups = js.native
    }
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminGroupsMigration] (val x: Self) extends AnyVal {
    
    inline def setArchive(value: ArchiveCollection): Self = StObject.set(x, "Archive", value.asInstanceOf[js.Any])
    
    inline def setArchiveUndefined: Self = StObject.set(x, "Archive", js.undefined)
  }
  
  object Schema {
    
    trait Groups extends StObject {
      
      var kind: js.UndefOr[String] = js.undefined
      
      var responseCode: js.UndefOr[String] = js.undefined
    }
    object Groups {
      
      inline def apply(): typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Schema.Groups = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Schema.Groups]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Schema.Groups] (val x: Self) extends AnyVal {
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setResponseCode(value: String): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
        
        inline def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
      }
    }
  }
}
