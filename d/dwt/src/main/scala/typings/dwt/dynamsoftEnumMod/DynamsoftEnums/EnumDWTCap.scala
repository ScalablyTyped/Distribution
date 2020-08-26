package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCap extends js.Object

/** Capabilities */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_Cap")
@js.native
object EnumDWTCap extends js.Object {
  /** Turns specific audible alarms on and off. */
  @js.native
  sealed trait CAP_ALARMS extends EnumDWTCap
  
  /**
    * The volume of a device's audible alarm. Note that this control affects the volume of all alarms;
    * no specific volume control for individual types of alarms is provided.
    */
  @js.native
  sealed trait CAP_ALARMVOLUME extends EnumDWTCap
  
  /** The name or other identifying information about the Author of the image. It may include a copyright string. */
  @js.native
  sealed trait CAP_AUTHOR extends EnumDWTCap
  
  /**
    * If TRUE, the Source will automatically feed the next page from the document feeder after the
    * number of frames negotiated for capture from each page are acquired. CAP_FEEDERENABLED
    * must be TRUE to use this capability.
    */
  @js.native
  sealed trait CAP_AUTOFEED extends EnumDWTCap
  
  /**
    * The number of images to automatically capture. This does not refer to the number of images to
    * be sent to the Application, use CAP_XFERCOUNT for that.
    */
  @js.native
  sealed trait CAP_AUTOMATICCAPTURE extends EnumDWTCap
  
  /** Added 2.1  */
  @js.native
  sealed trait CAP_AUTOMATICSENSEMEDIUM extends EnumDWTCap
  
  /**
    * This capability is intended to boost the performance of a Source. The fundamental assumption
    * behind AutoScan is that the device is able to capture the number of images indicated by the
    * value of CAP_XFERCOUNT without waiting for the Application to request the image transfers.
    * This is only possible if the device has internal buffers capable of caching the images it captures.
    * The default behavior is undefined, because some high volume devices are incapable of anything
    * but CAP_AUTOSCAN being equal to TRUE. However, if a Source supports FALSE, it should use it
    * as the mandatory default, since this best describes the behavior of pre-1.8 TWAIN Applications.
    */
  @js.native
  sealed trait CAP_AUTOSCAN extends EnumDWTCap
  
  /** The minutes of battery power remaining to the device. */
  @js.native
  sealed trait CAP_BATTERYMINUTES extends EnumDWTCap
  
  /** When used with CapGet(), return the percentage of battery power level on camera. If -1 is returned, it indicates that the battery is not present.  */
  @js.native
  sealed trait CAP_BATTERYPERCENTAGE extends EnumDWTCap
  
  /** Added 2.0  */
  @js.native
  sealed trait CAP_CAMERAENABLED extends EnumDWTCap
  
  /** Added 2.0    */
  @js.native
  sealed trait CAP_CAMERAORDER extends EnumDWTCap
  
  /** This capability queries the Source for UI support for preview mode. If TRUE, the Source supports preview UI. */
  @js.native
  sealed trait CAP_CAMERAPREVIEWUI extends EnumDWTCap
  
  /** Added 1.91  */
  @js.native
  sealed trait CAP_CAMERASIDE extends EnumDWTCap
  
  /** A general note about the acquired image. */
  @js.native
  sealed trait CAP_CAPTION extends EnumDWTCap
  
  /** CapGet() reports the presence of data in the scanner's buffers. CapSet() with a value of TWCB_CLEAR immediately clears the buffers. */
  @js.native
  sealed trait CAP_CLEARBUFFERS extends EnumDWTCap
  
  /**
    * If TRUE, the Source will eject the current page being acquired from and will leave the feeder
    * acquire area empty.
    * If CAP_AUTOFEED is TRUE, a fresh page will be advanced.
    * CAP_FEEDERENABLED must equal TRUE to use this capability.
    * This capability must have been negotiated as an extended capability to be used in States 5 and 6.
    */
  @js.native
  sealed trait CAP_CLEARPAGE extends EnumDWTCap
  
  @js.native
  sealed trait CAP_CUSTOMDSDATA extends EnumDWTCap
  
  /** Added 2.1  */
  @js.native
  sealed trait CAP_CUSTOMINTERFACEGUID extends EnumDWTCap
  
  /**
    * If TRUE, the physical hardware (e.g., scanner, digital camera, image database, etc.) that
    * represents the image source is attached, powered on, and communicating.
    */
  @js.native
  sealed trait CAP_DEVICEONLINE extends EnumDWTCap
  
  /**
    * The date and time of the device's clock.
    * Managed in the form "YYYY/MM/DD HH:mm:SS:sss" where YYYY is the year, MM is the
    * numerical month, DD is the numerical day, HH is the hour, mm is the minute, SS is the second,
    * and sss is the millisecond.
    */
  @js.native
  sealed trait CAP_DEVICETIMEDATE extends EnumDWTCap
  
  /**
    * This indicates whether the scanner supports duplex. If so, it further indicates whether one-path
    * or two-path duplex is supported.
    */
  @js.native
  sealed trait CAP_DUPLEX extends EnumDWTCap
  
  /**
    * The user can set the duplex option to be TRUE or FALSE. If TRUE, the scanner scans both sides
    * of a paper; otherwise, the scanner will scan only one side of the image.
    */
  @js.native
  sealed trait CAP_DUPLEXENABLED extends EnumDWTCap
  
  /** Allows an application to query a source to see if it implements the new user interface settings dialog.  */
  @js.native
  sealed trait CAP_ENABLEDSUIONLY extends EnumDWTCap
  
  /**
    * Allows the application to specify the starting endorser / imprinter number. All other endorser/
    * imprinter properties should be handled through the data source's user interface.
    * The user can set the starting number for the endorser.
    */
  @js.native
  sealed trait CAP_ENDORSER extends EnumDWTCap
  
  /** Allows the application and Source to negotiate capabilities to be used in States 5 and 6. */
  @js.native
  sealed trait CAP_EXTENDEDCAPS extends EnumDWTCap
  
  /**
    * Helps the Application determine any special actions it may need to take when negotiating
    * frames with the Source. Allowed values are listed in <see cref="TWCapFeederAlignment"/>.
    * TWFA_NONE: The alignment is free-floating. Applications should assume
    * that the origin for frames is on the left.
    * TWFA_LEFT: The alignment is to the left.
    * TWFA_CENTER: The alignment is centered. This means that the paper will
    * be fed in the middle of the ICAP_PHYSICALWIDTH of the
    * device. If this is set, then the Application should calculate
    * any frames with a left offset of zero.
    * TWFA_RIGHT: The alignment is to the right.
    */
  @js.native
  sealed trait CAP_FEEDERALIGNMENT extends EnumDWTCap
  
  /**
    * If TRUE, Source must acquire data from the document feeder acquire area and other feeder
    * capabilities can be used. If FALSE, Source must acquire data from the non-feeder acquire area
    * and no other feeder capabilities can be used.
    */
  @js.native
  sealed trait CAP_FEEDERENABLED extends EnumDWTCap
  
