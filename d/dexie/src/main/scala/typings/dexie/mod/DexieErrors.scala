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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieErrors extends StObject {
  
  // https://dexie.org/docs/DexieErrors/Dexie.AbortError
  var Abort: AbortError
  
  // https://dexie.org/docs/DexieErrors/Dexie.ConstraintError
  var Constraint: ConstraintError
  
  // https://dexie.org/docs/DexieErrors/Dexie.DataError
  var Data: DataError
  
  // https://dexie.org/docs/DexieErrors/Dexie.DataCloneError
  var DataClone: DataCloneError
  
  // https://dexie.org/docs/DexieErrors/Dexie.DatabaseClosedError
  var DatabaseClosed: DatabaseClosedError
  
  // https://dexie.org/docs/DexieErrors/Dexie.ForeignAwaitError
  var ForeignAwait: ForeignAwaitError
  
  // https://dexie.org/docs/DexieErrors/Dexie.InternalError
  var Internal: InternalError
  
  // https://dexie.org/docs/DexieErrors/Dexie.InvalidAccessError
  var InvalidAccess: InvalidAccessError
  
  // https://dexie.org/docs/DexieErrors/Dexie.InvalidArgumentError
  var InvalidArgument: InvalidArgumentError
  
  // https://dexie.org/docs/DexieErrors/Dexie.InvalidStateError
  var InvalidState: InvalidStateError
  
  // https://dexie.org/docs/DexieErrors/Dexie.InvalidTableError
  var InvalidTable: InvalidTableError
  
  // https://dexie.org/docs/DexieErrors/Dexie.MissingAPIError
  var MissingAPI: MissingAPIError
  
  // https://dexie.org/docs/DexieErrors/Dexie.NoSuchDatabaseError
  var NoSuchDatabase: NoSuchDatabaseError
  
  // https://dexie.org/docs/DexieErrors/Dexie.NotFoundError
  var NotFound: NotFoundError
  
  // https://dexie.org/docs/DexieErrors/Dexie.OpenFailedError
  var OpenFailed: OpenFailedError
  
  // https://dexie.org/docs/DexieErrors/Dexie.PrematureCommitError
  var PrematureCommit: PrematureCommitError
  
  // https://dexie.org/docs/DexieErrors/Dexie.QuotaExceededError
  var QuotaExceeded: QuotaExceededError
  
  // https://dexie.org/docs/DexieErrors/Dexie.ReadOnlyError
  var ReadOnly: ReadOnlyError
  
  // https://dexie.org/docs/DexieErrors/Dexie.SchemaError
  var Schema: SchemaError
  
  // https://dexie.org/docs/DexieErrors/Dexie.SubTransactionError
  var SubTransaction: SubTransactionError
  
  // https://dexie.org/docs/DexieErrors/Dexie.TimeoutError
  var Timeout: TimeoutError
  
  // https://dexie.org/docs/DexieErrors/Dexie.TransactionInactiveError
  var TransactionInactive: TransactionInactiveError
  
  // https://dexie.org/docs/DexieErrors/Dexie.UnknownError
  var Unknown: UnknownError
  
  // https://dexie.org/docs/DexieErrors/Dexie.UnsupportedError
  var Unsupported: UnsupportedError
  
  // https://dexie.org/docs/DexieErrors/Dexie.UpgradeError
  var Upgrade: UpgradeError
  
  // https://dexie.org/docs/DexieErrors/Dexie.VersionError
  var Version: VersionError
  
  // https://dexie.org/docs/DexieErrors/Dexie.VersionChangeError
  var VersionChange: VersionChangeError
}
object DexieErrors {
  
