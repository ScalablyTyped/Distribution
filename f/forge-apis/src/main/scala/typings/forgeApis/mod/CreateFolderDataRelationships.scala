package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolderDataRelationships extends StObject {
  
  var parent: CreateFolderDataRelationshipsParent
}
object CreateFolderDataRelationships {
  
  inline def apply(parent: CreateFolderDataRelationshipsParent): CreateFolderDataRelationships = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderDataRelationships]
  }
  
  extension [Self <: CreateFolderDataRelationships](x: Self) {
    
    inline def setParent(value: CreateFolderDataRelationshipsParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
