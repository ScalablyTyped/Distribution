package typings.gatsby.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityTracker extends js.Object {
  var panic: LogErrorType
  var panicOnBuild: LogErrorType
  var span: js.Object
  def end(): js.Function0[Unit]
  def setStatus(status: String): Unit
  def start(): js.Function0[Unit]
}

object ActivityTracker {
  @scala.inline
  def apply(
    end: () => js.Function0[Unit],
    panic: (/* errorMeta */ String | js.Object, /* error */ js.UndefOr[js.Object]) => Unit,
    panicOnBuild: (/* errorMeta */ String | js.Object, /* error */ js.UndefOr[js.Object]) => Unit,
    setStatus: String => Unit,
    span: js.Object,
    start: () => js.Function0[Unit]
  ): ActivityTracker = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), panic = js.Any.fromFunction2(panic), panicOnBuild = js.Any.fromFunction2(panicOnBuild), setStatus = js.Any.fromFunction1(setStatus), span = span, start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[ActivityTracker]
  }
}

