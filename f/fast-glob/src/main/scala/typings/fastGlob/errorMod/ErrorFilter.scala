package typings.fastGlob.errorMod

import typings.fastGlob.typesMod.ErrorFilterFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorFilter extends js.Object {
  
  var _isNonFatalError: js.Any = js.native
  
  val _settings: js.Any = js.native
  
  def getFilter(): ErrorFilterFunction = js.native
}
object ErrorFilter {
  
  @scala.inline
  def apply(_isNonFatalError: js.Any, _settings: js.Any, getFilter: () => ErrorFilterFunction): ErrorFilter = {
    val __obj = js.Dynamic.literal(_isNonFatalError = _isNonFatalError.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], getFilter = js.Any.fromFunction0(getFilter))
    __obj.asInstanceOf[ErrorFilter]
  }
  
  @scala.inline
  implicit class ErrorFilterOps[Self <: ErrorFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_isNonFatalError(value: js.Any): Self = this.set("_isNonFatalError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_settings(value: js.Any): Self = this.set("_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFilter(value: () => ErrorFilterFunction): Self = this.set("getFilter", js.Any.fromFunction0(value))
  }
}
