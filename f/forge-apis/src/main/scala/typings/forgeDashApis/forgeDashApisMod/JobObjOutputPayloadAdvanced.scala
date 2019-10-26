package typings.forgeDashApis.forgeDashApisMod

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
    if (exportFileStructure != null) __obj.updateDynamic("exportFileStructure")(exportFileStructure)
    if (modelGuid != null) __obj.updateDynamic("modelGuid")(modelGuid)
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds)
    __obj.asInstanceOf[JobObjOutputPayloadAdvanced]
  }
}

