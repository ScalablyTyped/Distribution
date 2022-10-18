package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesResolveIndexResolveIndexItem extends StObject {
  
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var attributes: js.Array[String]
  
  var data_stream: js.UndefOr[DataStreamName] = js.undefined
  
  var name: Name
}
object IndicesResolveIndexResolveIndexItem {
  
  inline def apply(attributes: js.Array[String], name: Name): IndicesResolveIndexResolveIndexItem = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesResolveIndexResolveIndexItem]
  }
  
  extension [Self <: IndicesResolveIndexResolveIndexItem](x: Self) {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setData_stream(value: DataStreamName): Self = StObject.set(x, "data_stream", value.asInstanceOf[js.Any])
    
    inline def setData_streamUndefined: Self = StObject.set(x, "data_stream", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
