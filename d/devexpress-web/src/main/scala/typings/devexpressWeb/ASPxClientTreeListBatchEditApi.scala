package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides members related to Batch Edit Mode.
  */
@js.native
trait ASPxClientTreeListBatchEditApi extends StObject {
  
  /**
    * Adds a new node when ASPxTreeList is in Batch Edit mode.
    * @param parentNodeKey A string value representing a parent node key.
    */
  def AddNewNode(parentNodeKey: String): Unit = js.native
  
  /**
    * Deletes the specified node when ASPxTreeList is in Batch Edit.
    * @param nodeKey An integer value that identifies the node index.
    */
  def DeleteNode(nodeKey: String): Unit = js.native
  
  /**
    * Ends cell or node editing.
    */
  def EndEdit(): Unit = js.native
  
  /**
    * Gets a container holding data cell content. An object that is the HTML container element that contains the data cell's content.
    * @param nodeKey An integer value that is the visible index.
    * @param columnFieldNameOrId A string value that is the column's Field Name or ID.
    */
  def GetCellTextContainer(nodeKey: String, columnFieldNameOrId: String): js.Any = js.native
  
  /**
    * Gets the value of the specified cell. An object containing the specified cell's value.
    * @param nodeKey A zero-based integer value that specifies a visible index of a node containing the processed cell.
    * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's WebColumnBase.Name property value) of a column containing the processed cell.
    */
  def GetCellValue(nodeKey: String, columnFieldNameOrId: String): js.Any = js.native
  def GetCellValue(nodeKey: String, columnFieldNameOrId: String, initial: Boolean): js.Any = js.native
  
  /**
    * Provides the text displayed within the cell according to the specified display format rule. A string value representing the cell's displayed text.
    * @param columnFieldNameOrId A string value representing the column's unique identifier or field name.
    * @param value An object representing a value.
    */
  def GetColumnDisplayText(columnFieldNameOrId: String, value: js.Any): String = js.native
  
  /**
    * Returns an array of the deleted node keys.
    */
  def GetDeletedNodeKeys(): js.Array[String] = js.native
  
  /**
    * Gets information about the cell currently being edited.
    */
  def GetEditCellInfo(): ASPxClientTreeListCellInfo = js.native
  
  /**
    * Returns an array of the inserted node keys.
    */
  def GetInsertedNodeKeys(): js.Array[String] = js.native
  
  /**
    * Returns an array of node keys. An array of string values that are node keys.
    * @param includeDeleted true, to include deleted cards keys to the returned array; otherwise, false.
    */
  def GetNodeKeys(includeDeleted: Boolean): js.Array[String] = js.native
  
  /**
    * Returns an object that stores unsaved changes.
    */
  def GetUnsavedChanges(): js.Any = js.native
  
  /**
    * Returns an array of the updated nodes' keys.
    */
  def GetUpdatedNodeKeys(): js.Array[String] = js.native
  
  /**
    * Returns a value that indicates whether the specified node has changed data. true, if the node has changed data; otherwise, false.
    * @param nodeKey An string value that specifies the node key.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's WebColumnBase.Name property value).
    */
  def HasChanges(): Boolean = js.native
  def HasChanges(nodeKey: String): Boolean = js.native
  def HasChanges(nodeKey: String, columnFieldNameOrId: String): Boolean = js.native
  def HasChanges(nodeKey: Unit, columnFieldNameOrId: String): Boolean = js.native
  
  /**
    * Indicates if the node with the specified key is deleted. true, if the node is deleted; otherwise, false.
    * @param nodeKey An string value that identifies the node by its key.
    */
  def IsDeletedNode(nodeKey: String): Boolean = js.native
  
  /**
    * Indicates if the node with the specified key is newly created. true, if the node is new; otherwise, false.
    * @param nodeKey An string value that identifies the node by its key.
    */
  def IsNewNode(nodeKey: String): Boolean = js.native
  
  /**
    * Programmatically moves the focus to the previous cell in the node.
    */
  def MoveFocusBackward(): Boolean = js.native
  
  /**
    * Programmatically moves the focus to the next cell in the node.
    */
  def MoveFocusForward(): Boolean = js.native
  
  /**
    * Recovers the specified node when ASPxTreeList is in Batch Edit mode.
    * @param nodeKey An string value that identifies the node key.
    */
  def RecoverNode(nodeKey: String): Unit = js.native
  
  /**
    * Resets changes in the specified node.
    * @param nodeKey An string value that specifies the key of the node containing the processed cell.
    * @param columnIndex An integer value that specifies the field name or unique identifier (the column's WebColumnBase.Name property value) of a column containing the processed cell.
    */
  def ResetChanges(nodeKey: String): Unit = js.native
  def ResetChanges(nodeKey: String, columnIndex: Double): Unit = js.native
  
  /**
    * Sets the specified cell value.
    * @param nodeKey A string value that identifies the key of a node containing the processed cell.
    * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's WebColumnBase.Name property value) of a column containing the processed cell.
    * @param value An object that contains the new cell value.
    * @param displayText A string value that specifies the cell display text.
    * @param cancelCellHighlighting true to cancel highlighting of the modified cell, false to highlight the modified cell.
    */
  def SetCellValue(nodeKey: String, columnFieldNameOrId: String, value: js.Any): Unit = js.native
  def SetCellValue(nodeKey: String, columnFieldNameOrId: String, value: js.Any, displayText: String): Unit = js.native
  def SetCellValue(
    nodeKey: String,
    columnFieldNameOrId: String,
    value: js.Any,
    displayText: String,
    cancelCellHighlighting: Boolean
  ): Unit = js.native
  def SetCellValue(
    nodeKey: String,
    columnFieldNameOrId: String,
    value: js.Any,
    displayText: Unit,
    cancelCellHighlighting: Boolean
  ): Unit = js.native
  
  /**
    * Switches the specified cell to edit mode.
    * @param nodeKey A string value that specifies the key of a node containing the processed cell.
    * @param columnIndex A zero-based integer value that identifies the column which contains the processed cell in the column collection.
    */
  def StartEdit(nodeKey: String, columnIndex: Double): Unit = js.native
  
  /**
    * Performs validation of tree list data contained in a specified node when the tree list operates in Batch Edit mode. true, if data in the specified node data passes validation; otherwise, false.
    * @param nodeKey An integer value specifying the visible index of the validated node.
    */
  def ValidateNode(nodeKey: String): Boolean = js.native
  
  /**
    * Performs validation of tree list data contained in all nodes when the tree list operates in Batch Edit mode. true, if data in all nodes passes validation; otherwise, false.
    * @param validateOnlyModified true, to validate only modified nodes; otherwise, false.
    */
  def ValidateNodes(): Boolean = js.native
  def ValidateNodes(validateOnlyModified: Boolean): Boolean = js.native
}
