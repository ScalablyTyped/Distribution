package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigFile extends js.Object {
  /** The contents of the file. */
  var content: js.UndefOr[String] = js.undefined
}

object ConfigFile {
  @scala.inline
  def apply(content: String = null): ConfigFile = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[ConfigFile]
  }
}

