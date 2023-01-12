package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeBooleans.`false`
import typings.devextreme.mod.DevExpress.ui.dxProgressBar.CompleteEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxProgressBarOptions
  extends StObject
     with dxTrackBarOptions[dxProgressBar] {
  
  /**
    * A function that is executed when the value reaches the maximum.
    */
  var onComplete: js.UndefOr[js.Function1[/* e */ CompleteEvent, Unit]] = js.undefined
  
  /**
    * Specifies whether or not the UI component displays a progress status.
    */
  var showStatus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a format for the progress status.
    */
  var statusFormat: js.UndefOr[String | (js.Function2[/* ratio */ Double, /* value */ Double, String])] = js.undefined
  
  /**
    * The current UI component value.
    */
  @JSName("value")
  var value_dxProgressBarOptions: js.UndefOr[Double | `false`] = js.undefined
}
object dxProgressBarOptions {
  
  inline def apply(): dxProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxProgressBarOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxProgressBarOptions] (val x: Self) extends AnyVal {
    
    inline def setOnComplete(value: /* e */ CompleteEvent => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setShowStatus(value: Boolean): Self = StObject.set(x, "showStatus", value.asInstanceOf[js.Any])
    
    inline def setShowStatusUndefined: Self = StObject.set(x, "showStatus", js.undefined)
    
    inline def setStatusFormat(value: String | (js.Function2[/* ratio */ Double, /* value */ Double, String])): Self = StObject.set(x, "statusFormat", value.asInstanceOf[js.Any])
    
    inline def setStatusFormatFunction2(value: (/* ratio */ Double, /* value */ Double) => String): Self = StObject.set(x, "statusFormat", js.Any.fromFunction2(value))
    
    inline def setStatusFormatUndefined: Self = StObject.set(x, "statusFormat", js.undefined)
    
    inline def setValue(value: Double | `false`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
