package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostBucketsSigned extends js.Object {
  var minutesExpiration: Double
}

object PostBucketsSigned {
  @scala.inline
  def apply(minutesExpiration: Double): PostBucketsSigned = {
    val __obj = js.Dynamic.literal(minutesExpiration = minutesExpiration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBucketsSigned]
  }
}