  /** Reflect whether there are documents loaded in the Source's feeder. */
  @js.native
  sealed trait CAP_FEEDERLOADED extends EnumDWTCap
  
  /**
    * TWFO_FIRSTPAGEFIRST if the feeder starts with the top of the first page.
    * TWFO_LASTPAGEFIRST is the feeder starts with the top of the last page.
    */
  @js.native
  sealed trait CAP_FEEDERORDER extends EnumDWTCap
  
  /** Added 2.0  */
  @js.native
  sealed trait CAP_FEEDERPOCKET extends EnumDWTCap
  
  /** Added 2.0   */
  @js.native
  sealed trait CAP_FEEDERPREP extends EnumDWTCap
  
  /**
    * If TRUE, the Source will eject the current page and advance the next page in the document feeder
    * into the feeder acquire area.
    * If CAP_AUTOFEED is TRUE, the same action just described will occur and CAP_AUTOFEED will
    * remain active.
    * CAP_FEEDERENABLED must equal TRUE to use this capability.
    * This capability must have been negotiated as an extended capability to be used in States 5 and 6.
    */
  @js.native
  sealed trait CAP_FEEDPAGE extends EnumDWTCap
  
  /**
    * If TRUE, the Source will display a progress indicator during acquisition and transfer, regardless
    * of whether the Source's user interface is active. If FALSE, the progress indicator will be
    * suppressed if the Source's user interface is inactive.
    * The Source will continue to display device-specific instructions and error messages even with
    * the Source user interface and progress indicators turned off.
    */
  @js.native
  sealed trait CAP_INDICATORS extends EnumDWTCap
  
  /**
    * Allows Application and Source to identify which languages they have in common for the exchange of string data,
    * and to select the language of the internal UI. Since the TWLG_xxxx codes include language and country data, there is no separate
    * capability for selecting the country.
    */
  @js.native
  sealed trait CAP_LANGUAGE extends EnumDWTCap
  
  /** Describes the number of pages that the scanner can buffer when CAP_AUTOSCAN is enabled. */
  @js.native
  sealed trait CAP_MAXBATCHBUFFERS extends EnumDWTCap
  
  /** Added 2.0  */
  @js.native
  sealed trait CAP_MICRENABLED extends EnumDWTCap
  
  /** Nothing. */
  @js.native
  sealed trait CAP_NONE extends EnumDWTCap
  
  /** This capability determines whether the device has a paper sensor that can detect documents on the ADF or Flatbed. */
  @js.native
  sealed trait CAP_PAPERDETECTABLE extends EnumDWTCap
  
  /** CapGet() reports the kinds of power available to the device. CapGetCurrent() reports the current power supply in use. */
  @js.native
  sealed trait CAP_POWERSUPPLY extends EnumDWTCap
  
  /**
    * CapGet() returns the current list of available printer devices, along with the one currently being used for negotiation.
    * CapSet() selects the current device for negotiation, and optionally constrains the list.
    * Top/Bottom refers to duplex devices, and indicates if the printer is writing on the top or the bottom of the sheet of paper.
    * Simplex devices use the top settings. Before/After indicates whether printing occurs before or after the sheet of paper has been scanned.
    */
  @js.native
  sealed trait CAP_PRINTER extends EnumDWTCap
  
  /** Turns the current CAP_PRINTER device on or off. */
  @js.native
  sealed trait CAP_PRINTERENABLED extends EnumDWTCap
  
  /** The User can set the starting number for the current CAP_PRINTER device. */
  @js.native
  sealed trait CAP_PRINTERINDEX extends EnumDWTCap
  
  /**
    * Specifies the appropriate current CAP_PRINTER device mode.
    * Note:
    * O TWPM_SINGLESTRING specifies that the printed text will consist of a single string.
    * O TWPM _MULTISTRING specifies that the printed text will consist of an enumerated list of
    * strings to be printed in order.
    * O TWPM _COMPOUNDSTRING specifies that the printed string will consist of a compound of a
    * String followed by a value followed by a suffix string.
    */
  @js.native
  sealed trait CAP_PRINTERMODE extends EnumDWTCap
  
  /**
    * Specifies the string(s) that are to be used in the string component when the current
    * CAP_PRINTER device is enabled.
    */
  @js.native
  sealed trait CAP_PRINTERSTRING extends EnumDWTCap
  
  /** Specifies the string that shall be used as the current CAP_PRINTER device's suffix. */
  @js.native
  sealed trait CAP_PRINTERSUFFIX extends EnumDWTCap
  
  /**
    * Indicates whether the physical hardware (e.g. scanner, digital camera) is capable of acquiring
    * multiple images of the same page without changes to the physical registration of that page.
    */
  @js.native
  sealed trait CAP_REACQUIREALLOWED extends EnumDWTCap
  
  /**
    * If TRUE, the Source will return the current page to the input side of the document feeder and
    * feed the last page from the output side of the feeder back into the acquisition area.
    * If CAP_AUTOFEED is TRUE, automatic feeding will continue after all negotiated frames from this
    * page are acquired.
    * CAP_FEEDERENABLED must equal TRUE to use this capability.
    * This capability must have been negotiated as an extended capability to be used in States 5 and 6.
    */
  @js.native
  sealed trait CAP_REWINDPAGE extends EnumDWTCap
  
  /** Added 1.91   */
  @js.native
  sealed trait CAP_SEGMENTED extends EnumDWTCap
  
  /**
    * A string containing the serial number of the currently selected device in the Source. Multiple
    * devices may all report the same serial number.
    */
  @js.native
  sealed trait CAP_SERIALNUMBER extends EnumDWTCap
  
  /**
    * Returns a list of all the capabilities for which the Source will answer inquiries. Does not indicate
    * which capabilities the Source will allow to be set by the application. Some capabilities can only
    * be set if certain setup work has been done so the Source cannot globally answer which
    * capabilities are "set-able."
    */
  @js.native
  sealed trait CAP_SUPPORTEDCAPS extends EnumDWTCap
  
  /**
    * Returns a list of all the capabilities for which the Source will answer inquiries. Does not indicate
    * which capabilities the Source will allow to be set by the application. Some capabilities can only
    * be set if certain setup work has been done so the Source cannot globally answer which
    * capabilities are "set-able."
    */
  @js.native
  sealed trait CAP_SUPPORTEDCAPSEXT extends EnumDWTCap
  
  /**
    * Allows an application to request the delivery of thumbnail representations for the set of images
    * that are to be delivered.
    * Setting CAP_THUMBNAILSENABLED to TRUE turns on thumbnail mode. Images transferred
    * thereafter will be sent at thumbnail size (exact thumbnail size is determined by the Data Source).
    * Setting this capability to FALSE turns thumbnail mode off and returns full size images.
    */
  @js.native
  sealed trait CAP_THUMBNAILSENABLED extends EnumDWTCap
  
  /**
    * For automatic capture, this value selects the number of milliseconds before the first picture is to
    * be taken, or the first image is to be scanned.
    */
  @js.native
  sealed trait CAP_TIMEBEFOREFIRSTCAPTURE extends EnumDWTCap
  
