package typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetAncestryResponse extends StObject {
  
  /**
    * Ancestors are ordered from bottom to top of the resource hierarchy. The first ancestor is the project itself, followed by the project's parent, etc.
    */
  var ancestor: js.UndefOr[js.Array[SchemaAncestor]] = js.undefined
}
object SchemaGetAncestryResponse {
  
  inline def apply(): SchemaGetAncestryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetAncestryResponse]
  }
  
  extension [Self <: SchemaGetAncestryResponse](x: Self) {
    
    inline def setAncestor(value: js.Array[SchemaAncestor]): Self = StObject.set(x, "ancestor", value.asInstanceOf[js.Any])
    
    inline def setAncestorUndefined: Self = StObject.set(x, "ancestor", js.undefined)
    
    inline def setAncestorVarargs(value: SchemaAncestor*): Self = StObject.set(x, "ancestor", js.Array(value*))
  }
}
