package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_Cap extends js.Object

/** Capabilities */
@JSGlobal("EnumDWT_Cap")
@js.native
object EnumDWT_Cap extends js.Object {
  /** Turns specific audible alarms on and off. */
  @js.native
  sealed trait CAP_ALARMS
    extends dwtLib.EnumDWT_Cap
  
  /** The volume of a device's audible alarm. Note that this control affects the volume of all alarms;
    *  no specific volume control for individual types of alarms is provided.
    */
  @js.native
  sealed trait CAP_ALARMVOLUME
    extends dwtLib.EnumDWT_Cap
  
  /** The name or other identifying information about the Author of the image. It may include a copyright string. */
  @js.native
  sealed trait CAP_AUTHOR
    extends dwtLib.EnumDWT_Cap
  
  /** If TRUE, the Source will automatically feed the next page from the document feeder after the
    *  number of frames negotiated for capture from each page are acquired. CAP_FEEDERENABLED
    *  must be TRUE to use this capability.
    */
  @js.native
  sealed trait CAP_AUTOFEED
    extends dwtLib.EnumDWT_Cap
  
  /** The number of images to automatically capture. This does not refer to the number of images to
    *  be sent to the Application, use CAP_XFERCOUNT for that.
    */
  @js.native
  sealed trait CAP_AUTOMATICCAPTURE
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.1  */
  @js.native
  sealed trait CAP_AUTOMATICSENSEMEDIUM
    extends dwtLib.EnumDWT_Cap
  
  /** This capability is intended to boost the performance of a Source. The fundamental assumption
    *  behind AutoScan is that the device is able to capture the number of images indicated by the
    *  value of CAP_XFERCOUNT without waiting for the Application to request the image transfers.
    *  This is only possible if the device has internal buffers capable of caching the images it captures.
    *  The default behavior is undefined, because some high volume devices are incapable of anything
    *  but CAP_AUTOSCAN being equal to TRUE. However, if a Source supports FALSE, it should use it
    *  as the mandatory default, since this best describes the behavior of pre-1.8 TWAIN Applications.
    */
  @js.native
  sealed trait CAP_AUTOSCAN
    extends dwtLib.EnumDWT_Cap
  
  /** The minutes of battery power remaining to the device. */
  @js.native
  sealed trait CAP_BATTERYMINUTES
    extends dwtLib.EnumDWT_Cap
  
  /** When used with CapGet(), return the percentage of battery power level on camera. If -1 is returned, it indicates that the battery is not present.  */
  @js.native
  sealed trait CAP_BATTERYPERCENTAGE
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.0  */
  @js.native
  sealed trait CAP_CAMERAENABLED
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.0    */
  @js.native
  sealed trait CAP_CAMERAORDER
    extends dwtLib.EnumDWT_Cap
  
  /** This capability queries the Source for UI support for preview mode. If TRUE, the Source supports preview UI. */
  @js.native
  sealed trait CAP_CAMERAPREVIEWUI
    extends dwtLib.EnumDWT_Cap
  
  /** Added 1.91  */
  @js.native
  sealed trait CAP_CAMERASIDE
    extends dwtLib.EnumDWT_Cap
  
  /** A general note about the acquired image. */
  @js.native
  sealed trait CAP_CAPTION
    extends dwtLib.EnumDWT_Cap
  
  /** CapGet() reports the presence of data in the scanner's buffers. CapSet() with a value of TWCB_CLEAR immediately clears the buffers. */
  @js.native
  sealed trait CAP_CLEARBUFFERS
    extends dwtLib.EnumDWT_Cap
  
  /** If TRUE, the Source will eject the current page being acquired from and will leave the feeder
    *  acquire area empty.
    *  If CAP_AUTOFEED is TRUE, a fresh page will be advanced.
    *  CAP_FEEDERENABLED must equal TRUE to use this capability.
    *  This capability must have been negotiated as an extended capability to be used in States 5 and 6.
    */
  @js.native
  sealed trait CAP_CLEARPAGE
    extends dwtLib.EnumDWT_Cap
  
  @js.native
  sealed trait CAP_CUSTOMDSDATA
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.1  */
  @js.native
  sealed trait CAP_CUSTOMINTERFACEGUID
    extends dwtLib.EnumDWT_Cap
  
  /** If TRUE, the physical hardware (e.g., scanner, digital camera, image database, etc.) that
    *  represents the image source is attached, powered on, and communicating.
    */
  @js.native
  sealed trait CAP_DEVICEONLINE
    extends dwtLib.EnumDWT_Cap
  
  /** The date and time of the device's clock.
    *  Managed in the form "YYYY/MM/DD HH:mm:SS:sss" where YYYY is the year, MM is the
    *  numerical month, DD is the numerical day, HH is the hour, mm is the minute, SS is the second,
    *  and sss is the millisecond.
    */
  @js.native
  sealed trait CAP_DEVICETIMEDATE
    extends dwtLib.EnumDWT_Cap
  
  /** This indicates whether the scanner supports duplex. If so, it further indicates whether one-path
    *  or two-path duplex is supported.
    */
  @js.native
  sealed trait CAP_DUPLEX
    extends dwtLib.EnumDWT_Cap
  
  /** The user can set the duplex option to be TRUE or FALSE. If TRUE, the scanner scans both sides
    *  of a paper; otherwise, the scanner will scan only one side of the image.
    */
  @js.native
  sealed trait CAP_DUPLEXENABLED
    extends dwtLib.EnumDWT_Cap
  
  /** Allows an application to query a source to see if it implements the new user interface settings dialog.  */
  @js.native
  sealed trait CAP_ENABLEDSUIONLY
    extends dwtLib.EnumDWT_Cap
  
  /** Allows the application to specify the starting endorser / imprinter number. All other endorser/
    *  imprinter properties should be handled through the data source's user interface.
    *  The user can set the starting number for the endorser.
    */
  @js.native
  sealed trait CAP_ENDORSER
    extends dwtLib.EnumDWT_Cap
  
  /** Allows the application and Source to negotiate capabilities to be used in States 5 and 6. */
  @js.native
  sealed trait CAP_EXTENDEDCAPS
    extends dwtLib.EnumDWT_Cap
  
  /** Helps the Application determine any special actions it may need to take when negotiating
    *  frames with the Source. Allowed values are listed in <see cref="TWCapFeederAlignment"/>.
    *  TWFA_NONE: The alignment is free-floating. Applications should assume
    *  that the origin for frames is on the left.
    *  TWFA_LEFT: The alignment is to the left.
    *  TWFA_CENTER: The alignment is centered. This means that the paper will
    *  be fed in the middle of the ICAP_PHYSICALWIDTH of the
    *  device. If this is set, then the Application should calculate
    *  any frames with a left offset of zero.
    *  TWFA_RIGHT: The alignment is to the right.
    */
  @js.native
  sealed trait CAP_FEEDERALIGNMENT
    extends dwtLib.EnumDWT_Cap
  