  /** For automatic capture, this value selects the milliseconds to wait between pictures taken, or images scanned. */
  @js.native
  sealed trait CAP_TIMEBETWEENCAPTURES extends EnumDWTCap
  
  /**
    * The date and time the image was acquired.
    * Stored in the form "YYYY/MM/DD HH:mm:SS.sss" where YYYY is the year, MM is the
    * numerical month, DD is the numerical day, HH is the hour, mm is the minute, SS is the second,
    * and sss is the millisecond.
    */
  @js.native
  sealed trait CAP_TIMEDATE extends EnumDWTCap
  
  /**
    * If TRUE, indicates that this Source supports acquisition with the UI disabled; i.e.,
    * TW_USERINTERFACE's ShowUI field can be set to FALSE. If FALSE, indicates that this Source
    * can only support acquisition with the UI enabled.
    */
  @js.native
  sealed trait CAP_UICONTROLLABLE extends EnumDWTCap
  
  /** The application is willing to accept this number of images. */
  @js.native
  sealed trait CAP_XFERCOUNT extends EnumDWTCap
  
  /** TRUE enables and FALSE disables the Source's Auto-brightness function (if any). */
  @js.native
  sealed trait ICAP_AUTOBRIGHT extends EnumDWTCap
  
  /**
    * Use this capability to have the Source discard blank images. The Application never sees these
    * images during the scanning session.
    * TWBP_DISABLE – this must be the default state for the Source. It indicates that all images will
    * be delivered to the Application, none of them will be discarded.
    * TWBP_AUTO – if this is used, then the Source will decide if an image is blank or not and discard
    * as appropriate.
    * If the specified value is a positive number in the range 0 to 231–1, then this capability will use it
    * as the byte size cutoff point to identify which images are to be discarded. If the size of the image
    * is less than or equal to this value, then it will be discarded. If the size of the image is greater
    * than this value, then it will be kept so that it can be transferred to the Application.
    */
  @js.native
  sealed trait ICAP_AUTODISCARDBLANKPAGES extends EnumDWTCap
  
  /** Turns automatic border detection on and off. */
  @js.native
  sealed trait ICAP_AUTOMATICBORDERDETECTION extends EnumDWTCap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICCOLORENABLED extends EnumDWTCap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICCOLORNONCOLORPIXELTYPE extends EnumDWTCap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICCROPUSESFRAME extends EnumDWTCap
  
  /** Turns automatic deskew correction on and off. */
  @js.native
  sealed trait ICAP_AUTOMATICDESKEW extends EnumDWTCap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICLENGTHDETECTION extends EnumDWTCap
  
  /**
    * When TRUE this capability depends on intelligent features within the Source to automatically
    * rotate the image to the correct position.
    */
  @js.native
  sealed trait ICAP_AUTOMATICROTATE extends EnumDWTCap
  
  /** Added 2.0   */
  @js.native
  sealed trait ICAP_AUTOSIZE extends EnumDWTCap
  
  /** Turns bar code detection on and off. */
  @js.native
  sealed trait ICAP_BARCODEDETECTIONENABLED extends EnumDWTCap
  
  /** Restricts the number of times a search will be retried if none are found on each page. */
  @js.native
  sealed trait ICAP_BARCODEMAXRETRIES extends EnumDWTCap
  
  /** The maximum number of supported search priorities. */
  @js.native
  sealed trait ICAP_BARCODEMAXSEARCHPRIORITIES extends EnumDWTCap
  
  /** Restricts bar code searching to certain orientations, or prioritizes one orientation over the other. */
  @js.native
  sealed trait ICAP_BARCODESEARCHMODE extends EnumDWTCap
  
  /** A prioritized list of bar code types dictating the order in which bar codes will be sought. */
  @js.native
  sealed trait ICAP_BARCODESEARCHPRIORITIES extends EnumDWTCap
  
  /** Restricts the total time spent on searching for a bar code on each page. */
  @js.native
  sealed trait ICAP_BARCODETIMEOUT extends EnumDWTCap
  
  /**
    * Specifies the pixel bit depths for the Current value of ICAP_PIXELTYPE. For example, when
    * using ICAP_PIXELTYPE:TWPT_GRAY, this capability specifies whether this is 8-bit gray or 4-bit gray.
    * This depth applies to all the data channels (for instance, the R, G, and B channels will all have
    * this same bit depth for RGB data).
    */
  @js.native
  sealed trait ICAP_BITDEPTH extends EnumDWTCap
  
  /**
    * Specifies the Reduction Method the Source should use to reduce the bit depth of the data. Most
    * commonly used with ICAP_PIXELTYPE:TWPT_BW to reduce gray data to black and white.
    */
  @js.native
  sealed trait ICAP_BITDEPTHREDUCTION extends EnumDWTCap
  
  /**
    * Specifies how the bytes in an image are filled by the Source. TWBO_MSBFIRST indicates that the leftmost bit in the byte (usually bit 7) is
    * the byte's Most Significant Bit.
    */
  @js.native
  sealed trait ICAP_BITORDER extends EnumDWTCap
  
  /** Used for CCITT data compression only. Indicates the bit order representation of the stored compressed codes. */
  @js.native
  sealed trait ICAP_BITORDERCODES extends EnumDWTCap
  
  /** The brightness values available within the Source. */
  @js.native
  sealed trait ICAP_BRIGHTNESS extends EnumDWTCap
  
  /**
    * Used for CCITT Group 3 2-dimensional compression. The 'K' factor indicates how often the
    * new compression baseline should be re-established. A value of 2 or 4 is common in facsimile
    * communication. A value of zero in this field will indicate an infinite K factor—the baseline is
    * only calculated at the beginning of the transfer.
    */
  @js.native
  sealed trait ICAP_CCITTKFACTOR extends EnumDWTCap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_COLORMANAGEMENTENABLED extends EnumDWTCap
  
  /**
    * Allows the application and Source to identify which compression schemes they have in
    * common for Buffered Memory and File transfers.
    * Note for File transfers:
    * Since only certain file formats support compression, this capability must be negotiated after
    * setting the desired file format with ICAP_IMAGEFILEFORMAT.
    */
  @js.native
  sealed trait ICAP_COMPRESSION extends EnumDWTCap
  
  /** The contrast values available within the Source. */
  @js.native
  sealed trait ICAP_CONTRAST extends EnumDWTCap
  
  /** Specifies the square-cell halftone (dithering) matrix the Source should use to halftone the image. */
  @js.native
  sealed trait ICAP_CUSTHALFTONE extends EnumDWTCap
  
  /** Specifies the exposure time used to capture the image, in seconds. */
  @js.native
  sealed trait ICAP_EXPOSURETIME extends EnumDWTCap
  
  /**
    * Allows the application to query the data source to see if it supports extended image attribute capabilities,
    * such as Barcode Recognition, Shaded Area Detection and Removal, Skew detection and Removal, and so on.
    */
  @js.native
  sealed trait ICAP_EXTIMAGEINFO extends EnumDWTCap
  
  /** Added 1.91   */
  @js.native
  sealed trait ICAP_FEEDERTYPE extends EnumDWTCap
  
