package typings.firebaseFirestoreTypes

import typings.firebaseFirestoreTypes.mod.DocumentChangeType
import typings.firebaseFirestoreTypes.mod.FirestoreErrorCode
import typings.firebaseFirestoreTypes.mod.LogLevel
import typings.firebaseFirestoreTypes.mod.OrderByDirection
import typings.firebaseFirestoreTypes.mod.WhereFilterOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseFirestoreTypesStrings {
  
  @js.native
  sealed trait default extends StObject
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait EqualssignEqualssign extends WhereFilterOp
  @scala.inline
  def EqualssignEqualssign: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  
  @js.native
  sealed trait ExclamationmarkEqualssign extends WhereFilterOp
  @scala.inline
  def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  
  @js.native
  sealed trait Greaterthansign extends WhereFilterOp
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign extends WhereFilterOp
  @scala.inline
  def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait Lessthansign extends WhereFilterOp
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign extends WhereFilterOp
  @scala.inline
  def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait aborted extends FirestoreErrorCode
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait added extends DocumentChangeType
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait `already-exists` extends FirestoreErrorCode
  @scala.inline
  def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  
  @js.native
  sealed trait `array-contains` extends WhereFilterOp
  @scala.inline
  def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  
  @js.native
  sealed trait `array-contains-any` extends WhereFilterOp
  @scala.inline
  def `array-contains-any`: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  
  @js.native
  sealed trait asc extends OrderByDirection
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait cache extends StObject
  @scala.inline
  def cache: cache = "cache".asInstanceOf[cache]
  
  @js.native
  sealed trait cancelled extends FirestoreErrorCode
  @scala.inline
  def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait `data-loss` extends FirestoreErrorCode
  @scala.inline
  def `data-loss`: `data-loss` = "data-loss".asInstanceOf[`data-loss`]
  
  @js.native
  sealed trait `deadline-exceeded` extends FirestoreErrorCode
  @scala.inline
  def `deadline-exceeded`: `deadline-exceeded` = "deadline-exceeded".asInstanceOf[`deadline-exceeded`]
  
  @js.native
  sealed trait debug extends LogLevel
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait desc extends OrderByDirection
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait error extends LogLevel
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait estimate extends StObject
  @scala.inline
  def estimate: estimate = "estimate".asInstanceOf[estimate]
  
  @js.native
  sealed trait `failed-precondition` extends FirestoreErrorCode
  @scala.inline
  def `failed-precondition`: `failed-precondition` = "failed-precondition".asInstanceOf[`failed-precondition`]
  
  @js.native
  sealed trait in extends WhereFilterOp
  @scala.inline
  def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait info extends LogLevel
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait internal extends FirestoreErrorCode
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait `invalid-argument` extends FirestoreErrorCode
  @scala.inline
  def `invalid-argument`: `invalid-argument` = "invalid-argument".asInstanceOf[`invalid-argument`]
  
  @js.native
  sealed trait modified extends DocumentChangeType
  @scala.inline
  def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait none extends StObject
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait `not-found` extends FirestoreErrorCode
  @scala.inline
  def `not-found`: `not-found` = "not-found".asInstanceOf[`not-found`]
  
  @js.native
  sealed trait `not-in` extends WhereFilterOp
  @scala.inline
  def `not-in`: `not-in` = "not-in".asInstanceOf[`not-in`]
  
  @js.native
  sealed trait `out-of-range` extends FirestoreErrorCode
  @scala.inline
  def `out-of-range`: `out-of-range` = "out-of-range".asInstanceOf[`out-of-range`]
  
  @js.native
  sealed trait `permission-denied` extends FirestoreErrorCode
  @scala.inline
  def `permission-denied`: `permission-denied` = "permission-denied".asInstanceOf[`permission-denied`]
  
  @js.native
  sealed trait previous extends StObject
  @scala.inline
  def previous: previous = "previous".asInstanceOf[previous]
  
  @js.native
  sealed trait removed extends DocumentChangeType
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait `resource-exhausted` extends FirestoreErrorCode
  @scala.inline
  def `resource-exhausted`: `resource-exhausted` = "resource-exhausted".asInstanceOf[`resource-exhausted`]
  
  @js.native
  sealed trait server extends StObject
  @scala.inline
  def server: server = "server".asInstanceOf[server]
  
  @js.native
  sealed trait silent extends LogLevel
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait unauthenticated extends FirestoreErrorCode
  @scala.inline
  def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  
  @js.native
  sealed trait unavailable extends FirestoreErrorCode
  @scala.inline
  def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait unimplemented extends FirestoreErrorCode
  @scala.inline
  def unimplemented: unimplemented = "unimplemented".asInstanceOf[unimplemented]
  
  @js.native
  sealed trait unknown extends FirestoreErrorCode
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait verbose extends LogLevel
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait warn extends LogLevel
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
