package typings.fluentuiReactComponentRef

import typings.fluentuiReactComponentRef.utilsMod.RefProps
import typings.react.mod.FunctionComponent
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/react-component-ref", "Ref")
  @js.native
  val Ref: FunctionComponent[RefProps] = js.native
  
  @JSImport("@fluentui/react-component-ref", "RefFindNode")
  @js.native
  class RefFindNode protected ()
    extends typings.fluentuiReactComponentRef.refFindNodeMod.RefFindNode {
    def this(props: RefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RefProps, context: js.Any) = this()
  }
  
  @JSImport("@fluentui/react-component-ref", "RefForward")
  @js.native
  class RefForward protected ()
    extends typings.fluentuiReactComponentRef.refForwardMod.RefForward {
    def this(props: RefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RefProps, context: js.Any) = this()
  }
  
  @JSImport("@fluentui/react-component-ref", "handleRef")
  @js.native
  def handleRef[N](ref: js.UndefOr[scala.Nothing], node: N): Unit = js.native
  @JSImport("@fluentui/react-component-ref", "handleRef")
  @js.native
  def handleRef[N](ref: js.Function1[/* instance */ N | Null, Unit], node: N): Unit = js.native
  @JSImport("@fluentui/react-component-ref", "handleRef")
  @js.native
  def handleRef[N](ref: Null, node: N): Unit = js.native
  @JSImport("@fluentui/react-component-ref", "handleRef")
  @js.native
  def handleRef[N](ref: RefObject[N], node: N): Unit = js.native
  
  @JSImport("@fluentui/react-component-ref", "isRefObject")
  @js.native
  def isRefObject(ref: js.Any): /* is react.react.RefObject<any> */ Boolean = js.native
}
