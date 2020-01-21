package typings.elasticlunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerialisedIndexData[T] extends js.Object {
  var documentStore: SerialisedDocumentStore[T]
  var fields: js.Array[String]
  var index: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? elasticlunr.elasticlunr.InvertedIndexNode}
    */ typings.elasticlunr.elasticlunrStrings.SerialisedIndexData with js.Any
  var pipeline: SerialisedPipeline
  var ref: String
  var version: String
}

object SerialisedIndexData {
  @scala.inline
  def apply[T](
    documentStore: SerialisedDocumentStore[T],
    fields: js.Array[String],
    index: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? elasticlunr.elasticlunr.InvertedIndexNode}
    */ typings.elasticlunr.elasticlunrStrings.SerialisedIndexData with js.Any,
    pipeline: SerialisedPipeline,
    ref: String,
    version: String
  ): SerialisedIndexData[T] = {
    val __obj = js.Dynamic.literal(documentStore = documentStore.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SerialisedIndexData[T]]
  }
}

