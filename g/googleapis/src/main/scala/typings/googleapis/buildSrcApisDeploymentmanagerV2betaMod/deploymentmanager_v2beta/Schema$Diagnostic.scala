package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Diagnostic extends js.Object {
  /**
    * JsonPath expression on the resource that if non empty, indicates that
    * this field needs to be extracted as a diagnostic.
    */
  var field: js.UndefOr[String] = js.native
  /**
    * Level to record this diagnostic.
    */
  var level: js.UndefOr[String] = js.native
}

object Schema$Diagnostic {
  @scala.inline
  def apply(field: String = null, level: String = null): Schema$Diagnostic = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Diagnostic]
  }
}

