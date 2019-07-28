package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientSpellCheckerStopCheckingReasonStatic extends js.Object {
  /**
    * Spell checking is finished normally.
    */
  var Default: String
  /**
    * The user stopped spell checking.
    */
  var User: String
}

object ASPxClientSpellCheckerStopCheckingReasonStatic {
  @scala.inline
  def apply(Default: String, User: String): ASPxClientSpellCheckerStopCheckingReasonStatic = {
    val __obj = js.Dynamic.literal(Default = Default, User = User)
  
    __obj.asInstanceOf[ASPxClientSpellCheckerStopCheckingReasonStatic]
  }
}

