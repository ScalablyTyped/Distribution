package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaClustering extends js.Object {
  
  /**
    * [Repeated] One or more fields on which data should be clustered. Only
    * top-level, non-repeated, simple-type fields are supported. When you
    * cluster a table using multiple columns, the order of columns you specify
    * is important. The order of the specified columns determines the sort
    * order of the data.
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
}
object SchemaClustering {
  
  @scala.inline
  def apply(): SchemaClustering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClustering]
  }
  
  @scala.inline
  implicit class SchemaClusteringOps[Self <: SchemaClustering] (val x: Self) extends AnyVal {
    
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
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
}