  /**
    * Describes the color characteristic of the subtractive filter applied to the image data.
    * Multiple filters may be applied to a single acquisition.
    */
  @js.native
  sealed trait ICAP_FILTER extends EnumDWTCap
  
  /** Specifies whether or not the image was acquired using a flash. */
  @js.native
  sealed trait ICAP_FLASHUSED extends EnumDWTCap
  
  /**
    * For devices that support flash. CapSet() selects the flash to be used (if any). CapGet() reports the current setting.
    * This capability replaces ICAP_FLASHUSED, which is only able to negotiate the flash being on or off.
    */
  @js.native
  sealed trait ICAP_FLASHUSED2 extends EnumDWTCap
  
  /**
    * Flip rotation is used to properly orient images that flip orientation every other image.
    * TWFR_BOOK The images to be scanned are viewed in book form, flipping each page from left to right or right to left.
    * TWFR_FANFOLD The images to be scanned are viewed in fanfold paper style, flipping each page up or down.
    */
  @js.native
  sealed trait ICAP_FLIPROTATION extends EnumDWTCap
  
  /** The list of frames the Source will acquire on each page. */
  @js.native
  sealed trait ICAP_FRAMES extends EnumDWTCap
  
  /** Gamma correction value for the image data. */
  @js.native
  sealed trait ICAP_GAMMA extends EnumDWTCap
  
  /** A list of names of the halftone patterns available within the Source. */
  @js.native
  sealed trait ICAP_HALFTONES extends EnumDWTCap
  
  /**
    * Specifies which value in an image should be interpreted as the lightest "highlight." All values
    * "lighter" than this value will be clipped to this value. Whether lighter values are smaller or
    * larger can be determined by examining the Current value of ICAP_PIXELFLAVOR.
    */
  @js.native
  sealed trait ICAP_HIGHLIGHT extends EnumDWTCap
  
  /** Added 1.91  */
  @js.native
  sealed trait ICAP_ICCPROFILE extends EnumDWTCap
  
  /**
    * Informs the application which file formats the Source can generate (CapGet()). Tells the Source which file formats the application can handle (CapSet()).
    * TWFF_TIFF Used for document
    * TWFF_PICT Native Macintosh
    * TWFF_BMP Native Microsoft
    * TWFF_XBM Used for document
    * TWFF_JFIF Wrapper for JPEG
    * TWFF_FPX FlashPix, used with digital
    * TWFF_TIFFMULTI Multi-page TIFF files
    * TWFF_PNG An image format standard intended for use on the web, replaces GIF
    * TWFF_SPIFF A standard from JPEG, intended to replace JFIF, also supports JBIG
    * TWFF_EXIF File format for use with digital cameras.
    */
  @js.native
  sealed trait ICAP_IMAGEFILEFORMAT extends EnumDWTCap
  
  /** For devices that support image enhancement filtering. This capability selects the algorithm used to improve the quality of the image. */
  @js.native
  sealed trait ICAP_IMAGEFILTER extends EnumDWTCap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_IMAGEMERGE extends EnumDWTCap
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_IMAGEMERGEHEIGHTTHRESHOLD extends EnumDWTCap
  
  /**
    * Allows the application and Source to agree upon a common set of color descriptors that are
    * made available by the Source. This ICAP is only useful for JPEG-compressed buffered memory image transfers.
    */
  @js.native
  sealed trait ICAP_JPEGPIXELTYPE extends EnumDWTCap
  
  /** Added 1.9  */
  @js.native
  sealed trait ICAP_JPEGQUALITY extends EnumDWTCap
  
  /** TRUE means the lamp is currently, or should be set to ON. Sources may not support CapSet() operations.  */
  @js.native
  sealed trait ICAP_LAMPSTATE extends EnumDWTCap
  
  /** Describes whether the image was captured transmissively or reflectively. */
  @js.native
  sealed trait ICAP_LIGHTPATH extends EnumDWTCap
  
  /** Describes the general color characteristic of the light source used to acquire the image. */
  @js.native
  sealed trait ICAP_LIGHTSOURCE extends EnumDWTCap
  
  /**
    * The maximum number of frames the Source can provide or the application can accept per page.
    * This is a bounding capability only. It does not establish current or future behavior.
    */
  @js.native
  sealed trait ICAP_MAXFRAMES extends EnumDWTCap
  
  /** Allows the source to define the minimum height (Y-axis) that the source can acquire. */
  @js.native
  sealed trait ICAP_MINIMUMHEIGHT extends EnumDWTCap
  
  /** Allows the source to define theminimum width (X-axis) that the source can acquire. */
  @js.native
  sealed trait ICAP_MINIMUMWIDTH extends EnumDWTCap
  
  /** For devices that support noise filtering. This capability selects the algorithm used to remove noise. */
  @js.native
  sealed trait ICAP_NOISEFILTER extends EnumDWTCap
  
  /**
    * Defines which edge of the "paper" the image's "top" is aligned with. This information is used to adjust the frames to match the
    * scanning orientation of the paper. For instance, if an ICAP_SUPPORTEDSIZE of TWSS_ISOA4 has been negotiated,
    * and ICAP_ORIENTATION is set to TWOR_LANDSCAPE, then the Source must rotate the frame it downloads to the scanner to reflect the
    * orientation of the paper. Please note that setting ICAP_ORIENTATION does not affect the values reported by ICAP_FRAMES;
    * it just causes the Source to use them in a different way. The upper-left of the image is defined as the location where both the primary and
    * secondary scans originate. (The X axis is the primary scan direction and the Y axis is the secondary scan direction.)
    * For a flatbed scanner, the light bar moves in the secondary scan direction. For a handheld scanner, the scanner is drug in the
    * secondary scan direction. For a digital camera, the secondary direction is the vertical axis when the viewed image is considered upright.
    */
  @js.native
  sealed trait ICAP_ORIENTATION extends EnumDWTCap
  
  /**
    * Overscan is used to scan outside of the boundaries described by ICAP_FRAMES, and is used to help acquire image data that
    * may be lost because of skewing.
    * This is primarily of use for transport scanners which rely on edge detection to begin scanning.
    * If overscan is supported, then the device is capable of scanning in the inter-document gap to get the skewed image information.
    */
  @js.native
  sealed trait ICAP_OVERSCAN extends EnumDWTCap
  
  /** Turns patch code detection on and off. */
  @js.native
  sealed trait ICAP_PATCHCODEDETECTIONENABLED extends EnumDWTCap
  
  /** Restricts the number of times a search will be retried if none are found on each page. */
  @js.native
  sealed trait ICAP_PATCHCODEMAXRETRIES extends EnumDWTCap
  
  /** The maximum number of supported search priorities. */
  @js.native
  sealed trait ICAP_PATCHCODEMAXSEARCHPRIORITIES extends EnumDWTCap
  
  /** Restricts patch code searching to certain orientations, or prioritizes one orientation over the other. */
  @js.native
  sealed trait ICAP_PATCHCODESEARCHMODE extends EnumDWTCap
  
  /** A prioritized list of patch code types dictating the order in which patch codes will be sought. */
  @js.native
  sealed trait ICAP_PATCHCODESEARCHPRIORITIES extends EnumDWTCap
  
