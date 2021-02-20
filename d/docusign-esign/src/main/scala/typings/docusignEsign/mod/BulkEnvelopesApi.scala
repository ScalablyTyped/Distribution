package typings.docusignEsign.mod

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "BulkEnvelopesApi")
@js.native
class BulkEnvelopesApi protected () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def createBulkSendList(accountId: String): js.Promise[BulkSendingList] = js.native
  def createBulkSendList(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[BulkSendingList] = js.native
  def createBulkSendList(accountId: String, optsOrCallback: js.Any): js.Promise[BulkSendingList] = js.native
  def createBulkSendList(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BulkSendingList] = js.native
  
  def createBulkSendRequest(accountId: String, bulkSendListId: String): js.Promise[BulkSendResponse] = js.native
  def createBulkSendRequest(
    accountId: String,
    bulkSendListId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[BulkSendResponse] = js.native
  def createBulkSendRequest(accountId: String, bulkSendListId: String, optsOrCallback: js.Any): js.Promise[BulkSendResponse] = js.native
  def createBulkSendRequest(accountId: String, bulkSendListId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BulkSendResponse] = js.native
  
  def createBulkSendTestRequest(accountId: String, bulkSendListId: String): js.Promise[BulkSendTestResponse] = js.native
  def createBulkSendTestRequest(
    accountId: String,
    bulkSendListId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[BulkSendTestResponse] = js.native
  def createBulkSendTestRequest(accountId: String, bulkSendListId: String, optsOrCallback: js.Any): js.Promise[BulkSendTestResponse] = js.native
  def createBulkSendTestRequest(accountId: String, bulkSendListId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BulkSendTestResponse] = js.native
  
  def deleteBulkSendList(accountId: String, bulkSendListId: String): js.Promise[BulkSendingListSummaries] = js.native
  def deleteBulkSendList(accountId: String, bulkSendListId: String, callback: js.Function0[Unit]): js.Promise[BulkSendingListSummaries] = js.native
  
  def deleteRecipients(accountId: String, envelopeId: String, recipientId: String): js.Promise[BulkRecipientsUpdateResponse] = js.native
  def deleteRecipients(accountId: String, envelopeId: String, recipientId: String, callback: js.Function0[Unit]): js.Promise[BulkRecipientsUpdateResponse] = js.native
  
  def get(accountId: String, batchId: String): js.Promise[BulkEnvelopeStatus] = js.native
  def get(
    accountId: String,
    batchId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[BulkEnvelopeStatus] = js.native
  def get(accountId: String, batchId: String, optsOrCallback: js.Any): js.Promise[BulkEnvelopeStatus] = js.native
  def get(accountId: String, batchId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BulkEnvelopeStatus] = js.native
  
  def getBulkSendList(accountId: String, bulkSendListId: String): js.Promise[BulkSendingList] = js.native
  def getBulkSendList(accountId: String, bulkSendListId: String, callback: js.Function0[Unit]): js.Promise[BulkSendingList] = js.native
  
  def getBulkSendLists(accountId: String): js.Promise[BulkSendingListSummaries] = js.native
  def getBulkSendLists(accountId: String, callback: js.Function0[Unit]): js.Promise[BulkSendingListSummaries] = js.native
  
  def getRecipients(accountId: String, envelopeId: String, recipientId: String): js.Promise[BulkRecipientsResponse] = js.native
  def getRecipients(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[BulkRecipientsResponse] = js.native
  def getRecipients(accountId: String, envelopeId: String, recipientId: String, optsOrCallback: js.Any): js.Promise[BulkRecipientsResponse] = js.native
  def getRecipients(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[BulkRecipientsResponse] = js.native
  
  def list(accountId: String): js.Promise[BulkEnvelopesResponse] = js.native
  def list(accountId: String, optsOrCallback: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[BulkEnvelopesResponse] = js.native
  def list(accountId: String, optsOrCallback: js.Any): js.Promise[BulkEnvelopesResponse] = js.native
  def list(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BulkEnvelopesResponse] = js.native
  
  def updateBulkSendList(accountId: String, bulkSendListId: String): js.Promise[BulkSendingList] = js.native
  def updateBulkSendList(
    accountId: String,
    bulkSendListId: String,
    optsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): js.Promise[BulkSendingList] = js.native
  def updateBulkSendList(accountId: String, bulkSendListId: String, optsOrCallback: js.Any): js.Promise[BulkSendingList] = js.native
  def updateBulkSendList(accountId: String, bulkSendListId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BulkSendingList] = js.native
  
  def updateRecipients(bulkRecipientsRequest: Blob, accountId: String, envelopeId: String, recipientId: String): js.Promise[BulkRecipientsSummaryResponse] = js.native
  def updateRecipients(
    bulkRecipientsRequest: Blob,
    accountId: String,
    envelopeId: String,
    recipientId: String,
    callback: js.Function0[Unit]
  ): js.Promise[BulkRecipientsSummaryResponse] = js.native
}
