package typings.firebase

import typings.firebase.mod.default.analytics.EventNameString
import typings.firebase.mod.default.firestore.DocumentChangeType
import typings.firebase.mod.default.firestore.FirestoreErrorCode
import typings.firebase.mod.default.firestore.OrderByDirection
import typings.firebase.mod.default.firestore.WhereFilterOp
import typings.firebase.mod.default.functions.FunctionsErrorCode
import typings.firebase.mod.default.remoteConfig.FetchStatus
import typings.firebase.mod.default.remoteConfig.LogLevel
import typings.firebase.mod.default.remoteConfig.ValueSource
import typings.firebase.mod.firebase.database.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with ValueSource
       with typings.firebase.mod.firebase.remoteConfig.ValueSource
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait EqualssignEqualssign
    extends StObject
       with WhereFilterOp
       with typings.firebase.mod.firebase.firestore.WhereFilterOp
  inline def EqualssignEqualssign: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  
  @js.native
  sealed trait ExclamationmarkEqualssign
    extends StObject
       with WhereFilterOp
       with typings.firebase.mod.firebase.firestore.WhereFilterOp
  inline def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with WhereFilterOp
       with typings.firebase.mod.firebase.firestore.WhereFilterOp
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with WhereFilterOp
       with typings.firebase.mod.firebase.firestore.WhereFilterOp
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with WhereFilterOp
       with typings.firebase.mod.firebase.firestore.WhereFilterOp
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with WhereFilterOp
       with typings.firebase.mod.firebase.firestore.WhereFilterOp
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait aborted
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait add_payment_info
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def add_payment_info: add_payment_info = "add_payment_info".asInstanceOf[add_payment_info]
  
  @js.native
  sealed trait add_shipping_info
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def add_shipping_info: add_shipping_info = "add_shipping_info".asInstanceOf[add_shipping_info]
  
  @js.native
  sealed trait add_to_cart
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def add_to_cart: add_to_cart = "add_to_cart".asInstanceOf[add_to_cart]
  
  @js.native
  sealed trait add_to_wishlist
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def add_to_wishlist: add_to_wishlist = "add_to_wishlist".asInstanceOf[add_to_wishlist]
  
  @js.native
  sealed trait added
    extends StObject
       with DocumentChangeType
       with typings.firebase.mod.firebase.firestore.DocumentChangeType
  inline def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait `already-exists`
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  
  @js.native
  sealed trait `array-contains`
    extends StObject
       with WhereFilterOp
       with typings.firebase.mod.firebase.firestore.WhereFilterOp
  inline def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  
  @js.native
  sealed trait `array-contains-any`
    extends StObject
       with WhereFilterOp
       with typings.firebase.mod.firebase.firestore.WhereFilterOp
  inline def `array-contains-any`: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  
  @js.native
  sealed trait asc
    extends StObject
       with OrderByDirection
       with typings.firebase.mod.firebase.firestore.OrderByDirection
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait begin_checkout
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def begin_checkout: begin_checkout = "begin_checkout".asInstanceOf[begin_checkout]
  
  @js.native
  sealed trait cache extends StObject
  inline def cache: cache = "cache".asInstanceOf[cache]
  
  @js.native
  sealed trait cancelled
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait checkout_progress
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def checkout_progress: checkout_progress = "checkout_progress".asInstanceOf[checkout_progress]
  
  @js.native
  sealed trait child_added
    extends StObject
       with EventType
  inline def child_added: child_added = "child_added".asInstanceOf[child_added]
  
  @js.native
  sealed trait child_changed
    extends StObject
       with EventType
  inline def child_changed: child_changed = "child_changed".asInstanceOf[child_changed]
  
  @js.native
  sealed trait child_moved
    extends StObject
       with EventType
  inline def child_moved: child_moved = "child_moved".asInstanceOf[child_moved]
  
  @js.native
  sealed trait child_removed
    extends StObject
       with EventType
  inline def child_removed: child_removed = "child_removed".asInstanceOf[child_removed]
  
  @js.native
  sealed trait `data-loss`
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def `data-loss`: `data-loss` = "data-loss".asInstanceOf[`data-loss`]
  
  @js.native
  sealed trait `deadline-exceeded`
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def `deadline-exceeded`: `deadline-exceeded` = "deadline-exceeded".asInstanceOf[`deadline-exceeded`]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
       with typings.firebase.mod.default.firestore.LogLevel
       with typings.firebase.mod.firebase.remoteConfig.LogLevel
       with typings.firebase.mod.firebase.LogLevel
       with typings.firebase.mod.firebase.firestore.LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait desc
    extends StObject
       with OrderByDirection
       with typings.firebase.mod.firebase.firestore.OrderByDirection
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
       with typings.firebase.mod.default.firestore.LogLevel
       with typings.firebase.mod.firebase.remoteConfig.LogLevel
       with typings.firebase.mod.firebase.LogLevel
       with typings.firebase.mod.firebase.firestore.LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait estimate extends StObject
  inline def estimate: estimate = "estimate".asInstanceOf[estimate]
  
  @js.native
  sealed trait exception
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def exception: exception = "exception".asInstanceOf[exception]
  
  @js.native
  sealed trait `failed-precondition`
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def `failed-precondition`: `failed-precondition` = "failed-precondition".asInstanceOf[`failed-precondition`]
  
  @js.native
  sealed trait failure
    extends StObject
       with FetchStatus
       with typings.firebase.mod.firebase.remoteConfig.FetchStatus
  inline def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait generate_lead
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def generate_lead: generate_lead = "generate_lead".asInstanceOf[generate_lead]
  
  @js.native
  sealed trait in
    extends StObject
       with WhereFilterOp
       with typings.firebase.mod.firebase.firestore.WhereFilterOp
  inline def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait info
    extends StObject
       with typings.firebase.mod.firebase.LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait internal
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait `invalid-argument`
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def `invalid-argument`: `invalid-argument` = "invalid-argument".asInstanceOf[`invalid-argument`]
  
  @js.native
  sealed trait login
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def login: login = "login".asInstanceOf[login]
  
  @js.native
  sealed trait modified
    extends StObject
       with DocumentChangeType
       with typings.firebase.mod.firebase.firestore.DocumentChangeType
  inline def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait `no-fetch-yet`
    extends StObject
       with FetchStatus
       with typings.firebase.mod.firebase.remoteConfig.FetchStatus
  inline def `no-fetch-yet`: `no-fetch-yet` = "no-fetch-yet".asInstanceOf[`no-fetch-yet`]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait `not-found`
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def `not-found`: `not-found` = "not-found".asInstanceOf[`not-found`]
  
  @js.native
  sealed trait `not-in`
    extends StObject
       with WhereFilterOp
       with typings.firebase.mod.firebase.firestore.WhereFilterOp
  inline def `not-in`: `not-in` = "not-in".asInstanceOf[`not-in`]
  
  @js.native
  sealed trait ok
    extends StObject
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait `out-of-range`
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def `out-of-range`: `out-of-range` = "out-of-range".asInstanceOf[`out-of-range`]
  
  @js.native
  sealed trait page_view
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def page_view: page_view = "page_view".asInstanceOf[page_view]
  
  @js.native
  sealed trait `permission-denied`
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def `permission-denied`: `permission-denied` = "permission-denied".asInstanceOf[`permission-denied`]
  
  @js.native
  sealed trait previous extends StObject
  inline def previous: previous = "previous".asInstanceOf[previous]
  
  @js.native
  sealed trait purchase
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def purchase: purchase = "purchase".asInstanceOf[purchase]
  
  @js.native
  sealed trait refund
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def refund: refund = "refund".asInstanceOf[refund]
  
  @js.native
  sealed trait remote
    extends StObject
       with ValueSource
       with typings.firebase.mod.firebase.remoteConfig.ValueSource
  inline def remote: remote = "remote".asInstanceOf[remote]
  
  @js.native
  sealed trait remove_from_cart
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def remove_from_cart: remove_from_cart = "remove_from_cart".asInstanceOf[remove_from_cart]
  
  @js.native
  sealed trait removed
    extends StObject
       with DocumentChangeType
       with typings.firebase.mod.firebase.firestore.DocumentChangeType
  inline def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait `resource-exhausted`
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def `resource-exhausted`: `resource-exhausted` = "resource-exhausted".asInstanceOf[`resource-exhausted`]
  
  @js.native
  sealed trait screen_view
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def screen_view: screen_view = "screen_view".asInstanceOf[screen_view]
  
  @js.native
  sealed trait search
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait select_content
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def select_content: select_content = "select_content".asInstanceOf[select_content]
  
  @js.native
  sealed trait select_item
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def select_item: select_item = "select_item".asInstanceOf[select_item]
  
  @js.native
  sealed trait select_promotion
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def select_promotion: select_promotion = "select_promotion".asInstanceOf[select_promotion]
  
  @js.native
  sealed trait server extends StObject
  inline def server: server = "server".asInstanceOf[server]
  
  @js.native
  sealed trait set_checkout_option
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def set_checkout_option: set_checkout_option = "set_checkout_option".asInstanceOf[set_checkout_option]
  
  @js.native
  sealed trait share
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def share: share = "share".asInstanceOf[share]
  
  @js.native
  sealed trait sign_up
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def sign_up: sign_up = "sign_up".asInstanceOf[sign_up]
  
  @js.native
  sealed trait silent
    extends StObject
       with LogLevel
       with typings.firebase.mod.default.firestore.LogLevel
       with typings.firebase.mod.firebase.remoteConfig.LogLevel
       with typings.firebase.mod.firebase.LogLevel
       with typings.firebase.mod.firebase.firestore.LogLevel
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait static
    extends StObject
       with ValueSource
       with typings.firebase.mod.firebase.remoteConfig.ValueSource
  inline def static: static = "static".asInstanceOf[static]
  
  @js.native
  sealed trait success
    extends StObject
       with FetchStatus
       with typings.firebase.mod.firebase.remoteConfig.FetchStatus
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait throttle
    extends StObject
       with FetchStatus
       with typings.firebase.mod.firebase.remoteConfig.FetchStatus
  inline def throttle: throttle = "throttle".asInstanceOf[throttle]
  
  @js.native
  sealed trait timing_complete
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def timing_complete: timing_complete = "timing_complete".asInstanceOf[timing_complete]
  
  @js.native
  sealed trait unauthenticated
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  
  @js.native
  sealed trait unavailable
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait unimplemented
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def unimplemented: unimplemented = "unimplemented".asInstanceOf[unimplemented]
  
  @js.native
  sealed trait unknown
    extends StObject
       with FirestoreErrorCode
       with typings.firebase.mod.firebase.firestore.FirestoreErrorCode
       with FunctionsErrorCode
       with typings.firebase.mod.firebase.functions.FunctionsErrorCode
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait value
    extends StObject
       with EventType
  inline def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait verbose
    extends StObject
       with typings.firebase.mod.firebase.LogLevel
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait view_cart
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def view_cart: view_cart = "view_cart".asInstanceOf[view_cart]
  
  @js.native
  sealed trait view_item
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def view_item: view_item = "view_item".asInstanceOf[view_item]
  
  @js.native
  sealed trait view_item_list
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def view_item_list: view_item_list = "view_item_list".asInstanceOf[view_item_list]
  
  @js.native
  sealed trait view_promotion
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def view_promotion: view_promotion = "view_promotion".asInstanceOf[view_promotion]
  
  @js.native
  sealed trait view_search_results
    extends StObject
       with EventNameString
       with typings.firebase.mod.firebase.analytics.EventNameString
  inline def view_search_results: view_search_results = "view_search_results".asInstanceOf[view_search_results]
  
  @js.native
  sealed trait warn
    extends StObject
       with typings.firebase.mod.firebase.LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
}
