package typings.elkjs.libElkApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElkLayoutCategoryDescription
  extends StObject
     with ElkCommonDescription {
  
  var knownLayouters: js.UndefOr[js.Array[String]] = js.undefined
}
object ElkLayoutCategoryDescription {
  
  inline def apply(): ElkLayoutCategoryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElkLayoutCategoryDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElkLayoutCategoryDescription] (val x: Self) extends AnyVal {
    
    inline def setKnownLayouters(value: js.Array[String]): Self = StObject.set(x, "knownLayouters", value.asInstanceOf[js.Any])
    
    inline def setKnownLayoutersUndefined: Self = StObject.set(x, "knownLayouters", js.undefined)
    
    inline def setKnownLayoutersVarargs(value: String*): Self = StObject.set(x, "knownLayouters", js.Array(value*))
  }
}
