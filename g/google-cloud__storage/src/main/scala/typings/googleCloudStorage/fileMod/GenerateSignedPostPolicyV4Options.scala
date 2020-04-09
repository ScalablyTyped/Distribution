package typings.googleCloudStorage.fileMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateSignedPostPolicyV4Options extends js.Object {
  var bucketBoundHostname: js.UndefOr[String] = js.undefined
  var conditions: js.UndefOr[js.Array[js.Object]] = js.undefined
  var expires: String | Double | Date
  var fields: js.UndefOr[PolicyFields] = js.undefined
  var virtualHostedStyle: js.UndefOr[Boolean] = js.undefined
}

object GenerateSignedPostPolicyV4Options {
  @scala.inline
  def apply(
    expires: String | Double | Date,
    bucketBoundHostname: String = null,
    conditions: js.Array[js.Object] = null,
    fields: PolicyFields = null,
    virtualHostedStyle: js.UndefOr[Boolean] = js.undefined
  ): GenerateSignedPostPolicyV4Options = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    if (bucketBoundHostname != null) __obj.updateDynamic("bucketBoundHostname")(bucketBoundHostname.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualHostedStyle)) __obj.updateDynamic("virtualHostedStyle")(virtualHostedStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateSignedPostPolicyV4Options]
  }
}

