package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsUtilsMod {
  
  @JSImport("epcis2.js/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildCPIUri(gcp: String, componentPartReference: String, serial: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCPIUri")(gcp.asInstanceOf[js.Any], componentPartReference.asInstanceOf[js.Any], serial.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildGDTIUri(gcp: String, documentType: String, serialNumber: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGDTIUri")(gcp.asInstanceOf[js.Any], documentType.asInstanceOf[js.Any], serialNumber.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildGIAIUri(gcp: String, individualAssetReference: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGIAIUri")(gcp.asInstanceOf[js.Any], individualAssetReference.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildGIDUri(manageNumber: String, objectClass: String, serialNumber: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGIDUri")(manageNumber.asInstanceOf[js.Any], objectClass.asInstanceOf[js.Any], serialNumber.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildGINCUri(gcp: String, consignmentReference: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGINCUri")(gcp.asInstanceOf[js.Any], consignmentReference.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildGRAIUri(gcp: String, assetType: String, serialNumber: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGRAIUri")(gcp.asInstanceOf[js.Any], assetType.asInstanceOf[js.Any], serialNumber.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildGSINUri(gcp: String, shipperReference: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGSINUri")(gcp.asInstanceOf[js.Any], shipperReference.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildGSRNPUri(gcp: String, serviceReference: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGSRNPUri")(gcp.asInstanceOf[js.Any], serviceReference.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildGSRNUri(gcp: String, serviceReference: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGSRNUri")(gcp.asInstanceOf[js.Any], serviceReference.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildITIPUri(gcp: String, itemRefAndIndicator: String, piece: String, total: String, serialNumber: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildITIPUri")(gcp.asInstanceOf[js.Any], itemRefAndIndicator.asInstanceOf[js.Any], piece.asInstanceOf[js.Any], total.asInstanceOf[js.Any], serialNumber.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildSGCNUri(gcp: String, couponReference: String, serialComponent: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSGCNUri")(gcp.asInstanceOf[js.Any], couponReference.asInstanceOf[js.Any], serialComponent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildSGLNUri(gcp: String, locationReference: String, `extension`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSGLNUri")(gcp.asInstanceOf[js.Any], locationReference.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildSGTINUri(gcp: String, itemRefAndIndicator: String, serialNumber: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSGTINUri")(gcp.asInstanceOf[js.Any], itemRefAndIndicator.asInstanceOf[js.Any], serialNumber.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildSSCCUri(gcp: String, serialReference: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSSCCUri")(gcp.asInstanceOf[js.Any], serialReference.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTheTimeZoneOffsetFromDateString(date: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheTimeZoneOffsetFromDateString")(date.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getTimeZoneOffset(offset: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeZoneOffset")(offset.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getTimeZoneOffset(offset: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeZoneOffset")(offset.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isJsonObject(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonObject")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def numberToZeroPadString(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToZeroPadString")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def offsetToString(hours: Double, minutes: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("offsetToString")(hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def throwIfThereIsAnUnexpectedExtension(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfThereIsAnUnexpectedExtension")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def timer(ms: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