  /** If TRUE, Source must acquire data from the document feeder acquire area and other feeder
    *  capabilities can be used. If FALSE, Source must acquire data from the non-feeder acquire area
    *  and no other feeder capabilities can be used.
    */
  @js.native
  sealed trait CAP_FEEDERENABLED
    extends dwtLib.EnumDWT_Cap
  
  /** Reflect whether there are documents loaded in the Source's feeder. */
  @js.native
  sealed trait CAP_FEEDERLOADED
    extends dwtLib.EnumDWT_Cap
  
  /** TWFO_FIRSTPAGEFIRST if the feeder starts with the top of the first page.
    *  TWFO_LASTPAGEFIRST is the feeder starts with the top of the last page.
    */
  @js.native
  sealed trait CAP_FEEDERORDER
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.0  */
  @js.native
  sealed trait CAP_FEEDERPOCKET
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.0   */
  @js.native
  sealed trait CAP_FEEDERPREP
    extends dwtLib.EnumDWT_Cap
  
  /** If TRUE, the Source will eject the current page and advance the next page in the document feeder
    *  into the feeder acquire area.
    *  If CAP_AUTOFEED is TRUE, the same action just described will occur and CAP_AUTOFEED will
    *  remain active.
    *  CAP_FEEDERENABLED must equal TRUE to use this capability.
    *  This capability must have been negotiated as an extended capability to be used in States 5 and 6.
    */
  @js.native
  sealed trait CAP_FEEDPAGE
    extends dwtLib.EnumDWT_Cap
  
  /** If TRUE, the Source will display a progress indicator during acquisition and transfer, regardless
    *  of whether the Source's user interface is active. If FALSE, the progress indicator will be
    *  suppressed if the Source's user interface is inactive.
    *  The Source will continue to display device-specific instructions and error messages even with
    *  the Source user interface and progress indicators turned off.
    */
  @js.native
  sealed trait CAP_INDICATORS
    extends dwtLib.EnumDWT_Cap
  
  /** Allows Application and Source to identify which languages they have in common for the exchange of string data,
    *  and to select the language of the internal UI. Since the TWLG_xxxx codes include language and country data, there is no separate
    *  capability for selecting the country.
    */
  @js.native
  sealed trait CAP_LANGUAGE
    extends dwtLib.EnumDWT_Cap
  
  /** Describes the number of pages that the scanner can buffer when CAP_AUTOSCAN is enabled. */
  @js.native
  sealed trait CAP_MAXBATCHBUFFERS
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.0  */
  @js.native
  sealed trait CAP_MICRENABLED
    extends dwtLib.EnumDWT_Cap
  
  /** Nothing. */
  @js.native
  sealed trait CAP_NONE
    extends dwtLib.EnumDWT_Cap
  
  /** This capability determines whether the device has a paper sensor that can detect documents on the ADF or Flatbed. */
  @js.native
  sealed trait CAP_PAPERDETECTABLE
    extends dwtLib.EnumDWT_Cap
  
  /** CapGet() reports the kinds of power available to the device. CapGetCurrent() reports the current power supply in use. */
  @js.native
  sealed trait CAP_POWERSUPPLY
    extends dwtLib.EnumDWT_Cap
  
  /** CapGet() returns the current list of available printer devices, along with the one currently being used for negotiation.
    *  CapSet() selects the current device for negotiation, and optionally constrains the list.
    *  Top/Bottom refers to duplex devices, and indicates if the printer is writing on the top or the bottom of the sheet of paper.
    *  Simplex devices use the top settings. Before/After indicates whether printing occurs before or after the sheet of paper has been scanned.
    */
  @js.native
  sealed trait CAP_PRINTER
    extends dwtLib.EnumDWT_Cap
  
  /** Turns the current CAP_PRINTER device on or off. */
  @js.native
  sealed trait CAP_PRINTERENABLED
    extends dwtLib.EnumDWT_Cap
  
  /** The User can set the starting number for the current CAP_PRINTER device. */
  @js.native
  sealed trait CAP_PRINTERINDEX
    extends dwtLib.EnumDWT_Cap
  
  /** Specifies the appropriate current CAP_PRINTER device mode.
    *  Note:
    *  • TWPM_SINGLESTRING specifies that the printed text will consist of a single string.
    *  • TWPM _MULTISTRING specifies that the printed text will consist of an enumerated list of
    *  strings to be printed in order.
    *  • TWPM _COMPOUNDSTRING specifies that the printed string will consist of a compound of a
    *  String followed by a value followed by a suffix string.
    */
  @js.native
  sealed trait CAP_PRINTERMODE
    extends dwtLib.EnumDWT_Cap
  
  /** Specifies the string(s) that are to be used in the string component when the current
    *  CAP_PRINTER device is enabled.
    */
  @js.native
  sealed trait CAP_PRINTERSTRING
    extends dwtLib.EnumDWT_Cap
  
  /** Specifies the string that shall be used as the current CAP_PRINTER device's suffix. */
  @js.native
  sealed trait CAP_PRINTERSUFFIX
    extends dwtLib.EnumDWT_Cap
  
  /** Indicates whether the physical hardware (e.g. scanner, digital camera) is capable of acquiring
    *  multiple images of the same page without changes to the physical registration of that page.
    */
  @js.native
  sealed trait CAP_REACQUIREALLOWED
    extends dwtLib.EnumDWT_Cap
  
  /** If TRUE, the Source will return the current page to the input side of the document feeder and
    *  feed the last page from the output side of the feeder back into the acquisition area.
    *  If CAP_AUTOFEED is TRUE, automatic feeding will continue after all negotiated frames from this
    *  page are acquired.
    *  CAP_FEEDERENABLED must equal TRUE to use this capability.
    *  This capability must have been negotiated as an extended capability to be used in States 5 and 6.
    */
  @js.native
  sealed trait CAP_REWINDPAGE
    extends dwtLib.EnumDWT_Cap
  
  /** Added 1.91   */
  @js.native
  sealed trait CAP_SEGMENTED
    extends dwtLib.EnumDWT_Cap
  
  /** A string containing the serial number of the currently selected device in the Source. Multiple
    *  devices may all report the same serial number.
    */
  @js.native
  sealed trait CAP_SERIALNUMBER
    extends dwtLib.EnumDWT_Cap
  
  /** Returns a list of all the capabilities for which the Source will answer inquiries. Does not indicate
    *  which capabilities the Source will allow to be set by the application. Some capabilities can only
    *  be set if certain setup work has been done so the Source cannot globally answer which
    *  capabilities are "set-able."
    */
  @js.native
  sealed trait CAP_SUPPORTEDCAPS
    extends dwtLib.EnumDWT_Cap
  
  /** Returns a list of all the capabilities for which the Source will answer inquiries. Does not indicate
    *  which capabilities the Source will allow to be set by the application. Some capabilities can only
    *  be set if certain setup work has been done so the Source cannot globally answer which
    *  capabilities are "set-able."
    */
  @js.native
  sealed trait CAP_SUPPORTEDCAPSEXT
    extends dwtLib.EnumDWT_Cap
  
