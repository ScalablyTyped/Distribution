package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An alias to a repo revision.
  */
@js.native
trait SchemaAliasContext extends StObject {
  
  /**
    * The alias kind.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The alias name.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaAliasContext {
  
  @scala.inline
  def apply(): SchemaAliasContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAliasContext]
  }
  
  @scala.inline
  implicit class SchemaAliasContextMutableBuilder[Self <: SchemaAliasContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
