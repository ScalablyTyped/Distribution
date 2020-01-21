package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A variable set is a key-value pair of EMM-provided placeholders and its
  * corresponding value, which is attributed to a user. For example, $FIRSTNAME
  * could be a placeholder, and its value could be Alice. Placeholders should
  * start with a &#39;$&#39; sign and should be alphanumeric only.
  */
@js.native
trait SchemaVariableSet extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#variableSet&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The placeholder string; defined by EMM.
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * The value of the placeholder, specific to the user.
    */
  var userValue: js.UndefOr[String] = js.native
}

object SchemaVariableSet {
  @scala.inline
  def apply(kind: String = null, placeholder: String = null, userValue: String = null): SchemaVariableSet = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (userValue != null) __obj.updateDynamic("userValue")(userValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVariableSet]
  }
}

