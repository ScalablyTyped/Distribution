package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The chart print options storage.
  */
trait ASPxClientChartPrintOptions extends js.Object {
  /**
    * Gets the custom paper height which will be used to print a chart.
    */
  def GetCustomPaperHeight(): Double
  /**
    * Gets the name of the custom paper width-height ratio used to print the chart.
    */
  def GetCustomPaperName(): String
  /**
    * Gets the custom paper width which will be used to print a chart.
    */
  def GetCustomPaperWidth(): Double
  /**
    * Gets a value indicating that the landscape orientation will be used to print a chart.
    */
  def GetLandscape(): Boolean
  /**
    * Gets the bottom margin which will be used to print a chart.
    */
  def GetMarginBottom(): Double
  /**
    * Gets the left margin which will be used to print a chart.
    */
  def GetMarginLeft(): Double
  /**
    * Gets the right margin which will be used to print a chart.
    */
  def GetMarginRight(): Double
  /**
    * Gets the top margin which will be used to print a chart.
    */
  def GetMarginTop(): Double
  /**
    * Gets the predefined size ratio of the paper which will be used to print a chart.
    */
  def GetPaperKind(): String
  /**
    * Returns the value that defines whether to display the crosshair on the printed or exported chart.
    */
  def GetPrintCrosshair(): Boolean
  /**
    * Gets the size mode used to print a chart.
    */
  def GetSizeMode(): String
  /**
    * Sets the custom paper height which will be used to print a chart.
    * @param customPaperHeight A System.Int32 object, specifying the height in hundredths of an inch.
    */
  def SetCustomPaperHeight(customPaperHeight: Double): Unit
  /**
    * Sets the name of the custom paper width-height ratio used to print a chart.
    * @param customPaperName A String object, specifying the name of the custom paper width-height ratio.
    */
  def SetCustomPaperName(customPaperName: String): Unit
  /**
    * Sets the custom paper width which will be used to print a chart.
    * @param customPaperWidth A System.Int32 object, specifying the width in hundredths of an inch.
    */
  def SetCustomPaperWidth(customPaperWidth: Double): Unit
  /**
    * Sets a value indicating that the landscape orientation will be used to print a chart.
    * @param landscape A Boolean value, specifying that the landscape orientation will be used to print a chart.
    */
  def SetLandscape(landscape: Boolean): Unit
  /**
    * Sets the bottom margin which will be used to print a chart.
    * @param marginBottom A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginBottom(marginBottom: Double): Unit
  /**
    * Sets the left margin which will be used to print a chart.
    * @param marginLeft A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginLeft(marginLeft: Double): Unit
  /**
    * Sets the right margin which will be used to print a chart.
    * @param marginRight A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginRight(marginRight: Double): Unit
  /**
    * Sets the top margin which will be used to print a chart.
    * @param marginTop A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginTop(marginTop: Double): Unit
  /**
    * Sets the predefined size ratio of the paper which will be used to print a chart.
    * @param paperKind A System.String object, specifying the name of a size ratio.
    */
  def SetPaperKind(paperKind: String): Unit
  /**
    * Specifies the value that defines whether to display the crosshair on the printed or exported chart.
    * @param printCrosshair true, if the crosshair should be printed or exported; otherwise, false.
    */
  def SetPrintCrosshair(printCrosshair: Boolean): Unit
  /**
    * Sets the size mode used to print a chart.
    * @param sizeMode A System.String object, specifying the name of the size mode.
    */
  def SetSizeMode(sizeMode: String): Unit
}

object ASPxClientChartPrintOptions {
  @scala.inline
  def apply(
    GetCustomPaperHeight: () => Double,
    GetCustomPaperName: () => String,
    GetCustomPaperWidth: () => Double,
    GetLandscape: () => Boolean,
    GetMarginBottom: () => Double,
    GetMarginLeft: () => Double,
    GetMarginRight: () => Double,
    GetMarginTop: () => Double,
    GetPaperKind: () => String,
    GetPrintCrosshair: () => Boolean,
    GetSizeMode: () => String,
    SetCustomPaperHeight: Double => Unit,
    SetCustomPaperName: String => Unit,
    SetCustomPaperWidth: Double => Unit,
    SetLandscape: Boolean => Unit,
    SetMarginBottom: Double => Unit,
    SetMarginLeft: Double => Unit,
    SetMarginRight: Double => Unit,
    SetMarginTop: Double => Unit,
    SetPaperKind: String => Unit,
    SetPrintCrosshair: Boolean => Unit,
    SetSizeMode: String => Unit
  ): ASPxClientChartPrintOptions = {
    val __obj = js.Dynamic.literal(GetCustomPaperHeight = js.Any.fromFunction0(GetCustomPaperHeight), GetCustomPaperName = js.Any.fromFunction0(GetCustomPaperName), GetCustomPaperWidth = js.Any.fromFunction0(GetCustomPaperWidth), GetLandscape = js.Any.fromFunction0(GetLandscape), GetMarginBottom = js.Any.fromFunction0(GetMarginBottom), GetMarginLeft = js.Any.fromFunction0(GetMarginLeft), GetMarginRight = js.Any.fromFunction0(GetMarginRight), GetMarginTop = js.Any.fromFunction0(GetMarginTop), GetPaperKind = js.Any.fromFunction0(GetPaperKind), GetPrintCrosshair = js.Any.fromFunction0(GetPrintCrosshair), GetSizeMode = js.Any.fromFunction0(GetSizeMode), SetCustomPaperHeight = js.Any.fromFunction1(SetCustomPaperHeight), SetCustomPaperName = js.Any.fromFunction1(SetCustomPaperName), SetCustomPaperWidth = js.Any.fromFunction1(SetCustomPaperWidth), SetLandscape = js.Any.fromFunction1(SetLandscape), SetMarginBottom = js.Any.fromFunction1(SetMarginBottom), SetMarginLeft = js.Any.fromFunction1(SetMarginLeft), SetMarginRight = js.Any.fromFunction1(SetMarginRight), SetMarginTop = js.Any.fromFunction1(SetMarginTop), SetPaperKind = js.Any.fromFunction1(SetPaperKind), SetPrintCrosshair = js.Any.fromFunction1(SetPrintCrosshair), SetSizeMode = js.Any.fromFunction1(SetSizeMode))
  
    __obj.asInstanceOf[ASPxClientChartPrintOptions]
  }
}

