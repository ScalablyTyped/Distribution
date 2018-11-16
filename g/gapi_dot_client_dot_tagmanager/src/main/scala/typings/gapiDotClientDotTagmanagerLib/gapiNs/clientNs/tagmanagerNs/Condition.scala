package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Condition extends js.Object {
  /**
               * A list of named parameters (key/value), depending on the condition's type. Notes:
               * - For binary operators, include parameters named arg0 and arg1 for specifying the left and right operands, respectively.
               * - At this time, the left operand (arg0) must be a reference to a variable.
               * - For case-insensitive Regex matching, include a boolean parameter named ignore_case that is set to true. If not specified or set to any other value,
               * the matching will be case sensitive.
               * - To negate an operator, include a boolean parameter named negate boolean parameter that is set to true.
               */
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  /** The type of operator for this condition. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

