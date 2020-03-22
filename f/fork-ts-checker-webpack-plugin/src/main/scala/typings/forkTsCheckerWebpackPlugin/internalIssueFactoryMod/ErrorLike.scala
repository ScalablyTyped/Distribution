package typings.forkTsCheckerWebpackPlugin.internalIssueFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorLike extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
  @JSName("toString")
  var toString_FErrorLike: js.UndefOr[js.Function0[String]] = js.undefined
}

object ErrorLike {
  @scala.inline
  def apply(message: String = null, stack: String = null, toString: () => String = null): ErrorLike = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    __obj.asInstanceOf[ErrorLike]
  }
}

