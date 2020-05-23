package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MVCxClientQueryBuilder.SaveCommandExecuted event.
  */
trait MVCxClientQueryBuilderSaveCommandExecutedEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies the Save command execution result.
    */
  var Result: String
}

object MVCxClientQueryBuilderSaveCommandExecutedEventArgs {
  @scala.inline
  def apply(Result: String): MVCxClientQueryBuilderSaveCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientQueryBuilderSaveCommandExecutedEventArgs]
  }
}

