package typings
package devtoolsDashDetectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var devtools: DevTools = js.native
  @JSName("addEventListener")
  def addEventListener_devtoolschange(
    `type`: devtoolsDashDetectLib.devtoolsDashDetectLibStrings.devtoolschange,
    listener: js.Function1[/* ev */ DevToolsEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devtoolschange(
    `type`: devtoolsDashDetectLib.devtoolsDashDetectLibStrings.devtoolschange,
    listener: js.Function1[/* ev */ DevToolsEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
}

