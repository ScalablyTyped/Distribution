package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import typings.gapiClientTagmanager.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspacesResource extends js.Object {
  var built_in_variables: BuiltInVariablesResource = js.native
  var folders: FoldersResource = js.native
  var proposal: ProposalResource = js.native
  var tags: TagsResource = js.native
  var triggers: TriggersResource = js.native
  var variables: VariablesResource = js.native
  /** Creates a Workspace. */
  def create(request: Alt): Request[Workspace] = js.native
  /**
    * Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created
    * version.
    */
  def create_version(request: Fields): Request[CreateContainerVersionResponse] = js.native
  /** Deletes a Workspace. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets a Workspace. */
  def get(request: Fields): Request[Workspace] = js.native
  /** Gets a GTM Workspace Proposal. */
  def getProposal(request: Fields): Request[WorkspaceProposal] = js.native
  /** Finds conflicting and modified entities in the workspace. */
  def getStatus(request: Fields): Request[GetWorkspaceStatusResponse] = js.native
  /** Lists all Workspaces that belong to a GTM Container. */
  def list(request: Key): Request[ListWorkspacesResponse] = js.native
  /** Quick previews a workspace by creating a fake container version from all entities in the provided workspace. */
  def quick_preview(request: Fields): Request[QuickPreviewResponse] = js.native
  /** Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request. */
  def resolve_conflict(request: Fingerprint): Request[Unit] = js.native
  /** Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities. */
  def sync(request: Fields): Request[SyncWorkspaceResponse] = js.native
  /** Updates a Workspace. */
  def update(request: Fingerprint): Request[Workspace] = js.native
  /** Updates a GTM Workspace Proposal. */
  def updateProposal(request: Fields): Request[WorkspaceProposal] = js.native
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
  @scala.inline
  implicit class WorkspacesResourceOps[Self <: WorkspacesResource] (val x: Self) extends AnyVal {
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
    def setBuilt_in_variables(value: BuiltInVariablesResource): Self = this.set("built_in_variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: Alt => Request[Workspace]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setCreate_version(value: Fields => Request[CreateContainerVersionResponse]): Self = this.set("create_version", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setFolders(value: FoldersResource): Self = this.set("folders", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Fields => Request[Workspace]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProposal(value: Fields => Request[WorkspaceProposal]): Self = this.set("getProposal", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStatus(value: Fields => Request[GetWorkspaceStatusResponse]): Self = this.set("getStatus", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[ListWorkspacesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setProposal(value: ProposalResource): Self = this.set("proposal", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuick_preview(value: Fields => Request[QuickPreviewResponse]): Self = this.set("quick_preview", js.Any.fromFunction1(value))
    @scala.inline
    def setResolve_conflict(value: Fingerprint => Request[Unit]): Self = this.set("resolve_conflict", js.Any.fromFunction1(value))
    @scala.inline
    def setSync(value: Fields => Request[SyncWorkspaceResponse]): Self = this.set("sync", js.Any.fromFunction1(value))
    @scala.inline
    def setTags(value: TagsResource): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggers(value: TriggersResource): Self = this.set("triggers", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: Fingerprint => Request[Workspace]): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateProposal(value: Fields => Request[WorkspaceProposal]): Self = this.set("updateProposal", js.Any.fromFunction1(value))
    @scala.inline
    def setVariables(value: VariablesResource): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

