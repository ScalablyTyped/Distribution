package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifying information for a single ancestor of a project.
  */
@js.native
trait SchemaAncestor extends StObject {
  
  /**
    * Resource id of the ancestor.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}
object SchemaAncestor {
  
  @scala.inline
  def apply(): SchemaAncestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAncestor]
  }
  
  @scala.inline
  implicit class SchemaAncestorMutableBuilder[Self <: SchemaAncestor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: SchemaResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
