package typings.electronJsonStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataOptions extends js.Object {
  var dataPath: String
}

object DataOptions {
  @scala.inline
  def apply(dataPath: String): DataOptions = {
    val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOptions]
  }
}

