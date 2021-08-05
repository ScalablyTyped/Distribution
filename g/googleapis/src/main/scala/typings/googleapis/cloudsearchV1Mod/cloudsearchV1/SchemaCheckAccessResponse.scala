package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckAccessResponse extends StObject {
  
  /**
    * Returns true if principal has access.  Returns false otherwise.
    */
  var hasAccess: js.UndefOr[Boolean] = js.undefined
}
object SchemaCheckAccessResponse {
  
  inline def apply(): SchemaCheckAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckAccessResponse]
  }
  
  extension [Self <: SchemaCheckAccessResponse](x: Self) {
    
    inline def setHasAccess(value: Boolean): Self = StObject.set(x, "hasAccess", value.asInstanceOf[js.Any])
    
    inline def setHasAccessUndefined: Self = StObject.set(x, "hasAccess", js.undefined)
  }
}
