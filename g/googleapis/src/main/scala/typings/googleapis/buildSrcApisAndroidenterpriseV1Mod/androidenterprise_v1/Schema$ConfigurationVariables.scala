package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration variables resource contains the managed configuration
  * settings ID to be applied to a single user, as well as the variable set
  * that is attributed to the user. The variable set will be used to replace
  * placeholders in the managed configuration settings.
  */
@js.native
trait Schema$ConfigurationVariables extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#configurationVariables&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the managed configurations settings.
    */
  var mcmId: js.UndefOr[String] = js.native
  /**
    * The variable set that is attributed to the user.
    */
  var variableSet: js.UndefOr[js.Array[Schema$VariableSet]] = js.native
}

object Schema$ConfigurationVariables {
  @scala.inline
  def apply(kind: String = null, mcmId: String = null, variableSet: js.Array[Schema$VariableSet] = null): Schema$ConfigurationVariables = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mcmId != null) __obj.updateDynamic("mcmId")(mcmId.asInstanceOf[js.Any])
    if (variableSet != null) __obj.updateDynamic("variableSet")(variableSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConfigurationVariables]
  }
}

