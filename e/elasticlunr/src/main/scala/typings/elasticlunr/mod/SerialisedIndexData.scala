package typings.elasticlunr.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerialisedIndexData[T] extends js.Object {
  
  var documentStore: SerialisedDocumentStore[T] = js.native
  
  var fields: js.Array[/* keyof T */ String] = js.native
  
  var index: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? elasticlunr.elasticlunr.InvertedIndexNode}
    */ typings.elasticlunr.elasticlunrStrings.SerialisedIndexData with TopLevel[js.Any] = js.native
  
  var pipeline: SerialisedPipeline = js.native
  
  var ref: /* keyof T */ String = js.native
  
  var version: String = js.native
}
object SerialisedIndexData {
  
  @scala.inline
  def apply[T](
    documentStore: SerialisedDocumentStore[T],
    fields: js.Array[/* keyof T */ String],
    index: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? elasticlunr.elasticlunr.InvertedIndexNode}
    */ typings.elasticlunr.elasticlunrStrings.SerialisedIndexData with TopLevel[js.Any],
    pipeline: SerialisedPipeline,
    ref: /* keyof T */ String,
    version: String
  ): SerialisedIndexData[T] = {
    val __obj = js.Dynamic.literal(documentStore = documentStore.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialisedIndexData[T]]
  }
  
  @scala.inline
  implicit class SerialisedIndexDataOps[Self <: SerialisedIndexData[_], T] (val x: Self with SerialisedIndexData[T]) extends AnyVal {
    
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
    def setDocumentStore(value: SerialisedDocumentStore[T]): Self = this.set("documentStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: (/* keyof T */ String)*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[/* keyof T */ String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? elasticlunr.elasticlunr.InvertedIndexNode}
      */ typings.elasticlunr.elasticlunrStrings.SerialisedIndexData with TopLevel[js.Any]
    ): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineVarargs(value: String*): Self = this.set("pipeline", js.Array(value :_*))
    
    @scala.inline
    def setPipeline(value: SerialisedPipeline): Self = this.set("pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: /* keyof T */ String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
