package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle the visibility of hidden symbols.
  */
@JSGlobal("ShowHiddenSymbolsCommand")
@js.native
class ShowHiddenSymbolsCommand ()
  extends typings.devexpressWeb.ShowHiddenSymbolsCommand {
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

