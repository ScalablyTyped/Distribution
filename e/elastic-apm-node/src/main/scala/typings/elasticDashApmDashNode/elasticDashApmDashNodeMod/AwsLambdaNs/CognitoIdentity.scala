package typings.elasticDashApmDashNode.elasticDashApmDashNodeMod.AwsLambdaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoIdentity extends js.Object {
  var cognitoIdentityId: String
  var cognitoIdentityPoolId: String
}

object CognitoIdentity {
  @scala.inline
  def apply(cognitoIdentityId: String, cognitoIdentityPoolId: String): CognitoIdentity = {
    val __obj = js.Dynamic.literal(cognitoIdentityId = cognitoIdentityId, cognitoIdentityPoolId = cognitoIdentityPoolId)
  
    __obj.asInstanceOf[CognitoIdentity]
  }
}

