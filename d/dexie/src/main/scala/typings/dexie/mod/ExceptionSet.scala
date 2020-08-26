package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in dexie.dexie.DexieErrors[keyof dexie.dexie.DexieErrors] ]: dexie.dexie.DexieErrorConstructor} */
@js.native
trait ExceptionSet extends js.Object {
  var AbortError: DexieErrorConstructor = js.native
  var ConstraintError: DexieErrorConstructor = js.native
  var DataCloneError: DexieErrorConstructor = js.native
  var DataError: DexieErrorConstructor = js.native
  var DatabaseClosedError: DexieErrorConstructor = js.native
  var ForeignAwaitError: DexieErrorConstructor = js.native
  var InternalError: DexieErrorConstructor = js.native
  var InvalidAccessError: DexieErrorConstructor = js.native
  var InvalidArgumentError: DexieErrorConstructor = js.native
  var InvalidStateError: DexieErrorConstructor = js.native
  var InvalidTableError: DexieErrorConstructor = js.native
  var MissingAPIError: DexieErrorConstructor = js.native
  var NoSuchDatabaseError: DexieErrorConstructor = js.native
  var NotFoundError: DexieErrorConstructor = js.native
  var OpenFailedError: DexieErrorConstructor = js.native
  var PrematureCommitError: DexieErrorConstructor = js.native
  var QuotaExceededError: DexieErrorConstructor = js.native
  var ReadOnlyError: DexieErrorConstructor = js.native
  var SchemaError: DexieErrorConstructor = js.native
  var SubTransactionError: DexieErrorConstructor = js.native
  var TimeoutError: DexieErrorConstructor = js.native
  var TransactionInactiveError: DexieErrorConstructor = js.native
  var UnknownError: DexieErrorConstructor = js.native
  var UnsupportedError: DexieErrorConstructor = js.native
  var UpgradeError: DexieErrorConstructor = js.native
  var VersionChangeError: DexieErrorConstructor = js.native
  var VersionError: DexieErrorConstructor = js.native
}

