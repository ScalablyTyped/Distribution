package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMediaQueriesResponse extends StObject {
  
  var medias: js.Array[CSSMedia]
}
object GetMediaQueriesResponse {
  
  inline def apply(medias: js.Array[CSSMedia]): GetMediaQueriesResponse = {
    val __obj = js.Dynamic.literal(medias = medias.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMediaQueriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMediaQueriesResponse] (val x: Self) extends AnyVal {
    
    inline def setMedias(value: js.Array[CSSMedia]): Self = StObject.set(x, "medias", value.asInstanceOf[js.Any])
    
    inline def setMediasVarargs(value: CSSMedia*): Self = StObject.set(x, "medias", js.Array(value*))
  }
}