  /** Allows an application to request the delivery of thumbnail representations for the set of images
    *  that are to be delivered.
    *  Setting CAP_THUMBNAILSENABLED to TRUE turns on thumbnail mode. Images transferred
    *  thereafter will be sent at thumbnail size (exact thumbnail size is determined by the Data Source).
    *  Setting this capability to FALSE turns thumbnail mode off and returns full size images.
    */
  @js.native
  sealed trait CAP_THUMBNAILSENABLED
    extends dwtLib.EnumDWT_Cap
  
  /** For automatic capture, this value selects the number of milliseconds before the first picture is to
    *  be taken, or the first image is to be scanned.
    */
  @js.native
  sealed trait CAP_TIMEBEFOREFIRSTCAPTURE
    extends dwtLib.EnumDWT_Cap
  
  /** For automatic capture, this value selects the milliseconds to wait between pictures taken, or images scanned. */
  @js.native
  sealed trait CAP_TIMEBETWEENCAPTURES
    extends dwtLib.EnumDWT_Cap
  
  /** The date and time the image was acquired.
    *  Stored in the form "YYYY/MM/DD HH:mm:SS.sss" where YYYY is the year, MM is the
    *  numerical month, DD is the numerical day, HH is the hour, mm is the minute, SS is the second,
    *  and sss is the millisecond.
    */
  @js.native
  sealed trait CAP_TIMEDATE
    extends dwtLib.EnumDWT_Cap
  
  /** If TRUE, indicates that this Source supports acquisition with the UI disabled; i.e.,
    *  TW_USERINTERFACE's ShowUI field can be set to FALSE. If FALSE, indicates that this Source
    *  can only support acquisition with the UI enabled.
    */
  @js.native
  sealed trait CAP_UICONTROLLABLE
    extends dwtLib.EnumDWT_Cap
  
  /** The application is willing to accept this number of images. */
  @js.native
  sealed trait CAP_XFERCOUNT
    extends dwtLib.EnumDWT_Cap
  
  /** TRUE enables and FALSE disables the Source's Auto-brightness function (if any). */
  @js.native
  sealed trait ICAP_AUTOBRIGHT
    extends dwtLib.EnumDWT_Cap
  
  /** Use this capability to have the Source discard blank images. The Application never sees these
    *  images during the scanning session.
    *  TWBP_DISABLE – this must be the default state for the Source. It indicates that all images will
    *  be delivered to the Application, none of them will be discarded.
    *  TWBP_AUTO – if this is used, then the Source will decide if an image is blank or not and discard
    *  as appropriate.
    *  If the specified value is a positive number in the range 0 to 231–1, then this capability will use it
    *  as the byte size cutoff point to identify which images are to be discarded. If the size of the image
    *  is less than or equal to this value, then it will be discarded. If the size of the image is greater
    *  than this value, then it will be kept so that it can be transferred to the Application.
    */
  @js.native
  sealed trait ICAP_AUTODISCARDBLANKPAGES
    extends dwtLib.EnumDWT_Cap
  
  /** Turns automatic border detection on and off. */
  @js.native
  sealed trait ICAP_AUTOMATICBORDERDETECTION
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICCOLORENABLED
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICCOLORNONCOLORPIXELTYPE
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICCROPUSESFRAME
    extends dwtLib.EnumDWT_Cap
  
  /** Turns automatic deskew correction on and off. */
  @js.native
  sealed trait ICAP_AUTOMATICDESKEW
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICLENGTHDETECTION
    extends dwtLib.EnumDWT_Cap
  
  /** When TRUE this capability depends on intelligent features within the Source to automatically
    *  rotate the image to the correct position.
    */
  @js.native
  sealed trait ICAP_AUTOMATICROTATE
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.0   */
  @js.native
  sealed trait ICAP_AUTOSIZE
    extends dwtLib.EnumDWT_Cap
  
  /** Turns bar code detection on and off. */
  @js.native
  sealed trait ICAP_BARCODEDETECTIONENABLED
    extends dwtLib.EnumDWT_Cap
  
  /** Restricts the number of times a search will be retried if none are found on each page. */
  @js.native
  sealed trait ICAP_BARCODEMAXRETRIES
    extends dwtLib.EnumDWT_Cap
  
  /** The maximum number of supported search priorities. */
  @js.native
  sealed trait ICAP_BARCODEMAXSEARCHPRIORITIES
    extends dwtLib.EnumDWT_Cap
  
  /** Restricts bar code searching to certain orientations, or prioritizes one orientation over the other. */
  @js.native
  sealed trait ICAP_BARCODESEARCHMODE
    extends dwtLib.EnumDWT_Cap
  
  /** A prioritized list of bar code types dictating the order in which bar codes will be sought. */
  @js.native
  sealed trait ICAP_BARCODESEARCHPRIORITIES
    extends dwtLib.EnumDWT_Cap
  
  /** Restricts the total time spent on searching for a bar code on each page. */
  @js.native
  sealed trait ICAP_BARCODETIMEOUT
    extends dwtLib.EnumDWT_Cap
  
  /** Specifies the pixel bit depths for the Current value of ICAP_PIXELTYPE. For example, when
    *  using ICAP_PIXELTYPE:TWPT_GRAY, this capability specifies whether this is 8-bit gray or 4-bit gray.
    *  This depth applies to all the data channels (for instance, the R, G, and B channels will all have
    *  this same bit depth for RGB data).
    */
  @js.native
  sealed trait ICAP_BITDEPTH
    extends dwtLib.EnumDWT_Cap
  
  /** Specifies the Reduction Method the Source should use to reduce the bit depth of the data. Most
    *  commonly used with ICAP_PIXELTYPE:TWPT_BW to reduce gray data to black and white.
    */
  @js.native
  sealed trait ICAP_BITDEPTHREDUCTION
    extends dwtLib.EnumDWT_Cap
  
  /** Specifies how the bytes in an image are filled by the Source. TWBO_MSBFIRST indicates that the leftmost bit in the byte (usually bit 7) is
    *  the byte's Most Significant Bit.
    */
  @js.native
  sealed trait ICAP_BITORDER
    extends dwtLib.EnumDWT_Cap
  
  /** Used for CCITT data compression only. Indicates the bit order representation of the stored compressed codes. */
  @js.native
  sealed trait ICAP_BITORDERCODES
    extends dwtLib.EnumDWT_Cap
  
  /** The brightness values available within the Source. */
  @js.native
  sealed trait ICAP_BRIGHTNESS
    extends dwtLib.EnumDWT_Cap
  
  /** Used for CCITT Group 3 2-dimensional compression. The 'K' factor indicates how often the
    *  new compression baseline should be re-established. A value of 2 or 4 is common in facsimile
    *  communication. A value of zero in this field will indicate an infinite K factor—the baseline is
    *  only calculated at the beginning of the transfer.
    */
  @js.native
  sealed trait ICAP_CCITTKFACTOR
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_COLORMANAGEMENTENABLED
    extends dwtLib.EnumDWT_Cap
  
