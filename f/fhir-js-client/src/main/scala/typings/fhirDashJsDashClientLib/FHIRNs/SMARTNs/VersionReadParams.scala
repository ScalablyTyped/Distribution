package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameter to be passed to the vread API method
  */
trait VersionReadParams extends ReadParams {
  /**
    * Version ID of the resource to be fetched
    */
  var versionId: java.lang.String
}

object VersionReadParams {
  @scala.inline
  def apply(id: java.lang.String, `type`: java.lang.String, versionId: java.lang.String): VersionReadParams = {
    val __obj = js.Dynamic.literal(id = id, versionId = versionId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VersionReadParams]
  }
}

