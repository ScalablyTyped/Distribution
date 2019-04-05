package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusionTables extends js.Object {
  var Column: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs.ColumnCollection
  ] = js.undefined
  var Query: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs.QueryCollection
  ] = js.undefined
  var Style: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs.StyleCollection
  ] = js.undefined
  var Table: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs.TableCollection
  ] = js.undefined
  var Task: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs.TaskCollection
  ] = js.undefined
  var Template: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs.TemplateCollection
  ] = js.undefined
  // Create a new instance of Bucket
  def newBucket(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Bucket
  // Create a new instance of Column
  def newColumn(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Column
  // Create a new instance of ColumnBaseColumn
  def newColumnBaseColumn(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.ColumnBaseColumn
  // Create a new instance of LineStyle
  def newLineStyle(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.LineStyle
  // Create a new instance of PointStyle
  def newPointStyle(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.PointStyle
  // Create a new instance of PolygonStyle
  def newPolygonStyle(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.PolygonStyle
  // Create a new instance of StyleFunction
  def newStyleFunction(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleFunction
  // Create a new instance of StyleFunctionGradient
  def newStyleFunctionGradient(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleFunctionGradient
  // Create a new instance of StyleFunctionGradientColors
  def newStyleFunctionGradientColors(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleFunctionGradientColors
  // Create a new instance of StyleSetting
  def newStyleSetting(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleSetting
  // Create a new instance of Table
  def newTable(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Table
  // Create a new instance of Template
  def newTemplate(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Template
}

object FusionTables {
  @scala.inline
  def apply(
    newBucket: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Bucket,
    newColumn: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Column,
    newColumnBaseColumn: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.ColumnBaseColumn,
    newLineStyle: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.LineStyle,
    newPointStyle: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.PointStyle,
    newPolygonStyle: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.PolygonStyle,
    newStyleFunction: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleFunction,
    newStyleFunctionGradient: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleFunctionGradient,
    newStyleFunctionGradientColors: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleFunctionGradientColors,
    newStyleSetting: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.StyleSetting,
    newTable: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Table,
    newTemplate: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Template,
    Column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs.ColumnCollection = null,
    Query: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs.QueryCollection = null,
    Style: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs.StyleCollection = null,
    Table: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs.TableCollection = null,
    Task: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs.TaskCollection = null,
    Template: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.CollectionNs.TemplateCollection = null
  ): FusionTables = {
    val __obj = js.Dynamic.literal(newBucket = js.Any.fromFunction0(newBucket), newColumn = js.Any.fromFunction0(newColumn), newColumnBaseColumn = js.Any.fromFunction0(newColumnBaseColumn), newLineStyle = js.Any.fromFunction0(newLineStyle), newPointStyle = js.Any.fromFunction0(newPointStyle), newPolygonStyle = js.Any.fromFunction0(newPolygonStyle), newStyleFunction = js.Any.fromFunction0(newStyleFunction), newStyleFunctionGradient = js.Any.fromFunction0(newStyleFunctionGradient), newStyleFunctionGradientColors = js.Any.fromFunction0(newStyleFunctionGradientColors), newStyleSetting = js.Any.fromFunction0(newStyleSetting), newTable = js.Any.fromFunction0(newTable), newTemplate = js.Any.fromFunction0(newTemplate))
    if (Column != null) __obj.updateDynamic("Column")(Column)
    if (Query != null) __obj.updateDynamic("Query")(Query)
    if (Style != null) __obj.updateDynamic("Style")(Style)
    if (Table != null) __obj.updateDynamic("Table")(Table)
    if (Task != null) __obj.updateDynamic("Task")(Task)
    if (Template != null) __obj.updateDynamic("Template")(Template)
    __obj.asInstanceOf[FusionTables]
  }
}

