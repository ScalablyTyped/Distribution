package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ImportFile extends js.Object {
  /**
    * The contents of the file.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The name of the file.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$ImportFile {
  @scala.inline
  def apply(content: String = null, name: String = null): Schema$ImportFile = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImportFile]
  }
}

