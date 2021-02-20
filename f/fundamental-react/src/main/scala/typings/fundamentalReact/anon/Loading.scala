package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loading extends StObject {
  
  var loading: js.UndefOr[String] = js.native
}
object Loading {
  
  @scala.inline
  def apply(): Loading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loading]
  }
  
  @scala.inline
  implicit class LoadingMutableBuilder[Self <: Loading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
  }
}
