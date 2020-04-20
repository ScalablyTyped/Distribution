package typings.googleCloudStorage.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketI extends js.Object {
  var name: String
}

object BucketI {
  @scala.inline
  def apply(name: String): BucketI = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketI]
  }
}

