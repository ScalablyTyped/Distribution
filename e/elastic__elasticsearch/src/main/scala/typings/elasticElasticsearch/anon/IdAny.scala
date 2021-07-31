package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdAny extends StObject {
  
  var id: js.Any
}
object IdAny {
  
  @scala.inline
  def apply(id: js.Any): IdAny = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdAny]
  }
  
  @scala.inline
  implicit class IdAnyMutableBuilder[Self <: IdAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
