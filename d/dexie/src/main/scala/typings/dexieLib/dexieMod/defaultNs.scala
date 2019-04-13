package typings
package dexieLib.dexieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class AbortError ()
    extends dexieLib.dexieMod.DexieNs.AbortError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class BulkError ()
    extends dexieLib.dexieMod.DexieNs.BulkError {
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, failures: js.Array[_]) = this()
  }
  
  @js.native
  class ConstraintError ()
    extends dexieLib.dexieMod.DexieNs.ConstraintError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class DataCloneError ()
    extends dexieLib.dexieMod.DexieNs.DataCloneError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class DataError ()
    extends dexieLib.dexieMod.DexieNs.DataError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class DatabaseClosedError ()
    extends dexieLib.dexieMod.DexieNs.DatabaseClosedError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class DexieError ()
    extends dexieLib.dexieMod.DexieNs.DexieError {
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, message: java.lang.String) = this()
  }
  
  @js.native
  class InternalError ()
    extends dexieLib.dexieMod.DexieNs.InternalError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidAccessError ()
    extends dexieLib.dexieMod.DexieNs.InvalidAccessError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidArgumentError ()
    extends dexieLib.dexieMod.DexieNs.InvalidArgumentError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidStateError ()
    extends dexieLib.dexieMod.DexieNs.InvalidStateError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidTableError ()
    extends dexieLib.dexieMod.DexieNs.InvalidTableError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class MissingAPIError ()
    extends dexieLib.dexieMod.DexieNs.MissingAPIError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class ModifyError ()
    extends dexieLib.dexieMod.DexieNs.ModifyError {
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, failures: js.Array[_]) = this()
    def this(msg: java.lang.String, failures: js.Array[_], successCount: scala.Double) = this()
    def this(msg: java.lang.String, failures: js.Array[_], successCount: scala.Double, failedKeys: dexieLib.IndexableTypeArrayReadonly) = this()
  }
  
  @js.native
  class NoSuchDatabaseError ()
    extends dexieLib.dexieMod.DexieNs.NoSuchDatabaseError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class NotFoundError ()
    extends dexieLib.dexieMod.DexieNs.NotFoundError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class OpenFailedError ()
    extends dexieLib.dexieMod.DexieNs.OpenFailedError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class PromiseCls[T] protected ()
    extends dexieLib.dexieMod.DexieNs.Promise[T] {
    def this(executor: js.Function2[
          /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], scala.Unit], 
          /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
          scala.Unit
        ]) = this()
  }
  
  @js.native
  class QuotaExceededError ()
    extends dexieLib.dexieMod.DexieNs.QuotaExceededError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class ReadOnlyError ()
    extends dexieLib.dexieMod.DexieNs.ReadOnlyError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class SchemaError ()
    extends dexieLib.dexieMod.DexieNs.SchemaError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class SubTransactionError ()
    extends dexieLib.dexieMod.DexieNs.SubTransactionError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class SyntaxError ()
    extends dexieLib.dexieMod.DexieNs.SyntaxError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class TimeoutError ()
    extends dexieLib.dexieMod.DexieNs.TimeoutError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class TransactionInactiveError ()
    extends dexieLib.dexieMod.DexieNs.TransactionInactiveError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class UnknownError ()
    extends dexieLib.dexieMod.DexieNs.UnknownError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class UnsupportedError ()
    extends dexieLib.dexieMod.DexieNs.UnsupportedError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class UpgradeError ()
    extends dexieLib.dexieMod.DexieNs.UpgradeError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class VersionChangeError ()
    extends dexieLib.dexieMod.DexieNs.VersionChangeError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class VersionError ()
    extends dexieLib.dexieMod.DexieNs.VersionError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  var Promise: dexieLib.dexieMod.DexieNs.DexiePromiseConstructor = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(IndexSpec, Events) */ var TableSchema: org.scalablytyped.runtime.Instantiable0[dexieLib.dexieMod.DexieNs.TableSchema] = js.native
  // errnames - handy spellcheck in switch (error.name) {} cases.        
  @js.native
  object errnames extends js.Object {
    var Abort: dexieLib.dexieLibStrings.AbortError = js.native
    var Constraint: dexieLib.dexieLibStrings.ConstraintError = js.native
    var Data: dexieLib.dexieLibStrings.DataError = js.native
    var DataClone: dexieLib.dexieLibStrings.DataCloneError = js.native
    var DatabaseClosed: dexieLib.dexieLibStrings.DatabaseClosedError = js.native
    var Internal: dexieLib.dexieLibStrings.InternalError = js.native
    var InvalidAccess: dexieLib.dexieLibStrings.InvalidAccessError = js.native
    var InvalidArgument: dexieLib.dexieLibStrings.InvalidArgumentError = js.native
    var InvalidState: dexieLib.dexieLibStrings.InvalidStateError = js.native
    var InvalidTable: dexieLib.dexieLibStrings.InvalidTableError = js.native
    var MissingAPI: dexieLib.dexieLibStrings.MissingAPIError = js.native
    // Dexie-specific error names:
    var Modify: dexieLib.dexieLibStrings.ModifyError = js.native
    var NoSuchDatabase: dexieLib.dexieLibStrings.NoSuchDatabaseError = js.native
    var NotFound: dexieLib.dexieLibStrings.NotFoundError = js.native
    var OpenFailed: dexieLib.dexieLibStrings.OpenFailedError = js.native
    var QuotaExceeded: dexieLib.dexieLibStrings.QuotaExceededError = js.native
    var ReadOnly: dexieLib.dexieLibStrings.ReadOnlyError = js.native
    var Schema: dexieLib.dexieLibStrings.SchemaError = js.native
    var SubTransaction: dexieLib.dexieLibStrings.Error = js.native
    var Syntax: dexieLib.dexieLibStrings.SyntaxError = js.native
    var Timeout: dexieLib.dexieLibStrings.TimeoutError = js.native
    var TransactionInactive: dexieLib.dexieLibStrings.TransactionInactiveError = js.native
    // Error names generated by indexedDB:
    var Unknown: dexieLib.dexieLibStrings.UnknownError = js.native
    var Unsupported: dexieLib.dexieLibStrings.UnsupportedError = js.native
    var Upgrade: dexieLib.dexieLibStrings.UpgradeError = js.native
    var Version: dexieLib.dexieLibStrings.VersionError = js.native
    var VersionChange: dexieLib.dexieLibStrings.VersionChangeError = js.native
  }
  
}

