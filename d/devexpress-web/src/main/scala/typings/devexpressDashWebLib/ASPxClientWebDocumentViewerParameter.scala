package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides general information about a report parameter on the client-side of the Web Document Viewer.
  */
trait ASPxClientWebDocumentViewerParameter extends js.Object {
  /**
    * Provides access to a value that specifies whether or not a parameter can have multiple values.
    * Value: true, if a parameter can have multiple values; otherwise, false.
    */
  var isMultiValue: scala.Boolean
  /**
    * Provides access to a report parameter's value type.
    * Value: An object that specifies the report parameter type.
    */
  var `type`: js.Object
  /**
    * Provides access to the current value of a report parameter.
    * Value: An object that specifies the report parameter's current value.
    */
  var value: js.Object
  /**
    * Returns an object that provides general information about a report parameter.
    */
  def getParameterDescriptor(): ASPxDesignerElementParameterDescriptor
}

object ASPxClientWebDocumentViewerParameter {
  @scala.inline
  def apply(
    getParameterDescriptor: () => ASPxDesignerElementParameterDescriptor,
    isMultiValue: scala.Boolean,
    `type`: js.Object,
    value: js.Object
  ): ASPxClientWebDocumentViewerParameter = {
    val __obj = js.Dynamic.literal(getParameterDescriptor = js.Any.fromFunction0(getParameterDescriptor), isMultiValue = isMultiValue, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ASPxClientWebDocumentViewerParameter]
  }
}

