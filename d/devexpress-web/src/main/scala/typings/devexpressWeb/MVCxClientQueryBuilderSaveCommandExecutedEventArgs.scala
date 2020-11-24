package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the MVCxClientQueryBuilder.SaveCommandExecuted event.
  */
@js.native
trait MVCxClientQueryBuilderSaveCommandExecutedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Specifies the Save command execution result.
    */
  var Result: String = js.native
}
object MVCxClientQueryBuilderSaveCommandExecutedEventArgs {
  
  @scala.inline
  def apply(Result: String): MVCxClientQueryBuilderSaveCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientQueryBuilderSaveCommandExecutedEventArgs]
  }
  
  @scala.inline
  implicit class MVCxClientQueryBuilderSaveCommandExecutedEventArgsOps[Self <: MVCxClientQueryBuilderSaveCommandExecutedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setResult(value: String): Self = this.set("Result", value.asInstanceOf[js.Any])
  }
}
