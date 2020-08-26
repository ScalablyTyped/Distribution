package typings.fitvids.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If you'd like to ignore certain videos, you can pass a selector via the ignore option.
    * @default ""
    */
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * By default, fitvids automatically wraps Youtube, Vimeo, and Kickstarter players,
    * but if you'd like it to wrap others too, you can pass them in as selectors via the players property.
    * @default ""
    */
  var players: js.UndefOr[String | js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setPlayersVarargs(value: String*): Self = this.set("players", js.Array(value :_*))
    @scala.inline
    def setPlayers(value: String | js.Array[String]): Self = this.set("players", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayers: Self = this.set("players", js.undefined)
  }
  
}