  /** Restricts the total time spent on searching for a patch code on each page. */
  @js.native
  sealed trait ICAP_PATCHCODETIMEOUT extends EnumDWTCap
  
  /** The maximum physical height (Y-axis) the Source can acquire (measured in units of ICAP_UNITS). */
  @js.native
  sealed trait ICAP_PHYSICALHEIGHT extends EnumDWTCap
  
  /** The maximum physical width (X-axis) the Source can acquire (measured in units of ICAP_UNITS). */
  @js.native
  sealed trait ICAP_PHYSICALWIDTH extends EnumDWTCap
  
  /** Sense of the pixel whose numeric value is zero (minimum data value).  */
  @js.native
  sealed trait ICAP_PIXELFLAVOR extends EnumDWTCap
  
  /**
    * Used only for CCITT data compression. Specifies whether the compressed codes' pixel "sense"
    * will be inverted from the Current value of ICAP_PIXELFLAVOR prior to transfer.
    */
  @js.native
  sealed trait ICAP_PIXELFLAVORCODES extends EnumDWTCap
  
  /** The type of pixel data that a Source is capable of acquiring (for example, black and white, gray, RGB, etc.). */
  @js.native
  sealed trait ICAP_PIXELTYPE extends EnumDWTCap
  
  /**
    * Allows the application and Source to identify which color data formats are available. There are
    * two options, "planar" and "chunky."
    */
  @js.native
  sealed trait ICAP_PLANARCHUNKY extends EnumDWTCap
  
  /**
    * How the Source can/should rotate the scanned image data prior to transfer. This doesn't use
    * ICAP_UNITS. It is always measured in degrees. Any applied value is additive with any
    * rotation specified in ICAP_ORIENTATION.
    */
  @js.native
  sealed trait ICAP_ROTATION extends EnumDWTCap
  
  /**
    * Specifies which value in an image should be interpreted as the darkest "shadow." All values
    * "darker" than this value will be clipped to this value.
    */
  @js.native
  sealed trait ICAP_SHADOW extends EnumDWTCap
  
  /** Provides a list of bar code types that can be detected by the current Data Source. */
  @js.native
  sealed trait ICAP_SUPPORTEDBARCODETYPES extends EnumDWTCap
  
  /** Added 2.1   */
  @js.native
  sealed trait ICAP_SUPPORTEDEXTIMAGEINFO extends EnumDWTCap
  
  /** A list of patch code types that may be detected by the current Data Source. */
  @js.native
  sealed trait ICAP_SUPPORTEDPATCHCODETYPES extends EnumDWTCap
  
  /**
    * For devices that support fixed frame sizes.
    * Defined sizes match typical page sizes. This specifies the size(s) the Source can/should use to acquire image data.
    */
  @js.native
  sealed trait ICAP_SUPPORTEDSIZES extends EnumDWTCap
  
  /**
    * Specifies the dividing line between black and white. This is the value the Source will use to
    * threshold, if needed, when ICAP_PIXELTYPE:TWPT_BW.
    * The value is normalized so there are no units of measure associated with this ICAP.
    */
  @js.native
  sealed trait ICAP_THRESHOLD extends EnumDWTCap
  
  /** This is used with buffered memory transfers. If TRUE, Source can provide application with tiled image data. */
  @js.native
  sealed trait ICAP_TILES extends EnumDWTCap
  
  /** Used only with CCITT data compression. Specifies the minimum number of words of compressed codes (compressed data) to be transmitted per line. */
  @js.native
  sealed trait ICAP_TIMEFILL extends EnumDWTCap
  
  /**
    * If TRUE the Source will issue a MSG_XFERREADY before starting the scan.
    * Note: The Source may need to scan the image before initiating the transfer.
    * This is the case if the scanned image is rotated or merged with another scanned image.
    */
  @js.native
  sealed trait ICAP_UNDEFINEDIMAGESIZE extends EnumDWTCap
  
  /**
    * Unless a quantity is dimensionless or uses a specified unit of measure, ICAP_UNITS determines
    * the unit of measure for all quantities.
    */
  @js.native
  sealed trait ICAP_UNITS extends EnumDWTCap
  
  /** Allows the application and Source to identify which transfer mechanisms the source supports. */
  @js.native
  sealed trait ICAP_XFERMECH extends EnumDWTCap
  
  /**
    * The native optical resolution along the X-axis of the device being controlled by the Source. Most
    * devices will respond with a single value (TW_ONEVALUE).
    * This is NOT a list of all resolutions that can be generated by the device. Rather, this is the
    * resolution of the device's optics. Measured in units of pixels per unit as defined by
    * ICAP_UNITS (pixels per TWUN_PIXELS yields dimensionless data).
    */
  @js.native
  sealed trait ICAP_XNATIVERESOLUTION extends EnumDWTCap
  
  /**
    * All the X-axis resolutions the Source can provide.
    * Measured in units of pixels per unit as defined by ICAP_UNITS (pixels per TWUN_PIXELS
    * yields dimensionless data). That is, when the units are TWUN_PIXELS, both
    * ICAP_XRESOLUTION and ICAP_YRESOLUTION shall report 1 pixel/pixel. Some data sources
    * like to report the actual number of pixels that the device reports, but that response is more
    * appropriate in ICAP_PHYSICALHEIGHT and ICAP_PHYSICALWIDTH.
    */
  @js.native
  sealed trait ICAP_XRESOLUTION extends EnumDWTCap
  
  /**
    * All the X-axis scaling values available. A value of '1.0' is equivalent to 100% scaling.
    * Do not use values less than or equal to zero.
    */
  @js.native
  sealed trait ICAP_XSCALING extends EnumDWTCap
  
  /**
    * The native optical resolution along the Y-axis of the device being controlled by the Source.
    * Measured in units of pixels per unit as defined by ICAP_UNITS (pixels per TWUN_PIXELS
    * yields dimensionless data).
    */
  @js.native
  sealed trait ICAP_YNATIVERESOLUTION extends EnumDWTCap
  
  /**
    * All the Y-axis resolutions the Source can provide.
    * Measured in units of pixels per unit as defined by ICAP_UNITS (pixels per TWUN_PIXELS
    * yields dimensionless data). That is, when the units are TWUN_PIXELS, both
    * ICAP_XRESOLUTION and ICAP_YRESOLUTION shall report 1 pixel/pixel. Some data sources
    * like to report the actual number of pixels that the device reports, but that response is more
    * appropriate in ICAP_PHYSICALHEIGHT and ICAP_PHYSICALWIDTH.
    */
  @js.native
  sealed trait ICAP_YRESOLUTION extends EnumDWTCap
  
  /**
    * All the Y-axis scaling values available. A value of '1.0' is equivalent to 100% scaling. Do not use values less than or equal to zero.
    * There are no units inherent with this data as it is normalized to 1.0 being "unscaled."
    */
  @js.native
  sealed trait ICAP_YSCALING extends EnumDWTCap
  
