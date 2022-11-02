package typings.docusignEsign.mod

import typings.docusignEsign.anon.Include
import typings.docusignEsign.anon.IncludeItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "FoldersApi")
@js.native
open class FoldersApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def list(accountId: String): js.Promise[Folders] = js.native
  def list(accountId: String, options: Include): js.Promise[Folders] = js.native
  
  def listItems(accountId: String, folderId: String): js.Promise[FolderItemResponse] = js.native
  def listItems(accountId: String, folderId: String, options: IncludeItems): js.Promise[FolderItemResponse] = js.native
  
  def moveEnvelopes(accountId: String, folderId: String): js.Promise[FoldersResponse] = js.native
  def moveEnvelopes(accountId: String, folderId: String, optsOrCallback: Any): js.Promise[FoldersResponse] = js.native
  def moveEnvelopes(accountId: String, folderId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[FoldersResponse] = js.native
  def moveEnvelopes(
    accountId: String,
    folderId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[FoldersResponse] = js.native
  def moveEnvelopes(accountId: String, folderId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[FoldersResponse] = js.native
  def moveEnvelopes(
    accountId: String,
    folderId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[FoldersResponse] = js.native
  
  def search(accountId: String, searchFolderId: String): js.Promise[FolderItemResponse] = js.native
  def search(accountId: String, searchFolderId: String, optsOrCallback: Any): js.Promise[FolderItemResponse] = js.native
  def search(accountId: String, searchFolderId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[FolderItemResponse] = js.native
  def search(
    accountId: String,
    searchFolderId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[FolderItemResponse] = js.native
  def search(accountId: String, searchFolderId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[FolderItemResponse] = js.native
  def search(
    accountId: String,
    searchFolderId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[FolderItemResponse] = js.native
}
