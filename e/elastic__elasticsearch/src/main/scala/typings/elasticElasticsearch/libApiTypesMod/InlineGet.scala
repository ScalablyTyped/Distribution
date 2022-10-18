package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineGet[TDocument]
  extends StObject
     with InlineGetKeys[TDocument]
     with /* property */ StringDictionary[Any]
object InlineGet {
  
  inline def apply[TDocument](_source: TDocument, found: Boolean): InlineGet[TDocument] = {
    val __obj = js.Dynamic.literal(_source = _source.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineGet[TDocument]]
  }
}
