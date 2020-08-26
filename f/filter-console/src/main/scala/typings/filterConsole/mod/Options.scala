package typings.filterConsole.mod

import typings.filterConsole.filterConsoleStrings.debug
import typings.filterConsole.filterConsoleStrings.error
import typings.filterConsole.filterConsoleStrings.info
import typings.filterConsole.filterConsoleStrings.log
import typings.filterConsole.filterConsoleStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Use a custom `console` object. Can be useful for testing or mocking.
  		@default console
  		*/
  val console: js.UndefOr[Console] = js.native
  /**
  		Console methods to filter.
  		@default ['log', 'debug', 'info', 'warn', 'error']
  		*/
  val methods: js.UndefOr[js.Array[log | debug | info | warn | error]] = js.native
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
    def setConsole(value: Console): Self = this.set("console", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsole: Self = this.set("console", js.undefined)
    @scala.inline
    def setMethodsVarargs(value: (log | debug | info | warn | error)*): Self = this.set("methods", js.Array(value :_*))
    @scala.inline
    def setMethods(value: js.Array[log | debug | info | warn | error]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
  }
  
}

