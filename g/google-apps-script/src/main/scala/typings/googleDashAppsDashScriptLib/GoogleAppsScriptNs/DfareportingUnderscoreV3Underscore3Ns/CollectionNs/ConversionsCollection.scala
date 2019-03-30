package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsCollection extends js.Object {
  // Inserts conversions.
  def batchinsert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.ConversionsBatchInsertRequest,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.ConversionsBatchInsertResponse
  // Updates existing conversions.
  def batchupdate(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.ConversionsBatchUpdateRequest,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.ConversionsBatchUpdateResponse
}

object ConversionsCollection {
  @scala.inline
  def apply(
    batchinsert: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.ConversionsBatchInsertRequest, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.ConversionsBatchInsertResponse,
    batchupdate: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.ConversionsBatchUpdateRequest, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs.ConversionsBatchUpdateResponse
  ): ConversionsCollection = {
    val __obj = js.Dynamic.literal(batchinsert = js.Any.fromFunction2(batchinsert), batchupdate = js.Any.fromFunction2(batchupdate))
  
    __obj.asInstanceOf[ConversionsCollection]
  }
}

