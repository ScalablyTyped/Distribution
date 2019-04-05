package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsCollection extends js.Object {
  // Inserts conversions.
  def batchinsert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ConversionsBatchInsertRequest,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ConversionsBatchInsertResponse
  // Updates existing conversions.
  def batchupdate(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ConversionsBatchUpdateRequest,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ConversionsBatchUpdateResponse
}

object ConversionsCollection {
  @scala.inline
  def apply(
    batchinsert: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ConversionsBatchInsertRequest, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ConversionsBatchInsertResponse,
    batchupdate: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ConversionsBatchUpdateRequest, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ConversionsBatchUpdateResponse
  ): ConversionsCollection = {
    val __obj = js.Dynamic.literal(batchinsert = js.Any.fromFunction2(batchinsert), batchupdate = js.Any.fromFunction2(batchupdate))
  
    __obj.asInstanceOf[ConversionsCollection]
  }
}

