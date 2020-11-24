package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single row in the confusion matrix.
  */
@js.native
trait SchemaRow extends js.Object {
  
  /**
    * The original label of this row.
    */
  var actualLabel: js.UndefOr[String] = js.native
  
  /**
    * Info describing predicted label distribution.
    */
  var entries: js.UndefOr[js.Array[SchemaEntry]] = js.native
}
object SchemaRow {
  
  @scala.inline
  def apply(): SchemaRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRow]
  }
  
  @scala.inline
  implicit class SchemaRowOps[Self <: SchemaRow] (val x: Self) extends AnyVal {
    
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
    def setActualLabel(value: String): Self = this.set("actualLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualLabel: Self = this.set("actualLabel", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[SchemaEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
}
