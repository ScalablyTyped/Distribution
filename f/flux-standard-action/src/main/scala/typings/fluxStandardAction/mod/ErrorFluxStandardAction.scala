package typings.fluxStandardAction.mod

import typings.fluxStandardAction.fluxStandardActionBooleans.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorFluxStandardAction[Type /* <: String */, CustomError /* <: Error */, Meta] extends FluxStandardAction[Type, CustomError, Meta] {
  
  /**
    * The required `error` property MUST be set to `true` if the action represents an error.
    */
  @JSName("error")
  var error_ErrorFluxStandardAction: `true` = js.native
}
object ErrorFluxStandardAction {
  
  @scala.inline
  def apply[Type /* <: String */, CustomError /* <: Error */, Meta](error: `true`, `type`: Type): ErrorFluxStandardAction[Type, CustomError, Meta] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorFluxStandardAction[Type, CustomError, Meta]]
  }
  
  @scala.inline
  implicit class ErrorFluxStandardActionOps[Self <: ErrorFluxStandardAction[_, _, _], Type /* <: String */, CustomError /* <: Error */, Meta] (val x: Self with (ErrorFluxStandardAction[Type, CustomError, Meta])) extends AnyVal {
    
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
    def setError(value: `true`): Self = this.set("error", value.asInstanceOf[js.Any])
  }
}
