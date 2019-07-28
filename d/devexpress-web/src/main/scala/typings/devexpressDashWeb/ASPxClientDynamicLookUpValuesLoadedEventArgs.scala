package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DynamicLookUpValuesLoaded event.
  */
trait ASPxClientDynamicLookUpValuesLoadedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the dashboard parameter name whose values have been loaded.
    * Value: A string value that is the dashboard parameter name whose values have been loaded.
    */
  var ParameterName: String
}

object ASPxClientDynamicLookUpValuesLoadedEventArgs {
  @scala.inline
  def apply(ParameterName: String): ASPxClientDynamicLookUpValuesLoadedEventArgs = {
    val __obj = js.Dynamic.literal(ParameterName = ParameterName)
  
    __obj.asInstanceOf[ASPxClientDynamicLookUpValuesLoadedEventArgs]
  }
}