  /** Allows the application and Source to identify which compression schemes they have in
    *  common for Buffered Memory and File transfers.
    *  Note for File transfers:
    *  Since only certain file formats support compression, this capability must be negotiated after
    *  setting the desired file format with ICAP_IMAGEFILEFORMAT.
    */
  @js.native
  sealed trait ICAP_COMPRESSION
    extends dwtLib.EnumDWT_Cap
  
  /** The contrast values available within the Source. */
  @js.native
  sealed trait ICAP_CONTRAST
    extends dwtLib.EnumDWT_Cap
  
  /** Specifies the square-cell halftone (dithering) matrix the Source should use to halftone the image. */
  @js.native
  sealed trait ICAP_CUSTHALFTONE
    extends dwtLib.EnumDWT_Cap
  
  /** Specifies the exposure time used to capture the image, in seconds. */
  @js.native
  sealed trait ICAP_EXPOSURETIME
    extends dwtLib.EnumDWT_Cap
  
  /** Allows the application to query the data source to see if it supports extended image attribute capabilities,
    *  such as Barcode Recognition, Shaded Area Detection and Removal, Skew detection and Removal, and so on.
    */
  @js.native
  sealed trait ICAP_EXTIMAGEINFO
    extends dwtLib.EnumDWT_Cap
  
  /** Added 1.91   */
  @js.native
  sealed trait ICAP_FEEDERTYPE
    extends dwtLib.EnumDWT_Cap
  
  /** Describes the color characteristic of the subtractive filter applied to the image data. Multiple
    *  filters may be applied to a single acquisition.
    */
  @js.native
  sealed trait ICAP_FILTER
    extends dwtLib.EnumDWT_Cap
  
  /** Specifies whether or not the image was acquired using a flash. */
  @js.native
  sealed trait ICAP_FLASHUSED
    extends dwtLib.EnumDWT_Cap
  
  /** For devices that support flash. CapSet() selects the flash to be used (if any). CapGet() reports the current setting.
    *  This capability replaces ICAP_FLASHUSED, which is only able to negotiate the flash being on or off.
    */
  @js.native
  sealed trait ICAP_FLASHUSED2
    extends dwtLib.EnumDWT_Cap
  
  /** Flip rotation is used to properly orient images that flip orientation every other image.
    *  TWFR_BOOK The images to be scanned are viewed in book form, flipping each page from left to right or right to left.
    *  TWFR_FANFOLD The images to be scanned are viewed in fanfold paper style, flipping each page up or down.
    */
  @js.native
  sealed trait ICAP_FLIPROTATION
    extends dwtLib.EnumDWT_Cap
  
  /** The list of frames the Source will acquire on each page. */
  @js.native
  sealed trait ICAP_FRAMES
    extends dwtLib.EnumDWT_Cap
  
  /** Gamma correction value for the image data. */
  @js.native
  sealed trait ICAP_GAMMA
    extends dwtLib.EnumDWT_Cap
  
  /** A list of names of the halftone patterns available within the Source. */
  @js.native
  sealed trait ICAP_HALFTONES
    extends dwtLib.EnumDWT_Cap
  
  /** Specifies which value in an image should be interpreted as the lightest "highlight." All values
    *  "lighter" than this value will be clipped to this value. Whether lighter values are smaller or
    *  larger can be determined by examining the Current value of ICAP_PIXELFLAVOR.
    */
  @js.native
  sealed trait ICAP_HIGHLIGHT
    extends dwtLib.EnumDWT_Cap
  
  /** Added 1.91  */
  @js.native
  sealed trait ICAP_ICCPROFILE
    extends dwtLib.EnumDWT_Cap
  
  /** Informs the application which file formats the Source can generate (CapGet()). Tells the Source which file formats the application can handle (CapSet()).
    *  TWFF_TIFF Used for document
    *  TWFF_PICT Native Macintosh
    *  TWFF_BMP Native Microsoft
    *  TWFF_XBM Used for document
    *  TWFF_JFIF Wrapper for JPEG
    *  TWFF_FPX FlashPix, used with digital
    *  TWFF_TIFFMULTI Multi-page TIFF files
    *  TWFF_PNG An image format standard intended for use on the web, replaces GIF
    *  TWFF_SPIFF A standard from JPEG, intended to replace JFIF, also supports JBIG
    *  TWFF_EXIF File format for use with digital cameras.
    */
  @js.native
  sealed trait ICAP_IMAGEFILEFORMAT
    extends dwtLib.EnumDWT_Cap
  
  /** For devices that support image enhancement filtering. This capability selects the algorithm used to improve the quality of the image. */
  @js.native
  sealed trait ICAP_IMAGEFILTER
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_IMAGEMERGE
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_IMAGEMERGEHEIGHTTHRESHOLD
    extends dwtLib.EnumDWT_Cap
  
  /** Allows the application and Source to agree upon a common set of color descriptors that are
    *  made available by the Source. This ICAP is only useful for JPEG-compressed buffered memory image transfers.
    */
  @js.native
  sealed trait ICAP_JPEGPIXELTYPE
    extends dwtLib.EnumDWT_Cap
  
  /** Added 1.9  */
  @js.native
  sealed trait ICAP_JPEGQUALITY
    extends dwtLib.EnumDWT_Cap
  
  /** TRUE means the lamp is currently, or should be set to ON. Sources may not support CapSet() operations.  */
  @js.native
  sealed trait ICAP_LAMPSTATE
    extends dwtLib.EnumDWT_Cap
  
  /** Describes whether the image was captured transmissively or reflectively. */
  @js.native
  sealed trait ICAP_LIGHTPATH
    extends dwtLib.EnumDWT_Cap
  
  /** Describes the general color characteristic of the light source used to acquire the image. */
  @js.native
  sealed trait ICAP_LIGHTSOURCE
    extends dwtLib.EnumDWT_Cap
  
  /** The maximum number of frames the Source can provide or the application can accept per page.
    *  This is a bounding capability only. It does not establish current or future behavior.
    */
  @js.native
  sealed trait ICAP_MAXFRAMES
    extends dwtLib.EnumDWT_Cap
  
  /** Allows the source to define the minimum height (Y-axis) that the source can acquire. */
  @js.native
  sealed trait ICAP_MINIMUMHEIGHT
    extends dwtLib.EnumDWT_Cap
  
  /** Allows the source to define theminimum width (X-axis) that the source can acquire. */
  @js.native
  sealed trait ICAP_MINIMUMWIDTH
    extends dwtLib.EnumDWT_Cap
  
  /** For devices that support noise filtering. This capability selects the algorithm used to remove noise. */
  @js.native
  sealed trait ICAP_NOISEFILTER
    extends dwtLib.EnumDWT_Cap
  
