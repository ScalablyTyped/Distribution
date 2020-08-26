package typings.dexie.mod

import typings.dexie.dexieStrings.AbortError
import typings.dexie.dexieStrings.ConstraintError
import typings.dexie.dexieStrings.DataCloneError
import typings.dexie.dexieStrings.DataError
import typings.dexie.dexieStrings.DatabaseClosedError
import typings.dexie.dexieStrings.ForeignAwaitError
import typings.dexie.dexieStrings.InternalError
import typings.dexie.dexieStrings.InvalidAccessError
import typings.dexie.dexieStrings.InvalidArgumentError
import typings.dexie.dexieStrings.InvalidStateError
import typings.dexie.dexieStrings.InvalidTableError
import typings.dexie.dexieStrings.MissingAPIError
import typings.dexie.dexieStrings.NoSuchDatabaseError
import typings.dexie.dexieStrings.NotFoundError
import typings.dexie.dexieStrings.OpenFailedError
import typings.dexie.dexieStrings.PrematureCommitError
import typings.dexie.dexieStrings.QuotaExceededError
import typings.dexie.dexieStrings.ReadOnlyError
import typings.dexie.dexieStrings.SchemaError
import typings.dexie.dexieStrings.SubTransactionError
import typings.dexie.dexieStrings.TimeoutError
import typings.dexie.dexieStrings.TransactionInactiveError
import typings.dexie.dexieStrings.UnknownError
import typings.dexie.dexieStrings.UnsupportedError
import typings.dexie.dexieStrings.UpgradeError
import typings.dexie.dexieStrings.VersionChangeError
import typings.dexie.dexieStrings.VersionError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DexieErrors extends js.Object {
  // http://dexie.org/docs/DexieErrors/Dexie.AbortError
  var Abort: AbortError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.ConstraintError
  var Constraint: ConstraintError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.DataError
  var Data: DataError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.DataCloneError
  var DataClone: DataCloneError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.DatabaseClosedError
  var DatabaseClosed: DatabaseClosedError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.ForeignAwaitError
  var ForeignAwait: ForeignAwaitError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.InternalError
  var Internal: InternalError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.InvalidAccessError
  var InvalidAccess: InvalidAccessError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.InvalidArgumentError
  var InvalidArgument: InvalidArgumentError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.InvalidStateError
  var InvalidState: InvalidStateError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.InvalidTableError
  var InvalidTable: InvalidTableError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.MissingAPIError
  var MissingAPI: MissingAPIError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.NoSuchDatabaseError
  var NoSuchDatabase: NoSuchDatabaseError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.NotFoundError
  var NotFound: NotFoundError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.OpenFailedError
  var OpenFailed: OpenFailedError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.PrematureCommitError
  var PrematureCommit: PrematureCommitError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.QuotaExceededError
  var QuotaExceeded: QuotaExceededError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.ReadOnlyError
  var ReadOnly: ReadOnlyError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.SchemaError
  var Schema: SchemaError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.SubTransactionError
  var SubTransaction: SubTransactionError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.TimeoutError
  var Timeout: TimeoutError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.TransactionInactiveError
  var TransactionInactive: TransactionInactiveError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.UnknownError
  var Unknown: UnknownError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.UnsupportedError
  var Unsupported: UnsupportedError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.UpgradeError
  var Upgrade: UpgradeError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.VersionError
  var Version: VersionError = js.native
  // http://dexie.org/docs/DexieErrors/Dexie.VersionChangeError
  var VersionChange: VersionChangeError = js.native
}

