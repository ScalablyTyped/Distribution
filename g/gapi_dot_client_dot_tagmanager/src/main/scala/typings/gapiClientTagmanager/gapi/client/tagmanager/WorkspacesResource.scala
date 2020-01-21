package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonAltFields
import typings.gapiClientTagmanager.AnonAltFieldsFingerprint
import typings.gapiClientTagmanager.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspacesResource extends js.Object {
  var built_in_variables: BuiltInVariablesResource
  var folders: FoldersResource
  var proposal: ProposalResource
  var tags: TagsResource
  var triggers: TriggersResource
  var variables: VariablesResource
  /** Creates a Workspace. */
  def create(request: AnonAlt): Request_[Workspace]
  /**
    * Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created
    * version.
    */
  def create_version(request: AnonAltFields): Request_[CreateContainerVersionResponse]
  /** Deletes a Workspace. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets a Workspace. */
  def get(request: AnonAltFields): Request_[Workspace]
  /** Gets a GTM Workspace Proposal. */
  def getProposal(request: AnonAltFields): Request_[WorkspaceProposal]
  /** Finds conflicting and modified entities in the workspace. */
  def getStatus(request: AnonAltFields): Request_[GetWorkspaceStatusResponse]
  /** Lists all Workspaces that belong to a GTM Container. */
  def list(request: AnonAltFieldsKey): Request_[ListWorkspacesResponse]
  /** Quick previews a workspace by creating a fake container version from all entities in the provided workspace. */
  def quick_preview(request: AnonAltFields): Request_[QuickPreviewResponse]
  /** Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request. */
  def resolve_conflict(request: AnonAltFieldsFingerprint): Request_[Unit]
  /** Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities. */
  def sync(request: AnonAltFields): Request_[SyncWorkspaceResponse]
  /** Updates a Workspace. */
  def update(request: AnonAltFieldsFingerprint): Request_[Workspace]
  /** Updates a GTM Workspace Proposal. */
  def updateProposal(request: AnonAltFields): Request_[WorkspaceProposal]
}

object WorkspacesResource {
  @scala.inline
  def apply(
    built_in_variables: BuiltInVariablesResource,
    create: AnonAlt => Request_[Workspace],
    create_version: AnonAltFields => Request_[CreateContainerVersionResponse],
    delete: AnonAltFields => Request_[Unit],
    folders: FoldersResource,
    get: AnonAltFields => Request_[Workspace],
    getProposal: AnonAltFields => Request_[WorkspaceProposal],
    getStatus: AnonAltFields => Request_[GetWorkspaceStatusResponse],
    list: AnonAltFieldsKey => Request_[ListWorkspacesResponse],
    proposal: ProposalResource,
    quick_preview: AnonAltFields => Request_[QuickPreviewResponse],
    resolve_conflict: AnonAltFieldsFingerprint => Request_[Unit],
    sync: AnonAltFields => Request_[SyncWorkspaceResponse],
    tags: TagsResource,
    triggers: TriggersResource,
    update: AnonAltFieldsFingerprint => Request_[Workspace],
    updateProposal: AnonAltFields => Request_[WorkspaceProposal],
    variables: VariablesResource
  ): WorkspacesResource = {
    val __obj = js.Dynamic.literal(built_in_variables = built_in_variables.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), create_version = js.Any.fromFunction1(create_version), delete = js.Any.fromFunction1(delete), folders = folders.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getProposal = js.Any.fromFunction1(getProposal), getStatus = js.Any.fromFunction1(getStatus), list = js.Any.fromFunction1(list), proposal = proposal.asInstanceOf[js.Any], quick_preview = js.Any.fromFunction1(quick_preview), resolve_conflict = js.Any.fromFunction1(resolve_conflict), sync = js.Any.fromFunction1(sync), tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), updateProposal = js.Any.fromFunction1(updateProposal), variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkspacesResource]
  }
}

