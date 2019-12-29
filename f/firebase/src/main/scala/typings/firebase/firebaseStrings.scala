package typings.firebase

import typings.firebase.firebaseMod.analytics.EventNameString
import typings.firebase.firebaseMod.database.EventType
import typings.firebase.firebaseMod.firestore.DocumentChangeType
import typings.firebase.firebaseMod.firestore.FirestoreErrorCode
import typings.firebase.firebaseMod.firestore.OrderByDirection
import typings.firebase.firebaseMod.firestore.WhereFilterOp
import typings.firebase.firebaseMod.functions.FunctionsErrorCode
import typings.firebase.firebaseMod.remoteConfig.FetchStatus
import typings.firebase.firebaseMod.remoteConfig.LogLevel
import typings.firebase.firebaseMod.remoteConfig.ValueSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object firebaseStrings {
  @js.native
  sealed trait EqualssignEqualssign extends WhereFilterOp
  
  @js.native
  sealed trait Greaterthansign extends WhereFilterOp
  
  @js.native
  sealed trait GreaterthansignEqualssign extends WhereFilterOp
  
  @js.native
  sealed trait Lessthansign extends WhereFilterOp
  
  @js.native
  sealed trait LessthansignEqualssign extends WhereFilterOp
  
  @js.native
  sealed trait aborted
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait add_payment_info extends EventNameString
  
  @js.native
  sealed trait add_to_cart extends EventNameString
  
  @js.native
  sealed trait add_to_wishlist extends EventNameString
  
  @js.native
  sealed trait added extends DocumentChangeType
  
  @js.native
  sealed trait `already-exists`
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait `array-contains` extends WhereFilterOp
  
  @js.native
  sealed trait `array-contains-any` extends WhereFilterOp
  
  @js.native
  sealed trait asc extends OrderByDirection
  
  @js.native
  sealed trait begin_checkout extends EventNameString
  
  @js.native
  sealed trait cache extends js.Object
  
  @js.native
  sealed trait cancelled
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait checkout_progress extends EventNameString
  
  @js.native
  sealed trait child_added extends EventType
  
  @js.native
  sealed trait child_changed extends EventType
  
  @js.native
  sealed trait child_moved extends EventType
  
  @js.native
  sealed trait child_removed extends EventType
  
  @js.native
  sealed trait `data-loss`
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait `deadline-exceeded`
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait debug
    extends LogLevel
       with typings.firebase.firebaseMod.firestore.LogLevel
  
  @js.native
  sealed trait default extends ValueSource
  
  @js.native
  sealed trait desc extends OrderByDirection
  
  @js.native
  sealed trait error
    extends LogLevel
       with typings.firebase.firebaseMod.firestore.LogLevel
  
  @js.native
  sealed trait estimate extends js.Object
  
  @js.native
  sealed trait exception extends EventNameString
  
  @js.native
  sealed trait `failed-precondition`
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait failure extends FetchStatus
  
  @js.native
  sealed trait generate_lead extends EventNameString
  
  @js.native
  sealed trait in extends WhereFilterOp
  
  @js.native
  sealed trait internal
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait `invalid-argument`
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait login extends EventNameString
  
  @js.native
  sealed trait modified extends DocumentChangeType
  
  @js.native
  sealed trait `no-fetch-yet` extends FetchStatus
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait `not-found`
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait ok extends FunctionsErrorCode
  
  @js.native
  sealed trait `out-of-range`
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait page_view extends EventNameString
  
  @js.native
  sealed trait `permission-denied`
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait previous extends js.Object
  
  @js.native
  sealed trait purchase extends EventNameString
  
  @js.native
  sealed trait refund extends EventNameString
  
  @js.native
  sealed trait remote extends ValueSource
  
  @js.native
  sealed trait remove_from_cart extends EventNameString
  
  @js.native
  sealed trait removed extends DocumentChangeType
  
  @js.native
  sealed trait `resource-exhausted`
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait screen_view extends EventNameString
  
  @js.native
  sealed trait search extends EventNameString
  
  @js.native
  sealed trait select_content extends EventNameString
  
  @js.native
  sealed trait server extends js.Object
  
  @js.native
  sealed trait set_checkout_option extends EventNameString
  
  @js.native
  sealed trait share extends EventNameString
  
  @js.native
  sealed trait sign_up extends EventNameString
  
  @js.native
  sealed trait silent
    extends LogLevel
       with typings.firebase.firebaseMod.firestore.LogLevel
  
  @js.native
  sealed trait static extends ValueSource
  
  @js.native
  sealed trait success extends FetchStatus
  
  @js.native
  sealed trait throttle extends FetchStatus
  
  @js.native
  sealed trait timing_complete extends EventNameString
  
  @js.native
  sealed trait unauthenticated
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait unavailable
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait unimplemented
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait unknown
    extends FirestoreErrorCode
       with FunctionsErrorCode
  
  @js.native
  sealed trait value extends EventType
  
  @js.native
  sealed trait view_item extends EventNameString
  
  @js.native
  sealed trait view_item_list extends EventNameString
  
  @js.native
  sealed trait view_promotion extends EventNameString
  
  @js.native
  sealed trait view_search_results extends EventNameString
  
  @scala.inline
  def EqualssignEqualssign: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  @scala.inline
  def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  @scala.inline
  def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  @scala.inline
  def add_payment_info: add_payment_info = "add_payment_info".asInstanceOf[add_payment_info]
  @scala.inline
  def add_to_cart: add_to_cart = "add_to_cart".asInstanceOf[add_to_cart]
  @scala.inline
  def add_to_wishlist: add_to_wishlist = "add_to_wishlist".asInstanceOf[add_to_wishlist]
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  @scala.inline
  def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  @scala.inline
  def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  @scala.inline
  def `array-contains-any`: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def begin_checkout: begin_checkout = "begin_checkout".asInstanceOf[begin_checkout]
  @scala.inline
  def cache: cache = "cache".asInstanceOf[cache]
  @scala.inline
  def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  @scala.inline
  def checkout_progress: checkout_progress = "checkout_progress".asInstanceOf[checkout_progress]
  @scala.inline
  def child_added: child_added = "child_added".asInstanceOf[child_added]
  @scala.inline
  def child_changed: child_changed = "child_changed".asInstanceOf[child_changed]
  @scala.inline
  def child_moved: child_moved = "child_moved".asInstanceOf[child_moved]
  @scala.inline
  def child_removed: child_removed = "child_removed".asInstanceOf[child_removed]
  @scala.inline
  def `data-loss`: `data-loss` = "data-loss".asInstanceOf[`data-loss`]
  @scala.inline
  def `deadline-exceeded`: `deadline-exceeded` = "deadline-exceeded".asInstanceOf[`deadline-exceeded`]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def estimate: estimate = "estimate".asInstanceOf[estimate]
  @scala.inline
  def exception: exception = "exception".asInstanceOf[exception]
  @scala.inline
  def `failed-precondition`: `failed-precondition` = "failed-precondition".asInstanceOf[`failed-precondition`]
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  @scala.inline
  def generate_lead: generate_lead = "generate_lead".asInstanceOf[generate_lead]
  @scala.inline
  def in: in = "in".asInstanceOf[in]
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  @scala.inline
  def `invalid-argument`: `invalid-argument` = "invalid-argument".asInstanceOf[`invalid-argument`]
  @scala.inline
  def login: login = "login".asInstanceOf[login]
  @scala.inline
  def modified: modified = "modified".asInstanceOf[modified]
  @scala.inline
  def `no-fetch-yet`: `no-fetch-yet` = "no-fetch-yet".asInstanceOf[`no-fetch-yet`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def `not-found`: `not-found` = "not-found".asInstanceOf[`not-found`]
  @scala.inline
  def ok: ok = "ok".asInstanceOf[ok]
  @scala.inline
  def `out-of-range`: `out-of-range` = "out-of-range".asInstanceOf[`out-of-range`]
  @scala.inline
  def page_view: page_view = "page_view".asInstanceOf[page_view]
  @scala.inline
  def `permission-denied`: `permission-denied` = "permission-denied".asInstanceOf[`permission-denied`]
  @scala.inline
  def previous: previous = "previous".asInstanceOf[previous]
  @scala.inline
  def purchase: purchase = "purchase".asInstanceOf[purchase]
  @scala.inline
  def refund: refund = "refund".asInstanceOf[refund]
  @scala.inline
  def remote: remote = "remote".asInstanceOf[remote]
  @scala.inline
  def remove_from_cart: remove_from_cart = "remove_from_cart".asInstanceOf[remove_from_cart]
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  @scala.inline
  def `resource-exhausted`: `resource-exhausted` = "resource-exhausted".asInstanceOf[`resource-exhausted`]
  @scala.inline
  def screen_view: screen_view = "screen_view".asInstanceOf[screen_view]
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  @scala.inline
  def select_content: select_content = "select_content".asInstanceOf[select_content]
  @scala.inline
  def server: server = "server".asInstanceOf[server]
  @scala.inline
  def set_checkout_option: set_checkout_option = "set_checkout_option".asInstanceOf[set_checkout_option]
  @scala.inline
  def share: share = "share".asInstanceOf[share]
  @scala.inline
  def sign_up: sign_up = "sign_up".asInstanceOf[sign_up]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def static: static = "static".asInstanceOf[static]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def throttle: throttle = "throttle".asInstanceOf[throttle]
  @scala.inline
  def timing_complete: timing_complete = "timing_complete".asInstanceOf[timing_complete]
  @scala.inline
  def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  @scala.inline
  def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  @scala.inline
  def unimplemented: unimplemented = "unimplemented".asInstanceOf[unimplemented]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def value: value = "value".asInstanceOf[value]
  @scala.inline
  def view_item: view_item = "view_item".asInstanceOf[view_item]
  @scala.inline
  def view_item_list: view_item_list = "view_item_list".asInstanceOf[view_item_list]
  @scala.inline
  def view_promotion: view_promotion = "view_promotion".asInstanceOf[view_promotion]
  @scala.inline
  def view_search_results: view_search_results = "view_search_results".asInstanceOf[view_search_results]
}

