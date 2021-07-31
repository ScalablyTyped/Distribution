package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueId extends StObject {
  
  /** The user-defined unique identifier for a document or other DocumentDB object (database, collection, procedure...) */
  var id: String
}
object UniqueId {
  
  @scala.inline
  def apply(id: String): UniqueId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueId]
  }
  
  @scala.inline
  implicit class UniqueIdMutableBuilder[Self <: UniqueId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
