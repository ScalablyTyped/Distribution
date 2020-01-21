package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The chart print options storage.
  */
@JSGlobal("ASPxClientChartPrintOptions")
@js.native
class ASPxClientChartPrintOptions () extends js.Object {
  /**
    * Gets the custom paper height which will be used to print a chart.
    */
  def GetCustomPaperHeight(): Double = js.native
  /**
    * Gets the name of the custom paper width-height ratio used to print the chart.
    */
  def GetCustomPaperName(): String = js.native
  /**
    * Gets the custom paper width which will be used to print a chart.
    */
  def GetCustomPaperWidth(): Double = js.native
  /**
    * Gets a value indicating that the landscape orientation will be used to print a chart.
    */
  def GetLandscape(): Boolean = js.native
  /**
    * Gets the bottom margin which will be used to print a chart.
    */
  def GetMarginBottom(): Double = js.native
  /**
    * Gets the left margin which will be used to print a chart.
    */
  def GetMarginLeft(): Double = js.native
  /**
    * Gets the right margin which will be used to print a chart.
    */
  def GetMarginRight(): Double = js.native
  /**
    * Gets the top margin which will be used to print a chart.
    */
  def GetMarginTop(): Double = js.native
  /**
    * Gets the predefined size ratio of the paper which will be used to print a chart.
    */
  def GetPaperKind(): String = js.native
  /**
    * Returns the value that defines whether to display the crosshair on the printed or exported chart.
    */
  def GetPrintCrosshair(): Boolean = js.native
  /**
    * Gets the size mode used to print a chart.
    */
  def GetSizeMode(): String = js.native
  /**
    * Sets the custom paper height which will be used to print a chart.
    * @param customPaperHeight A System.Int32 object, specifying the height in hundredths of an inch.
    */
  def SetCustomPaperHeight(customPaperHeight: Double): Unit = js.native
  /**
    * Sets the name of the custom paper width-height ratio used to print a chart.
    * @param customPaperName A String object, specifying the name of the custom paper width-height ratio.
    */
  def SetCustomPaperName(customPaperName: String): Unit = js.native
  /**
    * Sets the custom paper width which will be used to print a chart.
    * @param customPaperWidth A System.Int32 object, specifying the width in hundredths of an inch.
    */
  def SetCustomPaperWidth(customPaperWidth: Double): Unit = js.native
  /**
    * Sets a value indicating that the landscape orientation will be used to print a chart.
    * @param landscape A Boolean value, specifying that the landscape orientation will be used to print a chart.
    */
  def SetLandscape(landscape: Boolean): Unit = js.native
  /**
    * Sets the bottom margin which will be used to print a chart.
    * @param marginBottom A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginBottom(marginBottom: Double): Unit = js.native
  /**
    * Sets the left margin which will be used to print a chart.
    * @param marginLeft A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginLeft(marginLeft: Double): Unit = js.native
  /**
    * Sets the right margin which will be used to print a chart.
    * @param marginRight A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginRight(marginRight: Double): Unit = js.native
  /**
    * Sets the top margin which will be used to print a chart.
    * @param marginTop A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginTop(marginTop: Double): Unit = js.native
  /**
    * Sets the predefined size ratio of the paper which will be used to print a chart.
    * @param paperKind A System.String object, specifying the name of a size ratio.
    */
  def SetPaperKind(paperKind: String): Unit = js.native
  /**
    * Specifies the value that defines whether to display the crosshair on the printed or exported chart.
    * @param printCrosshair true, if the crosshair should be printed or exported; otherwise, false.
    */
  def SetPrintCrosshair(printCrosshair: Boolean): Unit = js.native
  /**
    * Sets the size mode used to print a chart.
    * @param sizeMode A System.String object, specifying the name of the size mode.
    */
  def SetSizeMode(sizeMode: String): Unit = js.native
}

