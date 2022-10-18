package typings.formatjsIcuMessageformatParser.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleFormatElement[T /* <: TYPE */, S /* <: Skeleton */]
  extends StObject
     with BaseElement[T] {
  
  var style: js.UndefOr[String | S | Null] = js.undefined
}
object SimpleFormatElement {
  
  inline def apply[T /* <: TYPE */, S /* <: Skeleton */](`type`: T, value: String): SimpleFormatElement[T, S] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleFormatElement[T, S]]
  }
  
  extension [Self <: SimpleFormatElement[?, ?], T /* <: TYPE */, S /* <: Skeleton */](x: Self & (SimpleFormatElement[T, S])) {
    
    inline def setStyle(value: String | S): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
