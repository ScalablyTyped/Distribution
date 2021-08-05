package typings.devextreme.mod

import typings.devextreme.mod.DevExpress.events.event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  trait JQuery extends StObject
  
  trait JQueryEventObject
    extends StObject
       with event {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
  }
  object JQueryEventObject {
    
    inline def apply(): JQueryEventObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JQueryEventObject]
    }
    
    extension [Self <: JQueryEventObject](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    }
  }
  
  trait JQueryPromise[T] extends StObject
  
  @js.native
  trait Promise[T] extends StObject {
    
    def `then`[TResult1, TResult2](): Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function2[/* value */ T, /* extraParameters */ T, TResult1 | js.Thenable[TResult1]]
    ): Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function2[/* value */ T, /* extraParameters */ T, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): Promise[TResult1 | TResult2] = js.native
  }
}
