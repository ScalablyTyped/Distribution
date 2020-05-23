package typings.ejWebAll.ej.Spreadsheet

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
  sealed trait DataLabelCenter extends ChartProperties
  
  ///Specifies to make the data label inside base of the chart.
  @js.native
  sealed trait DataLabelInsideBase extends ChartProperties
  
  ///Specifies to make the data label inside end of the chart.
  @js.native
  sealed trait DataLabelInsideEnd extends ChartProperties
  
  ///Specifies to make the data label none of the chart.
  @js.native
  sealed trait DataLabelNone extends ChartProperties
  
  ///Specifies to make the data label outside end of the chart.
  @js.native
  sealed trait DataLabelOutsideEnd extends ChartProperties
  
  ///Specifies to make the legends to bottom of the chart.
  @js.native
  sealed trait LegendsBottom extends ChartProperties
  
  ///Specifies to make the legends to left of the chart.
  @js.native
  sealed trait LegendsLeft extends ChartProperties
  
  ///Specifies to make the legends to none of the chart.
  @js.native
  sealed trait LegendsNone extends ChartProperties
  
  ///Specifies to make the legends to right of the chart.
  @js.native
  sealed trait LegendsRight extends ChartProperties
  
  ///Specifies to make the legends to top of the chart.
  @js.native
  sealed trait LegendsTop extends ChartProperties
  
  ///To set the primary horizontal of the chart.
  @js.native
  sealed trait PrimaryHorizontal extends ChartProperties
  
  ///To set the primary horizontal axis title of the chart.
  @js.native
  sealed trait PrimaryHorizontalAxisTitle extends ChartProperties
  
  ///To set the primary major horizontal of the chart.
  @js.native
  sealed trait PrimaryMajorHorizontal extends ChartProperties
  
  ///To set the primary major vertical of the chart.
  @js.native
  sealed trait PrimaryMajorVertical extends ChartProperties
  
  ///To set the primary minor horizontal of the chart.
  @js.native
  sealed trait PrimaryMinorHorizontal extends ChartProperties
  
  ///To set the primary minor vertical of the chart.
  @js.native
  sealed trait PrimaryMinorVertical extends ChartProperties
  
  ///To set the primary vertical of the chart.
  @js.native
  sealed trait PrimaryVertical extends ChartProperties
  
  ///To set the primary vertical axis title of the chart.
  @js.native
  sealed trait PrimaryVerticalAxisTitle extends ChartProperties
  
  ///Specifies to make the title to center of the chart.
  @js.native
  sealed trait TitleCenter extends ChartProperties
  
  ///Specifies to make the title to far of the chart.
  @js.native
  sealed trait TitleFar extends ChartProperties
  
  ///Specifies to make the title to near of the chart.
  @js.native
  sealed trait TitleNear extends ChartProperties
  
  ///Specifies to make the title to none of the chart.
  @js.native
  sealed trait TitleNone extends ChartProperties
  
}

