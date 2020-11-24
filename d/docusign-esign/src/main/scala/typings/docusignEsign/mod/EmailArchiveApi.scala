package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "EmailArchiveApi")
@js.native
class EmailArchiveApi protected () extends js.Object {
  def this(apiClient: ApiClient) = this()
  
  def createBCCEmailArchive(accountId: String): js.Promise[BccEmailArchive] = js.native
  def createBCCEmailArchive(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[BccEmailArchive] = js.native
  def createBCCEmailArchive(accountId: String, optsOrCallback: js.Any): js.Promise[BccEmailArchive] = js.native
  def createBCCEmailArchive(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BccEmailArchive] = js.native
  
  def deleteBCCEmailArchive(accountId: String, bccEmailArchiveId: String): js.Promise[Unit] = js.native
  def deleteBCCEmailArchive(accountId: String, bccEmailArchiveId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def getBCCEmailArchiveHistoryList(accountId: String, bccEmailArchiveId: String): js.Promise[BccEmailArchiveHistoryList] = js.native
  def getBCCEmailArchiveHistoryList(
    accountId: String,
    bccEmailArchiveId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[BccEmailArchiveHistoryList] = js.native
  def getBCCEmailArchiveHistoryList(accountId: String, bccEmailArchiveId: String, optsOrCallback: js.Any): js.Promise[BccEmailArchiveHistoryList] = js.native
  def getBCCEmailArchiveHistoryList(accountId: String, bccEmailArchiveId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BccEmailArchiveHistoryList] = js.native
  
  def getBCCEmailArchiveList(accountId: String): js.Promise[BccEmailArchiveList] = js.native
  def getBCCEmailArchiveList(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[BccEmailArchiveList] = js.native
  def getBCCEmailArchiveList(accountId: String, optsOrCallback: js.Any): js.Promise[BccEmailArchiveList] = js.native
  def getBCCEmailArchiveList(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BccEmailArchiveList] = js.native
}
