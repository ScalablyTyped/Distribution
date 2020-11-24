package typings.fluentuiReactComponentRef

import typings.fluentuiReactComponentRef.utilsMod.RefProps
import typings.react.mod.FunctionComponent
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluentui/react-component-ref", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Ref: FunctionComponent[RefProps] = js.native
  
  def handleRef[N](ref: js.UndefOr[scala.Nothing], node: N): Unit = js.native
  def handleRef[N](ref: js.Function1[/* instance */ N | Null, Unit], node: N): Unit = js.native
  def handleRef[N](ref: Null, node: N): Unit = js.native
  def handleRef[N](ref: RefObject[N], node: N): Unit = js.native
  
  def isRefObject(ref: js.Any): /* is react.react.RefObject<any> */ Boolean = js.native
  
  @js.native
  class RefFindNode ()
    extends typings.fluentuiReactComponentRef.refFindNodeMod.RefFindNode
  
  @js.native
  class RefForward ()
    extends typings.fluentuiReactComponentRef.refForwardMod.RefForward
}