  /** When used with CapGet(), returns all camera supported lens zooming range.  */
  @js.native
  sealed trait ICAP_ZOOMFACTOR extends EnumDWTCap
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCap with Double] = js.native
  /* 4120 */ @js.native
  object CAP_ALARMS extends TopLevel[CAP_ALARMS with Double]
  
  /* 4121 */ @js.native
  object CAP_ALARMVOLUME extends TopLevel[CAP_ALARMVOLUME with Double]
  
  /* 4096 */ @js.native
  object CAP_AUTHOR extends TopLevel[CAP_AUTHOR with Double]
  
  /* 4103 */ @js.native
  object CAP_AUTOFEED extends TopLevel[CAP_AUTOFEED with Double]
  
  /* 4122 */ @js.native
  object CAP_AUTOMATICCAPTURE extends TopLevel[CAP_AUTOMATICCAPTURE with Double]
  
  /* 4155 */ @js.native
  object CAP_AUTOMATICSENSEMEDIUM extends TopLevel[CAP_AUTOMATICSENSEMEDIUM with Double]
  
  /* 4112 */ @js.native
  object CAP_AUTOSCAN extends TopLevel[CAP_AUTOSCAN with Double]
  
  /* 4146 */ @js.native
  object CAP_BATTERYMINUTES extends TopLevel[CAP_BATTERYMINUTES with Double]
  
  /* 4147 */ @js.native
  object CAP_BATTERYPERCENTAGE extends TopLevel[CAP_BATTERYPERCENTAGE with Double]
  
  /* 4150 */ @js.native
  object CAP_CAMERAENABLED extends TopLevel[CAP_CAMERAENABLED with Double]
  
  /* 4151 */ @js.native
  object CAP_CAMERAORDER extends TopLevel[CAP_CAMERAORDER with Double]
  
  /* 4129 */ @js.native
  object CAP_CAMERAPREVIEWUI extends TopLevel[CAP_CAMERAPREVIEWUI with Double]
  
  /* 4148 */ @js.native
  object CAP_CAMERASIDE extends TopLevel[CAP_CAMERASIDE with Double]
  
  /* 4097 */ @js.native
  object CAP_CAPTION extends TopLevel[CAP_CAPTION with Double]
  
  /* 4125 */ @js.native
  object CAP_CLEARBUFFERS extends TopLevel[CAP_CLEARBUFFERS with Double]
  
  /* 4104 */ @js.native
  object CAP_CLEARPAGE extends TopLevel[CAP_CLEARPAGE with Double]
  
  /* 4117 */ @js.native
  object CAP_CUSTOMDSDATA extends TopLevel[CAP_CUSTOMDSDATA with Double]
  
  /* 4156 */ @js.native
  object CAP_CUSTOMINTERFACEGUID extends TopLevel[CAP_CUSTOMINTERFACEGUID with Double]
  
  /* 4111 */ @js.native
  object CAP_DEVICEONLINE extends TopLevel[CAP_DEVICEONLINE with Double]
  
  /* 4127 */ @js.native
  object CAP_DEVICETIMEDATE extends TopLevel[CAP_DEVICETIMEDATE with Double]
  
  /* 4114 */ @js.native
  object CAP_DUPLEX extends TopLevel[CAP_DUPLEX with Double]
  
  /* 4115 */ @js.native
  object CAP_DUPLEXENABLED extends TopLevel[CAP_DUPLEXENABLED with Double]
  
  /* 4116 */ @js.native
  object CAP_ENABLEDSUIONLY extends TopLevel[CAP_ENABLEDSUIONLY with Double]
  
  /* 4118 */ @js.native
  object CAP_ENDORSER extends TopLevel[CAP_ENDORSER with Double]
  
  /* 4102 */ @js.native
  object CAP_EXTENDEDCAPS extends TopLevel[CAP_EXTENDEDCAPS with Double]
  
  /* 4141 */ @js.native
  object CAP_FEEDERALIGNMENT extends TopLevel[CAP_FEEDERALIGNMENT with Double]
  
  /* 4098 */ @js.native
  object CAP_FEEDERENABLED extends TopLevel[CAP_FEEDERENABLED with Double]
  
  /* 4099 */ @js.native
  object CAP_FEEDERLOADED extends TopLevel[CAP_FEEDERLOADED with Double]
  
  /* 4142 */ @js.native
  object CAP_FEEDERORDER extends TopLevel[CAP_FEEDERORDER with Double]
  
  /* 4154 */ @js.native
  object CAP_FEEDERPOCKET extends TopLevel[CAP_FEEDERPOCKET with Double]
  
  /* 4153 */ @js.native
  object CAP_FEEDERPREP extends TopLevel[CAP_FEEDERPREP with Double]
  
  /* 4105 */ @js.native
  object CAP_FEEDPAGE extends TopLevel[CAP_FEEDPAGE with Double]
  
  /* 4107 */ @js.native
  object CAP_INDICATORS extends TopLevel[CAP_INDICATORS with Double]
  
  /* 4140 */ @js.native
  object CAP_LANGUAGE extends TopLevel[CAP_LANGUAGE with Double]
  
  /* 4126 */ @js.native
  object CAP_MAXBATCHBUFFERS extends TopLevel[CAP_MAXBATCHBUFFERS with Double]
  
  /* 4152 */ @js.native
  object CAP_MICRENABLED extends TopLevel[CAP_MICRENABLED with Double]
  
  /* 0 */ @js.native
  object CAP_NONE extends TopLevel[CAP_NONE with Double]
  
  /* 4109 */ @js.native
  object CAP_PAPERDETECTABLE extends TopLevel[CAP_PAPERDETECTABLE with Double]
  
  /* 4128 */ @js.native
  object CAP_POWERSUPPLY extends TopLevel[CAP_POWERSUPPLY with Double]
  
  /* 4134 */ @js.native
  object CAP_PRINTER extends TopLevel[CAP_PRINTER with Double]
  
  /* 4135 */ @js.native
  object CAP_PRINTERENABLED extends TopLevel[CAP_PRINTERENABLED with Double]
  
  /* 4136 */ @js.native
  object CAP_PRINTERINDEX extends TopLevel[CAP_PRINTERINDEX with Double]
  
  /* 4137 */ @js.native
  object CAP_PRINTERMODE extends TopLevel[CAP_PRINTERMODE with Double]
  
  /* 4138 */ @js.native
  object CAP_PRINTERSTRING extends TopLevel[CAP_PRINTERSTRING with Double]
  
  /* 4139 */ @js.native
  object CAP_PRINTERSUFFIX extends TopLevel[CAP_PRINTERSUFFIX with Double]
  
  /* 4144 */ @js.native
  object CAP_REACQUIREALLOWED extends TopLevel[CAP_REACQUIREALLOWED with Double]
  
  /* 4106 */ @js.native
  object CAP_REWINDPAGE extends TopLevel[CAP_REWINDPAGE with Double]
  
  /* 4149 */ @js.native
  object CAP_SEGMENTED extends TopLevel[CAP_SEGMENTED with Double]
  
  /* 4132 */ @js.native
  object CAP_SERIALNUMBER extends TopLevel[CAP_SERIALNUMBER with Double]
  
  /* 4101 */ @js.native
  object CAP_SUPPORTEDCAPS extends TopLevel[CAP_SUPPORTEDCAPS with Double]
  
  /* 4108 */ @js.native
  object CAP_SUPPORTEDCAPSEXT extends TopLevel[CAP_SUPPORTEDCAPSEXT with Double]
  
  /* 4113 */ @js.native
  object CAP_THUMBNAILSENABLED extends TopLevel[CAP_THUMBNAILSENABLED with Double]
  
  /* 4123 */ @js.native
  object CAP_TIMEBEFOREFIRSTCAPTURE extends TopLevel[CAP_TIMEBEFOREFIRSTCAPTURE with Double]
  
  /* 4124 */ @js.native
  object CAP_TIMEBETWEENCAPTURES extends TopLevel[CAP_TIMEBETWEENCAPTURES with Double]
  
  /* 4100 */ @js.native
  object CAP_TIMEDATE extends TopLevel[CAP_TIMEDATE with Double]
  
  /* 4110 */ @js.native
  object CAP_UICONTROLLABLE extends TopLevel[CAP_UICONTROLLABLE with Double]
  
  /* 1 */ @js.native
  object CAP_XFERCOUNT extends TopLevel[CAP_XFERCOUNT with Double]
  
  /* 4352 */ @js.native
  object ICAP_AUTOBRIGHT extends TopLevel[ICAP_AUTOBRIGHT with Double]
  
  /* 4404 */ @js.native
  object ICAP_AUTODISCARDBLANKPAGES extends TopLevel[ICAP_AUTODISCARDBLANKPAGES with Double]
  
  /* 4432 */ @js.native
  object ICAP_AUTOMATICBORDERDETECTION extends TopLevel[ICAP_AUTOMATICBORDERDETECTION with Double]
  
  /* 4441 */ @js.native
  object ICAP_AUTOMATICCOLORENABLED extends TopLevel[ICAP_AUTOMATICCOLORENABLED with Double]
  
  /* 4442 */ @js.native
  object ICAP_AUTOMATICCOLORNONCOLORPIXELTYPE extends TopLevel[ICAP_AUTOMATICCOLORNONCOLORPIXELTYPE with Double]
  
  /* 4439 */ @js.native
  object ICAP_AUTOMATICCROPUSESFRAME extends TopLevel[ICAP_AUTOMATICCROPUSESFRAME with Double]
  
  /* 4433 */ @js.native
  object ICAP_AUTOMATICDESKEW extends TopLevel[ICAP_AUTOMATICDESKEW with Double]
  
  /* 4440 */ @js.native
  object ICAP_AUTOMATICLENGTHDETECTION extends TopLevel[ICAP_AUTOMATICLENGTHDETECTION with Double]
  
  /* 4434 */ @js.native
  object ICAP_AUTOMATICROTATE extends TopLevel[ICAP_AUTOMATICROTATE with Double]
  
  /* 4438 */ @js.native
  object ICAP_AUTOSIZE extends TopLevel[ICAP_AUTOSIZE with Double]
  
  /* 4407 */ @js.native
  object ICAP_BARCODEDETECTIONENABLED extends TopLevel[ICAP_BARCODEDETECTIONENABLED with Double]
  
  /* 4412 */ @js.native
  object ICAP_BARCODEMAXRETRIES extends TopLevel[ICAP_BARCODEMAXRETRIES with Double]
  
  /* 4409 */ @js.native
  object ICAP_BARCODEMAXSEARCHPRIORITIES extends TopLevel[ICAP_BARCODEMAXSEARCHPRIORITIES with Double]
  
  /* 4411 */ @js.native
  object ICAP_BARCODESEARCHMODE extends TopLevel[ICAP_BARCODESEARCHMODE with Double]
  
  /* 4410 */ @js.native
  object ICAP_BARCODESEARCHPRIORITIES extends TopLevel[ICAP_BARCODESEARCHPRIORITIES with Double]
  
  /* 4413 */ @js.native
  object ICAP_BARCODETIMEOUT extends TopLevel[ICAP_BARCODETIMEOUT with Double]
  
  /* 4395 */ @js.native
  object ICAP_BITDEPTH extends TopLevel[ICAP_BITDEPTH with Double]
  
  /* 4396 */ @js.native
  object ICAP_BITDEPTHREDUCTION extends TopLevel[ICAP_BITDEPTHREDUCTION with Double]
  
  /* 4380 */ @js.native
  object ICAP_BITORDER extends TopLevel[ICAP_BITORDER with Double]
  
  /* 4390 */ @js.native
  object ICAP_BITORDERCODES extends TopLevel[ICAP_BITORDERCODES with Double]
  
  /* 4353 */ @js.native
  object ICAP_BRIGHTNESS extends TopLevel[ICAP_BRIGHTNESS with Double]
  
  /* 4381 */ @js.native
  object ICAP_CCITTKFACTOR extends TopLevel[ICAP_CCITTKFACTOR with Double]
  
  /* 4443 */ @js.native
  object ICAP_COLORMANAGEMENTENABLED extends TopLevel[ICAP_COLORMANAGEMENTENABLED with Double]
  
  /* 256 */ @js.native
  object ICAP_COMPRESSION extends TopLevel[ICAP_COMPRESSION with Double]
  
  /* 4355 */ @js.native
  object ICAP_CONTRAST extends TopLevel[ICAP_CONTRAST with Double]
  
  /* 4356 */ @js.native
  object ICAP_CUSTHALFTONE extends TopLevel[ICAP_CUSTHALFTONE with Double]
  
  /* 4357 */ @js.native
  object ICAP_EXPOSURETIME extends TopLevel[ICAP_EXPOSURETIME with Double]
  
  /* 4399 */ @js.native
  object ICAP_EXTIMAGEINFO extends TopLevel[ICAP_EXTIMAGEINFO with Double]
  
  /* 4436 */ @js.native
  object ICAP_FEEDERTYPE extends TopLevel[ICAP_FEEDERTYPE with Double]
  
  /* 4358 */ @js.native
  object ICAP_FILTER extends TopLevel[ICAP_FILTER with Double]
  
  /* 4359 */ @js.native
  object ICAP_FLASHUSED extends TopLevel[ICAP_FLASHUSED with Double]
  
  /* 4422 */ @js.native
  object ICAP_FLASHUSED2 extends TopLevel[ICAP_FLASHUSED2 with Double]
  
  /* 4406 */ @js.native
  object ICAP_FLIPROTATION extends TopLevel[ICAP_FLIPROTATION with Double]
  
  /* 4372 */ @js.native
  object ICAP_FRAMES extends TopLevel[ICAP_FRAMES with Double]
  
  /* 4360 */ @js.native
  object ICAP_GAMMA extends TopLevel[ICAP_GAMMA with Double]
  
  /* 4361 */ @js.native
  object ICAP_HALFTONES extends TopLevel[ICAP_HALFTONES with Double]
  
  /* 4362 */ @js.native
  object ICAP_HIGHLIGHT extends TopLevel[ICAP_HIGHLIGHT with Double]
  
  /* 4437 */ @js.native
  object ICAP_ICCPROFILE extends TopLevel[ICAP_ICCPROFILE with Double]
  
  /* 4364 */ @js.native
  object ICAP_IMAGEFILEFORMAT extends TopLevel[ICAP_IMAGEFILEFORMAT with Double]
  
  /* 4423 */ @js.native
  object ICAP_IMAGEFILTER extends TopLevel[ICAP_IMAGEFILTER with Double]
  
  /* 4444 */ @js.native
  object ICAP_IMAGEMERGE extends TopLevel[ICAP_IMAGEMERGE with Double]
  
  /* 4445 */ @js.native
  object ICAP_IMAGEMERGEHEIGHTTHRESHOLD extends TopLevel[ICAP_IMAGEMERGEHEIGHTTHRESHOLD with Double]
  
  /* 4392 */ @js.native
  object ICAP_JPEGPIXELTYPE extends TopLevel[ICAP_JPEGPIXELTYPE with Double]
  
  /* 4435 */ @js.native
  object ICAP_JPEGQUALITY extends TopLevel[ICAP_JPEGQUALITY with Double]
  
  /* 4365 */ @js.native
  object ICAP_LAMPSTATE extends TopLevel[ICAP_LAMPSTATE with Double]
  
  /* 4382 */ @js.native
  object ICAP_LIGHTPATH extends TopLevel[ICAP_LIGHTPATH with Double]
  
  /* 4366 */ @js.native
  object ICAP_LIGHTSOURCE extends TopLevel[ICAP_LIGHTSOURCE with Double]
  
  /* 4378 */ @js.native
  object ICAP_MAXFRAMES extends TopLevel[ICAP_MAXFRAMES with Double]
  
  /* 4400 */ @js.native
  object ICAP_MINIMUMHEIGHT extends TopLevel[ICAP_MINIMUMHEIGHT with Double]
  
  /* 4401 */ @js.native
  object ICAP_MINIMUMWIDTH extends TopLevel[ICAP_MINIMUMWIDTH with Double]
  
  /* 4424 */ @js.native
  object ICAP_NOISEFILTER extends TopLevel[ICAP_NOISEFILTER with Double]
  
  /* 4368 */ @js.native
  object ICAP_ORIENTATION extends TopLevel[ICAP_ORIENTATION with Double]
  
  /* 4425 */ @js.native
  object ICAP_OVERSCAN extends TopLevel[ICAP_OVERSCAN with Double]
  
  /* 4415 */ @js.native
  object ICAP_PATCHCODEDETECTIONENABLED extends TopLevel[ICAP_PATCHCODEDETECTIONENABLED with Double]
  
  /* 4420 */ @js.native
  object ICAP_PATCHCODEMAXRETRIES extends TopLevel[ICAP_PATCHCODEMAXRETRIES with Double]
  
  /* 4417 */ @js.native
  object ICAP_PATCHCODEMAXSEARCHPRIORITIES extends TopLevel[ICAP_PATCHCODEMAXSEARCHPRIORITIES with Double]
  
  /* 4419 */ @js.native
  object ICAP_PATCHCODESEARCHMODE extends TopLevel[ICAP_PATCHCODESEARCHMODE with Double]
  
  /* 4418 */ @js.native
  object ICAP_PATCHCODESEARCHPRIORITIES extends TopLevel[ICAP_PATCHCODESEARCHPRIORITIES with Double]
  
  /* 4421 */ @js.native
  object ICAP_PATCHCODETIMEOUT extends TopLevel[ICAP_PATCHCODETIMEOUT with Double]
  
  /* 4370 */ @js.native
  object ICAP_PHYSICALHEIGHT extends TopLevel[ICAP_PHYSICALHEIGHT with Double]
  
  /* 4369 */ @js.native
  object ICAP_PHYSICALWIDTH extends TopLevel[ICAP_PHYSICALWIDTH with Double]
  
  /* 4383 */ @js.native
  object ICAP_PIXELFLAVOR extends TopLevel[ICAP_PIXELFLAVOR with Double]
  
  /* 4391 */ @js.native
  object ICAP_PIXELFLAVORCODES extends TopLevel[ICAP_PIXELFLAVORCODES with Double]
  
  /* 257 */ @js.native
  object ICAP_PIXELTYPE extends TopLevel[ICAP_PIXELTYPE with Double]
  
  /* 4384 */ @js.native
  object ICAP_PLANARCHUNKY extends TopLevel[ICAP_PLANARCHUNKY with Double]
  
  /* 4385 */ @js.native
  object ICAP_ROTATION extends TopLevel[ICAP_ROTATION with Double]
  
  /* 4371 */ @js.native
  object ICAP_SHADOW extends TopLevel[ICAP_SHADOW with Double]
  
  /* 4408 */ @js.native
  object ICAP_SUPPORTEDBARCODETYPES extends TopLevel[ICAP_SUPPORTEDBARCODETYPES with Double]
  
  /* 4446 */ @js.native
  object ICAP_SUPPORTEDEXTIMAGEINFO extends TopLevel[ICAP_SUPPORTEDEXTIMAGEINFO with Double]
  
  /* 4416 */ @js.native
  object ICAP_SUPPORTEDPATCHCODETYPES extends TopLevel[ICAP_SUPPORTEDPATCHCODETYPES with Double]
  
  /* 4386 */ @js.native
  object ICAP_SUPPORTEDSIZES extends TopLevel[ICAP_SUPPORTEDSIZES with Double]
  
  /* 4387 */ @js.native
  object ICAP_THRESHOLD extends TopLevel[ICAP_THRESHOLD with Double]
  
  /* 4379 */ @js.native
  object ICAP_TILES extends TopLevel[ICAP_TILES with Double]
  
  /* 4394 */ @js.native
  object ICAP_TIMEFILL extends TopLevel[ICAP_TIMEFILL with Double]
  
  /* 4397 */ @js.native
  object ICAP_UNDEFINEDIMAGESIZE extends TopLevel[ICAP_UNDEFINEDIMAGESIZE with Double]
  
  /* 258 */ @js.native
  object ICAP_UNITS extends TopLevel[ICAP_UNITS with Double]
  
  /* 259 */ @js.native
  object ICAP_XFERMECH extends TopLevel[ICAP_XFERMECH with Double]
  
  /* 4374 */ @js.native
  object ICAP_XNATIVERESOLUTION extends TopLevel[ICAP_XNATIVERESOLUTION with Double]
  
  /* 4376 */ @js.native
  object ICAP_XRESOLUTION extends TopLevel[ICAP_XRESOLUTION with Double]
  
  /* 4388 */ @js.native
  object ICAP_XSCALING extends TopLevel[ICAP_XSCALING with Double]
  
  /* 4375 */ @js.native
  object ICAP_YNATIVERESOLUTION extends TopLevel[ICAP_YNATIVERESOLUTION with Double]
  
  /* 4377 */ @js.native
  object ICAP_YRESOLUTION extends TopLevel[ICAP_YRESOLUTION with Double]
  
  /* 4389 */ @js.native
  object ICAP_YSCALING extends TopLevel[ICAP_YSCALING with Double]
  
  /* 4414 */ @js.native
  object ICAP_ZOOMFACTOR extends TopLevel[ICAP_ZOOMFACTOR with Double]
  
}

