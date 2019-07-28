package typings.dexie.dexieMod

import org.scalablytyped.runtime.Instantiable0
import typings.dexie.IndexableTypeArrayReadonly
import typings.dexie.dexieMod.DexieNs.DexiePromiseConstructor
import typings.dexie.dexieMod.DexieNs.Promise
import typings.dexie.dexieStrings.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class AbortError ()
    extends typings.dexie.dexieMod.DexieNs.AbortError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class BulkError ()
    extends typings.dexie.dexieMod.DexieNs.BulkError {
    def this(msg: String) = this()
    def this(msg: String, failures: js.Array[_]) = this()
  }
  
  @js.native
  class ConstraintError ()
    extends typings.dexie.dexieMod.DexieNs.ConstraintError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class DataCloneError ()
    extends typings.dexie.dexieMod.DexieNs.DataCloneError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class DataError ()
    extends typings.dexie.dexieMod.DexieNs.DataError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class DatabaseClosedError ()
    extends typings.dexie.dexieMod.DexieNs.DatabaseClosedError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class DexieError ()
    extends typings.dexie.dexieMod.DexieNs.DexieError {
    def this(name: String) = this()
    def this(name: String, message: String) = this()
  }
  
  @js.native
  class InternalError ()
    extends typings.dexie.dexieMod.DexieNs.InternalError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidAccessError ()
    extends typings.dexie.dexieMod.DexieNs.InvalidAccessError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidArgumentError ()
    extends typings.dexie.dexieMod.DexieNs.InvalidArgumentError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidStateError ()
    extends typings.dexie.dexieMod.DexieNs.InvalidStateError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidTableError ()
    extends typings.dexie.dexieMod.DexieNs.InvalidTableError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class MissingAPIError ()
    extends typings.dexie.dexieMod.DexieNs.MissingAPIError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class ModifyError ()
    extends typings.dexie.dexieMod.DexieNs.ModifyError {
    def this(msg: String) = this()
    def this(msg: String, failures: js.Array[_]) = this()
    def this(msg: String, failures: js.Array[_], successCount: Double) = this()
    def this(msg: String, failures: js.Array[_], successCount: Double, failedKeys: IndexableTypeArrayReadonly) = this()
  }
  
  @js.native
  class NoSuchDatabaseError ()
    extends typings.dexie.dexieMod.DexieNs.NoSuchDatabaseError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class NotFoundError ()
    extends typings.dexie.dexieMod.DexieNs.NotFoundError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class OpenFailedError ()
    extends typings.dexie.dexieMod.DexieNs.OpenFailedError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class PromiseCls[T] protected () extends Promise[T] {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
  }
  
  @js.native
  class QuotaExceededError ()
    extends typings.dexie.dexieMod.DexieNs.QuotaExceededError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class ReadOnlyError ()
    extends typings.dexie.dexieMod.DexieNs.ReadOnlyError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class SchemaError ()
    extends typings.dexie.dexieMod.DexieNs.SchemaError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class SubTransactionError ()
    extends typings.dexie.dexieMod.DexieNs.SubTransactionError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class SyntaxError ()
    extends typings.dexie.dexieMod.DexieNs.SyntaxError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class TimeoutError ()
    extends typings.dexie.dexieMod.DexieNs.TimeoutError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class TransactionInactiveError ()
    extends typings.dexie.dexieMod.DexieNs.TransactionInactiveError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class UnknownError ()
    extends typings.dexie.dexieMod.DexieNs.UnknownError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class UnsupportedError ()
    extends typings.dexie.dexieMod.DexieNs.UnsupportedError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class UpgradeError ()
    extends typings.dexie.dexieMod.DexieNs.UpgradeError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class VersionChangeError ()
    extends typings.dexie.dexieMod.DexieNs.VersionChangeError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class VersionError ()
    extends typings.dexie.dexieMod.DexieNs.VersionError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  var Promise: DexiePromiseConstructor = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(IndexSpec, Events) */ var TableSchema: Instantiable0[typings.dexie.dexieMod.DexieNs.TableSchema] = js.native
  // errnames - handy spellcheck in switch (error.name) {} cases.        
  @js.native
  object errnames extends js.Object {
    var Abort: typings.dexie.dexieStrings.AbortError = js.native
    var Constraint: typings.dexie.dexieStrings.ConstraintError = js.native
    var Data: typings.dexie.dexieStrings.DataError = js.native
    var DataClone: typings.dexie.dexieStrings.DataCloneError = js.native
    var DatabaseClosed: typings.dexie.dexieStrings.DatabaseClosedError = js.native
    var Internal: typings.dexie.dexieStrings.InternalError = js.native
    var InvalidAccess: typings.dexie.dexieStrings.InvalidAccessError = js.native
    var InvalidArgument: typings.dexie.dexieStrings.InvalidArgumentError = js.native
    var InvalidState: typings.dexie.dexieStrings.InvalidStateError = js.native
    var InvalidTable: typings.dexie.dexieStrings.InvalidTableError = js.native
    var MissingAPI: typings.dexie.dexieStrings.MissingAPIError = js.native
    // Dexie-specific error names:
    var Modify: typings.dexie.dexieStrings.ModifyError = js.native
    var NoSuchDatabase: typings.dexie.dexieStrings.NoSuchDatabaseError = js.native
    var NotFound: typings.dexie.dexieStrings.NotFoundError = js.native
    var OpenFailed: typings.dexie.dexieStrings.OpenFailedError = js.native
    var QuotaExceeded: typings.dexie.dexieStrings.QuotaExceededError = js.native
    var ReadOnly: typings.dexie.dexieStrings.ReadOnlyError = js.native
    var Schema: typings.dexie.dexieStrings.SchemaError = js.native
    var SubTransaction: Error = js.native
    var Syntax: typings.dexie.dexieStrings.SyntaxError = js.native
    var Timeout: typings.dexie.dexieStrings.TimeoutError = js.native
    var TransactionInactive: typings.dexie.dexieStrings.TransactionInactiveError = js.native
    // Error names generated by indexedDB:
    var Unknown: typings.dexie.dexieStrings.UnknownError = js.native
    var Unsupported: typings.dexie.dexieStrings.UnsupportedError = js.native
    var Upgrade: typings.dexie.dexieStrings.UpgradeError = js.native
    var Version: typings.dexie.dexieStrings.VersionError = js.native
    var VersionChange: typings.dexie.dexieStrings.VersionChangeError = js.native
  }
  
}

