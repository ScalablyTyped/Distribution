package typings.googleAppsScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A text style configuration object. Used in charts options to configure text style for elements
  * that accepts it, such as title, horizontal axis, vertical axis, legend and tooltip.
  *
  *     // This example creates a chart specifying different text styles for the title and axes.
  *       var sampleData = Charts.newDataTable()
  *           .addColumn(Charts.ColumnType.STRING, "Seasons")
  *           .addColumn(Charts.ColumnType.NUMBER, "Rainy Days")
  *           .addRow(["Winter", 5])
  *           .addRow(["Spring", 12])
  *           .addRow(["Summer", 8])
  *           .addRow(["Fall", 8])
  *           .build();
  *
  *       var titleTextStyleBuilder = Charts.newTextStyle()
  *           .setColor('#0000FF').setFontSize(26).setFontName('Ariel');
  *       var axisTextStyleBuilder = Charts.newTextStyle()
  *           .setColor('#3A3A3A').setFontSize(20).setFontName('Ariel');
  *       var titleTextStyle = titleTextStyleBuilder.build();
  *       var axisTextStyle = axisTextStyleBuilder.build();
  *
  *       var chart = Charts.newLineChart()
  *           .setTitleTextStyle(titleTextStyle)
  *           .setXAxisTitleTextStyle(axisTextStyle)
  *           .setYAxisTitleTextStyle(axisTextStyle)
  *           .setTitle('Rainy Days Per Season')
  *           .setXAxisTitle('Season')
  *           .setYAxisTitle('Number of Rainy Days')
  *           .setDataTable(sampleData)
  *           .build();
  */
trait TextStyle extends js.Object {
  def getColor(): String
  def getFontName(): String
  def getFontSize(): Double
}

object TextStyle {
  @scala.inline
  def apply(getColor: () => String, getFontName: () => String, getFontSize: () => Double): TextStyle = {
    val __obj = js.Dynamic.literal(getColor = js.Any.fromFunction0(getColor), getFontName = js.Any.fromFunction0(getFontName), getFontSize = js.Any.fromFunction0(getFontSize))
  
    __obj.asInstanceOf[TextStyle]
  }
}

