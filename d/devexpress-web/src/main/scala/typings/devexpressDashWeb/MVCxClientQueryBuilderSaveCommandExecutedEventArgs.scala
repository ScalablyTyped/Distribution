package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the SaveCommandExecuted event.
  */
trait MVCxClientQueryBuilderSaveCommandExecutedEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies the Save command execution result.
    * Value: An object that specifies the command execution result.
    */
  var Result: String
}

object MVCxClientQueryBuilderSaveCommandExecutedEventArgs {
  @scala.inline
  def apply(Result: String): MVCxClientQueryBuilderSaveCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(Result = Result)
  
    __obj.asInstanceOf[MVCxClientQueryBuilderSaveCommandExecutedEventArgs]
  }
}

