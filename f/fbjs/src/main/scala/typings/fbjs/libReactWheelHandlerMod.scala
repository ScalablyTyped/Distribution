package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReactWheelHandlerMod {
  
  @JSImport("fbjs/lib/ReactWheelHandler", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ReactWheelHandler {
    def this(
      // tslint:disable-next-line:ban-types
    onWheel: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollX: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollY: js.Function
    ) = this()
    def this(
      // tslint:disable-next-line:ban-types
    onWheel: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollX: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollY: Boolean
    ) = this()
    def this(
      // tslint:disable-next-line:ban-types
    onWheel: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollX: Boolean,
      // tslint:disable-next-line:ban-types
    handleScrollY: js.Function
    ) = this()
    /**
      * onWheel is the callback that will be called with right frame rate if
      * any wheel events happened
      * onWheel should is to be called with two arguments: deltaX and deltaY in
      * this order
      */
    def this(
      // tslint:disable-next-line:ban-types
    onWheel: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollX: Boolean,
      // tslint:disable-next-line:ban-types
    handleScrollY: Boolean
    ) = this()
    def this(
      // tslint:disable-next-line:ban-types
    onWheel: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollX: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollY: js.Function,
      // tslint:disable-next-line:ban-types
    stopPropagation: js.Function
    ) = this()
    def this(
      // tslint:disable-next-line:ban-types
    onWheel: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollX: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollY: js.Function,
      // tslint:disable-next-line:ban-types
    stopPropagation: Boolean
    ) = this()
    def this(
      // tslint:disable-next-line:ban-types
    onWheel: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollX: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollY: Boolean,
      // tslint:disable-next-line:ban-types
    stopPropagation: js.Function
    ) = this()
    def this(
      // tslint:disable-next-line:ban-types
    onWheel: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollX: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollY: Boolean,
      // tslint:disable-next-line:ban-types
    stopPropagation: Boolean
    ) = this()
    def this(
      // tslint:disable-next-line:ban-types
    onWheel: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollX: Boolean,
      // tslint:disable-next-line:ban-types
    handleScrollY: js.Function,
      // tslint:disable-next-line:ban-types
    stopPropagation: js.Function
    ) = this()
    def this(
      // tslint:disable-next-line:ban-types
    onWheel: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollX: Boolean,
      // tslint:disable-next-line:ban-types
    handleScrollY: js.Function,
      // tslint:disable-next-line:ban-types
    stopPropagation: Boolean
    ) = this()
    def this(
      // tslint:disable-next-line:ban-types
    onWheel: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollX: Boolean,
      // tslint:disable-next-line:ban-types
    handleScrollY: Boolean,
      // tslint:disable-next-line:ban-types
    stopPropagation: js.Function
    ) = this()
    def this(
      // tslint:disable-next-line:ban-types
    onWheel: js.Function,
      // tslint:disable-next-line:ban-types
    handleScrollX: Boolean,
      // tslint:disable-next-line:ban-types
    handleScrollY: Boolean,
      // tslint:disable-next-line:ban-types
    stopPropagation: Boolean
    ) = this()
    
    /* CompleteClass */
    override def _didWheel(): Unit = js.native
    
    /* CompleteClass */
    override def onWheel(event: Any): Unit = js.native
  }
  
  trait ReactWheelHandler extends StObject {
    
    def _didWheel(): Unit
    
    def onWheel(event: Any): Unit
  }
  object ReactWheelHandler {
    
    inline def apply(_didWheel: () => Unit, onWheel: Any => Unit): ReactWheelHandler = {
      val __obj = js.Dynamic.literal(_didWheel = js.Any.fromFunction0(_didWheel), onWheel = js.Any.fromFunction1(onWheel))
      __obj.asInstanceOf[ReactWheelHandler]
    }
    
    extension [Self <: ReactWheelHandler](x: Self) {
      
      inline def setOnWheel(value: Any => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def set_didWheel(value: () => Unit): Self = StObject.set(x, "_didWheel", js.Any.fromFunction0(value))
    }
  }
}
