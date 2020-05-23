package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import typings.gapiClientTagmanager.anon.Key
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
  def create(request: Alt): Request[Workspace]
  /**
    * Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created
    * version.
    */
  def create_version(request: Fields): Request[CreateContainerVersionResponse]
  /** Deletes a Workspace. */
  def delete(request: Fields): Request[Unit]
  /** Gets a Workspace. */
  def get(request: Fields): Request[Workspace]
  /** Gets a GTM Workspace Proposal. */
  def getProposal(request: Fields): Request[WorkspaceProposal]
  /** Finds conflicting and modified entities in the workspace. */
  def getStatus(request: Fields): Request[GetWorkspaceStatusResponse]
  /** Lists all Workspaces that belong to a GTM Container. */
  def list(request: Key): Request[ListWorkspacesResponse]
  /** Quick previews a workspace by creating a fake container version from all entities in the provided workspace. */
  def quick_preview(request: Fields): Request[QuickPreviewResponse]
  /** Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request. */
  def resolve_conflict(request: Fingerprint): Request[Unit]
  /** Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities. */
  def sync(request: Fields): Request[SyncWorkspaceResponse]
  /** Updates a Workspace. */
  def update(request: Fingerprint): Request[Workspace]
  /** Updates a GTM Workspace Proposal. */
  def updateProposal(request: Fields): Request[WorkspaceProposal]
}

object WorkspacesResource {
  @scala.inline
  def apply(
    built_in_variables: BuiltInVariablesResource,
    create: Alt => Request[Workspace],
    create_version: Fields => Request[CreateContainerVersionResponse],
    delete: Fields => Request[Unit],
    folders: FoldersResource,
    get: Fields => Request[Workspace],
    getProposal: Fields => Request[WorkspaceProposal],
    getStatus: Fields => Request[GetWorkspaceStatusResponse],
    list: Key => Request[ListWorkspacesResponse],
    proposal: ProposalResource,
    quick_preview: Fields => Request[QuickPreviewResponse],
    resolve_conflict: Fingerprint => Request[Unit],
    sync: Fields => Request[SyncWorkspaceResponse],
    tags: TagsResource,
    triggers: TriggersResource,
    update: Fingerprint => Request[Workspace],
    updateProposal: Fields => Request[WorkspaceProposal],
    variables: VariablesResource
  ): WorkspacesResource = {
    val __obj = js.Dynamic.literal(built_in_variables = built_in_variables.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), create_version = js.Any.fromFunction1(create_version), delete = js.Any.fromFunction1(delete), folders = folders.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getProposal = js.Any.fromFunction1(getProposal), getStatus = js.Any.fromFunction1(getStatus), list = js.Any.fromFunction1(list), proposal = proposal.asInstanceOf[js.Any], quick_preview = js.Any.fromFunction1(quick_preview), resolve_conflict = js.Any.fromFunction1(resolve_conflict), sync = js.Any.fromFunction1(sync), tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), updateProposal = js.Any.fromFunction1(updateProposal), variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspacesResource]
  }
}

