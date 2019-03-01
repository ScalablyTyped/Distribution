package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the FlashScriptCommand client event.
  */
trait ASPxClientFlashScriptCommandEventArgs extends ASPxClientEventArgs {
  /**
    * Gets arguments passed via the FSCommand action of the flash object.
    * Value: A string that represents the value of the FSCommand action's args parameter.
    */
  var args: java.lang.String
  /**
    * Gets a command passed via the FSCommand action of the flash object.
    * Value: A string that represents the value of the FSCommand action's command parameter.
    */
  var command: java.lang.String
}

object ASPxClientFlashScriptCommandEventArgs {
  @scala.inline
  def apply(args: java.lang.String, command: java.lang.String): ASPxClientFlashScriptCommandEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("command")(command)
    __obj.asInstanceOf[ASPxClientFlashScriptCommandEventArgs]
  }
}

