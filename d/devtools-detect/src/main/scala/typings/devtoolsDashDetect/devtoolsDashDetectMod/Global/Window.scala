package typings.devtoolsDashDetect.devtoolsDashDetectMod.Global

import typings.devtoolsDashDetect.devtoolsDashDetectMod.DevToolsEvent
import typings.devtoolsDashDetect.devtoolsDashDetectStrings.devtoolschange
import typings.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  @JSName("addEventListener")
  def addEventListener_devtoolschange(`type`: devtoolschange, listener: js.Function1[/* event */ DevToolsEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devtoolschange(`type`: devtoolschange, listener: js.Function1[/* event */ DevToolsEvent, _], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devtoolschange(
    `type`: devtoolschange,
    listener: js.Function1[/* event */ DevToolsEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

