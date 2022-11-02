package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "EmailArchiveApi")
@js.native
open class EmailArchiveApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def createBCCEmailArchive(accountId: String): js.Promise[BccEmailArchive] = js.native
  def createBCCEmailArchive(accountId: String, optsOrCallback: Any): js.Promise[BccEmailArchive] = js.native
  def createBCCEmailArchive(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[BccEmailArchive] = js.native
  def createBCCEmailArchive(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BccEmailArchive] = js.native
  def createBCCEmailArchive(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BccEmailArchive] = js.native
  def createBCCEmailArchive(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BccEmailArchive] = js.native
  
  def deleteBCCEmailArchive(accountId: String, bccEmailArchiveId: String): js.Promise[Unit] = js.native
  def deleteBCCEmailArchive(accountId: String, bccEmailArchiveId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def deleteBCCEmailArchive(
    accountId: String,
    bccEmailArchiveId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def getBCCEmailArchiveHistoryList(accountId: String, bccEmailArchiveId: String): js.Promise[BccEmailArchiveHistoryList] = js.native
  def getBCCEmailArchiveHistoryList(accountId: String, bccEmailArchiveId: String, optsOrCallback: Any): js.Promise[BccEmailArchiveHistoryList] = js.native
  def getBCCEmailArchiveHistoryList(accountId: String, bccEmailArchiveId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[BccEmailArchiveHistoryList] = js.native
  def getBCCEmailArchiveHistoryList(
    accountId: String,
    bccEmailArchiveId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BccEmailArchiveHistoryList] = js.native
  def getBCCEmailArchiveHistoryList(accountId: String, bccEmailArchiveId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BccEmailArchiveHistoryList] = js.native
  def getBCCEmailArchiveHistoryList(
    accountId: String,
    bccEmailArchiveId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BccEmailArchiveHistoryList] = js.native
  
  def getBCCEmailArchiveList(accountId: String): js.Promise[BccEmailArchiveList] = js.native
  def getBCCEmailArchiveList(accountId: String, optsOrCallback: Any): js.Promise[BccEmailArchiveList] = js.native
  def getBCCEmailArchiveList(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[BccEmailArchiveList] = js.native
  def getBCCEmailArchiveList(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BccEmailArchiveList] = js.native
  def getBCCEmailArchiveList(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BccEmailArchiveList] = js.native
  def getBCCEmailArchiveList(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BccEmailArchiveList] = js.native
}
