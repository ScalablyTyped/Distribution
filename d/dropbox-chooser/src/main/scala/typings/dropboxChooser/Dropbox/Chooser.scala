package typings.dropboxChooser.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chooser extends js.Object {
  def choose(options: ChooserOptions): Unit = js.native
}

object Chooser {
  @scala.inline
  def apply(choose: ChooserOptions => Unit): Chooser = {
    val __obj = js.Dynamic.literal(choose = js.Any.fromFunction1(choose))
    __obj.asInstanceOf[Chooser]
  }
  @scala.inline
  implicit class ChooserOps[Self <: Chooser] (val x: Self) extends AnyVal {
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
    def setChoose(value: ChooserOptions => Unit): Self = this.set("choose", js.Any.fromFunction1(value))
  }
  
}

