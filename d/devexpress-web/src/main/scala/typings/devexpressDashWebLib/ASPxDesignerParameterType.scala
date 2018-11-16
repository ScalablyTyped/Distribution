package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides information about a report parameter type.
 */

trait ASPxDesignerParameterType extends js.Object {
  /**
       * Provides access to the default value for parameters of the current type.
       * Value: An object that specifies the default value.
       */
  var defaultVal: js.Object
  /**
       * Provides access to a text displayed to end-users when creating parameters of the current type.
       * Value: A string displayed to end-users.
       */
  var displayValue: java.lang.String
  /**
       * Provides access to the specifics of a current parameter type.
       * Value: Parameter type specifics.
       */
  var specifics: java.lang.String
  /**
       * Provides access to an actual parameter type.
       * Value: A string that specifies the parameter type.
       */
  var value: java.lang.String
  /**
       * Converts the specified parameter value to the current parameter type.
       * @param val An object that specifies the parameter value to be converted.
       */
  def valueConverter(`val`: js.Object): js.Object
}

