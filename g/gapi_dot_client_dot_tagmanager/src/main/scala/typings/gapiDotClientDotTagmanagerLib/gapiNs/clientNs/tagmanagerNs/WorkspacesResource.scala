package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

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
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Workspace]
  /**
    * Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created
    * version.
    */
  def create_version(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[CreateContainerVersionResponse]
  /** Deletes a Workspace. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a Workspace. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Workspace]
  /** Gets a GTM Workspace Proposal. */
  def getProposal(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[WorkspaceProposal]
  /** Finds conflicting and modified entities in the workspace. */
  def getStatus(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[GetWorkspaceStatusResponse]
  /** Lists all Workspaces that belong to a GTM Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ListWorkspacesResponse]
  /** Quick previews a workspace by creating a fake container version from all entities in the provided workspace. */
  def quick_preview(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[QuickPreviewResponse]
  /** Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request. */
  def resolve_conflict(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities. */
  def sync(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[SyncWorkspaceResponse]
  /** Updates a Workspace. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Workspace]
  /** Updates a GTM Workspace Proposal. */
  def updateProposal(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[WorkspaceProposal]
}

object WorkspacesResource {
  @scala.inline
  def apply(
    built_in_variables: Built_in_variablesResource,
    create: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Workspace]
    ],
    create_version: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[CreateContainerVersionResponse]
    ],
    delete: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    folders: FoldersResource,
    get: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Workspace]
    ],
    getProposal: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[WorkspaceProposal]
    ],
    getStatus: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[GetWorkspaceStatusResponse]
    ],
    list: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListWorkspacesResponse]
    ],
    proposal: ProposalResource,
    quick_preview: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[QuickPreviewResponse]
    ],
    resolve_conflict: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    sync: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[SyncWorkspaceResponse]
    ],
    tags: TagsResource,
    triggers: TriggersResource,
    update: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Workspace]
    ],
    updateProposal: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[WorkspaceProposal]
    ],
    variables: VariablesResource
  ): WorkspacesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("built_in_variables")(built_in_variables)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("create_version")(create_version)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("folders")(folders)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getProposal")(getProposal)
    __obj.updateDynamic("getStatus")(getStatus)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("proposal")(proposal)
    __obj.updateDynamic("quick_preview")(quick_preview)
    __obj.updateDynamic("resolve_conflict")(resolve_conflict)
    __obj.updateDynamic("sync")(sync)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("triggers")(triggers)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("updateProposal")(updateProposal)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[WorkspacesResource]
  }
}

