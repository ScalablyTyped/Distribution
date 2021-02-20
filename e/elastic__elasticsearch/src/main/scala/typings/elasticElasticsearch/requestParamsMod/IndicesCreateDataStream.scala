package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesCreateDataStream extends Generic {
  
  var name: String = js.native
}
object IndicesCreateDataStream {
  
  @scala.inline
  def apply(name: String): IndicesCreateDataStream = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesCreateDataStream]
  }
  
  @scala.inline
  implicit class IndicesCreateDataStreamMutableBuilder[Self <: IndicesCreateDataStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
