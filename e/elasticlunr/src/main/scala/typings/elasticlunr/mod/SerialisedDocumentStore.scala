package typings.elasticlunr.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialisedDocumentStore[T] extends StObject {
  
  var docInfo: StringDictionary[
    typings.elasticlunr.elasticlunrStrings.SerialisedDocumentStore & TopLevel[js.Any]
  ]
  
  var docs: StringDictionary[T]
}
object SerialisedDocumentStore {
  
  @scala.inline
  def apply[T](
    docInfo: StringDictionary[
      typings.elasticlunr.elasticlunrStrings.SerialisedDocumentStore & TopLevel[js.Any]
    ],
    docs: StringDictionary[T]
  ): SerialisedDocumentStore[T] = {
    val __obj = js.Dynamic.literal(docInfo = docInfo.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialisedDocumentStore[T]]
  }
  
  @scala.inline
  implicit class SerialisedDocumentStoreMutableBuilder[Self <: SerialisedDocumentStore[?], T] (val x: Self & SerialisedDocumentStore[T]) extends AnyVal {
    
    @scala.inline
    def setDocInfo(
      value: StringDictionary[
          typings.elasticlunr.elasticlunrStrings.SerialisedDocumentStore & TopLevel[js.Any]
        ]
    ): Self = StObject.set(x, "docInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocs(value: StringDictionary[T]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
  }
}
