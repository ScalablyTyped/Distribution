package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  def spellCheck(words: js.Array[String], callback: js.Function1[/* misspeltWords */ js.Array[String], Unit]): Unit
}

object Provider {
  @scala.inline
  def apply(spellCheck: (js.Array[String], js.Function1[/* misspeltWords */ js.Array[String], Unit]) => Unit): Provider = {
    val __obj = js.Dynamic.literal(spellCheck = js.Any.fromFunction2(spellCheck))
    __obj.asInstanceOf[Provider]
  }
}

