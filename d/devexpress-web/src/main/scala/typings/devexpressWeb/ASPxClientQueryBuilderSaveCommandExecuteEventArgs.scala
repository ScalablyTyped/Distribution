package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientQueryBuilder.SaveCommandExecute event.
  */
trait ASPxClientQueryBuilderSaveCommandExecuteEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies whether or not the event was handled.
    */
  var handled: Boolean
}

object ASPxClientQueryBuilderSaveCommandExecuteEventArgs {
  @scala.inline
  def apply(handled: Boolean): ASPxClientQueryBuilderSaveCommandExecuteEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientQueryBuilderSaveCommandExecuteEventArgs]
  }
}

