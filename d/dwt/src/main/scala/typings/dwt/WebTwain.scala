package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
// properties (get/set) / sync functions
@js.native
trait WebTwain extends js.Object {
  /*ignored
    checkErrorString
    first
    getInstance
    last
    next
    on
    onEvent
    previous
    ...other internal ones
    */
  var Addon: DynamsoftWebTwainAddon = js.native
  /*ignored
    httpUrl
    objectName
    ...other internal ones
    */
  /*
    * Properties
    */
  /**
    * Returns or sets whether multi-page selection is supported.
    * @type {boolean}
    */
  var AllowMultiSelect: Boolean = js.native
  /**
    * [Deprecated.] Returns or sets whether allowing the plugin to send authentication request. The default value of this property is TRUE.
    * @type {boolean}
    */
  var AllowPluginAuthentication: Boolean = js.native
  /**
    * [Deprecated.] Returns or sets whether the async mode is activated. With this mode, Dynamic Web TWAIN is able to upload/download files via HTTP/FTP asynchronously. The default value is false.
    * @type {boolean}
    */
  var AsyncMode: Boolean = js.native
  /**
    * Returns or sets the background color of the main control. It is a value specifying the 24-bit RGB value.
    * @type {number}
    */
  var BackgroundColor: Double = js.native
  /**
    * Returns or sets the fill color of the selected area of an image when it is cut, erased or rotated. It is a value specifying the 24-bit RGB value.
    * @type {number}
    */
  var BackgroundFillColor: Double = js.native
  /**
    * Returns or sets the pixel bit depths for the current value of PixelType property. This is a runtime property.
    * @type {number}
    */
  var BitDepth: Double = js.native
  /**
    * Returns the current deviation of the pixels in the image.
    * @type {number}
    */
  val BlankImageCurrentStdDev: Double = js.native
  /**
    * Returns or sets the standard deviation of the pixels in the image.
    * @type {number}
    */
  var BlankImageMaxStdDev: Double = js.native
  /**
    * Returns or sets the dividing line between black and white. The default value is 128.
    * @type {number}
    */
  var BlankImageThreshold: Double = js.native
  /**
    * [Deprecated.] Returns or sets the border style.
    * @type {EnumDWT_BorderStyle}
    */
  var BorderStyle: EnumDWTBorderStyle = js.native
  /**
    * Returns or sets the brightness values available within the Source. This is a runtime property.
    * @type {number}
    */
  var Brightness: Double = js.native
  /**
    * [Deprecated.] Sets or returns whether brokerprocess is enabled for scanning.
    * @type {number}
    */
  var BrokerProcessType: Double = js.native
  /**
    * Sets or returns how much physical memory is allowed for storing images currently loaded in Dynamic Web TWAIN. Once the limit is reached, images will be cached on the hard disk.
    * @type {number}
    */
  var BufferMemoryLimit: Double = js.native
  /**
    * Sets or returns the index (0-based) of a list to indicate the Current Value when the value of the CapType property is TWON_ENUMERATION. If the data type of the capability is String, the list is in CapItemsString property. For other data types, the list is in CapItems property. This is a runtime property.
    * @type {number}
    */
  var CapCurrentIndex: Double = js.native
  /**
    * Sets or returns the current value in a range when the value of the CapType property is TWON_RANGE. This is a runtime property.
    * @type {number}
    */
  var CapCurrentValue: Double = js.native
  /**
    * Returns the index (0-based) of a list to indicate the Default Value when the value of the CapType property is TWON_ENUMERATION. If the data type of the capability is String, the list is in CapItemsString property. For other data types, the list is in CapItems property. This is a runtime, read-only property.
    * @type {number}
    */
  val CapDefaultIndex: Double = js.native
  /**
    * Returns the default value in a range when the value of the CapType property is TWON_RANGE. This is a runtime, read-only property.
    * @type {number}
    */
  var CapDefaultValue: Double = js.native
  /**
    * Retruns the description for a capability
    * @type {string}
    */
  var CapDescription: String = js.native
  /**
    * Sets or returns the maximum value in a range when the value of the CapType property is TWON_RANGE. This is a runtime property.
    * @type {number}
    */
  var CapMaxValue: Double = js.native
  /**
    * Sets or returns the minimum value in a range when the value of the CapType property is TWON_RANGE. This is a runtime property.
    * @type {number}
    */
  var CapMinValue: Double = js.native
  /**
    * [Deprecated.] Sets or returns how many items are in the list when the value of the CapType property is TWON_ARRAY or TWON_ENUMERATION. For String data type, the list is in CapItemsString property. For other data types, the list is in CapItems property. This is a runtime property.
    * @type {number}
    */
  var CapNumItems: Double = js.native
  /**
    * Sets or returns the step size in a range when the value of the CapType property is TWON_RANGE. This is a runtime property.
    * @type {number}
    */
  var CapStepSize: Double = js.native
  /**
    * Sets or returns the type of capability container used to exchange capability information between application and source. This is a runtime property.
    * @type {EnumDWT_CapType}
    */
  var CapType: EnumDWTCapType = js.native
  /**
    * Returns or sets the value of the capability specified by Capability property when the value of the CapType property is TWON_ONEVALUE. This is a runtime property.
    * @type {number}
    */
  var CapValue: Double = js.native
  /**
    * Sets or returns the string value for a capability when the value of the CapType property is TWON_ONEVALUE. This is a runtime property.
    * @type {string}
    */
  var CapValueString: String = js.native
  /**
    * Sets or returns the value type for reading the value of a capability. This is a runtime property.
    * @type {number}
    */
  var CapValueType: Double = js.native
  /**
    * Specifies the capabiltiy to be negotiated. This is a runtime property.
    * @type {EnumDWT_Cap}
    */
  var Capability: EnumDWTCap = js.native
  /**
    * Returns or sets the contrast values available within the Source. This is a runtime property.
    * @type {number}
    */
  var Contrast: Double = js.native
  /**
    * Returns or sets current index of image in buffer. This is a runtime property.
    * @type {number}
    */
  var CurrentImageIndexInBuffer: Double = js.native
  /**
    * Returns the device name of current source. This is a runtime, read-only property.
    * @type {string}
    */
  val CurrentSourceName: String = js.native
  /**
    * Returns the value indicating the data source status. This is a runtime, read-only property.
    * @type {number}
    */
  val DataSourceStatus: Double = js.native
  /**
    * Returns the device name of default source. This is a runtime, read-only property.
    * @type {string}
    */
  val DefaultSourceName: String = js.native
  /**
    * Returns whether the source supports duplex. If so, it further returns the level of duplex the Source supports (one pass or two pass duplex). This is a runtime, read-only property.
    * @type {EnumDWT_DUPLEX}
    */
  val Duplex: EnumDWTDUPLEX = js.native
  /**
    * [Deprecated.] Returns or sets whether the user can zoom image using hot key.
    * @type {boolean}
    */
  var EnableInteractiveZoom: Boolean = js.native
  /**
    * Returns the error code. This is a runtime, read-only property.
    * @type {number}
    */
  val ErrorCode: Double = js.native
  /**
    * Returns the error string. This is a runtime, read-only property.
    * @type {string}
    */
  val ErrorString: String = js.native
  /**
    * Returns or sets the password used to log into the FTP server.
    * @type {string}
    */
  var FTPPassword: String = js.native
  /**
    * Returns or sets the port number of the FTP server.
    * @type {number}
    */
  var FTPPort: Double = js.native
  /**
    * Returns or sets the user name used to log into the FTP server.
    * @type {string}
    */
  var FTPUserName: String = js.native
  /**
    * Returns or sets whether to resize the image to fit the image to the width or height of the window. To use the property, the view mode should be set to -1 by -1. You can use SetViewMode method to set the view mode.
    * @type {EnumDWT_FitWindowType}
    */
  var FitWindowType: EnumDWTFitWindowType = js.native
  /**
    * [Deprecated.] Sets or returns the password used to log into the HTTP server.
    * @type {string}
    */
  var HTTPPassword: String = js.native
  /**
    * Returns or sets the port number of the HTTP server.
    * @type {number|string}
    */
  var HTTPPort: Double | String = js.native
  /**
    * Returns the response string from the HTTP server if an error occurs for HTTPUploadThroughPost() method. This is a runtime, read-only property.
    * @type {string}
    */
  val HTTPPostResponseString: String = js.native
  /**
    * Returns whether a HTTP request has credentials
    * @type {boolean}
    */
  var HTTPRequestswithCredentials: Boolean = js.native
  /**
    * [Deprecated.] Returns or sets the user name used to log into the HTTP server.
    * @type {string}
    */
  var HTTPUserName: String = js.native
  /**
    * Returns or sets the height of the dwt viewer object
    * @type {string|number}
    */
  var Height: String | Double = js.native
  /**
    * Returns how many images are in buffer. This is a runtime, read-only property.
    * @type {number}
    */
  val HowManyImagesInBuffer: Double = js.native
  /**
    * Specifies the content type of a http upload.
    * @type {string}
    */
  var HttpContentTypeFieldValue: String = js.native
  /**
    * Specifies the field name of uploaded image through POST.
    * @type {string}
    */
  var HttpFieldNameOfUploadedImage: String = js.native
  /**
    * Returns or sets whether the feature of disk caching is enabled.
    * @type {boolean}
    */
  var IfAllowLocalCache: Boolean = js.native
  /**
    * Returns or sets whether insert or append new scanned images.
    * @type {boolean}
    */
  var IfAppendImage: Boolean = js.native
  /**
    * Returns or sets whether the Source's Auto-brightness function is enabled. This is a runtime property.
    * @type {boolean}
    */
  var IfAutoBright: Boolean = js.native
  /**
    * Returns or sets whether the data source (scanner) will discard blank images during scanning. The property works only if the device and its driver support discarding blank pages. You can find whether your device supports this capbility from its user manual. Or, you can use the built-in methods of Dynamic Web TWAIN to detect blank images: IsBlankImage, IsBlankImageEx.
    * @type {boolean}
    */
  var IfAutoDiscardBlankpages: Boolean = js.native
  /**
    * Returns or sets whether the Source enable automatic document feeding process. This is a runtime property.
    * @type {boolean}
    */
  var IfAutoFeed: Boolean = js.native
  /**
    * Returns or sets whether the Source enables the automatic document scanning process. This is a runtime property.
    * @type {boolean}
    */
  var IfAutoScan: Boolean = js.native
  /**
    * Specifies whether or not to automatically scroll to the last image or stay on the current image when loading or acquiring images
    * @type {boolean}
    */
  var IfAutoScroll: Boolean = js.native
  /**
    * Turns automatic border detection on and off. The property works only if the device and its driver support detecting the border automatically. You can find whether your device supports this capbility from its user manual.
    * @type {boolean}
    */
  var IfAutomaticBorderDetection: Boolean = js.native
  /**
    * Turns automatic skew correction on and off.
    * @type {boolean}
    */
  var IfAutomaticDeskew: Boolean = js.native
  /**
    * Returns or sets whether close the Data Source User Interface after acquire all images. Default value of this property is FALSE.
    * @type {boolean}
    */
  var IfDisableSourceAfterAcquire: Boolean = js.native
  /**
    * Returns or sets whether the Source supports duplex. If TRUE, the scanner scans both sides of a paper; otherwise, the scanner will scan only one side of the image. This is a runtime property.
    * @type {boolean}
    */
  var IfDuplexEnabled: Boolean = js.native
  /**
    * Returns or sets whether the Automatic Document Feeder (ADF) is enabled. This is a runtime property.
    * @type {boolean}
    */
  var IfFeederEnabled: Boolean = js.native
  /**
    * Returns whether or not there are documents loaded in the Source's feeder when IfFeederEnabled and IfPaperDetectable are TRUE. This is a runtime, read-only property.
    * @type {boolean}
    */
  val IfFeederLoaded: Boolean = js.native
  /**
    * Returns or sets whether to resize the image to fit the size of window when the view mode is set to -1 by -1. You can use SetViewMode method to set the view mode.
    * @type {boolean}
    */
  var IfFitWindow: Boolean = js.native
  /**
    * [Deprecated.] Returns or sets whether the UI (User Interface) of Source runs in modal state. Default value of this property is TRUE.
    * @type {boolean}
    */
  var IfModalUI: Boolean = js.native
  /**
    * Sets or returns whether Dynamic Web TWAIN uses  Graphics Device Interface (GDI) when decoding images.
    * @type {boolean}
    */
  var IfOpenImageWithGDIPlus: Boolean = js.native
  /**
    * Returns or sets whether FTP passive mode is enabled.
    * @type {boolean}
    */
  var IfPASVMode: Boolean = js.native
  /**
    * Returns the value whether the Source has a paper sensor that can detect documents on the ADF or Flatbed. This is a runtime, read-only property.
    * @type {boolean}
    */
  val IfPaperDetectable: Boolean = js.native
  /**
    * Returns or sets whether SSL is used when uploading or downloading images.
    * @type {boolean}
    */
  var IfSSL: Boolean = js.native
  /**
    * [Deprecated.] Returns or sets whether communicate with device in a separate thread. Default value of this property is FALSE.
    * @type {boolean}
    */
  var IfScanInNewThread: Boolean = js.native
  /**
    * Sets or returns whether to show the cancel dialog when uploading images to server.
    * @type {boolean}
    */
  var IfShowCancelDialogWhenImageTransfer: Boolean = js.native
  /**
    * Returns or sets whether to show the file dialog box when saving scanned images or loading images from local folder.
    * @type {boolean}
    */
  var IfShowFileDialog: Boolean = js.native
  /**
    * Returns or sets whether the Source displays a progress indicator during acquisition and transfer, regardless of whether the Source's user interface is active. This is a runtime property.
    * @type {boolean}
    */
  var IfShowIndicator: Boolean = js.native
  /**
    * [Deprecated.] Returns or sets whether the driver of the printer displays the User Interface.
    * @type {boolean}
    */
  var IfShowPrintUI: Boolean = js.native
  /**
    * Returns or sets whether the progress bar will be displayed during the transaction. This is a runtime property.
    * @type {boolean}
    */
  var IfShowProgressBar: Boolean = js.native
  /**
    * Returns or sets whether the Source displays the User Interface.
    * @type {boolean}
    */
  var IfShowUI: Boolean = js.native
  /**
    * Returns or sets whether to throw exceptions
    * @type {boolean}
    */
  var IfThrowException: Boolean = js.native
  /**
    * Return or sets whether the Source allows to save many images in one TIFF file. The default value is FALSE.
    * @type {boolean}
    */
  var IfTiffMultiPage: Boolean = js.native
  /**
    * Returns whether the Source supports acquisition with the UI (User Interface) disabled. If FALSE, indicates that this Source can only support acquisition with the UI enabled. This is a runtime, read-only property.
    * @type {boolean}
    */
  val IfUIControllable: Boolean = js.native
  /**
    * Sets or returns whether Dynamic Web TWAIN uses the new TWAIN Data Source Manager (TWAINDSM.dll) when acquiring images from TWAIN devices.
    * @type {boolean}
    */
  var IfUseTwainDSM: Boolean = js.native
  /**
    * [Deprecated.] The number of bits in each image pixel (or bit depth). This is a runtime, read-only property.
    * @type {number}
    */
  var ImageBitsPerPixel: Double = js.native
  /**
    * Returns or sets whether a TWAIN driver or Native Scan of Mac OS X is used for document scanning. This property works for Mac edition only.
    * @type {number}
    */
  var ImageCaptureDriverType: Double = js.native
  /**
    * [Deprecated.] Returns or sets whether the image enumerator is enabled in Image Editor.
    * @type {boolean}
    */
  var ImageEditorIfEnableEnumerator: Boolean = js.native
  /**
    * [Deprecated.] Returns or sets whether the Image Editor is a modal window.
    * @type {boolean}
    */
  var ImageEditorIfModal: Boolean = js.native
  /**
    * [Deprecated.] Returns or sets whether the Image Editor is read-only.
    * @type {boolean}
    */
  var ImageEditorIfReadonly: Boolean = js.native
  /**
    * [Deprecated.] Returns or sets the title of Image Editor window.
    * @type {string}
    */
  var ImageEditorWindowTitle: String = js.native
  /**
    * Returns the document number of the current image. This is a runtime, read-only property.
    * @type {number}
    */
  val ImageLayoutDocumentNumber: Double = js.native
  /**
    * Returns the value of the bottom-most edge of the current image frame (in Unit). This is a read-only runtime property.
    * @type {number}
    */
  val ImageLayoutFrameBottom: Double = js.native
  /**
    * Returns the value of the left-most edge of the current image frame (in Unit). This is a runtime, read-only property.
    * @type {number}
    */
  val ImageLayoutFrameLeft: Double = js.native
  /**
    * Returns the frame number of the current image. This is a runtime, read-only property.
    * @type {number}
    */
  val ImageLayoutFrameNumber: Double = js.native
  /**
    * Returns the value of the right-most edge of the current image frame (in Unit). This is a runtime, read-only property.
    * @type {number}
    */
  val ImageLayoutFrameRight: Double = js.native
  /**
    * Returns the value of the top-most edge of the current image frame (in Unit). This is a runtime, read-only property.
    * @type {number}
    */
  val ImageLayoutFrameTop: Double = js.native
  /**
    * Returns the page number of the current image. This is a runtime, read-only property.
    * @type {Long}
    */
  val ImageLayoutPageNumber: Double = js.native
  /**
    * [Deprecated.] Returns how tall/long, in pixels, the image is. This is a runtime, read-only property.
    * @type {number}
    */
  var ImageLength: Double = js.native
  /**
    * Returns or sets the margin between images when multiple images are displayed in Dynamic Web TWAIN.
    * @type {number}
    */
  var ImageMargin: Double = js.native
  /**
    * Returns the pixel type of the current image. This is a runtime, read-only property. Please note the property is only valid in OnPreTransfer and OnPostTransfer event.
    * @type {EnumDWT_PixelType}
    */
  val ImagePixelType: EnumDWTPixelType = js.native
  /**
    * [Deprecated.] Returns how width, in pixels, the image is. This is a runtime, read-only property.
    * @type {number}
    */
  var ImageWidth: Double = js.native
  /**
    * [Deprecated.] Returns the X resolution of the current image. X resolution is the number of pixels per Unit in the horizontal direction. This is a runtime, read-only property.
    * @type {number}
    */
  var ImageXResolution: Double = js.native
  /**
    * [Deprecated.] Returns the Y resolution of the current image. Y resolution is the number of pixels per Unit in the vertical direction. This is a runtime, read-only property.
    * @type {number}
    */
  var ImageYResolution: Double = js.native
  /**
    * Returns or sets the quality of JPEG files and PDF files using JPEG compression.
    * @type {number}
    */
  var JPEGQuality: Double = js.native
  /**
    * Returns or sets the log level for debugging.
    * @type {number}
    */
  var LogLevel: Double = js.native
  /**
    * Return the magnetic data if the scanner support magnetic data recognition.
    * @type {string}
    */
  val MagData: String = js.native
  /**
    * Return the magnetic type if the scanner support magnetic data recognition.
    * @type {number}
    */
  val MagType: Double = js.native
  /**
    * Sets or returns the manufacture string for the application identity.
    * @type {string}
    */
  var Manufacturer: String = js.native
  /**
    * Returns or sets the maximum number of images can be held in buffer.
    * @type {number}
    */
  var MaxImagesInBuffer: Double = js.native
  /**
    * [Deprecated.] Returns or sets how many threads can be used when you upload files through POST.
    * @type {number}
    */
  var MaxInternetTransferThreads: Double = js.native
  /**
    * Sets or returns the maximum allowed size when Dynamic Web TWAIN uploads a document.
    * @type {number}
    */
  var MaxUploadImageSize: Double = js.native
  /**
    * Returns or sets the shape of the mouse.
    * @type {boolean}
    */
  var MouseShape: Boolean = js.native
  /**
    * Returns the X co-ordinate of the mouse. This is a runtime property.
    * @type {number}
    */
  val MouseX: Double = js.native
  /**
    * Returns the Y co-ordinate of the mouse. This is a runtime property.
    * @type {number}
    */
  val MouseY: Double = js.native
  /**
    * Returns or sets the name of the person who creates the PDF document.
    * @type {string}
    */
  var PDFAuthor: String = js.native
  /**
    * Returns or sets the compression type of PDF files. This is a runtime property.
    * @type {EnumDWT_PDFCompressionType}
    */
  var PDFCompressionType: EnumDWTPDFCompressionType = js.native
  /**
    * Returns or sets the date when the PDF document is created.
    * @type {string}
    */
  var PDFCreationDate: String = js.native
  /**
    * Returns or sets the name of the application that created the original document, if the PDF document is converted from another form.
    * @type {string}
    */
  var PDFCreator: String = js.native
  /**
    * Returns or sets the keywords associated with the PDF document.
    * @type {string}
    */
  var PDFKeywords: String = js.native
  /**
    * Returns or sets the date when the PDF document is last modified.
    * @type {string}
    */
  var PDFModifiedDate: String = js.native
  /**
    * Returns or sets the name of the application that converted the PDF document from its native.
    * @type {string}
    */
  var PDFProducer: String = js.native
  /**
    * Returns or sets the subject of the PDF document.
    * @type {string}
    */
  var PDFSubject: String = js.native
  /**
    * Returns or sets the title of the PDF document.
    * @type {string}
    */
  var PDFTitle: String = js.native
  /**
    * Returns or sets the value of the PDF version.
    * @type {string}
    */
  var PDFVersion: String = js.native
  /**
    * Returns or sets the page size(s) the Source can/should use to acquire image data. This is a runtime property.
    * @type {EnumDWT_CapSupportedSizes}
    */
  var PageSize: EnumDWTCapSupportedSizes = js.native
  /**
    * Returns the number of transfers the Source is ready to supply, upon demand. This is a runtime, read-only property.
    * @type {number}
    */
  val PendingXfers: Double = js.native
  /**
    * Returns or sets the pixel flavor for acquired images. This is a runtime property.
    * @type {number}
    */
  var PixelFlavor: Double = js.native
  /**
    * Returns or sets the pixel type of current data source. This is a runtime property. Using this property after calling OpenSource() method and before calling AcquireImage().
    * @type {EnumDWT_PixelType}
    */
  var PixelType: EnumDWTPixelType = js.native
  /**
    * Sets or returns the product family string for the application identity.
    * @type {string}
    */
  var ProductFamily: String = js.native
  /**
    * Sets the product key. A product key is generated in Licensing Tool which is intalled with Dynamic Web TWAIN. Each product key corresponds with a license.
    * @type {string}
    */
  var ProductKey: String = js.native
  /**
    * Sets or returns the product name string for the application identity.
    * @type {string}
    */
  var ProductName: String = js.native
  /**
    * [Deprecated.] Returns or sets the name of the proxy server.
    * @type {string}
    */
  var ProxyServer: String = js.native
  /**
    * Returns or sets the current resolution for acquired images. This is a runtime property.
    * @type {number}
    */
  var Resolution: Double = js.native
  /**
    * Returns or sets how many scanned images are selected.
    * @type {number}
    */
  var SelectedImagesCount: Double = js.native
  /**
    * Returns or sets the border color of the selected image. It is a value specifying the 24-bit RGB value.
    * @type {number}
    */
  var SelectionImageBorderColor: Double = js.native
  /**
    * Specifies a fixed aspect ratio to be used for selecting an area.
    * @type {number}
    */
  var SelectionRectAspectRatio: Double = js.native
  /**
    * Specifies whether to show the page number
    * @type {boolean}
    */
  var ShowPageNumber: Boolean = js.native
  /**
    * Returns how many sources are installed in the system. This is a runtime, read-only property.
    * @type {number}
    */
  val SourceCount: Double = js.native
  /**
    * Returns or sets the compression type of TIFF files. This is a runtime property.
    * @type {EnumDWT_TIFFCompressionType}
    */
  var TIFFCompressionType: EnumDWTTIFFCompressionType = js.native
  /**
    * Sets or returns the transfer mode.
    * @type {EnumDWT_TransferMode}
    */
  var TransferMode: EnumDWTTransferMode = js.native
  /**
    * Returns or sets the unit of measure. This is a runtime property.
    * @type {EnumDWT_UnitType}
    */
  var Unit: EnumDWTUnitType = js.native
  /**
    * Specifies whether to show the vertical scroll bar
    * @type {boolean}
    */
  var VScrollBar: Boolean = js.native
  /**
    * Sets or returns the version info string for the application identity.
    * @type {string}
    */
  val VersionInfo: String = js.native
  /**
    * Returns or sets the width of the dwt object viewer
    * @type {string|number}
    */
  var Width: String | Double = js.native
  /**
    * Returns and sets the number of images you are willing to transfer per session. This is a runtime property.
    * @type {number}
    */
  var XferCount: Double = js.native
  /**
    * Returns or sets zoom factor for the image, only valid When the view mode is set to -1 by -1.
    * @type {number}
    */
  var Zoom: Double = js.native
  /**
    * Returns whether the instance of a DWT is initialized
    * @type {boolean}
    */
  var bReady: Boolean = js.native
  /**
    * Returns the runtime id of the dwt object
    * @type {string}
    */
  val clientId: String = js.native
  /**
    * Returns the runtime class for the dwt container DIV
    * @type {string}
    */
  var containerClass: String = js.native
  /* ignored 
    style
    _AutoCropMethod
    */
  /*
    *Methods
    */
  /**
    * Displays the source's built-in interface to acquire image.
    * @method WebTwain#AcquireImage
    * @param {object} optionalDeviceConfig  a JS object used to set up the device for image acquisition.
    * @param {function} asyncSuccessFunc the function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} asyncFailureFunc the function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def AcquireImage(): Boolean = js.native
  def AcquireImage(optionalDeviceConfig: js.Object): Boolean = js.native
  def AcquireImage(optionalDeviceConfig: js.Object, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def AcquireImage(
    optionalDeviceConfig: js.Object,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Add text on an image.
    * @method WebTwain#AddText
    * @param {number} sImageIndex  the index of the image that you want to add text to.
    * @param {number} x the x coordinate for the text.
    * @param {number} y the y coordinate for the text.
    * @param {string} text the content of the text that you want to add.
    * @param {number} txtColor  the color for the text.
    * @param {number} backgroundColor  the background color.
    * @param {number} backgroundRoundRadius ranging from 0 to 0.5. Please NOTE that MAC version does not support this parameter.
    * @param {number} backgroundOpacity specifies the opacity of the background of the added text, it ranges from 0 to 1.0. Please NOTE that Mac version only supports value 0 and 1
    * @return {boolean}
    */
  def AddText(
    sImageIndex: Double,
    x: Double,
    y: Double,
    text: String,
    txtColor: Double,
    backgroundColor: Double,
    backgroundRoundRadius: Double,
    backgroundOpacity: Double
  ): Boolean = js.native
  /**
    * Cancels all pending transfers.
    * @method WebTwain#CancelAllPendingTransfers
    * @return {boolean}
    */
  def CancelAllPendingTransfers(): Boolean = js.native
  /**
    * Gets information of the capability specified by the Capability property.
    * @method WebTwain#CapGet
    * @return {boolean}
    */
  def CapGet(): Boolean = js.native
  /**
    * Returns the Source's current Value for the specified capability.
    * @method WebTwain#CapGetCurrent
    * @return {boolean}
    */
  def CapGetCurrent(): Boolean = js.native
  /**
    * Returns the Source's Default Value for the specified capability. This is the Source's preferred default value.
    * @method WebTwain#CapGetDefault
    * @return {boolean}
    */
  def CapGetDefault(): Boolean = js.native
  /**
    * Returns the value of the bottom-most edge of the specified frame.
    * @method WebTwain#CapGetFrameBottom
    * @param {number} index specifies the value of which frame to get. The index is 0-based.
    * @return {number}
    */
  def CapGetFrameBottom(index: Double): Double = js.native
  /**
    * Returns the value (in Unit) of the left-most edge of the specified frame.
    * @method WebTwain#CapGetFrameLeft
    * @param {number} index specifies the value of which frame to get. The index is 0-based.
    * @return {number}
    */
  def CapGetFrameLeft(index: Double): Double = js.native
  /**
    * Returns the value (in Unit) of the left-most edge of the specified frame.
    * @method WebTwain#CapGetFrameRight
    * @param {number} index specifies the value of which frame to get. The index is 0-based.
    * @return {number}
    */
  def CapGetFrameRight(index: Double): Double = js.native
  /**
    * Returns the value (in Unit) of the top-most edge of the specified frame.
    * @method WebTwain#CapGetFrameTop
    * @param {number} index specifies the value of which frame to get. The index is 0-based.
    * @return {number}
    */
  def CapGetFrameTop(index: Double): Double = js.native
  /* ignored
    * CapGetHelp
    * CapGetLabel
    * CapGetLabels
    */
  /**
    * Queries whether the Source supports a particular operation on the capability.
    * @method WebTwain#CapIfSupported
    * @param {EnumDWT_MessageType} messageType specifies the type of capability operation.
    * @return {boolean}
    */
  def CapIfSupported(messageType: EnumDWTMessageType): Boolean = js.native
  /**
    * Changes the Current Value of the capability specified by Capability property back to its power-on value.
    * @method WebTwain#CapReset
    * @return {boolean}
    */
  def CapReset(): Boolean = js.native
  /**
    * Sets the current capability using the container type specified by CapType property. The current capability is specified by Capability property.
    * @method WebTwain#CapSet
    * @return {boolean}
    */
  def CapSet(): Boolean = js.native
  /**
    * Sets the values of the specified frame.
    * @method WebTwain#CapSetFrame
    * @param {number} index  specifies the values of which frame to set. The index is 0-based.
    * @param {number} left the value (in Unit) of the left-most edge of the specified frame.
    * @param {number} top the value (in Unit) of the top-most edge of the specified frame.
    * @param {number} right  the value (in Unit) of the right-most edge of the specified frame.
    * @param {number} bottom  the value (in Unit) of the bottom-most edge of the specified frame.
    * @return {boolean}
    */
  def CapSetFrame(index: Double, left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  /**
    * Changes the bitdepth of a specified image.
    * @method WebTwain#ChangeBitDepth
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {number} sBitDepth specifies the target bit depth.
    * @param {boolean} bHighQuality specifies whether or not to keep high quality while changing the bit depth. When it's true, it takes more time.
    * @return {boolean}
    */
  def ChangeBitDepth(sImageIndex: Double, sBitDepth: Double, bHighQuality: Boolean): Boolean = js.native
  /**
    * Changes width and height of the image of a specified index in the buffer. Please note the file size of the image will be changed proportionately.
    * @method WebTwain#ChangeImageSize
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {number} iNewWidth  specifies the pixel width of the new image.
    * @param {number} iNewHeight specifies the pixel height of the new image.
    * @param {EnumDWT_InterpolationMethod} newVal specifies the method to do interpolation.
    * @return {boolean}
    */
  def ChangeImageSize(sImageIndex: Double, iNewWidth: Double, iNewHeight: Double, newVal: EnumDWTInterpolationMethod): Boolean = js.native
  /**
    * Clears all the web forms which are used for image uploading.
    * @method WebTwain#ClearAllHTTPFormField
    * @return {boolean}
    */
  def ClearAllHTTPFormField(): Boolean = js.native
  def ClearImageTags(sImageIndex: Double): Boolean = js.native
  /**
    * Clears the content of all custom tiff tags.
    * @method WebTwain#ClearTiffCustomTag
    * @return {void}
    */
  def ClearTiffCustomTag(): Unit = js.native
  /**
    * Closes Data Source.
    * @method WebTwain#CloseSource
    * @return {boolean}
    */
  def CloseSource(): Boolean = js.native
  /**
    * Closes and unloads Data Source Manager.
    * @method WebTwain#CloseSourceManager
    * @return {boolean}
    */
  def CloseSourceManager(): Boolean = js.native
  /**
    * Closes the current process used to scan
    * @method WebTwain#CloseWorkingProcess
    * @return {boolean}
    */
  def CloseWorkingProcess(): Boolean = js.native
  /**
    * Converts the images specified by the indices to base64 synchronously.
    * @method WebTwain#ConvertToBase64
    * @param {Array} indices indices specifies which images are to be converted to base64.
    * @param {EnumDWT_ImageType} enumImageType the image format in which the images are to be converted to base64.
    * @return {Base64Result}
    
    ConvertToBase64(indices: number[], enumImageType: EnumDWT_ImageType): Base64Result;
    */
  /**
    * Converts the images specified by the indices to base64 asynchronously.
    * @method WebTwain#ConvertToBase64
    * @param {Array} indices indices specifies which images are to be converted to base64.
    * @param {EnumDWT_ImageType} enumImageType the image format in which the images are to be converted to base64.
    * @param {function} asyncSuccessFunc the function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} asyncFailureFunc the function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def ConvertToBase64(
    indices: js.Array[Double],
    enumImageType: EnumDWTImageType,
    asyncSuccessFunc: js.Function1[/* result */ Base64Result, Unit],
    asyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Converts the images specified by the indices to blob synchronously.
    * @method WebTwain#ConvertToBlob
    * @param {Array} indices indices specifies which images are to be converted to base64.
    * @param {EnumDWT_ImageType} enumImageType the image format in which the images are to be converted to base64.
    * @return {Blob}
    */
  def ConvertToBlob(indices: js.Array[Double], enumImageType: EnumDWTImageType): Blob = js.native
  /**
    * Converts the images specified by the indices to blob asynchronously.
    * @method WebTwain#ConvertToBlob
    * @param {Array} indices indices specifies which images are to be converted to base64.
    * @param {EnumDWT_ImageType} enumImageType the image format in which the images are to be converted to base64.
    * @param {function} asyncSuccessFunc the function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} asyncFailureFunc the function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def ConvertToBlob(
    indices: js.Array[Double],
    enumImageType: EnumDWTImageType,
    asyncSuccessFunc: js.Function1[/* result */ js.Any, Unit],
    asyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Changes a specified image to gray scale.
    * @method WebTwain#ConvertToGrayScale
    * @param {number} sIndex specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def ConvertToGrayScale(sIndex: Double): Boolean = js.native
  /**
    * Copies the image of a specified index in buffer to clipboard in DIB format.
    * @method WebTwain#CopyToClipboard
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def CopyToClipboard(sImageIndex: Double): Boolean = js.native
  /**
    * Create the font for adding text using the method AddText.
    * @method WebTwain#CreateTextFont
    * @param {number} height Specifies the desired height (in logical units) of the font.The absolute value of nHeight must not exceed 16,384 device units after it is converted.For all height comparisons, the font mapper looks for the largest font that does not exceed the requested size or the smallest font if all the fonts exceed the requested size.
    * @param {number} width Specifies the average width (in logical units) of characters in the font. If Width is 0, the aspect ratio of the device will be matched against the digitization aspect ratio of the available fonts to find the closest match, which is determined by the absolute value of the difference.
    * @param {number} escapement Specifies the angle (in 0.1-degree units) between the escapement vector and the x-axis of the display surface. The escapement vector is the line through the origins of the first and last characters on a line. The angle is measured counterclockwise from the x-axis.
    * @param {number} orientation Specifies the angle (in 0.1-degree units) between the baseline of a character and the x-axis.The angle is measured counterclockwise from the x-axis for coordinate systems in which the y-direction is down and clockwise from the x-axis for coordinate systems in which the y-direction is up.
    * @param {number} weight Specifies the font weight (in inked pixels per 1000). The described valuesare approximate; the actual appearance depends on the typeface. Some fonts haveonly FW_NORMAL, FW_REGULAR, and FW_BOLD weights. If FW_DONTCARE is specified, a default weight is used.
    * @param {number} italic  Specifies an italic font if set to TRUE.
    * @param {number} underline Specifies an underlined font if set to TRUE.
    * @param {number} strikeOut A strikeout font if set to TRUE.
    * @param {number} charSet Specifies the font's character set. The OEM character set is system-dependent. Fonts with other character sets may exist in the system. An application that uses a font with an unknown character set must not attempt to translate or interpret strings that are to be rendered with that font.
    * @param {number} outputPrecision Specifies the desired output precision. The output precision defines how closely the output must match the requested font's height, width, character orientation, escapement, and pitch.
    * @param {number} clipPrecision Specifies the desired clipping precision. The clipping precision defines how to clip characters that are partially outside the clipping region.
    * @param {number} quality Specifies the font's output quality, which defines how carefully the GDI must attempt to match the logical-font attributes to those of an actual physical font.
    * @param {number} pitchAndFamily  The pitch and family of the font.
    * @param {string} faceName   the typeface name, the length of this string must not exceed 32 characters, including the terminating null character.
    * @return {boolean}
    */
  def CreateTextFont(
    height: Double,
    width: Double,
    escapement: Double,
    orientation: Double,
    weight: Double,
    italic: Double,
    underline: Double,
    strikeOut: Double,
    charSet: Double,
    outputPrecision: Double,
    clipPrecision: Double,
    quality: Double,
    pitchAndFamily: Double,
    faceName: String
  ): Boolean = js.native
  /**
    * Crops the image of a specified index in buffer.
    * @method WebTwain#Crop
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {number} left specifies the x-coordinate of the upper-left corner of the rectangle.
    * @param {number} top specifies the y-coordinate of the upper-left corner of the rectangle.
    * @param {number} right specifies the x-coordinate of the lower-right corner of the rectangle.
    * @param {number} bottom specifies the y-coordinate of the lower-right corner of the rectangle.
    * @return {boolean}
    */
  def Crop(sImageIndex: Double, left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  /**
    * Crops the image of a specified index in buffer to clipboard in DIB format.
    * @method WebTwain#CropToClipboard
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {number} left specifies the x-coordinate of the upper-left corner of the rectangle.
    * @param {number} top specifies the y-coordinate of the upper-left corner of the rectangle.
    * @param {number} right specifies the x-coordinate of the lower-right corner of the rectangle.
    * @param {number} bottom specifies the y-coordinate of the lower-right corner of the rectangle.
    * @return {boolean}
    */
  def CropToClipboard(sImageIndex: Double, left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  /**
    * Cuts the image data in the specified area to the system clipboard in DIB format.
    * @method WebTwain#CutFrameToClipboard
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {number} left specifies the x-coordinate of the upper-left corner of the rectangle.
    * @param {number} top specifies the y-coordinate of the upper-left corner of the rectangle.
    * @param {number} right specifies the x-coordinate of the lower-right corner of the rectangle.
    * @param {number} bottom specifies the y-coordinate of the lower-right corner of the rectangle.
    * @return {boolean}
    */
  def CutFrameToClipboard(sImageIndex: Double, left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  /**
    * Cuts the image of a specified index in buffer to clipboard in DIB format.
    * @method WebTwain#CutToClipboard
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def CutToClipboard(sImageIndex: Double): Boolean = js.native
  /**
    * Disable the source. If the source's user interface is displayed when the source is enabled, it will be closed.
    * @method WebTwain#DisableSource
    * @return {boolean}
    */
  def DisableSource(): Boolean = js.native
  /**
    * Enables the source to accept image.
    * @method WebTwain#EnableSource
    * @return {boolean}
    */
  def EnableSource(): Boolean = js.native
  /**
    * Clears the specified area of a specified image, and fill the area with the fill color.
    * @method WebTwain#Erase
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {number} left specifies the x-coordinate of the upper-left corner of the rectangle.
    * @param {number} top specifies the y-coordinate of the upper-left corner of the rectangle.
    * @param {number} right specifies the x-coordinate of the lower-right corner of the rectangle.
    * @param {number} bottom specifies the y-coordinate of the lower-right corner of the rectangle.
    * @return {boolean}
    */
  def Erase(sImageIndex: Double, left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  /**
    * Downloads an image from the FTP server.
    * @method WebTwain#FTPDownload
    * @param {string} FTPServer the name of the FTP server.
    * @param {string} FTPRemoteFile the name of the file to be downloaded. It should be the relative path of the file on the FTP server.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the download fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def FTPDownload(FTPServer: String, FTPRemoteFile: String): Boolean = js.native
  def FTPDownload(FTPServer: String, FTPRemoteFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def FTPDownload(
    FTPServer: String,
    FTPRemoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Directly download a file from the FTP server to local disk without loading it into Dynamic Web TWAIN.
    * @method WebTwain#FTPDownloadDirectly
    * @param {string} FTPServer the name of the FTP server.
    * @param {string} FTPRemoteFile the name of the file to be downloaded. It should be the relative path of the file on the FTP server.
    * @param {string} localFile specify a full path to store the file.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the download fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def FTPDownloadDirectly(FTPServer: String, FTPRemoteFile: String, localFile: String): Boolean = js.native
  def FTPDownloadDirectly(
    FTPServer: String,
    FTPRemoteFile: String,
    localFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def FTPDownloadDirectly(
    FTPServer: String,
    FTPRemoteFile: String,
    localFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Downloads an image from the FTP server.
    * @method WebTwain#FTPDownloadEx
    * @param {string} FTPServer the name of the FTP server.
    * @param {string} FTPRemoteFile the name of the file to be downloaded. It should be the relative path of the file on the FTP server.
    * @param {EnumDWT_ImageType} lImageType simage format of the file to be downloaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the download fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def FTPDownloadEx(FTPServer: String, FTPRemoteFile: String, lImageType: EnumDWTImageType): Boolean = js.native
  def FTPDownloadEx(
    FTPServer: String,
    FTPRemoteFile: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def FTPDownloadEx(
    FTPServer: String,
    FTPRemoteFile: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Uploads the image of a specified index in the buffer to the FTP server.
    * @method WebTwain#FTPUpload
    * @param {string} FTPServer the name of the FTP server.
    * @param {number} sImageIndex specifies the index of the image in the buffer. The index is 0-based.
    * @param {string} FTPRemoteFile the name of the file to be created on the FTP server. It should be a relative path on the FTP server.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def FTPUpload(FTPServer: String, sImageIndex: Double, FTPRemoteFile: String): Boolean = js.native
  def FTPUpload(
    FTPServer: String,
    sImageIndex: Double,
    FTPRemoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def FTPUpload(
    FTPServer: String,
    sImageIndex: Double,
    FTPRemoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Uploads all images in buffer to the FTP server as Multi-Page TIFF.
    * @method WebTwain#FTPUploadAllAsMultiPageTIFF
    * @param {string} FTPServer  the name of the FTP server.
    * @param {string} FTPRemoteFile the name of the image to be uploaded. It should be a relative path on the FTP server.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def FTPUploadAllAsMultiPageTIFF(FTPServer: String, FTPRemoteFile: String): Boolean = js.native
  def FTPUploadAllAsMultiPageTIFF(FTPServer: String, FTPRemoteFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def FTPUploadAllAsMultiPageTIFF(
    FTPServer: String,
    FTPRemoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Uploads all images in buffer to the FTP server as Multi-Page PDF.
    * @method WebTwain#FTPUploadAllAsPDF
    * @param {string} FTPServer the name of the FTP server.
    * @param {string} FTPRemoteFile the name of the image to be uploaded. It should be a relative path on the FTP server.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def FTPUploadAllAsPDF(FTPServer: String, FTPRemoteFile: String): Boolean = js.native
  def FTPUploadAllAsPDF(FTPServer: String, FTPRemoteFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def FTPUploadAllAsPDF(
    FTPServer: String,
    FTPRemoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Uploads the selected images in buffer to the FTP server as Multi-Page PDF.
    * @method WebTwain#FTPUploadAsMultiPagePDF
    * @param {string} FTPServer the name of the FTP server.
    * @param {string} FTPRemoteFile the name of the image to be uploaded. It should be a relative path on the FTP server.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def FTPUploadAsMultiPagePDF(FTPServer: String, FTPRemoteFile: String): Boolean = js.native
  def FTPUploadAsMultiPagePDF(FTPServer: String, FTPRemoteFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def FTPUploadAsMultiPagePDF(
    FTPServer: String,
    FTPRemoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Uploads the selected images in buffer to the FTP server as Multi-Page TIFF.
    * @method WebTwain#FTPUploadAsMultiPageTIFF
    * @param {string} FTPServer the name of the FTP server.
    * @param {string} FTPRemoteFile the name of the image to be uploaded. It should be a relative path on the FTP server.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def FTPUploadAsMultiPageTIFF(FTPServer: String, FTPRemoteFile: String): Boolean = js.native
  def FTPUploadAsMultiPageTIFF(FTPServer: String, FTPRemoteFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def FTPUploadAsMultiPageTIFF(
    FTPServer: String,
    FTPRemoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Directly upload a specific file to the FTP server without loading it into Dynamic Web TWAIN.
    * @method WebTwain#FTPUploadDirectly
    * @param {string} FTPServer the name of the FTP server.
    * @param {string} localFile specify the the full path of a local file.
    * @param {string} FTPRemoteFile the name of the file to be created on the FTP server. It should be a relative path on the FTP server.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def FTPUploadDirectly(FTPServer: String, localFile: String, FTPRemoteFile: String): Boolean = js.native
  def FTPUploadDirectly(
    FTPServer: String,
    localFile: String,
    FTPRemoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def FTPUploadDirectly(
    FTPServer: String,
    localFile: String,
    FTPRemoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Uploads the image of a specified index in the buffer to the FTP server as a specified image format.
    * @method WebTwain#FTPUploadEx
    * @param {string} FTPServer the name of the FTP server.
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {string} FTPRemoteFile the name of the file to be created on the FTP server. It should be a relative path on the FTP server.
    * @param {EnumDWT_ImageType} lImageType the image format of the file to be created on the FTP server.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def FTPUploadEx(FTPServer: String, sImageIndex: Double, FTPRemoteFile: String, lImageType: EnumDWTImageType): Boolean = js.native
  def FTPUploadEx(
    FTPServer: String,
    sImageIndex: Double,
    FTPRemoteFile: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def FTPUploadEx(
    FTPServer: String,
    sImageIndex: Double,
    FTPRemoteFile: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Sets the Source to eject the current page and advance the next page in the document feeder into the feeder acquire area when IfFeederEnabled is TRUE.
    * @method WebTwain#FeedPage
    * @return {boolean}
    */
  def FeedPage(): Boolean = js.native
  /**
    * Check whether a certain file exists on the local disk.
    * @method WebTwain#FileExists
    * @param {string} localFile specifies the absolute path of the local file.
    * @return {boolean}
    */
  def FileExists(localFile: String): Boolean = js.native
  def FilterImagesByTag(tagName: String): Boolean = js.native
  /**
    * Flips the image of a specified index in buffer.
    * @method WebTwain#Flip
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def Flip(sImageIndex: Double): Boolean = js.native
  /**
    * Get the cap item value of the capability specified by Capability property, when the value of the CapType property is TWON_ARRAY or TWON_ENUMERATION.
    * @method WebTwain#GetCapItems
    * @param {number} index Index is 0-based. It is the index of the cap item.
    * @return {number}
    */
  def GetCapItems(index: Double): Double = js.native
  /**
    * Returns the cap item value of the capability specified by Capability property, when the value of the CapType property is TWON_ARRAY or TWON_ENUMERATION.
    * @method WebTwain#GetCapItemsString
    * @param {number} index Index is 0-based. It is the index of the cap item.
    * @return {string}
    */
  def GetCapItemsString(index: Double): String = js.native
  // Get custom DS data, and save the data to the specified file
  /**
    * Gets custom DS data and save the data in a specified file.
    * @method WebTwain#GetCustomDSData
    * @param {string} fileName  the path of the file used for storing custom DS data.
    * @return {boolean}
    */
  def GetCustomDSData(fileName: String): Boolean = js.native
  // Get custom DS data, and returned string  is encoded with base64
  /**
    * Gets custom DS data, the returned string is base64 encoded.
    * @method WebTwain#GetCustomDSDataEx
    * @return {string | boolean}
    */
  def GetCustomDSDataEx(): String | Boolean = js.native
  /**
    * Retrieve the device type of the currently selected data source, it might be a scanner, a web camera, etc.
    * @method WebTwain#GetDeviceType
    * @return {number | boolean}
    */
  def GetDeviceType(): Double | Boolean = js.native
  /**
    * Returns the pixel bit depth of the selected image.
    * @method WebTwain#GetImageBitDepth
    * @param {number} sImageIndex specifies the index of image. The index is 0-based.
    * @return {number}
    */
  def GetImageBitDepth(sImageIndex: Double): Double = js.native
  /**
    * Returns the height (pixels) of the selected image. This is a read-only property.
    * @method WebTwain#GetImageHeight
    * @param {number} sImageIndex specifies the index of image. The index is 0-based.
    * @return {number}
    */
  def GetImageHeight(sImageIndex: Double): Double = js.native
  /**
    * Returns the direct URL of an image specified by index, if iWidth and iHeight are not specified, you get the original image, otherwise you get the image with specified iWidth or iHeight while keeping the same aspect ratio. The returned string is like this 'dwt://dwt_trial_13000404/img?id=306159652&index=0&t=1502184632022'
    * @method WebTwain#GetImagePartURL
    * @param {number} index the index of the image.
    * @param {number} iWidth the width of the image, it must be 150 or bigger
    * @param {number} iHeight the height of the image, it must be 150 or bigger
    * @return {string}
    */
  def GetImagePartURL(index: Double): String = js.native
  def GetImagePartURL(index: Double, iWidth: Double): String = js.native
  def GetImagePartURL(index: Double, iWidth: Double, iHeight: Double): String = js.native
  /**
    * Returns the file size of the new image resized from the image of a specified index in buffer.
    * @method WebTwain#GetImageSize
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {number} iWidth specifies the pixel width of the new image.
    * @param {number} iHeight specifies the pixel height of the new image.
    * @return {number}
    */
  def GetImageSize(sImageIndex: Double, iWidth: Double, iHeight: Double): Double = js.native
  /**
    * Pre-calculate the file size of the local image file that is saved from an image of a specified index in buffer.
    * @method WebTwain#GetImageSizeWithSpecifiedType
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {EnumDWT_ImageType} sImageType specifies the type of an image file..
    * @return {number}
    */
  def GetImageSizeWithSpecifiedType(sImageIndex: Double, sImageType: EnumDWTImageType): Double = js.native
  /**
    * Returns the direct URL of an image specified by index, if iWidth or iHeight is set to -1, you get the original image, otherwise you get the image with specified iWidth or iHeight while keeping the same aspect ratio.
    * @method WebTwain#GetImageURL
    * @param {number} index the index of the image.
    * @param {number} iWidth the width of the image.
    * @param {number} iHeight the height of the image.
    * @return {string}
    */
  def GetImageURL(index: Double, iWidth: Double, iHeight: Double): String = js.native
  /**
    * Returns the width (pixels) of the selected image. This is a read-only property.
    * @method WebTwain#GetImageWidth
    * @param {number} sImageIndex specifies the index of image. The index is 0-based.
    * @return {number}
    */
  def GetImageWidth(sImageIndex: Double): Double = js.native
  /**
    * Return the horizontal resolution of the specified image.
    * @method WebTwain#GetImageXResolution
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @return {number}
    */
  def GetImageXResolution(sImageIndex: Double): Double = js.native
  /**
    * Return the vertical resolution of the specified image.
    * @method WebTwain#GetImageYResolution
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @return {number}
    */
  def GetImageYResolution(sImageIndex: Double): Double = js.native
  /**
    * Return the runtime license info.
    * @method WebTwain#GetLicenseInfo
    */
  def GetLicenseInfo(): AnonDetail = js.native
  /**
    * Returns the index of the selected image.
    * @method WebTwain#GetSelectedImageIndex
    * @param {number} sSelectedIndex specifies the index of the selected image.
    * @return {number}
    */
  def GetSelectedImageIndex(sSelectedIndex: Double): Double = js.native
  /**
    * Pre-calculate the file size of the local image file that is saved from the selected images in buffer.
    * @method WebTwain#GetSelectedImagesSize
    * @param {EnumDWT_ImageType} iImageType specifies the type of an image file.
    * @return {number}
    */
  def GetSelectedImagesSize(iImageType: EnumDWTImageType): Double = js.native
  /**
    * Check the skew angle of an image by its index in buffer.
    * @method WebTwain#GetSkewAngle
    * @param {number} sImageIndex the index of the image in the buffer.
    * @return {number}
    */
  def GetSkewAngle(sImageIndex: Double): Double = js.native
  /**
    * Check the skew angle of a rectangular part of an image by its index in buffer.
    * @method WebTwain#GetSkewAngleEx
    * @param {number} sImageIndex the index of the image in the buffer.
    * @param {number} left specifies the x-coordinate of the upper-left corner of the rectangle.
    * @param {number} top specifies the y-coordinate of the upper-left corner of the rectangle.
    * @param {number} right specifies the x-coordinate of the lower-right corner of the rectangle.
    * @param {number} bottom specifies the y-coordinate of the lower-right corner of the rectangle.
    * @return {number}
    */
  def GetSkewAngleEx(sImageIndex: Double, left: Double, top: Double, right: Double, bottom: Double): Double = js.native
  /**
    * Get the source name according to the source index.
    * @method WebTwain#GetSourceNameItems
    * @param {number} index number index. Index is 0-based and can not be greater than SourceCount property.
    * @return {string}
    */
  def GetSourceNameItems(index: Double): String = js.native
  /*ignored
    GetSourceNames
    GetSourceType
    GetVersionInfoAsync
    */
  /**
    * Downloads an image from the HTTP server.
    * @method WebTwain#HTTPDownload
    * @param {string} HTTPServer the name of the HTTP server.
    * @param {string} HTTPRemoteFile the name of the image to be downloaded. It should be the relative path of the file on the HTTP server.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the download fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def HTTPDownload(HTTPServer: String, HTTPRemoteFile: String): Boolean = js.native
  def HTTPDownload(HTTPServer: String, HTTPRemoteFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def HTTPDownload(
    HTTPServer: String,
    HTTPRemoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Directly downloads a file from the HTTP server to a local disk without loading it into Dynamic Web TWAIN.
    * @method WebTwain#HTTPDownloadDirectly
    * @param {string} HTTPServer the name of the HTTP server.
    * @param {string} HTTPRemoteFile The relative path of the file on the HTTP server.
    * @param {string} localFile specify the location to store the downloaded file.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the download fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def HTTPDownloadDirectly(HTTPServer: String, HTTPRemoteFile: String, localFile: String): Boolean = js.native
  def HTTPDownloadDirectly(
    HTTPServer: String,
    HTTPRemoteFile: String,
    localFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def HTTPDownloadDirectly(
    HTTPServer: String,
    HTTPRemoteFile: String,
    localFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Downloads an image from the HTTP server.
    * @method WebTwain#HTTPDownloadEx
    * @param {string} HTTPServer the name of the HTTP server.
    * @param {string} HTTPRemoteFile the relative path of the file on the HTTP server, or path to an action page (with necessary parameters) which gets and sends back the image stream to the client (please check the sample for more info)
    * @param {EnumDWT_ImageType} lImageType the image format of the file to be downloaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the download fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def HTTPDownloadEx(HTTPServer: String, HTTPRemoteFile: String, lImageType: EnumDWTImageType): Boolean = js.native
  def HTTPDownloadEx(
    HTTPServer: String,
    HTTPRemoteFile: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def HTTPDownloadEx(
    HTTPServer: String,
    HTTPRemoteFile: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /*ignored
    HTTPDownloadStreamThroughPost
    HTTPDownloadThroughGet
    */
  /**
    *  Download an image from the server using a HTTP Post call.
    * @method WebTwain#HTTPDownloadThroughPost
    * @param {string} HTTPServer the name of the HTTP server.
    * @param {string} HTTPRemoteFile the relative path of the file on the HTTP server, or path to an action page (with necessary parameters) which gets and sends back the image stream to the client (please check the sample for more info)
    * @param {EnumDWT_ImageType} lImageType the image format of the file to be downloaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the download fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def HTTPDownloadThroughPost(HTTPServer: String, HTTPRemoteFile: String, lImageType: EnumDWTImageType): Boolean = js.native
  def HTTPDownloadThroughPost(
    HTTPServer: String,
    HTTPRemoteFile: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def HTTPDownloadThroughPost(
    HTTPServer: String,
    HTTPRemoteFile: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function3[
      /* errorCode */ Double, 
      /* errorString */ String, 
      /* httppostresponsestring */ String, 
      Unit
    ]
  ): Boolean = js.native
  /**
    * Uploads just a form created by SetHTTPFormField and SetHTTPHeader
    * @method WebTwain#HTTPUpload
    * @param {string} url the url where the images are sent in a POST request.
    * @param {function} asyncSuccessFunc the function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} asyncFailureFunc the function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def HTTPUpload(
    url: String,
    asyncSuccessFunc: js.Function1[/* httppostresponsestring */ String, Unit],
    asyncFailureFunc: js.Function3[
      /* errorCode */ Double, 
      /* errorString */ String, 
      /* httppostresponsestring */ String, 
      Unit
    ]
  ): Boolean = js.native
  /**
    * Uploads the images specified by the indices to the HTTP server.
    * @method WebTwain#HTTPUpload
    * @param {string} url the url where the images are sent in a POST request.
    * @param {Array} indices indices specifies which images are to be uploaded.
    * @param {EnumDWT_ImageType} enumImageType the image format in which the images are to be uploaded.
    * @param {EnumDWT_UploadDataFormat} dataFormat whether to upload the images as binary or a base64-based string.
    * @param {function} asyncSuccessFunc the function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} asyncFailureFunc the function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def HTTPUpload(
    url: String,
    indices: js.Array[Double],
    enumImageType: EnumDWTImageType,
    dataFormat: EnumDWTUploadDataFormat,
    asyncSuccessFunc: js.Function1[/* httppostresponsestring */ String, Unit],
    asyncFailureFunc: js.Function3[
      /* errorCode */ Double, 
      /* errorString */ String, 
      /* httppostresponsestring */ String, 
      Unit
    ]
  ): Boolean = js.native
  /**
    * Uploads all images in the buffer to the HTTP server through the HTTP Post method as a Multi-Page TIFF.
    * @method WebTwain#HTTPUploadAllThroughPostAsMultiPageTIFF
    * @param {string} HTTPServer  the name of the HTTP server.
    * @param {string} ActionPage the specified page for posting image files. This is the relative path of the page, not the absolute path. For example: "upload.asp", not "http://www.webserver.com/upload.asp".
    * @param {string} fileName the name of the image to be uploaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnHttpUploadSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnHttpUploadFailure.
    * @return {boolean}
    */
  def HTTPUploadAllThroughPostAsMultiPageTIFF(HTTPServer: String, ActionPage: String, fileName: String): Boolean = js.native
  def HTTPUploadAllThroughPostAsMultiPageTIFF(
    HTTPServer: String,
    ActionPage: String,
    fileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def HTTPUploadAllThroughPostAsMultiPageTIFF(
    HTTPServer: String,
    ActionPage: String,
    fileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function3[
      /* errorCode */ Double, 
      /* errorString */ String, 
      /* httppostresponsestring */ String, 
      Unit
    ]
  ): Boolean = js.native
  /**
    * Uploads all images in the buffer to the HTTP server through HTTP Post method as a Multi-Page PDF.
    * @method WebTwain#HTTPUploadAllThroughPostAsPDF
    * @param {string} HTTPServer  the name of the HTTP server.
    * @param {string} ActionPage the specified page for posting image files. This is the relative path of the page, not the absolute path. For example: "upload.asp", not "http://www.webserver.com/upload.asp".
    * @param {string} fileName the name of the image to be uploaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnHttpUploadSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnHttpUploadFailure.
    * @return {boolean}
    */
  def HTTPUploadAllThroughPostAsPDF(HTTPServer: String, ActionPage: String, fileName: String): Boolean = js.native
  def HTTPUploadAllThroughPostAsPDF(
    HTTPServer: String,
    ActionPage: String,
    fileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def HTTPUploadAllThroughPostAsPDF(
    HTTPServer: String,
    ActionPage: String,
    fileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function3[
      /* errorCode */ Double, 
      /* errorString */ String, 
      /* httppostresponsestring */ String, 
      Unit
    ]
  ): Boolean = js.native
  /**
    * [Deprecated.] Uploads all images in the buffer to the HTTP server through the HTTP Put method as a Multi-Page TIFF.
    * @method WebTwain#HTTPUploadAllThroughPutAsMultiPageTIFF
    * @param {string} HTTPServer the name of the HTTP server.
    * @param {string} RemoteFileName the name of the image to be uploaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def HTTPUploadAllThroughPutAsMultiPageTIFF(HTTPServer: String, RemoteFileName: String): Boolean = js.native
  def HTTPUploadAllThroughPutAsMultiPageTIFF(HTTPServer: String, RemoteFileName: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def HTTPUploadAllThroughPutAsMultiPageTIFF(
    HTTPServer: String,
    RemoteFileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * [Deprecated.] Uploads all images in the buffer to the HTTP server through the HTTP Put method as a Multi-Page PDF.
    * @method WebTwain#HTTPUploadAllThroughPutAsPDF
    * @param {string} HTTPServer the name of the HTTP server.
    * @param {string} RemoteFileName the name of the image to be uploaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def HTTPUploadAllThroughPutAsPDF(HTTPServer: String, RemoteFileName: String): Boolean = js.native
  def HTTPUploadAllThroughPutAsPDF(HTTPServer: String, RemoteFileName: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def HTTPUploadAllThroughPutAsPDF(
    HTTPServer: String,
    RemoteFileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /*ignored
    HTTPUploadStreamThroughPost
    */
  /**
    * Uploads the image of a specified index in the buffer to the HTTP server through the HTTP POST method.
    * @method WebTwain#HTTPUploadThroughPost
    * @param {string} HTTPServer the name of the HTTP server.
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {string} ActionPage the specified page for posting image files. This is the relative path of the page, not the absolute path. For example: "upload.asp", not "http://www.webserver.com/upload.asp".
    * @param {string} fileName the name of the image to be uploaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnHttpUploadSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnHttpUploadFailure.
    * @return {boolean}
    */
  def HTTPUploadThroughPost(HTTPServer: String, sImageIndex: Double, ActionPage: String, fileName: String): Boolean = js.native
  def HTTPUploadThroughPost(
    HTTPServer: String,
    sImageIndex: Double,
    ActionPage: String,
    fileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def HTTPUploadThroughPost(
    HTTPServer: String,
    sImageIndex: Double,
    ActionPage: String,
    fileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function3[
      /* errorCode */ Double, 
      /* errorString */ String, 
      /* httppostresponsestring */ String, 
      Unit
    ]
  ): Boolean = js.native
  /**
    * Uploads the selected images in the buffer to the HTTP server through the HTTP Post method as a Multi-Page PDF.
    * @method WebTwain#HTTPUploadThroughPostAsMultiPagePDF
    * @param {string} HTTPServer  the name of the HTTP server.
    * @param {string} ActionPage the specified page for posting image files. This is the relative path of the page, not the absolute path. For example: "upload.asp", not "http://www.webserver.com/upload.asp".
    * @param {string} fileName the name of the image to be uploaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnHttpUploadSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnHttpUploadFailure.
    * @return {boolean}
    */
  def HTTPUploadThroughPostAsMultiPagePDF(HTTPServer: String, ActionPage: String, fileName: String): Boolean = js.native
  def HTTPUploadThroughPostAsMultiPagePDF(
    HTTPServer: String,
    ActionPage: String,
    fileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def HTTPUploadThroughPostAsMultiPagePDF(
    HTTPServer: String,
    ActionPage: String,
    fileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function3[
      /* errorCode */ Double, 
      /* errorString */ String, 
      /* httppostresponsestring */ String, 
      Unit
    ]
  ): Boolean = js.native
  /**
    * Uploads the selected images in the buffer to the HTTP server through the HTTP Post method as a Multi-Page TIFF.
    * @method WebTwain#HTTPUploadThroughPostAsMultiPageTIFF
    * @param {string} HTTPServer  the name of the HTTP server.
    * @param {string} ActionPage the specified page for posting image files. This is the relative path of the page, not the absolute path. For example: "upload.asp", not "http://www.webserver.com/upload.asp".
    * @param {string} fileName the name of the image to be uploaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnHttpUploadSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnHttpUploadFailure.
    * @return {boolean}
    */
  def HTTPUploadThroughPostAsMultiPageTIFF(HTTPServer: String, ActionPage: String, fileName: String): Boolean = js.native
  def HTTPUploadThroughPostAsMultiPageTIFF(
    HTTPServer: String,
    ActionPage: String,
    fileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def HTTPUploadThroughPostAsMultiPageTIFF(
    HTTPServer: String,
    ActionPage: String,
    fileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function3[
      /* errorCode */ Double, 
      /* errorString */ String, 
      /* httppostresponsestring */ String, 
      Unit
    ]
  ): Boolean = js.native
  /**
    * Directly upload a specific local file to the HTTP server through the HTTP POST method without loading it into Dynamic Web TWAIN.
    * @method WebTwain#HTTPUploadThroughPostDirectly
    * @param {string} HTTPServer the name of the HTTP server.
    * @param {string} localFile specifies the path of a local file .
    * @param {string} ActionPage the specified page for posting files. This is the relative path of the page, not the absolute path. For example: "upload.asp", not "http://www.webserver.com/upload.asp".
    * @param {string} fileName the name of the file to be uploaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnHttpUploadSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnHttpUploadFailure.
    * @return {boolean}
    */
  def HTTPUploadThroughPostDirectly(HTTPServer: String, localFile: String, ActionPage: String, fileName: String): Boolean = js.native
  def HTTPUploadThroughPostDirectly(
    HTTPServer: String,
    localFile: String,
    ActionPage: String,
    fileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def HTTPUploadThroughPostDirectly(
    HTTPServer: String,
    localFile: String,
    ActionPage: String,
    fileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function3[
      /* errorCode */ Double, 
      /* errorString */ String, 
      /* httppostresponsestring */ String, 
      Unit
    ]
  ): Boolean = js.native
  /**
    * Uploads the image of a specified index in the buffer to the HTTP server as a specified image format through the HTTP POST method.
    * @method WebTwain#HTTPUploadThroughPostEx
    * @param {string} HTTPServer  the name of the HTTP server.
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {string} ActionPage the specified page for posting image files. This is the relative path of the page, not the absolute path. For example: "upload.asp", not "http://www.webserver.com/upload.asp".
    * @param {string} fileName the name of the image to be uploaded.
    * @param {EnumDWT_ImageType} lImageType the image format of the file to be created on the HTTP server.s
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnHttpUploadSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnHttpUploadFailure.
    * @return {boolean}
    */
  def HTTPUploadThroughPostEx(
    HTTPServer: String,
    sImageIndex: Double,
    ActionPage: String,
    fileName: String,
    lImageType: EnumDWTImageType
  ): Boolean = js.native
  def HTTPUploadThroughPostEx(
    HTTPServer: String,
    sImageIndex: Double,
    ActionPage: String,
    fileName: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def HTTPUploadThroughPostEx(
    HTTPServer: String,
    sImageIndex: Double,
    ActionPage: String,
    fileName: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function3[
      /* errorCode */ Double, 
      /* errorString */ String, 
      /* httppostresponsestring */ String, 
      Unit
    ]
  ): Boolean = js.native
  /**
    * [Deprecated.] Uploads the image of a specified index in the buffer to the HTTP server through the HTTP PUT method.
    * @method WebTwain#HTTPUploadThroughPut
    * @param {string} HTTPServer the name of the HTTP server.
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {string} RemoteFileName the name of the image to be created on the HTTP server. It should a relative path on the web server.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def HTTPUploadThroughPut(HTTPServer: String, sImageIndex: Double, RemoteFileName: String): Boolean = js.native
  def HTTPUploadThroughPut(
    HTTPServer: String,
    sImageIndex: Double,
    RemoteFileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def HTTPUploadThroughPut(
    HTTPServer: String,
    sImageIndex: Double,
    RemoteFileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * [Deprecated.] Uploads the selected images in the buffer to the HTTP server through the HTTP Put method as a Multi-Page PDF.
    * @method WebTwain#HTTPUploadThroughPutAsMultiPagePDF
    * @param {string} HTTPServer the name of the HTTP server.
    * @param {string} RemoteFileName the name of the image to be uploaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def HTTPUploadThroughPutAsMultiPagePDF(HTTPServer: String, RemoteFileName: String): Boolean = js.native
  def HTTPUploadThroughPutAsMultiPagePDF(HTTPServer: String, RemoteFileName: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def HTTPUploadThroughPutAsMultiPagePDF(
    HTTPServer: String,
    RemoteFileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * [Deprecated.] Uploads the selected images in the buffer to the HTTP server through the HTTP Put method as a Multi-Page TIFF.
    * @method WebTwain#HTTPUploadThroughPutAsMultiPageTIFF
    * @param {string} HTTPServer the name of the HTTP server.
    * @param {string} RemoteFileName the name of the image to be uploaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def HTTPUploadThroughPutAsMultiPageTIFF(HTTPServer: String, RemoteFileName: String): Boolean = js.native
  def HTTPUploadThroughPutAsMultiPageTIFF(HTTPServer: String, RemoteFileName: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def HTTPUploadThroughPutAsMultiPageTIFF(
    HTTPServer: String,
    RemoteFileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * [Deprecated.] Directly uploads a specific local file to the HTTP server through the HTTP PUT method without loading it into Dynamic Web TWAIN.
    * @method WebTwain#HTTPUploadThroughPutDirectly
    * @param {string} HTTPServer the name of the HTTP server.
    * @param {string} localFile specifies the path of a local file.
    * @param {string} RemoteFileName the name of the file to be created on the HTTP server. It should a relative path on the web server.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def HTTPUploadThroughPutDirectly(HTTPServer: String, localFile: String, RemoteFileName: String): Boolean = js.native
  def HTTPUploadThroughPutDirectly(
    HTTPServer: String,
    localFile: String,
    RemoteFileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def HTTPUploadThroughPutDirectly(
    HTTPServer: String,
    localFile: String,
    RemoteFileName: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * [Deprecated.] Uploads the image of a specified index in the buffer to the HTTP server as a specified image format through the HTTP PUT method.
    * @method WebTwain#HTTPUploadThroughPutEx
    * @param {string} HTTPServer the name of the HTTP server.
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {string} RemoteFileName the name of the file to be created on the HTTP server. It should a relative path on the web server.
    * @param {EnumDWT_ImageType} lImageType the image format of the file to be created on the HTTP server.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the upload succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the upload fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def HTTPUploadThroughPutEx(HTTPServer: String, sImageIndex: Double, RemoteFileName: String, lImageType: EnumDWTImageType): Boolean = js.native
  def HTTPUploadThroughPutEx(
    HTTPServer: String,
    sImageIndex: Double,
    RemoteFileName: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit]
  ): Boolean = js.native
  def HTTPUploadThroughPutEx(
    HTTPServer: String,
    sImageIndex: Double,
    RemoteFileName: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Converts the image ID of an image to its index.
    * [Version] Added in v15.0
    * @method WebTwain#ImageIDToIndex
    * @param {number} sImageID specifies the imageID.
    * @return {number}
    */
  def ImageIDToIndex(sImageID: Double): Double = js.native
  /**
    * Converts the index of an image to its image ID.
    * [Version] Added in v15.0
    * @method WebTwain#IndexToImageID
    * @param {number} sImageIndex specifies the index.
    * @return {number}
    */
  def IndexToImageID(sImageIndex: Double): Double = js.native
  /**
    * [Deprecated.] Detects whether an image is blank.
    * @method WebTwain#IsBlankImage
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def IsBlankImage(sImageIndex: Double): Boolean = js.native
  /**
    * [Deprecated.] Detects whether a certain area on an image is blank.
    * @method WebTwain#IsBlankImageEx
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {number} left specifies the x-coordinate of the upper-left corner of the rectangle.
    * @param {number} top specifies the y-coordinate of the upper-left corner of the rectangle.
    * @param {number} right specifies the x-coordinate of the lower-right corner of the rectangle.
    * @param {number} bottom specifies the y-coordinate of the lower-right corner of the rectangle.
    * @param {boolean} bFuzzyMatch specifies whether use fuzzy matching when detecting.
    * @return {boolean}
    */
  def IsBlankImageEx(
    sImageIndex: Double,
    left: Double,
    top: Double,
    right: Double,
    bottom: Double,
    bFuzzyMatch: Boolean
  ): Boolean = js.native
  /**
    * Detects whether a specific image is blank.
    * @method WebTwain#IsBlankImageExpress
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def IsBlankImageExpress(sImageIndex: Double): Boolean = js.native
  /**
    * Loads a DIB format image from Clipboard into the Dynamic Web TWAIN.
    * @method WebTwain#LoadDibFromClipboard
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the loading succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the loading fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def LoadDibFromClipboard(): Boolean = js.native
  def LoadDibFromClipboard(optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def LoadDibFromClipboard(
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Loads an image into the Dynamic Web TWAIN.
    * @method WebTwain#LoadImage
    * @param {string} localFile the name of the image to be loaded. It should be the absolute path of the image file on the local disk.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the loading succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the loading fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def LoadImage(localFile: String): Boolean = js.native
  def LoadImage(localFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def LoadImage(
    localFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Loads an image into the Dynamic Web TWAIN.
    * @method WebTwain#LoadImageEx
    * @param {string} localFile the name of the image to be loaded. It should be the absolute path of the image file on the local disk.
    * @param {EnumDWT_ImageType} lImageType the image format of the file to be loaded.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the loading succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the loading fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def LoadImageEx(localFile: String, lImageType: EnumDWTImageType): Boolean = js.native
  def LoadImageEx(localFile: String, lImageType: EnumDWTImageType, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def LoadImageEx(
    localFile: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Loads image from a base64 byte array with the specified file format.
    * @method WebTwain#LoadImageFromBase64Binary
    * @param {string} bry specifies the base64 string data.
    * @param {EnumDWT_ImageType} lImageType specifies the file format.
    * @return {boolean}
    */
  def LoadImageFromBase64Binary(bry: String, lImageType: EnumDWTImageType): Boolean = js.native
  def LoadImageFromBase64Binary(bry: String, lImageType: EnumDWTImageType, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def LoadImageFromBase64Binary(
    bry: String,
    lImageType: EnumDWTImageType,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * [Deprecated.] Loads image from a byte array with the specified file format.
    * @method WebTwain#LoadImageFromBytes
    * @param {number} lBufferSize Specifies the buffer size.
    * @param {Array} buffer A byte array of the image data.
    * @param {EnumDWT_ImageType} lImageType Specifies the file format.
    * @return {boolean}
    */
  def LoadImageFromBytes(lBufferSize: Double, buffer: js.Array[Double], lImageType: EnumDWTImageType): Boolean = js.native
  /**
    * Mirrors the image of a specified index in buffer.
    * @method WebTwain#Mirror
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def Mirror(sImageIndex: Double): Boolean = js.native
  /**
    * Moves a specified image.
    * @method WebTwain#MoveImage
    * @param {number} sSourceImageIndex Specifies the source index of image in buffer. The index is 0-based.
    * @param {number} sTargetImageIndex Specifies the target index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def MoveImage(sSourceImageIndex: Double, sTargetImageIndex: Double): Boolean = js.native
  /*ignored 
    OnRefreshUI
    */
  /**
    * Loads the specified Source into main memory and causes its initialization,
    * placing Dynamic Web TWAIN into Capability Negotiation state. If no source is
    * specified (no SelectSource() or SelectSourceByIndex() is called), opens the default source.
    * @method WebTwain#OpenSource
    * @return {boolean}
    */
  def OpenSource(): Boolean = js.native
  /**
    * Loads and opens Data Source Manager.
    * @method WebTwain#OpenSourceManager
    * @return {boolean}
    */
  def OpenSourceManager(): Boolean = js.native
  /**
    * Decorates image of a specified index in buffer with rectangles of transparent color.
    * @method WebTwain#OverlayRectangle
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {number} left specifies the x-coordinate of the upper-left corner of the rectangle.
    * @param {number} top specifies the y-coordinate of the upper-left corner of the rectangle.
    * @param {number} right specifies the x-coordinate of the lower-right corner of the rectangle.
    * @param {number} bottom specifies the y-coordinate of the lower-right corner of the rectangle.
    * @param {number} color Specifies the fill color of the rectangle. The byte-ordering of the RGB value is 0xBBGGRR. BB represents blue, GG represents green, RR represents red.
    * @param {number} fOpacity Specifies the opacity of the rectangle. The value represents opacity. 1.0 is 100% opaque and 0.0 is totally transparent.
    * @return {boolean}
    */
  def OverlayRectangle(
    sImageIndex: Double,
    left: Double,
    top: Double,
    right: Double,
    bottom: Double,
    color: Double,
    fOpacity: Double
  ): Boolean = js.native
  /**
    * Shows the GUI of Image Printer.
    * @method WebTwain#Print
    * @param {boolean} bUseSystemDefaultPrintUI specifies whether to use the system Print UI or not.
    * @return {boolean}
    */
  def Print(bUseSystemDefaultPrintUI: Boolean): Boolean = js.native
  /**
    * Binds a specified function to an event, so that the function gets called whenever the event fires.
    * @method WebTwain#RegisterEvent
    * @param {string} name the name of the event that the function is bound to.
    * @param {any} evt specifies the function to call when event fires.
    * @return {boolean}
    */
  def RegisterEvent(name: String, evt: js.Any): Boolean = js.native
  /**
    * Removes all images in buffer.
    * @method WebTwain#RemoveAllImages
    * @return {boolean}
    */
  def RemoveAllImages(): Boolean = js.native
  /**
    * Removes selected images in buffer.
    * @method WebTwain#RemoveAllSelectedImages
    * @return {boolean}
    */
  def RemoveAllSelectedImages(): Boolean = js.native
  /**
    * Removes the image of a specified index in buffer.
    * @method WebTwain#RemoveImage
    * @param {number} sImageIndexToBeDeleted  specifies the index of the image to be deleted  in buffer. The index is 0-based.
    * @return {boolean}
    */
  def RemoveImage(sImageIndexToBeDeleted: Double): Boolean = js.native
  /**
    * Reverts the current image layout to the Data Source's default.
    * @method WebTwain#ResetImageLayout
    * @return {boolean}
    */
  def ResetImageLayout(): Boolean = js.native
  /**
    * Sets the Source to return the current page to the input side of the document feeder and
    * feed the last page from the outside of the feeder back into the acquisition area if IfFeederEnabled is TRUE.
    * @method WebTwain#RewindPage
    * @return {boolean}
    */
  def RewindPage(): Boolean = js.native
  /**
    * Rotates the image of a specified index in buffer by specified angle.
    * @method WebTwain#Rotate
    * @param {number} sImageIndex  specifies the index of image in buffer. The index is 0-based.
    * @param {number} fAngle  Specifies the rotation angle.
    * @param {boolean} bKeepSize Keep size or not.
    * @return {boolean}
    */
  def Rotate(sImageIndex: Double, fAngle: Double, bKeepSize: Boolean): Boolean = js.native
  /**
    * Rotates the image of a specified index in buffer by specified angle.
    * @method WebTwain#RotateEx
    * @param {number} sImageIndex  specifies the index of image in buffer. The index is 0-based.
    * @param {number} fAngle  Specifies the rotation angle.
    * @param {boolean} bKeepSize Keep size or not.
    * @param {EnumDWT_InterpolationMethod} newVal specifies the method to do interpolation.
    * @return {boolean}
    */
  def RotateEx(sImageIndex: Double, fAngle: Double, bKeepSize: Boolean, newVal: EnumDWTInterpolationMethod): Boolean = js.native
  /**
    * Rotates the image of a specified index in buffer by 90 degrees counter-clockwise.
    * @method WebTwain#RotateLeft
    * @param {number} sImageIndex  specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def RotateLeft(sImageIndex: Double): Boolean = js.native
  /**
    * Rotates the image of a specified index in buffer by 90 degrees clockwise.
    * @method WebTwain#RotateRight
    * @param {number} sImageIndex  specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def RotateRight(sImageIndex: Double): Boolean = js.native
  /**
    * Saves all images in buffer as a MultiPage TIFF file.
    * @method WebTwain#SaveAllAsMultiPageTIFF
    * @param {string} localFile the name of the MultiPage TIFF file to be saved. It should be an absolute path on the local disk.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the saving succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the saving fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def SaveAllAsMultiPageTIFF(localFile: String): Boolean = js.native
  def SaveAllAsMultiPageTIFF(localFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def SaveAllAsMultiPageTIFF(
    localFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Saves all images in buffer as a Multi-Page PDF file.
    * @method WebTwain#SaveAllAsPDF
    * @param {string} localFile the name of the Multi-Page PDF file to be saved. It should be an absolute path on the local disk.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the saving succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the saving fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def SaveAllAsPDF(localFile: String): Boolean = js.native
  def SaveAllAsPDF(localFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def SaveAllAsPDF(
    localFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Saves the image of a specified index in buffer as a BMP file.
    * @method WebTwain#SaveAsBMP
    * @param {string} localFile the name of the BMP file to be saved. It should be an absolute path on the local disk.
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def SaveAsBMP(localFile: String, sImageIndex: Double): Boolean = js.native
  def SaveAsBMP(localFile: String, sImageIndex: Double, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def SaveAsBMP(
    localFile: String,
    sImageIndex: Double,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /*ignored
    SaveAsGIF
    */
  /**
    * Saves the image of a specified index in buffer as a JPEG file.
    * @method WebTwain#SaveAsJPEG
    * @param {string} localFile the name of the JPEG file to be saved. It should be an absolute path on the local disk.
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def SaveAsJPEG(localFile: String, sImageIndex: Double): Boolean = js.native
  def SaveAsJPEG(localFile: String, sImageIndex: Double, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def SaveAsJPEG(
    localFile: String,
    sImageIndex: Double,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Saves the image of a specified index in buffer as a PDF file.
    * @method WebTwain#SaveAsPDF
    * @param {string} localFile the name of the JPEG file to be saved. It should be an absolute path on the local disk.
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def SaveAsPDF(localFile: String, sImageIndex: Double): Boolean = js.native
  def SaveAsPDF(localFile: String, sImageIndex: Double, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def SaveAsPDF(
    localFile: String,
    sImageIndex: Double,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Saves the image of a specified index in buffer as a PNG file.
    * @method WebTwain#SaveAsPNG
    * @param {string} localFile the name of the JPEG file to be saved. It should be an absolute path on the local disk.
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def SaveAsPNG(localFile: String, sImageIndex: Double): Boolean = js.native
  def SaveAsPNG(localFile: String, sImageIndex: Double, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def SaveAsPNG(
    localFile: String,
    sImageIndex: Double,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Saves the image of a specified index in buffer as a TIFF file.
    * @method WebTwain#SaveAsTIFF
    * @param {string} localFile the name of the JPEG file to be saved. It should be an absolute path on the local disk.
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def SaveAsTIFF(localFile: String, sImageIndex: Double): Boolean = js.native
  def SaveAsTIFF(localFile: String, sImageIndex: Double, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def SaveAsTIFF(
    localFile: String,
    sImageIndex: Double,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Saves the selected images in buffer as a Multipage PDF file.
    * @method WebTwain#SaveSelectedImagesAsMultiPagePDF
    * @param {string} localFile  the name of the MultiPage PDF file to be saved. It should be an absolute path on the local disk.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the saving succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the saving fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def SaveSelectedImagesAsMultiPagePDF(localFile: String): Boolean = js.native
  def SaveSelectedImagesAsMultiPagePDF(localFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def SaveSelectedImagesAsMultiPagePDF(
    localFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Saves the selected images in buffer as a Multipage TIFF file.
    * @method WebTwain#SaveSelectedImagesAsMultiPageTIFF
    * @param {string} localFile  the name of the MultiPage TIFF file to be saved. It should be an absolute path on the local disk.
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the saving succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the saving fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def SaveSelectedImagesAsMultiPageTIFF(localFile: String): Boolean = js.native
  def SaveSelectedImagesAsMultiPageTIFF(localFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def SaveSelectedImagesAsMultiPageTIFF(
    localFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Boolean = js.native
  /**
    * Saves the selected images in buffer to base64 string.
    * @method WebTwain#SaveSelectedImagesToBase64Binary
    * @return {string|boolean}
    */
  def SaveSelectedImagesToBase64Binary(): String | Boolean = js.native
  def SaveSelectedImagesToBase64Binary(optionalAsyncSuccessFunc: js.Function1[/* result */ js.Array[String], Unit]): String | Boolean = js.native
  def SaveSelectedImagesToBase64Binary(
    optionalAsyncSuccessFunc: js.Function1[/* result */ js.Array[String], Unit],
    optionalAsyncFailureFunc: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): String | Boolean = js.native
  /**
    * [Deprecated.] Saves the selected images in buffer to a byte array in the specified file format.
    * @method WebTwain#SaveSelectedImagesToBytes
    * @param {number} bufferSize specified the buffer size.
    * @param {Array} buffer A byte array of the image data.
    * @return {number}
    */
  def SaveSelectedImagesToBytes(bufferSize: Double, buffer: js.Array[Double]): Double = js.native
  /**
    * Brings up the TWAIN Data Source Manager's Source Selection User Interface (UI)
    * so that user can choose which Data Source to be the current Source.
    * @method WebTwain#SelectSource
    * @return {boolean}
    */
  def SelectSource(): Boolean = js.native
  def SelectSource(optionalAsyncSuccessFunc: js.Function0[Unit]): Boolean = js.native
  def SelectSource(optionalAsyncSuccessFunc: js.Function0[Unit], optionalAsyncFailureFunc: js.Function0[Unit]): Boolean = js.native
  /**
    * Selects the index-the source in SourceNameItems property as the current source.
    * @method WebTwain#SelectSourceByIndex
    * @param {number} index It is the index of SourceNameItems property.
    * @return {boolean}
    */
  def SelectSourceByIndex(index: Double): Boolean = js.native
  /*ignored
    SetCancel
    */
  /**
    * Set the value of the specified cap item.
    * @method WebTwain#SetCapItems
    * @param {number} index Index is 0-based. It is the index of the cap item.
    * @param {number} newVal For string type, please use CapItemsstring property.
    * @return {void}
    */
  def SetCapItems(index: Double, newVal: Double): Unit = js.native
  /**
    * Set the cap item value of the capability specified by Capability property, when the value of the CapType property is TWON_ARRAY or TWON_ENUMERATION.
    * @method WebTwain#SetCapItemsString
    * @param {number} index Index is 0-based. It is the index of the cap item.
    * @param {string} newVal The new value to be set.
    * @return {void}
    */
  def SetCapItemsString(index: Double, newVal: String): Unit = js.native
  /**
    * [Deprecated.] Sets current cookie into the Http Header to be used when uploading scanned images through POST.
    * @method WebTwain#SetCookie
    * @param {string} cookie  the cookie on current page.
    * @return {void}
    */
  def SetCookie(cookie: String): Unit = js.native
  //  Set custom DS data, load data from the specified file
  /**
    * Sets custom DS data to be used for scanning, the data is stored in a file. Custom DS data means a specific scanning profile.
    * @method WebTwain#SetCustomDSData
    * @param {string} fileName the absolute path of the file where the custom data source data is stored.
    * @return {boolean}
    */
  def SetCustomDSData(fileName: String): Boolean = js.native
  //  Set custom DS data (DAT_CUSTOMDSDATA), the input string is encoded with base64
  /**
    * Sets custom DS data to be used for scanning, the input string is encoded with base64. Custom DS data means a specific scanning profile.
    * @method WebTwain#SetCustomDSDataEx
    * @param {string} value the input string which is encoded with base64.
    * @return {boolean}
    */
  def SetCustomDSDataEx(value: String): Boolean = js.native
  /**
    * Change the DPI (dots per inch) for the specified image.
    * @method WebTwain#SetDPI
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {number} xResolution The horizontal resolution.
    * @param {number} yResolution The vertical resolution.
    * @param {boolean} bResampleImage Whether to resample the image. (The image size will be changed if this is set to true).
    * @param {EnumDWT_InterpolationMethod} newVal specifies the method to do interpolation.
    * @return {boolean}
    */
  def SetDPI(
    sImageIndex: Double,
    xResolution: Double,
    yResolution: Double,
    bResampleImage: Boolean,
    newVal: EnumDWTInterpolationMethod
  ): Boolean = js.native
  def SetDefaultTag(tagName: String): Boolean = js.native
  /**
    * Sets file name and file format information used in File Transfer Mode.
    * @method WebTwain#SetFileXferInfo
    * @param {string} fileName the name of the file to be used in transfer.
    * @param {EnumDWT_FileFormat} fileFormat an enumerated value indicates the format of the image.
    * @return {boolean}
    */
  def SetFileXferInfo(fileName: String, fileFormat: EnumDWTFileFormat): Boolean = js.native
  /**
    * Sets a text parameter as a filed in a web form. This form is maintained by the component itself (meaning it's not on the page). All fields in this form will be passed to the server when uploading images.
    * @method WebTwain#SetHTTPFormField
    * @param {string} FieldName specifies the name of a text field in web form.
    * @param {string} FieldValue specifies the value of a text field in web form.
    * @return {boolean}
    */
  def SetHTTPFormField(FieldName: String, FieldValue: String): Boolean = js.native
  /**
    * Sets a text parameter as a filed in a web form. This form is maintained by the component itself (meaning it's not on the page). All fields in this form will be passed to the server when uploading images.
    * @method WebTwain#SetHTTPFormField
    * @param {string} FieldName specifies the name of the field which could later be used to retrieve the blob
    * @param {Blob} blobValue specifies the blob to be put in the form.
    * @param {string} optionalFileName specifies the file name for the blob
    * @return {boolean}
    */
  def SetHTTPFormField(FieldName: String, blobValue: Blob): Boolean = js.native
  def SetHTTPFormField(FieldName: String, blobValue: Blob, optionalFileName: String): Boolean = js.native
  /**
    * Sets a header for the current HTTP Post request.
    * @method WebTwain#SetHTTPHeader
    * @param {string} key the key of the header.
    * @param {string} value the value of the header.
    * @return {boolean}
    */
  def SetHTTPHeader(key: String, value: String): Boolean = js.native
  /**
    * Sets the left, top, right, and bottom sides of the image layout rectangle for the current Data Source.
    * @method WebTwain#SetImageLayout
    * @param {number} left specifies the floating point number for the left side of the image layout rectangle.
    * @param {number} top specifies the floating point number for the top side of the image layout rectangle.
    * @param {number} right specifies the floating point number for the right side of the image layout rectangle.
    * @param {number} bottom specifies the floating point number for the bottom side of the image layout rectangle.
    * @return {boolean}
    */
  def SetImageLayout(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  /**
    * Change the width of an image in buffer.
    * @method WebTwain#SetImageWidth
    * @param {number} sImageIndex  specifies which image you'd like to change.
    * @param {number} iNewWidth specifies how wide you'd like to change the image.
    * @return {boolean}
    */
  def SetImageWidth(sImageIndex: Double, iNewWidth: Double): Boolean = js.native
  /**
    * Set the language for the authorization dialogs.
    * @method WebTwain#SetLanguage
    * @param {EnumDWT_Language} language  specify the language
    * @return {boolean}
    */
  def SetLanguage(language: EnumDWTLanguage): Boolean = js.native
  /**
    * Sets the time-out used to open a specified Data Source.
    * @method WebTwain#SetOpenSourceTimeout
    * @param {number} iMilliseconds specifies the number of milliseconds.
    * @return {boolean}
    */
  def SetOpenSourceTimeout(iMilliseconds: Double): Boolean = js.native
  /**
    * Draws a rectangle on the viewer which represents the selected area.
    * @method WebTwain#SetSelectedImageArea
    * @param {number} sImageIndex specifies the index of image in buffer. The index is 0-based.
    * @param {number} left The X axis of the left border.
    * @param {number} top The Y axis of the top border.
    * @param {number} right The X axis of the right border.
    * @param {number} bottom The Y axis of the bottom border.
    * @return {boolean}
    */
  def SetSelectedImageArea(sImageIndex: Double, left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  /**
    * You can use the method to select images programatically which is ususally done by mouse clicking.
    * @method WebTwain#SetSelectedImageIndex
    * @param {number} sSelectedIndex this is the index of an array that holds the indices of selected images.
    * @param {number} newVal specifies the index of an image that you want to select.
    * @return {boolean}
    */
  def SetSelectedImageIndex(selectedIndex: Double, newVal: Double): Boolean = js.native
  /**
    * Sets a custom tiff tag. Currently you can set up to 32 tags. The string to be set in a tag can be encoded with base64.
    * @method WebTwain#SetTiffCustomTag
    * @param {number} tag specifies the tag identifier. The value should be between 600 and 700.
    * @param {string} content the string to be set for this tag. The string will be written to the .tiff file when you save/upload it. If the string is base64 encoded, we'll decode it before writing it.
    * @param {boolean} base64Str if you'd like to encode the string with base64, set this to true. Otherwise, the string will be plin text.
    * @return {boolean}
    */
  def SetTiffCustomTag(tag: Double, content: String, base64Str: Boolean): Boolean = js.native
  /**
    * Configures how segmented upload is done.
    * @method WebTwain#SetUploadSegment
    * @param {number} segmentUploadThreshold specifies the threshold (in MB) over which segmented upload will be invoked.
    * @param {number} moduleSize specifies the size of each segment (in KB).
    * @return {boolean}
    */
  def SetUploadSegment(segmentUploadThreshold: Double, moduleSize: Double): Boolean = js.native
  /**
    * Sets the view mode that images are displayed in Dynamic Web TWAIN. You can use this method to display multiple images in Dynamic Web TWAIN.
    * @method WebTwain#SetViewMode
    * @param {number} sHorizontalImageCount  specifies how many columns can be displayed in Dynamic Web TWAIN.
    * @param {number} sVerticalImageCount specifies how many rows can be displayed in Dynamic Web TWAIN..
    * @return {void}
    */
  def SetViewMode(sHorizontalImageCount: Double, sVerticalImageCount: Double): Unit = js.native
  /**
    * Show save file dialog or show open file dialog.
    * @method WebTwain#ShowFileDialog
    * @param {boolean} SaveDialog True -- show save file dialog, False -- show open file dialog.
    * @param {string} Filter The filter name specifies the filter pattern (for example, "*.TXT"). To specify multiple filter patterns for a single display string, use a semicolon to separate the patterns (for example, "*.TXT;*.DOC;*.BAK"). A pattern string can be a combination of valid file name characters and the asterisk (*) wildcard character. Do not include spaces in the pattern string. To retrieve a shortcut's target without filtering, use the string "All Files\0*.*\0\0", but the program will replace  "\0" with "|" automatically.
    * @param {number} FilterIndex The index of the currently selected filter in the File Types control. The buffer pointed to by Filter contains pairs of strings that define the filters. The index is 0-based.
    * @param {string} DefExtension Define the default extension. GetOpenFileName and GetSaveFileName append this extension to the file name only if the user fails to type an extension. If this member is NULL and the user fails to type an extension, no extension is appended.
    * @param {string} InitialDir The initial directory. The algorithm for selecting the initial directory varies on different platforms.
    * @param {boolean} AllowMultiSelect True -- allows users to select more than one file, False -- only allows to select one file.
    * @param {boolean} OverwritePrompt True -- If a file already exists with the same name, the old file will be simply overwritten, False -- not allows to save and overwrite a same name file.
    * @param {number} Flags If this parameter equals 0, the program will be initiated with the default flags, otherwise initiated with the cumstom value and paramters "AllowMultiSelect" and "OverwritePrompt" will be useless.
    * @return {boolean}
    */
  def ShowFileDialog(
    SaveDialog: Boolean,
    Filter: String,
    FilterIndex: Double,
    DefExtension: String,
    InitialDir: String,
    AllowMultiSelect: Boolean,
    OverwritePrompt: Boolean,
    Flags: Double
  ): Boolean = js.native
  /**
    * Shows the GUI of Image Editor.
    * @method WebTwain#ShowImageEditor
    * @param {string} elEditorDIV Specifies a DIV by its ID to put the editor in
    * @param {number} width Specifies the width of the DIV
    * @param {number} height Specifies the height of the DIV
    * @param {boolean} bHideToolBar Specifies whether to show the toolbar or not 
    * @return {boolean}
    */
  def ShowImageEditor(): Boolean = js.native
  def ShowImageEditor(elEditorDIV: String): Boolean = js.native
  def ShowImageEditor(elEditorDIV: String, width: Double): Boolean = js.native
  def ShowImageEditor(elEditorDIV: String, width: Double, height: Double): Boolean = js.native
  def ShowImageEditor(elEditorDIV: String, width: Double, height: Double, bHideToolBar: Boolean): Boolean = js.native
  /**
    * [Deprecated.] Shows the GUI of Image Editor with custom settings.
    * @method WebTwain#ShowImageEditorEx
    * @param {number} x specifies the new position of the left top corner of the window.
    * @param {number} y specifies the new position of the left top corner of the window.
    * @param {number} cx specifies the width of the window.
    * @param {number} cy specifies the height of the window.
    * @param {number} nCmdShow specifices how the window should be shown.
    * @return {boolean}
    */
  def ShowImageEditorEx(x: Double, y: Double, cx: Double, cy: Double, nCmdShow: Double): Boolean = js.native
  /**
    * Switchs two images of specified indices in buffer.
    * @method WebTwain#SwitchImage
    * @param {number} sImageIndex1 specifies the index of image in buffer. The index is 0-based.
    * @param {number} sImageIndex2 specifies the index of image in buffer. The index is 0-based.
    * @return {boolean}
    */
  def SwitchImage(sImageIndex1: Double, sImageIndex2: Double): Boolean = js.native
  def TagImages(aryImageIndices: js.Array[Double], tagName: String): Boolean = js.native
  /**
    * Unbinds an event from the specified function, so that the function stops receiving notifications when the event fires.
    * @method WebTwain#UnregisterEvent
    * @param {string} name the name of the event.
    * @param {object} evt specified the function to be unbound.
    * @return {boolean}
    */
  def UnregisterEvent(name: String, evt: js.Object): Boolean = js.native
  /*ingored    
    SourceNameItems
    */
  /**
    * Shows the GUI of Image Editor.
    * @method WebTwain#startScan
    * @return {Promise}
    * @param {any} scanSetup Specifies how images are scanned and outputed
    */
  def startScan(scanSetup: js.Any): js.Promise[_] = js.native
}

