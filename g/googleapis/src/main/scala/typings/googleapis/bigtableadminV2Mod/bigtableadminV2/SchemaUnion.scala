package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A GcRule which deletes cells matching any of the given rules.
  */
@js.native
trait SchemaUnion extends StObject {
  
  /**
    * Delete cells which would be deleted by any element of `rules`.
    */
  var rules: js.UndefOr[js.Array[SchemaGcRule]] = js.native
}
object SchemaUnion {
  
  @scala.inline
  def apply(): SchemaUnion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnion]
  }
  
  @scala.inline
  implicit class SchemaUnionMutableBuilder[Self <: SchemaUnion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[SchemaGcRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: SchemaGcRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
