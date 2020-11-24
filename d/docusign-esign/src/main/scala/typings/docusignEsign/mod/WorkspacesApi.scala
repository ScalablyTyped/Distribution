package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "WorkspacesApi")
@js.native
class WorkspacesApi protected () extends js.Object {
  def this(apiClient: ApiClient) = this()
  
  def createWorkspace(accountId: String): js.Promise[Workspace] = js.native
  def createWorkspace(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[Workspace] = js.native
  def createWorkspace(accountId: String, optsOrCallback: js.Any): js.Promise[Workspace] = js.native
  def createWorkspace(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Workspace] = js.native
  
  def createWorkspaceFile(accountId: String, workspaceId: String, folderId: String): js.Promise[WorkspaceItem] = js.native
  def createWorkspaceFile(accountId: String, workspaceId: String, folderId: String, callback: js.Function0[Unit]): js.Promise[WorkspaceItem] = js.native
  
  def deleteWorkspace(accountId: String, workspaceId: String): js.Promise[Workspace] = js.native
  def deleteWorkspace(accountId: String, workspaceId: String, callback: js.Function0[Unit]): js.Promise[Workspace] = js.native
  
  def deleteWorkspaceFolderItems(accountId: String, workspaceId: String, folderId: String): js.Promise[Unit] = js.native
  def deleteWorkspaceFolderItems(
    accountId: String,
    workspaceId: String,
    folderId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  def deleteWorkspaceFolderItems(accountId: String, workspaceId: String, folderId: String, optsOrCallback: js.Any): js.Promise[Unit] = js.native
  def deleteWorkspaceFolderItems(
    accountId: String,
    workspaceId: String,
    folderId: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  
  def getWorkspace(accountId: String, workspaceId: String): js.Promise[Workspace] = js.native
  def getWorkspace(accountId: String, workspaceId: String, callback: js.Function0[Unit]): js.Promise[Workspace] = js.native
  
  def getWorkspaceFile(accountId: String, workspaceId: String, folderId: String, fileId: String): js.Promise[Null] = js.native
  def getWorkspaceFile(
    accountId: String,
    workspaceId: String,
    folderId: String,
    fileId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[Null] = js.native
  def getWorkspaceFile(accountId: String, workspaceId: String, folderId: String, fileId: String, optsOrCallback: js.Any): js.Promise[Null] = js.native
  def getWorkspaceFile(
    accountId: String,
    workspaceId: String,
    folderId: String,
    fileId: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[Null] = js.native
  
  def listWorkspaceFilePages(accountId: String, workspaceId: String, folderId: String, fileId: String): js.Promise[PageImages] = js.native
  def listWorkspaceFilePages(
    accountId: String,
    workspaceId: String,
    folderId: String,
    fileId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[PageImages] = js.native
  def listWorkspaceFilePages(accountId: String, workspaceId: String, folderId: String, fileId: String, optsOrCallback: js.Any): js.Promise[PageImages] = js.native
  def listWorkspaceFilePages(
    accountId: String,
    workspaceId: String,
    folderId: String,
    fileId: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[PageImages] = js.native
  
  def listWorkspaceFolderItems(accountId: String, workspaceId: String, folderId: String): js.Promise[WorkspaceFolderContents] = js.native
  def listWorkspaceFolderItems(
    accountId: String,
    workspaceId: String,
    folderId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[WorkspaceFolderContents] = js.native
  def listWorkspaceFolderItems(accountId: String, workspaceId: String, folderId: String, optsOrCallback: js.Any): js.Promise[WorkspaceFolderContents] = js.native
  def listWorkspaceFolderItems(
    accountId: String,
    workspaceId: String,
    folderId: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[WorkspaceFolderContents] = js.native
  
  def listWorkspaces(accountId: String): js.Promise[WorkspaceList] = js.native
  def listWorkspaces(accountId: String, callback: js.Function0[Unit]): js.Promise[WorkspaceList] = js.native
  
  def updateWorkspace(accountId: String, workspaceId: String): js.Promise[Workspace] = js.native
  def updateWorkspace(
    accountId: String,
    workspaceId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[Workspace] = js.native
  def updateWorkspace(accountId: String, workspaceId: String, optsOrCallback: js.Any): js.Promise[Workspace] = js.native
  def updateWorkspace(accountId: String, workspaceId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Workspace] = js.native
  
  def updateWorkspaceFile(accountId: String, workspaceId: String, folderId: String, fileId: String): js.Promise[WorkspaceItem] = js.native
  def updateWorkspaceFile(
    accountId: String,
    workspaceId: String,
    folderId: String,
    fileId: String,
    callback: js.Function0[Unit]
  ): js.Promise[WorkspaceItem] = js.native
}
