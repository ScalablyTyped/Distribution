package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the CustomizeParameterEditors events.
 */

trait ASPxClientCustomizeParameterEditorsEventArgs extends ASPxClientEventArgs {
  /**
       * Provides access to an object that stores information required to serialize a parameter editor.
       * Value: An ASPxDesignerElementSerializationInfo object.
       */
  var info: ASPxDesignerElementSerializationInfo
  /**
       * Provides access to an object that stores information about a parameter.
       * Value: An ASPxDesignerElementParameterDescriptor object.
       */
  var parameter: ASPxDesignerElementParameterDescriptor
}

