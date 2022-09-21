package typings.devextreme.mod.DevExpress.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
  */
trait BaseGroupDescriptor[T] extends StObject {
  
  var selector: KeySelector[T]
}
object BaseGroupDescriptor {
  
  inline def apply[T](selector: KeySelector[T]): BaseGroupDescriptor[T] = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseGroupDescriptor[T]]
  }
  
  extension [Self <: BaseGroupDescriptor[?], T](x: Self & BaseGroupDescriptor[T]) {
    
    inline def setSelector(value: KeySelector[T]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorFunction1(value: T => String | Double | js.Date | js.Object): Self = StObject.set(x, "selector", js.Any.fromFunction1(value))
  }
}
