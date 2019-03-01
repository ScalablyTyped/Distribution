package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportFile extends js.Object {
  /** The contents of the file. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the file. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ImportFile {
  @scala.inline
  def apply(content: java.lang.String = null, name: java.lang.String = null): ImportFile = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ImportFile]
  }
}

