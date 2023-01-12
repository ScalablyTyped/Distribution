package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait BaseRequestOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object BaseRequestOptions {
  
  inline def apply(): BaseRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRequestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseRequestOptions] (val x: Self) extends AnyVal {
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
