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
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Parent): gapiDotClientLib.gapiNs.clientNs.Request[Workspace]
  /**
               * Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created
               * version.
               */
  def create_version(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[CreateContainerVersionResponse]
  /** Deletes a Workspace. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a Workspace. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[Workspace]
  /** Gets a GTM Workspace Proposal. */
  def getProposal(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[WorkspaceProposal]
  /** Finds conflicting and modified entities in the workspace. */
  def getStatus(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[GetWorkspaceStatusResponse]
  /** Lists all Workspaces that belong to a GTM Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_ParentPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListWorkspacesResponse]
  /** Quick previews a workspace by creating a fake container version from all entities in the provided workspace. */
  def quick_preview(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[QuickPreviewResponse]
  /** Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request. */
  def resolve_conflict(request: gapiDotClientDotTagmanagerLib.Anon_Fingerprint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities. */
  def sync(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[SyncWorkspaceResponse]
  /** Updates a Workspace. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_Fingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Workspace]
  /** Updates a GTM Workspace Proposal. */
  def updateProposal(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[WorkspaceProposal]
}

