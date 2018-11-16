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
       * Sets the size mode used to print a chart.
       * @param sizeMode A System.String object, specifying the name of the size mode.
       */
  def SetSizeMode(sizeMode: java.lang.String): scala.Unit
}

