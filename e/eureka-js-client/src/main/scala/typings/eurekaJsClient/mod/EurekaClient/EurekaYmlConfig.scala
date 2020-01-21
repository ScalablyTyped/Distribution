package typings.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EurekaYmlConfig extends js.Object {
  var cwd: String
  var filename: js.UndefOr[String] = js.undefined
}

object EurekaYmlConfig {
  @scala.inline
  def apply(cwd: String, filename: String = null): EurekaYmlConfig = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[EurekaYmlConfig]
  }
}

