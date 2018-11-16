package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides information about a serialized property's value editor used in the Property Grid.
 */

trait ASPxDesignerElementEditor extends js.Object {
  /**
       * Gets a nullable value, specifying the name of an HTML template used by a complex object's editor.
       * Value: A String value.
       */
  var content: java.lang.String
  /**
       * Gets a nullable value, specifying the type of the editor's model.
       * Value: A Object value.
       */
  var editorType: js.Object
  /**
       * Gets additional options for <a href="https://js.devexpress.com/Documentation/Overview/">DevExtreme</a> UI widgets.
       * Value: An object that provides editor options.
       */
  var extendedOptions: js.Object
  /**
       * Gets the name of an HTML template specifying the editor and header of a complex object (i.e., an object having its content properties specified).
       * Value: A String value.
       */
  var header: java.lang.String
}

