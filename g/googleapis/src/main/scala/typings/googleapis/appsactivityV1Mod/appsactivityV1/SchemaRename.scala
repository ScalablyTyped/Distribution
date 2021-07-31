package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a renametype event.
  */
trait SchemaRename extends StObject {
  
  /**
    * The new title.
    */
  var newTitle: js.UndefOr[String] = js.undefined
  
  /**
    * The old title.
    */
  var oldTitle: js.UndefOr[String] = js.undefined
}
object SchemaRename {
  
  @scala.inline
  def apply(): SchemaRename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRename]
  }
  
  @scala.inline
  implicit class SchemaRenameMutableBuilder[Self <: SchemaRename] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewTitle(value: String): Self = StObject.set(x, "newTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTitleUndefined: Self = StObject.set(x, "newTitle", js.undefined)
    
    @scala.inline
    def setOldTitle(value: String): Self = StObject.set(x, "oldTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldTitleUndefined: Self = StObject.set(x, "oldTitle", js.undefined)
  }
}
