package typings.googleCloudStorage.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Versioning extends js.Object {
  var enabled: Boolean
}

object Versioning {
  @scala.inline
  def apply(enabled: Boolean): Versioning = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Versioning]
  }
}

