package typings.fluentuiReactComponentRef

import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handleRefMod {
  
  @JSImport("@fluentui/react-component-ref/dist/es/handleRef", JSImport.Default)
  @js.native
  def default[N](ref: js.UndefOr[scala.Nothing], node: N): Unit = js.native
  /**
    * The function that correctly handles passing refs.
    *
    * @param ref - An ref object or function
    * @param node - A node that should be passed by ref
    */
  @JSImport("@fluentui/react-component-ref/dist/es/handleRef", JSImport.Default)
  @js.native
  def default[N](ref: js.Function1[/* instance */ N | Null, Unit], node: N): Unit = js.native
  @JSImport("@fluentui/react-component-ref/dist/es/handleRef", JSImport.Default)
  @js.native
  def default[N](ref: Null, node: N): Unit = js.native
  @JSImport("@fluentui/react-component-ref/dist/es/handleRef", JSImport.Default)
  @js.native
  def default[N](ref: RefObject[N], node: N): Unit = js.native
}