object DexieErrors {
  @scala.inline
  def apply(
    Abort: AbortError,
    Constraint: ConstraintError,
    Data: DataError,
    DataClone: DataCloneError,
    DatabaseClosed: DatabaseClosedError,
    ForeignAwait: ForeignAwaitError,
    Internal: InternalError,
    InvalidAccess: InvalidAccessError,
    InvalidArgument: InvalidArgumentError,
    InvalidState: InvalidStateError,
    InvalidTable: InvalidTableError,
    MissingAPI: MissingAPIError,
    NoSuchDatabase: NoSuchDatabaseError,
    NotFound: NotFoundError,
    OpenFailed: OpenFailedError,
    PrematureCommit: PrematureCommitError,
    QuotaExceeded: QuotaExceededError,
    ReadOnly: ReadOnlyError,
    Schema: SchemaError,
    SubTransaction: SubTransactionError,
    Timeout: TimeoutError,
    TransactionInactive: TransactionInactiveError,
    Unknown: UnknownError,
    Unsupported: UnsupportedError,
    Upgrade: UpgradeError,
    Version: VersionError,
    VersionChange: VersionChangeError
  ): DexieErrors = {
    val __obj = js.Dynamic.literal(Abort = Abort.asInstanceOf[js.Any], Constraint = Constraint.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], DataClone = DataClone.asInstanceOf[js.Any], DatabaseClosed = DatabaseClosed.asInstanceOf[js.Any], ForeignAwait = ForeignAwait.asInstanceOf[js.Any], Internal = Internal.asInstanceOf[js.Any], InvalidAccess = InvalidAccess.asInstanceOf[js.Any], InvalidArgument = InvalidArgument.asInstanceOf[js.Any], InvalidState = InvalidState.asInstanceOf[js.Any], InvalidTable = InvalidTable.asInstanceOf[js.Any], MissingAPI = MissingAPI.asInstanceOf[js.Any], NoSuchDatabase = NoSuchDatabase.asInstanceOf[js.Any], NotFound = NotFound.asInstanceOf[js.Any], OpenFailed = OpenFailed.asInstanceOf[js.Any], PrematureCommit = PrematureCommit.asInstanceOf[js.Any], QuotaExceeded = QuotaExceeded.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Schema = Schema.asInstanceOf[js.Any], SubTransaction = SubTransaction.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], TransactionInactive = TransactionInactive.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any], Unsupported = Unsupported.asInstanceOf[js.Any], Upgrade = Upgrade.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], VersionChange = VersionChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DexieErrors]
  }
  @scala.inline
  implicit class DexieErrorsOps[Self <: DexieErrors] (val x: Self) extends AnyVal {
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
    def setAbort(value: AbortError): Self = this.set("Abort", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstraint(value: ConstraintError): Self = this.set("Constraint", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: DataError): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataClone(value: DataCloneError): Self = this.set("DataClone", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseClosed(value: DatabaseClosedError): Self = this.set("DatabaseClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def setForeignAwait(value: ForeignAwaitError): Self = this.set("ForeignAwait", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternal(value: InternalError): Self = this.set("Internal", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidAccess(value: InvalidAccessError): Self = this.set("InvalidAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidArgument(value: InvalidArgumentError): Self = this.set("InvalidArgument", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidState(value: InvalidStateError): Self = this.set("InvalidState", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidTable(value: InvalidTableError): Self = this.set("InvalidTable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMissingAPI(value: MissingAPIError): Self = this.set("MissingAPI", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoSuchDatabase(value: NoSuchDatabaseError): Self = this.set("NoSuchDatabase", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotFound(value: NotFoundError): Self = this.set("NotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenFailed(value: OpenFailedError): Self = this.set("OpenFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrematureCommit(value: PrematureCommitError): Self = this.set("PrematureCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuotaExceeded(value: QuotaExceededError): Self = this.set("QuotaExceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: ReadOnlyError): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: SchemaError): Self = this.set("Schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubTransaction(value: SubTransactionError): Self = this.set("SubTransaction", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: TimeoutError): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionInactive(value: TransactionInactiveError): Self = this.set("TransactionInactive", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknown(value: UnknownError): Self = this.set("Unknown", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsupported(value: UnsupportedError): Self = this.set("Unsupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpgrade(value: UpgradeError): Self = this.set("Upgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: VersionError): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionChange(value: VersionChangeError): Self = this.set("VersionChange", value.asInstanceOf[js.Any])
  }
  
}

