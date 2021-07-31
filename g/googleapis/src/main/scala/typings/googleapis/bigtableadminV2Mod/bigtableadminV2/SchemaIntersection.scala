package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A GcRule which deletes cells matching all of the given rules.
  */
trait SchemaIntersection extends StObject {
  
  /**
    * Only delete cells which would be deleted by every element of `rules`.
    */
  var rules: js.UndefOr[js.Array[SchemaGcRule]] = js.undefined
}
object SchemaIntersection {
  
  @scala.inline
  def apply(): SchemaIntersection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntersection]
  }
  
  @scala.inline
  implicit class SchemaIntersectionMutableBuilder[Self <: SchemaIntersection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[SchemaGcRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: SchemaGcRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
