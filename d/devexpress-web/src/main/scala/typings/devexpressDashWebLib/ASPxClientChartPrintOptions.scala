package typings
package devexpressDashWebLib

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
  def GetCustomPaperHeight(): scala.Double
  /**
    * Gets the name of the custom paper width-height ratio used to print the chart.
    */
  def GetCustomPaperName(): java.lang.String
  /**
    * Gets the custom paper width which will be used to print a chart.
    */
  def GetCustomPaperWidth(): scala.Double
  /**
    * Gets a value indicating that the landscape orientation will be used to print a chart.
    */
  def GetLandscape(): scala.Boolean
  /**
    * Gets the bottom margin which will be used to print a chart.
    */
  def GetMarginBottom(): scala.Double
  /**
    * Gets the left margin which will be used to print a chart.
    */
  def GetMarginLeft(): scala.Double
  /**
    * Gets the right margin which will be used to print a chart.
    */
  def GetMarginRight(): scala.Double
  /**
    * Gets the top margin which will be used to print a chart.
    */
  def GetMarginTop(): scala.Double
  /**
    * Gets the predefined size ratio of the paper which will be used to print a chart.
    */
  def GetPaperKind(): java.lang.String
  /**
    * Returns the value that defines whether to display the crosshair on the printed or exported chart.
    */
  def GetPrintCrosshair(): scala.Boolean
  /**
    * Gets the size mode used to print a chart.
    */
  def GetSizeMode(): java.lang.String
  /**
    * Sets the custom paper height which will be used to print a chart.
    * @param customPaperHeight A System.Int32 object, specifying the height in hundredths of an inch.
    */
  def SetCustomPaperHeight(customPaperHeight: scala.Double): scala.Unit
  /**
    * Sets the name of the custom paper width-height ratio used to print a chart.
    * @param customPaperName A String object, specifying the name of the custom paper width-height ratio.
    */
  def SetCustomPaperName(customPaperName: java.lang.String): scala.Unit
  /**
    * Sets the custom paper width which will be used to print a chart.
    * @param customPaperWidth A System.Int32 object, specifying the width in hundredths of an inch.
    */
  def SetCustomPaperWidth(customPaperWidth: scala.Double): scala.Unit
  /**
    * Sets a value indicating that the landscape orientation will be used to print a chart.
    * @param landscape A Boolean value, specifying that the landscape orientation will be used to print a chart.
    */
  def SetLandscape(landscape: scala.Boolean): scala.Unit
  /**
    * Sets the bottom margin which will be used to print a chart.
    * @param marginBottom A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginBottom(marginBottom: scala.Double): scala.Unit
  /**
    * Sets the left margin which will be used to print a chart.
    * @param marginLeft A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginLeft(marginLeft: scala.Double): scala.Unit
  /**
    * Sets the right margin which will be used to print a chart.
    * @param marginRight A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginRight(marginRight: scala.Double): scala.Unit
  /**
    * Sets the top margin which will be used to print a chart.
    * @param marginTop A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginTop(marginTop: scala.Double): scala.Unit
  /**
    * Sets the predefined size ratio of the paper which will be used to print a chart.
    * @param paperKind A System.String object, specifying the name of a size ratio.
    */
  def SetPaperKind(paperKind: java.lang.String): scala.Unit
  /**
    * Specifies the value that defines whether to display the crosshair on the printed or exported chart.
    * @param printCrosshair true, if the crosshair should be printed or exported; otherwise, false.
    */
  def SetPrintCrosshair(printCrosshair: scala.Boolean): scala.Unit
  /**
    * Sets the size mode used to print a chart.
    * @param sizeMode A System.String object, specifying the name of the size mode.
    */
  def SetSizeMode(sizeMode: java.lang.String): scala.Unit
}

object ASPxClientChartPrintOptions {
  @scala.inline
  def apply(
    GetCustomPaperHeight: () => scala.Double,
    GetCustomPaperName: () => java.lang.String,
    GetCustomPaperWidth: () => scala.Double,
    GetLandscape: () => scala.Boolean,
    GetMarginBottom: () => scala.Double,
    GetMarginLeft: () => scala.Double,
    GetMarginRight: () => scala.Double,
    GetMarginTop: () => scala.Double,
    GetPaperKind: () => java.lang.String,
    GetPrintCrosshair: () => scala.Boolean,
    GetSizeMode: () => java.lang.String,
    SetCustomPaperHeight: scala.Double => scala.Unit,
    SetCustomPaperName: java.lang.String => scala.Unit,
    SetCustomPaperWidth: scala.Double => scala.Unit,
    SetLandscape: scala.Boolean => scala.Unit,
    SetMarginBottom: scala.Double => scala.Unit,
    SetMarginLeft: scala.Double => scala.Unit,
    SetMarginRight: scala.Double => scala.Unit,
    SetMarginTop: scala.Double => scala.Unit,
    SetPaperKind: java.lang.String => scala.Unit,
    SetPrintCrosshair: scala.Boolean => scala.Unit,
    SetSizeMode: java.lang.String => scala.Unit
  ): ASPxClientChartPrintOptions = {
    val __obj = js.Dynamic.literal(GetCustomPaperHeight = js.Any.fromFunction0(GetCustomPaperHeight), GetCustomPaperName = js.Any.fromFunction0(GetCustomPaperName), GetCustomPaperWidth = js.Any.fromFunction0(GetCustomPaperWidth), GetLandscape = js.Any.fromFunction0(GetLandscape), GetMarginBottom = js.Any.fromFunction0(GetMarginBottom), GetMarginLeft = js.Any.fromFunction0(GetMarginLeft), GetMarginRight = js.Any.fromFunction0(GetMarginRight), GetMarginTop = js.Any.fromFunction0(GetMarginTop), GetPaperKind = js.Any.fromFunction0(GetPaperKind), GetPrintCrosshair = js.Any.fromFunction0(GetPrintCrosshair), GetSizeMode = js.Any.fromFunction0(GetSizeMode), SetCustomPaperHeight = js.Any.fromFunction1(SetCustomPaperHeight), SetCustomPaperName = js.Any.fromFunction1(SetCustomPaperName), SetCustomPaperWidth = js.Any.fromFunction1(SetCustomPaperWidth), SetLandscape = js.Any.fromFunction1(SetLandscape), SetMarginBottom = js.Any.fromFunction1(SetMarginBottom), SetMarginLeft = js.Any.fromFunction1(SetMarginLeft), SetMarginRight = js.Any.fromFunction1(SetMarginRight), SetMarginTop = js.Any.fromFunction1(SetMarginTop), SetPaperKind = js.Any.fromFunction1(SetPaperKind), SetPrintCrosshair = js.Any.fromFunction1(SetPrintCrosshair), SetSizeMode = js.Any.fromFunction1(SetSizeMode))
  
    __obj.asInstanceOf[ASPxClientChartPrintOptions]
  }
}

