package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Provider extends js.Object {
  def spellCheck(words: js.Array[String], callback: js.Function1[/* misspeltWords */ js.Array[String], Unit]): Unit = js.native
}

object Provider {
  @scala.inline
  def apply(spellCheck: (js.Array[String], js.Function1[/* misspeltWords */ js.Array[String], Unit]) => Unit): Provider = {
    val __obj = js.Dynamic.literal(spellCheck = js.Any.fromFunction2(spellCheck))
    __obj.asInstanceOf[Provider]
  }
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSpellCheck(value: (js.Array[String], js.Function1[/* misspeltWords */ js.Array[String], Unit]) => Unit): Self = this.set("spellCheck", js.Any.fromFunction2(value))
  }
  
}

