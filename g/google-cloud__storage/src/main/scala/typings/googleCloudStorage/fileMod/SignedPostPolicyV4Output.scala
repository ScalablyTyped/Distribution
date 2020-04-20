package typings.googleCloudStorage.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedPostPolicyV4Output extends js.Object {
  var fields: PolicyFields
  var url: String
}

object SignedPostPolicyV4Output {
  @scala.inline
  def apply(fields: PolicyFields, url: String): SignedPostPolicyV4Output = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedPostPolicyV4Output]
  }
}

