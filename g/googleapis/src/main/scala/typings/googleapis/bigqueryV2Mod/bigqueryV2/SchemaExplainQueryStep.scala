package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaExplainQueryStep extends StObject {
  
  /**
    * Machine-readable operation type.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Human-readable stage descriptions.
    */
  var substeps: js.UndefOr[js.Array[String]] = js.native
}
object SchemaExplainQueryStep {
  
  @scala.inline
  def apply(): SchemaExplainQueryStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExplainQueryStep]
  }
  
  @scala.inline
  implicit class SchemaExplainQueryStepMutableBuilder[Self <: SchemaExplainQueryStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSubsteps(value: js.Array[String]): Self = StObject.set(x, "substeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstepsUndefined: Self = StObject.set(x, "substeps", js.undefined)
    
    @scala.inline
    def setSubstepsVarargs(value: String*): Self = StObject.set(x, "substeps", js.Array(value :_*))
  }
}
