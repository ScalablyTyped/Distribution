package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFolderDataRelationships extends StObject {
  
  var parent: CreateFolderDataRelationshipsParent = js.native
}
object CreateFolderDataRelationships {
  
  @scala.inline
  def apply(parent: CreateFolderDataRelationshipsParent): CreateFolderDataRelationships = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderDataRelationships]
  }
  
  @scala.inline
  implicit class CreateFolderDataRelationshipsMutableBuilder[Self <: CreateFolderDataRelationships] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: CreateFolderDataRelationshipsParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
