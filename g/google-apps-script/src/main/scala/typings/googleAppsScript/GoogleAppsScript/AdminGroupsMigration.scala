package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Collection.ArchiveCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminGroupsMigration extends StObject {
  
  var Archive: js.UndefOr[ArchiveCollection] = js.native
}
object AdminGroupsMigration {
  
  @scala.inline
  def apply(): AdminGroupsMigration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminGroupsMigration]
  }
  
  @scala.inline
  implicit class AdminGroupsMigrationMutableBuilder[Self <: AdminGroupsMigration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchive(value: ArchiveCollection): Self = StObject.set(x, "Archive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveUndefined: Self = StObject.set(x, "Archive", js.undefined)
  }
  
  object Collection {
    
    @js.native
    trait ArchiveCollection extends StObject {
      
      // Inserts a new mail into the archive of the Google group.
      def insert(groupId: String): typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Schema.Groups = js.native
      // Inserts a new mail into the archive of the Google group.
      def insert(groupId: String, mediaData: js.Any): typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Schema.Groups = js.native
    }
  }
  
  object Schema {
    
    @js.native
    trait Groups extends StObject {
      
      var kind: js.UndefOr[String] = js.native
      
      var responseCode: js.UndefOr[String] = js.native
    }
    object Groups {
      
      @scala.inline
      def apply(): typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Schema.Groups = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Schema.Groups]
      }
      
      @scala.inline
      implicit class GroupsMutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Schema.Groups] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setResponseCode(value: String): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
      }
    }
  }
}
