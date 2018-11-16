package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides information about a toolbox control item.
 */

trait ASPxDesignerToolboxItem extends js.Object {
  /**
       * Provides access to the default property values used for a toolbox control.
       * Value: An object that specifies default propery values.
       */
  var defaultVal: js.Object
  /**
       * Provides access to information required to serialize a toolbox control.
       * Value: An array of ASPxDesignerElementSerializationInfo objects that provide information required to serialize an element.
       */
  var info: js.Array[ASPxDesignerElementSerializationInfo]
  /**
       * Gets whether a control item is displayed in a toolbox.
       * Value: true, if the control is available in the toolbox; otherwise, false.
       */
  var isToolboxItem: scala.Boolean
  /**
       * Provides access to popular properties of a toolbox control.
       * Value: An array of strings that specify names of popular properties.
       */
  var popularProperties: js.Array[java.lang.String]
  /**
       * Provides access to a surface type of toolbox control.
       * Value: A surface type of toolbox control.
       */
  var surfaceType: js.Any
  /**
       * Provides access to a zero-based index of a control in the toolbox.
       * Value: An integer value that specifies a control index in the toolbox.
       */
  var toolboxIndex: scala.Double
  /**
       * Provides access to a toolbox control type.
       * Value: A toolbox control type.
       */
  var `type`: js.Any
}

