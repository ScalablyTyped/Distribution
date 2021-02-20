package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.standard
import typings.devextreme.devextremeStrings.virtual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mode extends StObject {
  
  var mode: js.UndefOr[standard | virtual] = js.native
  
  var useNative: js.UndefOr[Boolean | auto] = js.native
}
object Mode {
  
  @scala.inline
  def apply(): Mode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: standard | virtual): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setUseNative(value: Boolean | auto): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
  }
}
