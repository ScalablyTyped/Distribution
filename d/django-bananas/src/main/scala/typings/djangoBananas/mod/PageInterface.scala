package typings.djangoBananas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageInterface[T]
  extends StObject
     with PageInterfaceBase {
  
  var data: PageData[T]
}
object PageInterface {
  
  inline def apply[T](data: PageData[T], route: RouteData, title: String): PageInterface[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInterface[T]]
  }
  
  extension [Self <: PageInterface[?], T](x: Self & PageInterface[T]) {
    
    inline def setData(value: PageData[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
