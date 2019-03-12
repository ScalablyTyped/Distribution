package typings
package easyDashXDashHeadersLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrnoException
  extends stdLib.Error {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var errno: js.UndefOr[scala.Double] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var syscall: js.UndefOr[java.lang.String] = js.undefined
}

object ErrnoException {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    code: java.lang.String = null,
    errno: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    stack: java.lang.String = null,
    syscall: java.lang.String = null
  ): ErrnoException = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (code != null) __obj.updateDynamic("code")(code)
    if (errno != null) __obj.updateDynamic("errno")(errno.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (syscall != null) __obj.updateDynamic("syscall")(syscall)
    __obj.asInstanceOf[ErrnoException]
  }
}

