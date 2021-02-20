package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPreconfiguredWafSet extends StObject {
  
  /**
    * List of entities that are currently supported for WAF rules.
    */
  var expressionSets: js.UndefOr[js.Array[SchemaWafExpressionSet]] = js.native
}
object SchemaPreconfiguredWafSet {
  
  @scala.inline
  def apply(): SchemaPreconfiguredWafSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPreconfiguredWafSet]
  }
  
  @scala.inline
  implicit class SchemaPreconfiguredWafSetMutableBuilder[Self <: SchemaPreconfiguredWafSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpressionSets(value: js.Array[SchemaWafExpressionSet]): Self = StObject.set(x, "expressionSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionSetsUndefined: Self = StObject.set(x, "expressionSets", js.undefined)
    
    @scala.inline
    def setExpressionSetsVarargs(value: SchemaWafExpressionSet*): Self = StObject.set(x, "expressionSets", js.Array(value :_*))
  }
}
