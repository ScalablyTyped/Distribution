package typings.firebaseFirestoreTypes

import typings.firebaseFirestoreTypes.mod.DocumentChangeType
import typings.firebaseFirestoreTypes.mod.FirestoreErrorCode
import typings.firebaseFirestoreTypes.mod.LogLevel
import typings.firebaseFirestoreTypes.mod.OrderByDirection
import typings.firebaseFirestoreTypes.mod.TaskState
import typings.firebaseFirestoreTypes.mod.WhereFilterOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseFirestoreTypesStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait EqualssignEqualssign
    extends StObject
       with WhereFilterOp
  inline def EqualssignEqualssign: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  
  @js.native
  sealed trait Error
    extends StObject
       with TaskState
  inline def Error: Error = "Error".asInstanceOf[Error]
  
  @js.native
  sealed trait ExclamationmarkEqualssign
    extends StObject
       with WhereFilterOp
  inline def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with WhereFilterOp
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with WhereFilterOp
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with WhereFilterOp
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with WhereFilterOp
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait Running
    extends StObject
       with TaskState
  inline def Running: Running = "Running".asInstanceOf[Running]
  
  @js.native
  sealed trait Success
    extends StObject
       with TaskState
  inline def Success: Success = "Success".asInstanceOf[Success]
  
  @js.native
  sealed trait aborted
    extends StObject
       with FirestoreErrorCode
  inline def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait added
    extends StObject
       with DocumentChangeType
  inline def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait `already-exists`
    extends StObject
       with FirestoreErrorCode
  inline def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  
  @js.native
  sealed trait `array-contains`
    extends StObject
       with WhereFilterOp
  inline def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  
  @js.native
  sealed trait `array-contains-any`
    extends StObject
       with WhereFilterOp
  inline def `array-contains-any`: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  
  @js.native
  sealed trait asc
    extends StObject
       with OrderByDirection
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait cache extends StObject
  inline def cache: cache = "cache".asInstanceOf[cache]
  
  @js.native
  sealed trait cancelled
    extends StObject
       with FirestoreErrorCode
  inline def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait `data-loss`
    extends StObject
       with FirestoreErrorCode
  inline def `data-loss`: `data-loss` = "data-loss".asInstanceOf[`data-loss`]
  
  @js.native
  sealed trait `deadline-exceeded`
    extends StObject
       with FirestoreErrorCode
  inline def `deadline-exceeded`: `deadline-exceeded` = "deadline-exceeded".asInstanceOf[`deadline-exceeded`]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait desc
    extends StObject
       with OrderByDirection
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait error_
    extends StObject
       with LogLevel
  inline def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait estimate extends StObject
  inline def estimate: estimate = "estimate".asInstanceOf[estimate]
  
  @js.native
  sealed trait `failed-precondition`
    extends StObject
       with FirestoreErrorCode
  inline def `failed-precondition`: `failed-precondition` = "failed-precondition".asInstanceOf[`failed-precondition`]
  
  @js.native
  sealed trait in
    extends StObject
       with WhereFilterOp
  inline def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait internal
    extends StObject
       with FirestoreErrorCode
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait `invalid-argument`
    extends StObject
       with FirestoreErrorCode
  inline def `invalid-argument`: `invalid-argument` = "invalid-argument".asInstanceOf[`invalid-argument`]
  
  @js.native
  sealed trait modified
    extends StObject
       with DocumentChangeType
  inline def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait `not-found`
    extends StObject
       with FirestoreErrorCode
  inline def `not-found`: `not-found` = "not-found".asInstanceOf[`not-found`]
  
  @js.native
  sealed trait `not-in`
    extends StObject
       with WhereFilterOp
  inline def `not-in`: `not-in` = "not-in".asInstanceOf[`not-in`]
  
  @js.native
  sealed trait `out-of-range`
    extends StObject
       with FirestoreErrorCode
  inline def `out-of-range`: `out-of-range` = "out-of-range".asInstanceOf[`out-of-range`]
  
  @js.native
  sealed trait `permission-denied`
    extends StObject
       with FirestoreErrorCode
  inline def `permission-denied`: `permission-denied` = "permission-denied".asInstanceOf[`permission-denied`]
  
  @js.native
  sealed trait previous extends StObject
  inline def previous: previous = "previous".asInstanceOf[previous]
  
  @js.native
  sealed trait removed
    extends StObject
       with DocumentChangeType
  inline def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait `resource-exhausted`
    extends StObject
       with FirestoreErrorCode
  inline def `resource-exhausted`: `resource-exhausted` = "resource-exhausted".asInstanceOf[`resource-exhausted`]
  
  @js.native
  sealed trait server extends StObject
  inline def server: server = "server".asInstanceOf[server]
  
  @js.native
  sealed trait silent
    extends StObject
       with LogLevel
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait unauthenticated
    extends StObject
       with FirestoreErrorCode
  inline def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  
  @js.native
  sealed trait unavailable
    extends StObject
       with FirestoreErrorCode
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait unimplemented
    extends StObject
       with FirestoreErrorCode
  inline def unimplemented: unimplemented = "unimplemented".asInstanceOf[unimplemented]
  
  @js.native
  sealed trait unknown
    extends StObject
       with FirestoreErrorCode
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait verbose
    extends StObject
       with LogLevel
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
}
