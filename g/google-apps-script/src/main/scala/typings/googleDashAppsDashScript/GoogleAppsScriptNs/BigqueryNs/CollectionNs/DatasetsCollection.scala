package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Dataset
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.DatasetList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetsCollection extends js.Object {
  // Returns the dataset specified by datasetID.
  def get(projectId: String, datasetId: String): Dataset = js.native
  // Creates a new empty dataset.
  def insert(resource: Dataset, projectId: String): Dataset = js.native
  // Lists all datasets in the specified project to which you have been granted the READER dataset role.
  def list(projectId: String): DatasetList = js.native
  // Lists all datasets in the specified project to which you have been granted the READER dataset role.
  def list(projectId: String, optionalArgs: js.Object): DatasetList = js.native
  // Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted dataset resource. This method supports patch semantics.
  def patch(resource: Dataset, projectId: String, datasetId: String): Dataset = js.native
  // Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying deleteContents. Immediately after deletion, you can create another dataset with the same name.
  def remove(projectId: String, datasetId: String): Unit = js.native
  // Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying deleteContents. Immediately after deletion, you can create another dataset with the same name.
  def remove(projectId: String, datasetId: String, optionalArgs: js.Object): Unit = js.native
  // Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted dataset resource.
  def update(resource: Dataset, projectId: String, datasetId: String): Dataset = js.native
}

