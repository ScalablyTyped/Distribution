package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsOfflineConversionDataSetMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/offline-conversion-data-set", JSImport.Default)
  @js.native
  open class default () extends OfflineConversionDataSet
  
  @js.native
  trait OfflineConversionDataSet extends AbstractCrudObject {
    
    def createAdAccount(fields: js.Array[String]): js.Promise[OfflineConversionDataSet] = js.native
    def createAdAccount(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[OfflineConversionDataSet] = js.native
    def createAdAccount(fields: js.Array[String], params: Record[String, Any]): js.Promise[OfflineConversionDataSet] = js.native
    def createAdAccount(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[OfflineConversionDataSet] = js.native
    
    def createAgency(fields: js.Array[String]): js.Promise[OfflineConversionDataSet] = js.native
    def createAgency(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[OfflineConversionDataSet] = js.native
    def createAgency(fields: js.Array[String], params: Record[String, Any]): js.Promise[OfflineConversionDataSet] = js.native
    def createAgency(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[OfflineConversionDataSet] = js.native
    
    def createEvent(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def createEvent(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def createEvent(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def createEvent(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def createUpload(fields: js.Array[String]): js.Promise[
        typings.facebookNodejsBusinessSdk.srcObjectsOfflineConversionDataSetUploadMod.default
      ] = js.native
    def createUpload(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[
        typings.facebookNodejsBusinessSdk.srcObjectsOfflineConversionDataSetUploadMod.default
      ] = js.native
    def createUpload(fields: js.Array[String], params: Record[String, Any]): js.Promise[
        typings.facebookNodejsBusinessSdk.srcObjectsOfflineConversionDataSetUploadMod.default
      ] = js.native
    def createUpload(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[
        typings.facebookNodejsBusinessSdk.srcObjectsOfflineConversionDataSetUploadMod.default
      ] = js.native
    
    def createValidate(fields: js.Array[String]): js.Promise[OfflineConversionDataSet] = js.native
    def createValidate(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[OfflineConversionDataSet] = js.native
    def createValidate(fields: js.Array[String], params: Record[String, Any]): js.Promise[OfflineConversionDataSet] = js.native
    def createValidate(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[OfflineConversionDataSet] = js.native
    
    def delete(fields: js.Array[String]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    def delete(fields: js.Array[String], params: Record[String, Any]): js.Promise[typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default] = js.native
    
    def get(fields: js.Array[String]): js.Promise[OfflineConversionDataSet] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[OfflineConversionDataSet] = js.native
    
    def getAdAccounts(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAdAccounts(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAdAccounts(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAdAccounts(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getAgencies(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAgencies(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAgencies(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAgencies(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getAudiences(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAudiences(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAudiences(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAudiences(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getCustomConversions(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getCustomConversions(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getCustomConversions(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getCustomConversions(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getStats(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getStats(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getStats(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getStats(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getUploads(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getUploads(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getUploads(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getUploads(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def update(fields: js.Array[String]): js.Promise[OfflineConversionDataSet] = js.native
    def update(fields: js.Array[String], params: Record[String, Any]): js.Promise[OfflineConversionDataSet] = js.native
  }
}