  inline def apply(): DexieErrors = {
    val __obj = js.Dynamic.literal(Abort = "AbortError", Constraint = "ConstraintError", Data = "DataError", DataClone = "DataCloneError", DatabaseClosed = "DatabaseClosedError", ForeignAwait = "ForeignAwaitError", Internal = "InternalError", InvalidAccess = "InvalidAccessError", InvalidArgument = "InvalidArgumentError", InvalidState = "InvalidStateError", InvalidTable = "InvalidTableError", MissingAPI = "MissingAPIError", NoSuchDatabase = "NoSuchDatabaseError", NotFound = "NotFoundError", OpenFailed = "OpenFailedError", PrematureCommit = "PrematureCommitError", QuotaExceeded = "QuotaExceededError", ReadOnly = "ReadOnlyError", Schema = "SchemaError", SubTransaction = "SubTransactionError", Timeout = "TimeoutError", TransactionInactive = "TransactionInactiveError", Unknown = "UnknownError", Unsupported = "UnsupportedError", Upgrade = "UpgradeError", Version = "VersionError", VersionChange = "VersionChangeError")
    __obj.asInstanceOf[DexieErrors]
  }
  
  extension [Self <: DexieErrors](x: Self) {
    
    inline def setAbort(value: AbortError): Self = StObject.set(x, "Abort", value.asInstanceOf[js.Any])
    
    inline def setConstraint(value: ConstraintError): Self = StObject.set(x, "Constraint", value.asInstanceOf[js.Any])
    
    inline def setData(value: DataError): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataClone(value: DataCloneError): Self = StObject.set(x, "DataClone", value.asInstanceOf[js.Any])
    
    inline def setDatabaseClosed(value: DatabaseClosedError): Self = StObject.set(x, "DatabaseClosed", value.asInstanceOf[js.Any])
    
    inline def setForeignAwait(value: ForeignAwaitError): Self = StObject.set(x, "ForeignAwait", value.asInstanceOf[js.Any])
    
    inline def setInternal(value: InternalError): Self = StObject.set(x, "Internal", value.asInstanceOf[js.Any])
    
    inline def setInvalidAccess(value: InvalidAccessError): Self = StObject.set(x, "InvalidAccess", value.asInstanceOf[js.Any])
    
    inline def setInvalidArgument(value: InvalidArgumentError): Self = StObject.set(x, "InvalidArgument", value.asInstanceOf[js.Any])
    
    inline def setInvalidState(value: InvalidStateError): Self = StObject.set(x, "InvalidState", value.asInstanceOf[js.Any])
    
    inline def setInvalidTable(value: InvalidTableError): Self = StObject.set(x, "InvalidTable", value.asInstanceOf[js.Any])
    
    inline def setMissingAPI(value: MissingAPIError): Self = StObject.set(x, "MissingAPI", value.asInstanceOf[js.Any])
    
    inline def setNoSuchDatabase(value: NoSuchDatabaseError): Self = StObject.set(x, "NoSuchDatabase", value.asInstanceOf[js.Any])
    
    inline def setNotFound(value: NotFoundError): Self = StObject.set(x, "NotFound", value.asInstanceOf[js.Any])
    
    inline def setOpenFailed(value: OpenFailedError): Self = StObject.set(x, "OpenFailed", value.asInstanceOf[js.Any])
    
    inline def setPrematureCommit(value: PrematureCommitError): Self = StObject.set(x, "PrematureCommit", value.asInstanceOf[js.Any])
    
    inline def setQuotaExceeded(value: QuotaExceededError): Self = StObject.set(x, "QuotaExceeded", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: ReadOnlyError): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: SchemaError): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSubTransaction(value: SubTransactionError): Self = StObject.set(x, "SubTransaction", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: TimeoutError): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTransactionInactive(value: TransactionInactiveError): Self = StObject.set(x, "TransactionInactive", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: UnknownError): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
    
    inline def setUnsupported(value: UnsupportedError): Self = StObject.set(x, "Unsupported", value.asInstanceOf[js.Any])
    
    inline def setUpgrade(value: UpgradeError): Self = StObject.set(x, "Upgrade", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionError): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionChange(value: VersionChangeError): Self = StObject.set(x, "VersionChange", value.asInstanceOf[js.Any])
  }
}
