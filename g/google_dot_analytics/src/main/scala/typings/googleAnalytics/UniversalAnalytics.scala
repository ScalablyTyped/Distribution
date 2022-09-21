package typings.googleAnalytics

import typings.googleAnalytics.anon.EventAction
import typings.googleAnalytics.anon.EventCategory
import typings.googleAnalytics.anon.SocialAction
import typings.googleAnalytics.anon.TimingCategory
import typings.googleAnalytics.googleAnalyticsStrings.create
import typings.googleAnalytics.googleAnalyticsStrings.event
import typings.googleAnalytics.googleAnalyticsStrings.pageview
import typings.googleAnalytics.googleAnalyticsStrings.provide
import typings.googleAnalytics.googleAnalyticsStrings.remove
import typings.googleAnalytics.googleAnalyticsStrings.require
import typings.googleAnalytics.googleAnalyticsStrings.send
import typings.googleAnalytics.googleAnalyticsStrings.social
import typings.googleAnalytics.googleAnalyticsStrings.timing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UniversalAnalytics {
  
  // https://developers.google.com/analytics/devguides/collection/analyticsjs/field-reference
  trait FieldsObject extends StObject {
    
    var affiliation: js.UndefOr[String] = js.undefined
    
    var allowAnchor: js.UndefOr[Boolean] = js.undefined
    
    var allowLinker: js.UndefOr[Boolean] = js.undefined
    
    var alwaysSendReferrer: js.UndefOr[Boolean] = js.undefined
    
    var anonymizeIp: js.UndefOr[Boolean] = js.undefined
    
    var appId: js.UndefOr[String] = js.undefined
    
    var appInstallerId: js.UndefOr[String] = js.undefined
    
    var appName: js.UndefOr[String] = js.undefined
    
    var appVersion: js.UndefOr[String] = js.undefined
    
    var brand: js.UndefOr[String] = js.undefined
    
    var campaignContent: js.UndefOr[String] = js.undefined
    
    var campaignId: js.UndefOr[String] = js.undefined
    
    var campaignKeyword: js.UndefOr[String] = js.undefined
    
    var campaignMedium: js.UndefOr[String] = js.undefined
    
    var campaignName: js.UndefOr[String] = js.undefined
    
    var campaignSource: js.UndefOr[String] = js.undefined
    
    var category: js.UndefOr[String] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var contentGroup1: js.UndefOr[String] = js.undefined
    
    var contentGroup10: js.UndefOr[String] = js.undefined
    
    var contentGroup2: js.UndefOr[String] = js.undefined
    
    var contentGroup3: js.UndefOr[String] = js.undefined
    
    var contentGroup4: js.UndefOr[String] = js.undefined
    
    var contentGroup5: js.UndefOr[String] = js.undefined
    
    var contentGroup6: js.UndefOr[String] = js.undefined
    
    var contentGroup7: js.UndefOr[String] = js.undefined
    
    var contentGroup8: js.UndefOr[String] = js.undefined
    
    var contentGroup9: js.UndefOr[String] = js.undefined
    
    var cookieDomain: js.UndefOr[String] = js.undefined
    
    var cookieExpires: js.UndefOr[Double] = js.undefined
    
    var cookieFlags: js.UndefOr[String] = js.undefined
    
    var cookieName: js.UndefOr[String] = js.undefined
    
    var cookiePath: js.UndefOr[String] = js.undefined
    
    var cookieUpdate: js.UndefOr[Boolean] = js.undefined
    
    var coupon: js.UndefOr[String] = js.undefined
    
    var creative: js.UndefOr[String] = js.undefined
    
    var currencyCode: js.UndefOr[String] = js.undefined
    
    var dataSource: js.UndefOr[String] = js.undefined
    
    var dimension1: js.UndefOr[String] = js.undefined
    
    var dimension10: js.UndefOr[String] = js.undefined
    
    var dimension100: js.UndefOr[String] = js.undefined
    
    var dimension101: js.UndefOr[String] = js.undefined
    
    var dimension102: js.UndefOr[String] = js.undefined
    
    var dimension103: js.UndefOr[String] = js.undefined
    
    var dimension104: js.UndefOr[String] = js.undefined
    
    var dimension105: js.UndefOr[String] = js.undefined
    
    var dimension106: js.UndefOr[String] = js.undefined
    
    var dimension107: js.UndefOr[String] = js.undefined
    
    var dimension108: js.UndefOr[String] = js.undefined
    
    var dimension109: js.UndefOr[String] = js.undefined
    
    var dimension11: js.UndefOr[String] = js.undefined
    
    var dimension110: js.UndefOr[String] = js.undefined
    
    var dimension111: js.UndefOr[String] = js.undefined
    
    var dimension112: js.UndefOr[String] = js.undefined
    
    var dimension113: js.UndefOr[String] = js.undefined
    
    var dimension114: js.UndefOr[String] = js.undefined
    
    var dimension115: js.UndefOr[String] = js.undefined
    
    var dimension116: js.UndefOr[String] = js.undefined
    
    var dimension117: js.UndefOr[String] = js.undefined
    
    var dimension118: js.UndefOr[String] = js.undefined
    
    var dimension119: js.UndefOr[String] = js.undefined
    
    var dimension12: js.UndefOr[String] = js.undefined
    
    var dimension120: js.UndefOr[String] = js.undefined
    
    var dimension121: js.UndefOr[String] = js.undefined
    
    var dimension122: js.UndefOr[String] = js.undefined
    
    var dimension123: js.UndefOr[String] = js.undefined
    
    var dimension124: js.UndefOr[String] = js.undefined
    
    var dimension125: js.UndefOr[String] = js.undefined
    
    var dimension126: js.UndefOr[String] = js.undefined
    
    var dimension127: js.UndefOr[String] = js.undefined
    
    var dimension128: js.UndefOr[String] = js.undefined
    
    var dimension129: js.UndefOr[String] = js.undefined
    
    var dimension13: js.UndefOr[String] = js.undefined
    
    var dimension130: js.UndefOr[String] = js.undefined
    
    var dimension131: js.UndefOr[String] = js.undefined
    
    var dimension132: js.UndefOr[String] = js.undefined
    
    var dimension133: js.UndefOr[String] = js.undefined
    
    var dimension134: js.UndefOr[String] = js.undefined
    
    var dimension135: js.UndefOr[String] = js.undefined
    
    var dimension136: js.UndefOr[String] = js.undefined
    
    var dimension137: js.UndefOr[String] = js.undefined
    
    var dimension138: js.UndefOr[String] = js.undefined
    
    var dimension139: js.UndefOr[String] = js.undefined
    
    var dimension14: js.UndefOr[String] = js.undefined
    
    var dimension140: js.UndefOr[String] = js.undefined
    
    var dimension141: js.UndefOr[String] = js.undefined
    
    var dimension142: js.UndefOr[String] = js.undefined
    
    var dimension143: js.UndefOr[String] = js.undefined
    
    var dimension144: js.UndefOr[String] = js.undefined
    
    var dimension145: js.UndefOr[String] = js.undefined
    
    var dimension146: js.UndefOr[String] = js.undefined
    
    var dimension147: js.UndefOr[String] = js.undefined
    
    var dimension148: js.UndefOr[String] = js.undefined
    
    var dimension149: js.UndefOr[String] = js.undefined
    
    var dimension15: js.UndefOr[String] = js.undefined
    
    var dimension150: js.UndefOr[String] = js.undefined
    
    var dimension151: js.UndefOr[String] = js.undefined
    
    var dimension152: js.UndefOr[String] = js.undefined
    
    var dimension153: js.UndefOr[String] = js.undefined
    
    var dimension154: js.UndefOr[String] = js.undefined
    
    var dimension155: js.UndefOr[String] = js.undefined
    
    var dimension156: js.UndefOr[String] = js.undefined
    
    var dimension157: js.UndefOr[String] = js.undefined
    
    var dimension158: js.UndefOr[String] = js.undefined
    
    var dimension159: js.UndefOr[String] = js.undefined
    
    var dimension16: js.UndefOr[String] = js.undefined
    
    var dimension160: js.UndefOr[String] = js.undefined
    
    var dimension161: js.UndefOr[String] = js.undefined
    
    var dimension162: js.UndefOr[String] = js.undefined
    
    var dimension163: js.UndefOr[String] = js.undefined
    
    var dimension164: js.UndefOr[String] = js.undefined
    
    var dimension165: js.UndefOr[String] = js.undefined
    
    var dimension166: js.UndefOr[String] = js.undefined
    
    var dimension167: js.UndefOr[String] = js.undefined
    
    var dimension168: js.UndefOr[String] = js.undefined
    
    var dimension169: js.UndefOr[String] = js.undefined
    
    var dimension17: js.UndefOr[String] = js.undefined
    
    var dimension170: js.UndefOr[String] = js.undefined
    
    var dimension171: js.UndefOr[String] = js.undefined
    
    var dimension172: js.UndefOr[String] = js.undefined
    
    var dimension173: js.UndefOr[String] = js.undefined
    
    var dimension174: js.UndefOr[String] = js.undefined
    
    var dimension175: js.UndefOr[String] = js.undefined
    
    var dimension176: js.UndefOr[String] = js.undefined
    
    var dimension177: js.UndefOr[String] = js.undefined
    
    var dimension178: js.UndefOr[String] = js.undefined
    
    var dimension179: js.UndefOr[String] = js.undefined
    
    var dimension18: js.UndefOr[String] = js.undefined
    
    var dimension180: js.UndefOr[String] = js.undefined
    
    var dimension181: js.UndefOr[String] = js.undefined
    
    var dimension182: js.UndefOr[String] = js.undefined
    
    var dimension183: js.UndefOr[String] = js.undefined
    
    var dimension184: js.UndefOr[String] = js.undefined
    
    var dimension185: js.UndefOr[String] = js.undefined
    
    var dimension186: js.UndefOr[String] = js.undefined
    
    var dimension187: js.UndefOr[String] = js.undefined
    
    var dimension188: js.UndefOr[String] = js.undefined
    
    var dimension189: js.UndefOr[String] = js.undefined
    
    var dimension19: js.UndefOr[String] = js.undefined
    
    var dimension190: js.UndefOr[String] = js.undefined
    
    var dimension191: js.UndefOr[String] = js.undefined
    
    var dimension192: js.UndefOr[String] = js.undefined
    
    var dimension193: js.UndefOr[String] = js.undefined
    
    var dimension194: js.UndefOr[String] = js.undefined
    
    var dimension195: js.UndefOr[String] = js.undefined
    
    var dimension196: js.UndefOr[String] = js.undefined
    
    var dimension197: js.UndefOr[String] = js.undefined
    
    var dimension198: js.UndefOr[String] = js.undefined
    
    var dimension199: js.UndefOr[String] = js.undefined
    
    var dimension2: js.UndefOr[String] = js.undefined
    
    var dimension20: js.UndefOr[String] = js.undefined
    
    var dimension200: js.UndefOr[String] = js.undefined
    
    var dimension21: js.UndefOr[String] = js.undefined
    
    var dimension22: js.UndefOr[String] = js.undefined
    
    var dimension23: js.UndefOr[String] = js.undefined
    
    var dimension24: js.UndefOr[String] = js.undefined
    
    var dimension25: js.UndefOr[String] = js.undefined
    
    var dimension26: js.UndefOr[String] = js.undefined
    
    var dimension27: js.UndefOr[String] = js.undefined
    
    var dimension28: js.UndefOr[String] = js.undefined
    
    var dimension29: js.UndefOr[String] = js.undefined
    
    var dimension3: js.UndefOr[String] = js.undefined
    
    var dimension30: js.UndefOr[String] = js.undefined
    
    var dimension31: js.UndefOr[String] = js.undefined
    
    var dimension32: js.UndefOr[String] = js.undefined
    
    var dimension33: js.UndefOr[String] = js.undefined
    
    var dimension34: js.UndefOr[String] = js.undefined
    
    var dimension35: js.UndefOr[String] = js.undefined
    
    var dimension36: js.UndefOr[String] = js.undefined
    
    var dimension37: js.UndefOr[String] = js.undefined
    
    var dimension38: js.UndefOr[String] = js.undefined
    
    var dimension39: js.UndefOr[String] = js.undefined
    
    var dimension4: js.UndefOr[String] = js.undefined
    
    var dimension40: js.UndefOr[String] = js.undefined
    
    var dimension41: js.UndefOr[String] = js.undefined
    
    var dimension42: js.UndefOr[String] = js.undefined
    
    var dimension43: js.UndefOr[String] = js.undefined
    
    var dimension44: js.UndefOr[String] = js.undefined
    
    var dimension45: js.UndefOr[String] = js.undefined
    
    var dimension46: js.UndefOr[String] = js.undefined
    
    var dimension47: js.UndefOr[String] = js.undefined
    
    var dimension48: js.UndefOr[String] = js.undefined
    
    var dimension49: js.UndefOr[String] = js.undefined
    
    var dimension5: js.UndefOr[String] = js.undefined
    
    var dimension50: js.UndefOr[String] = js.undefined
    
    var dimension51: js.UndefOr[String] = js.undefined
    
    var dimension52: js.UndefOr[String] = js.undefined
    
    var dimension53: js.UndefOr[String] = js.undefined
    
    var dimension54: js.UndefOr[String] = js.undefined
    
    var dimension55: js.UndefOr[String] = js.undefined
    
    var dimension56: js.UndefOr[String] = js.undefined
    
    var dimension57: js.UndefOr[String] = js.undefined
    
    var dimension58: js.UndefOr[String] = js.undefined
    
    var dimension59: js.UndefOr[String] = js.undefined
    
    var dimension6: js.UndefOr[String] = js.undefined
    
    var dimension60: js.UndefOr[String] = js.undefined
    
    var dimension61: js.UndefOr[String] = js.undefined
    
    var dimension62: js.UndefOr[String] = js.undefined
    
    var dimension63: js.UndefOr[String] = js.undefined
    
    var dimension64: js.UndefOr[String] = js.undefined
    
    var dimension65: js.UndefOr[String] = js.undefined
    
    var dimension66: js.UndefOr[String] = js.undefined
    
    var dimension67: js.UndefOr[String] = js.undefined
    
    var dimension68: js.UndefOr[String] = js.undefined
    
    var dimension69: js.UndefOr[String] = js.undefined
    
    var dimension7: js.UndefOr[String] = js.undefined
    
    var dimension70: js.UndefOr[String] = js.undefined
    
    var dimension71: js.UndefOr[String] = js.undefined
    
    var dimension72: js.UndefOr[String] = js.undefined
    
    var dimension73: js.UndefOr[String] = js.undefined
    
    var dimension74: js.UndefOr[String] = js.undefined
    
    var dimension75: js.UndefOr[String] = js.undefined
    
    var dimension76: js.UndefOr[String] = js.undefined
    
    var dimension77: js.UndefOr[String] = js.undefined
    
    var dimension78: js.UndefOr[String] = js.undefined
    
    var dimension79: js.UndefOr[String] = js.undefined
    
    var dimension8: js.UndefOr[String] = js.undefined
    
    var dimension80: js.UndefOr[String] = js.undefined
    
    var dimension81: js.UndefOr[String] = js.undefined
    
    var dimension82: js.UndefOr[String] = js.undefined
    
    var dimension83: js.UndefOr[String] = js.undefined
    
    var dimension84: js.UndefOr[String] = js.undefined
    
    var dimension85: js.UndefOr[String] = js.undefined
    
    var dimension86: js.UndefOr[String] = js.undefined
    
    var dimension87: js.UndefOr[String] = js.undefined
    
    var dimension88: js.UndefOr[String] = js.undefined
    
    var dimension89: js.UndefOr[String] = js.undefined
    
    var dimension9: js.UndefOr[String] = js.undefined
    
    var dimension90: js.UndefOr[String] = js.undefined
    
    var dimension91: js.UndefOr[String] = js.undefined
    
    var dimension92: js.UndefOr[String] = js.undefined
    
    var dimension93: js.UndefOr[String] = js.undefined
    
    var dimension94: js.UndefOr[String] = js.undefined
    
    var dimension95: js.UndefOr[String] = js.undefined
    
    var dimension96: js.UndefOr[String] = js.undefined
    
    var dimension97: js.UndefOr[String] = js.undefined
    
    var dimension98: js.UndefOr[String] = js.undefined
    
    var dimension99: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var eventAction: js.UndefOr[String] = js.undefined
    
    var eventCategory: js.UndefOr[String] = js.undefined
    
    var eventLabel: js.UndefOr[String] = js.undefined
    
    var eventValue: js.UndefOr[Double] = js.undefined
    
    var exDescription: js.UndefOr[String] = js.undefined
    
    var exFatal: js.UndefOr[Boolean] = js.undefined
    
    var expId: js.UndefOr[String] = js.undefined
    
    var expVar: js.UndefOr[String] = js.undefined
    
    var flashVersion: js.UndefOr[String] = js.undefined
    
    var forceSSL: js.UndefOr[Boolean] = js.undefined
    
    var hitCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var hitType: js.UndefOr[HitType] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var javaEnabled: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var legacyCookieDomain: js.UndefOr[String] = js.undefined
    
    var legacyHistoryImport: js.UndefOr[Boolean] = js.undefined
    
    var linkid: js.UndefOr[String] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var metric1: js.UndefOr[String | Double] = js.undefined
    
    var metric10: js.UndefOr[String | Double] = js.undefined
    
    var metric100: js.UndefOr[String | Double] = js.undefined
    
    var metric101: js.UndefOr[String | Double] = js.undefined
    
    var metric102: js.UndefOr[String | Double] = js.undefined
    
    var metric103: js.UndefOr[String | Double] = js.undefined
    
    var metric104: js.UndefOr[String | Double] = js.undefined
    
    var metric105: js.UndefOr[String | Double] = js.undefined
    
    var metric106: js.UndefOr[String | Double] = js.undefined
    
    var metric107: js.UndefOr[String | Double] = js.undefined
    
    var metric108: js.UndefOr[String | Double] = js.undefined
    
    var metric109: js.UndefOr[String | Double] = js.undefined
    
    var metric11: js.UndefOr[String | Double] = js.undefined
    
    var metric110: js.UndefOr[String | Double] = js.undefined
    
    var metric111: js.UndefOr[String | Double] = js.undefined
    
    var metric112: js.UndefOr[String | Double] = js.undefined
    
    var metric113: js.UndefOr[String | Double] = js.undefined
    
    var metric114: js.UndefOr[String | Double] = js.undefined
    
    var metric115: js.UndefOr[String | Double] = js.undefined
    
    var metric116: js.UndefOr[String | Double] = js.undefined
    
    var metric117: js.UndefOr[String | Double] = js.undefined
    
    var metric118: js.UndefOr[String | Double] = js.undefined
    
    var metric119: js.UndefOr[String | Double] = js.undefined
    
    var metric12: js.UndefOr[String | Double] = js.undefined
    
    var metric120: js.UndefOr[String | Double] = js.undefined
    
    var metric121: js.UndefOr[String | Double] = js.undefined
    
    var metric122: js.UndefOr[String | Double] = js.undefined
    
    var metric123: js.UndefOr[String | Double] = js.undefined
    
    var metric124: js.UndefOr[String | Double] = js.undefined
    
    var metric125: js.UndefOr[String | Double] = js.undefined
    
    var metric126: js.UndefOr[String | Double] = js.undefined
    
    var metric127: js.UndefOr[String | Double] = js.undefined
    
    var metric128: js.UndefOr[String | Double] = js.undefined
    
    var metric129: js.UndefOr[String | Double] = js.undefined
    
    var metric13: js.UndefOr[String | Double] = js.undefined
    
    var metric130: js.UndefOr[String | Double] = js.undefined
    
    var metric131: js.UndefOr[String | Double] = js.undefined
    
    var metric132: js.UndefOr[String | Double] = js.undefined
    
    var metric133: js.UndefOr[String | Double] = js.undefined
    
    var metric134: js.UndefOr[String | Double] = js.undefined
    
    var metric135: js.UndefOr[String | Double] = js.undefined
    
    var metric136: js.UndefOr[String | Double] = js.undefined
    
    var metric137: js.UndefOr[String | Double] = js.undefined
    
    var metric138: js.UndefOr[String | Double] = js.undefined
    
    var metric139: js.UndefOr[String | Double] = js.undefined
    
    var metric14: js.UndefOr[String | Double] = js.undefined
    
    var metric140: js.UndefOr[String | Double] = js.undefined
    
    var metric141: js.UndefOr[String | Double] = js.undefined
    
    var metric142: js.UndefOr[String | Double] = js.undefined
    
    var metric143: js.UndefOr[String | Double] = js.undefined
    
    var metric144: js.UndefOr[String | Double] = js.undefined
    
    var metric145: js.UndefOr[String | Double] = js.undefined
    
    var metric146: js.UndefOr[String | Double] = js.undefined
    
    var metric147: js.UndefOr[String | Double] = js.undefined
    
    var metric148: js.UndefOr[String | Double] = js.undefined
    
    var metric149: js.UndefOr[String | Double] = js.undefined
    
    var metric15: js.UndefOr[String | Double] = js.undefined
    
    var metric150: js.UndefOr[String | Double] = js.undefined
    
    var metric151: js.UndefOr[String | Double] = js.undefined
    
    var metric152: js.UndefOr[String | Double] = js.undefined
    
    var metric153: js.UndefOr[String | Double] = js.undefined
    
    var metric154: js.UndefOr[String | Double] = js.undefined
    
    var metric155: js.UndefOr[String | Double] = js.undefined
    
    var metric156: js.UndefOr[String | Double] = js.undefined
    
    var metric157: js.UndefOr[String | Double] = js.undefined
    
    var metric158: js.UndefOr[String | Double] = js.undefined
    
    var metric159: js.UndefOr[String | Double] = js.undefined
    
    var metric16: js.UndefOr[String | Double] = js.undefined
    
    var metric160: js.UndefOr[String | Double] = js.undefined
    
    var metric161: js.UndefOr[String | Double] = js.undefined
    
    var metric162: js.UndefOr[String | Double] = js.undefined
    
    var metric163: js.UndefOr[String | Double] = js.undefined
    
    var metric164: js.UndefOr[String | Double] = js.undefined
    
    var metric165: js.UndefOr[String | Double] = js.undefined
    
    var metric166: js.UndefOr[String | Double] = js.undefined
    
    var metric167: js.UndefOr[String | Double] = js.undefined
    
    var metric168: js.UndefOr[String | Double] = js.undefined
    
    var metric169: js.UndefOr[String | Double] = js.undefined
    
    var metric17: js.UndefOr[String | Double] = js.undefined
    
    var metric170: js.UndefOr[String | Double] = js.undefined
    
    var metric171: js.UndefOr[String | Double] = js.undefined
    
    var metric172: js.UndefOr[String | Double] = js.undefined
    
    var metric173: js.UndefOr[String | Double] = js.undefined
    
    var metric174: js.UndefOr[String | Double] = js.undefined
    
    var metric175: js.UndefOr[String | Double] = js.undefined
    
    var metric176: js.UndefOr[String | Double] = js.undefined
    
    var metric177: js.UndefOr[String | Double] = js.undefined
    
    var metric178: js.UndefOr[String | Double] = js.undefined
    
    var metric179: js.UndefOr[String | Double] = js.undefined
    
    var metric18: js.UndefOr[String | Double] = js.undefined
    
    var metric180: js.UndefOr[String | Double] = js.undefined
    
    var metric181: js.UndefOr[String | Double] = js.undefined
    
    var metric182: js.UndefOr[String | Double] = js.undefined
    
    var metric183: js.UndefOr[String | Double] = js.undefined
    
    var metric184: js.UndefOr[String | Double] = js.undefined
    
    var metric185: js.UndefOr[String | Double] = js.undefined
    
    var metric186: js.UndefOr[String | Double] = js.undefined
    
    var metric187: js.UndefOr[String | Double] = js.undefined
    
    var metric188: js.UndefOr[String | Double] = js.undefined
    
    var metric189: js.UndefOr[String | Double] = js.undefined
    
    var metric19: js.UndefOr[String | Double] = js.undefined
    
    var metric190: js.UndefOr[String | Double] = js.undefined
    
    var metric191: js.UndefOr[String | Double] = js.undefined
    
    var metric192: js.UndefOr[String | Double] = js.undefined
    
    var metric193: js.UndefOr[String | Double] = js.undefined
    
    var metric194: js.UndefOr[String | Double] = js.undefined
    
    var metric195: js.UndefOr[String | Double] = js.undefined
    
    var metric196: js.UndefOr[String | Double] = js.undefined
    
    var metric197: js.UndefOr[String | Double] = js.undefined
    
    var metric198: js.UndefOr[String | Double] = js.undefined
    
    var metric199: js.UndefOr[String | Double] = js.undefined
    
    var metric2: js.UndefOr[String | Double] = js.undefined
    
    var metric20: js.UndefOr[String | Double] = js.undefined
    
    var metric200: js.UndefOr[String | Double] = js.undefined
    
    var metric21: js.UndefOr[String | Double] = js.undefined
    
    var metric22: js.UndefOr[String | Double] = js.undefined
    
    var metric23: js.UndefOr[String | Double] = js.undefined
    
    var metric24: js.UndefOr[String | Double] = js.undefined
    
    var metric25: js.UndefOr[String | Double] = js.undefined
    
    var metric26: js.UndefOr[String | Double] = js.undefined
    
    var metric27: js.UndefOr[String | Double] = js.undefined
    
    var metric28: js.UndefOr[String | Double] = js.undefined
    
    var metric29: js.UndefOr[String | Double] = js.undefined
    
    var metric3: js.UndefOr[String | Double] = js.undefined
    
    var metric30: js.UndefOr[String | Double] = js.undefined
    
    var metric31: js.UndefOr[String | Double] = js.undefined
    
    var metric32: js.UndefOr[String | Double] = js.undefined
    
    var metric33: js.UndefOr[String | Double] = js.undefined
    
    var metric34: js.UndefOr[String | Double] = js.undefined
    
    var metric35: js.UndefOr[String | Double] = js.undefined
    
    var metric36: js.UndefOr[String | Double] = js.undefined
    
    var metric37: js.UndefOr[String | Double] = js.undefined
    
    var metric38: js.UndefOr[String | Double] = js.undefined
    
    var metric39: js.UndefOr[String | Double] = js.undefined
    
    var metric4: js.UndefOr[String | Double] = js.undefined
    
    var metric40: js.UndefOr[String | Double] = js.undefined
    
    var metric41: js.UndefOr[String | Double] = js.undefined
    
    var metric42: js.UndefOr[String | Double] = js.undefined
    
    var metric43: js.UndefOr[String | Double] = js.undefined
    
    var metric44: js.UndefOr[String | Double] = js.undefined
    
    var metric45: js.UndefOr[String | Double] = js.undefined
    
    var metric46: js.UndefOr[String | Double] = js.undefined
    
    var metric47: js.UndefOr[String | Double] = js.undefined
    
    var metric48: js.UndefOr[String | Double] = js.undefined
    
    var metric49: js.UndefOr[String | Double] = js.undefined
    
    var metric5: js.UndefOr[String | Double] = js.undefined
    
    var metric50: js.UndefOr[String | Double] = js.undefined
    
    var metric51: js.UndefOr[String | Double] = js.undefined
    
    var metric52: js.UndefOr[String | Double] = js.undefined
    
    var metric53: js.UndefOr[String | Double] = js.undefined
    
    var metric54: js.UndefOr[String | Double] = js.undefined
    
    var metric55: js.UndefOr[String | Double] = js.undefined
    
    var metric56: js.UndefOr[String | Double] = js.undefined
    
    var metric57: js.UndefOr[String | Double] = js.undefined
    
    var metric58: js.UndefOr[String | Double] = js.undefined
    
    var metric59: js.UndefOr[String | Double] = js.undefined
    
    var metric6: js.UndefOr[String | Double] = js.undefined
    
    var metric60: js.UndefOr[String | Double] = js.undefined
    
    var metric61: js.UndefOr[String | Double] = js.undefined
    
    var metric62: js.UndefOr[String | Double] = js.undefined
    
    var metric63: js.UndefOr[String | Double] = js.undefined
    
    var metric64: js.UndefOr[String | Double] = js.undefined
    
    var metric65: js.UndefOr[String | Double] = js.undefined
    
    var metric66: js.UndefOr[String | Double] = js.undefined
    
    var metric67: js.UndefOr[String | Double] = js.undefined
    
    var metric68: js.UndefOr[String | Double] = js.undefined
    
    var metric69: js.UndefOr[String | Double] = js.undefined
    
    var metric7: js.UndefOr[String | Double] = js.undefined
    
    var metric70: js.UndefOr[String | Double] = js.undefined
    
    var metric71: js.UndefOr[String | Double] = js.undefined
    
    var metric72: js.UndefOr[String | Double] = js.undefined
    
    var metric73: js.UndefOr[String | Double] = js.undefined
    
    var metric74: js.UndefOr[String | Double] = js.undefined
    
    var metric75: js.UndefOr[String | Double] = js.undefined
    
    var metric76: js.UndefOr[String | Double] = js.undefined
    
    var metric77: js.UndefOr[String | Double] = js.undefined
    
    var metric78: js.UndefOr[String | Double] = js.undefined
    
    var metric79: js.UndefOr[String | Double] = js.undefined
    
    var metric8: js.UndefOr[String | Double] = js.undefined
    
    var metric80: js.UndefOr[String | Double] = js.undefined
    
    var metric81: js.UndefOr[String | Double] = js.undefined
    
    var metric82: js.UndefOr[String | Double] = js.undefined
    
    var metric83: js.UndefOr[String | Double] = js.undefined
    
    var metric84: js.UndefOr[String | Double] = js.undefined
    
    var metric85: js.UndefOr[String | Double] = js.undefined
    
    var metric86: js.UndefOr[String | Double] = js.undefined
    
    var metric87: js.UndefOr[String | Double] = js.undefined
    
    var metric88: js.UndefOr[String | Double] = js.undefined
    
    var metric89: js.UndefOr[String | Double] = js.undefined
    
    var metric9: js.UndefOr[String | Double] = js.undefined
    
    var metric90: js.UndefOr[String | Double] = js.undefined
    
    var metric91: js.UndefOr[String | Double] = js.undefined
    
    var metric92: js.UndefOr[String | Double] = js.undefined
    
    var metric93: js.UndefOr[String | Double] = js.undefined
    
    var metric94: js.UndefOr[String | Double] = js.undefined
    
    var metric95: js.UndefOr[String | Double] = js.undefined
    
    var metric96: js.UndefOr[String | Double] = js.undefined
    
    var metric97: js.UndefOr[String | Double] = js.undefined
    
    var metric98: js.UndefOr[String | Double] = js.undefined
    
    var metric99: js.UndefOr[String | Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nonInteraction: js.UndefOr[Boolean] = js.undefined
    
    var option: js.UndefOr[String] = js.undefined
    
    var page: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[Double | String] = js.undefined
    
    var price: js.UndefOr[String] = js.undefined
    
    var quantity: js.UndefOr[Double] = js.undefined
    
    var queueTime: js.UndefOr[Double] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var revenue: js.UndefOr[String] = js.undefined
    
    var sampleRate: js.UndefOr[Double] = js.undefined
    
    var screenColors: js.UndefOr[String] = js.undefined
    
    var screenName: js.UndefOr[String] = js.undefined
    
    var screenResolution: js.UndefOr[String] = js.undefined
    
    var sessionControl: js.UndefOr[String] = js.undefined
    
    var shipping: js.UndefOr[String] = js.undefined
    
    var siteSpeedSampleRate: js.UndefOr[Double] = js.undefined
    
    var socialAction: js.UndefOr[String] = js.undefined
    
    var socialNetwork: js.UndefOr[String] = js.undefined
    
    var socialTarget: js.UndefOr[String] = js.undefined
    
    var some: js.UndefOr[String] = js.undefined
    
    var step: js.UndefOr[Boolean | Double] = js.undefined
    
    var storage: js.UndefOr[String] = js.undefined
    
    var storeGac: js.UndefOr[Boolean] = js.undefined
    
    var tax: js.UndefOr[String] = js.undefined
    
    var timingCategory: js.UndefOr[String] = js.undefined
    
    var timingLabel: js.UndefOr[String] = js.undefined
    
    var timingValue: js.UndefOr[Double] = js.undefined
    
    var timingVar: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var transport: js.UndefOr[String] = js.undefined
    
    var useBeacon: js.UndefOr[Boolean] = js.undefined
    
    var userId: js.UndefOr[String] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
    
    var viewportSize: js.UndefOr[String] = js.undefined
  }
  object FieldsObject {
    
    inline def apply(): FieldsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldsObject]
    }
    
    extension [Self <: FieldsObject](x: Self) {
      
      inline def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
      
      inline def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
      
      inline def setAllowAnchor(value: Boolean): Self = StObject.set(x, "allowAnchor", value.asInstanceOf[js.Any])
      
      inline def setAllowAnchorUndefined: Self = StObject.set(x, "allowAnchor", js.undefined)
      
      inline def setAllowLinker(value: Boolean): Self = StObject.set(x, "allowLinker", value.asInstanceOf[js.Any])
      
      inline def setAllowLinkerUndefined: Self = StObject.set(x, "allowLinker", js.undefined)
      
      inline def setAlwaysSendReferrer(value: Boolean): Self = StObject.set(x, "alwaysSendReferrer", value.asInstanceOf[js.Any])
      
      inline def setAlwaysSendReferrerUndefined: Self = StObject.set(x, "alwaysSendReferrer", js.undefined)
      
      inline def setAnonymizeIp(value: Boolean): Self = StObject.set(x, "anonymizeIp", value.asInstanceOf[js.Any])
      
      inline def setAnonymizeIpUndefined: Self = StObject.set(x, "anonymizeIp", js.undefined)
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setAppInstallerId(value: String): Self = StObject.set(x, "appInstallerId", value.asInstanceOf[js.Any])
      
      inline def setAppInstallerIdUndefined: Self = StObject.set(x, "appInstallerId", js.undefined)
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
      
      inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      inline def setCampaignContent(value: String): Self = StObject.set(x, "campaignContent", value.asInstanceOf[js.Any])
      
      inline def setCampaignContentUndefined: Self = StObject.set(x, "campaignContent", js.undefined)
      
      inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
      
      inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
      
      inline def setCampaignKeyword(value: String): Self = StObject.set(x, "campaignKeyword", value.asInstanceOf[js.Any])
      
      inline def setCampaignKeywordUndefined: Self = StObject.set(x, "campaignKeyword", js.undefined)
      
      inline def setCampaignMedium(value: String): Self = StObject.set(x, "campaignMedium", value.asInstanceOf[js.Any])
      
      inline def setCampaignMediumUndefined: Self = StObject.set(x, "campaignMedium", js.undefined)
      
      inline def setCampaignName(value: String): Self = StObject.set(x, "campaignName", value.asInstanceOf[js.Any])
      
      inline def setCampaignNameUndefined: Self = StObject.set(x, "campaignName", js.undefined)
      
      inline def setCampaignSource(value: String): Self = StObject.set(x, "campaignSource", value.asInstanceOf[js.Any])
      
      inline def setCampaignSourceUndefined: Self = StObject.set(x, "campaignSource", js.undefined)
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setContentGroup1(value: String): Self = StObject.set(x, "contentGroup1", value.asInstanceOf[js.Any])
      
      inline def setContentGroup10(value: String): Self = StObject.set(x, "contentGroup10", value.asInstanceOf[js.Any])
      
      inline def setContentGroup10Undefined: Self = StObject.set(x, "contentGroup10", js.undefined)
      
      inline def setContentGroup1Undefined: Self = StObject.set(x, "contentGroup1", js.undefined)
      
      inline def setContentGroup2(value: String): Self = StObject.set(x, "contentGroup2", value.asInstanceOf[js.Any])
      
      inline def setContentGroup2Undefined: Self = StObject.set(x, "contentGroup2", js.undefined)
      
      inline def setContentGroup3(value: String): Self = StObject.set(x, "contentGroup3", value.asInstanceOf[js.Any])
      
      inline def setContentGroup3Undefined: Self = StObject.set(x, "contentGroup3", js.undefined)
      
      inline def setContentGroup4(value: String): Self = StObject.set(x, "contentGroup4", value.asInstanceOf[js.Any])
      
      inline def setContentGroup4Undefined: Self = StObject.set(x, "contentGroup4", js.undefined)
      
      inline def setContentGroup5(value: String): Self = StObject.set(x, "contentGroup5", value.asInstanceOf[js.Any])
      
      inline def setContentGroup5Undefined: Self = StObject.set(x, "contentGroup5", js.undefined)
      
      inline def setContentGroup6(value: String): Self = StObject.set(x, "contentGroup6", value.asInstanceOf[js.Any])
      
      inline def setContentGroup6Undefined: Self = StObject.set(x, "contentGroup6", js.undefined)
      
      inline def setContentGroup7(value: String): Self = StObject.set(x, "contentGroup7", value.asInstanceOf[js.Any])
      
      inline def setContentGroup7Undefined: Self = StObject.set(x, "contentGroup7", js.undefined)
      
      inline def setContentGroup8(value: String): Self = StObject.set(x, "contentGroup8", value.asInstanceOf[js.Any])
      
      inline def setContentGroup8Undefined: Self = StObject.set(x, "contentGroup8", js.undefined)
      
      inline def setContentGroup9(value: String): Self = StObject.set(x, "contentGroup9", value.asInstanceOf[js.Any])
      
      inline def setContentGroup9Undefined: Self = StObject.set(x, "contentGroup9", js.undefined)
      
      inline def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      inline def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      inline def setCookieExpires(value: Double): Self = StObject.set(x, "cookieExpires", value.asInstanceOf[js.Any])
      
      inline def setCookieExpiresUndefined: Self = StObject.set(x, "cookieExpires", js.undefined)
      
      inline def setCookieFlags(value: String): Self = StObject.set(x, "cookieFlags", value.asInstanceOf[js.Any])
      
      inline def setCookieFlagsUndefined: Self = StObject.set(x, "cookieFlags", js.undefined)
      
      inline def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      inline def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      inline def setCookiePath(value: String): Self = StObject.set(x, "cookiePath", value.asInstanceOf[js.Any])
      
      inline def setCookiePathUndefined: Self = StObject.set(x, "cookiePath", js.undefined)
      
      inline def setCookieUpdate(value: Boolean): Self = StObject.set(x, "cookieUpdate", value.asInstanceOf[js.Any])
      
      inline def setCookieUpdateUndefined: Self = StObject.set(x, "cookieUpdate", js.undefined)
      
      inline def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
      
      inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
      
      inline def setCreative(value: String): Self = StObject.set(x, "creative", value.asInstanceOf[js.Any])
      
      inline def setCreativeUndefined: Self = StObject.set(x, "creative", js.undefined)
      
      inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
      
      inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
      
      inline def setDataSource(value: String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDimension1(value: String): Self = StObject.set(x, "dimension1", value.asInstanceOf[js.Any])
      
      inline def setDimension10(value: String): Self = StObject.set(x, "dimension10", value.asInstanceOf[js.Any])
      
      inline def setDimension100(value: String): Self = StObject.set(x, "dimension100", value.asInstanceOf[js.Any])
      
      inline def setDimension100Undefined: Self = StObject.set(x, "dimension100", js.undefined)
      
      inline def setDimension101(value: String): Self = StObject.set(x, "dimension101", value.asInstanceOf[js.Any])
      
      inline def setDimension101Undefined: Self = StObject.set(x, "dimension101", js.undefined)
      
      inline def setDimension102(value: String): Self = StObject.set(x, "dimension102", value.asInstanceOf[js.Any])
      
      inline def setDimension102Undefined: Self = StObject.set(x, "dimension102", js.undefined)
      
      inline def setDimension103(value: String): Self = StObject.set(x, "dimension103", value.asInstanceOf[js.Any])
      
      inline def setDimension103Undefined: Self = StObject.set(x, "dimension103", js.undefined)
      
      inline def setDimension104(value: String): Self = StObject.set(x, "dimension104", value.asInstanceOf[js.Any])
      
      inline def setDimension104Undefined: Self = StObject.set(x, "dimension104", js.undefined)
      
      inline def setDimension105(value: String): Self = StObject.set(x, "dimension105", value.asInstanceOf[js.Any])
      
      inline def setDimension105Undefined: Self = StObject.set(x, "dimension105", js.undefined)
      
      inline def setDimension106(value: String): Self = StObject.set(x, "dimension106", value.asInstanceOf[js.Any])
      
      inline def setDimension106Undefined: Self = StObject.set(x, "dimension106", js.undefined)
      
      inline def setDimension107(value: String): Self = StObject.set(x, "dimension107", value.asInstanceOf[js.Any])
      
      inline def setDimension107Undefined: Self = StObject.set(x, "dimension107", js.undefined)
      
      inline def setDimension108(value: String): Self = StObject.set(x, "dimension108", value.asInstanceOf[js.Any])
      
      inline def setDimension108Undefined: Self = StObject.set(x, "dimension108", js.undefined)
      
      inline def setDimension109(value: String): Self = StObject.set(x, "dimension109", value.asInstanceOf[js.Any])
      
      inline def setDimension109Undefined: Self = StObject.set(x, "dimension109", js.undefined)
      
      inline def setDimension10Undefined: Self = StObject.set(x, "dimension10", js.undefined)
      
      inline def setDimension11(value: String): Self = StObject.set(x, "dimension11", value.asInstanceOf[js.Any])
      
      inline def setDimension110(value: String): Self = StObject.set(x, "dimension110", value.asInstanceOf[js.Any])
      
      inline def setDimension110Undefined: Self = StObject.set(x, "dimension110", js.undefined)
      
      inline def setDimension111(value: String): Self = StObject.set(x, "dimension111", value.asInstanceOf[js.Any])
      
      inline def setDimension111Undefined: Self = StObject.set(x, "dimension111", js.undefined)
      
      inline def setDimension112(value: String): Self = StObject.set(x, "dimension112", value.asInstanceOf[js.Any])
      
      inline def setDimension112Undefined: Self = StObject.set(x, "dimension112", js.undefined)
      
      inline def setDimension113(value: String): Self = StObject.set(x, "dimension113", value.asInstanceOf[js.Any])
      
      inline def setDimension113Undefined: Self = StObject.set(x, "dimension113", js.undefined)
      
      inline def setDimension114(value: String): Self = StObject.set(x, "dimension114", value.asInstanceOf[js.Any])
      
      inline def setDimension114Undefined: Self = StObject.set(x, "dimension114", js.undefined)
      
      inline def setDimension115(value: String): Self = StObject.set(x, "dimension115", value.asInstanceOf[js.Any])
      
      inline def setDimension115Undefined: Self = StObject.set(x, "dimension115", js.undefined)
      
      inline def setDimension116(value: String): Self = StObject.set(x, "dimension116", value.asInstanceOf[js.Any])
      
      inline def setDimension116Undefined: Self = StObject.set(x, "dimension116", js.undefined)
      
      inline def setDimension117(value: String): Self = StObject.set(x, "dimension117", value.asInstanceOf[js.Any])
      
      inline def setDimension117Undefined: Self = StObject.set(x, "dimension117", js.undefined)
      
      inline def setDimension118(value: String): Self = StObject.set(x, "dimension118", value.asInstanceOf[js.Any])
      
      inline def setDimension118Undefined: Self = StObject.set(x, "dimension118", js.undefined)
      
      inline def setDimension119(value: String): Self = StObject.set(x, "dimension119", value.asInstanceOf[js.Any])
      
      inline def setDimension119Undefined: Self = StObject.set(x, "dimension119", js.undefined)
      
      inline def setDimension11Undefined: Self = StObject.set(x, "dimension11", js.undefined)
      
      inline def setDimension12(value: String): Self = StObject.set(x, "dimension12", value.asInstanceOf[js.Any])
      
      inline def setDimension120(value: String): Self = StObject.set(x, "dimension120", value.asInstanceOf[js.Any])
      
      inline def setDimension120Undefined: Self = StObject.set(x, "dimension120", js.undefined)
      
      inline def setDimension121(value: String): Self = StObject.set(x, "dimension121", value.asInstanceOf[js.Any])
      
      inline def setDimension121Undefined: Self = StObject.set(x, "dimension121", js.undefined)
      
      inline def setDimension122(value: String): Self = StObject.set(x, "dimension122", value.asInstanceOf[js.Any])
      
      inline def setDimension122Undefined: Self = StObject.set(x, "dimension122", js.undefined)
      
      inline def setDimension123(value: String): Self = StObject.set(x, "dimension123", value.asInstanceOf[js.Any])
      
      inline def setDimension123Undefined: Self = StObject.set(x, "dimension123", js.undefined)
      
      inline def setDimension124(value: String): Self = StObject.set(x, "dimension124", value.asInstanceOf[js.Any])
      
      inline def setDimension124Undefined: Self = StObject.set(x, "dimension124", js.undefined)
      
      inline def setDimension125(value: String): Self = StObject.set(x, "dimension125", value.asInstanceOf[js.Any])
      
      inline def setDimension125Undefined: Self = StObject.set(x, "dimension125", js.undefined)
      
      inline def setDimension126(value: String): Self = StObject.set(x, "dimension126", value.asInstanceOf[js.Any])
      
      inline def setDimension126Undefined: Self = StObject.set(x, "dimension126", js.undefined)
      
      inline def setDimension127(value: String): Self = StObject.set(x, "dimension127", value.asInstanceOf[js.Any])
      
      inline def setDimension127Undefined: Self = StObject.set(x, "dimension127", js.undefined)
      
      inline def setDimension128(value: String): Self = StObject.set(x, "dimension128", value.asInstanceOf[js.Any])
      
      inline def setDimension128Undefined: Self = StObject.set(x, "dimension128", js.undefined)
      
      inline def setDimension129(value: String): Self = StObject.set(x, "dimension129", value.asInstanceOf[js.Any])
      
      inline def setDimension129Undefined: Self = StObject.set(x, "dimension129", js.undefined)
      
      inline def setDimension12Undefined: Self = StObject.set(x, "dimension12", js.undefined)
      
      inline def setDimension13(value: String): Self = StObject.set(x, "dimension13", value.asInstanceOf[js.Any])
      
      inline def setDimension130(value: String): Self = StObject.set(x, "dimension130", value.asInstanceOf[js.Any])
      
      inline def setDimension130Undefined: Self = StObject.set(x, "dimension130", js.undefined)
      
      inline def setDimension131(value: String): Self = StObject.set(x, "dimension131", value.asInstanceOf[js.Any])
      
      inline def setDimension131Undefined: Self = StObject.set(x, "dimension131", js.undefined)
      
      inline def setDimension132(value: String): Self = StObject.set(x, "dimension132", value.asInstanceOf[js.Any])
      
      inline def setDimension132Undefined: Self = StObject.set(x, "dimension132", js.undefined)
      
      inline def setDimension133(value: String): Self = StObject.set(x, "dimension133", value.asInstanceOf[js.Any])
      
      inline def setDimension133Undefined: Self = StObject.set(x, "dimension133", js.undefined)
      
      inline def setDimension134(value: String): Self = StObject.set(x, "dimension134", value.asInstanceOf[js.Any])
      
      inline def setDimension134Undefined: Self = StObject.set(x, "dimension134", js.undefined)
      
      inline def setDimension135(value: String): Self = StObject.set(x, "dimension135", value.asInstanceOf[js.Any])
      
      inline def setDimension135Undefined: Self = StObject.set(x, "dimension135", js.undefined)
      
      inline def setDimension136(value: String): Self = StObject.set(x, "dimension136", value.asInstanceOf[js.Any])
      
      inline def setDimension136Undefined: Self = StObject.set(x, "dimension136", js.undefined)
      
      inline def setDimension137(value: String): Self = StObject.set(x, "dimension137", value.asInstanceOf[js.Any])
      
      inline def setDimension137Undefined: Self = StObject.set(x, "dimension137", js.undefined)
      
      inline def setDimension138(value: String): Self = StObject.set(x, "dimension138", value.asInstanceOf[js.Any])
      
      inline def setDimension138Undefined: Self = StObject.set(x, "dimension138", js.undefined)
      
      inline def setDimension139(value: String): Self = StObject.set(x, "dimension139", value.asInstanceOf[js.Any])
      
      inline def setDimension139Undefined: Self = StObject.set(x, "dimension139", js.undefined)
      
      inline def setDimension13Undefined: Self = StObject.set(x, "dimension13", js.undefined)
      
      inline def setDimension14(value: String): Self = StObject.set(x, "dimension14", value.asInstanceOf[js.Any])
      
      inline def setDimension140(value: String): Self = StObject.set(x, "dimension140", value.asInstanceOf[js.Any])
      
      inline def setDimension140Undefined: Self = StObject.set(x, "dimension140", js.undefined)
      
      inline def setDimension141(value: String): Self = StObject.set(x, "dimension141", value.asInstanceOf[js.Any])
      
      inline def setDimension141Undefined: Self = StObject.set(x, "dimension141", js.undefined)
      
      inline def setDimension142(value: String): Self = StObject.set(x, "dimension142", value.asInstanceOf[js.Any])
      
      inline def setDimension142Undefined: Self = StObject.set(x, "dimension142", js.undefined)
      
      inline def setDimension143(value: String): Self = StObject.set(x, "dimension143", value.asInstanceOf[js.Any])
      
      inline def setDimension143Undefined: Self = StObject.set(x, "dimension143", js.undefined)
      
      inline def setDimension144(value: String): Self = StObject.set(x, "dimension144", value.asInstanceOf[js.Any])
      
      inline def setDimension144Undefined: Self = StObject.set(x, "dimension144", js.undefined)
      
      inline def setDimension145(value: String): Self = StObject.set(x, "dimension145", value.asInstanceOf[js.Any])
      
      inline def setDimension145Undefined: Self = StObject.set(x, "dimension145", js.undefined)
      
      inline def setDimension146(value: String): Self = StObject.set(x, "dimension146", value.asInstanceOf[js.Any])
      
      inline def setDimension146Undefined: Self = StObject.set(x, "dimension146", js.undefined)
      
      inline def setDimension147(value: String): Self = StObject.set(x, "dimension147", value.asInstanceOf[js.Any])
      
      inline def setDimension147Undefined: Self = StObject.set(x, "dimension147", js.undefined)
      
      inline def setDimension148(value: String): Self = StObject.set(x, "dimension148", value.asInstanceOf[js.Any])
      
      inline def setDimension148Undefined: Self = StObject.set(x, "dimension148", js.undefined)
      
      inline def setDimension149(value: String): Self = StObject.set(x, "dimension149", value.asInstanceOf[js.Any])
      
      inline def setDimension149Undefined: Self = StObject.set(x, "dimension149", js.undefined)
      
      inline def setDimension14Undefined: Self = StObject.set(x, "dimension14", js.undefined)
      
      inline def setDimension15(value: String): Self = StObject.set(x, "dimension15", value.asInstanceOf[js.Any])
      
      inline def setDimension150(value: String): Self = StObject.set(x, "dimension150", value.asInstanceOf[js.Any])
      
      inline def setDimension150Undefined: Self = StObject.set(x, "dimension150", js.undefined)
      
      inline def setDimension151(value: String): Self = StObject.set(x, "dimension151", value.asInstanceOf[js.Any])
      
      inline def setDimension151Undefined: Self = StObject.set(x, "dimension151", js.undefined)
      
      inline def setDimension152(value: String): Self = StObject.set(x, "dimension152", value.asInstanceOf[js.Any])
      
      inline def setDimension152Undefined: Self = StObject.set(x, "dimension152", js.undefined)
      
      inline def setDimension153(value: String): Self = StObject.set(x, "dimension153", value.asInstanceOf[js.Any])
      
      inline def setDimension153Undefined: Self = StObject.set(x, "dimension153", js.undefined)
      
      inline def setDimension154(value: String): Self = StObject.set(x, "dimension154", value.asInstanceOf[js.Any])
      
      inline def setDimension154Undefined: Self = StObject.set(x, "dimension154", js.undefined)
      
      inline def setDimension155(value: String): Self = StObject.set(x, "dimension155", value.asInstanceOf[js.Any])
      
      inline def setDimension155Undefined: Self = StObject.set(x, "dimension155", js.undefined)
      
      inline def setDimension156(value: String): Self = StObject.set(x, "dimension156", value.asInstanceOf[js.Any])
      
      inline def setDimension156Undefined: Self = StObject.set(x, "dimension156", js.undefined)
      
      inline def setDimension157(value: String): Self = StObject.set(x, "dimension157", value.asInstanceOf[js.Any])
      
      inline def setDimension157Undefined: Self = StObject.set(x, "dimension157", js.undefined)
      
      inline def setDimension158(value: String): Self = StObject.set(x, "dimension158", value.asInstanceOf[js.Any])
      
      inline def setDimension158Undefined: Self = StObject.set(x, "dimension158", js.undefined)
      
      inline def setDimension159(value: String): Self = StObject.set(x, "dimension159", value.asInstanceOf[js.Any])
      
      inline def setDimension159Undefined: Self = StObject.set(x, "dimension159", js.undefined)
      
      inline def setDimension15Undefined: Self = StObject.set(x, "dimension15", js.undefined)
      
      inline def setDimension16(value: String): Self = StObject.set(x, "dimension16", value.asInstanceOf[js.Any])
      
      inline def setDimension160(value: String): Self = StObject.set(x, "dimension160", value.asInstanceOf[js.Any])
      
      inline def setDimension160Undefined: Self = StObject.set(x, "dimension160", js.undefined)
      
      inline def setDimension161(value: String): Self = StObject.set(x, "dimension161", value.asInstanceOf[js.Any])
      
      inline def setDimension161Undefined: Self = StObject.set(x, "dimension161", js.undefined)
      
      inline def setDimension162(value: String): Self = StObject.set(x, "dimension162", value.asInstanceOf[js.Any])
      
      inline def setDimension162Undefined: Self = StObject.set(x, "dimension162", js.undefined)
      
      inline def setDimension163(value: String): Self = StObject.set(x, "dimension163", value.asInstanceOf[js.Any])
      
      inline def setDimension163Undefined: Self = StObject.set(x, "dimension163", js.undefined)
      
      inline def setDimension164(value: String): Self = StObject.set(x, "dimension164", value.asInstanceOf[js.Any])
      
      inline def setDimension164Undefined: Self = StObject.set(x, "dimension164", js.undefined)
      
      inline def setDimension165(value: String): Self = StObject.set(x, "dimension165", value.asInstanceOf[js.Any])
      
      inline def setDimension165Undefined: Self = StObject.set(x, "dimension165", js.undefined)
      
      inline def setDimension166(value: String): Self = StObject.set(x, "dimension166", value.asInstanceOf[js.Any])
      
      inline def setDimension166Undefined: Self = StObject.set(x, "dimension166", js.undefined)
      
      inline def setDimension167(value: String): Self = StObject.set(x, "dimension167", value.asInstanceOf[js.Any])
      
      inline def setDimension167Undefined: Self = StObject.set(x, "dimension167", js.undefined)
      
      inline def setDimension168(value: String): Self = StObject.set(x, "dimension168", value.asInstanceOf[js.Any])
      
      inline def setDimension168Undefined: Self = StObject.set(x, "dimension168", js.undefined)
      
      inline def setDimension169(value: String): Self = StObject.set(x, "dimension169", value.asInstanceOf[js.Any])
      
      inline def setDimension169Undefined: Self = StObject.set(x, "dimension169", js.undefined)
      
      inline def setDimension16Undefined: Self = StObject.set(x, "dimension16", js.undefined)
      
      inline def setDimension17(value: String): Self = StObject.set(x, "dimension17", value.asInstanceOf[js.Any])
      
      inline def setDimension170(value: String): Self = StObject.set(x, "dimension170", value.asInstanceOf[js.Any])
      
      inline def setDimension170Undefined: Self = StObject.set(x, "dimension170", js.undefined)
      
      inline def setDimension171(value: String): Self = StObject.set(x, "dimension171", value.asInstanceOf[js.Any])
      
      inline def setDimension171Undefined: Self = StObject.set(x, "dimension171", js.undefined)
      
      inline def setDimension172(value: String): Self = StObject.set(x, "dimension172", value.asInstanceOf[js.Any])
      
      inline def setDimension172Undefined: Self = StObject.set(x, "dimension172", js.undefined)
      
      inline def setDimension173(value: String): Self = StObject.set(x, "dimension173", value.asInstanceOf[js.Any])
      
      inline def setDimension173Undefined: Self = StObject.set(x, "dimension173", js.undefined)
      
      inline def setDimension174(value: String): Self = StObject.set(x, "dimension174", value.asInstanceOf[js.Any])
      
      inline def setDimension174Undefined: Self = StObject.set(x, "dimension174", js.undefined)
      
      inline def setDimension175(value: String): Self = StObject.set(x, "dimension175", value.asInstanceOf[js.Any])
      
      inline def setDimension175Undefined: Self = StObject.set(x, "dimension175", js.undefined)
      
      inline def setDimension176(value: String): Self = StObject.set(x, "dimension176", value.asInstanceOf[js.Any])
      
      inline def setDimension176Undefined: Self = StObject.set(x, "dimension176", js.undefined)
      
      inline def setDimension177(value: String): Self = StObject.set(x, "dimension177", value.asInstanceOf[js.Any])
      
      inline def setDimension177Undefined: Self = StObject.set(x, "dimension177", js.undefined)
      
      inline def setDimension178(value: String): Self = StObject.set(x, "dimension178", value.asInstanceOf[js.Any])
      
      inline def setDimension178Undefined: Self = StObject.set(x, "dimension178", js.undefined)
      
      inline def setDimension179(value: String): Self = StObject.set(x, "dimension179", value.asInstanceOf[js.Any])
      
      inline def setDimension179Undefined: Self = StObject.set(x, "dimension179", js.undefined)
      
      inline def setDimension17Undefined: Self = StObject.set(x, "dimension17", js.undefined)
      
      inline def setDimension18(value: String): Self = StObject.set(x, "dimension18", value.asInstanceOf[js.Any])
      
      inline def setDimension180(value: String): Self = StObject.set(x, "dimension180", value.asInstanceOf[js.Any])
      
      inline def setDimension180Undefined: Self = StObject.set(x, "dimension180", js.undefined)
      
      inline def setDimension181(value: String): Self = StObject.set(x, "dimension181", value.asInstanceOf[js.Any])
      
      inline def setDimension181Undefined: Self = StObject.set(x, "dimension181", js.undefined)
      
      inline def setDimension182(value: String): Self = StObject.set(x, "dimension182", value.asInstanceOf[js.Any])
      
      inline def setDimension182Undefined: Self = StObject.set(x, "dimension182", js.undefined)
      
      inline def setDimension183(value: String): Self = StObject.set(x, "dimension183", value.asInstanceOf[js.Any])
      
      inline def setDimension183Undefined: Self = StObject.set(x, "dimension183", js.undefined)
      
      inline def setDimension184(value: String): Self = StObject.set(x, "dimension184", value.asInstanceOf[js.Any])
      
      inline def setDimension184Undefined: Self = StObject.set(x, "dimension184", js.undefined)
      
      inline def setDimension185(value: String): Self = StObject.set(x, "dimension185", value.asInstanceOf[js.Any])
      
      inline def setDimension185Undefined: Self = StObject.set(x, "dimension185", js.undefined)
      
      inline def setDimension186(value: String): Self = StObject.set(x, "dimension186", value.asInstanceOf[js.Any])
      
      inline def setDimension186Undefined: Self = StObject.set(x, "dimension186", js.undefined)
      
      inline def setDimension187(value: String): Self = StObject.set(x, "dimension187", value.asInstanceOf[js.Any])
      
      inline def setDimension187Undefined: Self = StObject.set(x, "dimension187", js.undefined)
      
      inline def setDimension188(value: String): Self = StObject.set(x, "dimension188", value.asInstanceOf[js.Any])
      
      inline def setDimension188Undefined: Self = StObject.set(x, "dimension188", js.undefined)
      
      inline def setDimension189(value: String): Self = StObject.set(x, "dimension189", value.asInstanceOf[js.Any])
      
      inline def setDimension189Undefined: Self = StObject.set(x, "dimension189", js.undefined)
      
      inline def setDimension18Undefined: Self = StObject.set(x, "dimension18", js.undefined)
      
      inline def setDimension19(value: String): Self = StObject.set(x, "dimension19", value.asInstanceOf[js.Any])
      
      inline def setDimension190(value: String): Self = StObject.set(x, "dimension190", value.asInstanceOf[js.Any])
      
      inline def setDimension190Undefined: Self = StObject.set(x, "dimension190", js.undefined)
      
      inline def setDimension191(value: String): Self = StObject.set(x, "dimension191", value.asInstanceOf[js.Any])
      
      inline def setDimension191Undefined: Self = StObject.set(x, "dimension191", js.undefined)
      
      inline def setDimension192(value: String): Self = StObject.set(x, "dimension192", value.asInstanceOf[js.Any])
      
      inline def setDimension192Undefined: Self = StObject.set(x, "dimension192", js.undefined)
      
      inline def setDimension193(value: String): Self = StObject.set(x, "dimension193", value.asInstanceOf[js.Any])
      
      inline def setDimension193Undefined: Self = StObject.set(x, "dimension193", js.undefined)
      
      inline def setDimension194(value: String): Self = StObject.set(x, "dimension194", value.asInstanceOf[js.Any])
      
      inline def setDimension194Undefined: Self = StObject.set(x, "dimension194", js.undefined)
      
      inline def setDimension195(value: String): Self = StObject.set(x, "dimension195", value.asInstanceOf[js.Any])
      
      inline def setDimension195Undefined: Self = StObject.set(x, "dimension195", js.undefined)
      
      inline def setDimension196(value: String): Self = StObject.set(x, "dimension196", value.asInstanceOf[js.Any])
      
      inline def setDimension196Undefined: Self = StObject.set(x, "dimension196", js.undefined)
      
      inline def setDimension197(value: String): Self = StObject.set(x, "dimension197", value.asInstanceOf[js.Any])
      
      inline def setDimension197Undefined: Self = StObject.set(x, "dimension197", js.undefined)
      
      inline def setDimension198(value: String): Self = StObject.set(x, "dimension198", value.asInstanceOf[js.Any])
      
      inline def setDimension198Undefined: Self = StObject.set(x, "dimension198", js.undefined)
      
      inline def setDimension199(value: String): Self = StObject.set(x, "dimension199", value.asInstanceOf[js.Any])
      
      inline def setDimension199Undefined: Self = StObject.set(x, "dimension199", js.undefined)
      
      inline def setDimension19Undefined: Self = StObject.set(x, "dimension19", js.undefined)
      
      inline def setDimension1Undefined: Self = StObject.set(x, "dimension1", js.undefined)
      
      inline def setDimension2(value: String): Self = StObject.set(x, "dimension2", value.asInstanceOf[js.Any])
      
      inline def setDimension20(value: String): Self = StObject.set(x, "dimension20", value.asInstanceOf[js.Any])
      
      inline def setDimension200(value: String): Self = StObject.set(x, "dimension200", value.asInstanceOf[js.Any])
      
      inline def setDimension200Undefined: Self = StObject.set(x, "dimension200", js.undefined)
      
      inline def setDimension20Undefined: Self = StObject.set(x, "dimension20", js.undefined)
      
      inline def setDimension21(value: String): Self = StObject.set(x, "dimension21", value.asInstanceOf[js.Any])
      
      inline def setDimension21Undefined: Self = StObject.set(x, "dimension21", js.undefined)
      
      inline def setDimension22(value: String): Self = StObject.set(x, "dimension22", value.asInstanceOf[js.Any])
      
      inline def setDimension22Undefined: Self = StObject.set(x, "dimension22", js.undefined)
      
      inline def setDimension23(value: String): Self = StObject.set(x, "dimension23", value.asInstanceOf[js.Any])
      
      inline def setDimension23Undefined: Self = StObject.set(x, "dimension23", js.undefined)
      
      inline def setDimension24(value: String): Self = StObject.set(x, "dimension24", value.asInstanceOf[js.Any])
      
      inline def setDimension24Undefined: Self = StObject.set(x, "dimension24", js.undefined)
      
      inline def setDimension25(value: String): Self = StObject.set(x, "dimension25", value.asInstanceOf[js.Any])
      
      inline def setDimension25Undefined: Self = StObject.set(x, "dimension25", js.undefined)
      
      inline def setDimension26(value: String): Self = StObject.set(x, "dimension26", value.asInstanceOf[js.Any])
      
      inline def setDimension26Undefined: Self = StObject.set(x, "dimension26", js.undefined)
      
      inline def setDimension27(value: String): Self = StObject.set(x, "dimension27", value.asInstanceOf[js.Any])
      
      inline def setDimension27Undefined: Self = StObject.set(x, "dimension27", js.undefined)
      
      inline def setDimension28(value: String): Self = StObject.set(x, "dimension28", value.asInstanceOf[js.Any])
      
      inline def setDimension28Undefined: Self = StObject.set(x, "dimension28", js.undefined)
      
      inline def setDimension29(value: String): Self = StObject.set(x, "dimension29", value.asInstanceOf[js.Any])
      
      inline def setDimension29Undefined: Self = StObject.set(x, "dimension29", js.undefined)
      
      inline def setDimension2Undefined: Self = StObject.set(x, "dimension2", js.undefined)
      
      inline def setDimension3(value: String): Self = StObject.set(x, "dimension3", value.asInstanceOf[js.Any])
      
      inline def setDimension30(value: String): Self = StObject.set(x, "dimension30", value.asInstanceOf[js.Any])
      
      inline def setDimension30Undefined: Self = StObject.set(x, "dimension30", js.undefined)
      
      inline def setDimension31(value: String): Self = StObject.set(x, "dimension31", value.asInstanceOf[js.Any])
      
      inline def setDimension31Undefined: Self = StObject.set(x, "dimension31", js.undefined)
      
      inline def setDimension32(value: String): Self = StObject.set(x, "dimension32", value.asInstanceOf[js.Any])
      
      inline def setDimension32Undefined: Self = StObject.set(x, "dimension32", js.undefined)
      
      inline def setDimension33(value: String): Self = StObject.set(x, "dimension33", value.asInstanceOf[js.Any])
      
      inline def setDimension33Undefined: Self = StObject.set(x, "dimension33", js.undefined)
      
      inline def setDimension34(value: String): Self = StObject.set(x, "dimension34", value.asInstanceOf[js.Any])
      
      inline def setDimension34Undefined: Self = StObject.set(x, "dimension34", js.undefined)
      
      inline def setDimension35(value: String): Self = StObject.set(x, "dimension35", value.asInstanceOf[js.Any])
      
      inline def setDimension35Undefined: Self = StObject.set(x, "dimension35", js.undefined)
      
      inline def setDimension36(value: String): Self = StObject.set(x, "dimension36", value.asInstanceOf[js.Any])
      
      inline def setDimension36Undefined: Self = StObject.set(x, "dimension36", js.undefined)
      
      inline def setDimension37(value: String): Self = StObject.set(x, "dimension37", value.asInstanceOf[js.Any])
      
      inline def setDimension37Undefined: Self = StObject.set(x, "dimension37", js.undefined)
      
      inline def setDimension38(value: String): Self = StObject.set(x, "dimension38", value.asInstanceOf[js.Any])
      
      inline def setDimension38Undefined: Self = StObject.set(x, "dimension38", js.undefined)
      
      inline def setDimension39(value: String): Self = StObject.set(x, "dimension39", value.asInstanceOf[js.Any])
      
      inline def setDimension39Undefined: Self = StObject.set(x, "dimension39", js.undefined)
      
      inline def setDimension3Undefined: Self = StObject.set(x, "dimension3", js.undefined)
      
      inline def setDimension4(value: String): Self = StObject.set(x, "dimension4", value.asInstanceOf[js.Any])
      
      inline def setDimension40(value: String): Self = StObject.set(x, "dimension40", value.asInstanceOf[js.Any])
      
      inline def setDimension40Undefined: Self = StObject.set(x, "dimension40", js.undefined)
      
      inline def setDimension41(value: String): Self = StObject.set(x, "dimension41", value.asInstanceOf[js.Any])
      
      inline def setDimension41Undefined: Self = StObject.set(x, "dimension41", js.undefined)
      
      inline def setDimension42(value: String): Self = StObject.set(x, "dimension42", value.asInstanceOf[js.Any])
      
      inline def setDimension42Undefined: Self = StObject.set(x, "dimension42", js.undefined)
      
      inline def setDimension43(value: String): Self = StObject.set(x, "dimension43", value.asInstanceOf[js.Any])
      
      inline def setDimension43Undefined: Self = StObject.set(x, "dimension43", js.undefined)
      
      inline def setDimension44(value: String): Self = StObject.set(x, "dimension44", value.asInstanceOf[js.Any])
      
      inline def setDimension44Undefined: Self = StObject.set(x, "dimension44", js.undefined)
      
      inline def setDimension45(value: String): Self = StObject.set(x, "dimension45", value.asInstanceOf[js.Any])
      
      inline def setDimension45Undefined: Self = StObject.set(x, "dimension45", js.undefined)
      
      inline def setDimension46(value: String): Self = StObject.set(x, "dimension46", value.asInstanceOf[js.Any])
      
      inline def setDimension46Undefined: Self = StObject.set(x, "dimension46", js.undefined)
      
      inline def setDimension47(value: String): Self = StObject.set(x, "dimension47", value.asInstanceOf[js.Any])
      
      inline def setDimension47Undefined: Self = StObject.set(x, "dimension47", js.undefined)
      
      inline def setDimension48(value: String): Self = StObject.set(x, "dimension48", value.asInstanceOf[js.Any])
      
      inline def setDimension48Undefined: Self = StObject.set(x, "dimension48", js.undefined)
      
      inline def setDimension49(value: String): Self = StObject.set(x, "dimension49", value.asInstanceOf[js.Any])
      
      inline def setDimension49Undefined: Self = StObject.set(x, "dimension49", js.undefined)
      
      inline def setDimension4Undefined: Self = StObject.set(x, "dimension4", js.undefined)
      
      inline def setDimension5(value: String): Self = StObject.set(x, "dimension5", value.asInstanceOf[js.Any])
      
      inline def setDimension50(value: String): Self = StObject.set(x, "dimension50", value.asInstanceOf[js.Any])
      
      inline def setDimension50Undefined: Self = StObject.set(x, "dimension50", js.undefined)
      
      inline def setDimension51(value: String): Self = StObject.set(x, "dimension51", value.asInstanceOf[js.Any])
      
      inline def setDimension51Undefined: Self = StObject.set(x, "dimension51", js.undefined)
      
      inline def setDimension52(value: String): Self = StObject.set(x, "dimension52", value.asInstanceOf[js.Any])
      
      inline def setDimension52Undefined: Self = StObject.set(x, "dimension52", js.undefined)
      
      inline def setDimension53(value: String): Self = StObject.set(x, "dimension53", value.asInstanceOf[js.Any])
      
      inline def setDimension53Undefined: Self = StObject.set(x, "dimension53", js.undefined)
      
      inline def setDimension54(value: String): Self = StObject.set(x, "dimension54", value.asInstanceOf[js.Any])
      
      inline def setDimension54Undefined: Self = StObject.set(x, "dimension54", js.undefined)
      
      inline def setDimension55(value: String): Self = StObject.set(x, "dimension55", value.asInstanceOf[js.Any])
      
      inline def setDimension55Undefined: Self = StObject.set(x, "dimension55", js.undefined)
      
      inline def setDimension56(value: String): Self = StObject.set(x, "dimension56", value.asInstanceOf[js.Any])
      
      inline def setDimension56Undefined: Self = StObject.set(x, "dimension56", js.undefined)
      
      inline def setDimension57(value: String): Self = StObject.set(x, "dimension57", value.asInstanceOf[js.Any])
      
      inline def setDimension57Undefined: Self = StObject.set(x, "dimension57", js.undefined)
      
      inline def setDimension58(value: String): Self = StObject.set(x, "dimension58", value.asInstanceOf[js.Any])
      
      inline def setDimension58Undefined: Self = StObject.set(x, "dimension58", js.undefined)
      
      inline def setDimension59(value: String): Self = StObject.set(x, "dimension59", value.asInstanceOf[js.Any])
      
      inline def setDimension59Undefined: Self = StObject.set(x, "dimension59", js.undefined)
      
      inline def setDimension5Undefined: Self = StObject.set(x, "dimension5", js.undefined)
      
      inline def setDimension6(value: String): Self = StObject.set(x, "dimension6", value.asInstanceOf[js.Any])
      
      inline def setDimension60(value: String): Self = StObject.set(x, "dimension60", value.asInstanceOf[js.Any])
      
      inline def setDimension60Undefined: Self = StObject.set(x, "dimension60", js.undefined)
      
      inline def setDimension61(value: String): Self = StObject.set(x, "dimension61", value.asInstanceOf[js.Any])
      
      inline def setDimension61Undefined: Self = StObject.set(x, "dimension61", js.undefined)
      
      inline def setDimension62(value: String): Self = StObject.set(x, "dimension62", value.asInstanceOf[js.Any])
      
      inline def setDimension62Undefined: Self = StObject.set(x, "dimension62", js.undefined)
      
      inline def setDimension63(value: String): Self = StObject.set(x, "dimension63", value.asInstanceOf[js.Any])
      
      inline def setDimension63Undefined: Self = StObject.set(x, "dimension63", js.undefined)
      
      inline def setDimension64(value: String): Self = StObject.set(x, "dimension64", value.asInstanceOf[js.Any])
      
      inline def setDimension64Undefined: Self = StObject.set(x, "dimension64", js.undefined)
      
      inline def setDimension65(value: String): Self = StObject.set(x, "dimension65", value.asInstanceOf[js.Any])
      
      inline def setDimension65Undefined: Self = StObject.set(x, "dimension65", js.undefined)
      
      inline def setDimension66(value: String): Self = StObject.set(x, "dimension66", value.asInstanceOf[js.Any])
      
      inline def setDimension66Undefined: Self = StObject.set(x, "dimension66", js.undefined)
      
      inline def setDimension67(value: String): Self = StObject.set(x, "dimension67", value.asInstanceOf[js.Any])
      
      inline def setDimension67Undefined: Self = StObject.set(x, "dimension67", js.undefined)
      
      inline def setDimension68(value: String): Self = StObject.set(x, "dimension68", value.asInstanceOf[js.Any])
      
      inline def setDimension68Undefined: Self = StObject.set(x, "dimension68", js.undefined)
      
      inline def setDimension69(value: String): Self = StObject.set(x, "dimension69", value.asInstanceOf[js.Any])
      
      inline def setDimension69Undefined: Self = StObject.set(x, "dimension69", js.undefined)
      
      inline def setDimension6Undefined: Self = StObject.set(x, "dimension6", js.undefined)
      
      inline def setDimension7(value: String): Self = StObject.set(x, "dimension7", value.asInstanceOf[js.Any])
      
      inline def setDimension70(value: String): Self = StObject.set(x, "dimension70", value.asInstanceOf[js.Any])
      
      inline def setDimension70Undefined: Self = StObject.set(x, "dimension70", js.undefined)
      
      inline def setDimension71(value: String): Self = StObject.set(x, "dimension71", value.asInstanceOf[js.Any])
      
      inline def setDimension71Undefined: Self = StObject.set(x, "dimension71", js.undefined)
      
      inline def setDimension72(value: String): Self = StObject.set(x, "dimension72", value.asInstanceOf[js.Any])
      
      inline def setDimension72Undefined: Self = StObject.set(x, "dimension72", js.undefined)
      
      inline def setDimension73(value: String): Self = StObject.set(x, "dimension73", value.asInstanceOf[js.Any])
      
      inline def setDimension73Undefined: Self = StObject.set(x, "dimension73", js.undefined)
      
      inline def setDimension74(value: String): Self = StObject.set(x, "dimension74", value.asInstanceOf[js.Any])
      
      inline def setDimension74Undefined: Self = StObject.set(x, "dimension74", js.undefined)
      
      inline def setDimension75(value: String): Self = StObject.set(x, "dimension75", value.asInstanceOf[js.Any])
      
      inline def setDimension75Undefined: Self = StObject.set(x, "dimension75", js.undefined)
      
      inline def setDimension76(value: String): Self = StObject.set(x, "dimension76", value.asInstanceOf[js.Any])
      
      inline def setDimension76Undefined: Self = StObject.set(x, "dimension76", js.undefined)
      
      inline def setDimension77(value: String): Self = StObject.set(x, "dimension77", value.asInstanceOf[js.Any])
      
      inline def setDimension77Undefined: Self = StObject.set(x, "dimension77", js.undefined)
      
      inline def setDimension78(value: String): Self = StObject.set(x, "dimension78", value.asInstanceOf[js.Any])
      
      inline def setDimension78Undefined: Self = StObject.set(x, "dimension78", js.undefined)
      
      inline def setDimension79(value: String): Self = StObject.set(x, "dimension79", value.asInstanceOf[js.Any])
      
      inline def setDimension79Undefined: Self = StObject.set(x, "dimension79", js.undefined)
      
      inline def setDimension7Undefined: Self = StObject.set(x, "dimension7", js.undefined)
      
      inline def setDimension8(value: String): Self = StObject.set(x, "dimension8", value.asInstanceOf[js.Any])
      
      inline def setDimension80(value: String): Self = StObject.set(x, "dimension80", value.asInstanceOf[js.Any])
      
      inline def setDimension80Undefined: Self = StObject.set(x, "dimension80", js.undefined)
      
      inline def setDimension81(value: String): Self = StObject.set(x, "dimension81", value.asInstanceOf[js.Any])
      
      inline def setDimension81Undefined: Self = StObject.set(x, "dimension81", js.undefined)
      
      inline def setDimension82(value: String): Self = StObject.set(x, "dimension82", value.asInstanceOf[js.Any])
      
      inline def setDimension82Undefined: Self = StObject.set(x, "dimension82", js.undefined)
      
      inline def setDimension83(value: String): Self = StObject.set(x, "dimension83", value.asInstanceOf[js.Any])
      
      inline def setDimension83Undefined: Self = StObject.set(x, "dimension83", js.undefined)
      
      inline def setDimension84(value: String): Self = StObject.set(x, "dimension84", value.asInstanceOf[js.Any])
      
      inline def setDimension84Undefined: Self = StObject.set(x, "dimension84", js.undefined)
      
      inline def setDimension85(value: String): Self = StObject.set(x, "dimension85", value.asInstanceOf[js.Any])
      
      inline def setDimension85Undefined: Self = StObject.set(x, "dimension85", js.undefined)
      
      inline def setDimension86(value: String): Self = StObject.set(x, "dimension86", value.asInstanceOf[js.Any])
      
      inline def setDimension86Undefined: Self = StObject.set(x, "dimension86", js.undefined)
      
      inline def setDimension87(value: String): Self = StObject.set(x, "dimension87", value.asInstanceOf[js.Any])
      
      inline def setDimension87Undefined: Self = StObject.set(x, "dimension87", js.undefined)
      
      inline def setDimension88(value: String): Self = StObject.set(x, "dimension88", value.asInstanceOf[js.Any])
      
      inline def setDimension88Undefined: Self = StObject.set(x, "dimension88", js.undefined)
      
      inline def setDimension89(value: String): Self = StObject.set(x, "dimension89", value.asInstanceOf[js.Any])
      
      inline def setDimension89Undefined: Self = StObject.set(x, "dimension89", js.undefined)
      
      inline def setDimension8Undefined: Self = StObject.set(x, "dimension8", js.undefined)
      
      inline def setDimension9(value: String): Self = StObject.set(x, "dimension9", value.asInstanceOf[js.Any])
      
      inline def setDimension90(value: String): Self = StObject.set(x, "dimension90", value.asInstanceOf[js.Any])
      
      inline def setDimension90Undefined: Self = StObject.set(x, "dimension90", js.undefined)
      
      inline def setDimension91(value: String): Self = StObject.set(x, "dimension91", value.asInstanceOf[js.Any])
      
      inline def setDimension91Undefined: Self = StObject.set(x, "dimension91", js.undefined)
      
      inline def setDimension92(value: String): Self = StObject.set(x, "dimension92", value.asInstanceOf[js.Any])
      
      inline def setDimension92Undefined: Self = StObject.set(x, "dimension92", js.undefined)
      
      inline def setDimension93(value: String): Self = StObject.set(x, "dimension93", value.asInstanceOf[js.Any])
      
      inline def setDimension93Undefined: Self = StObject.set(x, "dimension93", js.undefined)
      
      inline def setDimension94(value: String): Self = StObject.set(x, "dimension94", value.asInstanceOf[js.Any])
      
      inline def setDimension94Undefined: Self = StObject.set(x, "dimension94", js.undefined)
      
      inline def setDimension95(value: String): Self = StObject.set(x, "dimension95", value.asInstanceOf[js.Any])
      
      inline def setDimension95Undefined: Self = StObject.set(x, "dimension95", js.undefined)
      
      inline def setDimension96(value: String): Self = StObject.set(x, "dimension96", value.asInstanceOf[js.Any])
      
      inline def setDimension96Undefined: Self = StObject.set(x, "dimension96", js.undefined)
      
      inline def setDimension97(value: String): Self = StObject.set(x, "dimension97", value.asInstanceOf[js.Any])
      
      inline def setDimension97Undefined: Self = StObject.set(x, "dimension97", js.undefined)
      
      inline def setDimension98(value: String): Self = StObject.set(x, "dimension98", value.asInstanceOf[js.Any])
      
      inline def setDimension98Undefined: Self = StObject.set(x, "dimension98", js.undefined)
      
      inline def setDimension99(value: String): Self = StObject.set(x, "dimension99", value.asInstanceOf[js.Any])
      
      inline def setDimension99Undefined: Self = StObject.set(x, "dimension99", js.undefined)
      
      inline def setDimension9Undefined: Self = StObject.set(x, "dimension9", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEventAction(value: String): Self = StObject.set(x, "eventAction", value.asInstanceOf[js.Any])
      
      inline def setEventActionUndefined: Self = StObject.set(x, "eventAction", js.undefined)
      
      inline def setEventCategory(value: String): Self = StObject.set(x, "eventCategory", value.asInstanceOf[js.Any])
      
      inline def setEventCategoryUndefined: Self = StObject.set(x, "eventCategory", js.undefined)
      
      inline def setEventLabel(value: String): Self = StObject.set(x, "eventLabel", value.asInstanceOf[js.Any])
      
      inline def setEventLabelUndefined: Self = StObject.set(x, "eventLabel", js.undefined)
      
      inline def setEventValue(value: Double): Self = StObject.set(x, "eventValue", value.asInstanceOf[js.Any])
      
      inline def setEventValueUndefined: Self = StObject.set(x, "eventValue", js.undefined)
      
      inline def setExDescription(value: String): Self = StObject.set(x, "exDescription", value.asInstanceOf[js.Any])
      
      inline def setExDescriptionUndefined: Self = StObject.set(x, "exDescription", js.undefined)
      
      inline def setExFatal(value: Boolean): Self = StObject.set(x, "exFatal", value.asInstanceOf[js.Any])
      
      inline def setExFatalUndefined: Self = StObject.set(x, "exFatal", js.undefined)
      
      inline def setExpId(value: String): Self = StObject.set(x, "expId", value.asInstanceOf[js.Any])
      
      inline def setExpIdUndefined: Self = StObject.set(x, "expId", js.undefined)
      
      inline def setExpVar(value: String): Self = StObject.set(x, "expVar", value.asInstanceOf[js.Any])
      
      inline def setExpVarUndefined: Self = StObject.set(x, "expVar", js.undefined)
      
      inline def setFlashVersion(value: String): Self = StObject.set(x, "flashVersion", value.asInstanceOf[js.Any])
      
      inline def setFlashVersionUndefined: Self = StObject.set(x, "flashVersion", js.undefined)
      
      inline def setForceSSL(value: Boolean): Self = StObject.set(x, "forceSSL", value.asInstanceOf[js.Any])
      
      inline def setForceSSLUndefined: Self = StObject.set(x, "forceSSL", js.undefined)
      
      inline def setHitCallback(value: () => Unit): Self = StObject.set(x, "hitCallback", js.Any.fromFunction0(value))
      
      inline def setHitCallbackUndefined: Self = StObject.set(x, "hitCallback", js.undefined)
      
      inline def setHitType(value: HitType): Self = StObject.set(x, "hitType", value.asInstanceOf[js.Any])
      
      inline def setHitTypeUndefined: Self = StObject.set(x, "hitType", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setJavaEnabled(value: Boolean): Self = StObject.set(x, "javaEnabled", value.asInstanceOf[js.Any])
      
      inline def setJavaEnabledUndefined: Self = StObject.set(x, "javaEnabled", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLegacyCookieDomain(value: String): Self = StObject.set(x, "legacyCookieDomain", value.asInstanceOf[js.Any])
      
      inline def setLegacyCookieDomainUndefined: Self = StObject.set(x, "legacyCookieDomain", js.undefined)
      
      inline def setLegacyHistoryImport(value: Boolean): Self = StObject.set(x, "legacyHistoryImport", value.asInstanceOf[js.Any])
      
      inline def setLegacyHistoryImportUndefined: Self = StObject.set(x, "legacyHistoryImport", js.undefined)
      
      inline def setLinkid(value: String): Self = StObject.set(x, "linkid", value.asInstanceOf[js.Any])
      
      inline def setLinkidUndefined: Self = StObject.set(x, "linkid", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMetric1(value: String | Double): Self = StObject.set(x, "metric1", value.asInstanceOf[js.Any])
      
      inline def setMetric10(value: String | Double): Self = StObject.set(x, "metric10", value.asInstanceOf[js.Any])
      
      inline def setMetric100(value: String | Double): Self = StObject.set(x, "metric100", value.asInstanceOf[js.Any])
      
      inline def setMetric100Undefined: Self = StObject.set(x, "metric100", js.undefined)
      
      inline def setMetric101(value: String | Double): Self = StObject.set(x, "metric101", value.asInstanceOf[js.Any])
      
      inline def setMetric101Undefined: Self = StObject.set(x, "metric101", js.undefined)
      
      inline def setMetric102(value: String | Double): Self = StObject.set(x, "metric102", value.asInstanceOf[js.Any])
      
      inline def setMetric102Undefined: Self = StObject.set(x, "metric102", js.undefined)
      
      inline def setMetric103(value: String | Double): Self = StObject.set(x, "metric103", value.asInstanceOf[js.Any])
      
      inline def setMetric103Undefined: Self = StObject.set(x, "metric103", js.undefined)
      
      inline def setMetric104(value: String | Double): Self = StObject.set(x, "metric104", value.asInstanceOf[js.Any])
      
      inline def setMetric104Undefined: Self = StObject.set(x, "metric104", js.undefined)
      
      inline def setMetric105(value: String | Double): Self = StObject.set(x, "metric105", value.asInstanceOf[js.Any])
      
      inline def setMetric105Undefined: Self = StObject.set(x, "metric105", js.undefined)
      
      inline def setMetric106(value: String | Double): Self = StObject.set(x, "metric106", value.asInstanceOf[js.Any])
      
      inline def setMetric106Undefined: Self = StObject.set(x, "metric106", js.undefined)
      
      inline def setMetric107(value: String | Double): Self = StObject.set(x, "metric107", value.asInstanceOf[js.Any])
      
      inline def setMetric107Undefined: Self = StObject.set(x, "metric107", js.undefined)
      
      inline def setMetric108(value: String | Double): Self = StObject.set(x, "metric108", value.asInstanceOf[js.Any])
      
      inline def setMetric108Undefined: Self = StObject.set(x, "metric108", js.undefined)
      
      inline def setMetric109(value: String | Double): Self = StObject.set(x, "metric109", value.asInstanceOf[js.Any])
      
      inline def setMetric109Undefined: Self = StObject.set(x, "metric109", js.undefined)
      
      inline def setMetric10Undefined: Self = StObject.set(x, "metric10", js.undefined)
      
      inline def setMetric11(value: String | Double): Self = StObject.set(x, "metric11", value.asInstanceOf[js.Any])
      
      inline def setMetric110(value: String | Double): Self = StObject.set(x, "metric110", value.asInstanceOf[js.Any])
      
      inline def setMetric110Undefined: Self = StObject.set(x, "metric110", js.undefined)
      
      inline def setMetric111(value: String | Double): Self = StObject.set(x, "metric111", value.asInstanceOf[js.Any])
      
      inline def setMetric111Undefined: Self = StObject.set(x, "metric111", js.undefined)
      
      inline def setMetric112(value: String | Double): Self = StObject.set(x, "metric112", value.asInstanceOf[js.Any])
      
      inline def setMetric112Undefined: Self = StObject.set(x, "metric112", js.undefined)
      
      inline def setMetric113(value: String | Double): Self = StObject.set(x, "metric113", value.asInstanceOf[js.Any])
      
      inline def setMetric113Undefined: Self = StObject.set(x, "metric113", js.undefined)
      
      inline def setMetric114(value: String | Double): Self = StObject.set(x, "metric114", value.asInstanceOf[js.Any])
      
      inline def setMetric114Undefined: Self = StObject.set(x, "metric114", js.undefined)
      
      inline def setMetric115(value: String | Double): Self = StObject.set(x, "metric115", value.asInstanceOf[js.Any])
      
      inline def setMetric115Undefined: Self = StObject.set(x, "metric115", js.undefined)
      
      inline def setMetric116(value: String | Double): Self = StObject.set(x, "metric116", value.asInstanceOf[js.Any])
      
      inline def setMetric116Undefined: Self = StObject.set(x, "metric116", js.undefined)
      
      inline def setMetric117(value: String | Double): Self = StObject.set(x, "metric117", value.asInstanceOf[js.Any])
      
      inline def setMetric117Undefined: Self = StObject.set(x, "metric117", js.undefined)
      
      inline def setMetric118(value: String | Double): Self = StObject.set(x, "metric118", value.asInstanceOf[js.Any])
      
      inline def setMetric118Undefined: Self = StObject.set(x, "metric118", js.undefined)
      
      inline def setMetric119(value: String | Double): Self = StObject.set(x, "metric119", value.asInstanceOf[js.Any])
      
      inline def setMetric119Undefined: Self = StObject.set(x, "metric119", js.undefined)
      
      inline def setMetric11Undefined: Self = StObject.set(x, "metric11", js.undefined)
      
      inline def setMetric12(value: String | Double): Self = StObject.set(x, "metric12", value.asInstanceOf[js.Any])
      
      inline def setMetric120(value: String | Double): Self = StObject.set(x, "metric120", value.asInstanceOf[js.Any])
      
      inline def setMetric120Undefined: Self = StObject.set(x, "metric120", js.undefined)
      
      inline def setMetric121(value: String | Double): Self = StObject.set(x, "metric121", value.asInstanceOf[js.Any])
      
      inline def setMetric121Undefined: Self = StObject.set(x, "metric121", js.undefined)
      
      inline def setMetric122(value: String | Double): Self = StObject.set(x, "metric122", value.asInstanceOf[js.Any])
      
      inline def setMetric122Undefined: Self = StObject.set(x, "metric122", js.undefined)
      
      inline def setMetric123(value: String | Double): Self = StObject.set(x, "metric123", value.asInstanceOf[js.Any])
      
      inline def setMetric123Undefined: Self = StObject.set(x, "metric123", js.undefined)
      
      inline def setMetric124(value: String | Double): Self = StObject.set(x, "metric124", value.asInstanceOf[js.Any])
      
      inline def setMetric124Undefined: Self = StObject.set(x, "metric124", js.undefined)
      
      inline def setMetric125(value: String | Double): Self = StObject.set(x, "metric125", value.asInstanceOf[js.Any])
      
      inline def setMetric125Undefined: Self = StObject.set(x, "metric125", js.undefined)
      
      inline def setMetric126(value: String | Double): Self = StObject.set(x, "metric126", value.asInstanceOf[js.Any])
      
      inline def setMetric126Undefined: Self = StObject.set(x, "metric126", js.undefined)
      
      inline def setMetric127(value: String | Double): Self = StObject.set(x, "metric127", value.asInstanceOf[js.Any])
      
      inline def setMetric127Undefined: Self = StObject.set(x, "metric127", js.undefined)
      
      inline def setMetric128(value: String | Double): Self = StObject.set(x, "metric128", value.asInstanceOf[js.Any])
      
      inline def setMetric128Undefined: Self = StObject.set(x, "metric128", js.undefined)
      
      inline def setMetric129(value: String | Double): Self = StObject.set(x, "metric129", value.asInstanceOf[js.Any])
      
      inline def setMetric129Undefined: Self = StObject.set(x, "metric129", js.undefined)
      
      inline def setMetric12Undefined: Self = StObject.set(x, "metric12", js.undefined)
      
      inline def setMetric13(value: String | Double): Self = StObject.set(x, "metric13", value.asInstanceOf[js.Any])
      
      inline def setMetric130(value: String | Double): Self = StObject.set(x, "metric130", value.asInstanceOf[js.Any])
      
      inline def setMetric130Undefined: Self = StObject.set(x, "metric130", js.undefined)
      
      inline def setMetric131(value: String | Double): Self = StObject.set(x, "metric131", value.asInstanceOf[js.Any])
      
      inline def setMetric131Undefined: Self = StObject.set(x, "metric131", js.undefined)
      
      inline def setMetric132(value: String | Double): Self = StObject.set(x, "metric132", value.asInstanceOf[js.Any])
      
      inline def setMetric132Undefined: Self = StObject.set(x, "metric132", js.undefined)
      
      inline def setMetric133(value: String | Double): Self = StObject.set(x, "metric133", value.asInstanceOf[js.Any])
      
      inline def setMetric133Undefined: Self = StObject.set(x, "metric133", js.undefined)
      
      inline def setMetric134(value: String | Double): Self = StObject.set(x, "metric134", value.asInstanceOf[js.Any])
      
      inline def setMetric134Undefined: Self = StObject.set(x, "metric134", js.undefined)
      
      inline def setMetric135(value: String | Double): Self = StObject.set(x, "metric135", value.asInstanceOf[js.Any])
      
      inline def setMetric135Undefined: Self = StObject.set(x, "metric135", js.undefined)
      
      inline def setMetric136(value: String | Double): Self = StObject.set(x, "metric136", value.asInstanceOf[js.Any])
      
      inline def setMetric136Undefined: Self = StObject.set(x, "metric136", js.undefined)
      
      inline def setMetric137(value: String | Double): Self = StObject.set(x, "metric137", value.asInstanceOf[js.Any])
      
      inline def setMetric137Undefined: Self = StObject.set(x, "metric137", js.undefined)
      
      inline def setMetric138(value: String | Double): Self = StObject.set(x, "metric138", value.asInstanceOf[js.Any])
      
      inline def setMetric138Undefined: Self = StObject.set(x, "metric138", js.undefined)
      
      inline def setMetric139(value: String | Double): Self = StObject.set(x, "metric139", value.asInstanceOf[js.Any])
      
      inline def setMetric139Undefined: Self = StObject.set(x, "metric139", js.undefined)
      
      inline def setMetric13Undefined: Self = StObject.set(x, "metric13", js.undefined)
      
      inline def setMetric14(value: String | Double): Self = StObject.set(x, "metric14", value.asInstanceOf[js.Any])
      
      inline def setMetric140(value: String | Double): Self = StObject.set(x, "metric140", value.asInstanceOf[js.Any])
      
      inline def setMetric140Undefined: Self = StObject.set(x, "metric140", js.undefined)
      
      inline def setMetric141(value: String | Double): Self = StObject.set(x, "metric141", value.asInstanceOf[js.Any])
      
      inline def setMetric141Undefined: Self = StObject.set(x, "metric141", js.undefined)
      
      inline def setMetric142(value: String | Double): Self = StObject.set(x, "metric142", value.asInstanceOf[js.Any])
      
      inline def setMetric142Undefined: Self = StObject.set(x, "metric142", js.undefined)
      
      inline def setMetric143(value: String | Double): Self = StObject.set(x, "metric143", value.asInstanceOf[js.Any])
      
      inline def setMetric143Undefined: Self = StObject.set(x, "metric143", js.undefined)
      
      inline def setMetric144(value: String | Double): Self = StObject.set(x, "metric144", value.asInstanceOf[js.Any])
      
      inline def setMetric144Undefined: Self = StObject.set(x, "metric144", js.undefined)
      
      inline def setMetric145(value: String | Double): Self = StObject.set(x, "metric145", value.asInstanceOf[js.Any])
      
      inline def setMetric145Undefined: Self = StObject.set(x, "metric145", js.undefined)
      
      inline def setMetric146(value: String | Double): Self = StObject.set(x, "metric146", value.asInstanceOf[js.Any])
      
      inline def setMetric146Undefined: Self = StObject.set(x, "metric146", js.undefined)
      
      inline def setMetric147(value: String | Double): Self = StObject.set(x, "metric147", value.asInstanceOf[js.Any])
      
      inline def setMetric147Undefined: Self = StObject.set(x, "metric147", js.undefined)
      
      inline def setMetric148(value: String | Double): Self = StObject.set(x, "metric148", value.asInstanceOf[js.Any])
      
      inline def setMetric148Undefined: Self = StObject.set(x, "metric148", js.undefined)
      
      inline def setMetric149(value: String | Double): Self = StObject.set(x, "metric149", value.asInstanceOf[js.Any])
      
      inline def setMetric149Undefined: Self = StObject.set(x, "metric149", js.undefined)
      
      inline def setMetric14Undefined: Self = StObject.set(x, "metric14", js.undefined)
      
      inline def setMetric15(value: String | Double): Self = StObject.set(x, "metric15", value.asInstanceOf[js.Any])
      
      inline def setMetric150(value: String | Double): Self = StObject.set(x, "metric150", value.asInstanceOf[js.Any])
      
      inline def setMetric150Undefined: Self = StObject.set(x, "metric150", js.undefined)
      
      inline def setMetric151(value: String | Double): Self = StObject.set(x, "metric151", value.asInstanceOf[js.Any])
      
      inline def setMetric151Undefined: Self = StObject.set(x, "metric151", js.undefined)
      
      inline def setMetric152(value: String | Double): Self = StObject.set(x, "metric152", value.asInstanceOf[js.Any])
      
      inline def setMetric152Undefined: Self = StObject.set(x, "metric152", js.undefined)
      
      inline def setMetric153(value: String | Double): Self = StObject.set(x, "metric153", value.asInstanceOf[js.Any])
      
      inline def setMetric153Undefined: Self = StObject.set(x, "metric153", js.undefined)
      
      inline def setMetric154(value: String | Double): Self = StObject.set(x, "metric154", value.asInstanceOf[js.Any])
      
      inline def setMetric154Undefined: Self = StObject.set(x, "metric154", js.undefined)
      
      inline def setMetric155(value: String | Double): Self = StObject.set(x, "metric155", value.asInstanceOf[js.Any])
      
      inline def setMetric155Undefined: Self = StObject.set(x, "metric155", js.undefined)
      
      inline def setMetric156(value: String | Double): Self = StObject.set(x, "metric156", value.asInstanceOf[js.Any])
      
      inline def setMetric156Undefined: Self = StObject.set(x, "metric156", js.undefined)
      
      inline def setMetric157(value: String | Double): Self = StObject.set(x, "metric157", value.asInstanceOf[js.Any])
      
      inline def setMetric157Undefined: Self = StObject.set(x, "metric157", js.undefined)
      
      inline def setMetric158(value: String | Double): Self = StObject.set(x, "metric158", value.asInstanceOf[js.Any])
      
      inline def setMetric158Undefined: Self = StObject.set(x, "metric158", js.undefined)
      
      inline def setMetric159(value: String | Double): Self = StObject.set(x, "metric159", value.asInstanceOf[js.Any])
      
      inline def setMetric159Undefined: Self = StObject.set(x, "metric159", js.undefined)
      
      inline def setMetric15Undefined: Self = StObject.set(x, "metric15", js.undefined)
      
      inline def setMetric16(value: String | Double): Self = StObject.set(x, "metric16", value.asInstanceOf[js.Any])
      
      inline def setMetric160(value: String | Double): Self = StObject.set(x, "metric160", value.asInstanceOf[js.Any])
      
      inline def setMetric160Undefined: Self = StObject.set(x, "metric160", js.undefined)
      
      inline def setMetric161(value: String | Double): Self = StObject.set(x, "metric161", value.asInstanceOf[js.Any])
      
      inline def setMetric161Undefined: Self = StObject.set(x, "metric161", js.undefined)
      
      inline def setMetric162(value: String | Double): Self = StObject.set(x, "metric162", value.asInstanceOf[js.Any])
      
      inline def setMetric162Undefined: Self = StObject.set(x, "metric162", js.undefined)
      
      inline def setMetric163(value: String | Double): Self = StObject.set(x, "metric163", value.asInstanceOf[js.Any])
      
      inline def setMetric163Undefined: Self = StObject.set(x, "metric163", js.undefined)
      
      inline def setMetric164(value: String | Double): Self = StObject.set(x, "metric164", value.asInstanceOf[js.Any])
      
      inline def setMetric164Undefined: Self = StObject.set(x, "metric164", js.undefined)
      
      inline def setMetric165(value: String | Double): Self = StObject.set(x, "metric165", value.asInstanceOf[js.Any])
      
      inline def setMetric165Undefined: Self = StObject.set(x, "metric165", js.undefined)
      
      inline def setMetric166(value: String | Double): Self = StObject.set(x, "metric166", value.asInstanceOf[js.Any])
      
      inline def setMetric166Undefined: Self = StObject.set(x, "metric166", js.undefined)
      
      inline def setMetric167(value: String | Double): Self = StObject.set(x, "metric167", value.asInstanceOf[js.Any])
      
      inline def setMetric167Undefined: Self = StObject.set(x, "metric167", js.undefined)
      
      inline def setMetric168(value: String | Double): Self = StObject.set(x, "metric168", value.asInstanceOf[js.Any])
      
      inline def setMetric168Undefined: Self = StObject.set(x, "metric168", js.undefined)
      
      inline def setMetric169(value: String | Double): Self = StObject.set(x, "metric169", value.asInstanceOf[js.Any])
      
      inline def setMetric169Undefined: Self = StObject.set(x, "metric169", js.undefined)
      
      inline def setMetric16Undefined: Self = StObject.set(x, "metric16", js.undefined)
      
      inline def setMetric17(value: String | Double): Self = StObject.set(x, "metric17", value.asInstanceOf[js.Any])
      
      inline def setMetric170(value: String | Double): Self = StObject.set(x, "metric170", value.asInstanceOf[js.Any])
      
      inline def setMetric170Undefined: Self = StObject.set(x, "metric170", js.undefined)
      
      inline def setMetric171(value: String | Double): Self = StObject.set(x, "metric171", value.asInstanceOf[js.Any])
      
      inline def setMetric171Undefined: Self = StObject.set(x, "metric171", js.undefined)
      
      inline def setMetric172(value: String | Double): Self = StObject.set(x, "metric172", value.asInstanceOf[js.Any])
      
      inline def setMetric172Undefined: Self = StObject.set(x, "metric172", js.undefined)
      
      inline def setMetric173(value: String | Double): Self = StObject.set(x, "metric173", value.asInstanceOf[js.Any])
      
      inline def setMetric173Undefined: Self = StObject.set(x, "metric173", js.undefined)
      
      inline def setMetric174(value: String | Double): Self = StObject.set(x, "metric174", value.asInstanceOf[js.Any])
      
      inline def setMetric174Undefined: Self = StObject.set(x, "metric174", js.undefined)
      
      inline def setMetric175(value: String | Double): Self = StObject.set(x, "metric175", value.asInstanceOf[js.Any])
      
      inline def setMetric175Undefined: Self = StObject.set(x, "metric175", js.undefined)
      
      inline def setMetric176(value: String | Double): Self = StObject.set(x, "metric176", value.asInstanceOf[js.Any])
      
      inline def setMetric176Undefined: Self = StObject.set(x, "metric176", js.undefined)
      
      inline def setMetric177(value: String | Double): Self = StObject.set(x, "metric177", value.asInstanceOf[js.Any])
      
      inline def setMetric177Undefined: Self = StObject.set(x, "metric177", js.undefined)
      
      inline def setMetric178(value: String | Double): Self = StObject.set(x, "metric178", value.asInstanceOf[js.Any])
      
      inline def setMetric178Undefined: Self = StObject.set(x, "metric178", js.undefined)
      
      inline def setMetric179(value: String | Double): Self = StObject.set(x, "metric179", value.asInstanceOf[js.Any])
      
      inline def setMetric179Undefined: Self = StObject.set(x, "metric179", js.undefined)
      
      inline def setMetric17Undefined: Self = StObject.set(x, "metric17", js.undefined)
      
      inline def setMetric18(value: String | Double): Self = StObject.set(x, "metric18", value.asInstanceOf[js.Any])
      
      inline def setMetric180(value: String | Double): Self = StObject.set(x, "metric180", value.asInstanceOf[js.Any])
      
      inline def setMetric180Undefined: Self = StObject.set(x, "metric180", js.undefined)
      
      inline def setMetric181(value: String | Double): Self = StObject.set(x, "metric181", value.asInstanceOf[js.Any])
      
      inline def setMetric181Undefined: Self = StObject.set(x, "metric181", js.undefined)
      
      inline def setMetric182(value: String | Double): Self = StObject.set(x, "metric182", value.asInstanceOf[js.Any])
      
      inline def setMetric182Undefined: Self = StObject.set(x, "metric182", js.undefined)
      
      inline def setMetric183(value: String | Double): Self = StObject.set(x, "metric183", value.asInstanceOf[js.Any])
      
      inline def setMetric183Undefined: Self = StObject.set(x, "metric183", js.undefined)
      
      inline def setMetric184(value: String | Double): Self = StObject.set(x, "metric184", value.asInstanceOf[js.Any])
      
      inline def setMetric184Undefined: Self = StObject.set(x, "metric184", js.undefined)
      
      inline def setMetric185(value: String | Double): Self = StObject.set(x, "metric185", value.asInstanceOf[js.Any])
      
      inline def setMetric185Undefined: Self = StObject.set(x, "metric185", js.undefined)
      
      inline def setMetric186(value: String | Double): Self = StObject.set(x, "metric186", value.asInstanceOf[js.Any])
      
      inline def setMetric186Undefined: Self = StObject.set(x, "metric186", js.undefined)
      
      inline def setMetric187(value: String | Double): Self = StObject.set(x, "metric187", value.asInstanceOf[js.Any])
      
      inline def setMetric187Undefined: Self = StObject.set(x, "metric187", js.undefined)
      
      inline def setMetric188(value: String | Double): Self = StObject.set(x, "metric188", value.asInstanceOf[js.Any])
      
      inline def setMetric188Undefined: Self = StObject.set(x, "metric188", js.undefined)
      
      inline def setMetric189(value: String | Double): Self = StObject.set(x, "metric189", value.asInstanceOf[js.Any])
      
      inline def setMetric189Undefined: Self = StObject.set(x, "metric189", js.undefined)
      
      inline def setMetric18Undefined: Self = StObject.set(x, "metric18", js.undefined)
      
      inline def setMetric19(value: String | Double): Self = StObject.set(x, "metric19", value.asInstanceOf[js.Any])
      
      inline def setMetric190(value: String | Double): Self = StObject.set(x, "metric190", value.asInstanceOf[js.Any])
      
      inline def setMetric190Undefined: Self = StObject.set(x, "metric190", js.undefined)
      
      inline def setMetric191(value: String | Double): Self = StObject.set(x, "metric191", value.asInstanceOf[js.Any])
      
      inline def setMetric191Undefined: Self = StObject.set(x, "metric191", js.undefined)
      
      inline def setMetric192(value: String | Double): Self = StObject.set(x, "metric192", value.asInstanceOf[js.Any])
      
      inline def setMetric192Undefined: Self = StObject.set(x, "metric192", js.undefined)
      
      inline def setMetric193(value: String | Double): Self = StObject.set(x, "metric193", value.asInstanceOf[js.Any])
      
      inline def setMetric193Undefined: Self = StObject.set(x, "metric193", js.undefined)
      
      inline def setMetric194(value: String | Double): Self = StObject.set(x, "metric194", value.asInstanceOf[js.Any])
      
      inline def setMetric194Undefined: Self = StObject.set(x, "metric194", js.undefined)
      
      inline def setMetric195(value: String | Double): Self = StObject.set(x, "metric195", value.asInstanceOf[js.Any])
      
      inline def setMetric195Undefined: Self = StObject.set(x, "metric195", js.undefined)
      
      inline def setMetric196(value: String | Double): Self = StObject.set(x, "metric196", value.asInstanceOf[js.Any])
      
      inline def setMetric196Undefined: Self = StObject.set(x, "metric196", js.undefined)
      
      inline def setMetric197(value: String | Double): Self = StObject.set(x, "metric197", value.asInstanceOf[js.Any])
      
      inline def setMetric197Undefined: Self = StObject.set(x, "metric197", js.undefined)
      
      inline def setMetric198(value: String | Double): Self = StObject.set(x, "metric198", value.asInstanceOf[js.Any])
      
      inline def setMetric198Undefined: Self = StObject.set(x, "metric198", js.undefined)
      
      inline def setMetric199(value: String | Double): Self = StObject.set(x, "metric199", value.asInstanceOf[js.Any])
      
      inline def setMetric199Undefined: Self = StObject.set(x, "metric199", js.undefined)
      
      inline def setMetric19Undefined: Self = StObject.set(x, "metric19", js.undefined)
      
      inline def setMetric1Undefined: Self = StObject.set(x, "metric1", js.undefined)
      
      inline def setMetric2(value: String | Double): Self = StObject.set(x, "metric2", value.asInstanceOf[js.Any])
      
      inline def setMetric20(value: String | Double): Self = StObject.set(x, "metric20", value.asInstanceOf[js.Any])
      
      inline def setMetric200(value: String | Double): Self = StObject.set(x, "metric200", value.asInstanceOf[js.Any])
      
      inline def setMetric200Undefined: Self = StObject.set(x, "metric200", js.undefined)
      
      inline def setMetric20Undefined: Self = StObject.set(x, "metric20", js.undefined)
      
      inline def setMetric21(value: String | Double): Self = StObject.set(x, "metric21", value.asInstanceOf[js.Any])
      
      inline def setMetric21Undefined: Self = StObject.set(x, "metric21", js.undefined)
      
      inline def setMetric22(value: String | Double): Self = StObject.set(x, "metric22", value.asInstanceOf[js.Any])
      
      inline def setMetric22Undefined: Self = StObject.set(x, "metric22", js.undefined)
      
      inline def setMetric23(value: String | Double): Self = StObject.set(x, "metric23", value.asInstanceOf[js.Any])
      
      inline def setMetric23Undefined: Self = StObject.set(x, "metric23", js.undefined)
      
      inline def setMetric24(value: String | Double): Self = StObject.set(x, "metric24", value.asInstanceOf[js.Any])
      
      inline def setMetric24Undefined: Self = StObject.set(x, "metric24", js.undefined)
      
      inline def setMetric25(value: String | Double): Self = StObject.set(x, "metric25", value.asInstanceOf[js.Any])
      
      inline def setMetric25Undefined: Self = StObject.set(x, "metric25", js.undefined)
      
      inline def setMetric26(value: String | Double): Self = StObject.set(x, "metric26", value.asInstanceOf[js.Any])
      
      inline def setMetric26Undefined: Self = StObject.set(x, "metric26", js.undefined)
      
      inline def setMetric27(value: String | Double): Self = StObject.set(x, "metric27", value.asInstanceOf[js.Any])
      
      inline def setMetric27Undefined: Self = StObject.set(x, "metric27", js.undefined)
      
      inline def setMetric28(value: String | Double): Self = StObject.set(x, "metric28", value.asInstanceOf[js.Any])
      
      inline def setMetric28Undefined: Self = StObject.set(x, "metric28", js.undefined)
      
      inline def setMetric29(value: String | Double): Self = StObject.set(x, "metric29", value.asInstanceOf[js.Any])
      
      inline def setMetric29Undefined: Self = StObject.set(x, "metric29", js.undefined)
      
      inline def setMetric2Undefined: Self = StObject.set(x, "metric2", js.undefined)
      
      inline def setMetric3(value: String | Double): Self = StObject.set(x, "metric3", value.asInstanceOf[js.Any])
      
      inline def setMetric30(value: String | Double): Self = StObject.set(x, "metric30", value.asInstanceOf[js.Any])
      
      inline def setMetric30Undefined: Self = StObject.set(x, "metric30", js.undefined)
      
      inline def setMetric31(value: String | Double): Self = StObject.set(x, "metric31", value.asInstanceOf[js.Any])
      
      inline def setMetric31Undefined: Self = StObject.set(x, "metric31", js.undefined)
      
      inline def setMetric32(value: String | Double): Self = StObject.set(x, "metric32", value.asInstanceOf[js.Any])
      
      inline def setMetric32Undefined: Self = StObject.set(x, "metric32", js.undefined)
      
      inline def setMetric33(value: String | Double): Self = StObject.set(x, "metric33", value.asInstanceOf[js.Any])
      
      inline def setMetric33Undefined: Self = StObject.set(x, "metric33", js.undefined)
      
      inline def setMetric34(value: String | Double): Self = StObject.set(x, "metric34", value.asInstanceOf[js.Any])
      
      inline def setMetric34Undefined: Self = StObject.set(x, "metric34", js.undefined)
      
      inline def setMetric35(value: String | Double): Self = StObject.set(x, "metric35", value.asInstanceOf[js.Any])
      
      inline def setMetric35Undefined: Self = StObject.set(x, "metric35", js.undefined)
      
      inline def setMetric36(value: String | Double): Self = StObject.set(x, "metric36", value.asInstanceOf[js.Any])
      
      inline def setMetric36Undefined: Self = StObject.set(x, "metric36", js.undefined)
      
      inline def setMetric37(value: String | Double): Self = StObject.set(x, "metric37", value.asInstanceOf[js.Any])
      
      inline def setMetric37Undefined: Self = StObject.set(x, "metric37", js.undefined)
      
      inline def setMetric38(value: String | Double): Self = StObject.set(x, "metric38", value.asInstanceOf[js.Any])
      
      inline def setMetric38Undefined: Self = StObject.set(x, "metric38", js.undefined)
      
      inline def setMetric39(value: String | Double): Self = StObject.set(x, "metric39", value.asInstanceOf[js.Any])
      
      inline def setMetric39Undefined: Self = StObject.set(x, "metric39", js.undefined)
      
      inline def setMetric3Undefined: Self = StObject.set(x, "metric3", js.undefined)
      
      inline def setMetric4(value: String | Double): Self = StObject.set(x, "metric4", value.asInstanceOf[js.Any])
      
      inline def setMetric40(value: String | Double): Self = StObject.set(x, "metric40", value.asInstanceOf[js.Any])
      
      inline def setMetric40Undefined: Self = StObject.set(x, "metric40", js.undefined)
      
      inline def setMetric41(value: String | Double): Self = StObject.set(x, "metric41", value.asInstanceOf[js.Any])
      
      inline def setMetric41Undefined: Self = StObject.set(x, "metric41", js.undefined)
      
      inline def setMetric42(value: String | Double): Self = StObject.set(x, "metric42", value.asInstanceOf[js.Any])
      
      inline def setMetric42Undefined: Self = StObject.set(x, "metric42", js.undefined)
      
      inline def setMetric43(value: String | Double): Self = StObject.set(x, "metric43", value.asInstanceOf[js.Any])
      
      inline def setMetric43Undefined: Self = StObject.set(x, "metric43", js.undefined)
      
      inline def setMetric44(value: String | Double): Self = StObject.set(x, "metric44", value.asInstanceOf[js.Any])
      
      inline def setMetric44Undefined: Self = StObject.set(x, "metric44", js.undefined)
      
      inline def setMetric45(value: String | Double): Self = StObject.set(x, "metric45", value.asInstanceOf[js.Any])
      
      inline def setMetric45Undefined: Self = StObject.set(x, "metric45", js.undefined)
      
      inline def setMetric46(value: String | Double): Self = StObject.set(x, "metric46", value.asInstanceOf[js.Any])
      
      inline def setMetric46Undefined: Self = StObject.set(x, "metric46", js.undefined)
      
      inline def setMetric47(value: String | Double): Self = StObject.set(x, "metric47", value.asInstanceOf[js.Any])
      
      inline def setMetric47Undefined: Self = StObject.set(x, "metric47", js.undefined)
      
      inline def setMetric48(value: String | Double): Self = StObject.set(x, "metric48", value.asInstanceOf[js.Any])
      
      inline def setMetric48Undefined: Self = StObject.set(x, "metric48", js.undefined)
      
      inline def setMetric49(value: String | Double): Self = StObject.set(x, "metric49", value.asInstanceOf[js.Any])
      
      inline def setMetric49Undefined: Self = StObject.set(x, "metric49", js.undefined)
      
      inline def setMetric4Undefined: Self = StObject.set(x, "metric4", js.undefined)
      
      inline def setMetric5(value: String | Double): Self = StObject.set(x, "metric5", value.asInstanceOf[js.Any])
      
      inline def setMetric50(value: String | Double): Self = StObject.set(x, "metric50", value.asInstanceOf[js.Any])
      
      inline def setMetric50Undefined: Self = StObject.set(x, "metric50", js.undefined)
      
      inline def setMetric51(value: String | Double): Self = StObject.set(x, "metric51", value.asInstanceOf[js.Any])
      
      inline def setMetric51Undefined: Self = StObject.set(x, "metric51", js.undefined)
      
      inline def setMetric52(value: String | Double): Self = StObject.set(x, "metric52", value.asInstanceOf[js.Any])
      
      inline def setMetric52Undefined: Self = StObject.set(x, "metric52", js.undefined)
      
      inline def setMetric53(value: String | Double): Self = StObject.set(x, "metric53", value.asInstanceOf[js.Any])
      
      inline def setMetric53Undefined: Self = StObject.set(x, "metric53", js.undefined)
      
      inline def setMetric54(value: String | Double): Self = StObject.set(x, "metric54", value.asInstanceOf[js.Any])
      
      inline def setMetric54Undefined: Self = StObject.set(x, "metric54", js.undefined)
      
      inline def setMetric55(value: String | Double): Self = StObject.set(x, "metric55", value.asInstanceOf[js.Any])
      
      inline def setMetric55Undefined: Self = StObject.set(x, "metric55", js.undefined)
      
      inline def setMetric56(value: String | Double): Self = StObject.set(x, "metric56", value.asInstanceOf[js.Any])
      
      inline def setMetric56Undefined: Self = StObject.set(x, "metric56", js.undefined)
      
      inline def setMetric57(value: String | Double): Self = StObject.set(x, "metric57", value.asInstanceOf[js.Any])
      
      inline def setMetric57Undefined: Self = StObject.set(x, "metric57", js.undefined)
      
      inline def setMetric58(value: String | Double): Self = StObject.set(x, "metric58", value.asInstanceOf[js.Any])
      
      inline def setMetric58Undefined: Self = StObject.set(x, "metric58", js.undefined)
      
      inline def setMetric59(value: String | Double): Self = StObject.set(x, "metric59", value.asInstanceOf[js.Any])
      
      inline def setMetric59Undefined: Self = StObject.set(x, "metric59", js.undefined)
      
      inline def setMetric5Undefined: Self = StObject.set(x, "metric5", js.undefined)
      
      inline def setMetric6(value: String | Double): Self = StObject.set(x, "metric6", value.asInstanceOf[js.Any])
      
      inline def setMetric60(value: String | Double): Self = StObject.set(x, "metric60", value.asInstanceOf[js.Any])
      
      inline def setMetric60Undefined: Self = StObject.set(x, "metric60", js.undefined)
      
      inline def setMetric61(value: String | Double): Self = StObject.set(x, "metric61", value.asInstanceOf[js.Any])
      
      inline def setMetric61Undefined: Self = StObject.set(x, "metric61", js.undefined)
      
      inline def setMetric62(value: String | Double): Self = StObject.set(x, "metric62", value.asInstanceOf[js.Any])
      
      inline def setMetric62Undefined: Self = StObject.set(x, "metric62", js.undefined)
      
      inline def setMetric63(value: String | Double): Self = StObject.set(x, "metric63", value.asInstanceOf[js.Any])
      
      inline def setMetric63Undefined: Self = StObject.set(x, "metric63", js.undefined)
      
      inline def setMetric64(value: String | Double): Self = StObject.set(x, "metric64", value.asInstanceOf[js.Any])
      
      inline def setMetric64Undefined: Self = StObject.set(x, "metric64", js.undefined)
      
      inline def setMetric65(value: String | Double): Self = StObject.set(x, "metric65", value.asInstanceOf[js.Any])
      
      inline def setMetric65Undefined: Self = StObject.set(x, "metric65", js.undefined)
      
      inline def setMetric66(value: String | Double): Self = StObject.set(x, "metric66", value.asInstanceOf[js.Any])
      
      inline def setMetric66Undefined: Self = StObject.set(x, "metric66", js.undefined)
      
      inline def setMetric67(value: String | Double): Self = StObject.set(x, "metric67", value.asInstanceOf[js.Any])
      
      inline def setMetric67Undefined: Self = StObject.set(x, "metric67", js.undefined)
      
      inline def setMetric68(value: String | Double): Self = StObject.set(x, "metric68", value.asInstanceOf[js.Any])
      
      inline def setMetric68Undefined: Self = StObject.set(x, "metric68", js.undefined)
      
      inline def setMetric69(value: String | Double): Self = StObject.set(x, "metric69", value.asInstanceOf[js.Any])
      
      inline def setMetric69Undefined: Self = StObject.set(x, "metric69", js.undefined)
      
      inline def setMetric6Undefined: Self = StObject.set(x, "metric6", js.undefined)
      
      inline def setMetric7(value: String | Double): Self = StObject.set(x, "metric7", value.asInstanceOf[js.Any])
      
      inline def setMetric70(value: String | Double): Self = StObject.set(x, "metric70", value.asInstanceOf[js.Any])
      
      inline def setMetric70Undefined: Self = StObject.set(x, "metric70", js.undefined)
      
      inline def setMetric71(value: String | Double): Self = StObject.set(x, "metric71", value.asInstanceOf[js.Any])
      
      inline def setMetric71Undefined: Self = StObject.set(x, "metric71", js.undefined)
      
      inline def setMetric72(value: String | Double): Self = StObject.set(x, "metric72", value.asInstanceOf[js.Any])
      
      inline def setMetric72Undefined: Self = StObject.set(x, "metric72", js.undefined)
      
      inline def setMetric73(value: String | Double): Self = StObject.set(x, "metric73", value.asInstanceOf[js.Any])
      
      inline def setMetric73Undefined: Self = StObject.set(x, "metric73", js.undefined)
      
      inline def setMetric74(value: String | Double): Self = StObject.set(x, "metric74", value.asInstanceOf[js.Any])
      
      inline def setMetric74Undefined: Self = StObject.set(x, "metric74", js.undefined)
      
      inline def setMetric75(value: String | Double): Self = StObject.set(x, "metric75", value.asInstanceOf[js.Any])
      
      inline def setMetric75Undefined: Self = StObject.set(x, "metric75", js.undefined)
      
      inline def setMetric76(value: String | Double): Self = StObject.set(x, "metric76", value.asInstanceOf[js.Any])
      
      inline def setMetric76Undefined: Self = StObject.set(x, "metric76", js.undefined)
      
      inline def setMetric77(value: String | Double): Self = StObject.set(x, "metric77", value.asInstanceOf[js.Any])
      
      inline def setMetric77Undefined: Self = StObject.set(x, "metric77", js.undefined)
      
      inline def setMetric78(value: String | Double): Self = StObject.set(x, "metric78", value.asInstanceOf[js.Any])
      
      inline def setMetric78Undefined: Self = StObject.set(x, "metric78", js.undefined)
      
      inline def setMetric79(value: String | Double): Self = StObject.set(x, "metric79", value.asInstanceOf[js.Any])
      
      inline def setMetric79Undefined: Self = StObject.set(x, "metric79", js.undefined)
      
      inline def setMetric7Undefined: Self = StObject.set(x, "metric7", js.undefined)
      
      inline def setMetric8(value: String | Double): Self = StObject.set(x, "metric8", value.asInstanceOf[js.Any])
      
      inline def setMetric80(value: String | Double): Self = StObject.set(x, "metric80", value.asInstanceOf[js.Any])
      
      inline def setMetric80Undefined: Self = StObject.set(x, "metric80", js.undefined)
      
      inline def setMetric81(value: String | Double): Self = StObject.set(x, "metric81", value.asInstanceOf[js.Any])
      
      inline def setMetric81Undefined: Self = StObject.set(x, "metric81", js.undefined)
      
      inline def setMetric82(value: String | Double): Self = StObject.set(x, "metric82", value.asInstanceOf[js.Any])
      
      inline def setMetric82Undefined: Self = StObject.set(x, "metric82", js.undefined)
      
      inline def setMetric83(value: String | Double): Self = StObject.set(x, "metric83", value.asInstanceOf[js.Any])
      
      inline def setMetric83Undefined: Self = StObject.set(x, "metric83", js.undefined)
      
      inline def setMetric84(value: String | Double): Self = StObject.set(x, "metric84", value.asInstanceOf[js.Any])
      
      inline def setMetric84Undefined: Self = StObject.set(x, "metric84", js.undefined)
      
      inline def setMetric85(value: String | Double): Self = StObject.set(x, "metric85", value.asInstanceOf[js.Any])
      
      inline def setMetric85Undefined: Self = StObject.set(x, "metric85", js.undefined)
      
      inline def setMetric86(value: String | Double): Self = StObject.set(x, "metric86", value.asInstanceOf[js.Any])
      
      inline def setMetric86Undefined: Self = StObject.set(x, "metric86", js.undefined)
      
      inline def setMetric87(value: String | Double): Self = StObject.set(x, "metric87", value.asInstanceOf[js.Any])
      
      inline def setMetric87Undefined: Self = StObject.set(x, "metric87", js.undefined)
      
      inline def setMetric88(value: String | Double): Self = StObject.set(x, "metric88", value.asInstanceOf[js.Any])
      
      inline def setMetric88Undefined: Self = StObject.set(x, "metric88", js.undefined)
      
      inline def setMetric89(value: String | Double): Self = StObject.set(x, "metric89", value.asInstanceOf[js.Any])
      
      inline def setMetric89Undefined: Self = StObject.set(x, "metric89", js.undefined)
      
      inline def setMetric8Undefined: Self = StObject.set(x, "metric8", js.undefined)
      
      inline def setMetric9(value: String | Double): Self = StObject.set(x, "metric9", value.asInstanceOf[js.Any])
      
      inline def setMetric90(value: String | Double): Self = StObject.set(x, "metric90", value.asInstanceOf[js.Any])
      
      inline def setMetric90Undefined: Self = StObject.set(x, "metric90", js.undefined)
      
      inline def setMetric91(value: String | Double): Self = StObject.set(x, "metric91", value.asInstanceOf[js.Any])
      
      inline def setMetric91Undefined: Self = StObject.set(x, "metric91", js.undefined)
      
      inline def setMetric92(value: String | Double): Self = StObject.set(x, "metric92", value.asInstanceOf[js.Any])
      
      inline def setMetric92Undefined: Self = StObject.set(x, "metric92", js.undefined)
      
      inline def setMetric93(value: String | Double): Self = StObject.set(x, "metric93", value.asInstanceOf[js.Any])
      
      inline def setMetric93Undefined: Self = StObject.set(x, "metric93", js.undefined)
      
      inline def setMetric94(value: String | Double): Self = StObject.set(x, "metric94", value.asInstanceOf[js.Any])
      
      inline def setMetric94Undefined: Self = StObject.set(x, "metric94", js.undefined)
      
      inline def setMetric95(value: String | Double): Self = StObject.set(x, "metric95", value.asInstanceOf[js.Any])
      
      inline def setMetric95Undefined: Self = StObject.set(x, "metric95", js.undefined)
      
      inline def setMetric96(value: String | Double): Self = StObject.set(x, "metric96", value.asInstanceOf[js.Any])
      
      inline def setMetric96Undefined: Self = StObject.set(x, "metric96", js.undefined)
      
      inline def setMetric97(value: String | Double): Self = StObject.set(x, "metric97", value.asInstanceOf[js.Any])
      
      inline def setMetric97Undefined: Self = StObject.set(x, "metric97", js.undefined)
      
      inline def setMetric98(value: String | Double): Self = StObject.set(x, "metric98", value.asInstanceOf[js.Any])
      
      inline def setMetric98Undefined: Self = StObject.set(x, "metric98", js.undefined)
      
      inline def setMetric99(value: String | Double): Self = StObject.set(x, "metric99", value.asInstanceOf[js.Any])
      
      inline def setMetric99Undefined: Self = StObject.set(x, "metric99", js.undefined)
      
      inline def setMetric9Undefined: Self = StObject.set(x, "metric9", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNonInteraction(value: Boolean): Self = StObject.set(x, "nonInteraction", value.asInstanceOf[js.Any])
      
      inline def setNonInteractionUndefined: Self = StObject.set(x, "nonInteraction", js.undefined)
      
      inline def setOption(value: String): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPosition(value: Double | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      inline def setQueueTime(value: Double): Self = StObject.set(x, "queueTime", value.asInstanceOf[js.Any])
      
      inline def setQueueTimeUndefined: Self = StObject.set(x, "queueTime", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setRevenue(value: String): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
      
      inline def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      inline def setScreenColors(value: String): Self = StObject.set(x, "screenColors", value.asInstanceOf[js.Any])
      
      inline def setScreenColorsUndefined: Self = StObject.set(x, "screenColors", js.undefined)
      
      inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
      
      inline def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
      
      inline def setScreenResolution(value: String): Self = StObject.set(x, "screenResolution", value.asInstanceOf[js.Any])
      
      inline def setScreenResolutionUndefined: Self = StObject.set(x, "screenResolution", js.undefined)
      
      inline def setSessionControl(value: String): Self = StObject.set(x, "sessionControl", value.asInstanceOf[js.Any])
      
      inline def setSessionControlUndefined: Self = StObject.set(x, "sessionControl", js.undefined)
      
      inline def setShipping(value: String): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
      
      inline def setSiteSpeedSampleRate(value: Double): Self = StObject.set(x, "siteSpeedSampleRate", value.asInstanceOf[js.Any])
      
      inline def setSiteSpeedSampleRateUndefined: Self = StObject.set(x, "siteSpeedSampleRate", js.undefined)
      
      inline def setSocialAction(value: String): Self = StObject.set(x, "socialAction", value.asInstanceOf[js.Any])
      
      inline def setSocialActionUndefined: Self = StObject.set(x, "socialAction", js.undefined)
      
      inline def setSocialNetwork(value: String): Self = StObject.set(x, "socialNetwork", value.asInstanceOf[js.Any])
      
      inline def setSocialNetworkUndefined: Self = StObject.set(x, "socialNetwork", js.undefined)
      
      inline def setSocialTarget(value: String): Self = StObject.set(x, "socialTarget", value.asInstanceOf[js.Any])
      
      inline def setSocialTargetUndefined: Self = StObject.set(x, "socialTarget", js.undefined)
      
      inline def setSome(value: String): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
      
      inline def setSomeUndefined: Self = StObject.set(x, "some", js.undefined)
      
      inline def setStep(value: Boolean | Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      inline def setStoreGac(value: Boolean): Self = StObject.set(x, "storeGac", value.asInstanceOf[js.Any])
      
      inline def setStoreGacUndefined: Self = StObject.set(x, "storeGac", js.undefined)
      
      inline def setTax(value: String): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
      
      inline def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
      
      inline def setTimingCategory(value: String): Self = StObject.set(x, "timingCategory", value.asInstanceOf[js.Any])
      
      inline def setTimingCategoryUndefined: Self = StObject.set(x, "timingCategory", js.undefined)
      
      inline def setTimingLabel(value: String): Self = StObject.set(x, "timingLabel", value.asInstanceOf[js.Any])
      
      inline def setTimingLabelUndefined: Self = StObject.set(x, "timingLabel", js.undefined)
      
      inline def setTimingValue(value: Double): Self = StObject.set(x, "timingValue", value.asInstanceOf[js.Any])
      
      inline def setTimingValueUndefined: Self = StObject.set(x, "timingValue", js.undefined)
      
      inline def setTimingVar(value: String): Self = StObject.set(x, "timingVar", value.asInstanceOf[js.Any])
      
      inline def setTimingVarUndefined: Self = StObject.set(x, "timingVar", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      inline def setUseBeacon(value: Boolean): Self = StObject.set(x, "useBeacon", value.asInstanceOf[js.Any])
      
      inline def setUseBeaconUndefined: Self = StObject.set(x, "useBeacon", js.undefined)
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setViewportSize(value: String): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
      
      inline def setViewportSizeUndefined: Self = StObject.set(x, "viewportSize", js.undefined)
    }
  }
  
  // https://developers.google.com/analytics/devguides/collection/analyticsjs/method-reference
  // https://developers.google.com/analytics/devguides/collection/analyticsjs/field-reference#hitType
  /* Rewritten from type alias, can be one of: 
    - typings.googleAnalytics.googleAnalyticsStrings.pageview
    - typings.googleAnalytics.googleAnalyticsStrings.screenview
    - typings.googleAnalytics.googleAnalyticsStrings.event
    - typings.googleAnalytics.googleAnalyticsStrings.transaction
    - typings.googleAnalytics.googleAnalyticsStrings.item
    - typings.googleAnalytics.googleAnalyticsStrings.social
    - typings.googleAnalytics.googleAnalyticsStrings.exception
    - typings.googleAnalytics.googleAnalyticsStrings.timing
  */
  trait HitType extends StObject
  object HitType {
    
    inline def event: typings.googleAnalytics.googleAnalyticsStrings.event = "event".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.event]
    
    inline def exception: typings.googleAnalytics.googleAnalyticsStrings.exception = "exception".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.exception]
    
    inline def item: typings.googleAnalytics.googleAnalyticsStrings.item = "item".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.item]
    
    inline def pageview: typings.googleAnalytics.googleAnalyticsStrings.pageview = "pageview".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.pageview]
    
    inline def screenview: typings.googleAnalytics.googleAnalyticsStrings.screenview = "screenview".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.screenview]
    
    inline def social: typings.googleAnalytics.googleAnalyticsStrings.social = "social".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.social]
    
    inline def timing: typings.googleAnalytics.googleAnalyticsStrings.timing = "timing".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.timing]
    
    inline def transaction: typings.googleAnalytics.googleAnalyticsStrings.transaction = "transaction".asInstanceOf[typings.googleAnalytics.googleAnalyticsStrings.transaction]
  }
  
  @js.native
  trait Model extends StObject {
    
    def get(fieldName: String): Any = js.native
    
    def set(fieldName: String, fieldValue: Any): Unit = js.native
    def set(fieldName: String, fieldValue: Any, temporary: Boolean): Unit = js.native
    def set(fields: js.Object): Unit = js.native
    def set(fields: js.Object, fieldValue: Null, temporary: Boolean): Unit = js.native
    def set(fields: js.Object, fieldValue: Unit, temporary: Boolean): Unit = js.native
  }
  
  @js.native
  trait Tracker extends StObject {
    
    def get(fieldName: String): Any = js.native
    
    def send(hitType: String, fieldsObject: js.Object): Unit = js.native
    def send(hitType: String, fields: Any*): Unit = js.native
    
    def set(fieldName: String, fieldValue: Any): Unit = js.native
    def set(fieldsObject: js.Object): Unit = js.native
  }
  
  @js.native
  trait ga extends StObject {
    
    def apply(command: String, fields: Any*): Unit = js.native
    def apply(command: String, hitType: HitType, fields: Any*): Unit = js.native
    def apply(command: create, trackingId: String): Unit = js.native
    def apply(command: create, trackingId: String, cookieDomain: String): Unit = js.native
    def apply(command: create, trackingId: String, cookieDomain: String, name: String): Unit = js.native
    def apply(
      command: create,
      trackingId: String,
      cookieDomain: String,
      name: String,
      fieldsObject: FieldsObject
    ): Unit = js.native
    def apply(command: create, trackingId: String, cookieDomain: String, name: Unit, fieldsObject: FieldsObject): Unit = js.native
    def apply(command: create, trackingId: String, cookieDomain: Unit, name: String): Unit = js.native
    def apply(command: create, trackingId: String, cookieDomain: Unit, name: String, fieldsObject: FieldsObject): Unit = js.native
    def apply(command: create, trackingId: String, cookieDomain: Unit, name: Unit, fieldsObject: FieldsObject): Unit = js.native
    def apply(
      command: provide,
      pluginName: String,
      pluginConstructor: js.Function2[
          /* tracker */ typings.googleAnalytics.UniversalAnalytics.Tracker, 
          /* pluginOptions */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Unit = js.native
    def apply(command: remove): Unit = js.native
    def apply(command: require, pluginName: String): Unit = js.native
    def apply(command: require, pluginName: String, pluginOptions: Any): Unit = js.native
    def apply(command: send, fieldsObject: FieldsObject): Unit = js.native
    def apply(command: send, fieldsObject: EventCategory): Unit = js.native
    def apply(command: send, hitType: event, eventCategory: String, eventAction: String): Unit = js.native
    def apply(command: send, hitType: event, eventCategory: String, eventAction: String, eventLabel: String): Unit = js.native
    def apply(
      command: send,
      hitType: event,
      eventCategory: String,
      eventAction: String,
      eventLabel: String,
      eventValue: Double
    ): Unit = js.native
    def apply(
      command: send,
      hitType: event,
      eventCategory: String,
      eventAction: String,
      eventLabel: String,
      eventValue: Double,
      fieldsObject: FieldsObject
    ): Unit = js.native
    def apply(
      command: send,
      hitType: event,
      eventCategory: String,
      eventAction: String,
      eventLabel: String,
      eventValue: Unit,
      fieldsObject: FieldsObject
    ): Unit = js.native
    def apply(
      command: send,
      hitType: event,
      eventCategory: String,
      eventAction: String,
      eventLabel: Unit,
      eventValue: Double
    ): Unit = js.native
    def apply(
      command: send,
      hitType: event,
      eventCategory: String,
      eventAction: String,
      eventLabel: Unit,
      eventValue: Double,
      fieldsObject: FieldsObject
    ): Unit = js.native
    def apply(
      command: send,
      hitType: event,
      eventCategory: String,
      eventAction: String,
      eventLabel: Unit,
      eventValue: Unit,
      fieldsObject: FieldsObject
    ): Unit = js.native
    def apply(command: send, hitType: event, fieldsObject: EventAction): Unit = js.native
    def apply(command: send, hitType: pageview, page: String): Unit = js.native
    def apply(command: send, hitType: social, fieldsObject: SocialAction): Unit = js.native
    def apply(command: send, hitType: social, socialNetwork: String, socialAction: String, socialTarget: String): Unit = js.native
    def apply(command: send, hitType: timing, fieldsObject: TimingCategory): Unit = js.native
    def apply(command: send, hitType: timing, timingCategory: String, timingVar: String, timingValue: Double): Unit = js.native
    def apply(
      readyCallback: js.Function1[
          /* defaultTracker */ js.UndefOr[typings.googleAnalytics.UniversalAnalytics.Tracker], 
          Unit
        ]
    ): Unit = js.native
    
    def create(trackingId: String): typings.googleAnalytics.UniversalAnalytics.Tracker = js.native
    def create(trackingId: String, cookieDomain: String): typings.googleAnalytics.UniversalAnalytics.Tracker = js.native
    def create(trackingId: String, cookieDomain: String, fieldsObject: FieldsObject): typings.googleAnalytics.UniversalAnalytics.Tracker = js.native
    def create(trackingId: String, cookieDomain: String, name: String): typings.googleAnalytics.UniversalAnalytics.Tracker = js.native
    def create(trackingId: String, cookieDomain: String, name: String, fieldsObject: FieldsObject): typings.googleAnalytics.UniversalAnalytics.Tracker = js.native
    def create(trackingId: String, fieldsObject: FieldsObject): typings.googleAnalytics.UniversalAnalytics.Tracker = js.native
    
    def getAll(): js.Array[typings.googleAnalytics.UniversalAnalytics.Tracker] = js.native
    
    def getByName(name: String): typings.googleAnalytics.UniversalAnalytics.Tracker = js.native
    
    var l: Double = js.native
    
    var q: js.Array[Any] = js.native
    
    def remove(name: String): Unit = js.native
  }
}
