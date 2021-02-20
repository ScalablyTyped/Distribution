package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesDeleteDataStream extends Generic {
  
  var name: String | js.Array[String] = js.native
}
object IndicesDeleteDataStream {
  
  @scala.inline
  def apply(name: String | js.Array[String]): IndicesDeleteDataStream = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDeleteDataStream]
  }
  
  @scala.inline
  implicit class IndicesDeleteDataStreamMutableBuilder[Self <: IndicesDeleteDataStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
