package typings.firebaseAnalytics

import typings.firebaseAnalytics.distEsmSrcErrorsMod.AnalyticsError
import typings.firebaseAnalytics.distSrcConstantsMod.GtagCommand
import typings.firebaseAnalytics.distSrcPublicTypesMod.ConsentStatusString
import typings.firebaseAnalytics.distSrcPublicTypesMod.EventNameString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseAnalyticsStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait add_payment_info
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def add_payment_info: add_payment_info = "add_payment_info".asInstanceOf[add_payment_info]
  
  @js.native
  sealed trait add_shipping_info
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def add_shipping_info: add_shipping_info = "add_shipping_info".asInstanceOf[add_shipping_info]
  
  @js.native
  sealed trait add_to_cart
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def add_to_cart: add_to_cart = "add_to_cart".asInstanceOf[add_to_cart]
  
  @js.native
  sealed trait add_to_wishlist
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def add_to_wishlist: add_to_wishlist = "add_to_wishlist".asInstanceOf[add_to_wishlist]
  
  @js.native
  sealed trait `already-exists`
    extends StObject
       with AnalyticsError
       with typings.firebaseAnalytics.distSrcErrorsMod.AnalyticsError
  inline def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  
  @js.native
  sealed trait `already-initialized`
    extends StObject
       with AnalyticsError
       with typings.firebaseAnalytics.distSrcErrorsMod.AnalyticsError
  inline def `already-initialized`: `already-initialized` = "already-initialized".asInstanceOf[`already-initialized`]
  
  @js.native
  sealed trait `already-initialized-settings`
    extends StObject
       with AnalyticsError
       with typings.firebaseAnalytics.distSrcErrorsMod.AnalyticsError
  inline def `already-initialized-settings`: `already-initialized-settings` = "already-initialized-settings".asInstanceOf[`already-initialized-settings`]
  
  @js.native
  sealed trait begin_checkout
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def begin_checkout: begin_checkout = "begin_checkout".asInstanceOf[begin_checkout]
  
  @js.native
  sealed trait checkout_progress
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def checkout_progress: checkout_progress = "checkout_progress".asInstanceOf[checkout_progress]
  
  @js.native
  sealed trait config
    extends StObject
       with GtagCommand
       with typings.firebaseAnalytics.distEsmSrcConstantsMod.GtagCommand
  inline def config: config = "config".asInstanceOf[config]
  
  @js.native
  sealed trait `config-fetch-failed`
    extends StObject
       with AnalyticsError
       with typings.firebaseAnalytics.distSrcErrorsMod.AnalyticsError
  inline def `config-fetch-failed`: `config-fetch-failed` = "config-fetch-failed".asInstanceOf[`config-fetch-failed`]
  
  @js.native
  sealed trait consent
    extends StObject
       with GtagCommand
       with typings.firebaseAnalytics.distEsmSrcConstantsMod.GtagCommand
  inline def consent: consent = "consent".asInstanceOf[consent]
  
  @js.native
  sealed trait denied
    extends StObject
       with ConsentStatusString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.ConsentStatusString
       with typings.firebaseAnalytics.mod.ConsentStatusString
       with typings.firebaseAnalytics.distAnalyticsMod.ConsentStatusString
  inline def denied: denied = "denied".asInstanceOf[denied]
  
  @js.native
  sealed trait event
    extends StObject
       with GtagCommand
       with typings.firebaseAnalytics.distEsmSrcConstantsMod.GtagCommand
  inline def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait exception
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def exception: exception = "exception".asInstanceOf[exception]
  
  @js.native
  sealed trait `fetch-throttle`
    extends StObject
       with AnalyticsError
       with typings.firebaseAnalytics.distSrcErrorsMod.AnalyticsError
  inline def `fetch-throttle`: `fetch-throttle` = "fetch-throttle".asInstanceOf[`fetch-throttle`]
  
  @js.native
  sealed trait generate_lead
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def generate_lead: generate_lead = "generate_lead".asInstanceOf[generate_lead]
  
  @js.native
  sealed trait granted
    extends StObject
       with ConsentStatusString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.ConsentStatusString
       with typings.firebaseAnalytics.mod.ConsentStatusString
       with typings.firebaseAnalytics.distAnalyticsMod.ConsentStatusString
  inline def granted: granted = "granted".asInstanceOf[granted]
  
  @js.native
  sealed trait `indexeddb-unavailable`
    extends StObject
       with AnalyticsError
       with typings.firebaseAnalytics.distSrcErrorsMod.AnalyticsError
  inline def `indexeddb-unavailable`: `indexeddb-unavailable` = "indexeddb-unavailable".asInstanceOf[`indexeddb-unavailable`]
  
  @js.native
  sealed trait `interop-component-reg-failed`
    extends StObject
       with AnalyticsError
       with typings.firebaseAnalytics.distSrcErrorsMod.AnalyticsError
  inline def `interop-component-reg-failed`: `interop-component-reg-failed` = "interop-component-reg-failed".asInstanceOf[`interop-component-reg-failed`]
  
  @js.native
  sealed trait `invalid-analytics-context`
    extends StObject
       with AnalyticsError
       with typings.firebaseAnalytics.distSrcErrorsMod.AnalyticsError
  inline def `invalid-analytics-context`: `invalid-analytics-context` = "invalid-analytics-context".asInstanceOf[`invalid-analytics-context`]
  
  @js.native
  sealed trait login
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def login: login = "login".asInstanceOf[login]
  
  @js.native
  sealed trait `no-api-key`
    extends StObject
       with AnalyticsError
       with typings.firebaseAnalytics.distSrcErrorsMod.AnalyticsError
  inline def `no-api-key`: `no-api-key` = "no-api-key".asInstanceOf[`no-api-key`]
  
  @js.native
  sealed trait `no-app-id`
    extends StObject
       with AnalyticsError
       with typings.firebaseAnalytics.distSrcErrorsMod.AnalyticsError
  inline def `no-app-id`: `no-app-id` = "no-app-id".asInstanceOf[`no-app-id`]
  
  @js.native
  sealed trait page_view
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def page_view: page_view = "page_view".asInstanceOf[page_view]
  
  @js.native
  sealed trait purchase
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def purchase: purchase = "purchase".asInstanceOf[purchase]
  
  @js.native
  sealed trait refund
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def refund: refund = "refund".asInstanceOf[refund]
  
  @js.native
  sealed trait remove_from_cart
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def remove_from_cart: remove_from_cart = "remove_from_cart".asInstanceOf[remove_from_cart]
  
  @js.native
  sealed trait screen_view
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def screen_view: screen_view = "screen_view".asInstanceOf[screen_view]
  
  @js.native
  sealed trait search
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait select_content
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def select_content: select_content = "select_content".asInstanceOf[select_content]
  
  @js.native
  sealed trait select_item
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def select_item: select_item = "select_item".asInstanceOf[select_item]
  
  @js.native
  sealed trait select_promotion
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def select_promotion: select_promotion = "select_promotion".asInstanceOf[select_promotion]
  
  @js.native
  sealed trait set
    extends StObject
       with GtagCommand
       with typings.firebaseAnalytics.distEsmSrcConstantsMod.GtagCommand
  inline def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait set_checkout_option
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def set_checkout_option: set_checkout_option = "set_checkout_option".asInstanceOf[set_checkout_option]
  
  @js.native
  sealed trait share
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def share: share = "share".asInstanceOf[share]
  
  @js.native
  sealed trait sign_up
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def sign_up: sign_up = "sign_up".asInstanceOf[sign_up]
  
  @js.native
  sealed trait timing_complete
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def timing_complete: timing_complete = "timing_complete".asInstanceOf[timing_complete]
  
  @js.native
  sealed trait update extends StObject
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait view_cart
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def view_cart: view_cart = "view_cart".asInstanceOf[view_cart]
  
  @js.native
  sealed trait view_item
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def view_item: view_item = "view_item".asInstanceOf[view_item]
  
  @js.native
  sealed trait view_item_list
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def view_item_list: view_item_list = "view_item_list".asInstanceOf[view_item_list]
  
  @js.native
  sealed trait view_promotion
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def view_promotion: view_promotion = "view_promotion".asInstanceOf[view_promotion]
  
  @js.native
  sealed trait view_search_results
    extends StObject
       with EventNameString
       with typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventNameString
       with typings.firebaseAnalytics.mod.EventNameString
       with typings.firebaseAnalytics.distAnalyticsMod.EventNameString
  inline def view_search_results: view_search_results = "view_search_results".asInstanceOf[view_search_results]
}
