package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGenomics.anon.Accesstoken
import typings.gapiClientGenomics.anon.DatasetId
import typings.gapiClientGenomics.anon.Fields
import typings.gapiClientGenomics.anon.Key
import typings.gapiClientGenomics.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetsResource extends js.Object {
  /**
    * Creates a new dataset.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def create(request: Accesstoken): Request[Dataset] = js.native
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
  def delete(request: DatasetId): Request[js.Object] = js.native
  /**
    * Gets a dataset by ID.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: DatasetId): Request[Dataset] = js.native
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
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  /**
    * Lists datasets within a project.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def list(request: Key): Request[ListDatasetsResponse] = js.native
  /**
    * Updates a dataset.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics.
    */
  def patch(request: Oauthtoken): Request[Dataset] = js.native
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
  def setIamPolicy(request: Fields): Request[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * See <a href="/iam/docs/managing-policies#testing_permissions">Testing
    * Permissions</a> for more information.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def testIamPermissions(request: Fields): Request[TestIamPermissionsResponse] = js.native
  /**
    * Undeletes a dataset by restoring a dataset which was deleted via this API.
    *
    * For the definitions of datasets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This operation is only possible for a week after the deletion occurred.
    */
  def undelete(request: DatasetId): Request[Dataset] = js.native
}

object DatasetsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[Dataset],
    delete: DatasetId => Request[js.Object],
    get: DatasetId => Request[Dataset],
    getIamPolicy: Fields => Request[Policy],
    list: Key => Request[ListDatasetsResponse],
    patch: Oauthtoken => Request[Dataset],
    setIamPolicy: Fields => Request[Policy],
    testIamPermissions: Fields => Request[TestIamPermissionsResponse],
    undelete: DatasetId => Request[Dataset]
  ): DatasetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), undelete = js.Any.fromFunction1(undelete))
    __obj.asInstanceOf[DatasetsResource]
  }
  @scala.inline
  implicit class DatasetsResourceOps[Self <: DatasetsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Accesstoken => Request[Dataset]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: DatasetId => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: DatasetId => Request[Dataset]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIamPolicy(value: Fields => Request[Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[ListDatasetsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Oauthtoken => Request[Dataset]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIamPolicy(value: Fields => Request[Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setTestIamPermissions(value: Fields => Request[TestIamPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
    @scala.inline
    def setUndelete(value: DatasetId => Request[Dataset]): Self = this.set("undelete", js.Any.fromFunction1(value))
  }
  
}

