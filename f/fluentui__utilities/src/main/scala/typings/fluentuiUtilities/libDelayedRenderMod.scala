package typings.fluentuiUtilities

import typings.fluentuiUtilities.anon.Delay
import typings.fluentuiUtilities.libReactDottypesMod.IReactProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDelayedRenderMod {
  
  @JSImport("@fluentui/utilities/lib/DelayedRender", "DelayedRender")
  @js.native
  open class DelayedRender protected () extends Component[IDelayedRenderProps, IDelayedRenderState, Any] {
    def this(props: IDelayedRenderProps) = this()
    
    /* private */ var _timeoutId: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDelayedRender(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDelayedRender(): Unit = js.native
  }
  /* static members */
  object DelayedRender {
    
    @JSImport("@fluentui/utilities/lib/DelayedRender", "DelayedRender")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fluentui/utilities/lib/DelayedRender", "DelayedRender.defaultProps")
    @js.native
    def defaultProps: Delay = js.native
    inline def defaultProps_=(x: Delay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IDelayedRenderProps
    extends StObject
       with IReactProps[js.Object] {
    
    /**
      * Number of milliseconds to delay rendering children.
      */
    var delay: js.UndefOr[Double] = js.undefined
  }
  object IDelayedRenderProps {
    
    inline def apply(): IDelayedRenderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDelayedRenderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDelayedRenderProps] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  trait IDelayedRenderState extends StObject {
    
    /**
      * Whether the component is rendered or not.
      */
    var isRendered: Boolean
  }
  object IDelayedRenderState {
    
    inline def apply(isRendered: Boolean): IDelayedRenderState = {
      val __obj = js.Dynamic.literal(isRendered = isRendered.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDelayedRenderState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDelayedRenderState] (val x: Self) extends AnyVal {
      
      inline def setIsRendered(value: Boolean): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
    }
  }
}
