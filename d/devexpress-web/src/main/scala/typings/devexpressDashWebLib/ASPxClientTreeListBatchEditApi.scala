package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides members related to Batch Edit Mode.
 */
@js.native
trait ASPxClientTreeListBatchEditApi extends js.Object {
  /**
       * Adds a new node when ASPxTreeList is in Batch Edit mode.
       * @param parentNodeKey A string value representing a parent node key.
       */
  def AddNewNode(parentNodeKey: java.lang.String): scala.Unit = js.native
  /**
       * Deletes the specified node when ASPxTreeList is in Batch Edit.
       * @param nodeKey An integer value that identifies the node index.
       */
  def DeleteNode(nodeKey: java.lang.String): scala.Unit = js.native
  /**
       * Ends cell or node editing.
       */
  def EndEdit(): scala.Unit = js.native
  /**
       * Gets a container holding data cell content.
       * @param nodeKey An integer value that is the visible index.
       * @param columnFieldNameOrId A string value that is the column's Field Name or ID.
       */
  def GetCellTextContainer(nodeKey: java.lang.String, columnFieldNameOrId: java.lang.String): js.Object = js.native
  /**
       * Gets the value of the specified cell.
       * @param nodeKey A zero-based integer value that specifies a visible index of a node containing the processed cell.
       * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
       * @param initial 
       */
  def GetCellValue(nodeKey: java.lang.String, columnFieldNameOrId: java.lang.String): js.Object = js.native
  /**
       * Gets the value of the specified cell.
       * @param nodeKey A zero-based integer value that specifies a visible index of a node containing the processed cell.
       * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
       * @param initial 
       */
  def GetCellValue(nodeKey: java.lang.String, columnFieldNameOrId: java.lang.String, initial: scala.Boolean): js.Object = js.native
  /**
       * Provides the text displayed within the cell according to the specified display format rule.
       * @param columnFieldNameOrId A string value representing the column's unique identifier or field name.
       * @param value An object representing a value.
       */
  def GetColumnDisplayText(columnFieldNameOrId: java.lang.String, value: js.Object): java.lang.String = js.native
  /**
       * Returns an array of the deleted node keys.
       */
  def GetDeletedNodeKeys(): js.Array[java.lang.String] = js.native
  /**
       * Gets information about the cell currently being edited.
       */
  def GetEditCellInfo(): ASPxClientTreeListCellInfo = js.native
  /**
       * Returns an array of the inserted node keys.
       */
  def GetInsertedNodeKeys(): js.Array[java.lang.String] = js.native
  /**
       * Returns an array of node keys.
       * @param includeDeleted true, to include deleted cards keys to the returned array; otherwise, false.
       */
  def GetNodeKeys(includeDeleted: scala.Boolean): js.Array[java.lang.String] = js.native
  /**
       * Returns an object that stores unsaved changes.
       */
  def GetUnsavedChanges(): js.Object = js.native
  /**
       * Returns an array of the updated nodes' keys.
       */
  def GetUpdatedNodeKeys(): js.Array[java.lang.String] = js.native
  /**
       * Returns a value that indicates whether the Tree List has changed data.
       */
  def HasChanges(): scala.Boolean = js.native
  /**
       * Returns a value that indicates whether the specified node has changed data.
       * @param nodeKey An string value that specifies the node key.
       */
  def HasChanges(nodeKey: java.lang.String): scala.Boolean = js.native
  /**
       * Returns a value that indicates whether the specified node has changed data.
       * @param nodeKey An string value that specifies the node key.
       * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
       */
  def HasChanges(nodeKey: java.lang.String, columnFieldNameOrId: java.lang.String): scala.Boolean = js.native
  /**
       * Indicates if the node with the specified key is deleted.
       * @param nodeKey An string value that identifies the node by its key.
       */
  def IsDeletedNode(nodeKey: java.lang.String): scala.Boolean = js.native
  /**
       * Indicates if the node with the specified key is newly created.
       * @param nodeKey An string value that identifies the node by its key.
       */
  def IsNewNode(nodeKey: java.lang.String): scala.Boolean = js.native
  /**
       * Programmatically moves the focus to the previous cell in the node.
       */
  def MoveFocusBackward(): scala.Boolean = js.native
  /**
       * Programmatically moves the focus to the next cell in the node.
       */
  def MoveFocusForward(): scala.Boolean = js.native
  /**
       * Recovers the specified node when ASPxTreeList is in Batch Edit mode.
       * @param nodeKey An string value that identifies the node key.
       */
  def RecoverNode(nodeKey: java.lang.String): scala.Unit = js.native
  /**
       * Resets changes in the specified node.
       * @param nodeKey An string value that specifies the node key.
       */
  def ResetChanges(nodeKey: java.lang.String): scala.Unit = js.native
  /**
       * Resets changes in the specified node.
       * @param nodeKey An string value that specifies the key of the node containing the processed cell.
       * @param columnIndex An integer value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
       */
  def ResetChanges(nodeKey: java.lang.String, columnIndex: scala.Double): scala.Unit = js.native
  /**
       * Sets the specified cell value.
       * @param nodeKey A string value that identifies the key of a node containing the processed cell.
       * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
       * @param value An object that contains the new cell value.
       */
  def SetCellValue(nodeKey: java.lang.String, columnFieldNameOrId: java.lang.String, value: js.Object): scala.Unit = js.native
  /**
       * Sets the specified cell value.
       * @param nodeKey A string value that identifies the key of a node containing the processed cell.
       * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
       * @param value An object that contains the new cell value.
       * @param displayText A string value that specifies the cell display text.
       * @param cancelCellHighlighting true to cancel highlighting of the modified cell, false to highlight the modified cell.
       */
  def SetCellValue(
    nodeKey: java.lang.String,
    columnFieldNameOrId: java.lang.String,
    value: js.Object,
    displayText: java.lang.String
  ): scala.Unit = js.native
  /**
       * Sets the specified cell value.
       * @param nodeKey A string value that identifies the key of a node containing the processed cell.
       * @param columnFieldNameOrId A string value that specifies the field name or unique identifier (the column's Name property value) of a column containing the processed cell.
       * @param value An object that contains the new cell value.
       * @param displayText A string value that specifies the cell display text.
       * @param cancelCellHighlighting true to cancel highlighting of the modified cell, false to highlight the modified cell.
       */
  def SetCellValue(
    nodeKey: java.lang.String,
    columnFieldNameOrId: java.lang.String,
    value: js.Object,
    displayText: java.lang.String,
    cancelCellHighlighting: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Switches the specified cell to edit mode.
       * @param nodeKey A string value that specifies the key of a node containing the processed cell.
       * @param columnIndex A zero-based integer value that identifies the column which contains the processed cell in the column collection.
       */
  def StartEdit(nodeKey: java.lang.String, columnIndex: scala.Double): scala.Unit = js.native
  /**
       * Performs validation of tree list data contained in a specified node when the tree list operates in Batch Edit mode.
       * @param nodeKey An integer value specifying the visible index of the validated node.
       */
  def ValidateNode(nodeKey: java.lang.String): scala.Boolean = js.native
  /**
       * Performs validation of tree list data contained in all nodes when the tree list operates in Batch Edit mode.
       * @param validateOnlyModified true, to validate only modified nodes; otherwise, false.
       */
  def ValidateNodes(): scala.Boolean = js.native
  /**
       * Performs validation of tree list data contained in all nodes when the tree list operates in Batch Edit mode.
       * @param validateOnlyModified true, to validate only modified nodes; otherwise, false.
       */
  def ValidateNodes(validateOnlyModified: scala.Boolean): scala.Boolean = js.native
}

