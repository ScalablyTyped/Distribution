package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.facebookNodejsBusinessSdkBooleans.`false`
import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsAdMonetizationPropertyMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/ad-monetization-property", JSImport.Default)
  @js.native
  open class default () extends AdMonetizationProperty
  
  @js.native
  trait AdMonetizationProperty extends AbstractCrudObject {
    
    def createAdNetworkAnalytic(fields: js.Array[String]): js.Promise[AdMonetizationProperty] = js.native
    def createAdNetworkAnalytic(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[AdMonetizationProperty] = js.native
    def createAdNetworkAnalytic(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdMonetizationProperty] = js.native
    def createAdNetworkAnalytic(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[AdMonetizationProperty] = js.native
    
    def get(fields: js.Array[String]): js.Promise[AdMonetizationProperty] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[AdMonetizationProperty] = js.native
    
    def getAdNetworkAnalytics(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getAdNetworkAnalytics(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getAdNetworkAnalytics(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getAdNetworkAnalytics(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    
    def getAdNetworkAnalyticsResults(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getAdNetworkAnalyticsResults(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getAdNetworkAnalyticsResults(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    def getAdNetworkAnalyticsResults(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default | js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getAdNetworkAnalyticsResults")
    def getAdNetworkAnalyticsResults_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getAdNetworkAnalyticsResults")
    def getAdNetworkAnalyticsResults_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getAdNetworkAnalyticsResults")
    def getAdNetworkAnalyticsResults_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getAdNetworkAnalyticsResults")
    def getAdNetworkAnalyticsResults_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    @JSName("getAdNetworkAnalytics")
    def getAdNetworkAnalytics_Promise(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getAdNetworkAnalytics")
    def getAdNetworkAnalytics_Promise(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcCursorMod.default] = js.native
    @JSName("getAdNetworkAnalytics")
    def getAdNetworkAnalytics_false(fields: js.Array[String], params: Unit, fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    @JSName("getAdNetworkAnalytics")
    def getAdNetworkAnalytics_false(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: `false`): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
  }
}
