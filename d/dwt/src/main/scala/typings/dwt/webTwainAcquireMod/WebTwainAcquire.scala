package typings.dwt.webTwainAcquireMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapSupportedSizes
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapType
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDUPLEX
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDriver
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMagType
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMessageType
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTransferMode
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType
import typings.dwt.webTwainEditMod.WebTwainEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebTwainAcquire extends WebTwainEdit {
  
  /**
    * Start image acquisition.
    * @param deviceConfiguration Configuration for the acquisition.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def AcquireImage(): Unit = js.native
  def AcquireImage(
    deviceConfiguration: js.UndefOr[scala.Nothing],
    successCallBack: js.UndefOr[scala.Nothing],
    failureCallBack: js.Function3[
      /* deviceConfiguration */ DeviceConfiguration, 
      /* errorCode */ Double, 
      /* errorString */ String, 
      Unit
    ]
  ): Unit = js.native
  def AcquireImage(deviceConfiguration: js.UndefOr[scala.Nothing], successCallBack: js.Function0[Unit]): Unit = js.native
  def AcquireImage(
    deviceConfiguration: js.UndefOr[scala.Nothing],
    successCallBack: js.Function0[Unit],
    failureCallBack: js.Function3[
      /* deviceConfiguration */ DeviceConfiguration, 
      /* errorCode */ Double, 
      /* errorString */ String, 
      Unit
    ]
  ): Unit = js.native
  def AcquireImage(deviceConfiguration: DeviceConfiguration): Unit = js.native
  def AcquireImage(
    deviceConfiguration: DeviceConfiguration,
    successCallBack: js.UndefOr[scala.Nothing],
    failureCallBack: js.Function3[
      /* deviceConfiguration */ DeviceConfiguration, 
      /* errorCode */ Double, 
      /* errorString */ String, 
      Unit
    ]
  ): Unit = js.native
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
    successCallBack: js.UndefOr[scala.Nothing],
    failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  def AcquireImage(successCallBack: js.Function0[Unit]): Unit = js.native
  def AcquireImage(
    successCallBack: js.Function0[Unit],
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
  def SelectSource(
    successCallBack: js.UndefOr[scala.Nothing],
    failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean | Unit = js.native
  def SelectSource(successCallBack: js.Function0[Unit]): Boolean | Unit = js.native
  def SelectSource(
    successCallBack: js.Function0[Unit],
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
  def SelectSourceAsync(
    successCallBack: js.UndefOr[scala.Nothing],
    failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): js.Promise[Boolean] = js.native
  def SelectSourceAsync(successCallBack: js.Function0[Unit]): js.Promise[Boolean] = js.native
  def SelectSourceAsync(
    successCallBack: js.Function0[Unit],
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
