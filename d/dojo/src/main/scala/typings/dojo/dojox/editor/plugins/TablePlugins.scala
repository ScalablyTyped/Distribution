package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor._Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/TablePlugins.html
  *
  * A collection of Plugins for inserting and modifying tables in the Editor
  * See end of this document for all available plugs
  * and dojox/editorPlugins/tests/editorTablePlugs.html for an example
  *
  * NOT IMPLEMENTED: Not handling cell merge, span or split
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.TablePlugins")
@js.native
class TablePlugins () extends _Plugin {
  def this(args: js.Object) = this()
  /**
    *
    */
  var alwaysAvailable: Boolean = js.native
  /**
    *
    */
  var commandName: String = js.native
  /**
    *
    */
  var label: String = js.native
  /**
    *
    */
  var undoEnabled: Boolean = js.native
  /**
    *
    */
  def begEdit(): Unit = js.native
  /**
    *
    */
  def endEdit(): Unit = js.native
  /**
    * Gets the selected cells from the passed table.
    *
    */
  def getSelectedCells(): js.Any = js.native
  /**
    * Gets the table in focus
    * Collects info on the table - see return params
    *
    * @param forceNewData
    */
  def getTableInfo(forceNewData: js.Any): js.Any = js.native
  /**
    * After changing column amount, change widths to
    * keep columns even
    *
    */
  def makeColumnsEven(): Unit = js.native
  /**
    * Where each plugin performs its action.
    * Note: not using execCommand. In spite of their presence in the
    * Editor as query-able plugins, I was not able to find any evidence
    * that they are supported (especially in NOT IE). If they are
    * supported in other browsers, it may help with the undo problem.
    *
    * @param cmd
    * @param args
    */
  def modTable(cmd: js.Any, args: js.Any): Unit = js.native
  /**
    * subscribed to from the global object's publish method
    *
    * @param withinTable
    */
  def onDisplayChanged(withinTable: js.Any): Unit = js.native
  /**
    *
    */
  def onEditorLoaded(): Unit = js.native
  /**
    *
    */
  def selectTable(): Unit = js.native
  /**
    *
    * @param editor
    */
  def setEditor(editor: js.Any): Unit = js.native
}

