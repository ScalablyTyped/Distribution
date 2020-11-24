package typings.dynogels.mod

import typings.joi.mod.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelConfiguration extends js.Object {
  
  var createdAt: js.UndefOr[Boolean | String] = js.native
  
  var hashKey: String = js.native
  
  var indexes: js.UndefOr[js.Array[_]] = js.native
  
  var log: js.UndefOr[Log_] = js.native
  
  var rangeKey: js.UndefOr[String] = js.native
  
  var schema: js.UndefOr[SchemaType] = js.native
  
  var tableName: js.UndefOr[String | tableResolve] = js.native
  
  var timestamps: js.UndefOr[Boolean] = js.native
  
  var updatedAt: js.UndefOr[Boolean | String] = js.native
  
  var validation: js.UndefOr[ValidationOptions] = js.native
}
object ModelConfiguration {
  
  @scala.inline
  def apply(hashKey: String): ModelConfiguration = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelConfiguration]
  }
  
  @scala.inline
  implicit class ModelConfigurationOps[Self <: ModelConfiguration] (val x: Self) extends AnyVal {
    
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
    def setHashKey(value: String): Self = this.set("hashKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: Boolean | String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setIndexesVarargs(value: js.Any*): Self = this.set("indexes", js.Array(value :_*))
    
    @scala.inline
    def setIndexes(value: js.Array[_]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexes: Self = this.set("indexes", js.undefined)
    
    @scala.inline
    def setLog(value: Log_): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setRangeKey(value: String): Self = this.set("rangeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeKey: Self = this.set("rangeKey", js.undefined)
    
    @scala.inline
    def setSchema(value: SchemaType): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setTableNameFunction0(value: () => String): Self = this.set("tableName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTableName(value: String | tableResolve): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
    
    @scala.inline
    def setTimestamps(value: Boolean): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Boolean | String): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("updatedAt", js.undefined)
    
    @scala.inline
    def setValidation(value: ValidationOptions): Self = this.set("validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidation: Self = this.set("validation", js.undefined)
  }
}
