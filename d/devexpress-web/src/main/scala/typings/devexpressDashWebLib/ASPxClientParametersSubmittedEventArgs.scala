package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the PreviewParametersSubmitted events.
 */

trait ASPxClientParametersSubmittedEventArgs extends ASPxClientEventArgs {
  /**
       * Provides access to report parameters and their submitted values.
       * Value: A dictionary containing the parameter names along with their values.
       */
  var Parameters: org.scalablytyped.runtime.StringDictionary[js.Object]
  /**
       * Provides access to a View Model for report parameters.
       * Value: A View Model object.
       */
  var ParametersViewModel: js.Object
}

