package typings.devexpressWeb.global

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateNavigator.VisibleMonthChanged event.
  */
@JSGlobal("ASPxClientDateNavigatorVisibleMonthChangedEventArgs")
@js.native
class ASPxClientDateNavigatorVisibleMonthChangedEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDateNavigatorVisibleMonthChangedEventArgs {
  
  /**
    * Returns the end date of the latest visible month.
    */
  /* CompleteClass */
  var endDate: Date = js.native
  
  /**
    * Returns the start date of the latest visible month.
    */
  /* CompleteClass */
  var startDate: Date = js.native
}
