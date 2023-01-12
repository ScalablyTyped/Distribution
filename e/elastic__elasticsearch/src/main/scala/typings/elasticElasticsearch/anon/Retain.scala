package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Retain extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var retain: js.UndefOr[Boolean] = js.undefined
}
object Retain {
  
  inline def apply(): Retain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Retain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Retain] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
    
    inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
  }
}
