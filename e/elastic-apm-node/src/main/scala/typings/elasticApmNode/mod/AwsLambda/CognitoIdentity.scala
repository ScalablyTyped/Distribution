package typings.elasticApmNode.mod.AwsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoIdentity extends js.Object {
  var cognitoIdentityId: String = js.native
  var cognitoIdentityPoolId: String = js.native
}

object CognitoIdentity {
  @scala.inline
  def apply(cognitoIdentityId: String, cognitoIdentityPoolId: String): CognitoIdentity = {
    val __obj = js.Dynamic.literal(cognitoIdentityId = cognitoIdentityId.asInstanceOf[js.Any], cognitoIdentityPoolId = cognitoIdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoIdentity]
  }
  @scala.inline
  implicit class CognitoIdentityOps[Self <: CognitoIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCognitoIdentityId(value: String): Self = this.set("cognitoIdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCognitoIdentityPoolId(value: String): Self = this.set("cognitoIdentityPoolId", value.asInstanceOf[js.Any])
  }
  
}