  /** Defines which edge of the "paper" the image's "top" is aligned with. This information is used to adjust the frames to match the
    *  scanning orientation of the paper. For instance, if an ICAP_SUPPORTEDSIZE of TWSS_ISOA4 has been negotiated,
    *  and ICAP_ORIENTATION is set to TWOR_LANDSCAPE, then the Source must rotate the frame it downloads to the scanner to reflect the
    *  orientation of the paper. Please note that setting ICAP_ORIENTATION does not affect the values reported by ICAP_FRAMES;
    *  it just causes the Source to use them in a different way. The upper-left of the image is defined as the location where both the primary and
    *  secondary scans originate. (The X axis is the primary scan direction and the Y axis is the secondary scan direction.)
    *  For a flatbed scanner, the light bar moves in the secondary scan direction. For a handheld scanner, the scanner is drug in the
    *  secondary scan direction. For a digital camera, the secondary direction is the vertical axis when the viewed image is considered upright.
    */
  @js.native
  sealed trait ICAP_ORIENTATION
    extends dwtLib.EnumDWT_Cap
  
  /** Overscan is used to scan outside of the boundaries described by ICAP_FRAMES, and is used to help acquire image data that
    *  may be lost because of skewing.
    *  This is primarily of use for transport scanners which rely on edge detection to begin scanning.
    *  If overscan is supported, then the device is capable of scanning in the inter-document gap to get the skewed image information.
    */
  @js.native
  sealed trait ICAP_OVERSCAN
    extends dwtLib.EnumDWT_Cap
  
  /** Turns patch code detection on and off. */
  @js.native
  sealed trait ICAP_PATCHCODEDETECTIONENABLED
    extends dwtLib.EnumDWT_Cap
  
  /** Restricts the number of times a search will be retried if none are found on each page. */
  @js.native
  sealed trait ICAP_PATCHCODEMAXRETRIES
    extends dwtLib.EnumDWT_Cap
  
  /** The maximum number of supported search priorities. */
  @js.native
  sealed trait ICAP_PATCHCODEMAXSEARCHPRIORITIES
    extends dwtLib.EnumDWT_Cap
  
  /** Restricts patch code searching to certain orientations, or prioritizes one orientation over the other. */
  @js.native
  sealed trait ICAP_PATCHCODESEARCHMODE
    extends dwtLib.EnumDWT_Cap
  
  /** A prioritized list of patch code types dictating the order in which patch codes will be sought. */
  @js.native
  sealed trait ICAP_PATCHCODESEARCHPRIORITIES
    extends dwtLib.EnumDWT_Cap
  
  /** Restricts the total time spent on searching for a patch code on each page. */
  @js.native
  sealed trait ICAP_PATCHCODETIMEOUT
    extends dwtLib.EnumDWT_Cap
  
  /** The maximum physical height (Y-axis) the Source can acquire (measured in units of ICAP_UNITS). */
  @js.native
  sealed trait ICAP_PHYSICALHEIGHT
    extends dwtLib.EnumDWT_Cap
  
  /** The maximum physical width (X-axis) the Source can acquire (measured in units of ICAP_UNITS). */
  @js.native
  sealed trait ICAP_PHYSICALWIDTH
    extends dwtLib.EnumDWT_Cap
  
  /** Sense of the pixel whose numeric value is zero (minimum data value).  */
  @js.native
  sealed trait ICAP_PIXELFLAVOR
    extends dwtLib.EnumDWT_Cap
  
  /** Used only for CCITT data compression. Specifies whether the compressed codes' pixel "sense"
    *  will be inverted from the Current value of ICAP_PIXELFLAVOR prior to transfer.
    */
  @js.native
  sealed trait ICAP_PIXELFLAVORCODES
    extends dwtLib.EnumDWT_Cap
  
  /** The type of pixel data that a Source is capable of acquiring (for example, black and white, gray, RGB, etc.). */
  @js.native
  sealed trait ICAP_PIXELTYPE
    extends dwtLib.EnumDWT_Cap
  
  /** Allows the application and Source to identify which color data formats are available. There are
    *  two options, "planar" and "chunky."
    */
  @js.native
  sealed trait ICAP_PLANARCHUNKY
    extends dwtLib.EnumDWT_Cap
  
  /** How the Source can/should rotate the scanned image data prior to transfer. This doesn't use
    *  ICAP_UNITS. It is always measured in degrees. Any applied value is additive with any
    *  rotation specified in ICAP_ORIENTATION.
    */
  @js.native
  sealed trait ICAP_ROTATION
    extends dwtLib.EnumDWT_Cap
  
  /** Specifies which value in an image should be interpreted as the darkest "shadow." All values
    *  "darker" than this value will be clipped to this value.
    */
  @js.native
  sealed trait ICAP_SHADOW
    extends dwtLib.EnumDWT_Cap
  
  /** Provides a list of bar code types that can be detected by the current Data Source. */
  @js.native
  sealed trait ICAP_SUPPORTEDBARCODETYPES
    extends dwtLib.EnumDWT_Cap
  
  /** Added 2.1   */
  @js.native
  sealed trait ICAP_SUPPORTEDEXTIMAGEINFO
    extends dwtLib.EnumDWT_Cap
  
  /** A list of patch code types that may be detected by the current Data Source. */
  @js.native
  sealed trait ICAP_SUPPORTEDPATCHCODETYPES
    extends dwtLib.EnumDWT_Cap
  
  /** For devices that support fixed frame sizes.
    *  Defined sizes match typical page sizes. This specifies the size(s) the Source can/should use to acquire image data.
    */
  @js.native
  sealed trait ICAP_SUPPORTEDSIZES
    extends dwtLib.EnumDWT_Cap
  
  /** Specifies the dividing line between black and white. This is the value the Source will use to
    *  threshold, if needed, when ICAP_PIXELTYPE:TWPT_BW.
    *  The value is normalized so there are no units of measure associated with this ICAP.
    */
  @js.native
  sealed trait ICAP_THRESHOLD
    extends dwtLib.EnumDWT_Cap
  
  /** This is used with buffered memory transfers. If TRUE, Source can provide application with tiled image data. */
  @js.native
  sealed trait ICAP_TILES
    extends dwtLib.EnumDWT_Cap
  
  /** Used only with CCITT data compression. Specifies the minimum number of words of compressed codes (compressed data) to be transmitted per line. */
  @js.native
  sealed trait ICAP_TIMEFILL
    extends dwtLib.EnumDWT_Cap
  
  /** If TRUE the Source will issue a MSG_XFERREADY before starting the scan.
    *  Note: The Source may need to scan the image before initiating the transfer. This is the case if
    *  the scanned image is rotated or merged with another scanned image.
    */
  @js.native
  sealed trait ICAP_UNDEFINEDIMAGESIZE
    extends dwtLib.EnumDWT_Cap
  
  /** Unless a quantity is dimensionless or uses a specified unit of measure, ICAP_UNITS determines
    *  the unit of measure for all quantities.
    */
  @js.native
  sealed trait ICAP_UNITS
    extends dwtLib.EnumDWT_Cap
  
  /** Allows the application and Source to identify which transfer mechanisms the source supports. */
  @js.native
  sealed trait ICAP_XFERMECH
    extends dwtLib.EnumDWT_Cap
  
