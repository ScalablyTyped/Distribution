package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudresourcemanager.AnonAccesstoken
import typings.gapiClientCloudresourcemanager.AnonAccesstokenAlt
import typings.gapiClientCloudresourcemanager.AnonAccesstokenAltBearertokenCallbackFields
import typings.gapiClientCloudresourcemanager.AnonAccesstokenAltBearertokenCallbackFieldsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Clears a `Policy` from a resource. */
  def clearOrgPolicy(request: AnonAccesstoken): Request_[js.Object]
  /**
    * Request that a new Project be created. The result is an Operation which
    * can be used to track the creation process. It is automatically deleted
    * after a few hours, so there is no need to call DeleteOperation.
    *
    * Our SLO permits Project creation to take up to 30 seconds at the 90th
    * percentile. As of 2016-08-29, we are observing 6 seconds 50th percentile
    * latency. 95th percentile latency is around 11 seconds. We recommend
    * polling at the 5th second with an exponential backoff.
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.projects.create` on the specified parent for the new
    * project.
    */
  def create(request: AnonAccesstokenAlt): Request_[Operation]
  /**
    * Marks the Project identified by the specified
    * `project_id` (for example, `my-project-123`) for deletion.
    * This method will only affect the Project if the following criteria are met:
    *
    * + The Project does not have a billing account associated with it.
    * + The Project has a lifecycle state of
    * ACTIVE.
    *
    * This method changes the Project's lifecycle state from
    * ACTIVE
    * to DELETE_REQUESTED.
    * The deletion starts at an unspecified time,
    * at which point the Project is no longer accessible.
    *
    * Until the deletion completes, you can check the lifecycle state
    * checked by retrieving the Project with GetProject,
    * and the Project remains visible to ListProjects.
    * However, you cannot update the project.
    *
    * After the deletion completes, the Project is not retrievable by
    * the  GetProject and
    * ListProjects methods.
    *
    * The caller must have modify permissions for this Project.
    */
  def delete(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[js.Object]
  /**
    * Retrieves the Project identified by the specified
    * `project_id` (for example, `my-project-123`).
    *
    * The caller must have read permissions for this Project.
    */
  def get(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Project]
  /**
    * Gets a list of ancestors in the resource hierarchy for the Project
    * identified by the specified `project_id` (for example, `my-project-123`).
    *
    * The caller must have read permissions for this Project.
    */
  def getAncestry(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[GetAncestryResponse]
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging
    * `Policies` in the resource hierarchy. The returned `Policy` will not have
    * an `etag`set because it is a computed `Policy` across multiple resources.
    */
  def getEffectiveOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy]
  /**
    * Returns the IAM access control policy for the specified Project.
    * Permission is denied if the policy or the resource does not exist.
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.projects.getIamPolicy` on the project
    */
  def getIamPolicy(request: AnonAccesstoken): Request_[Policy]
  /**
    * Gets a `Policy` on a resource.
    *
    * If no `Policy` is set on the resource, a `Policy` is returned with default
    * values including `POLICY_TYPE_NOT_SET` for the `policy_type oneof`. The
    * `etag` value can be used with `SetOrgPolicy()` to create or update a
    * `Policy` during read-modify-write.
    */
  def getOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy]
  /**
    * Lists Projects that are visible to the user and satisfy the
    * specified filter. This method returns Projects in an unspecified order.
    * New Projects do not necessarily appear at the end of the list.
    */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsFilter): Request_[ListProjectsResponse]
  /** Lists `Constraints` that could be applied on the specified resource. */
  def listAvailableOrgPolicyConstraints(request: AnonAccesstoken): Request_[ListAvailableOrgPolicyConstraintsResponse]
  /** Lists all the `Policies` set for a particular resource. */
  def listOrgPolicies(request: AnonAccesstoken): Request_[ListOrgPoliciesResponse]
  /**
    * Sets the IAM access control policy for the specified Project. Replaces
    * any existing policy.
    *
    * The following constraints apply when using `setIamPolicy()`:
    *
    * + Project does not support `allUsers` and `allAuthenticatedUsers` as
    * `members` in a `Binding` of a `Policy`.
    *
    * + The owner role can be granted only to `user` and `serviceAccount`.
    *
    * + Service accounts can be made owners of a project directly
    * without any restrictions. However, to be added as an owner, a user must be
    * invited via Cloud Platform console and must accept the invitation.
    *
    * + A user cannot be granted the owner role using `setIamPolicy()`. The user
    * must be granted the owner role using the Cloud Platform Console and must
    * explicitly accept the invitation.
    *
    * + Invitations to grant the owner role cannot be sent using
    * `setIamPolicy()`;
    * they must be sent only using the Cloud Platform Console.
    *
    * + Membership changes that leave the project without any owners that have
    * accepted the Terms of Service (ToS) will be rejected.
    *
    * + If the project is not part of an organization, there must be at least
    * one owner who has accepted the Terms of Service (ToS) agreement in the
    * policy. Calling `setIamPolicy()` to remove the last ToS-accepted owner
    * from the policy will fail. This restriction also applies to legacy
    * projects that no longer have owners who have accepted the ToS. Edits to
    * IAM policies will be rejected until the lack of a ToS-accepting owner is
    * rectified.
    *
    * + Calling this method requires enabling the App Engine Admin API.
    *
    * Note: Removing service accounts from policies or changing their roles
    * can render services completely inoperable. It is important to understand
    * how the service account is being used before removing or updating its
    * roles.
    *
    * Authorization requires the Google IAM permission
    * `resourcemanager.projects.setIamPolicy` on the project
    */
  def setIamPolicy(request: AnonAccesstoken): Request_[Policy]
  /**
    * Updates the specified `Policy` on the resource. Creates a new `Policy` for
    * that `Constraint` on the resource if one does not exist.
    *
    * Not supplying an `etag` on the request `Policy` results in an unconditional
    * write of the `Policy`.
    */
  def setOrgPolicy(request: AnonAccesstoken): Request_[OrgPolicy]
  /**
    * Returns permissions that a caller has on the specified Project.
    *
    * There are no permissions required for making this API call.
    */
  def testIamPermissions(request: AnonAccesstoken): Request_[TestIamPermissionsResponse]
  /**
    * Restores the Project identified by the specified
    * `project_id` (for example, `my-project-123`).
    * You can only use this method for a Project that has a lifecycle state of
    * DELETE_REQUESTED.
    * After deletion starts, the Project cannot be restored.
    *
    * The caller must have modify permissions for this Project.
    */
  def undelete(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[js.Object]
  /**
    * Updates the attributes of the Project identified by the specified
    * `project_id` (for example, `my-project-123`).
    *
    * The caller must have modify permissions for this Project.
    */
  def update(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Project]
}

