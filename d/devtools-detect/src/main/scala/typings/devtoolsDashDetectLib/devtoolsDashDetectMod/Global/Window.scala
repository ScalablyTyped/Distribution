package typings
package devtoolsDashDetectLib.devtoolsDashDetectMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  @JSName("addEventListener")
  def addEventListener_devtoolschange(
    `type`: devtoolsDashDetectLib.devtoolsDashDetectLibStrings.devtoolschange,
    listener: js.Function1[/* event */ devtoolsDashDetectLib.devtoolsDashDetectMod.DevToolsEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devtoolschange(
    `type`: devtoolsDashDetectLib.devtoolsDashDetectLibStrings.devtoolschange,
    listener: js.Function1[/* event */ devtoolsDashDetectLib.devtoolsDashDetectMod.DevToolsEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devtoolschange(
    `type`: devtoolsDashDetectLib.devtoolsDashDetectLibStrings.devtoolschange,
    listener: js.Function1[/* event */ devtoolsDashDetectLib.devtoolsDashDetectMod.DevToolsEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
}

