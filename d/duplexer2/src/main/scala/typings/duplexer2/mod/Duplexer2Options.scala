package typings.duplexer2.mod

import typings.node.streamMod.DuplexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duplexer2Options extends DuplexOptions {
  var bubbleErrors: js.UndefOr[Boolean] = js.native
}

object Duplexer2Options {
  @scala.inline
  def apply(): Duplexer2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duplexer2Options]
  }
  @scala.inline
  implicit class Duplexer2OptionsOps[Self <: Duplexer2Options] (val x: Self) extends AnyVal {
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
    def setBubbleErrors(value: Boolean): Self = this.set("bubbleErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbleErrors: Self = this.set("bubbleErrors", js.undefined)
  }
  
}

