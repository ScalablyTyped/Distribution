package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Confusion matrix for multi-class classification models.
  */
@js.native
trait SchemaConfusionMatrix extends js.Object {
  
  /**
    * Confidence threshold used when computing the entries of the confusion
    * matrix.
    */
  var confidenceThreshold: js.UndefOr[Double] = js.native
  
  /**
    * One row per actual label.
    */
  var rows: js.UndefOr[js.Array[SchemaRow]] = js.native
}
object SchemaConfusionMatrix {
  
  @scala.inline
  def apply(): SchemaConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfusionMatrix]
  }
  
  @scala.inline
  implicit class SchemaConfusionMatrixOps[Self <: SchemaConfusionMatrix] (val x: Self) extends AnyVal {
    
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
    def setConfidenceThreshold(value: Double): Self = this.set("confidenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidenceThreshold: Self = this.set("confidenceThreshold", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: SchemaRow*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[SchemaRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
}
