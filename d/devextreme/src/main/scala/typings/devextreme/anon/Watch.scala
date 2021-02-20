package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watch extends StObject {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var key: js.UndefOr[js.Any] = js.native
  
  var watch: js.UndefOr[js.Function] = js.native
}
object Watch {
  
  @scala.inline
  def apply(): Watch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Watch]
  }
  
  @scala.inline
  implicit class WatchMutableBuilder[Self <: Watch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setWatch(value: js.Function): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
