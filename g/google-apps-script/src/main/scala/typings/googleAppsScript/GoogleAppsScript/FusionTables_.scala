package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.FusionTables.Collection.ColumnCollection
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Collection.QueryCollection
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Collection.StyleCollection
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Collection.TableCollection
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Collection.TaskCollection
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Collection.TemplateCollection
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Bucket
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Column
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.ColumnBaseColumn
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.LineStyle
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.PointStyle
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.PolygonStyle
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.StyleFunction
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.StyleFunctionGradient
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.StyleFunctionGradientColors
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.StyleSetting
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Table
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusionTables_ extends js.Object {
  var Column: js.UndefOr[ColumnCollection] = js.undefined
  var Query: js.UndefOr[QueryCollection] = js.undefined
  var Style: js.UndefOr[StyleCollection] = js.undefined
  var Table: js.UndefOr[TableCollection] = js.undefined
  var Task: js.UndefOr[TaskCollection] = js.undefined
  var Template: js.UndefOr[TemplateCollection] = js.undefined
  // Create a new instance of Bucket
  def newBucket(): Bucket
  // Create a new instance of Column
  def newColumn(): Column
  // Create a new instance of ColumnBaseColumn
  def newColumnBaseColumn(): ColumnBaseColumn
  // Create a new instance of LineStyle
  def newLineStyle(): LineStyle
  // Create a new instance of PointStyle
  def newPointStyle(): PointStyle
  // Create a new instance of PolygonStyle
  def newPolygonStyle(): PolygonStyle
  // Create a new instance of StyleFunction
  def newStyleFunction(): StyleFunction
  // Create a new instance of StyleFunctionGradient
  def newStyleFunctionGradient(): StyleFunctionGradient
  // Create a new instance of StyleFunctionGradientColors
  def newStyleFunctionGradientColors(): StyleFunctionGradientColors
  // Create a new instance of StyleSetting
  def newStyleSetting(): StyleSetting
  // Create a new instance of Table
  def newTable(): Table
  // Create a new instance of Template
  def newTemplate(): Template
}

object FusionTables_ {
  @scala.inline
  def apply(
    newBucket: () => Bucket,
    newColumn: () => Column,
    newColumnBaseColumn: () => ColumnBaseColumn,
    newLineStyle: () => LineStyle,
    newPointStyle: () => PointStyle,
    newPolygonStyle: () => PolygonStyle,
    newStyleFunction: () => StyleFunction,
    newStyleFunctionGradient: () => StyleFunctionGradient,
    newStyleFunctionGradientColors: () => StyleFunctionGradientColors,
    newStyleSetting: () => StyleSetting,
    newTable: () => Table,
    newTemplate: () => Template,
    Column: ColumnCollection = null,
    Query: QueryCollection = null,
    Style: StyleCollection = null,
    Table: TableCollection = null,
    Task: TaskCollection = null,
    Template: TemplateCollection = null
  ): FusionTables_ = {
    val __obj = js.Dynamic.literal(newBucket = js.Any.fromFunction0(newBucket), newColumn = js.Any.fromFunction0(newColumn), newColumnBaseColumn = js.Any.fromFunction0(newColumnBaseColumn), newLineStyle = js.Any.fromFunction0(newLineStyle), newPointStyle = js.Any.fromFunction0(newPointStyle), newPolygonStyle = js.Any.fromFunction0(newPolygonStyle), newStyleFunction = js.Any.fromFunction0(newStyleFunction), newStyleFunctionGradient = js.Any.fromFunction0(newStyleFunctionGradient), newStyleFunctionGradientColors = js.Any.fromFunction0(newStyleFunctionGradientColors), newStyleSetting = js.Any.fromFunction0(newStyleSetting), newTable = js.Any.fromFunction0(newTable), newTemplate = js.Any.fromFunction0(newTemplate))
    if (Column != null) __obj.updateDynamic("Column")(Column.asInstanceOf[js.Any])
    if (Query != null) __obj.updateDynamic("Query")(Query.asInstanceOf[js.Any])
    if (Style != null) __obj.updateDynamic("Style")(Style.asInstanceOf[js.Any])
    if (Table != null) __obj.updateDynamic("Table")(Table.asInstanceOf[js.Any])
    if (Task != null) __obj.updateDynamic("Task")(Task.asInstanceOf[js.Any])
    if (Template != null) __obj.updateDynamic("Template")(Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTables_]
  }
}

