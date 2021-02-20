package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMediaQueriesResponse extends StObject {
  
  var medias: js.Array[CSSMedia] = js.native
}
object GetMediaQueriesResponse {
  
  @scala.inline
  def apply(medias: js.Array[CSSMedia]): GetMediaQueriesResponse = {
    val __obj = js.Dynamic.literal(medias = medias.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMediaQueriesResponse]
  }
  
  @scala.inline
  implicit class GetMediaQueriesResponseMutableBuilder[Self <: GetMediaQueriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedias(value: js.Array[CSSMedia]): Self = StObject.set(x, "medias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediasVarargs(value: CSSMedia*): Self = StObject.set(x, "medias", js.Array(value :_*))
  }
}
