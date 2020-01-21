package typings.googleAppsScript.GoogleAppsScript.FusionTables

import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Column
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.ColumnList
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Import
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Sqlresponse
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.StyleSetting
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.StyleSettingList
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Table
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.TableList
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Task
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.TaskList
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Template
import typings.googleAppsScript.GoogleAppsScript.FusionTables.Schema.TemplateList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.FusionTables.Collection")
@js.native
object Collection extends js.Object {
  @js.native
  trait ColumnCollection extends js.Object {
    // Retrieves a specific column by its ID.
    def get(tableId: String, columnId: String): Column = js.native
    // Adds a new column to the table.
    def insert(resource: Column, tableId: String): Column = js.native
    // Retrieves a list of columns.
    def list(tableId: String): ColumnList = js.native
    // Retrieves a list of columns.
    def list(tableId: String, optionalArgs: js.Object): ColumnList = js.native
    // Updates the name or type of an existing column. This method supports patch semantics.
    def patch(resource: Column, tableId: String, columnId: String): Column = js.native
    // Deletes the specified column.
    def remove(tableId: String, columnId: String): Unit = js.native
    // Updates the name or type of an existing column.
    def update(resource: Column, tableId: String, columnId: String): Column = js.native
  }
  
  @js.native
  trait QueryCollection extends js.Object {
    // Executes a Fusion Tables SQL statement, which can be any of
    // - SELECT
    // - INSERT
    // - UPDATE
    // - DELETE
    // - SHOW
    // - DESCRIBE
    // - CREATE statement.
    def sql(sql: String): Sqlresponse = js.native
    // Executes a Fusion Tables SQL statement, which can be any of
    // - SELECT
    // - INSERT
    // - UPDATE
    // - DELETE
    // - SHOW
    // - DESCRIBE
    // - CREATE statement.
    def sql(sql: String, optionalArgs: js.Object): Sqlresponse = js.native
    // Executes a SQL statement which can be any of
    // - SELECT
    // - SHOW
    // - DESCRIBE
    def sqlGet(sql: String): Sqlresponse = js.native
    // Executes a SQL statement which can be any of
    // - SELECT
    // - SHOW
    // - DESCRIBE
    def sqlGet(sql: String, optionalArgs: js.Object): Sqlresponse = js.native
  }
  
  @js.native
  trait StyleCollection extends js.Object {
    // Gets a specific style.
    def get(tableId: String, styleId: Double): StyleSetting = js.native
    // Adds a new style for the table.
    def insert(resource: StyleSetting, tableId: String): StyleSetting = js.native
    // Retrieves a list of styles.
    def list(tableId: String): StyleSettingList = js.native
    // Retrieves a list of styles.
    def list(tableId: String, optionalArgs: js.Object): StyleSettingList = js.native
    // Updates an existing style. This method supports patch semantics.
    def patch(resource: StyleSetting, tableId: String, styleId: Double): StyleSetting = js.native
    // Deletes a style.
    def remove(tableId: String, styleId: Double): Unit = js.native
    // Updates an existing style.
    def update(resource: StyleSetting, tableId: String, styleId: Double): StyleSetting = js.native
  }
  
  @js.native
  trait TableCollection extends js.Object {
    // Copies a table.
    def copy(tableId: String): Table = js.native
    // Copies a table.
    def copy(tableId: String, optionalArgs: js.Object): Table = js.native
    // Retrieves a specific table by its ID.
    def get(tableId: String): Table = js.native
    // Imports more rows into a table.
    def importRows(tableId: String): Import = js.native
    // Imports more rows into a table.
    def importRows(tableId: String, mediaData: js.Any): Import = js.native
    // Imports more rows into a table.
    def importRows(tableId: String, mediaData: js.Any, optionalArgs: js.Object): Import = js.native
    // Imports a new table.
    def importTable(name: String): Table = js.native
    // Imports a new table.
    def importTable(name: String, mediaData: js.Any): Table = js.native
    // Imports a new table.
    def importTable(name: String, mediaData: js.Any, optionalArgs: js.Object): Table = js.native
    // Creates a new table.
    def insert(resource: Table): Table = js.native
    // Retrieves a list of tables a user owns.
    def list(): TableList = js.native
    // Retrieves a list of tables a user owns.
    def list(optionalArgs: js.Object): TableList = js.native
    // Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch semantics.
    def patch(resource: Table, tableId: String): Table = js.native
    // Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch semantics.
    def patch(resource: Table, tableId: String, optionalArgs: js.Object): Table = js.native
    // Replaces rows of the table with the rows of the spreadsheet that is first imported from. Current rows remain visible until all replacement rows are ready.
    def refetchSheet(tableId: String): Task = js.native
    // Deletes a table.
    def remove(tableId: String): Unit = js.native
    // Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready.
    def replaceRows(tableId: String): Task = js.native
    // Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready.
    def replaceRows(tableId: String, mediaData: js.Any): Task = js.native
    // Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready.
    def replaceRows(tableId: String, mediaData: js.Any, optionalArgs: js.Object): Task = js.native
    // Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated.
    def update(resource: Table, tableId: String): Table = js.native
    // Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated.
    def update(resource: Table, tableId: String, optionalArgs: js.Object): Table = js.native
  }
  
  @js.native
  trait TaskCollection extends js.Object {
    // Retrieves a specific task by its ID.
    def get(tableId: String, taskId: String): Task = js.native
    // Retrieves a list of tasks.
    def list(tableId: String): TaskList = js.native
    // Retrieves a list of tasks.
    def list(tableId: String, optionalArgs: js.Object): TaskList = js.native
    // Deletes a specific task by its ID, unless that task has already started running.
    def remove(tableId: String, taskId: String): Unit = js.native
  }
  
  @js.native
  trait TemplateCollection extends js.Object {
    // Retrieves a specific template by its id
    def get(tableId: String, templateId: Double): Template = js.native
    // Creates a new template for the table.
    def insert(resource: Template, tableId: String): Template = js.native
    // Retrieves a list of templates.
    def list(tableId: String): TemplateList = js.native
    // Retrieves a list of templates.
    def list(tableId: String, optionalArgs: js.Object): TemplateList = js.native
    // Updates an existing template. This method supports patch semantics.
    def patch(resource: Template, tableId: String, templateId: Double): Template = js.native
    // Deletes a template
    def remove(tableId: String, templateId: Double): Unit = js.native
    // Updates an existing template
    def update(resource: Template, tableId: String, templateId: Double): Template = js.native
  }
  
}

