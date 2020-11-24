package typings.devtoolsDetect.mod

import typings.devtoolsDetect.devtoolsDetectStrings.devtoolschange
import typings.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
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
}