  /** The native optical resolution along the X-axis of the device being controlled by the Source. Most
    *  devices will respond with a single value (TW_ONEVALUE).
    *  This is NOT a list of all resolutions that can be generated by the device. Rather, this is the
    *  resolution of the device's optics. Measured in units of pixels per unit as defined by
    *  ICAP_UNITS (pixels per TWUN_PIXELS yields dimensionless data).
    */
  @js.native
  sealed trait ICAP_XNATIVERESOLUTION
    extends dwtLib.EnumDWT_Cap
  
  /** All the X-axis resolutions the Source can provide.
    *  Measured in units of pixels per unit as defined by ICAP_UNITS (pixels per TWUN_PIXELS
    *  yields dimensionless data). That is, when the units are TWUN_PIXELS, both
    *  ICAP_XRESOLUTION and ICAP_YRESOLUTION shall report 1 pixel/pixel. Some data sources
    *  like to report the actual number of pixels that the device reports, but that response is more
    *  appropriate in ICAP_PHYSICALHEIGHT and ICAP_PHYSICALWIDTH.
    */
  @js.native
  sealed trait ICAP_XRESOLUTION
    extends dwtLib.EnumDWT_Cap
  
  /** All the X-axis scaling values available. A value of '1.0' is equivalent to 100% scaling. Do not use values less than or equal to zero. */
  @js.native
  sealed trait ICAP_XSCALING
    extends dwtLib.EnumDWT_Cap
  
  /** The native optical resolution along the Y-axis of the device being controlled by the Source.
    *  Measured in units of pixels per unit as defined by ICAP_UNITS (pixels per TWUN_PIXELS
    *  yields dimensionless data).
    */
  @js.native
  sealed trait ICAP_YNATIVERESOLUTION
    extends dwtLib.EnumDWT_Cap
  
  /** All the Y-axis resolutions the Source can provide.
    *  Measured in units of pixels per unit as defined by ICAP_UNITS (pixels per TWUN_PIXELS
    *  yields dimensionless data). That is, when the units are TWUN_PIXELS, both
    *  ICAP_XRESOLUTION and ICAP_YRESOLUTION shall report 1 pixel/pixel. Some data sources
    *  like to report the actual number of pixels that the device reports, but that response is more
    *  appropriate in ICAP_PHYSICALHEIGHT and ICAP_PHYSICALWIDTH.
    */
  @js.native
  sealed trait ICAP_YRESOLUTION
    extends dwtLib.EnumDWT_Cap
  
  /** All the Y-axis scaling values available. A value of '1.0' is equivalent to 100% scaling. Do not use values less than or equal to zero.
    *  There are no units inherent with this data as it is normalized to 1.0 being "unscaled."
    */
  @js.native
  sealed trait ICAP_YSCALING
    extends dwtLib.EnumDWT_Cap
  
  /** When used with CapGet(), returns all camera supported lens zooming range.  */
  @js.native
  sealed trait ICAP_ZOOMFACTOR
    extends dwtLib.EnumDWT_Cap
  
