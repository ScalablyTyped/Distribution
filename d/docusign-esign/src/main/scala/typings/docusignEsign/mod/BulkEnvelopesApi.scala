package typings.docusignEsign.mod

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "BulkEnvelopesApi")
@js.native
open class BulkEnvelopesApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def createBulkSendList(accountId: String): js.Promise[BulkSendingList] = js.native
  def createBulkSendList(accountId: String, optsOrCallback: Any): js.Promise[BulkSendingList] = js.native
  def createBulkSendList(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[BulkSendingList] = js.native
  def createBulkSendList(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkSendingList] = js.native
  def createBulkSendList(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BulkSendingList] = js.native
  def createBulkSendList(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkSendingList] = js.native
  
  def createBulkSendRequest(accountId: String, bulkSendListId: String): js.Promise[BulkSendResponse] = js.native
  def createBulkSendRequest(accountId: String, bulkSendListId: String, optsOrCallback: Any): js.Promise[BulkSendResponse] = js.native
  def createBulkSendRequest(accountId: String, bulkSendListId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[BulkSendResponse] = js.native
  def createBulkSendRequest(
    accountId: String,
    bulkSendListId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkSendResponse] = js.native
  def createBulkSendRequest(accountId: String, bulkSendListId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BulkSendResponse] = js.native
  def createBulkSendRequest(
    accountId: String,
    bulkSendListId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkSendResponse] = js.native
  
  def createBulkSendTestRequest(accountId: String, bulkSendListId: String): js.Promise[BulkSendTestResponse] = js.native
  def createBulkSendTestRequest(accountId: String, bulkSendListId: String, optsOrCallback: Any): js.Promise[BulkSendTestResponse] = js.native
  def createBulkSendTestRequest(accountId: String, bulkSendListId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[BulkSendTestResponse] = js.native
  def createBulkSendTestRequest(
    accountId: String,
    bulkSendListId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkSendTestResponse] = js.native
  def createBulkSendTestRequest(accountId: String, bulkSendListId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BulkSendTestResponse] = js.native
  def createBulkSendTestRequest(
    accountId: String,
    bulkSendListId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkSendTestResponse] = js.native
  
  def deleteBulkSendList(accountId: String, bulkSendListId: String): js.Promise[BulkSendingListSummaries] = js.native
  def deleteBulkSendList(accountId: String, bulkSendListId: String, callback: js.Function0[Unit]): js.Promise[BulkSendingListSummaries] = js.native
  def deleteBulkSendList(
    accountId: String,
    bulkSendListId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkSendingListSummaries] = js.native
  
  def deleteRecipients(accountId: String, envelopeId: String, recipientId: String): js.Promise[BulkRecipientsUpdateResponse] = js.native
  def deleteRecipients(accountId: String, envelopeId: String, recipientId: String, callback: js.Function0[Unit]): js.Promise[BulkRecipientsUpdateResponse] = js.native
  def deleteRecipients(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkRecipientsUpdateResponse] = js.native
  
  def get(accountId: String, batchId: String): js.Promise[BulkEnvelopeStatus] = js.native
  def get(accountId: String, batchId: String, optsOrCallback: Any): js.Promise[BulkEnvelopeStatus] = js.native
  def get(accountId: String, batchId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[BulkEnvelopeStatus] = js.native
  def get(
    accountId: String,
    batchId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkEnvelopeStatus] = js.native
  def get(accountId: String, batchId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BulkEnvelopeStatus] = js.native
  def get(
    accountId: String,
    batchId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkEnvelopeStatus] = js.native
  
  def getBulkSendList(accountId: String, bulkSendListId: String): js.Promise[BulkSendingList] = js.native
  def getBulkSendList(accountId: String, bulkSendListId: String, callback: js.Function0[Unit]): js.Promise[BulkSendingList] = js.native
  def getBulkSendList(
    accountId: String,
    bulkSendListId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkSendingList] = js.native
  
  def getBulkSendLists(accountId: String): js.Promise[BulkSendingListSummaries] = js.native
  def getBulkSendLists(accountId: String, callback: js.Function0[Unit]): js.Promise[BulkSendingListSummaries] = js.native
  def getBulkSendLists(
    accountId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkSendingListSummaries] = js.native
  
  def getRecipients(accountId: String, envelopeId: String, recipientId: String): js.Promise[BulkRecipientsResponse] = js.native
  def getRecipients(accountId: String, envelopeId: String, recipientId: String, optsOrCallback: Any): js.Promise[BulkRecipientsResponse] = js.native
  def getRecipients(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[BulkRecipientsResponse] = js.native
  def getRecipients(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkRecipientsResponse] = js.native
  def getRecipients(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[BulkRecipientsResponse] = js.native
  def getRecipients(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkRecipientsResponse] = js.native
  
  def list(accountId: String): js.Promise[BulkEnvelopesResponse] = js.native
  def list(accountId: String, optsOrCallback: Any): js.Promise[BulkEnvelopesResponse] = js.native
  def list(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[BulkEnvelopesResponse] = js.native
  def list(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkEnvelopesResponse] = js.native
  def list(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BulkEnvelopesResponse] = js.native
  def list(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkEnvelopesResponse] = js.native
  
  def updateBulkSendList(accountId: String, bulkSendListId: String): js.Promise[BulkSendingList] = js.native
  def updateBulkSendList(accountId: String, bulkSendListId: String, optsOrCallback: Any): js.Promise[BulkSendingList] = js.native
  def updateBulkSendList(accountId: String, bulkSendListId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[BulkSendingList] = js.native
  def updateBulkSendList(
    accountId: String,
    bulkSendListId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkSendingList] = js.native
  def updateBulkSendList(accountId: String, bulkSendListId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BulkSendingList] = js.native
  def updateBulkSendList(
    accountId: String,
    bulkSendListId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkSendingList] = js.native
  
  def updateRecipients(bulkRecipientsRequest: Blob, accountId: String, envelopeId: String, recipientId: String): js.Promise[BulkRecipientsSummaryResponse] = js.native
  def updateRecipients(
    bulkRecipientsRequest: Blob,
    accountId: String,
    envelopeId: String,
    recipientId: String,
    callback: js.Function0[Unit]
  ): js.Promise[BulkRecipientsSummaryResponse] = js.native
  def updateRecipients(
    bulkRecipientsRequest: Blob,
    accountId: String,
    envelopeId: String,
    recipientId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkRecipientsSummaryResponse] = js.native
}
