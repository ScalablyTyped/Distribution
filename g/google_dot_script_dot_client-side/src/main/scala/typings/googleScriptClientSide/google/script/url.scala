package typings.googleScriptClientSide.google.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.script.url")
@js.native
object url extends js.Object {
  /**
    * Gets a URL location object and passes it to the specified callback function (as the only argument).
    * @param callback a client-side callback function to run, using the location object as the only argument.
    */
  def getLocation(callback: js.Function1[/* location */ UrlLocation, Unit]): Unit = js.native
}

