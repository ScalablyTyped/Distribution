package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the PreviewParametersReset events.
 */

trait ASPxClientParametersResetEventArgs extends ASPxClientEventArgs {
  /**
       * Provides access to report parameters whose values have been reset.
       * Value: An ASPxClientWebDocumentViewerParameter array.
       */
  var Parameters: js.Array[ASPxClientWebDocumentViewerParameter]
  /**
       * Provides access to a View Model for report parameters.
       * Value: A View Model object.
       */
  var ParametersViewModel: js.Object
}

