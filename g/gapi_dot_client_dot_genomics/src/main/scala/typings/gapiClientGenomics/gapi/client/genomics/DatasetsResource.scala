package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGenomics.AnonAccesstoken
import typings.gapiClientGenomics.AnonAccesstokenAltBearertokenCallback
import typings.gapiClientGenomics.AnonAccesstokenAltBearertokenCallbackDatasetId
import typings.gapiClientGenomics.AnonAccesstokenAltBearertokenCallbackFields
import typings.gapiClientGenomics.AnonAccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetsResource extends js.Object {
  /**
    * Creates a new dataset.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def create(request: AnonAccesstoken): Request_[Dataset]
  /**
    * Deletes a dataset and all of its contents (all read group sets,
    * reference sets, variant sets, call sets, annotation sets, etc.)
    * This is reversible (up to one week after the deletion) via
    * the
    * datasets.undelete
    * operation.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: AnonAccesstokenAltBearertokenCallback): Request_[js.Object]
  /**
    * Gets a dataset by ID.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: AnonAccesstokenAltBearertokenCallback): Request_[Dataset]
  /**
    * Gets the access control policy for the dataset. This is empty if the
    * policy or resource does not exist.
    *
    * See <a href="/iam/docs/managing-policies#getting_a_policy">Getting a
    * Policy</a> for more information.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def getIamPolicy(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Policy]
  /**
    * Lists datasets within a project.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[ListDatasetsResponse]
  /**
    * Updates a dataset.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics.
    */
  def patch(request: AnonAccesstokenAltBearertokenCallbackDatasetId): Request_[Dataset]
  /**
    * Sets the access control policy on the specified dataset. Replaces any
    * existing policy.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * See <a href="/iam/docs/managing-policies#setting_a_policy">Setting a
    * Policy</a> for more information.
    */
  def setIamPolicy(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * See <a href="/iam/docs/managing-policies#testing_permissions">Testing
    * Permissions</a> for more information.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def testIamPermissions(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[TestIamPermissionsResponse]
  /**
    * Undeletes a dataset by restoring a dataset which was deleted via this API.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This operation is only possible for a week after the deletion occurred.
    */
  def undelete(request: AnonAccesstokenAltBearertokenCallback): Request_[Dataset]
}

object DatasetsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[Dataset],
    delete: AnonAccesstokenAltBearertokenCallback => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallback => Request_[Dataset],
    getIamPolicy: AnonAccesstokenAltBearertokenCallbackFields => Request_[Policy],
    list: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[ListDatasetsResponse],
    patch: AnonAccesstokenAltBearertokenCallbackDatasetId => Request_[Dataset],
    setIamPolicy: AnonAccesstokenAltBearertokenCallbackFields => Request_[Policy],
    testIamPermissions: AnonAccesstokenAltBearertokenCallbackFields => Request_[TestIamPermissionsResponse],
    undelete: AnonAccesstokenAltBearertokenCallback => Request_[Dataset]
  ): DatasetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), undelete = js.Any.fromFunction1(undelete))
  
    __obj.asInstanceOf[DatasetsResource]
  }
}

