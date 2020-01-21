package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MVCxClientQueryBuilder.SaveCommandExecuted event.
  */
@JSGlobal("MVCxClientQueryBuilderSaveCommandExecutedEventArgs")
@js.native
class MVCxClientQueryBuilderSaveCommandExecutedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the MVCxClientQueryBuilderSaveCommandExecutedEventArgs class with the specified settings.
    * @param result An object that specifies the Save command execution result.
    */
  def this(result: String) = this()
  /**
    * Specifies the Save command execution result.
    */
  var Result: String = js.native
}

