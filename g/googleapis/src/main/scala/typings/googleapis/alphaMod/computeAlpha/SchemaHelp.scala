package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHelp extends StObject {
  
  /**
    * URL(s) pointing to additional information on handling the current error.
    */
  var links: js.UndefOr[js.Array[SchemaHelpLink]] = js.undefined
}
object SchemaHelp {
  
  inline def apply(): SchemaHelp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHelp]
  }
  
  extension [Self <: SchemaHelp](x: Self) {
    
    inline def setLinks(value: js.Array[SchemaHelpLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: SchemaHelpLink*): Self = StObject.set(x, "links", js.Array(value*))
  }
}
