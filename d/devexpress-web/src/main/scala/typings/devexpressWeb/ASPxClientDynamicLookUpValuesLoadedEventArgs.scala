package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DynamicLookUpValuesLoaded event.
  */
@js.native
trait ASPxClientDynamicLookUpValuesLoadedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the dashboard parameter name whose values have been loaded.
    */
  var ParameterName: String = js.native
}
object ASPxClientDynamicLookUpValuesLoadedEventArgs {
  
  @scala.inline
  def apply(ParameterName: String): ASPxClientDynamicLookUpValuesLoadedEventArgs = {
    val __obj = js.Dynamic.literal(ParameterName = ParameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDynamicLookUpValuesLoadedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDynamicLookUpValuesLoadedEventArgsMutableBuilder[Self <: ASPxClientDynamicLookUpValuesLoadedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterName(value: String): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
  }
}
