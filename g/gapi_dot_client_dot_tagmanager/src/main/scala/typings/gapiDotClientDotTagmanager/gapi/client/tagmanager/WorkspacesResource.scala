package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotTagmanager.Anon_Alt
import typings.gapiDotClientDotTagmanager.Anon_AltFields
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsFingerprint
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspacesResource extends js.Object {
  var built_in_variables: Built_in_variablesResource
  var folders: FoldersResource
  var proposal: ProposalResource
  var tags: TagsResource
  var triggers: TriggersResource
  var variables: VariablesResource
  /** Creates a Workspace. */
  def create(request: Anon_Alt): Request[Workspace]
  /**
    * Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created
    * version.
    */
  def create_version(request: Anon_AltFields): Request[CreateContainerVersionResponse]
  /** Deletes a Workspace. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets a Workspace. */
  def get(request: Anon_AltFields): Request[Workspace]
  /** Gets a GTM Workspace Proposal. */
  def getProposal(request: Anon_AltFields): Request[WorkspaceProposal]
  /** Finds conflicting and modified entities in the workspace. */
  def getStatus(request: Anon_AltFields): Request[GetWorkspaceStatusResponse]
  /** Lists all Workspaces that belong to a GTM Container. */
  def list(request: Anon_AltFieldsKey): Request[ListWorkspacesResponse]
  /** Quick previews a workspace by creating a fake container version from all entities in the provided workspace. */
  def quick_preview(request: Anon_AltFields): Request[QuickPreviewResponse]
  /** Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request. */
  def resolve_conflict(request: Anon_AltFieldsFingerprint): Request[Unit]
  /** Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities. */
  def sync(request: Anon_AltFields): Request[SyncWorkspaceResponse]
  /** Updates a Workspace. */
  def update(request: Anon_AltFieldsFingerprint): Request[Workspace]
  /** Updates a GTM Workspace Proposal. */
  def updateProposal(request: Anon_AltFields): Request[WorkspaceProposal]
}

object WorkspacesResource {
  @scala.inline
  def apply(
    built_in_variables: Built_in_variablesResource,
    create: Anon_Alt => Request[Workspace],
    create_version: Anon_AltFields => Request[CreateContainerVersionResponse],
    delete: Anon_AltFields => Request[Unit],
    folders: FoldersResource,
    get: Anon_AltFields => Request[Workspace],
    getProposal: Anon_AltFields => Request[WorkspaceProposal],
    getStatus: Anon_AltFields => Request[GetWorkspaceStatusResponse],
    list: Anon_AltFieldsKey => Request[ListWorkspacesResponse],
    proposal: ProposalResource,
    quick_preview: Anon_AltFields => Request[QuickPreviewResponse],
    resolve_conflict: Anon_AltFieldsFingerprint => Request[Unit],
    sync: Anon_AltFields => Request[SyncWorkspaceResponse],
    tags: TagsResource,
    triggers: TriggersResource,
    update: Anon_AltFieldsFingerprint => Request[Workspace],
    updateProposal: Anon_AltFields => Request[WorkspaceProposal],
    variables: VariablesResource
  ): WorkspacesResource = {
    val __obj = js.Dynamic.literal(built_in_variables = built_in_variables.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), create_version = js.Any.fromFunction1(create_version), delete = js.Any.fromFunction1(delete), folders = folders.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getProposal = js.Any.fromFunction1(getProposal), getStatus = js.Any.fromFunction1(getStatus), list = js.Any.fromFunction1(list), proposal = proposal.asInstanceOf[js.Any], quick_preview = js.Any.fromFunction1(quick_preview), resolve_conflict = js.Any.fromFunction1(resolve_conflict), sync = js.Any.fromFunction1(sync), tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), updateProposal = js.Any.fromFunction1(updateProposal), variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkspacesResource]
  }
}