object ExceptionSet {
  @scala.inline
  def apply(
    AbortError: DexieErrorConstructor,
    ConstraintError: DexieErrorConstructor,
    DataCloneError: DexieErrorConstructor,
    DataError: DexieErrorConstructor,
    DatabaseClosedError: DexieErrorConstructor,
    ForeignAwaitError: DexieErrorConstructor,
    InternalError: DexieErrorConstructor,
    InvalidAccessError: DexieErrorConstructor,
    InvalidArgumentError: DexieErrorConstructor,
    InvalidStateError: DexieErrorConstructor,
    InvalidTableError: DexieErrorConstructor,
    MissingAPIError: DexieErrorConstructor,
    NoSuchDatabaseError: DexieErrorConstructor,
    NotFoundError: DexieErrorConstructor,
    OpenFailedError: DexieErrorConstructor,
    PrematureCommitError: DexieErrorConstructor,
    QuotaExceededError: DexieErrorConstructor,
    ReadOnlyError: DexieErrorConstructor,
    SchemaError: DexieErrorConstructor,
    SubTransactionError: DexieErrorConstructor,
    TimeoutError: DexieErrorConstructor,
    TransactionInactiveError: DexieErrorConstructor,
    UnknownError: DexieErrorConstructor,
    UnsupportedError: DexieErrorConstructor,
    UpgradeError: DexieErrorConstructor,
    VersionChangeError: DexieErrorConstructor,
    VersionError: DexieErrorConstructor
  ): ExceptionSet = {
    val __obj = js.Dynamic.literal(AbortError = AbortError.asInstanceOf[js.Any], ConstraintError = ConstraintError.asInstanceOf[js.Any], DataCloneError = DataCloneError.asInstanceOf[js.Any], DataError = DataError.asInstanceOf[js.Any], DatabaseClosedError = DatabaseClosedError.asInstanceOf[js.Any], ForeignAwaitError = ForeignAwaitError.asInstanceOf[js.Any], InternalError = InternalError.asInstanceOf[js.Any], InvalidAccessError = InvalidAccessError.asInstanceOf[js.Any], InvalidArgumentError = InvalidArgumentError.asInstanceOf[js.Any], InvalidStateError = InvalidStateError.asInstanceOf[js.Any], InvalidTableError = InvalidTableError.asInstanceOf[js.Any], MissingAPIError = MissingAPIError.asInstanceOf[js.Any], NoSuchDatabaseError = NoSuchDatabaseError.asInstanceOf[js.Any], NotFoundError = NotFoundError.asInstanceOf[js.Any], OpenFailedError = OpenFailedError.asInstanceOf[js.Any], PrematureCommitError = PrematureCommitError.asInstanceOf[js.Any], QuotaExceededError = QuotaExceededError.asInstanceOf[js.Any], ReadOnlyError = ReadOnlyError.asInstanceOf[js.Any], SchemaError = SchemaError.asInstanceOf[js.Any], SubTransactionError = SubTransactionError.asInstanceOf[js.Any], TimeoutError = TimeoutError.asInstanceOf[js.Any], TransactionInactiveError = TransactionInactiveError.asInstanceOf[js.Any], UnknownError = UnknownError.asInstanceOf[js.Any], UnsupportedError = UnsupportedError.asInstanceOf[js.Any], UpgradeError = UpgradeError.asInstanceOf[js.Any], VersionChangeError = VersionChangeError.asInstanceOf[js.Any], VersionError = VersionError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionSet]
  }
  @scala.inline
  implicit class ExceptionSetOps[Self <: ExceptionSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbortError(value: DexieErrorConstructor): Self = this.set("AbortError", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstraintError(value: DexieErrorConstructor): Self = this.set("ConstraintError", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataCloneError(value: DexieErrorConstructor): Self = this.set("DataCloneError", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataError(value: DexieErrorConstructor): Self = this.set("DataError", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseClosedError(value: DexieErrorConstructor): Self = this.set("DatabaseClosedError", value.asInstanceOf[js.Any])
    @scala.inline
    def setForeignAwaitError(value: DexieErrorConstructor): Self = this.set("ForeignAwaitError", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternalError(value: DexieErrorConstructor): Self = this.set("InternalError", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidAccessError(value: DexieErrorConstructor): Self = this.set("InvalidAccessError", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidArgumentError(value: DexieErrorConstructor): Self = this.set("InvalidArgumentError", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidStateError(value: DexieErrorConstructor): Self = this.set("InvalidStateError", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidTableError(value: DexieErrorConstructor): Self = this.set("InvalidTableError", value.asInstanceOf[js.Any])
    @scala.inline
    def setMissingAPIError(value: DexieErrorConstructor): Self = this.set("MissingAPIError", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoSuchDatabaseError(value: DexieErrorConstructor): Self = this.set("NoSuchDatabaseError", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotFoundError(value: DexieErrorConstructor): Self = this.set("NotFoundError", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenFailedError(value: DexieErrorConstructor): Self = this.set("OpenFailedError", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrematureCommitError(value: DexieErrorConstructor): Self = this.set("PrematureCommitError", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuotaExceededError(value: DexieErrorConstructor): Self = this.set("QuotaExceededError", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnlyError(value: DexieErrorConstructor): Self = this.set("ReadOnlyError", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaError(value: DexieErrorConstructor): Self = this.set("SchemaError", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubTransactionError(value: DexieErrorConstructor): Self = this.set("SubTransactionError", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeoutError(value: DexieErrorConstructor): Self = this.set("TimeoutError", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionInactiveError(value: DexieErrorConstructor): Self = this.set("TransactionInactiveError", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknownError(value: DexieErrorConstructor): Self = this.set("UnknownError", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsupportedError(value: DexieErrorConstructor): Self = this.set("UnsupportedError", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpgradeError(value: DexieErrorConstructor): Self = this.set("UpgradeError", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionChangeError(value: DexieErrorConstructor): Self = this.set("VersionChangeError", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionError(value: DexieErrorConstructor): Self = this.set("VersionError", value.asInstanceOf[js.Any])
  }
  
}

