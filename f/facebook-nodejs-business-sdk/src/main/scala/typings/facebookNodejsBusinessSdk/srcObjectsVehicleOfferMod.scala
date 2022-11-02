package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsVehicleOfferMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/vehicle-offer", JSImport.Default)
  @js.native
  open class default () extends VehicleOffer
  
  @js.native
  trait VehicleOffer extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[VehicleOffer] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[VehicleOffer] = js.native
    
    def getAugmentedRealitiesMetadata(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAugmentedRealitiesMetadata(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAugmentedRealitiesMetadata(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getAugmentedRealitiesMetadata(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getChannelsToIntegrityStatus(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getChannelsToIntegrityStatus(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getChannelsToIntegrityStatus(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getChannelsToIntegrityStatus(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getVideosMetadata(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getVideosMetadata(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getVideosMetadata(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getVideosMetadata(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
  }
}
