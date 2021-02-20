package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rule for determining which cells to delete during garbage collection.
  */
@js.native
trait SchemaGcRule extends StObject {
  
  /**
    * Delete cells that would be deleted by every nested rule.
    */
  var intersection: js.UndefOr[SchemaIntersection] = js.native
  
  /**
    * Delete cells in a column older than the given age. Values must be at
    * least one millisecond, and will be truncated to microsecond granularity.
    */
  var maxAge: js.UndefOr[String] = js.native
  
  /**
    * Delete all cells in a column except the most recent N.
    */
  var maxNumVersions: js.UndefOr[Double] = js.native
  
  /**
    * Delete cells that would be deleted by any nested rule.
    */
  var union: js.UndefOr[SchemaUnion] = js.native
}
object SchemaGcRule {
  
  @scala.inline
  def apply(): SchemaGcRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcRule]
  }
  
  @scala.inline
  implicit class SchemaGcRuleMutableBuilder[Self <: SchemaGcRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntersection(value: SchemaIntersection): Self = StObject.set(x, "intersection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionUndefined: Self = StObject.set(x, "intersection", js.undefined)
    
    @scala.inline
    def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    @scala.inline
    def setMaxNumVersions(value: Double): Self = StObject.set(x, "maxNumVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNumVersionsUndefined: Self = StObject.set(x, "maxNumVersions", js.undefined)
    
    @scala.inline
    def setUnion(value: SchemaUnion): Self = StObject.set(x, "union", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnionUndefined: Self = StObject.set(x, "union", js.undefined)
  }
}
