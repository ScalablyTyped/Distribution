package typings.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableLoggingOptions extends js.Object {
  var bucket: js.UndefOr[String | Bucket] = js.undefined
  var prefix: String
}

object EnableLoggingOptions {
  @scala.inline
  def apply(prefix: String, bucket: String | Bucket = null): EnableLoggingOptions = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableLoggingOptions]
  }
}

