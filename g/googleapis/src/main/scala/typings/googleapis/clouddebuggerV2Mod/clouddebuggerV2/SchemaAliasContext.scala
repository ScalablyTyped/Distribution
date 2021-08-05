package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An alias to a repo revision.
  */
trait SchemaAliasContext extends StObject {
  
  /**
    * The alias kind.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The alias name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaAliasContext {
  
  inline def apply(): SchemaAliasContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAliasContext]
  }
  
  extension [Self <: SchemaAliasContext](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
