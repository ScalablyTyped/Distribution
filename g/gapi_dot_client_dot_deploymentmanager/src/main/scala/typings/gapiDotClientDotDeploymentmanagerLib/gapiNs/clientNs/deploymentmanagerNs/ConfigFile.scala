package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigFile extends js.Object {
  /** The contents of the file. */
  var content: js.UndefOr[java.lang.String] = js.undefined
}

object ConfigFile {
  @scala.inline
  def apply(content: java.lang.String = null): ConfigFile = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[ConfigFile]
  }
}