  /* 4120 */ val CAP_ALARMS: CAP_ALARMS with scala.Double = js.native
  /* 4121 */ val CAP_ALARMVOLUME: CAP_ALARMVOLUME with scala.Double = js.native
  /* 4096 */ val CAP_AUTHOR: CAP_AUTHOR with scala.Double = js.native
  /* 4103 */ val CAP_AUTOFEED: CAP_AUTOFEED with scala.Double = js.native
  /* 4122 */ val CAP_AUTOMATICCAPTURE: CAP_AUTOMATICCAPTURE with scala.Double = js.native
  /* 4155 */ val CAP_AUTOMATICSENSEMEDIUM: CAP_AUTOMATICSENSEMEDIUM with scala.Double = js.native
  /* 4112 */ val CAP_AUTOSCAN: CAP_AUTOSCAN with scala.Double = js.native
  /* 4146 */ val CAP_BATTERYMINUTES: CAP_BATTERYMINUTES with scala.Double = js.native
  /* 4147 */ val CAP_BATTERYPERCENTAGE: CAP_BATTERYPERCENTAGE with scala.Double = js.native
  /* 4150 */ val CAP_CAMERAENABLED: CAP_CAMERAENABLED with scala.Double = js.native
  /* 4151 */ val CAP_CAMERAORDER: CAP_CAMERAORDER with scala.Double = js.native
  /* 4129 */ val CAP_CAMERAPREVIEWUI: CAP_CAMERAPREVIEWUI with scala.Double = js.native
  /* 4148 */ val CAP_CAMERASIDE: CAP_CAMERASIDE with scala.Double = js.native
  /* 4097 */ val CAP_CAPTION: CAP_CAPTION with scala.Double = js.native
  /* 4125 */ val CAP_CLEARBUFFERS: CAP_CLEARBUFFERS with scala.Double = js.native
  /* 4104 */ val CAP_CLEARPAGE: CAP_CLEARPAGE with scala.Double = js.native
  /* 4117 */ val CAP_CUSTOMDSDATA: CAP_CUSTOMDSDATA with scala.Double = js.native
  /* 4156 */ val CAP_CUSTOMINTERFACEGUID: CAP_CUSTOMINTERFACEGUID with scala.Double = js.native
  /* 4111 */ val CAP_DEVICEONLINE: CAP_DEVICEONLINE with scala.Double = js.native
  /* 4127 */ val CAP_DEVICETIMEDATE: CAP_DEVICETIMEDATE with scala.Double = js.native
  /* 4114 */ val CAP_DUPLEX: CAP_DUPLEX with scala.Double = js.native
  /* 4115 */ val CAP_DUPLEXENABLED: CAP_DUPLEXENABLED with scala.Double = js.native
  /* 4116 */ val CAP_ENABLEDSUIONLY: CAP_ENABLEDSUIONLY with scala.Double = js.native
  /* 4118 */ val CAP_ENDORSER: CAP_ENDORSER with scala.Double = js.native
  /* 4102 */ val CAP_EXTENDEDCAPS: CAP_EXTENDEDCAPS with scala.Double = js.native
  /* 4141 */ val CAP_FEEDERALIGNMENT: CAP_FEEDERALIGNMENT with scala.Double = js.native
  /* 4098 */ val CAP_FEEDERENABLED: CAP_FEEDERENABLED with scala.Double = js.native
  /* 4099 */ val CAP_FEEDERLOADED: CAP_FEEDERLOADED with scala.Double = js.native
  /* 4142 */ val CAP_FEEDERORDER: CAP_FEEDERORDER with scala.Double = js.native
  /* 4154 */ val CAP_FEEDERPOCKET: CAP_FEEDERPOCKET with scala.Double = js.native
  /* 4153 */ val CAP_FEEDERPREP: CAP_FEEDERPREP with scala.Double = js.native
  /* 4105 */ val CAP_FEEDPAGE: CAP_FEEDPAGE with scala.Double = js.native
  /* 4107 */ val CAP_INDICATORS: CAP_INDICATORS with scala.Double = js.native
  /* 4140 */ val CAP_LANGUAGE: CAP_LANGUAGE with scala.Double = js.native
  /* 4126 */ val CAP_MAXBATCHBUFFERS: CAP_MAXBATCHBUFFERS with scala.Double = js.native
  /* 4152 */ val CAP_MICRENABLED: CAP_MICRENABLED with scala.Double = js.native
  /* 0 */ val CAP_NONE: CAP_NONE with scala.Double = js.native
  /* 4109 */ val CAP_PAPERDETECTABLE: CAP_PAPERDETECTABLE with scala.Double = js.native
  /* 4128 */ val CAP_POWERSUPPLY: CAP_POWERSUPPLY with scala.Double = js.native
  /* 4134 */ val CAP_PRINTER: CAP_PRINTER with scala.Double = js.native
  /* 4135 */ val CAP_PRINTERENABLED: CAP_PRINTERENABLED with scala.Double = js.native
  /* 4136 */ val CAP_PRINTERINDEX: CAP_PRINTERINDEX with scala.Double = js.native
  /* 4137 */ val CAP_PRINTERMODE: CAP_PRINTERMODE with scala.Double = js.native
  /* 4138 */ val CAP_PRINTERSTRING: CAP_PRINTERSTRING with scala.Double = js.native
  /* 4139 */ val CAP_PRINTERSUFFIX: CAP_PRINTERSUFFIX with scala.Double = js.native
  /* 4144 */ val CAP_REACQUIREALLOWED: CAP_REACQUIREALLOWED with scala.Double = js.native
  /* 4106 */ val CAP_REWINDPAGE: CAP_REWINDPAGE with scala.Double = js.native
  /* 4149 */ val CAP_SEGMENTED: CAP_SEGMENTED with scala.Double = js.native
  /* 4132 */ val CAP_SERIALNUMBER: CAP_SERIALNUMBER with scala.Double = js.native
  /* 4101 */ val CAP_SUPPORTEDCAPS: CAP_SUPPORTEDCAPS with scala.Double = js.native
  /* 4108 */ val CAP_SUPPORTEDCAPSEXT: CAP_SUPPORTEDCAPSEXT with scala.Double = js.native
  /* 4113 */ val CAP_THUMBNAILSENABLED: CAP_THUMBNAILSENABLED with scala.Double = js.native
  /* 4123 */ val CAP_TIMEBEFOREFIRSTCAPTURE: CAP_TIMEBEFOREFIRSTCAPTURE with scala.Double = js.native
  /* 4124 */ val CAP_TIMEBETWEENCAPTURES: CAP_TIMEBETWEENCAPTURES with scala.Double = js.native
  /* 4100 */ val CAP_TIMEDATE: CAP_TIMEDATE with scala.Double = js.native
  /* 4110 */ val CAP_UICONTROLLABLE: CAP_UICONTROLLABLE with scala.Double = js.native
  /* 1 */ val CAP_XFERCOUNT: CAP_XFERCOUNT with scala.Double = js.native
  /* 4352 */ val ICAP_AUTOBRIGHT: ICAP_AUTOBRIGHT with scala.Double = js.native
  /* 4404 */ val ICAP_AUTODISCARDBLANKPAGES: ICAP_AUTODISCARDBLANKPAGES with scala.Double = js.native
  /* 4432 */ val ICAP_AUTOMATICBORDERDETECTION: ICAP_AUTOMATICBORDERDETECTION with scala.Double = js.native
  /* 4441 */ val ICAP_AUTOMATICCOLORENABLED: ICAP_AUTOMATICCOLORENABLED with scala.Double = js.native
  /* 4442 */ val ICAP_AUTOMATICCOLORNONCOLORPIXELTYPE: ICAP_AUTOMATICCOLORNONCOLORPIXELTYPE with scala.Double = js.native
  /* 4439 */ val ICAP_AUTOMATICCROPUSESFRAME: ICAP_AUTOMATICCROPUSESFRAME with scala.Double = js.native
  /* 4433 */ val ICAP_AUTOMATICDESKEW: ICAP_AUTOMATICDESKEW with scala.Double = js.native
  /* 4440 */ val ICAP_AUTOMATICLENGTHDETECTION: ICAP_AUTOMATICLENGTHDETECTION with scala.Double = js.native
  /* 4434 */ val ICAP_AUTOMATICROTATE: ICAP_AUTOMATICROTATE with scala.Double = js.native
  /* 4438 */ val ICAP_AUTOSIZE: ICAP_AUTOSIZE with scala.Double = js.native
  /* 4407 */ val ICAP_BARCODEDETECTIONENABLED: ICAP_BARCODEDETECTIONENABLED with scala.Double = js.native
  /* 4412 */ val ICAP_BARCODEMAXRETRIES: ICAP_BARCODEMAXRETRIES with scala.Double = js.native
  /* 4409 */ val ICAP_BARCODEMAXSEARCHPRIORITIES: ICAP_BARCODEMAXSEARCHPRIORITIES with scala.Double = js.native
  /* 4411 */ val ICAP_BARCODESEARCHMODE: ICAP_BARCODESEARCHMODE with scala.Double = js.native
  /* 4410 */ val ICAP_BARCODESEARCHPRIORITIES: ICAP_BARCODESEARCHPRIORITIES with scala.Double = js.native
  /* 4413 */ val ICAP_BARCODETIMEOUT: ICAP_BARCODETIMEOUT with scala.Double = js.native
  /* 4395 */ val ICAP_BITDEPTH: ICAP_BITDEPTH with scala.Double = js.native
  /* 4396 */ val ICAP_BITDEPTHREDUCTION: ICAP_BITDEPTHREDUCTION with scala.Double = js.native
  /* 4380 */ val ICAP_BITORDER: ICAP_BITORDER with scala.Double = js.native
  /* 4390 */ val ICAP_BITORDERCODES: ICAP_BITORDERCODES with scala.Double = js.native
  /* 4353 */ val ICAP_BRIGHTNESS: ICAP_BRIGHTNESS with scala.Double = js.native
  /* 4381 */ val ICAP_CCITTKFACTOR: ICAP_CCITTKFACTOR with scala.Double = js.native
  /* 4443 */ val ICAP_COLORMANAGEMENTENABLED: ICAP_COLORMANAGEMENTENABLED with scala.Double = js.native
  /* 256 */ val ICAP_COMPRESSION: ICAP_COMPRESSION with scala.Double = js.native
  /* 4355 */ val ICAP_CONTRAST: ICAP_CONTRAST with scala.Double = js.native
  /* 4356 */ val ICAP_CUSTHALFTONE: ICAP_CUSTHALFTONE with scala.Double = js.native
  /* 4357 */ val ICAP_EXPOSURETIME: ICAP_EXPOSURETIME with scala.Double = js.native
  /* 4399 */ val ICAP_EXTIMAGEINFO: ICAP_EXTIMAGEINFO with scala.Double = js.native
  /* 4436 */ val ICAP_FEEDERTYPE: ICAP_FEEDERTYPE with scala.Double = js.native
  /* 4358 */ val ICAP_FILTER: ICAP_FILTER with scala.Double = js.native
  /* 4359 */ val ICAP_FLASHUSED: ICAP_FLASHUSED with scala.Double = js.native
  /* 4422 */ val ICAP_FLASHUSED2: ICAP_FLASHUSED2 with scala.Double = js.native
  /* 4406 */ val ICAP_FLIPROTATION: ICAP_FLIPROTATION with scala.Double = js.native
  /* 4372 */ val ICAP_FRAMES: ICAP_FRAMES with scala.Double = js.native
  /* 4360 */ val ICAP_GAMMA: ICAP_GAMMA with scala.Double = js.native
  /* 4361 */ val ICAP_HALFTONES: ICAP_HALFTONES with scala.Double = js.native
  /* 4362 */ val ICAP_HIGHLIGHT: ICAP_HIGHLIGHT with scala.Double = js.native
  /* 4437 */ val ICAP_ICCPROFILE: ICAP_ICCPROFILE with scala.Double = js.native
  /* 4364 */ val ICAP_IMAGEFILEFORMAT: ICAP_IMAGEFILEFORMAT with scala.Double = js.native
  /* 4423 */ val ICAP_IMAGEFILTER: ICAP_IMAGEFILTER with scala.Double = js.native
  /* 4444 */ val ICAP_IMAGEMERGE: ICAP_IMAGEMERGE with scala.Double = js.native
  /* 4445 */ val ICAP_IMAGEMERGEHEIGHTTHRESHOLD: ICAP_IMAGEMERGEHEIGHTTHRESHOLD with scala.Double = js.native
  /* 4392 */ val ICAP_JPEGPIXELTYPE: ICAP_JPEGPIXELTYPE with scala.Double = js.native
  /* 4435 */ val ICAP_JPEGQUALITY: ICAP_JPEGQUALITY with scala.Double = js.native
  /* 4365 */ val ICAP_LAMPSTATE: ICAP_LAMPSTATE with scala.Double = js.native
  /* 4382 */ val ICAP_LIGHTPATH: ICAP_LIGHTPATH with scala.Double = js.native
  /* 4366 */ val ICAP_LIGHTSOURCE: ICAP_LIGHTSOURCE with scala.Double = js.native
  /* 4378 */ val ICAP_MAXFRAMES: ICAP_MAXFRAMES with scala.Double = js.native
  /* 4400 */ val ICAP_MINIMUMHEIGHT: ICAP_MINIMUMHEIGHT with scala.Double = js.native
  /* 4401 */ val ICAP_MINIMUMWIDTH: ICAP_MINIMUMWIDTH with scala.Double = js.native
  /* 4424 */ val ICAP_NOISEFILTER: ICAP_NOISEFILTER with scala.Double = js.native
  /* 4368 */ val ICAP_ORIENTATION: ICAP_ORIENTATION with scala.Double = js.native
  /* 4425 */ val ICAP_OVERSCAN: ICAP_OVERSCAN with scala.Double = js.native
  /* 4415 */ val ICAP_PATCHCODEDETECTIONENABLED: ICAP_PATCHCODEDETECTIONENABLED with scala.Double = js.native
  /* 4420 */ val ICAP_PATCHCODEMAXRETRIES: ICAP_PATCHCODEMAXRETRIES with scala.Double = js.native
  /* 4417 */ val ICAP_PATCHCODEMAXSEARCHPRIORITIES: ICAP_PATCHCODEMAXSEARCHPRIORITIES with scala.Double = js.native
  /* 4419 */ val ICAP_PATCHCODESEARCHMODE: ICAP_PATCHCODESEARCHMODE with scala.Double = js.native
  /* 4418 */ val ICAP_PATCHCODESEARCHPRIORITIES: ICAP_PATCHCODESEARCHPRIORITIES with scala.Double = js.native
  /* 4421 */ val ICAP_PATCHCODETIMEOUT: ICAP_PATCHCODETIMEOUT with scala.Double = js.native
  /* 4370 */ val ICAP_PHYSICALHEIGHT: ICAP_PHYSICALHEIGHT with scala.Double = js.native
  /* 4369 */ val ICAP_PHYSICALWIDTH: ICAP_PHYSICALWIDTH with scala.Double = js.native
  /* 4383 */ val ICAP_PIXELFLAVOR: ICAP_PIXELFLAVOR with scala.Double = js.native
  /* 4391 */ val ICAP_PIXELFLAVORCODES: ICAP_PIXELFLAVORCODES with scala.Double = js.native
  /* 257 */ val ICAP_PIXELTYPE: ICAP_PIXELTYPE with scala.Double = js.native
  /* 4384 */ val ICAP_PLANARCHUNKY: ICAP_PLANARCHUNKY with scala.Double = js.native
  /* 4385 */ val ICAP_ROTATION: ICAP_ROTATION with scala.Double = js.native
  /* 4371 */ val ICAP_SHADOW: ICAP_SHADOW with scala.Double = js.native
  /* 4408 */ val ICAP_SUPPORTEDBARCODETYPES: ICAP_SUPPORTEDBARCODETYPES with scala.Double = js.native
  /* 4446 */ val ICAP_SUPPORTEDEXTIMAGEINFO: ICAP_SUPPORTEDEXTIMAGEINFO with scala.Double = js.native
  /* 4416 */ val ICAP_SUPPORTEDPATCHCODETYPES: ICAP_SUPPORTEDPATCHCODETYPES with scala.Double = js.native
  /* 4386 */ val ICAP_SUPPORTEDSIZES: ICAP_SUPPORTEDSIZES with scala.Double = js.native
  /* 4387 */ val ICAP_THRESHOLD: ICAP_THRESHOLD with scala.Double = js.native
  /* 4379 */ val ICAP_TILES: ICAP_TILES with scala.Double = js.native
  /* 4394 */ val ICAP_TIMEFILL: ICAP_TIMEFILL with scala.Double = js.native
  /* 4397 */ val ICAP_UNDEFINEDIMAGESIZE: ICAP_UNDEFINEDIMAGESIZE with scala.Double = js.native
  /* 258 */ val ICAP_UNITS: ICAP_UNITS with scala.Double = js.native
  /* 259 */ val ICAP_XFERMECH: ICAP_XFERMECH with scala.Double = js.native
  /* 4374 */ val ICAP_XNATIVERESOLUTION: ICAP_XNATIVERESOLUTION with scala.Double = js.native
  /* 4376 */ val ICAP_XRESOLUTION: ICAP_XRESOLUTION with scala.Double = js.native
  /* 4388 */ val ICAP_XSCALING: ICAP_XSCALING with scala.Double = js.native
  /* 4375 */ val ICAP_YNATIVERESOLUTION: ICAP_YNATIVERESOLUTION with scala.Double = js.native
  /* 4377 */ val ICAP_YRESOLUTION: ICAP_YRESOLUTION with scala.Double = js.native
  /* 4389 */ val ICAP_YSCALING: ICAP_YSCALING with scala.Double = js.native
  /* 4414 */ val ICAP_ZOOMFACTOR: ICAP_ZOOMFACTOR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_Cap with scala.Double] = js.native
}

