package typings.ejWebAll.ej

import typings.ejWebAll.ej.Kanban.KanbanEdit
import typings.ejWebAll.ej.Kanban.KanbanFilter
import typings.ejWebAll.ej.Kanban.KanbanSelection
import typings.ejWebAll.ej.Kanban.KanbanSwimlane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kanban
  extends StObject
     with Widget_ {
  
  var KanbanEdit: KanbanEdit = js.native
  
  var KanbanFilter: KanbanFilter = js.native
  
  var KanbanSelection: KanbanSelection = js.native
  
  var KanbanSwimlane: KanbanSwimlane = js.native
  
  def columns(columndetails: String, keyvalue: String): Unit = js.native
  def columns(columndetails: String, keyvalue: String, action: String): Unit = js.native
  def columns(columndetails: String, keyvalue: js.Array[Any]): Unit = js.native
  def columns(columndetails: String, keyvalue: js.Array[Any], action: String): Unit = js.native
  def columns(columndetails: js.Array[Any], keyvalue: String): Unit = js.native
  def columns(columndetails: js.Array[Any], keyvalue: String, action: String): Unit = js.native
  /** Add or remove columns in Kanban columns collections.Default action is add.
    * @param {any[]|string} Pass array of columns or string of headerText to add/remove the column in Kanban
    * @param {any[]|string} Pass array of columns or string of key value to add/remove the column in Kanban
    * @param {string} optional Pass add/remove action to be performed. By default "add" action will perform
    * @returns {void}
    */
  def columns(columndetails: js.Array[Any], keyvalue: js.Array[Any]): Unit = js.native
  def columns(columndetails: js.Array[Any], keyvalue: js.Array[Any], action: String): Unit = js.native
  
  /** Refresh the Kanban with new data source.
    * @param {any[]} Pass new data source to the Kanban
    * @returns {void}
    */
  def dataSource(datasource: js.Array[Any]): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Get the column details based on the given header text in Kanban.
    * @param {string} Pass the header text of the column to get the corresponding column object
    * @returns {string}
    */
  def getColumnByHeaderText(headerText: String): String = js.native
  
  /** Get the table details based on the given header table in Kanban.
    * @returns {string}
    */
  def getHeaderTable(): String = js.native
  
  /** Get the scroller object of Kanban.
    * @returns {ej.Scroller}
    */
  def getScrollObject(): Scroller = js.native
  
  /** Used for get the names of all the visible column name collections in Kanban.
    * @returns {any[]}
    */
  def getVisibleColumnNames(): js.Array[Any] = js.native
  
  def hideColumns(headerText: String): Unit = js.native
  /** Hide columns from the Kanban based on the header text
    * @param {any[]|string} you can pass either array of header text of various columns or a header text of a column to hide
    * @returns {void}
    */
  def hideColumns(headerText: js.Array[Any]): Unit = js.native
  
  @JSName("model")
  var model_Kanban: Model = js.native
  
  /** Print the Kanban Board
    * @returns {void}
    */
  def print(): Unit = js.native
  
  /** Refresh the Kanban contents.The template refreshment is based on the argument passed along with this method
    * @param {boolean} optional When templateRefresh is set true, template and Kanban contents both are refreshed in Kanban else only Kanban content is refreshed
    * @returns {void}
    */
  def refresh(): Unit = js.native
  def refresh(templateRefresh: Boolean): Unit = js.native
  
  /** Refresh the template of the Kanban
    * @returns {void}
    */
  def refreshTemplate(): Unit = js.native
  
  def showColumns(headerText: String): Unit = js.native
  /** Show columns in the Kanban based on the header text.
    * @param {any[]|string} You can pass either array of header text of various columns or a header text of a column to show
    * @returns {void}
    */
  def showColumns(headerText: js.Array[Any]): Unit = js.native
  
  /** Expand or collapse the card based on the state of target &quot;div&quot;
    * @param {string|number} Pass the id of card to be toggle
    * @returns {void}
    */
  def toggleCard(key: String): Unit = js.native
  def toggleCard(key: Double): Unit = js.native
  
  /** toggleColumn based on the headerText in Kanban.
    * @param {any} Pass the header text of the column to get the corresponding column object
    * @returns {void}
    */
  def toggleColumn(headerText: Any): Unit = js.native
  
  /** Update a card in Kanban control based on key and JSON data given.
    * @param {string} Pass the key field Name of the column
    * @param {any[]} Pass the edited JSON data of card need to be update.
    * @returns {void}
    */
  def updateCard(key: String, data: js.Array[Any]): Unit = js.native
}
object Kanban {
  
  @js.native
  sealed trait EditMode extends StObject
  @JSGlobal("ej.Kanban.EditMode")
  @js.native
  object EditMode extends StObject {
    
    ///Creates Kanban with editMode as Dialog
    @js.native
    sealed trait Dialog
      extends StObject
         with EditMode
    
    ///Creates Kanban with editMode as DialogTemplate
    @js.native
    sealed trait DialogTemplate
      extends StObject
         with EditMode
    
    ///Creates Kanban with editMode as ExternalForm
    @js.native
    sealed trait ExternalForm
      extends StObject
         with EditMode
    
    ///Creates Kanban with editMode as ExternalFormTemplate
    @js.native
    sealed trait ExternalFormTemplate
      extends StObject
         with EditMode
  }
  
  @js.native
  sealed trait EditingType extends StObject
  @JSGlobal("ej.Kanban.EditingType")
  @js.native
  object EditingType extends StObject {
    
    ///Allows to set edit type as date picker edit type
    @js.native
    sealed trait DatePicker
      extends StObject
         with EditingType
    
    ///Allows to set edit type as date time picker edit type
    @js.native
    sealed trait DateTimePicker
      extends StObject
         with EditingType
    
    ///Allows to set edit type as drop down edit type
    @js.native
    sealed trait Dropdown
      extends StObject
         with EditingType
    
    ///Allows to set edit type as numeric edit type
    @js.native
    sealed trait Numeric
      extends StObject
         with EditingType
    
    ///Allows to set edit type as RTE edit type
    @js.native
    sealed trait RTE
      extends StObject
         with EditingType
    
    ///Allows to set edit type as string edit type
    @js.native
    sealed trait String
      extends StObject
         with EditingType
    
    ///Allows to set edit type as text area edit type
    @js.native
    sealed trait TextArea
      extends StObject
         with EditingType
  }
  
  @js.native
  sealed trait FormPosition extends StObject
  @JSGlobal("ej.Kanban.FormPosition")
  @js.native
  object FormPosition extends StObject {
    
    ///Form position is bottom.
    @js.native
    sealed trait Bottom
      extends StObject
         with FormPosition
    
    ///Form position is right.
    @js.native
    sealed trait Right
      extends StObject
         with FormPosition
  }
  
  @js.native
  sealed trait SelectionType extends StObject
  @JSGlobal("ej.Kanban.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    ///Support for multiple selections in Kanban
    @js.native
    sealed trait Multiple
      extends StObject
         with SelectionType
    
    ///Support for Single selection in Kanban
    @js.native
    sealed trait Single
      extends StObject
         with SelectionType
  }
  
  @js.native
  sealed trait Target extends StObject
  @JSGlobal("ej.Kanban.Target")
  @js.native
  object Target extends StObject {
    
    ///Sets context menu to Kanban
    @js.native
    sealed trait All
      extends StObject
         with Target
    
    ///Sets context menu to Kanban card
    @js.native
    sealed trait Card
      extends StObject
         with Target
    
    ///Sets context menu to Kanban content
    @js.native
    sealed trait Content
      extends StObject
         with Target
    
    ///Sets context menu to Kanban header
    @js.native
    sealed trait Header
      extends StObject
         with Target
  }
  
  trait ActionBeginEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns current filtering object field name.
      */
    var currentFilteringobject: js.UndefOr[Any] = js.undefined
    
    /** Returns the card object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns filter details.
      */
    var filterCollection: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the current action event type.
      */
    var originalEventType: js.UndefOr[String] = js.undefined
    
