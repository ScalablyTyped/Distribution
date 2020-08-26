package typings.errorhandler.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Provide a function to be called with the error and a string representation of the erro
    * Defaults to true.
    *
    * Possible values:
    *   true       : Log errors using console.error(str).
    *   false      : Only send the error back in the response.
    *   A function : pass the error to a function for handling.
    */
  var log: Boolean | LoggingCallback = js.native
}

object Options {
  @scala.inline
  def apply(log: Boolean | LoggingCallback): Options = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
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
    def setLogFunction4(
      value: (/* err */ Error, /* str */ String, /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Unit
    ): Self = this.set("log", js.Any.fromFunction4(value))
    @scala.inline
    def setLog(value: Boolean | LoggingCallback): Self = this.set("log", value.asInstanceOf[js.Any])
  }
  
}

