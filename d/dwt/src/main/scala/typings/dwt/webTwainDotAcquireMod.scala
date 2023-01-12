package typings.dwt

import typings.dwt.anon.AutoBorderDetection
import typings.dwt.anon.BDuplex
import typings.dwt.anon.BShowIndicator
import typings.dwt.anon.CompressionType
import typings.dwt.anon.CurrentPageNum
import typings.dwt.anon.Format
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCap
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapSupportedSizes
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapType
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapValueType
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTDUPLEX
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTDriver
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTMagType
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTMessageType
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTPixelType
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTTransferMode
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTUnitType
import typings.dwt.webTwainDotEditMod.WebTwainEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webTwainDotAcquireMod {
  
  trait Capabilities extends StObject {
    
    /**
      * Specifies how to set capabilities
      */
    var capabilities: js.Array[CapabilitySetup]
    
    /**
      * Whether to "ignore" or "fail" the request if an exception occurs. This is an overall setting that is inherited by all capabilities.
      */
    var exceptition: String
  }
  object Capabilities {
    
    inline def apply(capabilities: js.Array[CapabilitySetup], exceptition: String): Capabilities = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], exceptition = exceptition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Capabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
      
      inline def setCapabilities(value: js.Array[CapabilitySetup]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesVarargs(value: CapabilitySetup*): Self = StObject.set(x, "capabilities", js.Array(value*))
      
      inline def setExceptition(value: String): Self = StObject.set(x, "exceptition", value.asInstanceOf[js.Any])
    }
  }
  
  trait CapabilityDetails extends StObject {
    
    /**
      * The Capability.
      */
    var capability: ValueAndLabel
    
    /**
      * The container type of the Capability
      */
    var conType: ValueAndLabel
    
    /**
      * The index for the current value of the Capability
      */
    var curIndex: Double
    
    /**
      * The current value of the Capability
      */
    var curValue: ValueAndLabel
    
    /**
      * The index for the default value of the Capability
      */
    var defIndex: Double
    
    /**
      * The operation types that are supported by the Capability. Types include {"get", "set", "reset" "getdefault", "getcurrent"}
      */
    var query: js.Array[String]
    
    /**
      * The value type of the Capability. Value types include
      * TWTY_BOOL: 6
      * TWTY_FIX32: 7
      * TWTY_FRAME: 8
      * TWTY_INT8: 0
      * TWTY_INT16: 1
      * TWTY_INT32: 2
      * TWTY_STR32: 9
      * TWTY_STR64: 10
      * TWTY_STR128: 11
      * TWTY_STR255: 12
      * TWTY_UINT8: 3
      * TWTY_UINT16: 4
      * TWTY_int: 5
      */
    var valueType: ValueAndLabel
    
    /**
      * The available values of the Capability
      */
    var values: js.Array[ValueAndLabel]
  }
  object CapabilityDetails {
    
    inline def apply(
      capability: ValueAndLabel,
      conType: ValueAndLabel,
      curIndex: Double,
      curValue: ValueAndLabel,
      defIndex: Double,
      query: js.Array[String],
      valueType: ValueAndLabel,
      values: js.Array[ValueAndLabel]
    ): CapabilityDetails = {
      val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any], conType = conType.asInstanceOf[js.Any], curIndex = curIndex.asInstanceOf[js.Any], curValue = curValue.asInstanceOf[js.Any], defIndex = defIndex.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[CapabilityDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CapabilityDetails] (val x: Self) extends AnyVal {
      
      inline def setCapability(value: ValueAndLabel): Self = StObject.set(x, "capability", value.asInstanceOf[js.Any])
      
      inline def setConType(value: ValueAndLabel): Self = StObject.set(x, "conType", value.asInstanceOf[js.Any])
      
      inline def setCurIndex(value: Double): Self = StObject.set(x, "curIndex", value.asInstanceOf[js.Any])
      
      inline def setCurValue(value: ValueAndLabel): Self = StObject.set(x, "curValue", value.asInstanceOf[js.Any])
      
      inline def setDefIndex(value: Double): Self = StObject.set(x, "defIndex", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: js.Array[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryVarargs(value: String*): Self = StObject.set(x, "query", js.Array(value*))
      
      inline def setValueType(value: ValueAndLabel): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[ValueAndLabel]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: ValueAndLabel*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait CapabilitySetup extends StObject {
    
    /**
      * Specify a capability
      */
    var capability: EnumDWTCap | Double
    
    /**
      * The value to set to the capability or the value of the capability after setting.
      */
    var curValue: Double | String
    
    var errorCode: js.UndefOr[Double] = js.undefined
    
    var errorString: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to "ignore" or "fail" the request if an exception occurs when setting this specific capability.
      */
    var exception: js.UndefOr[String] = js.undefined
  }
  object CapabilitySetup {
    
    inline def apply(capability: EnumDWTCap | Double, curValue: Double | String): CapabilitySetup = {
      val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any], curValue = curValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[CapabilitySetup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CapabilitySetup] (val x: Self) extends AnyVal {
      
      inline def setCapability(value: EnumDWTCap | Double): Self = StObject.set(x, "capability", value.asInstanceOf[js.Any])
      
      inline def setCurValue(value: Double | String): Self = StObject.set(x, "curValue", value.asInstanceOf[js.Any])
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setErrorString(value: String): Self = StObject.set(x, "errorString", value.asInstanceOf[js.Any])
      
      inline def setErrorStringUndefined: Self = StObject.set(x, "errorString", js.undefined)
      
      inline def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    }
  }
  
  trait DeviceConfiguration extends StObject {
    
    /**
      * Whether to close the built-in User Interface after aquisition. Only valid when {IfShowUI} is true.
      */
    var IfDisableSourceAfterAcquire: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to scan one side or both sides of each paper.
      */
    var IfDuplexEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use the document feeder or the flatbed of the device.
      */
    var IfFeederEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to retrieve extended information about the image after it's transferred.
      */
    var IfGetExtImageInfo: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to retrieve information about the image after it's transferred.
      */
    var IfGetImageInfo: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show the built-in User Interface from the device vendor
      */
    var IfShowUI: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How a pixel is represented. Basically it means whether to scan in color, grey or black & white
      */
    var PixelType: js.UndefOr[EnumDWTPixelType | Double | String] = js.undefined
    
    /**
      * How detailed is the acquisition. Measured by dots per pixel (DPI)
      */
    var Resolution: js.UndefOr[Double] = js.undefined
    
    /**
      * How much extended information is retrieved. Only valid when {IfGetExtImageInfo} is true.
      */
    var extendedImageInfoQueryLevel: js.UndefOr[Double] = js.undefined
  }
  object DeviceConfiguration {
    
    inline def apply(): DeviceConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceConfiguration] (val x: Self) extends AnyVal {
      
      inline def setExtendedImageInfoQueryLevel(value: Double): Self = StObject.set(x, "extendedImageInfoQueryLevel", value.asInstanceOf[js.Any])
      
      inline def setExtendedImageInfoQueryLevelUndefined: Self = StObject.set(x, "extendedImageInfoQueryLevel", js.undefined)
      
      inline def setIfDisableSourceAfterAcquire(value: Boolean): Self = StObject.set(x, "IfDisableSourceAfterAcquire", value.asInstanceOf[js.Any])
      
      inline def setIfDisableSourceAfterAcquireUndefined: Self = StObject.set(x, "IfDisableSourceAfterAcquire", js.undefined)
      
      inline def setIfDuplexEnabled(value: Boolean): Self = StObject.set(x, "IfDuplexEnabled", value.asInstanceOf[js.Any])
      
      inline def setIfDuplexEnabledUndefined: Self = StObject.set(x, "IfDuplexEnabled", js.undefined)
      
      inline def setIfFeederEnabled(value: Boolean): Self = StObject.set(x, "IfFeederEnabled", value.asInstanceOf[js.Any])
      
      inline def setIfFeederEnabledUndefined: Self = StObject.set(x, "IfFeederEnabled", js.undefined)
      
      inline def setIfGetExtImageInfo(value: Boolean): Self = StObject.set(x, "IfGetExtImageInfo", value.asInstanceOf[js.Any])
      
      inline def setIfGetExtImageInfoUndefined: Self = StObject.set(x, "IfGetExtImageInfo", js.undefined)
      
      inline def setIfGetImageInfo(value: Boolean): Self = StObject.set(x, "IfGetImageInfo", value.asInstanceOf[js.Any])
      
      inline def setIfGetImageInfoUndefined: Self = StObject.set(x, "IfGetImageInfo", js.undefined)
      
      inline def setIfShowUI(value: Boolean): Self = StObject.set(x, "IfShowUI", value.asInstanceOf[js.Any])
      
      inline def setIfShowUIUndefined: Self = StObject.set(x, "IfShowUI", js.undefined)
      
      inline def setPixelType(value: EnumDWTPixelType | Double | String): Self = StObject.set(x, "PixelType", value.asInstanceOf[js.Any])
      
      inline def setPixelTypeUndefined: Self = StObject.set(x, "PixelType", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
    }
  }
  
  trait ScanSetup extends StObject {
    
    /**
      * Whether to ignore or fail the acquistion when an exception is raised. Set "ignore" or "fail".
      */
    var exception: js.UndefOr[String] = js.undefined
    
    /**
      * Set how the transfer is done.
      */
    var fileXfer: js.UndefOr[CompressionType] = js.undefined
    
    /**
      * A callback triggered before the scan, after the scan and after each page has been transferred.
      */
    var funcScanStatus: js.UndefOr[js.Function1[/* status */ Status, Unit]] = js.undefined
    
    /**
      * Set where the scanned images are inserted.
      */
    var insertingIndex: js.UndefOr[Double] = js.undefined
    
    var moreSettings: js.UndefOr[AutoBorderDetection] = js.undefined
    
    /**
      * Set up how the scanned images are outputted.
      */
    var outputSetup: js.UndefOr[Format] = js.undefined
    
    /**
      * The profile is a base64 string, if present, it overrides settings and more settings.
      */
    var profile: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the data source (the scanner). If not set, the default data source is used.
      */
    var scanner: js.UndefOr[String] = js.undefined
    
    /**
      * Basic settings.
      */
    var settings: js.UndefOr[BDuplex] = js.undefined
    
    /**
      * An id that specifies this specific setup.
      */
    var setupId: js.UndefOr[String] = js.undefined
    
    /**
      * The TWAIN transfer mode.
      */
    var transferMode: js.UndefOr[EnumDWTTransferMode | Double] = js.undefined
    
    var ui: js.UndefOr[BShowIndicator] = js.undefined
  }
  object ScanSetup {
    
    inline def apply(): ScanSetup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanSetup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScanSetup] (val x: Self) extends AnyVal {
      
      inline def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
      
      inline def setFileXfer(value: CompressionType): Self = StObject.set(x, "fileXfer", value.asInstanceOf[js.Any])
      
      inline def setFileXferUndefined: Self = StObject.set(x, "fileXfer", js.undefined)
      
      inline def setFuncScanStatus(value: /* status */ Status => Unit): Self = StObject.set(x, "funcScanStatus", js.Any.fromFunction1(value))
      
      inline def setFuncScanStatusUndefined: Self = StObject.set(x, "funcScanStatus", js.undefined)
      
      inline def setInsertingIndex(value: Double): Self = StObject.set(x, "insertingIndex", value.asInstanceOf[js.Any])
      
      inline def setInsertingIndexUndefined: Self = StObject.set(x, "insertingIndex", js.undefined)
      
      inline def setMoreSettings(value: AutoBorderDetection): Self = StObject.set(x, "moreSettings", value.asInstanceOf[js.Any])
      
      inline def setMoreSettingsUndefined: Self = StObject.set(x, "moreSettings", js.undefined)
      
      inline def setOutputSetup(value: Format): Self = StObject.set(x, "outputSetup", value.asInstanceOf[js.Any])
      
      inline def setOutputSetupUndefined: Self = StObject.set(x, "outputSetup", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setScanner(value: String): Self = StObject.set(x, "scanner", value.asInstanceOf[js.Any])
      
      inline def setScannerUndefined: Self = StObject.set(x, "scanner", js.undefined)
      
      inline def setSettings(value: BDuplex): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setSetupId(value: String): Self = StObject.set(x, "setupId", value.asInstanceOf[js.Any])
      
      inline def setSetupIdUndefined: Self = StObject.set(x, "setupId", js.undefined)
      
      inline def setTransferMode(value: EnumDWTTransferMode | Double): Self = StObject.set(x, "transferMode", value.asInstanceOf[js.Any])
      
      inline def setTransferModeUndefined: Self = StObject.set(x, "transferMode", js.undefined)
      
      inline def setUi(value: BShowIndicator): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
    }
  }
  
  trait SourceDetails extends StObject {
    
    /**
      * Information about the driver if it's DriverType is "ICA"
      */
    var DeviceInfo: js.UndefOr[Any] = js.undefined
    
    /**
      * The driver type which can be "TWAIN" | "ICA" | "SANE"
      */
    var DriverType: js.UndefOr[String] = js.undefined
    
    /**
      * Whether it is the current source.
      */
    var IsCurrentSource: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether it is the default source.
      */
    var IsDefaultSource: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The manufacturer of the data source. E.g. "TWAIN Working Group".
      */
    var Manufacturer: js.UndefOr[String] = js.undefined
    
    /**
      * The family name of the data source. E.g. "Software Scan".
      */
    var ProductFamily: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the data source. E.g. "TWAIN2 FreeImage Software Scanner".
      */
    var ProductName: js.UndefOr[String] = js.undefined
    
    /**
      * The version of the protocol based on which the data source is developed.
      */
    var ProtocolMajor: js.UndefOr[Double] = js.undefined
    
    var ProtocolMinor: js.UndefOr[Double] = js.undefined
    
    /**
      * Supported Groups
      */
    var SupportedGroups: js.UndefOr[Double] = js.undefined
    
    /**
      * Detailed version of the data source.
      */
    var Version: js.UndefOr[typings.dwt.webTwainDotAcquireMod.Version] = js.undefined
  }
  object SourceDetails {
    
    inline def apply(): SourceDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceDetails] (val x: Self) extends AnyVal {
      
      inline def setDeviceInfo(value: Any): Self = StObject.set(x, "DeviceInfo", value.asInstanceOf[js.Any])
      
      inline def setDeviceInfoUndefined: Self = StObject.set(x, "DeviceInfo", js.undefined)
      
      inline def setDriverType(value: String): Self = StObject.set(x, "DriverType", value.asInstanceOf[js.Any])
      
      inline def setDriverTypeUndefined: Self = StObject.set(x, "DriverType", js.undefined)
      
      inline def setIsCurrentSource(value: Boolean): Self = StObject.set(x, "IsCurrentSource", value.asInstanceOf[js.Any])
      
      inline def setIsCurrentSourceUndefined: Self = StObject.set(x, "IsCurrentSource", js.undefined)
      
      inline def setIsDefaultSource(value: Boolean): Self = StObject.set(x, "IsDefaultSource", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultSourceUndefined: Self = StObject.set(x, "IsDefaultSource", js.undefined)
      
      inline def setManufacturer(value: String): Self = StObject.set(x, "Manufacturer", value.asInstanceOf[js.Any])
      
      inline def setManufacturerUndefined: Self = StObject.set(x, "Manufacturer", js.undefined)
      
      inline def setProductFamily(value: String): Self = StObject.set(x, "ProductFamily", value.asInstanceOf[js.Any])
      
      inline def setProductFamilyUndefined: Self = StObject.set(x, "ProductFamily", js.undefined)
      
      inline def setProductName(value: String): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
      
      inline def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
      
      inline def setProtocolMajor(value: Double): Self = StObject.set(x, "ProtocolMajor", value.asInstanceOf[js.Any])
      
      inline def setProtocolMajorUndefined: Self = StObject.set(x, "ProtocolMajor", js.undefined)
      
      inline def setProtocolMinor(value: Double): Self = StObject.set(x, "ProtocolMinor", value.asInstanceOf[js.Any])
      
      inline def setProtocolMinorUndefined: Self = StObject.set(x, "ProtocolMinor", js.undefined)
      
      inline def setSupportedGroups(value: Double): Self = StObject.set(x, "SupportedGroups", value.asInstanceOf[js.Any])
      
      inline def setSupportedGroupsUndefined: Self = StObject.set(x, "SupportedGroups", js.undefined)
      
      inline def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    }
  }
  
  trait Status extends StObject {
    
    var bScanCompleted: js.UndefOr[Boolean] = js.undefined
    
    var event: js.UndefOr[String] = js.undefined
    
    var result: js.UndefOr[CurrentPageNum] = js.undefined
  }
  object Status {
    
    inline def apply(): Status = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      inline def setBScanCompleted(value: Boolean): Self = StObject.set(x, "bScanCompleted", value.asInstanceOf[js.Any])
      
      inline def setBScanCompletedUndefined: Self = StObject.set(x, "bScanCompleted", js.undefined)
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setResult(value: CurrentPageNum): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait TiffTag extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var tagIdentifier: js.UndefOr[Double] = js.undefined
    
    var useBase64Encoding: js.UndefOr[Boolean] = js.undefined
  }
  object TiffTag {
    
    inline def apply(): TiffTag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TiffTag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TiffTag] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setTagIdentifier(value: Double): Self = StObject.set(x, "tagIdentifier", value.asInstanceOf[js.Any])
      
      inline def setTagIdentifierUndefined: Self = StObject.set(x, "tagIdentifier", js.undefined)
      
      inline def setUseBase64Encoding(value: Boolean): Self = StObject.set(x, "useBase64Encoding", value.asInstanceOf[js.Any])
      
      inline def setUseBase64EncodingUndefined: Self = StObject.set(x, "useBase64Encoding", js.undefined)
    }
  }
  
  trait ValueAndLabel extends StObject {
    
    /**
      * Label or name of the item
      */
    var label: String
    
    /**
      * Numeric representation of the item
      */
    var value: EnumDWTCap | EnumDWTCapType | EnumDWTCapValueType | Double
  }
  object ValueAndLabel {
    
    inline def apply(label: String, value: EnumDWTCap | EnumDWTCapType | EnumDWTCapValueType | Double): ValueAndLabel = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueAndLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueAndLabel] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: EnumDWTCap | EnumDWTCapType | EnumDWTCapValueType | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Version extends StObject {
    
    var Country: js.UndefOr[Double] = js.undefined
    
    var Info: js.UndefOr[String] = js.undefined
    
    var Language: js.UndefOr[Double] = js.undefined
    
    var MajorNum: js.UndefOr[Double] = js.undefined
    
    var MinorNum: js.UndefOr[Double] = js.undefined
  }
  object Version {
    
    inline def apply(): Version = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Version]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
      
      inline def setCountry(value: Double): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
      
      inline def setInfo(value: String): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "Info", js.undefined)
      
      inline def setLanguage(value: Double): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
      
      inline def setMajorNum(value: Double): Self = StObject.set(x, "MajorNum", value.asInstanceOf[js.Any])
      
      inline def setMajorNumUndefined: Self = StObject.set(x, "MajorNum", js.undefined)
      
      inline def setMinorNum(value: Double): Self = StObject.set(x, "MinorNum", value.asInstanceOf[js.Any])
      
      inline def setMinorNumUndefined: Self = StObject.set(x, "MinorNum", js.undefined)
    }
  }
  
  @js.native
  trait WebTwainAcquire
    extends StObject
       with WebTwainEdit {
    
    /**
      * Start image acquisition.
      * @param deviceConfiguration Configuration for the acquisition.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def AcquireImage(): Unit = js.native
    def AcquireImage(deviceConfiguration: Unit, successCallBack: js.Function0[Unit]): Unit = js.native
    def AcquireImage(
      deviceConfiguration: Unit,
      successCallBack: js.Function0[Unit],
      failureCallBack: js.Function3[
          /* deviceConfiguration */ DeviceConfiguration, 
          /* errorCode */ Double, 
          /* errorString */ String, 
          Unit
        ]
    ): Unit = js.native
    def AcquireImage(
      deviceConfiguration: Unit,
      successCallBack: Unit,
      failureCallBack: js.Function3[
          /* deviceConfiguration */ DeviceConfiguration, 
          /* errorCode */ Double, 
          /* errorString */ String, 
          Unit
        ]
    ): Unit = js.native
    def AcquireImage(deviceConfiguration: DeviceConfiguration): Unit = js.native
    def AcquireImage(deviceConfiguration: DeviceConfiguration, successCallBack: js.Function0[Unit]): Unit = js.native
    def AcquireImage(
      deviceConfiguration: DeviceConfiguration,
      successCallBack: js.Function0[Unit],
      failureCallBack: js.Function3[
          /* deviceConfiguration */ DeviceConfiguration, 
          /* errorCode */ Double, 
          /* errorString */ String, 
          Unit
        ]
    ): Unit = js.native
    def AcquireImage(
      deviceConfiguration: DeviceConfiguration,
      successCallBack: Unit,
      failureCallBack: js.Function3[
          /* deviceConfiguration */ DeviceConfiguration, 
          /* errorCode */ Double, 
          /* errorString */ String, 
          Unit
        ]
    ): Unit = js.native
    def AcquireImage(successCallBack: js.Function0[Unit]): Unit = js.native
    def AcquireImage(
      successCallBack: js.Function0[Unit],
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    def AcquireImage(
      successCallBack: Unit,
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Return or set the pixel bit depth for the current value of `PixelType`.
      */
    var BitDepth: Double = js.native
    
    /**
      * Return or set the brightness to be used for scanning by the data source.
      */
    var Brightness: Double = js.native
    
    /**
      * Cancels all pending transfers.
      */
    def CancelAllPendingTransfers(): Boolean = js.native
    
    /**
      * [Deprecation] Return or set the index (0-based) of
      * a list to indicate the Current Value when the value of
      * the CapType property is TWON_ENUMERATION. If the data type
      * of the capability is String, the list is in CapItemsString property.
      * For other data types, the list is in CapItems property. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapCurrentIndex: Double = js.native
    
    /**
      * [Deprecation] Return or set the current value in a range when the
      * value of the CapType property is TWON_RANGE. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapCurrentValue: Double = js.native
    
    /**
      * [Deprecation] Return the index (0-based) of a list to indicate the
      * Default Value when the value of the CapType property is TWON_ENUMERATION.
      * If the data type of the capability is String, the list is in CapItemsString property.
      *  For other data types, the list is in CapItems property. This is a runtime, read-only property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    val CapDefaultIndex: Double = js.native
    
    /**
      * [Deprecation] Return the default value in a range when the value of the
      * CapType property is TWON_RANGE. This is a runtime, read-only property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapDefaultValue: Double = js.native
    
    /**
      * [Deprecation] Retruns the description for a capability
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapDescription: String = js.native
    
    /**
      * [Deprecation] Gets information of the capability specified by the Capability property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    def CapGet(): Boolean = js.native
    
    /**
      * [Deprecation] Return the Source's current Value for the specified capability.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    def CapGetCurrent(): Boolean = js.native
    
    /**
      * [Deprecation] Return the Source's Default Value for the specified capability.
      * This is the Source's preferred default value.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    def CapGetDefault(): Boolean = js.native
    
    /**
      * [Deprecation] Return the value of the bottom-most edge of the specified frame.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index specifies the value of which frame to get. The index is 0-based.
      */
    def CapGetFrameBottom(index: Double): Double = js.native
    
    /**
      * [Deprecation] Return the value (in Unit) of the left-most edge of the specified frame.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index specifies the value of which frame to get. The index is 0-based.
      */
    def CapGetFrameLeft(index: Double): Double = js.native
    
    /**
      * [Deprecation] Return the value (in Unit) of the left-most edge of the specified frame.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index specifies the value of which frame to get. The index is 0-based.
      */
    def CapGetFrameRight(index: Double): Double = js.native
    
    /**
      * [Deprecation] Return the value (in Unit) of the top-most edge of the specified frame.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index specifies the value of which frame to get. The index is 0-based.
      */
    def CapGetFrameTop(index: Double): Double = js.native
    
    /**
      * [Deprecation] Use getCapabilities() and setCapabilities() instead.
      */
    def CapGetHelp(index: Double): Double = js.native
    
    /**
      * [Deprecation] Use getCapabilities() and setCapabilities() instead.
      */
    def CapGetLabel(index: Double): Double = js.native
    
    /**
      * [Deprecation] Use getCapabilities() and setCapabilities() instead.
      */
    def CapGetLabels(index: Double): Double = js.native
    
    /**
      * [Deprecation] Queries whether the Source supports a particular operation on the capability.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param {Dynamsoft.EnumDWT_MessageType} messageType specifies the type of capability operation.
      */
    def CapIfSupported(messageType: EnumDWTMessageType): Boolean = js.native
    
    /**
      * [Deprecation] Return or set the maximum value in a range when the
      * value of the CapType property is TWON_RANGE. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapMaxValue: Double = js.native
    
    /**
      * [Deprecation] Return or set the minimum value in a range when the
      * value of the CapType property is TWON_RANGE. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapMinValue: Double = js.native
    
    /**
      * [Deprecation] Return or set how many items are in the list when the
      *  value of the CapType property is TWON_ARRAY or TWON_ENUMERATION.
      * For String data type, the list is in CapItemsString property.
      * For other data types, the list is in CapItems property.
      * This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapNumItems: Double = js.native
    
    /**
      * [Deprecation] Changes the Current Value of the capability specified by
      * Capability property back to its power-on value.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    def CapReset(): Boolean = js.native
    
    /**
      * [Deprecation] Sets the current capability using the container type specified by
      * CapType property. The current capability is specified by Capability property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    def CapSet(): Boolean = js.native
    
    /**
      * [Deprecation] Sets the values of the specified frame.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index  specifies the values of which frame to set. The index is 0-based.
      * @param left the value (in Unit) of the left-most edge of the specified frame.
      * @param top the value (in Unit) of the top-most edge of the specified frame.
      * @param right  the value (in Unit) of the right-most edge of the specified frame.
      * @param bottom  the value (in Unit) of the bottom-most edge of the specified frame.
      */
    def CapSetFrame(index: Double, left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
    
    /**
      * [Deprecation] Return or set the step size in a range when the value
      * of the CapType property is TWON_RANGE. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapStepSize: Double = js.native
    
    /**
      * [Deprecation] Return or set the type of capability container used
      * to exchange capability information between application and source.
      * This is a runtime property.
      */
    var CapType: EnumDWTCapType = js.native
    
    /**
      * [Deprecation] Return or set the value of the capability specified by
      *  Capability property when the value of the CapType property is TWON_ONEVALUE.
      * This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapValue: Double = js.native
    
    /**
      * [Deprecation] Return or set the string value for a capability when the
      * value of the CapType property is TWON_ONEVALUE. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapValueString: String = js.native
    
    /**
      * [Deprecation] Return or set the value type for reading the value of a capability.
      *  This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapValueType: Double = js.native
    
    /**
      * [Deprecation] Specifies the capabiltiy to be negotiated. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var Capability: EnumDWTCap = js.native
    
    /**
      * Close the data source (a TWAIN/ICA/SANE device which in most cases is a scanner) to free it to be used by other applications.
      */
    def CloseSource(): Boolean = js.native
    
    /**
      * Close the data source (a TWAIN/ICA/SANE device which in most cases is a scanner) to free it to be used by other applications.
      */
    def CloseSourceAsync(): js.Promise[Boolean] = js.native
    
    /**
      * Closes and unloads Data Source Manager.
      */
    def CloseSourceManager(): Boolean = js.native
    
    /**
      * Closes and unloads Data Source Manager.
      */
    def CloseSourceManagerAsync(): js.Promise[Boolean] = js.native
    
    /**
      * Closes the scanning process to release resources on the machine.
      */
    def CloseWorkingProcess(): Boolean = js.native
    
    /**
      * Return or set Contrast to be used for scanning by the data source.
      */
    var Contrast: Double = js.native
    
    /**
      * Return the device name of current source.
      */
    val CurrentSourceName: String = js.native
    
    /**
      * Return a value that indicates the data source status.
      */
    var DataSourceStatus: Double = js.native
    
    /**
      * Return the name of the default source.
      */
    var DefaultSourceName: String = js.native
    
    /**
      * Disable the data source (a TWAIN/ICA/SANE device which in most cases is a scanner) to stop the acquiring process. If the data source's user interface is displayed, it will be closed.
      */
    def DisableSource(): Boolean = js.native
    
    /**
      * Return whether the source supports duplex. If yes, it further returns the level of duplex the data source supports.
      */
    val Duplex: EnumDWTDUPLEX | Double = js.native
    
    /**
      * Enable the data source to start the acquiring process.
      */
    def EnableSource(): Boolean = js.native
    
    /**
      * Display the TWAIN source's built-in user interface.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def EnableSourceUI(
      successCallBack: js.Function0[Unit],
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Ejects the current page and begins scanning the next page in the document feeder.
      */
    def FeedPage(): Boolean = js.native
    
    /**
      * Get the cap item value of the capability specified by Capability property,
      * when the value of the CapType property is TWON_ARRAY or TWON_ENUMERATION.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index Index is 0-based. It is the index of the cap item.
      */
    def GetCapItems(index: Double): Double = js.native
    
    /**
      * Returns the cap item value of the capability specified by Capability property,
      * when the value of the CapType property is TWON_ARRAY or TWON_ENUMERATION.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index Index is 0-based. It is the index of the cap item.
      */
    def GetCapItemsString(index: Double): String = js.native
    
    /**
      * Get the custom data source data and saves the data in a specified file.
      * @param fileName The path of the file to save the data source data to.
      */
    def GetCustomDSData(fileName: String): Boolean = js.native
    
    /**
      * Gets custom DS data and returns it in a base64 string.
      */
    def GetCustomDSDataEx(): String = js.native
    
    /**
      * Inspect the current data source and return whether it is a scanner, a webcam, etc.
      */
    def GetDeviceType(): Double = js.native
    
    /**
      * Get the name of a data source by its index in data source manager source list.
      * @param index The index of the data source.
      */
    def GetSourceNameItems(index: Double): String = js.native
    
    def GetSourceNames(): js.Array[SourceDetails | String] = js.native
    def GetSourceNames(bIncludeDetails: Boolean): js.Array[SourceDetails | String] = js.native
    
    /**
      * Return all available data sources (scanners, etc.) and optionally all detailed information about them.
      * @param bIncludeDetails Whether to return more details about the data sources or just their names.
      */
    def GetSourceNamesAsync(bIncludeDetails: Boolean): js.Promise[js.Array[SourceDetails | String]] = js.native
    
    /**
      * Return or set whether to enable the data source's auto-brightness feature.
      */
    var IfAutoBright: Boolean = js.native
    
    /**
      * Return or set whether the data source (the scanner) discards blank images during scanning automatically.
      */
    var IfAutoDiscardBlankpages: Boolean = js.native
    
    /**
      * Return or set whether to enable the data source's automatic document feeding process.
      */
    var IfAutoFeed: Boolean = js.native
    
    /**
      * Return or set whether to enable the data source's automatic document scanning process.
      */
    var IfAutoScan: Boolean = js.native
    
    /**
      * Return or set whether to enable the data source's automatic border detection feature.
      */
    var IfAutomaticBorderDetection: Boolean = js.native
    
    /**
      * Return or set whether to enable the data source's automatic skew correction feature.
      */
    var IfAutomaticDeskew: Boolean = js.native
    
    /**
      * Return or set whether to close the user interface after all images have been acquired.
      */
    var IfDisableSourceAfterAcquire: Boolean = js.native
    
    /**
      * Return or set whether to enable duplex scanning (in other words, whether to scan both sides of the paper).
      */
    var IfDuplexEnabled: Boolean = js.native
    
    /**
      * Return or set whether a data source's Automatic Document Feeder (ADF) is enabled for scanning.
      */
    var IfFeederEnabled: Boolean = js.native
    
    /**
      * Return whether or not there are documents loaded in the data source's feeder.
      */
    val IfFeederLoaded: Boolean = js.native
    
    /**
      * Return whether the Source has a paper sensor that can detect pages on the ADF or Flatbed.
      */
    val IfPaperDetectable: Boolean = js.native
    
    /**
      * Return or set whether the data source displays a progress indicator during acquisition and transfer.
      */
    var IfShowIndicator: Boolean = js.native
    
    /**
      * Return or set whether the data source displays the user interface when scanning.
      */
    var IfShowUI: Boolean = js.native
    
    /**
      * Return whether the data source supports acquisitions with the UI (User Interface) disabled.
      */
    val IfUIControllable: Boolean = js.native
    
    /**
      * Return or set whether the new TWAIN DSM (data source Manager) is used for acquisitions. The new TWAIN DSM is a DLL called 'TWAINDSM.dll' while the default | old DSM is called 'twain_32.dll'.
      */
    var IfUseTwainDSM: Boolean = js.native
    
    /**
      * Return the bit depth of the current image.
      */
    val ImageBitsPerPixel: Double = js.native
    
    /**
      * Return or set whether to use TWAIN or ICA protocol on macOS.
      */
    var ImageCaptureDriverType: EnumDWTDriver | Double = js.native
    
    /**
      * Return the document number of the current image.
      */
    val ImageLayoutDocumentNumber: Double = js.native
    
    /**
      * Return the value of the bottom edge of the current image frame (in Unit).
      */
    val ImageLayoutFrameBottom: Double = js.native
    
    /**
      * Return the value of the left edge of the current image frame (in Unit).
      */
    val ImageLayoutFrameLeft: Double = js.native
    
    /**
      * Return the value of the right edge of the current image frame (in Unit).
      */
    val ImageLayoutFrameRight: Double = js.native
    
    /**
      * Return the value of the top edge of the current image frame (in Unit).
      */
    val ImageLayoutFrameTop: Double = js.native
    
    /**
      * Return the page number of the current image.
      */
    val ImageLayoutPageNumber: Double = js.native
    
    /**
      * Return the length of the current image.
      */
    val ImageLength: Double = js.native
    
    /**
      * Return the pixel type of the current image.
      */
    val ImagePixelType: EnumDWTPixelType | Double = js.native
    
    /**
      * Return the width of the current image.
      */
    val ImageWidth: Double = js.native
    
    /**
      * Return the horizontal resolution of the current image.
      */
    val ImageXResolution: Double = js.native
    
    /**
      * Return the vertical resolution of the current image.
      */
    val ImageYResolution: Double = js.native
    
    /**
      * Return the data of the magnetic data if the data source supports magnetic data recognition.
      */
    val MagData: String = js.native
    
    /**
      * Return the type of the magnetic data if the data source supports magnetic data recognition.
      */
    val MagType: EnumDWTMagType | Double = js.native
    
    /**
      * Load a data source to get it ready to acquire images.
      */
    def OpenSource(): Boolean = js.native
    
    /**
      * Return all available data sources (scanners, etc.) and optionally all detailed information about them.
      * @param bIncludeDetails Whether to return more details about the data sources or just their names.
      */
    /**
      * Load a data source to get it ready to acquire images.
      */
    def OpenSourceAsync(): js.Promise[Boolean] = js.native
    
    /**
      * Load and open data source manager.
      */
    def OpenSourceManager(): Boolean = js.native
    
    /**
      * Load and open data source manager.
      */
    def OpenSourceManagerAsync(): js.Promise[Boolean] = js.native
    
    /**
      * Return or set the page size the data source uses to acquire images.
      */
    var PageSize: EnumDWTCapSupportedSizes | Double = js.native
    
    /**
      * Return the number of transfers the data source is ready to supply upon demand.
      */
    val PendingXfers: Double = js.native
    
    /**
      * Return or set the pixel flavor to be used for acquiring images.
      */
    var PixelFlavor: Double = js.native
    
    /**
      * Return or set the pixel type used when acquiring images.
      */
    var PixelType: EnumDWTPixelType | Double = js.native
    
    /**
      * Reset the image layout in the data source.
      */
    def ResetImageLayout(): Boolean = js.native
    
    /**
      * Return or set the resolution used when acquiring images.
      */
    var Resolution: Double = js.native
    
    /**
      * If called while {IfFeederEnabled} property is true, the data source will return the current page to the input area and return the last page from the output area into the acquisition area.
      */
    def RewindPage(): Boolean = js.native
    
    /**
      * Bring up the Source Selection User Interface (UI) for the user to choose a data source.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def SelectSource(): Boolean | Unit = js.native
    def SelectSource(successCallBack: js.Function0[Unit]): Boolean | Unit = js.native
    def SelectSource(
      successCallBack: js.Function0[Unit],
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Boolean | Unit = js.native
    def SelectSource(
      successCallBack: Unit,
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Boolean | Unit = js.native
    
    /**
      * Bring up the Source Selection User Interface (UI) for the user to choose a data source.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def SelectSourceAsync(): js.Promise[Boolean] = js.native
    def SelectSourceAsync(successCallBack: js.Function0[Unit]): js.Promise[Boolean] = js.native
    def SelectSourceAsync(
      successCallBack: js.Function0[Unit],
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): js.Promise[Boolean] = js.native
    def SelectSourceAsync(
      successCallBack: Unit,
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Select a data source by its index.
      * @param index The index of the data source.
      */
    def SelectSourceByIndex(index: Double): Boolean = js.native
    
    /**
      * Select a data source by its index.
      * @param index The index of the data source.
      */
    def SelectSourceByIndexAsync(index: Double): js.Promise[Boolean] = js.native
    
    /**
      * [Deprecation] Set the value of the specified cap item.
      * @param index Index is 0-based. It is the index of the cap item.
      * @param newVal For string type, please use CapItemsstring property.
      */
    def SetCapItems(index: Double, newVal: Double): Unit = js.native
    
    /**
      * [Deprecation] Set the cap item value of the capability specified by Capability property,
      * when the value of the CapType property is TWON_ARRAY or TWON_ENUMERATION.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index Index is 0-based. It is the index of the cap item.
      * @param newVal The new value to be set.
      */
    def SetCapItemsString(index: Double, newVal: String): Unit = js.native
    
    /**
      * Sets custom data source data to be used for scanning, the data is stored in a file which can be regarded as a scanning profile.
      * @param fileName The path  of the file.
      */
    def SetCustomDSData(fileName: String): Boolean = js.native
    
    /**
      * Set custom data source data to be used for scanning, the input is a base64 string.
      * @param dsDataString The string that contains custom data source data.
      */
    def SetCustomDSDataEx(dsDataString: String): Boolean = js.native
    
    def SetFileXferInfo(fileName: String, fileFormat: Double): Boolean = js.native
    /**
      * Set the file transfer information to be used in File Transfer mode.
      * @param fileName The path to transfer the file to.
      * @param fileFormat The format of the file.
      */
    def SetFileXferInfo(fileName: String, fileFormat: EnumDWTFileFormat): Boolean = js.native
    
    /**
      * Set the left, top, right, and bottom sides of the image layout
      * rectangle for the current data source. The image layout rectangle
      * defines a frame of the data source's scanning area to be acquired.
      * @param left Specify the rectangle (leftmost coordinate).
      * @param top Specify the rectangle (topmost coordinate).
      * @param right Specify the rectangle (rightmost coordinate).
      * @param bottom Specify the rectangle (bottommost coordinate).
      */
    def SetImageLayout(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
    
    /**
      * Sets a timer which stops the data source opening process once it expires.
      * @param duration Define the duration of the timer (in milliseconds).
      */
    def SetOpenSourceTimeout(duration: Double): Boolean = js.native
    
    /**
      * Returns how many data sources are available on the local system.
      */
    val SourceCount: Double = js.native
    
    /**
      * Return or set the data source's transfer mode.
      */
    var TransferMode: EnumDWTTransferMode | Double = js.native
    
    /**
      * Return or set the unit of measure for all quantities.
      */
    var Unit: EnumDWTUnitType | Double = js.native
    
    /**
      * Return and set the number of images your application is willing to accept for each scan job.
      */
    var XferCount: Double = js.native
    
    /**
      * Gets detailed information about all capabilities of the current data source.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument capabilityDetails Detailed information about the specified capabilities.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def getCapabilities(
      succssCallback: js.Function1[/* capabilityDetails */ js.Array[CapabilityDetails], Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Sets up one or multiple capabilities in one call.
      * @param capabilities A object that describes how to set capabilities.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument capabilities The capabilities to set.
      */
    def setCapabilities(
      capabilities: Capabilities,
      succssCallback: js.Function1[/* capabilities */ Capabilities, Unit],
      failureCallback: js.Function1[/* capabilities */ Capabilities, Unit]
    ): Unit = js.native
    
    /**
      * Start the acquisition by passing all settings at once.
      * @param scanSetup Configuration for the acquisition.
      */
    def startScan(scanSetup: ScanSetup): js.Promise[ScanSetup] = js.native
  }
}
