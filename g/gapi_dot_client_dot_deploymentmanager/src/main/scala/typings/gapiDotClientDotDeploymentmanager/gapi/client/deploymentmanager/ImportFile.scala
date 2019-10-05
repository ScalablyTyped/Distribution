package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportFile extends js.Object {
  /** The contents of the file. */
  var content: js.UndefOr[String] = js.undefined
  /** The name of the file. */
  var name: js.UndefOr[String] = js.undefined
}

object ImportFile {
  @scala.inline
  def apply(content: String = null, name: String = null): ImportFile = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ImportFile]
  }
}

