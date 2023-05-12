package typings.fluentuiReactComponentRef

import typings.fluentuiReactComponentRef.distEsRefMod.RefProps
import typings.fluentuiReactComponentRef.distEsRefMod.RefState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/react-component-ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/react-component-ref", "Ref")
  @js.native
  open class Ref protected ()
    extends typings.fluentuiReactComponentRef.distEsRefMod.Ref {
    def this(props: RefProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: RefProps, context: Any) = this()
  }
  /* static members */
  object Ref {
    
    @JSImport("@fluentui/react-component-ref", "Ref")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(props: RefProps): RefState = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any]).asInstanceOf[RefState]
  }
  
  inline def handleRef[N](ref: Unit, node: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def handleRef[N](ref: typings.react.mod.Ref[N], node: N): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isRefObject(ref: Any): /* is react.react.RefObject<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefObject")(ref.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.RefObject<any> */ Boolean]
}
