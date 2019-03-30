package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetsCollection extends js.Object {
  // Returns the dataset specified by datasetID.
  def get(projectId: java.lang.String, datasetId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs.Dataset = js.native
  // Creates a new empty dataset.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs.Dataset,
    projectId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs.Dataset = js.native
  // Lists all datasets in the specified project to which you have been granted the READER dataset role.
  def list(projectId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs.DatasetList = js.native
  // Lists all datasets in the specified project to which you have been granted the READER dataset role.
  def list(projectId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs.DatasetList = js.native
  // Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted dataset resource. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs.Dataset,
    projectId: java.lang.String,
    datasetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs.Dataset = js.native
  // Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying deleteContents. Immediately after deletion, you can create another dataset with the same name.
  def remove(projectId: java.lang.String, datasetId: java.lang.String): scala.Unit = js.native
  // Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying deleteContents. Immediately after deletion, you can create another dataset with the same name.
  def remove(projectId: java.lang.String, datasetId: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted dataset resource.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs.Dataset,
    projectId: java.lang.String,
    datasetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs.Dataset = js.native
}

