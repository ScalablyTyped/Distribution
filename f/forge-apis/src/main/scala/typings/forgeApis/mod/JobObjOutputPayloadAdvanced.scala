package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobObjOutputPayloadAdvanced extends js.Object {
  var exportFileStructure: js.UndefOr[String] = js.undefined
  var modelGuid: js.UndefOr[String] = js.undefined
  var objectIds: js.UndefOr[js.Array[String]] = js.undefined
}

object JobObjOutputPayloadAdvanced {
  @scala.inline
  def apply(exportFileStructure: String = null, modelGuid: String = null, objectIds: js.Array[String] = null): JobObjOutputPayloadAdvanced = {
    val __obj = js.Dynamic.literal()
    if (exportFileStructure != null) __obj.updateDynamic("exportFileStructure")(exportFileStructure.asInstanceOf[js.Any])
    if (modelGuid != null) __obj.updateDynamic("modelGuid")(modelGuid.asInstanceOf[js.Any])
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobObjOutputPayloadAdvanced]
  }
}

