package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a predicate.
  */
@js.native
trait Schema$Condition extends js.Object {
  /**
    * A list of named parameters (key/value), depending on the condition&#39;s
    * type. Notes:  - For binary operators, include parameters named arg0 and
    * arg1 for specifying the left and right operands, respectively.  - At this
    * time, the left operand (arg0) must be a reference to a variable.  - For
    * case-insensitive Regex matching, include a boolean parameter named
    * ignore_case that is set to true. If not specified or set to any other
    * value, the matching will be case sensitive.  - To negate an operator,
    * include a boolean parameter named negate boolean parameter that is set to
    * true.
    */
  var parameter: js.UndefOr[js.Array[Schema$Parameter]] = js.native
  /**
    * The type of operator for this condition.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Condition {
  @scala.inline
  def apply(parameter: js.Array[Schema$Parameter] = null, `type`: String = null): Schema$Condition = {
    val __obj = js.Dynamic.literal()
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Condition]
  }
}

