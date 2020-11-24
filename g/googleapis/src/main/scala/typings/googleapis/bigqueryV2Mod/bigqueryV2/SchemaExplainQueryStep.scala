package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaExplainQueryStep extends js.Object {
  
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
  implicit class SchemaExplainQueryStepOps[Self <: SchemaExplainQueryStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSubstepsVarargs(value: String*): Self = this.set("substeps", js.Array(value :_*))
    
    @scala.inline
    def setSubsteps(value: js.Array[String]): Self = this.set("substeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubsteps: Self = this.set("substeps", js.undefined)
  }
}
