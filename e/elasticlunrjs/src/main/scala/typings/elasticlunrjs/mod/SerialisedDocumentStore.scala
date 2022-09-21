package typings.elasticlunrjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialisedDocumentStore[T] extends StObject {
  
  var docInfo: StringDictionary[
    typings.elasticlunrjs.elasticlunrjsStrings.SerialisedDocumentStore & TopLevel[Any]
  ]
  
  var docs: StringDictionary[T]
}
object SerialisedDocumentStore {
  
  inline def apply[T](
    docInfo: StringDictionary[
      typings.elasticlunrjs.elasticlunrjsStrings.SerialisedDocumentStore & TopLevel[Any]
    ],
    docs: StringDictionary[T]
  ): SerialisedDocumentStore[T] = {
    val __obj = js.Dynamic.literal(docInfo = docInfo.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialisedDocumentStore[T]]
  }
  
  extension [Self <: SerialisedDocumentStore[?], T](x: Self & SerialisedDocumentStore[T]) {
    
    inline def setDocInfo(
      value: StringDictionary[
          typings.elasticlunrjs.elasticlunrjsStrings.SerialisedDocumentStore & TopLevel[Any]
        ]
    ): Self = StObject.set(x, "docInfo", value.asInstanceOf[js.Any])
    
    inline def setDocs(value: StringDictionary[T]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
  }
}
