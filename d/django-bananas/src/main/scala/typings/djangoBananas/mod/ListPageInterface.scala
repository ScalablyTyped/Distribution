package typings.djangoBananas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPageInterface[T]
  extends StObject
     with PageInterfaceBase {
  
  var data: PageData[js.Array[T]]
}
object ListPageInterface {
  
  inline def apply[T](data: PageData[js.Array[T]], route: RouteData, title: String): ListPageInterface[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPageInterface[T]]
  }
  
  extension [Self <: ListPageInterface[?], T](x: Self & ListPageInterface[T]) {
    
    inline def setData(value: PageData[js.Array[T]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