    /** Returns primary key value.
      */
    var primaryKeyValue: js.UndefOr[String] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the edited row index.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionBeginEventArgs {
    
    inline def apply(): ActionBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionBeginEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionBeginEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentFilteringobject(value: Any): Self = StObject.set(x, "currentFilteringobject", value.asInstanceOf[js.Any])
      
      inline def setCurrentFilteringobjectUndefined: Self = StObject.set(x, "currentFilteringobject", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFilterCollection(value: Any): Self = StObject.set(x, "filterCollection", value.asInstanceOf[js.Any])
      
      inline def setFilterCollectionUndefined: Self = StObject.set(x, "filterCollection", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalEventType(value: String): Self = StObject.set(x, "originalEventType", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventTypeUndefined: Self = StObject.set(x, "originalEventType", js.undefined)
      
      inline def setPrimaryKeyValue(value: String): Self = StObject.set(x, "primaryKeyValue", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyValueUndefined: Self = StObject.set(x, "primaryKeyValue", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActionCompleteEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns current filtering column field name.
      */
    var currentFilteringColumn: js.UndefOr[String] = js.undefined
    
    /** Returns the card object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns filter details.
      */
    var filterCollection: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns current action event type.
      */
    var originalEventType: js.UndefOr[String] = js.undefined
    
    /** Returns primary key.
      */
    var primaryKey: js.UndefOr[String] = js.undefined
    
    /** Returns primary key value.
      */
    var primaryKeyValue: js.UndefOr[String] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the selectedRow index.
      */
    var selectedRow: js.UndefOr[Double] = js.undefined
    
    /** Returns Kanban element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionCompleteEventArgs {
    
    inline def apply(): ActionCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionCompleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionCompleteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentFilteringColumn(value: String): Self = StObject.set(x, "currentFilteringColumn", value.asInstanceOf[js.Any])
      
      inline def setCurrentFilteringColumnUndefined: Self = StObject.set(x, "currentFilteringColumn", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFilterCollection(value: Any): Self = StObject.set(x, "filterCollection", value.asInstanceOf[js.Any])
      
      inline def setFilterCollectionUndefined: Self = StObject.set(x, "filterCollection", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalEventType(value: String): Self = StObject.set(x, "originalEventType", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventTypeUndefined: Self = StObject.set(x, "originalEventType", js.undefined)
      
      inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setPrimaryKeyValue(value: String): Self = StObject.set(x, "primaryKeyValue", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyValueUndefined: Self = StObject.set(x, "primaryKeyValue", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setSelectedRow(value: Double): Self = StObject.set(x, "selectedRow", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowUndefined: Self = StObject.set(x, "selectedRow", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActionFailureEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns current filtering column field name.
      */
    var currentFilteringColumn: js.UndefOr[String] = js.undefined
    
    /** Returns the card object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the error return by server.
      */
    var error: js.UndefOr[Any] = js.undefined
    
    /** Returns filter details.
      */
    var filterCollection: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns current action event type.
      */
    var originalEventType: js.UndefOr[String] = js.undefined
    
    /** Returns primary key value.
      */
    var primaryKeyValue: js.UndefOr[String] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns Kanban element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionFailureEventArgs {
    
    inline def apply(): ActionFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionFailureEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionFailureEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentFilteringColumn(value: String): Self = StObject.set(x, "currentFilteringColumn", value.asInstanceOf[js.Any])
      
      inline def setCurrentFilteringColumnUndefined: Self = StObject.set(x, "currentFilteringColumn", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFilterCollection(value: Any): Self = StObject.set(x, "filterCollection", value.asInstanceOf[js.Any])
      
      inline def setFilterCollectionUndefined: Self = StObject.set(x, "filterCollection", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalEventType(value: String): Self = StObject.set(x, "originalEventType", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventTypeUndefined: Self = StObject.set(x, "originalEventType", js.undefined)
      
      inline def setPrimaryKeyValue(value: String): Self = StObject.set(x, "primaryKeyValue", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyValueUndefined: Self = StObject.set(x, "primaryKeyValue", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeCardSelectEventArgs extends StObject {
    
    /** Returns the Target item.
      */
    var Target: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the select card index value.
      */
    var cardIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the select cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the select cell element
      */
    var currentCell: js.UndefOr[Any] = js.undefined
    
    /** Returns select card data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the previously select the card element
      */
    var previousCard: js.UndefOr[Any] = js.undefined
    
    /** Returns the previously select card indexes
      */
    var previousRowcellindex: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeCardSelectEventArgs {
    
    inline def apply(): BeforeCardSelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCardSelectEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeCardSelectEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCardIndex(value: Double): Self = StObject.set(x, "cardIndex", value.asInstanceOf[js.Any])
      
      inline def setCardIndexUndefined: Self = StObject.set(x, "cardIndex", js.undefined)
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setCurrentCell(value: Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPreviousCard(value: Any): Self = StObject.set(x, "previousCard", value.asInstanceOf[js.Any])
      
      inline def setPreviousCardUndefined: Self = StObject.set(x, "previousCard", js.undefined)
      
      inline def setPreviousRowcellindex(value: js.Array[Any]): Self = StObject.set(x, "previousRowcellindex", value.asInstanceOf[js.Any])
      
      inline def setPreviousRowcellindexUndefined: Self = StObject.set(x, "previousRowcellindex", js.undefined)
      
      inline def setPreviousRowcellindexVarargs(value: Any*): Self = StObject.set(x, "previousRowcellindex", js.Array(value*))
      
      inline def setTarget(value: Any): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeginEditEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns begin edit data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns primary key value.
      */
    var primaryKeyValue: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeginEditEventArgs {
    
    inline def apply(): BeginEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeginEditEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeginEditEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrimaryKeyValue(value: String): Self = StObject.set(x, "primaryKeyValue", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyValueUndefined: Self = StObject.set(x, "primaryKeyValue", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CardClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Header text of the column corresponding to the selected card.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the current card to the Kanban.
      */
    var currentCard: js.UndefOr[String] = js.undefined
    
    /** Returns current record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns Kanban element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CardClickEventArgs {
    
    inline def apply(): CardClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      inline def setCurrentCard(value: String): Self = StObject.set(x, "currentCard", value.asInstanceOf[js.Any])
      
      inline def setCurrentCardUndefined: Self = StObject.set(x, "currentCard", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CardDoubleClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns current card object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CardDoubleClickEventArgs {
    
    inline def apply(): CardDoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardDoubleClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardDoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CardDragEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns drag data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns dragged element.
      */
    var draggedElement: js.UndefOr[Any] = js.undefined
    
    /** Returns drag start element.
      */
    var dragtarget: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CardDragEventArgs {
    
    inline def apply(): CardDragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardDragEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardDragEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDraggedElement(value: Any): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
      
      inline def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
      
      inline def setDragtarget(value: Any): Self = StObject.set(x, "dragtarget", value.asInstanceOf[js.Any])
      
      inline def setDragtargetUndefined: Self = StObject.set(x, "dragtarget", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CardDragStartEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns card drag start data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns dragged element.
      */
    var draggedElement: js.UndefOr[Any] = js.undefined
    
    /** Returns drag start element.
      */
    var dragtarget: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CardDragStartEventArgs {
    
    inline def apply(): CardDragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardDragStartEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardDragStartEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDraggedElement(value: Any): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
      
      inline def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
      
      inline def setDragtarget(value: Any): Self = StObject.set(x, "dragtarget", value.asInstanceOf[js.Any])
      
      inline def setDragtargetUndefined: Self = StObject.set(x, "dragtarget", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CardDragStopEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns drag stop data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns dragged element.
      */
    var draggedElement: js.UndefOr[Any] = js.undefined
    
    /** Returns drag stop element.
      */
    var droptarget: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CardDragStopEventArgs {
    
    inline def apply(): CardDragStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardDragStopEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardDragStopEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDraggedElement(value: Any): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
      
      inline def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
      
      inline def setDroptarget(value: Any): Self = StObject.set(x, "droptarget", value.asInstanceOf[js.Any])
      
      inline def setDroptargetUndefined: Self = StObject.set(x, "droptarget", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CardDropEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns dragged data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns dragged element.
      */
    var draggedElement: js.UndefOr[Any] = js.undefined
    
    /** Returns previous parent of dragged element
      */
    var draggedParent: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns drop element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CardDropEventArgs {
    
    inline def apply(): CardDropEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardDropEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardDropEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDraggedElement(value: Any): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
      
      inline def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
      
      inline def setDraggedParent(value: Any): Self = StObject.set(x, "draggedParent", value.asInstanceOf[js.Any])
      
      inline def setDraggedParentUndefined: Self = StObject.set(x, "draggedParent", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CardSelectEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the select card index value.
      */
    var cardIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the select cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the select cell element
      */
    var currentCell: js.UndefOr[Any] = js.undefined
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[Any] = js.undefined
    
    /** Returns select card data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the previously select the card element
      */
    var previousCard: js.UndefOr[Any] = js.undefined
    
    /** Returns the previously select card indexes
      */
    var previousRowcellindex: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CardSelectEventArgs {
    
    inline def apply(): CardSelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardSelectEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardSelectEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCardIndex(value: Double): Self = StObject.set(x, "cardIndex", value.asInstanceOf[js.Any])
      
      inline def setCardIndexUndefined: Self = StObject.set(x, "cardIndex", js.undefined)
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setCurrentCell(value: Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPreviousCard(value: Any): Self = StObject.set(x, "previousCard", value.asInstanceOf[js.Any])
      
      inline def setPreviousCardUndefined: Self = StObject.set(x, "previousCard", js.undefined)
      
      inline def setPreviousRowcellindex(value: js.Array[Any]): Self = StObject.set(x, "previousRowcellindex", value.asInstanceOf[js.Any])
      
      inline def setPreviousRowcellindexUndefined: Self = StObject.set(x, "previousRowcellindex", js.undefined)
      
      inline def setPreviousRowcellindexVarargs(value: Any*): Self = StObject.set(x, "previousRowcellindex", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CardSelectingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selecting card index value.
      */
    var cardIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selecting cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the selecting cell element
      */
    var currentCell: js.UndefOr[Any] = js.undefined
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[Any] = js.undefined
    
    /** Returns added data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the previously selecting the card element
      */
    var previousCard: js.UndefOr[Any] = js.undefined
    
    /** Returns the previously rowcell is selecting card indexes
      */
    var previousRowcellindex: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CardSelectingEventArgs {
    
    inline def apply(): CardSelectingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardSelectingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardSelectingEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCardIndex(value: Double): Self = StObject.set(x, "cardIndex", value.asInstanceOf[js.Any])
      
      inline def setCardIndexUndefined: Self = StObject.set(x, "cardIndex", js.undefined)
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setCurrentCell(value: Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPreviousCard(value: Any): Self = StObject.set(x, "previousCard", value.asInstanceOf[js.Any])
      
      inline def setPreviousCardUndefined: Self = StObject.set(x, "previousCard", js.undefined)
      
      inline def setPreviousRowcellindex(value: js.Array[Any]): Self = StObject.set(x, "previousRowcellindex", value.asInstanceOf[js.Any])
      
      inline def setPreviousRowcellindexUndefined: Self = StObject.set(x, "previousRowcellindex", js.undefined)
      
      inline def setPreviousRowcellindexVarargs(value: Any*): Self = StObject.set(x, "previousRowcellindex", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CardSettings extends StObject {
    
    /** To customize the card border color based on assigned task. Colors and corresponding values defined here will be mapped with colorField mapped data source column.
      * @default {Object}
      */
    var colorMapping: js.UndefOr[Any] = js.undefined
    
    /** This specifies the Kanban card to drop into particular target element.
      */
    var externalDropTarget: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates to add the template for card .
      * @default {null}
      */
    var template: js.UndefOr[String] = js.undefined
  }
  object CardSettings {
    
    inline def apply(): CardSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardSettings] (val x: Self) extends AnyVal {
      
      inline def setColorMapping(value: Any): Self = StObject.set(x, "colorMapping", value.asInstanceOf[js.Any])
      
      inline def setColorMappingUndefined: Self = StObject.set(x, "colorMapping", js.undefined)
      
      inline def setExternalDropTarget(value: String): Self = StObject.set(x, "externalDropTarget", value.asInstanceOf[js.Any])
      
      inline def setExternalDropTargetUndefined: Self = StObject.set(x, "externalDropTarget", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait CellClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the select cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the edited row index.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CellClickEventArgs {
    
    inline def apply(): CellClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Column extends StObject {
    
    /** To enable/disable allowDrag for specific column wise.
      * @default {true}
      */
    var allowDrag: js.UndefOr[Boolean] = js.undefined
    
    /** To enable/disable allowDrop for specific column wise.
      * @default {true}
      */
    var allowDrop: js.UndefOr[Boolean] = js.undefined
    
    /** To customize the column level constraints with minimum ,maximum limit validation.
      * @default {Object}
      */
    var constraints: js.UndefOr[ColumnsConstraints] = js.undefined
    
    /** Gets or sets a value that indicates to add the template within the header element.
      * @default {null}
      */
    var headerTemplate: js.UndefOr[String] = js.undefined
    
    /** Gets or sets an object that indicates to render the Kanban with specified columns header text.
      * @default {null}
      */
    var headerText: js.UndefOr[String] = js.undefined
    
    /** To set column collapse or expand state
      * @default {false}
      */
    var isCollapsed: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets an object that indicates to render the Kanban with specified columns key.
      * @default {null}
      */
    var key: js.UndefOr[String | Double] = js.undefined
    
    /** Gets or sets an object that indicates whether to show add new button.
      * @default {false}
      */
    var showAddButton: js.UndefOr[Boolean] = js.undefined
    
    /** To customize the totalCount properties.
      * @default {Object}
      */
    var totalCount: js.UndefOr[ColumnsTotalCount] = js.undefined
    
    /** Gets or sets an object that indicates to set specific column visibility.
      * @default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets an object that indicates to render the Kanban with specified columns width.
      * @default {null}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Column {
    
    inline def apply(): Column = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
      
      inline def setAllowDragUndefined: Self = StObject.set(x, "allowDrag", js.undefined)
      
      inline def setAllowDrop(value: Boolean): Self = StObject.set(x, "allowDrop", value.asInstanceOf[js.Any])
      
      inline def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
      
      inline def setConstraints(value: ColumnsConstraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      inline def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setShowAddButton(value: Boolean): Self = StObject.set(x, "showAddButton", value.asInstanceOf[js.Any])
      
      inline def setShowAddButtonUndefined: Self = StObject.set(x, "showAddButton", js.undefined)
      
      inline def setTotalCount(value: ColumnsTotalCount): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
      
      inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ColumnsConstraints extends StObject {
    
    /** It is used to specify the maximum amount of card in particular column cell or swimlane cell can hold.
      * @default {null}
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /** It is used to specify the minimum amount of card in particular column cell or swimlane cell can hold.
      * @default {null}
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /** It is used to specify the type of constraints as column or swimlane.
      * @default {null}
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ColumnsConstraints {
    
    inline def apply(): ColumnsConstraints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnsConstraints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnsConstraints] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ColumnsTotalCount extends StObject {
    
    /** To customize the totalCount text properties.
      * @default {null}
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object ColumnsTotalCount {
    
    inline def apply(): ColumnsTotalCount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnsTotalCount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnsTotalCount] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait ContextClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the status of contextmenu item which denotes its enabled state.
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the target item.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ContextClickEventArgs {
    
    inline def apply(): ContextClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ContextMenuSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to add custom contextMenu items.
      * @default {Array}
      */
    var customMenuItems: js.UndefOr[js.Array[ContextMenuSettingsCustomMenuItem]] = js.undefined
    
    /** Gets or sets a value that indicates the list of items needs to be disable from default context menu items.
      * @default {Array}
      */
    var disableDefaultItems: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** To enable context menu.All default context menu will show.
      * @default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Its used to add specific default context menu items.
      * @default {Array}
      */
    var menuItems: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ContextMenuSettings {
    
    inline def apply(): ContextMenuSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuSettings] (val x: Self) extends AnyVal {
      
      inline def setCustomMenuItems(value: js.Array[ContextMenuSettingsCustomMenuItem]): Self = StObject.set(x, "customMenuItems", value.asInstanceOf[js.Any])
      
      inline def setCustomMenuItemsUndefined: Self = StObject.set(x, "customMenuItems", js.undefined)
      
      inline def setCustomMenuItemsVarargs(value: ContextMenuSettingsCustomMenuItem*): Self = StObject.set(x, "customMenuItems", js.Array(value*))
      
      inline def setDisableDefaultItems(value: js.Array[Any]): Self = StObject.set(x, "disableDefaultItems", value.asInstanceOf[js.Any])
      
      inline def setDisableDefaultItemsUndefined: Self = StObject.set(x, "disableDefaultItems", js.undefined)
      
      inline def setDisableDefaultItemsVarargs(value: Any*): Self = StObject.set(x, "disableDefaultItems", js.Array(value*))
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setMenuItems(value: js.Array[Any]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
      
      inline def setMenuItemsVarargs(value: Any*): Self = StObject.set(x, "menuItems", js.Array(value*))
    }
  }
  
  trait ContextMenuSettingsCustomMenuItem extends StObject {
    
    /** Its sets target element to custom context menu item.
      * @default {ej.Kanban.Target.All}
      */
    var target: js.UndefOr[Target | String] = js.undefined
    
    /** Gets the template to render custom context menu item.
      * @default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Gets the display name to custom menu item.
      * @default {null}
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object ContextMenuSettingsCustomMenuItem {
    
    inline def apply(): ContextMenuSettingsCustomMenuItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuSettingsCustomMenuItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuSettingsCustomMenuItem] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: Target | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait ContextOpenEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the status of contextmenu item which denotes its enabled state.
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the target item.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ContextOpenEventArgs {
    
    inline def apply(): ContextOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextOpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextOpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CustomToolbarItem extends StObject {
    
    /** Gets the template to render customToolbarItems.
      * @default {null}
      */
    var template: js.UndefOr[String] = js.undefined
  }
  object CustomToolbarItem {
    
    inline def apply(): CustomToolbarItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomToolbarItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomToolbarItem] (val x: Self) extends AnyVal {
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait DataBoundEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DataBoundEventArgs {
    
    inline def apply(): DataBoundEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataBoundEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataBoundEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** Returns deleted data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait EditSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to enable the adding action in cards behavior on Kanban.
      * @default {false}
      */
    var allowAdding: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the editing action in cards of Kanban.
      * @default {false}
      */
    var allowEditing: js.UndefOr[Boolean] = js.undefined
    
    /** This specifies the id of the template which is require to be edited using the Dialog Box.
      * @default {null}
      */
    var dialogTemplate: js.UndefOr[String] = js.undefined
    
    /** Get or sets an object that indicates whether to customize the editing fields of Kanban card.
      * @default {Array}
      */
    var editItems: js.UndefOr[js.Array[EditSettingsEditItem]] = js.undefined
    
    /** Get or sets an object that indicates whether to customize the editMode of the Kanban.
      * @default {ej.Kanban.EditMode.Dialog}
      */
    var editMode: js.UndefOr[EditMode | String] = js.undefined
    
    /** This specifies the id of the template which is require to be edited using the External edit form.
      * @default {null}
      */
    var externalFormTemplate: js.UndefOr[String] = js.undefined
    
    /** This specifies to set the position of an External edit form either in the right or bottom of the Kanban.
      * @default {ej.Kanban.FormPosition.Bottom}
      */
    var formPosition: js.UndefOr[FormPosition | String] = js.undefined
  }
  object EditSettings {
    
    inline def apply(): EditSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditSettings] (val x: Self) extends AnyVal {
      
      inline def setAllowAdding(value: Boolean): Self = StObject.set(x, "allowAdding", value.asInstanceOf[js.Any])
      
      inline def setAllowAddingUndefined: Self = StObject.set(x, "allowAdding", js.undefined)
      
      inline def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
      
      inline def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
      
      inline def setDialogTemplate(value: String): Self = StObject.set(x, "dialogTemplate", value.asInstanceOf[js.Any])
      
      inline def setDialogTemplateUndefined: Self = StObject.set(x, "dialogTemplate", js.undefined)
      
      inline def setEditItems(value: js.Array[EditSettingsEditItem]): Self = StObject.set(x, "editItems", value.asInstanceOf[js.Any])
      
      inline def setEditItemsUndefined: Self = StObject.set(x, "editItems", js.undefined)
      
      inline def setEditItemsVarargs(value: EditSettingsEditItem*): Self = StObject.set(x, "editItems", js.Array(value*))
      
      inline def setEditMode(value: EditMode | String): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      inline def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
      
      inline def setExternalFormTemplate(value: String): Self = StObject.set(x, "externalFormTemplate", value.asInstanceOf[js.Any])
      
      inline def setExternalFormTemplateUndefined: Self = StObject.set(x, "externalFormTemplate", js.undefined)
      
      inline def setFormPosition(value: FormPosition | String): Self = StObject.set(x, "formPosition", value.asInstanceOf[js.Any])
      
      inline def setFormPositionUndefined: Self = StObject.set(x, "formPosition", js.undefined)
    }
  }
  
  trait EditSettingsEditItem extends StObject {
    
    /** It is used to specify defaultValue for the fields while adding new card.
      * @default {null}
      */
    var defaultValue: js.UndefOr[String | Double] = js.undefined
    
    /** It is used to set the particular editparams in the card for editing.
      * @default {Object}
      */
    var editParams: js.UndefOr[Any] = js.undefined
    
    /** It is used to set the particular editType in the card for editing.
      * @default {ej.Kanban.EditingType.String}
      */
    var editType: js.UndefOr[EditingType | String] = js.undefined
    
    /** It is used to map editing field from the data source.
      * @default {null}
      */
    var field: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates to define constraints for saving data to the database.
      * @default {Object}
      */
    var validationRules: js.UndefOr[Any] = js.undefined
  }
  object EditSettingsEditItem {
    
    inline def apply(): EditSettingsEditItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditSettingsEditItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditSettingsEditItem] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: String | Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setEditParams(value: Any): Self = StObject.set(x, "editParams", value.asInstanceOf[js.Any])
      
      inline def setEditParamsUndefined: Self = StObject.set(x, "editParams", js.undefined)
      
      inline def setEditType(value: EditingType | String): Self = StObject.set(x, "editType", value.asInstanceOf[js.Any])
      
      inline def setEditTypeUndefined: Self = StObject.set(x, "editType", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setValidationRules(value: Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
    }
  }
  
  trait EndDeleteEventArgs extends StObject {
    
    /** Current action name
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns deleted  data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object EndDeleteEventArgs {
    
    inline def apply(): EndDeleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndDeleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndDeleteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait EndEditEventArgs extends StObject {
    
    /** Current Action name
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns modified data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object EndEditEventArgs {
    
    inline def apply(): EndEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndEditEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndEditEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    /** Get or sets an object that indicates the options to map the cards to the collapsible area.
      * @default {Object}
      */
    var collapsibleCards: js.UndefOr[FieldsCollapsibleCards] = js.undefined
    
    /** To customize the card has been Mapped into card color field.
      * @default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Content field has been Mapped into card text.
      * @default {null}
      */
    var content: js.UndefOr[String] = js.undefined
    
    /** ImageUrl field has been Mapped into card image.
      * @default {null}
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** The primarykey field is mapped to data source field. And this will used for Drag and drop and editing mainly.
      * @default {null}
      */
    var primaryKey: js.UndefOr[String] = js.undefined
    
    /** Priority field has been mapped data source field to maintain cards priority.
      * @default {null}
      */
    var priority: js.UndefOr[String] = js.undefined
    
    /** To enable swimlane grouping based on the given key field from datasource mapping.
      * @default {null}
      */
    var swimlaneKey: js.UndefOr[String] = js.undefined
    
    /** Tag field has been Mapped into card tag.
      * @default {null}
      */
    var tag: js.UndefOr[String] = js.undefined
    
    /** Title field has been Mapped to field in datasource for title content. If title field specified , card expand/collapse will be enabled with header and content section.
      * @default {null}
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    inline def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      inline def setCollapsibleCards(value: FieldsCollapsibleCards): Self = StObject.set(x, "collapsibleCards", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleCardsUndefined: Self = StObject.set(x, "collapsibleCards", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSwimlaneKey(value: String): Self = StObject.set(x, "swimlaneKey", value.asInstanceOf[js.Any])
      
      inline def setSwimlaneKeyUndefined: Self = StObject.set(x, "swimlaneKey", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait FieldsCollapsibleCards extends StObject {
    
    /** It is used to specify the collapsible card's field mapping.
      * @default {null}
      */
    var field: js.UndefOr[String] = js.undefined
    
    /** It is used to specify the collapsible card's key mapping which is available in datasource value of field mapped in collapsibleCards.field.
      * @default {null}
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object FieldsCollapsibleCards {
    
    inline def apply(): FieldsCollapsibleCards = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldsCollapsibleCards]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldsCollapsibleCards] (val x: Self) extends AnyVal {
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait FilterSetting extends StObject {
    
    /** Gets or sets an object of tooltip to filter buttons.
      * @default {null}
      */
    var description: js.UndefOr[String] = js.undefined
    
    /** Gets or sets an object that Queries to perform filtering
      * @default {Object}
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Gets or sets an object of display name to filter queries.
      * @default {null}
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object FilterSetting {
    
    inline def apply(): FilterSetting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterSetting]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterSetting] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait HeaderClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the select cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the column object.
      */
    var columnData: js.UndefOr[Any] = js.undefined
    
    /** Returns the kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object HeaderClickEventArgs {
    
    inline def apply(): HeaderClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setColumnData(value: Any): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
      
      inline def setColumnDataUndefined: Self = StObject.set(x, "columnData", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait KanbanEdit extends StObject {
    
    /** Add a new card in Kanban control when allowAdding is set as true. If parameters are not given default dialog will be open.
      * @param {string} Pass the primary key field Name of the column
      * @param {any[]} Pass the edited JSON data of card need to be add.
      * @returns {void}
      */
    def addCard(primaryKey: String, card: js.Array[Any]): Unit = js.native
    
    /** Send a cancel request of add/edit card in Kanban when allowEditing/allowAdding is set as true.
      * @returns {void}
      */
    def cancelEdit(): Unit = js.native
    
    /** Delete a card in Kanban control when allowAdding/allowEditing is set as true.
      * @param {string|number} Pass the key of card to be delete
      * @returns {void}
      */
    def deleteCard(Key: String): Unit = js.native
    def deleteCard(Key: Double): Unit = js.native
    
    /** Send a save request in Kanban when any card is in edit/new add card state and allowEditing/allowAdding is set as true.
      * @returns {void}
      */
    def endEdit(): Unit = js.native
    
    /** Method used for set validation to a field during editing.
      * @param {string} Specify the name of the column to set validation rules
      * @param {any} Specify the validation rules for the field
      * @returns {void}
      */
    def setValidationToField(name: String, rules: Any): Unit = js.native
    
    /** Send an edit card request in Kanban when allowEditing is set as true. Parameter will be HTML element or primary key
      * @param {any} Pass the div selected row element to be edited in Kanban
      * @returns {void}
      */
    def startEdit($div: Any): Unit = js.native
  }
  
  trait KanbanFilter extends StObject {
    
    /** Send a clear request to filter cards in the kanban.
      * @returns {void}
      */
    def clearFilter(): Unit
    
    /** Method used for send a clear search request to Kanban.
      * @returns {void}
      */
    def clearSearch(): Unit
    
    /** Send a filtering request to cards in the kanban.
      * @returns {void}
      */
    def filterCards(): Unit
    
    /** Send a search request to Kanban with specified string passed in it.
      * @param {string} Pass the string to search in Kanban card
      * @returns {void}
      */
    def searchCards(searchString: String): Unit
  }
  object KanbanFilter {
    
    inline def apply(
      clearFilter: () => Unit,
      clearSearch: () => Unit,
      filterCards: () => Unit,
      searchCards: String => Unit
    ): KanbanFilter = {
      val __obj = js.Dynamic.literal(clearFilter = js.Any.fromFunction0(clearFilter), clearSearch = js.Any.fromFunction0(clearSearch), filterCards = js.Any.fromFunction0(filterCards), searchCards = js.Any.fromFunction1(searchCards))
      __obj.asInstanceOf[KanbanFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KanbanFilter] (val x: Self) extends AnyVal {
      
      inline def setClearFilter(value: () => Unit): Self = StObject.set(x, "clearFilter", js.Any.fromFunction0(value))
      
      inline def setClearSearch(value: () => Unit): Self = StObject.set(x, "clearSearch", js.Any.fromFunction0(value))
      
      inline def setFilterCards(value: () => Unit): Self = StObject.set(x, "filterCards", js.Any.fromFunction0(value))
      
      inline def setSearchCards(value: String => Unit): Self = StObject.set(x, "searchCards", js.Any.fromFunction1(value))
    }
  }
  
  trait KanbanSelection extends StObject {
    
    /** It is used to clear all the card selection.
      * @returns {void}
      */
    def clear(): Unit
  }
  object KanbanSelection {
    
    inline def apply(clear: () => Unit): KanbanSelection = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[KanbanSelection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KanbanSelection] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
  
  trait KanbanSwimlane extends StObject {
    
    /** Collapse all the swimlane rows in Kanban.
      * @returns {void}
      */
    def collapseAll(): Unit
    
    /** Expand all the swimlane rows in Kanban.
      * @returns {void}
      */
    def expandAll(): Unit
    
    /** Expand or collapse the swimlane row based on the state of target &quot;div&quot;
      * @param {any} Pass the div object to toggleSwimlane row based on its row state
      * @returns {void}
      */
    def toggle($div: Any): Unit
  }
  object KanbanSwimlane {
    
    inline def apply(collapseAll: () => Unit, expandAll: () => Unit, toggle: Any => Unit): KanbanSwimlane = {
      val __obj = js.Dynamic.literal(collapseAll = js.Any.fromFunction0(collapseAll), expandAll = js.Any.fromFunction0(expandAll), toggle = js.Any.fromFunction1(toggle))
      __obj.asInstanceOf[KanbanSwimlane]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KanbanSwimlane] (val x: Self) extends AnyVal {
      
      inline def setCollapseAll(value: () => Unit): Self = StObject.set(x, "collapseAll", js.Any.fromFunction0(value))
      
      inline def setExpandAll(value: () => Unit): Self = StObject.set(x, "expandAll", js.Any.fromFunction0(value))
      
      inline def setToggle(value: Any => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadEventArgs {
    
    inline def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggered for every Kanban action before its starts.
      */
    var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
    
    /** Triggered for every Kanban action success event.
      */
    var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
    
    /** Triggered for every Kanban action server failure event.
      */
    var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable allowDragAndDrop behavior on Kanban.
      * @default {true}
      */
    var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable drag and drop behavior between Kanban controls.
      * @default {false}
      */
    var allowExternalDragAndDrop: js.UndefOr[Boolean] = js.undefined
    
    /** To enable filtering behavior on Kanban.User can specify query in filterSettings collection after enabling allowFiltering.
      * @default {false}
      */
    var allowFiltering: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to allow card hover actions.
      * @default {true}
      */
    var allowHover: js.UndefOr[Boolean] = js.undefined
    
    /** To allow keyboard navigation actions.
      * @default {false}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable printing option.
      * @default {false}
      */
    var allowPrinting: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the scrollbar in the Kanban and view the card by scroll through the Kanban manually.
      * @default {false}
      */
    var allowScrolling: js.UndefOr[Boolean] = js.undefined
    
    /** To enable Searching operation in Kanban.
      * @default {false}
      */
    var allowSearching: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable allowSelection behavior on Kanban.User can select card and the selected card will be highlighted on Kanban.
      * @default {true}
      */
    var allowSelection: js.UndefOr[Boolean] = js.undefined
    
    /** To enable or disable the title of the card.
      * @default {false}
      */
    var allowTitle: js.UndefOr[Boolean] = js.undefined
    
    /** To enable or disable the column expand /collapse.
      * @default {false}
      */
    var allowToggleColumn: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered before the card is selected.
      */
    var beforeCardSelect: js.UndefOr[js.Function1[/* e */ BeforeCardSelectEventArgs, Unit]] = js.undefined
    
    /** Triggered before the task is going to be edited.
      */
    var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.undefined
    
    /** Trigger after the card is clicked.
      */
    var cardClick: js.UndefOr[js.Function1[/* e */ CardClickEventArgs, Unit]] = js.undefined
    
    /** Triggered when card is double clicked.
      */
    var cardDoubleClick: js.UndefOr[js.Function1[/* e */ CardDoubleClickEventArgs, Unit]] = js.undefined
    
    /** Triggered when the card is being dragged.
      */
    var cardDrag: js.UndefOr[js.Function1[/* e */ CardDragEventArgs, Unit]] = js.undefined
    
    /** Triggered when card dragging start.
      */
    var cardDragStart: js.UndefOr[js.Function1[/* e */ CardDragStartEventArgs, Unit]] = js.undefined
    
    /** Triggered when card dragging stops.
      */
    var cardDragStop: js.UndefOr[js.Function1[/* e */ CardDragStopEventArgs, Unit]] = js.undefined
    
    /** Triggered when the card is Dropped.
      */
    var cardDrop: js.UndefOr[js.Function1[/* e */ CardDropEventArgs, Unit]] = js.undefined
    
    /** Triggered after the card is selected.
      */
    var cardSelect: js.UndefOr[js.Function1[/* e */ CardSelectEventArgs, Unit]] = js.undefined
    
    /** Triggered before the card is selected.
      */
    var cardSelecting: js.UndefOr[js.Function1[/* e */ CardSelectingEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates whether to Customize the card settings.
      * @default {Object}
      */
    var cardSettings: js.UndefOr[CardSettings] = js.undefined
    
    /** Triggers after the cell is clicked.
      */
    var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates to render the Kanban with specified columns.
      * @default {Array}
      */
    var columns: js.UndefOr[js.Array[Column]] = js.undefined
    
    /** Triggered when context menu item is clicked in Kanban
      */
    var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates whether to customize the context menu behavior of the Kanban.
      * @default {Object}
      */
    var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
    
    /** Triggered before the context menu is opened.
      */
    var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, Unit]] = js.undefined
    
    /** Triggered when the Kanban is rendered completely
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates to render the Kanban with custom theme.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates whether to add customToolbarItems within the toolbar to perform any action in the Kanban.
      * @default {[]}
      */
    var customToolbarItems: js.UndefOr[js.Array[CustomToolbarItem]] = js.undefined
    
    /** Triggered the Kanban is bound with data during initial rendering.
      */
    var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, Unit]] = js.undefined
    
    /** Gets or sets the data to render the Kanban with cards.
      * @default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Triggered when Kanban going to destroy.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Get or sets an object that indicates whether to customize the editing behavior of the Kanban.
      * @default {Object}
      */
    var editSettings: js.UndefOr[EditSettings] = js.undefined
    
    /** Align content in the Kanban control align from right to left by setting the property as true.
      * @default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** To show total count of cards in each column.
      * @default {false}
      */
    var enableTotalCount: js.UndefOr[Boolean] = js.undefined
    
    /** To perform kanban functionalities with touch interaction.
      * @default {true}
      */
    var enableTouch: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered after the card is deleted.
      */
    var endDelete: js.UndefOr[js.Function1[/* e */ EndDeleteEventArgs, Unit]] = js.undefined
    
    /** Triggered after the card is edited.
      */
    var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.undefined
    
    /** To customize field mappings for card , editing title and control key parameters
      * @default {Object}
      */
    var fields: js.UndefOr[Fields] = js.undefined
    
    /** To customize the filtering behavior based on queries given.
      * @default {Array}
      */
    var filterSettings: js.UndefOr[js.Array[FilterSetting]] = js.undefined
    
    /** Triggers after the header is clicked.
      */
    var headerClick: js.UndefOr[js.Function1[/* e */ HeaderClickEventArgs, Unit]] = js.undefined
    
    /** When set to true, adapts the Kanban layout to fit the screen size of devices on which it renders.
      * @default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** To map datasource field for column values mapping
      * @default {null}
      */
    var keyField: js.UndefOr[String] = js.undefined
    
    /** To change the key in keyboard interaction to Kanban control.
      * @default {null}
      */
    var keySettings: js.UndefOr[Any] = js.undefined
    
    /** Triggered initial load.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
      * a particular country or region.
      * @default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates whether to set the minimum width of the responsive Kanban while isResponsive property is true.
      * @default {0}
      */
    var minWidth: js.UndefOr[Double] = js.undefined
    
    /** ej Query to query database of Kanban.
      * @default {null}
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Triggered every time a single card rendered request is made to access particular card information.
      */
    var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates whether to customize the scrolling behavior of the Kanban.
      * @default {Object}
      */
    var scrollSettings: js.UndefOr[ScrollSettings] = js.undefined
    
    /** To customize the searching behavior of the Kanban.
      * @default {Object}
      */
    var searchSettings: js.UndefOr[SearchSettings] = js.undefined
    
    /** To allow customize selection type. Accepting types are &quot;single&quot; and &quot;multiple&quot;.
      * @default {ej.Kanban.SelectionType.Single}
      */
    var selectionType: js.UndefOr[SelectionType | String] = js.undefined
    
    /** Gets or sets a value that indicates whether to render kanban columns using without data source.
      * @default {false}
      */
    var showColumnWhenEmpty: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets an object that indicates to managing the collection of stacked header rows for the Kanban.
      * @default {Array}
      */
    var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.undefined
    
    /** Triggers before swim lane expand or collapse icon is clicked.
      */
    var swimlaneClick: js.UndefOr[js.Function1[/* e */ SwimlaneClickEventArgs, Unit]] = js.undefined
    
    /** Customize the settings for swim lane.
      * @default {Object}
      */
    var swimlaneSettings: js.UndefOr[SwimlaneSettings] = js.undefined
    
    /** Triggered when toolbar item is clicked in Kanban.
      */
    var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.undefined
    
    /** The tooltip allows to display card details in a tooltip while hovering on it.
      */
    var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
    
    /** Gets or sets an object that indicates to render the Kanban with specified workflows.
      * @default {Array}
      */
    var workflows: js.UndefOr[js.Array[Workflow]] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Kanban.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Kanban.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Kanban.Model] (val x: Self) extends AnyVal {
      
      inline def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = StObject.set(x, "actionBegin", js.Any.fromFunction1(value))
      
      inline def setActionBeginUndefined: Self = StObject.set(x, "actionBegin", js.undefined)
      
      inline def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = StObject.set(x, "actionComplete", js.Any.fromFunction1(value))
      
      inline def setActionCompleteUndefined: Self = StObject.set(x, "actionComplete", js.undefined)
      
      inline def setActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = StObject.set(x, "actionFailure", js.Any.fromFunction1(value))
      
      inline def setActionFailureUndefined: Self = StObject.set(x, "actionFailure", js.undefined)
      
      inline def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowDragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setAllowDragAndDropUndefined: Self = StObject.set(x, "allowDragAndDrop", js.undefined)
      
      inline def setAllowExternalDragAndDrop(value: Boolean): Self = StObject.set(x, "allowExternalDragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setAllowExternalDragAndDropUndefined: Self = StObject.set(x, "allowExternalDragAndDrop", js.undefined)
      
      inline def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
      
      inline def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
      
      inline def setAllowHover(value: Boolean): Self = StObject.set(x, "allowHover", value.asInstanceOf[js.Any])
      
      inline def setAllowHoverUndefined: Self = StObject.set(x, "allowHover", js.undefined)
      
      inline def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      inline def setAllowPrinting(value: Boolean): Self = StObject.set(x, "allowPrinting", value.asInstanceOf[js.Any])
      
      inline def setAllowPrintingUndefined: Self = StObject.set(x, "allowPrinting", js.undefined)
      
      inline def setAllowScrolling(value: Boolean): Self = StObject.set(x, "allowScrolling", value.asInstanceOf[js.Any])
      
      inline def setAllowScrollingUndefined: Self = StObject.set(x, "allowScrolling", js.undefined)
      
      inline def setAllowSearching(value: Boolean): Self = StObject.set(x, "allowSearching", value.asInstanceOf[js.Any])
      
      inline def setAllowSearchingUndefined: Self = StObject.set(x, "allowSearching", js.undefined)
      
      inline def setAllowSelection(value: Boolean): Self = StObject.set(x, "allowSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowSelectionUndefined: Self = StObject.set(x, "allowSelection", js.undefined)
      
      inline def setAllowTitle(value: Boolean): Self = StObject.set(x, "allowTitle", value.asInstanceOf[js.Any])
      
      inline def setAllowTitleUndefined: Self = StObject.set(x, "allowTitle", js.undefined)
      
      inline def setAllowToggleColumn(value: Boolean): Self = StObject.set(x, "allowToggleColumn", value.asInstanceOf[js.Any])
      
      inline def setAllowToggleColumnUndefined: Self = StObject.set(x, "allowToggleColumn", js.undefined)
      
      inline def setBeforeCardSelect(value: /* e */ BeforeCardSelectEventArgs => Unit): Self = StObject.set(x, "beforeCardSelect", js.Any.fromFunction1(value))
      
      inline def setBeforeCardSelectUndefined: Self = StObject.set(x, "beforeCardSelect", js.undefined)
      
      inline def setBeginEdit(value: /* e */ BeginEditEventArgs => Unit): Self = StObject.set(x, "beginEdit", js.Any.fromFunction1(value))
      
      inline def setBeginEditUndefined: Self = StObject.set(x, "beginEdit", js.undefined)
      
      inline def setCardClick(value: /* e */ CardClickEventArgs => Unit): Self = StObject.set(x, "cardClick", js.Any.fromFunction1(value))
      
      inline def setCardClickUndefined: Self = StObject.set(x, "cardClick", js.undefined)
      
      inline def setCardDoubleClick(value: /* e */ CardDoubleClickEventArgs => Unit): Self = StObject.set(x, "cardDoubleClick", js.Any.fromFunction1(value))
      
      inline def setCardDoubleClickUndefined: Self = StObject.set(x, "cardDoubleClick", js.undefined)
      
      inline def setCardDrag(value: /* e */ CardDragEventArgs => Unit): Self = StObject.set(x, "cardDrag", js.Any.fromFunction1(value))
      
      inline def setCardDragStart(value: /* e */ CardDragStartEventArgs => Unit): Self = StObject.set(x, "cardDragStart", js.Any.fromFunction1(value))
      
      inline def setCardDragStartUndefined: Self = StObject.set(x, "cardDragStart", js.undefined)
      
      inline def setCardDragStop(value: /* e */ CardDragStopEventArgs => Unit): Self = StObject.set(x, "cardDragStop", js.Any.fromFunction1(value))
      
      inline def setCardDragStopUndefined: Self = StObject.set(x, "cardDragStop", js.undefined)
      
      inline def setCardDragUndefined: Self = StObject.set(x, "cardDrag", js.undefined)
      
      inline def setCardDrop(value: /* e */ CardDropEventArgs => Unit): Self = StObject.set(x, "cardDrop", js.Any.fromFunction1(value))
      
      inline def setCardDropUndefined: Self = StObject.set(x, "cardDrop", js.undefined)
      
      inline def setCardSelect(value: /* e */ CardSelectEventArgs => Unit): Self = StObject.set(x, "cardSelect", js.Any.fromFunction1(value))
      
      inline def setCardSelectUndefined: Self = StObject.set(x, "cardSelect", js.undefined)
      
      inline def setCardSelecting(value: /* e */ CardSelectingEventArgs => Unit): Self = StObject.set(x, "cardSelecting", js.Any.fromFunction1(value))
      
      inline def setCardSelectingUndefined: Self = StObject.set(x, "cardSelecting", js.undefined)
      
      inline def setCardSettings(value: CardSettings): Self = StObject.set(x, "cardSettings", value.asInstanceOf[js.Any])
      
      inline def setCardSettingsUndefined: Self = StObject.set(x, "cardSettings", js.undefined)
      
      inline def setCellClick(value: /* e */ CellClickEventArgs => Unit): Self = StObject.set(x, "cellClick", js.Any.fromFunction1(value))
      
      inline def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
      
      inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setContextClick(value: /* e */ ContextClickEventArgs => Unit): Self = StObject.set(x, "contextClick", js.Any.fromFunction1(value))
      
      inline def setContextClickUndefined: Self = StObject.set(x, "contextClick", js.undefined)
      
      inline def setContextMenuSettings(value: ContextMenuSettings): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      inline def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      inline def setContextOpen(value: /* e */ ContextOpenEventArgs => Unit): Self = StObject.set(x, "contextOpen", js.Any.fromFunction1(value))
      
      inline def setContextOpenUndefined: Self = StObject.set(x, "contextOpen", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCustomToolbarItems(value: js.Array[CustomToolbarItem]): Self = StObject.set(x, "customToolbarItems", value.asInstanceOf[js.Any])
      
      inline def setCustomToolbarItemsUndefined: Self = StObject.set(x, "customToolbarItems", js.undefined)
      
      inline def setCustomToolbarItemsVarargs(value: CustomToolbarItem*): Self = StObject.set(x, "customToolbarItems", js.Array(value*))
      
      inline def setDataBound(value: /* e */ DataBoundEventArgs => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
      
      inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEditSettings(value: EditSettings): Self = StObject.set(x, "editSettings", value.asInstanceOf[js.Any])
      
      inline def setEditSettingsUndefined: Self = StObject.set(x, "editSettings", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableTotalCount(value: Boolean): Self = StObject.set(x, "enableTotalCount", value.asInstanceOf[js.Any])
      
      inline def setEnableTotalCountUndefined: Self = StObject.set(x, "enableTotalCount", js.undefined)
      
      inline def setEnableTouch(value: Boolean): Self = StObject.set(x, "enableTouch", value.asInstanceOf[js.Any])
      
      inline def setEnableTouchUndefined: Self = StObject.set(x, "enableTouch", js.undefined)
      
      inline def setEndDelete(value: /* e */ EndDeleteEventArgs => Unit): Self = StObject.set(x, "endDelete", js.Any.fromFunction1(value))
      
      inline def setEndDeleteUndefined: Self = StObject.set(x, "endDelete", js.undefined)
      
      inline def setEndEdit(value: /* e */ EndEditEventArgs => Unit): Self = StObject.set(x, "endEdit", js.Any.fromFunction1(value))
      
      inline def setEndEditUndefined: Self = StObject.set(x, "endEdit", js.undefined)
      
      inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFilterSettings(value: js.Array[FilterSetting]): Self = StObject.set(x, "filterSettings", value.asInstanceOf[js.Any])
      
      inline def setFilterSettingsUndefined: Self = StObject.set(x, "filterSettings", js.undefined)
      
      inline def setFilterSettingsVarargs(value: FilterSetting*): Self = StObject.set(x, "filterSettings", js.Array(value*))
      
      inline def setHeaderClick(value: /* e */ HeaderClickEventArgs => Unit): Self = StObject.set(x, "headerClick", js.Any.fromFunction1(value))
      
      inline def setHeaderClickUndefined: Self = StObject.set(x, "headerClick", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setKeyField(value: String): Self = StObject.set(x, "keyField", value.asInstanceOf[js.Any])
      
      inline def setKeyFieldUndefined: Self = StObject.set(x, "keyField", js.undefined)
      
      inline def setKeySettings(value: Any): Self = StObject.set(x, "keySettings", value.asInstanceOf[js.Any])
      
      inline def setKeySettingsUndefined: Self = StObject.set(x, "keySettings", js.undefined)
      
      inline def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = StObject.set(x, "queryCellInfo", js.Any.fromFunction1(value))
      
      inline def setQueryCellInfoUndefined: Self = StObject.set(x, "queryCellInfo", js.undefined)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setScrollSettings(value: ScrollSettings): Self = StObject.set(x, "scrollSettings", value.asInstanceOf[js.Any])
      
      inline def setScrollSettingsUndefined: Self = StObject.set(x, "scrollSettings", js.undefined)
      
      inline def setSearchSettings(value: SearchSettings): Self = StObject.set(x, "searchSettings", value.asInstanceOf[js.Any])
      
      inline def setSearchSettingsUndefined: Self = StObject.set(x, "searchSettings", js.undefined)
      
      inline def setSelectionType(value: SelectionType | String): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
      
      inline def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
      
      inline def setShowColumnWhenEmpty(value: Boolean): Self = StObject.set(x, "showColumnWhenEmpty", value.asInstanceOf[js.Any])
      
      inline def setShowColumnWhenEmptyUndefined: Self = StObject.set(x, "showColumnWhenEmpty", js.undefined)
      
      inline def setStackedHeaderRows(value: js.Array[StackedHeaderRow]): Self = StObject.set(x, "stackedHeaderRows", value.asInstanceOf[js.Any])
      
      inline def setStackedHeaderRowsUndefined: Self = StObject.set(x, "stackedHeaderRows", js.undefined)
      
      inline def setStackedHeaderRowsVarargs(value: StackedHeaderRow*): Self = StObject.set(x, "stackedHeaderRows", js.Array(value*))
      
      inline def setSwimlaneClick(value: /* e */ SwimlaneClickEventArgs => Unit): Self = StObject.set(x, "swimlaneClick", js.Any.fromFunction1(value))
      
      inline def setSwimlaneClickUndefined: Self = StObject.set(x, "swimlaneClick", js.undefined)
      
      inline def setSwimlaneSettings(value: SwimlaneSettings): Self = StObject.set(x, "swimlaneSettings", value.asInstanceOf[js.Any])
      
      inline def setSwimlaneSettingsUndefined: Self = StObject.set(x, "swimlaneSettings", js.undefined)
      
      inline def setToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = StObject.set(x, "toolbarClick", js.Any.fromFunction1(value))
      
      inline def setToolbarClickUndefined: Self = StObject.set(x, "toolbarClick", js.undefined)
      
      inline def setTooltipSettings(value: TooltipSettings): Self = StObject.set(x, "tooltipSettings", value.asInstanceOf[js.Any])
      
      inline def setTooltipSettingsUndefined: Self = StObject.set(x, "tooltipSettings", js.undefined)
      
      inline def setWorkflows(value: js.Array[Workflow]): Self = StObject.set(x, "workflows", value.asInstanceOf[js.Any])
      
      inline def setWorkflowsUndefined: Self = StObject.set(x, "workflows", js.undefined)
      
      inline def setWorkflowsVarargs(value: Workflow*): Self = StObject.set(x, "workflows", js.Array(value*))
    }
  }
  
  trait QueryCellInfoEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns Kanban card.
      */
    var card: js.UndefOr[Any] = js.undefined
    
    /** Returns Kanban card.
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Returns the column object.
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns current row record object (JSON).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object QueryCellInfoEventArgs {
    
    inline def apply(): QueryCellInfoEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryCellInfoEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryCellInfoEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCard(value: Any): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ScrollSettings extends StObject {
    
    /** To allow the Kanban to freeze particular swimlane at the time of scrolling , until scroll reaches next swimlane and it continues.
      * @default {false}
      */
    var allowFreezeSwimlane: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets an object that indicates to render the Kanban with specified scroll height.
      * @default {0}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** Gets or sets an object that indicates to render the Kanban with specified scroll width.
      * @default {auto}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object ScrollSettings {
    
    inline def apply(): ScrollSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollSettings] (val x: Self) extends AnyVal {
      
      inline def setAllowFreezeSwimlane(value: Boolean): Self = StObject.set(x, "allowFreezeSwimlane", value.asInstanceOf[js.Any])
      
      inline def setAllowFreezeSwimlaneUndefined: Self = StObject.set(x, "allowFreezeSwimlane", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SearchSettings extends StObject {
    
    /** To customize the fields the searching operation can be perform.
      * @default {Array}
      */
    var fields: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** To customize the ignore case based on searching.
      * @default {true}
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    /** To customize the searching string.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /** To customize the operator based on searching.
      * @default {contains}
      */
    var operator: js.UndefOr[String] = js.undefined
  }
  object SearchSettings {
    
    inline def apply(): SearchSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchSettings] (val x: Self) extends AnyVal {
      
      inline def setFields(value: js.Array[Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: Any*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    }
  }
  
  trait StackedHeaderRow extends StObject {
    
    /** Gets or sets a value that indicates whether to add stacked header columns into the stacked header rows.
      * @default {Array}
      */
    var stackedHeaderColumns: js.UndefOr[js.Array[StackedHeaderRowsStackedHeaderColumn]] = js.undefined
  }
  object StackedHeaderRow {
    
    inline def apply(): StackedHeaderRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackedHeaderRow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StackedHeaderRow] (val x: Self) extends AnyVal {
      
      inline def setStackedHeaderColumns(value: js.Array[StackedHeaderRowsStackedHeaderColumn]): Self = StObject.set(x, "stackedHeaderColumns", value.asInstanceOf[js.Any])
      
      inline def setStackedHeaderColumnsUndefined: Self = StObject.set(x, "stackedHeaderColumns", js.undefined)
      
      inline def setStackedHeaderColumnsVarargs(value: StackedHeaderRowsStackedHeaderColumn*): Self = StObject.set(x, "stackedHeaderColumns", js.Array(value*))
    }
  }
  
  trait StackedHeaderRowsStackedHeaderColumn extends StObject {
    
    /** Gets or sets a value that indicates the column for the particular stacked header column.
      * @default {null}
      */
    var column: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates the headerText for the particular stacked header column.
      * @default {null}
      */
    var headerText: js.UndefOr[String] = js.undefined
  }
  object StackedHeaderRowsStackedHeaderColumn {
    
    inline def apply(): StackedHeaderRowsStackedHeaderColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackedHeaderRowsStackedHeaderColumn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StackedHeaderRowsStackedHeaderColumn] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    }
  }
  
  trait SwimlaneClickEventArgs extends StObject {
    
    /** Current Action name while swim lane clicked. Actions are "expand" or "collapse"
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the swim lane group data's.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns current swim lane row index.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns current target element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SwimlaneClickEventArgs {
    
    inline def apply(): SwimlaneClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwimlaneClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwimlaneClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SwimlaneSettings extends StObject {
    
    /** To enable or disable DragAndDrop across swim lane.
      * @default {false}
      */
    var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets an object that indicates to render the swimlane rows with specified swimlane headers.
      * @default {[]}
      */
    var headers: js.UndefOr[js.Array[SwimlaneSettingsHeader]] = js.undefined
    
    /** To enable or disable items count in swim lane.
      * @default {true}
      */
    var showCount: js.UndefOr[Boolean] = js.undefined
    
    /** To enable or disable empty swimlane on Kanban board.  It is used to shown empty swimlane when no data's present on headers key mapping value.
      * @default {false}
      */
    var showEmptySwimlane: js.UndefOr[Boolean] = js.undefined
    
    /** Customize the settings for unassigned category of swim lane.
      * @default {Object}
      */
    var unassignedGroup: js.UndefOr[SwimlaneSettingsUnassignedGroup] = js.undefined
  }
  object SwimlaneSettings {
    
    inline def apply(): SwimlaneSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwimlaneSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwimlaneSettings] (val x: Self) extends AnyVal {
      
      inline def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowDragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setAllowDragAndDropUndefined: Self = StObject.set(x, "allowDragAndDrop", js.undefined)
      
      inline def setHeaders(value: js.Array[SwimlaneSettingsHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: SwimlaneSettingsHeader*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setShowCount(value: Boolean): Self = StObject.set(x, "showCount", value.asInstanceOf[js.Any])
      
      inline def setShowCountUndefined: Self = StObject.set(x, "showCount", js.undefined)
      
      inline def setShowEmptySwimlane(value: Boolean): Self = StObject.set(x, "showEmptySwimlane", value.asInstanceOf[js.Any])
      
      inline def setShowEmptySwimlaneUndefined: Self = StObject.set(x, "showEmptySwimlane", js.undefined)
      
      inline def setUnassignedGroup(value: SwimlaneSettingsUnassignedGroup): Self = StObject.set(x, "unassignedGroup", value.asInstanceOf[js.Any])
      
      inline def setUnassignedGroupUndefined: Self = StObject.set(x, "unassignedGroup", js.undefined)
    }
  }
  
  trait SwimlaneSettingsHeader extends StObject {
    
    /** Gets or sets a value that indicates to render the Kanban with specified swimlane header key.
      * @default {null}
      */
    var key: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates to render the Kanban with specified swimlane header text.
      * @default {null}
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object SwimlaneSettingsHeader {
    
    inline def apply(): SwimlaneSettingsHeader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwimlaneSettingsHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwimlaneSettingsHeader] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait SwimlaneSettingsUnassignedGroup extends StObject {
    
    /** To enable or disable unassigned category change with swim lane key values.
      * @default {true}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** To set the user defined values which are need to categorized as unassigned category swim lane groups.
      * @default {[null,undefined,]}
      */
    var keys: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object SwimlaneSettingsUnassignedGroup {
    
    inline def apply(): SwimlaneSettingsUnassignedGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwimlaneSettingsUnassignedGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwimlaneSettingsUnassignedGroup] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setKeys(value: js.Array[Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: Any*): Self = StObject.set(x, "keys", js.Array(value*))
    }
  }
  
  trait ToolbarClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[Any] = js.undefined
    
    /** Returns the item id of that current element.
      */
    var itemId: js.UndefOr[String] = js.undefined
    
    /** Returns the item index of that current element.
      */
    var itemIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the item name of that current element.
      */
    var itemName: js.UndefOr[String] = js.undefined
    
    /** Returns the item text of that current element.
      */
    var itemText: js.UndefOr[String] = js.undefined
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the toolbar object of the Kanban.
      */
    var toolbarData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ToolbarClickEventArgs {
    
    inline def apply(): ToolbarClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
      
      inline def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
      
      inline def setItemNameUndefined: Self = StObject.set(x, "itemName", js.undefined)
      
      inline def setItemText(value: String): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
      
      inline def setItemTextUndefined: Self = StObject.set(x, "itemText", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setToolbarData(value: Any): Self = StObject.set(x, "toolbarData", value.asInstanceOf[js.Any])
      
      inline def setToolbarDataUndefined: Self = StObject.set(x, "toolbarData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TooltipSettings extends StObject {
    
    /** To enable or disable the tooltip display.
      * @default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** To customize the tooltip display based on your requirements.
      * @default {null}
      */
    var template: js.UndefOr[String] = js.undefined
  }
  object TooltipSettings {
    
    inline def apply(): TooltipSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipSettings] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait Workflow extends StObject {
    
    /** Gets or sets an object that indicates to render the Kanban with specified workflows allowed Transitions.
      * @default {null}
      */
    var allowedTransitions: js.UndefOr[String] = js.undefined
    
    /** Gets or sets an object that indicates to render the Kanban with specified workflows key.
      * @default {null}
      */
    var key: js.UndefOr[String | Double] = js.undefined
  }
  object Workflow {
    
    inline def apply(): Workflow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Workflow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Workflow] (val x: Self) extends AnyVal {
      
      inline def setAllowedTransitions(value: String): Self = StObject.set(x, "allowedTransitions", value.asInstanceOf[js.Any])
      
      inline def setAllowedTransitionsUndefined: Self = StObject.set(x, "allowedTransitions", js.undefined)
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
