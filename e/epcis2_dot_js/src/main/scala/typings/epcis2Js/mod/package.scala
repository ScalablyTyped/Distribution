package typings.epcis2Js.mod

import typings.epcis2Js.entityEpcisEpcisdocumentMod.default
import typings.epcis2Js.mod.^
import typings.epcis2Js.schemaValidatorMod.ValidatorResult
import typings.epcis2Js.settingsMod.Settings_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def buildCPIUri(gcp: String, componentPartReference: String, serial: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCPIUri")(gcp.asInstanceOf[js.Any], componentPartReference.asInstanceOf[js.Any], serial.asInstanceOf[js.Any])).asInstanceOf[String]

inline def buildDigitalLinkFromEpc(epc: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDigitalLinkFromEpc")(epc.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def buildDigitalLinkFromEpc(epc: Any, customOptions: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDigitalLinkFromEpc")(epc.asInstanceOf[js.Any], customOptions.asInstanceOf[js.Any])).asInstanceOf[Any]

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

/**
  * Make capture request to provided Url. Custom user options are merged with
  * the globally defined settings and request defaults.
  * If the EPCISDocument provided isn't valid and the `documentValidation` field of settings is true,
  * the functions throws an Error.
  *
  * @param epcisDocument - The url of the request
  * @param [customOptions] - User options for this single request
  * @returns Response promise
  */
inline def capture(epcisDocument: default): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(epcisDocument.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
inline def capture(epcisDocument: default, customOptions: Settings_): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(epcisDocument.asInstanceOf[js.Any], customOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]

inline def defaultSettings: Settings_ = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultSettings").asInstanceOf[Settings_]

inline def eventToHashedId(event: js.Object, context: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("eventToHashedId")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
inline def eventToHashedId(event: js.Object, context: js.Object, throwError: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("eventToHashedId")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], throwError.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getTheTimeZoneOffsetFromDateString(date: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheTimeZoneOffsetFromDateString")(date.asInstanceOf[js.Any]).asInstanceOf[String | Null]

inline def getTimeZoneOffset(offset: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeZoneOffset")(offset.asInstanceOf[js.Any]).asInstanceOf[String]
inline def getTimeZoneOffset(offset: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeZoneOffset")(offset.asInstanceOf[js.Any]).asInstanceOf[String]

inline def isJsonObject(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonObject")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def loadSchema(schema: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def numberToZeroPadString(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToZeroPadString")(number.asInstanceOf[js.Any]).asInstanceOf[String]

/**
  * Returns an instance of an Event object corresponding to the object passed in param
  * e.g if you provide {isA: 'ObjectEvent', ...}, it will return an ObjectEvent instance created
  * from the parameter
  *
  * @return an event corresponding to the parameter
  */
inline def objectToEvent(obj: Any): typings.epcis2Js.entityEventsEventMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("objectToEvent")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.epcis2Js.entityEventsEventMod.default]

inline def offsetToString(hours: Double, minutes: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("offsetToString")(hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[String]

inline def setup(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Any]
inline def setup(newSettings: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(newSettings.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def throwIfThereIsAnUnexpectedExtension(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfThereIsAnUnexpectedExtension")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def timer(ms: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]

inline def validateAgainstSchema(data: js.Object, schemaName: String): ValidatorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAgainstSchema")(data.asInstanceOf[js.Any], schemaName.asInstanceOf[js.Any])).asInstanceOf[ValidatorResult]

inline def validateEpcisDocument(epcisDocument: js.Object): ValidatorResult = ^.asInstanceOf[js.Dynamic].applyDynamic("validateEpcisDocument")(epcisDocument.asInstanceOf[js.Any]).asInstanceOf[ValidatorResult]
inline def validateEpcisDocument(epcisDocument: js.Object, throwError: Boolean): ValidatorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateEpcisDocument")(epcisDocument.asInstanceOf[js.Any], throwError.asInstanceOf[js.Any])).asInstanceOf[ValidatorResult]
