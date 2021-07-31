package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCap extends StObject
/** Capabilities */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_Cap")
@js.native
object EnumDWTCap extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCap & Double] = js.native
  
  /** Turns specific audible alarms on and off. */
  @js.native
  sealed trait CAP_ALARMS
    extends StObject
       with EnumDWTCap
  /* 4120 */ val CAP_ALARMS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_ALARMS & Double = js.native
  
  /**
    * The volume of a device's audible alarm. Note that this control affects the volume of all alarms;
    * no specific volume control for individual types of alarms is provided.
    */
  @js.native
  sealed trait CAP_ALARMVOLUME
    extends StObject
       with EnumDWTCap
  /* 4121 */ val CAP_ALARMVOLUME: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_ALARMVOLUME & Double = js.native
  
  /** The name or other identifying information about the Author of the image. It may include a copyright string. */
  @js.native
  sealed trait CAP_AUTHOR
    extends StObject
       with EnumDWTCap
  /* 4096 */ val CAP_AUTHOR: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_AUTHOR & Double = js.native
  
  /**
    * If TRUE, the Source will automatically feed the next page from the document feeder after the
    * number of frames negotiated for capture from each page are acquired. CAP_FEEDERENABLED
    * must be TRUE to use this capability.
    */
  @js.native
  sealed trait CAP_AUTOFEED
    extends StObject
       with EnumDWTCap
  /* 4103 */ val CAP_AUTOFEED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_AUTOFEED & Double = js.native
  
  /**
    * The number of images to automatically capture. This does not refer to the number of images to
    * be sent to the Application, use CAP_XFERCOUNT for that.
    */
  @js.native
  sealed trait CAP_AUTOMATICCAPTURE
    extends StObject
       with EnumDWTCap
  /* 4122 */ val CAP_AUTOMATICCAPTURE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_AUTOMATICCAPTURE & Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait CAP_AUTOMATICSENSEMEDIUM
    extends StObject
       with EnumDWTCap
  /* 4155 */ val CAP_AUTOMATICSENSEMEDIUM: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_AUTOMATICSENSEMEDIUM & Double = js.native
  
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
  sealed trait CAP_AUTOSCAN
    extends StObject
       with EnumDWTCap
  /* 4112 */ val CAP_AUTOSCAN: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_AUTOSCAN & Double = js.native
  
  /** The minutes of battery power remaining to the device. */
  @js.native
  sealed trait CAP_BATTERYMINUTES
    extends StObject
       with EnumDWTCap
  /* 4146 */ val CAP_BATTERYMINUTES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_BATTERYMINUTES & Double = js.native
  
  /** When used with CapGet(), return the percentage of battery power level on camera. If -1 is returned, it indicates that the battery is not present.  */
  @js.native
  sealed trait CAP_BATTERYPERCENTAGE
    extends StObject
       with EnumDWTCap
  /* 4147 */ val CAP_BATTERYPERCENTAGE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_BATTERYPERCENTAGE & Double = js.native
  
  /** Added 2.0  */
  @js.native
  sealed trait CAP_CAMERAENABLED
    extends StObject
       with EnumDWTCap
  /* 4150 */ val CAP_CAMERAENABLED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CAMERAENABLED & Double = js.native
  
  /** Added 2.0    */
  @js.native
  sealed trait CAP_CAMERAORDER
    extends StObject
       with EnumDWTCap
  /* 4151 */ val CAP_CAMERAORDER: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CAMERAORDER & Double = js.native
  
  /** This capability queries the Source for UI support for preview mode. If TRUE, the Source supports preview UI. */
  @js.native
  sealed trait CAP_CAMERAPREVIEWUI
    extends StObject
       with EnumDWTCap
  /* 4129 */ val CAP_CAMERAPREVIEWUI: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CAMERAPREVIEWUI & Double = js.native
  
  /** Added 1.91  */
  @js.native
  sealed trait CAP_CAMERASIDE
    extends StObject
       with EnumDWTCap
  /* 4148 */ val CAP_CAMERASIDE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CAMERASIDE & Double = js.native
  
  /** A general note about the acquired image. */
  @js.native
  sealed trait CAP_CAPTION
    extends StObject
       with EnumDWTCap
  /* 4097 */ val CAP_CAPTION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CAPTION & Double = js.native
  
  /** CapGet() reports the presence of data in the scanner's buffers. CapSet() with a value of TWCB_CLEAR immediately clears the buffers. */
  @js.native
  sealed trait CAP_CLEARBUFFERS
    extends StObject
       with EnumDWTCap
  /* 4125 */ val CAP_CLEARBUFFERS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CLEARBUFFERS & Double = js.native
  
  /**
    * If TRUE, the Source will eject the current page being acquired from and will leave the feeder
    * acquire area empty.
    * If CAP_AUTOFEED is TRUE, a fresh page will be advanced.
    * CAP_FEEDERENABLED must equal TRUE to use this capability.
    * This capability must have been negotiated as an extended capability to be used in States 5 and 6.
    */
  @js.native
  sealed trait CAP_CLEARPAGE
    extends StObject
       with EnumDWTCap
  /* 4104 */ val CAP_CLEARPAGE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CLEARPAGE & Double = js.native
  
  @js.native
  sealed trait CAP_CUSTOMDSDATA
    extends StObject
       with EnumDWTCap
  /* 4117 */ val CAP_CUSTOMDSDATA: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CUSTOMDSDATA & Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait CAP_CUSTOMINTERFACEGUID
    extends StObject
       with EnumDWTCap
  /* 4156 */ val CAP_CUSTOMINTERFACEGUID: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CUSTOMINTERFACEGUID & Double = js.native
  
  /**
    * If TRUE, the physical hardware (e.g., scanner, digital camera, image database, etc.) that
    * represents the image source is attached, powered on, and communicating.
    */
  @js.native
  sealed trait CAP_DEVICEONLINE
    extends StObject
       with EnumDWTCap
  /* 4111 */ val CAP_DEVICEONLINE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_DEVICEONLINE & Double = js.native
  
  /**
    * The date and time of the device's clock.
    * Managed in the form "YYYY/MM/DD HH=mm=SS=sss" where YYYY is the year, MM is the
    * numerical month, DD is the numerical day, HH is the hour, mm is the minute, SS is the second,
    * and sss is the millisecond.
    */
  @js.native
  sealed trait CAP_DEVICETIMEDATE
    extends StObject
       with EnumDWTCap
  /* 4127 */ val CAP_DEVICETIMEDATE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_DEVICETIMEDATE & Double = js.native
  
  /**
    * This indicates whether the scanner supports duplex. If so, it further indicates whether one-path
    * or two-path duplex is supported.
    */
  @js.native
  sealed trait CAP_DUPLEX
    extends StObject
       with EnumDWTCap
  /* 4114 */ val CAP_DUPLEX: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_DUPLEX & Double = js.native
  
  /**
    * The user can set the duplex option to be TRUE or FALSE. If TRUE, the scanner scans both sides
    * of a paper; otherwise, the scanner will scan only one side of the image.
    */
  @js.native
  sealed trait CAP_DUPLEXENABLED
    extends StObject
       with EnumDWTCap
  /* 4115 */ val CAP_DUPLEXENABLED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_DUPLEXENABLED & Double = js.native
  
  /** Allows an application to query a source to see if it implements the new user interface settings dialog.  */
  @js.native
  sealed trait CAP_ENABLEDSUIONLY
    extends StObject
       with EnumDWTCap
  /* 4116 */ val CAP_ENABLEDSUIONLY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_ENABLEDSUIONLY & Double = js.native
  
  /**
    * Allows the application to specify the starting endorser / imprinter number. All other endorser/
    * imprinter properties should be handled through the data source's user interface.
    * The user can set the starting number for the endorser.
    */
  @js.native
  sealed trait CAP_ENDORSER
    extends StObject
       with EnumDWTCap
  /* 4118 */ val CAP_ENDORSER: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_ENDORSER & Double = js.native
  
  /** Allows the application and Source to negotiate capabilities to be used in States 5 and 6. */
  @js.native
  sealed trait CAP_EXTENDEDCAPS
    extends StObject
       with EnumDWTCap
  /* 4102 */ val CAP_EXTENDEDCAPS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_EXTENDEDCAPS & Double = js.native
  
  /**
    * Helps the Application determine any special actions it may need to take when negotiating
    * frames with the Source. Allowed values are listed in <see cref="TWCapFeederAlignment"/>.
    * TWFA_NONE= The alignment is free-floating. Applications should assume
    * that the origin for frames is on the left.
    * TWFA_LEFT= The alignment is to the left.
    * TWFA_CENTER= The alignment is centered. This means that the paper will
    * be fed in the middle of the ICAP_PHYSICALWIDTH of the
    * device. If this is set, then the Application should calculate
    * any frames with a left offset of zero.
    * TWFA_RIGHT= The alignment is to the right.
    */
  @js.native
  sealed trait CAP_FEEDERALIGNMENT
    extends StObject
       with EnumDWTCap
  /* 4141 */ val CAP_FEEDERALIGNMENT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDERALIGNMENT & Double = js.native
  
  /**
    * If TRUE, Source must acquire data from the document feeder acquire area and other feeder
    * capabilities can be used. If FALSE, Source must acquire data from the non-feeder acquire area
    * and no other feeder capabilities can be used.
    */
  @js.native
  sealed trait CAP_FEEDERENABLED
    extends StObject
       with EnumDWTCap
  /* 4098 */ val CAP_FEEDERENABLED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDERENABLED & Double = js.native
  
  /** Reflect whether there are documents loaded in the Source's feeder. */
  @js.native
  sealed trait CAP_FEEDERLOADED
    extends StObject
       with EnumDWTCap
  /* 4099 */ val CAP_FEEDERLOADED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDERLOADED & Double = js.native
  
  /**
    * TWFO_FIRSTPAGEFIRST if the feeder starts with the top of the first page.
    * TWFO_LASTPAGEFIRST is the feeder starts with the top of the last page.
    */
  @js.native
  sealed trait CAP_FEEDERORDER
    extends StObject
       with EnumDWTCap
  /* 4142 */ val CAP_FEEDERORDER: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDERORDER & Double = js.native
  
  /** Added 2.0  */
  @js.native
  sealed trait CAP_FEEDERPOCKET
    extends StObject
       with EnumDWTCap
  /* 4154 */ val CAP_FEEDERPOCKET: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDERPOCKET & Double = js.native
  
  /** Added 2.0   */
  @js.native
  sealed trait CAP_FEEDERPREP
    extends StObject
       with EnumDWTCap
  /* 4153 */ val CAP_FEEDERPREP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDERPREP & Double = js.native
  
  /**
    * If TRUE, the Source will eject the current page and advance the next page in the document feeder
    * into the feeder acquire area.
    * If CAP_AUTOFEED is TRUE, the same action just described will occur and CAP_AUTOFEED will
    * remain active.
    * CAP_FEEDERENABLED must equal TRUE to use this capability.
    * This capability must have been negotiated as an extended capability to be used in States 5 and 6.
    */
  @js.native
  sealed trait CAP_FEEDPAGE
    extends StObject
       with EnumDWTCap
  /* 4105 */ val CAP_FEEDPAGE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDPAGE & Double = js.native
  
  /**
    * If TRUE, the Source will display a progress indicator during acquisition and transfer, regardless
    * of whether the Source's user interface is active. If FALSE, the progress indicator will be
    * suppressed if the Source's user interface is inactive.
    * The Source will continue to display device-specific instructions and error messages even with
    * the Source user interface and progress indicators turned off.
    */
  @js.native
  sealed trait CAP_INDICATORS
    extends StObject
       with EnumDWTCap
  /* 4107 */ val CAP_INDICATORS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_INDICATORS & Double = js.native
  
  /**
    * Allows Application and Source to identify which languages they have in common for the exchange of string data,
    * and to select the language of the internal UI. Since the TWLG_xxxx codes include language and country data, there is no separate
    * capability for selecting the country.
    */
  @js.native
  sealed trait CAP_LANGUAGE
    extends StObject
       with EnumDWTCap
  /* 4140 */ val CAP_LANGUAGE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_LANGUAGE & Double = js.native
  
  /** Describes the number of pages that the scanner can buffer when CAP_AUTOSCAN is enabled. */
  @js.native
  sealed trait CAP_MAXBATCHBUFFERS
    extends StObject
       with EnumDWTCap
  /* 4126 */ val CAP_MAXBATCHBUFFERS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_MAXBATCHBUFFERS & Double = js.native
  
  /** Added 2.0  */
  @js.native
  sealed trait CAP_MICRENABLED
    extends StObject
       with EnumDWTCap
  /* 4152 */ val CAP_MICRENABLED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_MICRENABLED & Double = js.native
  
  /** Nothing. */
  @js.native
  sealed trait CAP_NONE
    extends StObject
       with EnumDWTCap
  /* 0 */ val CAP_NONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_NONE & Double = js.native
  
  /** This capability determines whether the device has a paper sensor that can detect documents on the ADF or Flatbed. */
  @js.native
  sealed trait CAP_PAPERDETECTABLE
    extends StObject
       with EnumDWTCap
  /* 4109 */ val CAP_PAPERDETECTABLE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PAPERDETECTABLE & Double = js.native
  
  /** CapGet() reports the kinds of power available to the device. CapGetCurrent() reports the current power supply in use. */
  @js.native
  sealed trait CAP_POWERSUPPLY
    extends StObject
       with EnumDWTCap
  /* 4128 */ val CAP_POWERSUPPLY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_POWERSUPPLY & Double = js.native
  
  /**
    * CapGet() returns the current list of available printer devices, along with the one currently being used for negotiation.
    * CapSet() selects the current device for negotiation, and optionally constrains the list.
    * Top/Bottom refers to duplex devices, and indicates if the printer is writing on the top or the bottom of the sheet of paper.
    * Simplex devices use the top settings. Before/After indicates whether printing occurs before or after the sheet of paper has been scanned.
    */
  @js.native
  sealed trait CAP_PRINTER
    extends StObject
       with EnumDWTCap
  /* 4134 */ val CAP_PRINTER: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PRINTER & Double = js.native
  
  /** Turns the current CAP_PRINTER device on or off. */
  @js.native
  sealed trait CAP_PRINTERENABLED
    extends StObject
       with EnumDWTCap
  /* 4135 */ val CAP_PRINTERENABLED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PRINTERENABLED & Double = js.native
  
  /** The User can set the starting number for the current CAP_PRINTER device. */
  @js.native
  sealed trait CAP_PRINTERINDEX
    extends StObject
       with EnumDWTCap
  /* 4136 */ val CAP_PRINTERINDEX: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PRINTERINDEX & Double = js.native
  
  /**
    * Specifies the appropriate current CAP_PRINTER device mode.
    * Note=
    * O TWPM_SINGLESTRING specifies that the printed text will consist of a single string.
    * O TWPM _MULTISTRING specifies that the printed text will consist of an enumerated list of
    * strings to be printed in order.
    * O TWPM _COMPOUNDSTRING specifies that the printed string will consist of a compound of a
    * String followed by a value followed by a suffix string.
    */
  @js.native
  sealed trait CAP_PRINTERMODE
    extends StObject
       with EnumDWTCap
  /* 4137 */ val CAP_PRINTERMODE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PRINTERMODE & Double = js.native
  
  /**
    * Specifies the string(s) that are to be used in the string component when the current
    * CAP_PRINTER device is enabled.
    */
  @js.native
  sealed trait CAP_PRINTERSTRING
    extends StObject
       with EnumDWTCap
  /* 4138 */ val CAP_PRINTERSTRING: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PRINTERSTRING & Double = js.native
  
  /** Specifies the string that shall be used as the current CAP_PRINTER device's suffix. */
  @js.native
  sealed trait CAP_PRINTERSUFFIX
    extends StObject
       with EnumDWTCap
  /* 4139 */ val CAP_PRINTERSUFFIX: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PRINTERSUFFIX & Double = js.native
  
  /**
    * Indicates whether the physical hardware (e.g. scanner, digital camera) is capable of acquiring
    * multiple images of the same page without changes to the physical registration of that page.
    */
  @js.native
  sealed trait CAP_REACQUIREALLOWED
    extends StObject
       with EnumDWTCap
  /* 4144 */ val CAP_REACQUIREALLOWED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_REACQUIREALLOWED & Double = js.native
  
  /**
    * If TRUE, the Source will return the current page to the input side of the document feeder and
    * feed the last page from the output side of the feeder back into the acquisition area.
    * If CAP_AUTOFEED is TRUE, automatic feeding will continue after all negotiated frames from this
    * page are acquired.
    * CAP_FEEDERENABLED must equal TRUE to use this capability.
    * This capability must have been negotiated as an extended capability to be used in States 5 and 6.
    */
  @js.native
  sealed trait CAP_REWINDPAGE
    extends StObject
       with EnumDWTCap
  /* 4106 */ val CAP_REWINDPAGE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_REWINDPAGE & Double = js.native
  
  /** Added 1.91   */
  @js.native
  sealed trait CAP_SEGMENTED
    extends StObject
       with EnumDWTCap
  /* 4149 */ val CAP_SEGMENTED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_SEGMENTED & Double = js.native
  
  /**
    * A string containing the serial number of the currently selected device in the Source. Multiple
    * devices may all report the same serial number.
    */
  @js.native
  sealed trait CAP_SERIALNUMBER
    extends StObject
       with EnumDWTCap
  /* 4132 */ val CAP_SERIALNUMBER: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_SERIALNUMBER & Double = js.native
  
  /**
    * Returns a list of all the capabilities for which the Source will answer inquiries. Does not indicate
    * which capabilities the Source will allow to be set by the application. Some capabilities can only
    * be set if certain setup work has been done so the Source cannot globally answer which
    * capabilities are "set-able."
    */
  @js.native
  sealed trait CAP_SUPPORTEDCAPS
    extends StObject
       with EnumDWTCap
  /* 4101 */ val CAP_SUPPORTEDCAPS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_SUPPORTEDCAPS & Double = js.native
  
  /**
    * Returns a list of all the capabilities for which the Source will answer inquiries. Does not indicate
    * which capabilities the Source will allow to be set by the application. Some capabilities can only
    * be set if certain setup work has been done so the Source cannot globally answer which
    * capabilities are "set-able."
    */
  @js.native
  sealed trait CAP_SUPPORTEDCAPSEXT
    extends StObject
       with EnumDWTCap
  /* 4108 */ val CAP_SUPPORTEDCAPSEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_SUPPORTEDCAPSEXT & Double = js.native
  
  /**
    * Allows an application to request the delivery of thumbnail representations for the set of images
    * that are to be delivered.
    * Setting CAP_THUMBNAILSENABLED to TRUE turns on thumbnail mode. Images transferred
    * thereafter will be sent at thumbnail size (exact thumbnail size is determined by the Data Source).
    * Setting this capability to FALSE turns thumbnail mode off and returns full size images.
    */
  @js.native
  sealed trait CAP_THUMBNAILSENABLED
    extends StObject
       with EnumDWTCap
  /* 4113 */ val CAP_THUMBNAILSENABLED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_THUMBNAILSENABLED & Double = js.native
  
  /**
    * For automatic capture, this value selects the number of milliseconds before the first picture is to
    * be taken, or the first image is to be scanned.
    */
  @js.native
  sealed trait CAP_TIMEBEFOREFIRSTCAPTURE
    extends StObject
       with EnumDWTCap
  /* 4123 */ val CAP_TIMEBEFOREFIRSTCAPTURE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_TIMEBEFOREFIRSTCAPTURE & Double = js.native
  
  /** For automatic capture, this value selects the milliseconds to wait between pictures taken, or images scanned. */
  @js.native
  sealed trait CAP_TIMEBETWEENCAPTURES
    extends StObject
       with EnumDWTCap
  /* 4124 */ val CAP_TIMEBETWEENCAPTURES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_TIMEBETWEENCAPTURES & Double = js.native
  
  /**
    * The date and time the image was acquired.
    * Stored in the form "YYYY/MM/DD HH=mm=SS.sss" where YYYY is the year, MM is the
    * numerical month, DD is the numerical day, HH is the hour, mm is the minute, SS is the second,
    * and sss is the millisecond.
    */
  @js.native
  sealed trait CAP_TIMEDATE
    extends StObject
       with EnumDWTCap
  /* 4100 */ val CAP_TIMEDATE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_TIMEDATE & Double = js.native
  
  /**
    * If TRUE, indicates that this Source supports acquisition with the UI disabled; i.e.,
    * TW_USERINTERFACE's ShowUI field can be set to FALSE. If FALSE, indicates that this Source
    * can only support acquisition with the UI enabled.
    */
  @js.native
  sealed trait CAP_UICONTROLLABLE
    extends StObject
       with EnumDWTCap
  /* 4110 */ val CAP_UICONTROLLABLE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_UICONTROLLABLE & Double = js.native
  
  /** The application is willing to accept this number of images. */
  @js.native
  sealed trait CAP_XFERCOUNT
    extends StObject
       with EnumDWTCap
  /* 1 */ val CAP_XFERCOUNT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_XFERCOUNT & Double = js.native
  
  /** TRUE enables and FALSE disables the Source's Auto-brightness function (if any). */
  @js.native
  sealed trait ICAP_AUTOBRIGHT
    extends StObject
       with EnumDWTCap
  /* 4352 */ val ICAP_AUTOBRIGHT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOBRIGHT & Double = js.native
  
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
  sealed trait ICAP_AUTODISCARDBLANKPAGES
    extends StObject
       with EnumDWTCap
  /* 4404 */ val ICAP_AUTODISCARDBLANKPAGES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTODISCARDBLANKPAGES & Double = js.native
  
  /** Turns automatic border detection on and off. */
  @js.native
  sealed trait ICAP_AUTOMATICBORDERDETECTION
    extends StObject
       with EnumDWTCap
  /* 4432 */ val ICAP_AUTOMATICBORDERDETECTION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICBORDERDETECTION & Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICCOLORENABLED
    extends StObject
       with EnumDWTCap
  /* 4441 */ val ICAP_AUTOMATICCOLORENABLED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICCOLORENABLED & Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICCOLORNONCOLORPIXELTYPE
    extends StObject
       with EnumDWTCap
  /* 4442 */ val ICAP_AUTOMATICCOLORNONCOLORPIXELTYPE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICCOLORNONCOLORPIXELTYPE & Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICCROPUSESFRAME
    extends StObject
       with EnumDWTCap
  /* 4439 */ val ICAP_AUTOMATICCROPUSESFRAME: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICCROPUSESFRAME & Double = js.native
  
  /** Turns automatic deskew correction on and off. */
  @js.native
  sealed trait ICAP_AUTOMATICDESKEW
    extends StObject
       with EnumDWTCap
  /* 4433 */ val ICAP_AUTOMATICDESKEW: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICDESKEW & Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICLENGTHDETECTION
    extends StObject
       with EnumDWTCap
  /* 4440 */ val ICAP_AUTOMATICLENGTHDETECTION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICLENGTHDETECTION & Double = js.native
  
  /**
    * When TRUE this capability depends on intelligent features within the Source to automatically
    * rotate the image to the correct position.
    */
  @js.native
  sealed trait ICAP_AUTOMATICROTATE
    extends StObject
       with EnumDWTCap
  /* 4434 */ val ICAP_AUTOMATICROTATE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICROTATE & Double = js.native
  
  /** Added 2.0   */
  @js.native
  sealed trait ICAP_AUTOSIZE
    extends StObject
       with EnumDWTCap
  /* 4438 */ val ICAP_AUTOSIZE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOSIZE & Double = js.native
  
  /** Turns bar code detection on and off. */
  @js.native
  sealed trait ICAP_BARCODEDETECTIONENABLED
    extends StObject
       with EnumDWTCap
  /* 4407 */ val ICAP_BARCODEDETECTIONENABLED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BARCODEDETECTIONENABLED & Double = js.native
  
  /** Restricts the number of times a search will be retried if none are found on each page. */
  @js.native
  sealed trait ICAP_BARCODEMAXRETRIES
    extends StObject
       with EnumDWTCap
  /* 4412 */ val ICAP_BARCODEMAXRETRIES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BARCODEMAXRETRIES & Double = js.native
  
  /** The maximum number of supported search priorities. */
  @js.native
  sealed trait ICAP_BARCODEMAXSEARCHPRIORITIES
    extends StObject
       with EnumDWTCap
  /* 4409 */ val ICAP_BARCODEMAXSEARCHPRIORITIES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BARCODEMAXSEARCHPRIORITIES & Double = js.native
  
  /** Restricts bar code searching to certain orientations, or prioritizes one orientation over the other. */
  @js.native
  sealed trait ICAP_BARCODESEARCHMODE
    extends StObject
       with EnumDWTCap
  /* 4411 */ val ICAP_BARCODESEARCHMODE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BARCODESEARCHMODE & Double = js.native
  
  /** A prioritized list of bar code types dictating the order in which bar codes will be sought. */
  @js.native
  sealed trait ICAP_BARCODESEARCHPRIORITIES
    extends StObject
       with EnumDWTCap
  /* 4410 */ val ICAP_BARCODESEARCHPRIORITIES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BARCODESEARCHPRIORITIES & Double = js.native
  
  /** Restricts the total time spent on searching for a bar code on each page. */
  @js.native
  sealed trait ICAP_BARCODETIMEOUT
    extends StObject
       with EnumDWTCap
  /* 4413 */ val ICAP_BARCODETIMEOUT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BARCODETIMEOUT & Double = js.native
  
  /**
    * Specifies the pixel bit depths for the Current value of ICAP_PIXELTYPE. For example, when
    * using ICAP_PIXELTYPE=TWPT_GRAY, this capability specifies whether this is 8-bit gray or 4-bit gray.
    * This depth applies to all the data channels (for instance, the R, G, and B channels will all have
    * this same bit depth for RGB data).
    */
  @js.native
  sealed trait ICAP_BITDEPTH
    extends StObject
       with EnumDWTCap
  /* 4395 */ val ICAP_BITDEPTH: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BITDEPTH & Double = js.native
  
  /**
    * Specifies the Reduction Method the Source should use to reduce the bit depth of the data. Most
    * commonly used with ICAP_PIXELTYPE=TWPT_BW to reduce gray data to black and white.
    */
  @js.native
  sealed trait ICAP_BITDEPTHREDUCTION
    extends StObject
       with EnumDWTCap
  /* 4396 */ val ICAP_BITDEPTHREDUCTION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BITDEPTHREDUCTION & Double = js.native
  
  /**
    * Specifies how the bytes in an image are filled by the Source. TWBO_MSBFIRST indicates that the leftmost bit in the byte (usually bit 7) is
    * the byte's Most Significant Bit.
    */
  @js.native
  sealed trait ICAP_BITORDER
    extends StObject
       with EnumDWTCap
  /* 4380 */ val ICAP_BITORDER: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BITORDER & Double = js.native
  
  /** Used for CCITT data compression only. Indicates the bit order representation of the stored compressed codes. */
  @js.native
  sealed trait ICAP_BITORDERCODES
    extends StObject
       with EnumDWTCap
  /* 4390 */ val ICAP_BITORDERCODES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BITORDERCODES & Double = js.native
  
  /** The brightness values available within the Source. */
  @js.native
  sealed trait ICAP_BRIGHTNESS
    extends StObject
       with EnumDWTCap
  /* 4353 */ val ICAP_BRIGHTNESS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BRIGHTNESS & Double = js.native
  
  /**
    * Used for CCITT Group 3 2-dimensional compression. The 'K' factor indicates how often the
    * new compression baseline should be re-established. A value of 2 or 4 is common in facsimile
    * communication. A value of zero in this field will indicate an infinite K factor—the baseline is
    * only calculated at the beginning of the transfer.
    */
  @js.native
  sealed trait ICAP_CCITTKFACTOR
    extends StObject
       with EnumDWTCap
  /* 4381 */ val ICAP_CCITTKFACTOR: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_CCITTKFACTOR & Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_COLORMANAGEMENTENABLED
    extends StObject
       with EnumDWTCap
  /* 4443 */ val ICAP_COLORMANAGEMENTENABLED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_COLORMANAGEMENTENABLED & Double = js.native
  
  /**
    * Allows the application and Source to identify which compression schemes they have in
    * common for Buffered Memory and File transfers.
    * Note for File transfers=
    * Since only certain file formats support compression, this capability must be negotiated after
    * setting the desired file format with ICAP_IMAGEFILEFORMAT.
    */
  @js.native
  sealed trait ICAP_COMPRESSION
    extends StObject
       with EnumDWTCap
  /* 256 */ val ICAP_COMPRESSION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_COMPRESSION & Double = js.native
  
  /** The contrast values available within the Source. */
  @js.native
  sealed trait ICAP_CONTRAST
    extends StObject
       with EnumDWTCap
  /* 4355 */ val ICAP_CONTRAST: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_CONTRAST & Double = js.native
  
  /** Specifies the square-cell halftone (dithering) matrix the Source should use to halftone the image. */
  @js.native
  sealed trait ICAP_CUSTHALFTONE
    extends StObject
       with EnumDWTCap
  /* 4356 */ val ICAP_CUSTHALFTONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_CUSTHALFTONE & Double = js.native
  
  /** Specifies the exposure time used to capture the image, in seconds. */
  @js.native
  sealed trait ICAP_EXPOSURETIME
    extends StObject
       with EnumDWTCap
  /* 4357 */ val ICAP_EXPOSURETIME: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_EXPOSURETIME & Double = js.native
  
  /**
    * Allows the application to query the data source to see if it supports extended image attribute capabilities,
    * such as Barcode Recognition, Shaded Area Detection and Removal, Skew detection and Removal, and so on.
    */
  @js.native
  sealed trait ICAP_EXTIMAGEINFO
    extends StObject
       with EnumDWTCap
  /* 4399 */ val ICAP_EXTIMAGEINFO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_EXTIMAGEINFO & Double = js.native
  
  /** Added 1.91   */
  @js.native
  sealed trait ICAP_FEEDERTYPE
    extends StObject
       with EnumDWTCap
  /* 4436 */ val ICAP_FEEDERTYPE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_FEEDERTYPE & Double = js.native
  
  /**
    * Describes the color characteristic of the subtractive filter applied to the image data.
    * Multiple filters may be applied to a single acquisition.
    */
  @js.native
  sealed trait ICAP_FILTER
    extends StObject
       with EnumDWTCap
  /* 4358 */ val ICAP_FILTER: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_FILTER & Double = js.native
  
  /** Specifies whether or not the image was acquired using a flash. */
  @js.native
  sealed trait ICAP_FLASHUSED
    extends StObject
       with EnumDWTCap
  /* 4359 */ val ICAP_FLASHUSED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_FLASHUSED & Double = js.native
  
  /**
    * For devices that support flash. CapSet() selects the flash to be used (if any). CapGet() reports the current setting.
    * This capability replaces ICAP_FLASHUSED, which is only able to negotiate the flash being on or off.
    */
  @js.native
  sealed trait ICAP_FLASHUSED2
    extends StObject
       with EnumDWTCap
  /* 4422 */ val ICAP_FLASHUSED2: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_FLASHUSED2 & Double = js.native
  
  /**
    * Flip rotation is used to properly orient images that flip orientation every other image.
    * TWFR_BOOK The images to be scanned are viewed in book form, flipping each page from left to right or right to left.
    * TWFR_FANFOLD The images to be scanned are viewed in fanfold paper style, flipping each page up or down.
    */
  @js.native
  sealed trait ICAP_FLIPROTATION
    extends StObject
       with EnumDWTCap
  /* 4406 */ val ICAP_FLIPROTATION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_FLIPROTATION & Double = js.native
  
  /** The list of frames the Source will acquire on each page. */
  @js.native
  sealed trait ICAP_FRAMES
    extends StObject
       with EnumDWTCap
  /* 4372 */ val ICAP_FRAMES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_FRAMES & Double = js.native
  
  /** Gamma correction value for the image data. */
  @js.native
  sealed trait ICAP_GAMMA
    extends StObject
       with EnumDWTCap
  /* 4360 */ val ICAP_GAMMA: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_GAMMA & Double = js.native
  
  /** A list of names of the halftone patterns available within the Source. */
  @js.native
  sealed trait ICAP_HALFTONES
    extends StObject
       with EnumDWTCap
  /* 4361 */ val ICAP_HALFTONES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_HALFTONES & Double = js.native
  
  /**
    * Specifies which value in an image should be interpreted as the lightest "highlight." All values
    * "lighter" than this value will be clipped to this value. Whether lighter values are smaller or
    * larger can be determined by examining the Current value of ICAP_PIXELFLAVOR.
    */
  @js.native
  sealed trait ICAP_HIGHLIGHT
    extends StObject
       with EnumDWTCap
  /* 4362 */ val ICAP_HIGHLIGHT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_HIGHLIGHT & Double = js.native
  
  /** Added 1.91  */
  @js.native
  sealed trait ICAP_ICCPROFILE
    extends StObject
       with EnumDWTCap
  /* 4437 */ val ICAP_ICCPROFILE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_ICCPROFILE & Double = js.native
  
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
  sealed trait ICAP_IMAGEFILEFORMAT
    extends StObject
       with EnumDWTCap
  /* 4364 */ val ICAP_IMAGEFILEFORMAT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_IMAGEFILEFORMAT & Double = js.native
  
  /** For devices that support image enhancement filtering. This capability selects the algorithm used to improve the quality of the image. */
  @js.native
  sealed trait ICAP_IMAGEFILTER
    extends StObject
       with EnumDWTCap
  /* 4423 */ val ICAP_IMAGEFILTER: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_IMAGEFILTER & Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_IMAGEMERGE
    extends StObject
       with EnumDWTCap
  /* 4444 */ val ICAP_IMAGEMERGE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_IMAGEMERGE & Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_IMAGEMERGEHEIGHTTHRESHOLD
    extends StObject
       with EnumDWTCap
  /* 4445 */ val ICAP_IMAGEMERGEHEIGHTTHRESHOLD: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_IMAGEMERGEHEIGHTTHRESHOLD & Double = js.native
  
  /**
    * Allows the application and Source to agree upon a common set of color descriptors that are
    * made available by the Source. This ICAP is only useful for JPEG-compressed buffered memory image transfers.
    */
  @js.native
  sealed trait ICAP_JPEGPIXELTYPE
    extends StObject
       with EnumDWTCap
  /* 4392 */ val ICAP_JPEGPIXELTYPE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_JPEGPIXELTYPE & Double = js.native
  
  /** Added 1.9  */
  @js.native
  sealed trait ICAP_JPEGQUALITY
    extends StObject
       with EnumDWTCap
  /* 4435 */ val ICAP_JPEGQUALITY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_JPEGQUALITY & Double = js.native
  
  /** TRUE means the lamp is currently, or should be set to ON. Sources may not support CapSet() operations.  */
  @js.native
  sealed trait ICAP_LAMPSTATE
    extends StObject
       with EnumDWTCap
  /* 4365 */ val ICAP_LAMPSTATE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_LAMPSTATE & Double = js.native
  
  /** Describes whether the image was captured transmissively or reflectively. */
  @js.native
  sealed trait ICAP_LIGHTPATH
    extends StObject
       with EnumDWTCap
  /* 4382 */ val ICAP_LIGHTPATH: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_LIGHTPATH & Double = js.native
  
  /** Describes the general color characteristic of the light source used to acquire the image. */
  @js.native
  sealed trait ICAP_LIGHTSOURCE
    extends StObject
       with EnumDWTCap
  /* 4366 */ val ICAP_LIGHTSOURCE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_LIGHTSOURCE & Double = js.native
  
  /**
    * The maximum number of frames the Source can provide or the application can accept per page.
    * This is a bounding capability only. It does not establish current or future behavior.
    */
  @js.native
  sealed trait ICAP_MAXFRAMES
    extends StObject
       with EnumDWTCap
  /* 4378 */ val ICAP_MAXFRAMES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_MAXFRAMES & Double = js.native
  
  /** Allows the source to define the minimum height (Y-axis) that the source can acquire. */
  @js.native
  sealed trait ICAP_MINIMUMHEIGHT
    extends StObject
       with EnumDWTCap
  /* 4400 */ val ICAP_MINIMUMHEIGHT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_MINIMUMHEIGHT & Double = js.native
  
  /** Allows the source to define theminimum width (X-axis) that the source can acquire. */
  @js.native
  sealed trait ICAP_MINIMUMWIDTH
    extends StObject
       with EnumDWTCap
  /* 4401 */ val ICAP_MINIMUMWIDTH: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_MINIMUMWIDTH & Double = js.native
  
  /** For devices that support noise filtering. This capability selects the algorithm used to remove noise. */
  @js.native
  sealed trait ICAP_NOISEFILTER
    extends StObject
       with EnumDWTCap
  /* 4424 */ val ICAP_NOISEFILTER: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_NOISEFILTER & Double = js.native
  
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
  sealed trait ICAP_ORIENTATION
    extends StObject
       with EnumDWTCap
  /* 4368 */ val ICAP_ORIENTATION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_ORIENTATION & Double = js.native
  
  /**
    * Overscan is used to scan outside of the boundaries described by ICAP_FRAMES, and is used to help acquire image data that
    * may be lost because of skewing.
    * This is primarily of use for transport scanners which rely on edge detection to begin scanning.
    * If overscan is supported, then the device is capable of scanning in the inter-document gap to get the skewed image information.
    */
  @js.native
  sealed trait ICAP_OVERSCAN
    extends StObject
       with EnumDWTCap
  /* 4425 */ val ICAP_OVERSCAN: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_OVERSCAN & Double = js.native
  
  /** Turns patch code detection on and off. */
  @js.native
  sealed trait ICAP_PATCHCODEDETECTIONENABLED
    extends StObject
       with EnumDWTCap
  /* 4415 */ val ICAP_PATCHCODEDETECTIONENABLED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PATCHCODEDETECTIONENABLED & Double = js.native
  
  /** Restricts the number of times a search will be retried if none are found on each page. */
  @js.native
  sealed trait ICAP_PATCHCODEMAXRETRIES
    extends StObject
       with EnumDWTCap
  /* 4420 */ val ICAP_PATCHCODEMAXRETRIES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PATCHCODEMAXRETRIES & Double = js.native
  
  /** The maximum number of supported search priorities. */
  @js.native
  sealed trait ICAP_PATCHCODEMAXSEARCHPRIORITIES
    extends StObject
       with EnumDWTCap
  /* 4417 */ val ICAP_PATCHCODEMAXSEARCHPRIORITIES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PATCHCODEMAXSEARCHPRIORITIES & Double = js.native
  
  /** Restricts patch code searching to certain orientations, or prioritizes one orientation over the other. */
  @js.native
  sealed trait ICAP_PATCHCODESEARCHMODE
    extends StObject
       with EnumDWTCap
  /* 4419 */ val ICAP_PATCHCODESEARCHMODE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PATCHCODESEARCHMODE & Double = js.native
  
  /** A prioritized list of patch code types dictating the order in which patch codes will be sought. */
  @js.native
  sealed trait ICAP_PATCHCODESEARCHPRIORITIES
    extends StObject
       with EnumDWTCap
  /* 4418 */ val ICAP_PATCHCODESEARCHPRIORITIES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PATCHCODESEARCHPRIORITIES & Double = js.native
  
  /** Restricts the total time spent on searching for a patch code on each page. */
  @js.native
  sealed trait ICAP_PATCHCODETIMEOUT
    extends StObject
       with EnumDWTCap
  /* 4421 */ val ICAP_PATCHCODETIMEOUT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PATCHCODETIMEOUT & Double = js.native
  
  /** The maximum physical height (Y-axis) the Source can acquire (measured in units of ICAP_UNITS). */
  @js.native
  sealed trait ICAP_PHYSICALHEIGHT
    extends StObject
       with EnumDWTCap
  /* 4370 */ val ICAP_PHYSICALHEIGHT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PHYSICALHEIGHT & Double = js.native
  
  /** The maximum physical width (X-axis) the Source can acquire (measured in units of ICAP_UNITS). */
  @js.native
  sealed trait ICAP_PHYSICALWIDTH
    extends StObject
       with EnumDWTCap
  /* 4369 */ val ICAP_PHYSICALWIDTH: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PHYSICALWIDTH & Double = js.native
  
  /** Sense of the pixel whose numeric value is zero (minimum data value).  */
  @js.native
  sealed trait ICAP_PIXELFLAVOR
    extends StObject
       with EnumDWTCap
  /* 4383 */ val ICAP_PIXELFLAVOR: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PIXELFLAVOR & Double = js.native
  
  /**
    * Used only for CCITT data compression. Specifies whether the compressed codes' pixel "sense"
    * will be inverted from the Current value of ICAP_PIXELFLAVOR prior to transfer.
    */
  @js.native
  sealed trait ICAP_PIXELFLAVORCODES
    extends StObject
       with EnumDWTCap
  /* 4391 */ val ICAP_PIXELFLAVORCODES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PIXELFLAVORCODES & Double = js.native
  
  /** The type of pixel data that a Source is capable of acquiring (for example, black and white, gray, RGB, etc.). */
  @js.native
  sealed trait ICAP_PIXELTYPE
    extends StObject
       with EnumDWTCap
  /* 257 */ val ICAP_PIXELTYPE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PIXELTYPE & Double = js.native
  
  /**
    * Allows the application and Source to identify which color data formats are available. There are
    * two options, "planar" and "chunky."
    */
  @js.native
  sealed trait ICAP_PLANARCHUNKY
    extends StObject
       with EnumDWTCap
  /* 4384 */ val ICAP_PLANARCHUNKY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PLANARCHUNKY & Double = js.native
  
  /**
    * How the Source can/should rotate the scanned image data prior to transfer. This doesn't use
    * ICAP_UNITS. It is always measured in degrees. Any applied value is additive with any
    * rotation specified in ICAP_ORIENTATION.
    */
  @js.native
  sealed trait ICAP_ROTATION
    extends StObject
       with EnumDWTCap
  /* 4385 */ val ICAP_ROTATION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_ROTATION & Double = js.native
  
  /**
    * Specifies which value in an image should be interpreted as the darkest "shadow." All values
    * "darker" than this value will be clipped to this value.
    */
  @js.native
  sealed trait ICAP_SHADOW
    extends StObject
       with EnumDWTCap
  /* 4371 */ val ICAP_SHADOW: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_SHADOW & Double = js.native
  
  /** Provides a list of bar code types that can be detected by the current Data Source. */
  @js.native
  sealed trait ICAP_SUPPORTEDBARCODETYPES
    extends StObject
       with EnumDWTCap
  /* 4408 */ val ICAP_SUPPORTEDBARCODETYPES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_SUPPORTEDBARCODETYPES & Double = js.native
  
  /** Added 2.1   */
  @js.native
  sealed trait ICAP_SUPPORTEDEXTIMAGEINFO
    extends StObject
       with EnumDWTCap
  /* 4446 */ val ICAP_SUPPORTEDEXTIMAGEINFO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_SUPPORTEDEXTIMAGEINFO & Double = js.native
  
  /** A list of patch code types that may be detected by the current Data Source. */
  @js.native
  sealed trait ICAP_SUPPORTEDPATCHCODETYPES
    extends StObject
       with EnumDWTCap
  /* 4416 */ val ICAP_SUPPORTEDPATCHCODETYPES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_SUPPORTEDPATCHCODETYPES & Double = js.native
  
  /**
    * For devices that support fixed frame sizes.
    * Defined sizes match typical page sizes. This specifies the size(s) the Source can/should use to acquire image data.
    */
  @js.native
  sealed trait ICAP_SUPPORTEDSIZES
    extends StObject
       with EnumDWTCap
  /* 4386 */ val ICAP_SUPPORTEDSIZES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_SUPPORTEDSIZES & Double = js.native
  
  /**
    * Specifies the dividing line between black and white. This is the value the Source will use to
    * threshold, if needed, when ICAP_PIXELTYPE=TWPT_BW.
    * The value is normalized so there are no units of measure associated with this ICAP.
    */
  @js.native
  sealed trait ICAP_THRESHOLD
    extends StObject
       with EnumDWTCap
  /* 4387 */ val ICAP_THRESHOLD: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_THRESHOLD & Double = js.native
  
  /** This is used with buffered memory transfers. If TRUE, Source can provide application with tiled image data. */
  @js.native
  sealed trait ICAP_TILES
    extends StObject
       with EnumDWTCap
  /* 4379 */ val ICAP_TILES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_TILES & Double = js.native
  
  /** Used only with CCITT data compression. Specifies the minimum number of words of compressed codes (compressed data) to be transmitted per line. */
  @js.native
  sealed trait ICAP_TIMEFILL
    extends StObject
       with EnumDWTCap
  /* 4394 */ val ICAP_TIMEFILL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_TIMEFILL & Double = js.native
  
  /**
    * If TRUE the Source will issue a MSG_XFERREADY before starting the scan.
    * Note= The Source may need to scan the image before initiating the transfer.
    * This is the case if the scanned image is rotated or merged with another scanned image.
    */
  @js.native
  sealed trait ICAP_UNDEFINEDIMAGESIZE
    extends StObject
       with EnumDWTCap
  /* 4397 */ val ICAP_UNDEFINEDIMAGESIZE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_UNDEFINEDIMAGESIZE & Double = js.native
  
  /**
    * Unless a quantity is dimensionless or uses a specified unit of measure, ICAP_UNITS determines
    * the unit of measure for all quantities.
    */
  @js.native
  sealed trait ICAP_UNITS
    extends StObject
       with EnumDWTCap
  /* 258 */ val ICAP_UNITS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_UNITS & Double = js.native
  
  /** Allows the application and Source to identify which transfer mechanisms the source supports. */
  @js.native
  sealed trait ICAP_XFERMECH
    extends StObject
       with EnumDWTCap
  /* 259 */ val ICAP_XFERMECH: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_XFERMECH & Double = js.native
  
  /**
    * The native optical resolution along the X-axis of the device being controlled by the Source. Most
    * devices will respond with a single value (TW_ONEVALUE).
    * This is NOT a list of all resolutions that can be generated by the device. Rather, this is the
    * resolution of the device's optics. Measured in units of pixels per unit as defined by
    * ICAP_UNITS (pixels per TWUN_PIXELS yields dimensionless data).
    */
  @js.native
  sealed trait ICAP_XNATIVERESOLUTION
    extends StObject
       with EnumDWTCap
  /* 4374 */ val ICAP_XNATIVERESOLUTION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_XNATIVERESOLUTION & Double = js.native
  
  /**
    * All the X-axis resolutions the Source can provide.
    * Measured in units of pixels per unit as defined by ICAP_UNITS (pixels per TWUN_PIXELS
    * yields dimensionless data). That is, when the units are TWUN_PIXELS, both
    * ICAP_XRESOLUTION and ICAP_YRESOLUTION shall report 1 pixel/pixel. Some data sources
    * like to report the actual number of pixels that the device reports, but that response is more
    * appropriate in ICAP_PHYSICALHEIGHT and ICAP_PHYSICALWIDTH.
    */
  @js.native
  sealed trait ICAP_XRESOLUTION
    extends StObject
       with EnumDWTCap
  /* 4376 */ val ICAP_XRESOLUTION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_XRESOLUTION & Double = js.native
  
  /**
    * All the X-axis scaling values available. A value of '1.0' is equivalent to 100% scaling.
    * Do not use values less than or equal to zero.
    */
  @js.native
  sealed trait ICAP_XSCALING
    extends StObject
       with EnumDWTCap
  /* 4388 */ val ICAP_XSCALING: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_XSCALING & Double = js.native
  
  /**
    * The native optical resolution along the Y-axis of the device being controlled by the Source.
    * Measured in units of pixels per unit as defined by ICAP_UNITS (pixels per TWUN_PIXELS
    * yields dimensionless data).
    */
  @js.native
  sealed trait ICAP_YNATIVERESOLUTION
    extends StObject
       with EnumDWTCap
  /* 4375 */ val ICAP_YNATIVERESOLUTION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_YNATIVERESOLUTION & Double = js.native
  
  /**
    * All the Y-axis resolutions the Source can provide.
    * Measured in units of pixels per unit as defined by ICAP_UNITS (pixels per TWUN_PIXELS
    * yields dimensionless data). That is, when the units are TWUN_PIXELS, both
    * ICAP_XRESOLUTION and ICAP_YRESOLUTION shall report 1 pixel/pixel. Some data sources
    * like to report the actual number of pixels that the device reports, but that response is more
    * appropriate in ICAP_PHYSICALHEIGHT and ICAP_PHYSICALWIDTH.
    */
  @js.native
  sealed trait ICAP_YRESOLUTION
    extends StObject
       with EnumDWTCap
  /* 4377 */ val ICAP_YRESOLUTION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_YRESOLUTION & Double = js.native
  
  /**
    * All the Y-axis scaling values available. A value of '1.0' is equivalent to 100% scaling. Do not use values less than or equal to zero.
    * There are no units inherent with this data as it is normalized to 1.0 being "unscaled."
    */
  @js.native
  sealed trait ICAP_YSCALING
    extends StObject
       with EnumDWTCap
  /* 4389 */ val ICAP_YSCALING: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_YSCALING & Double = js.native
  
  /** When used with CapGet(), returns all camera supported lens zooming range.  */
  @js.native
  sealed trait ICAP_ZOOMFACTOR
    extends StObject
       with EnumDWTCap
  /* 4414 */ val ICAP_ZOOMFACTOR: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_ZOOMFACTOR & Double = js.native
}
