package typings.fluentuiReactWindowProvider

import typings.fluentuiReactWindowProvider.windowProviderMod.WindowProviderProps
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.std.Document
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluentui/react-window-provider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val WindowContext: Context[WindowProviderProps] = js.native
  
  val WindowProvider: FunctionComponent[WindowProviderProps] = js.native
  
  def useDocument(): js.UndefOr[Document] = js.native
  
  def useWindow(): js.UndefOr[Window] = js.native
}
