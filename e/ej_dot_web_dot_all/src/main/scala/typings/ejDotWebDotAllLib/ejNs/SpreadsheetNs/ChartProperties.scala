package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartProperties extends js.Object

@JSGlobal("ej.Spreadsheet.ChartProperties")
@js.native
object ChartProperties extends js.Object {
  ///Specifies to make the data label center of the chart.
  @js.native
  sealed trait DataLabelCenter
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///Specifies to make the data label inside base of the chart.
  @js.native
  sealed trait DataLabelInsideBase
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///Specifies to make the data label inside end of the chart.
  @js.native
  sealed trait DataLabelInsideEnd
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///Specifies to make the data label none of the chart.
  @js.native
  sealed trait DataLabelNone
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///Specifies to make the data label outside end of the chart.
  @js.native
  sealed trait DataLabelOutsideEnd
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///Specifies to make the legends to bottom of the chart.
  @js.native
  sealed trait LegendsBottom
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///Specifies to make the legends to left of the chart.
  @js.native
  sealed trait LegendsLeft
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///Specifies to make the legends to none of the chart.
  @js.native
  sealed trait LegendsNone
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///Specifies to make the legends to right of the chart.
  @js.native
  sealed trait LegendsRight
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///Specifies to make the legends to top of the chart.
  @js.native
  sealed trait LegendsTop
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///To set the primary horizontal of the chart.
  @js.native
  sealed trait PrimaryHorizontal
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///To set the primary horizontal axis title of the chart.
  @js.native
  sealed trait PrimaryHorizontalAxisTitle
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///To set the primary major horizontal of the chart.
  @js.native
  sealed trait PrimaryMajorHorizontal
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///To set the primary major vertical of the chart.
  @js.native
  sealed trait PrimaryMajorVertical
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///To set the primary minor horizontal of the chart.
  @js.native
  sealed trait PrimaryMinorHorizontal
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///To set the primary minor vertical of the chart.
  @js.native
  sealed trait PrimaryMinorVertical
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///To set the primary vertical of the chart.
  @js.native
  sealed trait PrimaryVertical
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///To set the primary vertical axis title of the chart.
  @js.native
  sealed trait PrimaryVerticalAxisTitle
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///Specifies to make the title to center of the chart.
  @js.native
  sealed trait TitleCenter
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///Specifies to make the title to far of the chart.
  @js.native
  sealed trait TitleFar
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///Specifies to make the title to near of the chart.
  @js.native
  sealed trait TitleNear
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  ///Specifies to make the title to none of the chart.
  @js.native
  sealed trait TitleNone
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties
  
  /* 0 */ val DataLabelCenter: DataLabelCenter with scala.Double = js.native
  /* 1 */ val DataLabelInsideBase: DataLabelInsideBase with scala.Double = js.native
  /* 2 */ val DataLabelInsideEnd: DataLabelInsideEnd with scala.Double = js.native
  /* 3 */ val DataLabelNone: DataLabelNone with scala.Double = js.native
  /* 4 */ val DataLabelOutsideEnd: DataLabelOutsideEnd with scala.Double = js.native
  /* 5 */ val LegendsBottom: LegendsBottom with scala.Double = js.native
  /* 6 */ val LegendsLeft: LegendsLeft with scala.Double = js.native
  /* 7 */ val LegendsNone: LegendsNone with scala.Double = js.native
  /* 8 */ val LegendsRight: LegendsRight with scala.Double = js.native
  /* 9 */ val LegendsTop: LegendsTop with scala.Double = js.native
  /* 10 */ val PrimaryHorizontal: PrimaryHorizontal with scala.Double = js.native
  /* 11 */ val PrimaryHorizontalAxisTitle: PrimaryHorizontalAxisTitle with scala.Double = js.native
  /* 12 */ val PrimaryMajorHorizontal: PrimaryMajorHorizontal with scala.Double = js.native
  /* 13 */ val PrimaryMajorVertical: PrimaryMajorVertical with scala.Double = js.native
  /* 14 */ val PrimaryMinorHorizontal: PrimaryMinorHorizontal with scala.Double = js.native
  /* 15 */ val PrimaryMinorVertical: PrimaryMinorVertical with scala.Double = js.native
  /* 16 */ val PrimaryVertical: PrimaryVertical with scala.Double = js.native
  /* 17 */ val PrimaryVerticalAxisTitle: PrimaryVerticalAxisTitle with scala.Double = js.native
  /* 18 */ val TitleCenter: TitleCenter with scala.Double = js.native
  /* 19 */ val TitleFar: TitleFar with scala.Double = js.native
  /* 20 */ val TitleNear: TitleNear with scala.Double = js.native
  /* 21 */ val TitleNone: TitleNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.ChartProperties with scala.Double] = js.native
}

