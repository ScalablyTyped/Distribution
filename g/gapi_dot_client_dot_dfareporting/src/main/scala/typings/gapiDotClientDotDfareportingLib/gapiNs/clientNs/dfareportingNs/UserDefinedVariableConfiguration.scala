package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefinedVariableConfiguration extends js.Object {
  /** Data type for the variable. This is a required field. */
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User-friendly name for the variable which will appear in reports. This is a required field, must be less than 64 characters long, and cannot contain
    * the following characters: ""<>".
    */
  var reportName: js.UndefOr[java.lang.String] = js.undefined
  /** Variable name in the tag. This is a required field. */
  var variableType: js.UndefOr[java.lang.String] = js.undefined
}

