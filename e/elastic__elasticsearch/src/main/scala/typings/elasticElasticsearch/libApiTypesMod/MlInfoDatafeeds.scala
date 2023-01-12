package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlInfoDatafeeds extends StObject {
  
  var scroll_size: integer
}
object MlInfoDatafeeds {
  
  inline def apply(scroll_size: integer): MlInfoDatafeeds = {
    val __obj = js.Dynamic.literal(scroll_size = scroll_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlInfoDatafeeds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlInfoDatafeeds] (val x: Self) extends AnyVal {
    
    inline def setScroll_size(value: integer): Self = StObject.set(x, "scroll_size", value.asInstanceOf[js.Any])
  }
}
