package typings.dexie

import typings.dexie.mod.TransactionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dexieStrings {
  @js.native
  sealed trait AbortError extends js.Object
  
  @js.native
  sealed trait BulkError extends js.Object
  
  @js.native
  sealed trait ConstraintError extends js.Object
  
  @js.native
  sealed trait DataCloneError extends js.Object
  
  @js.native
  sealed trait DataError extends js.Object
  
  @js.native
  sealed trait DatabaseClosedError extends js.Object
  
  @js.native
  sealed trait DexieError extends js.Object
  
  @js.native
  sealed trait ForeignAwaitError extends js.Object
  
  @js.native
  sealed trait InternalError extends js.Object
  
  @js.native
  sealed trait InvalidAccessError extends js.Object
  
  @js.native
  sealed trait InvalidArgumentError extends js.Object
  
  @js.native
  sealed trait InvalidStateError extends js.Object
  
  @js.native
  sealed trait InvalidTableError extends js.Object
  
  @js.native
  sealed trait MissingAPIError extends js.Object
  
  @js.native
  sealed trait ModifyError extends js.Object
  
  @js.native
  sealed trait NoSuchDatabaseError extends js.Object
  
  @js.native
  sealed trait NotFoundError extends js.Object
  
  @js.native
  sealed trait OpenFailedError extends js.Object
  
  @js.native
  sealed trait PrematureCommitError extends js.Object
  
  @js.native
  sealed trait QuotaExceededError extends js.Object
  
  @js.native
  sealed trait ReadOnlyError extends js.Object
  
  @js.native
  sealed trait SchemaError extends js.Object
  
  @js.native
  sealed trait SubTransactionError extends js.Object
  
  @js.native
  sealed trait TimeoutError extends js.Object
  
  @js.native
  sealed trait TransactionInactiveError extends js.Object
  
  @js.native
  sealed trait UnknownError extends js.Object
  
  @js.native
  sealed trait UnsupportedError extends js.Object
  
  @js.native
  sealed trait UpgradeError extends js.Object
  
  @js.native
  sealed trait VersionChangeError extends js.Object
  
  @js.native
  sealed trait VersionError extends js.Object
  
  @js.native
  sealed trait abort extends js.Object
  
  @js.native
  sealed trait add extends js.Object
  
  @js.native
  sealed trait asap extends js.Object
  
  @js.native
  sealed trait blocked extends js.Object
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait creating extends js.Object
  
  @js.native
  sealed trait dbcore extends js.Object
  
  @js.native
  sealed trait delete extends js.Object
  
  @js.native
  sealed trait deleteRange extends js.Object
  
  @js.native
  sealed trait deleting extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait populate extends js.Object
  
  @js.native
  sealed trait put extends js.Object
  
  @js.native
  sealed trait r extends TransactionMode
  
  @js.native
  sealed trait rExclamationmark extends TransactionMode
  
  @js.native
  sealed trait rQuestionmark extends TransactionMode
  
  @js.native
  sealed trait reading extends js.Object
  
  @js.native
  sealed trait readonly extends TransactionMode
  
  @js.native
  sealed trait readwrite extends TransactionMode
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait rw extends TransactionMode
  
  @js.native
  sealed trait rwExclamationmark extends TransactionMode
  
  @js.native
  sealed trait rwQuestionmark extends TransactionMode
  
  @js.native
  sealed trait updating extends js.Object
  
  @js.native
  sealed trait versionchange extends js.Object
  
  @scala.inline
  def AbortError: AbortError = "AbortError".asInstanceOf[AbortError]
  @scala.inline
  def BulkError: BulkError = "BulkError".asInstanceOf[BulkError]
  @scala.inline
  def ConstraintError: ConstraintError = "ConstraintError".asInstanceOf[ConstraintError]
  @scala.inline
  def DataCloneError: DataCloneError = "DataCloneError".asInstanceOf[DataCloneError]
  @scala.inline
  def DataError: DataError = "DataError".asInstanceOf[DataError]
  @scala.inline
  def DatabaseClosedError: DatabaseClosedError = "DatabaseClosedError".asInstanceOf[DatabaseClosedError]
  @scala.inline
  def DexieError: DexieError = "DexieError".asInstanceOf[DexieError]
  @scala.inline
  def ForeignAwaitError: ForeignAwaitError = "ForeignAwaitError".asInstanceOf[ForeignAwaitError]
  @scala.inline
  def InternalError: InternalError = "InternalError".asInstanceOf[InternalError]
  @scala.inline
  def InvalidAccessError: InvalidAccessError = "InvalidAccessError".asInstanceOf[InvalidAccessError]
  @scala.inline
  def InvalidArgumentError: InvalidArgumentError = "InvalidArgumentError".asInstanceOf[InvalidArgumentError]
  @scala.inline
  def InvalidStateError: InvalidStateError = "InvalidStateError".asInstanceOf[InvalidStateError]
  @scala.inline
  def InvalidTableError: InvalidTableError = "InvalidTableError".asInstanceOf[InvalidTableError]
  @scala.inline
  def MissingAPIError: MissingAPIError = "MissingAPIError".asInstanceOf[MissingAPIError]
  @scala.inline
  def ModifyError: ModifyError = "ModifyError".asInstanceOf[ModifyError]
  @scala.inline
  def NoSuchDatabaseError: NoSuchDatabaseError = "NoSuchDatabaseError".asInstanceOf[NoSuchDatabaseError]
  @scala.inline
  def NotFoundError: NotFoundError = "NotFoundError".asInstanceOf[NotFoundError]
  @scala.inline
  def OpenFailedError: OpenFailedError = "OpenFailedError".asInstanceOf[OpenFailedError]
  @scala.inline
  def PrematureCommitError: PrematureCommitError = "PrematureCommitError".asInstanceOf[PrematureCommitError]
  @scala.inline
  def QuotaExceededError: QuotaExceededError = "QuotaExceededError".asInstanceOf[QuotaExceededError]
  @scala.inline
  def ReadOnlyError: ReadOnlyError = "ReadOnlyError".asInstanceOf[ReadOnlyError]
  @scala.inline
  def SchemaError: SchemaError = "SchemaError".asInstanceOf[SchemaError]
  @scala.inline
  def SubTransactionError: SubTransactionError = "SubTransactionError".asInstanceOf[SubTransactionError]
  @scala.inline
  def TimeoutError: TimeoutError = "TimeoutError".asInstanceOf[TimeoutError]
  @scala.inline
  def TransactionInactiveError: TransactionInactiveError = "TransactionInactiveError".asInstanceOf[TransactionInactiveError]
  @scala.inline
  def UnknownError: UnknownError = "UnknownError".asInstanceOf[UnknownError]
  @scala.inline
  def UnsupportedError: UnsupportedError = "UnsupportedError".asInstanceOf[UnsupportedError]
  @scala.inline
  def UpgradeError: UpgradeError = "UpgradeError".asInstanceOf[UpgradeError]
  @scala.inline
  def VersionChangeError: VersionChangeError = "VersionChangeError".asInstanceOf[VersionChangeError]
  @scala.inline
  def VersionError: VersionError = "VersionError".asInstanceOf[VersionError]
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  @scala.inline
  def asap: asap = "asap".asInstanceOf[asap]
  @scala.inline
  def blocked: blocked = "blocked".asInstanceOf[blocked]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def creating: creating = "creating".asInstanceOf[creating]
  @scala.inline
  def dbcore: dbcore = "dbcore".asInstanceOf[dbcore]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def deleteRange: deleteRange = "deleteRange".asInstanceOf[deleteRange]
  @scala.inline
  def deleting: deleting = "deleting".asInstanceOf[deleting]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def populate: populate = "populate".asInstanceOf[populate]
  @scala.inline
  def put: put = "put".asInstanceOf[put]
  @scala.inline
  def r: r = "r".asInstanceOf[r]
  @scala.inline
  def rExclamationmark: rExclamationmark = "r!".asInstanceOf[rExclamationmark]
  @scala.inline
  def rQuestionmark: rQuestionmark = "r?".asInstanceOf[rQuestionmark]
  @scala.inline
  def reading: reading = "reading".asInstanceOf[reading]
  @scala.inline
  def readonly: readonly = "readonly".asInstanceOf[readonly]
  @scala.inline
  def readwrite: readwrite = "readwrite".asInstanceOf[readwrite]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def rw: rw = "rw".asInstanceOf[rw]
  @scala.inline
  def rwExclamationmark: rwExclamationmark = "rw!".asInstanceOf[rwExclamationmark]
  @scala.inline
  def rwQuestionmark: rwQuestionmark = "rw?".asInstanceOf[rwQuestionmark]
  @scala.inline
  def updating: updating = "updating".asInstanceOf[updating]
  @scala.inline
  def versionchange: versionchange = "versionchange".asInstanceOf[versionchange]
}

