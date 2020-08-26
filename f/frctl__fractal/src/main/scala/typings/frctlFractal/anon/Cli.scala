package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cli extends js.Object {
  var cli: String = js.native
  var local: String = js.native
}

object Cli {
  @scala.inline
  def apply(cli: String, local: String): Cli = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cli]
  }
  @scala.inline
  implicit class CliOps[Self <: Cli] (val x: Self) extends AnyVal {
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
    def setCli(value: String): Self = this.set("cli", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocal(value: String): Self = this.set("local", value.asInstanceOf[js.Any])
  }
  
}

