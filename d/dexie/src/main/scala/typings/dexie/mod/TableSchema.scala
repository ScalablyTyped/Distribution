package typings.dexie.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableSchema extends js.Object {
  
  var idxByName: StringDictionary[IndexSpec] = js.native
  
  var indexes: js.Array[IndexSpec] = js.native
  
  var mappedClass: js.Function = js.native
  
  var name: String = js.native
  
  var primKey: IndexSpec = js.native
  
  var readHook: js.UndefOr[js.Function1[/* x */ js.Any, _]] = js.native
}
object TableSchema {
  
  @scala.inline
  def apply(
    idxByName: StringDictionary[IndexSpec],
    indexes: js.Array[IndexSpec],
    mappedClass: js.Function,
    name: String,
    primKey: IndexSpec
  ): TableSchema = {
    val __obj = js.Dynamic.literal(idxByName = idxByName.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], mappedClass = mappedClass.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primKey = primKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSchema]
  }
  
  @scala.inline
  implicit class TableSchemaOps[Self <: TableSchema] (val x: Self) extends AnyVal {
    
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
    def setIdxByName(value: StringDictionary[IndexSpec]): Self = this.set("idxByName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesVarargs(value: IndexSpec*): Self = this.set("indexes", js.Array(value :_*))
    
    @scala.inline
    def setIndexes(value: js.Array[IndexSpec]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappedClass(value: js.Function): Self = this.set("mappedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimKey(value: IndexSpec): Self = this.set("primKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadHook(value: /* x */ js.Any => _): Self = this.set("readHook", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReadHook: Self = this.set("readHook", js.undefined)
  }
}
