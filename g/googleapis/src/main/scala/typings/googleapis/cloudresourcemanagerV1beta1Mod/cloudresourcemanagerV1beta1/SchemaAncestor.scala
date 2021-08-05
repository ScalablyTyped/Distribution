package typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifying information for a single ancestor of a project.
  */
trait SchemaAncestor extends StObject {
  
  /**
    * Resource id of the ancestor.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.undefined
}
object SchemaAncestor {
  
  inline def apply(): SchemaAncestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAncestor]
  }
  
  extension [Self <: SchemaAncestor](x: Self) {
    
    inline def setResourceId(value: SchemaResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