object ProjectsResource {
  @scala.inline
  def apply(
    clearOrgPolicy: AnonAccesstoken => Request_[js.Object],
    create: AnonAccesstokenAlt => Request_[Operation],
    delete: AnonAccesstokenAltBearertokenCallbackFields => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallbackFields => Request_[Project],
    getAncestry: AnonAccesstokenAltBearertokenCallbackFields => Request_[GetAncestryResponse],
    getEffectiveOrgPolicy: AnonAccesstoken => Request_[OrgPolicy],
    getIamPolicy: AnonAccesstoken => Request_[Policy],
    getOrgPolicy: AnonAccesstoken => Request_[OrgPolicy],
    list: AnonAccesstokenAltBearertokenCallbackFieldsFilter => Request_[ListProjectsResponse],
    listAvailableOrgPolicyConstraints: AnonAccesstoken => Request_[ListAvailableOrgPolicyConstraintsResponse],
    listOrgPolicies: AnonAccesstoken => Request_[ListOrgPoliciesResponse],
    setIamPolicy: AnonAccesstoken => Request_[Policy],
    setOrgPolicy: AnonAccesstoken => Request_[OrgPolicy],
    testIamPermissions: AnonAccesstoken => Request_[TestIamPermissionsResponse],
    undelete: AnonAccesstokenAltBearertokenCallbackFields => Request_[js.Object],
    update: AnonAccesstokenAltBearertokenCallbackFields => Request_[Project]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(clearOrgPolicy = js.Any.fromFunction1(clearOrgPolicy), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getAncestry = js.Any.fromFunction1(getAncestry), getEffectiveOrgPolicy = js.Any.fromFunction1(getEffectiveOrgPolicy), getIamPolicy = js.Any.fromFunction1(getIamPolicy), getOrgPolicy = js.Any.fromFunction1(getOrgPolicy), list = js.Any.fromFunction1(list), listAvailableOrgPolicyConstraints = js.Any.fromFunction1(listAvailableOrgPolicyConstraints), listOrgPolicies = js.Any.fromFunction1(listOrgPolicies), setIamPolicy = js.Any.fromFunction1(setIamPolicy), setOrgPolicy = js.Any.fromFunction1(setOrgPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), undelete = js.Any.fromFunction1(undelete), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

