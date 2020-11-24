package typings.docusignEsign.mod

import typings.docusignEsign.anon.Include
import typings.docusignEsign.anon.IncludeItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "FoldersApi")
@js.native
class FoldersApi protected () extends js.Object {
  def this(apiClient: ApiClient) = this()
  
  def list(accountId: String): js.Promise[Folders] = js.native
  def list(accountId: String, options: Include): js.Promise[Folders] = js.native
  
  def listItems(accountId: String, folderId: String): js.Promise[FolderItemResponse] = js.native
  def listItems(accountId: String, folderId: String, options: IncludeItems): js.Promise[FolderItemResponse] = js.native
  
  def moveEnvelopes(accountId: String, folderId: String): js.Promise[FoldersResponse] = js.native
  def moveEnvelopes(
    accountId: String,
    folderId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[FoldersResponse] = js.native
  def moveEnvelopes(accountId: String, folderId: String, optsOrCallback: js.Any): js.Promise[FoldersResponse] = js.native
  def moveEnvelopes(accountId: String, folderId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[FoldersResponse] = js.native
  
  def search(accountId: String, searchFolderId: String): js.Promise[FolderItemResponse] = js.native
  def search(
    accountId: String,
    searchFolderId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[FolderItemResponse] = js.native
  def search(accountId: String, searchFolderId: String, optsOrCallback: js.Any): js.Promise[FolderItemResponse] = js.native
  def search(accountId: String, searchFolderId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[FolderItemResponse] = js.native
}
