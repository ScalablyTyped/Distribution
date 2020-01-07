package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ConfigFile extends js.Object {
  /**
    * The contents of the file.
    */
  var content: js.UndefOr[String] = js.native
}

object Schema$ConfigFile {
  @scala.inline
  def apply(content: String = null): Schema$ConfigFile = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConfigFile]
  }
}

