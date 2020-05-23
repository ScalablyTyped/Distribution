package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the header/footer edit mode so it allows creation of a different header or footer for odd and even pages of a document or section.
  */
@JSGlobal("SetDifferentOddAndEvenPagesHeaderFooterCommand")
@js.native
class SetDifferentOddAndEvenPagesHeaderFooterCommand ()
  extends typings.devexpressWeb.SetDifferentOddAndEvenPagesHeaderFooterCommand {
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

