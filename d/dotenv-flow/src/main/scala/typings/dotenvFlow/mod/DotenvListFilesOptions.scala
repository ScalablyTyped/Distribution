package typings.dotenvFlow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvListFilesOptions extends js.Object {
  /**
    * Node environment (development/test/production/etc,.).
    */
  var node_env: js.UndefOr[String] = js.undefined
}

object DotenvListFilesOptions {
  @scala.inline
  def apply(node_env: String = null): DotenvListFilesOptions = {
    val __obj = js.Dynamic.literal()
    if (node_env != null) __obj.updateDynamic("node_env")(node_env.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotenvListFilesOptions]
  }
}

