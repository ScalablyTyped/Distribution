package typings.eggLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportOptions extends js.Object {
  var contextFormatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.native
  var encoding: js.UndefOr[String] = js.native
  var eol: js.UndefOr[String] = js.native
  var formatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.native
  var json: js.UndefOr[Boolean] = js.native
  var level: js.UndefOr[LoggerLevel] = js.native
}

object TransportOptions {
  @scala.inline
  def apply(): TransportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransportOptions]
  }
  @scala.inline
  implicit class TransportOptionsOps[Self <: TransportOptions] (val x: Self) extends AnyVal {
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
    def setContextFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = this.set("contextFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContextFormatter: Self = this.set("contextFormatter", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    @scala.inline
    def setFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setLevel(value: LoggerLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

