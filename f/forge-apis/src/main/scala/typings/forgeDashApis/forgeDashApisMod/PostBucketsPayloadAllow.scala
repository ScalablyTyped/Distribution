package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostBucketsPayloadAllow extends js.Object {
  var access: String
  var authId: String
}

object PostBucketsPayloadAllow {
  @scala.inline
  def apply(access: String, authId: String): PostBucketsPayloadAllow = {
    val __obj = js.Dynamic.literal(access = access, authId = authId)
  
    __obj.asInstanceOf[PostBucketsPayloadAllow]
  }
}

