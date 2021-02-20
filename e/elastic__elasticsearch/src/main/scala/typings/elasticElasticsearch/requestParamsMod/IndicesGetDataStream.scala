package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesGetDataStream extends Generic {
  
  var name: js.UndefOr[String | js.Array[String]] = js.native
}
object IndicesGetDataStream {
  
  @scala.inline
  def apply(): IndicesGetDataStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesGetDataStream]
  }
  
  @scala.inline
  implicit class IndicesGetDataStreamMutableBuilder[Self <: IndicesGetDataStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
