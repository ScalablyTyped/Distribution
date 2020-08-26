package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered for every Kanban action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggered for every Kanban action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Triggered for every Kanban action server failure event.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to enable allowDragAndDrop behavior on Kanban.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable drag and drop behavior between Kanban controls.
    * @Default {false}
    */
  var allowExternalDragAndDrop: js.UndefOr[Boolean] = js.native
  /** To enable filtering behavior on Kanban.User can specify query in filterSettings collection after enabling allowFiltering.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to allow card hover actions.
    * @Default {true}
    */
  var allowHover: js.UndefOr[Boolean] = js.native
  /** To allow keyboard navigation actions.
    * @Default {false}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable printing option.
    * @Default {false}
    */
  var allowPrinting: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the scrollbar in the Kanban and view the card by scroll through the Kanban manually.
    * @Default {false}
    */
  var allowScrolling: js.UndefOr[Boolean] = js.native
  /** To enable Searching operation in Kanban.
    * @Default {false}
    */
  var allowSearching: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable allowSelection behavior on Kanban.User can select card and the selected card will be highlighted on Kanban.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.native
  /** To enable or disable the title of the card.
    * @Default {false}
    */
  var allowTitle: js.UndefOr[Boolean] = js.native
  /** To enable or disable the column expand /collapse.
    * @Default {false}
    */
  var allowToggleColumn: js.UndefOr[Boolean] = js.native
  /** Triggered before the card is selected.
    */
  var beforeCardSelect: js.UndefOr[js.Function1[/* e */ BeforeCardSelectEventArgs, Unit]] = js.native
  /** Triggered before the task is going to be edited.
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.native
  /** Trigger after the card is clicked.
    */
  var cardClick: js.UndefOr[js.Function1[/* e */ CardClickEventArgs, Unit]] = js.native
  /** Triggered when card is double clicked.
    */
  var cardDoubleClick: js.UndefOr[js.Function1[/* e */ CardDoubleClickEventArgs, Unit]] = js.native
  /** Triggered when the card is being dragged.
    */
  var cardDrag: js.UndefOr[js.Function1[/* e */ CardDragEventArgs, Unit]] = js.native
  /** Triggered when card dragging start.
    */
  var cardDragStart: js.UndefOr[js.Function1[/* e */ CardDragStartEventArgs, Unit]] = js.native
  /** Triggered when card dragging stops.
    */
  var cardDragStop: js.UndefOr[js.Function1[/* e */ CardDragStopEventArgs, Unit]] = js.native
  /** Triggered when the card is Dropped.
    */
  var cardDrop: js.UndefOr[js.Function1[/* e */ CardDropEventArgs, Unit]] = js.native
  /** Triggered after the card is selected.
    */
  var cardSelect: js.UndefOr[js.Function1[/* e */ CardSelectEventArgs, Unit]] = js.native
  /** Triggered before the card is selected.
    */
  var cardSelecting: js.UndefOr[js.Function1[/* e */ CardSelectingEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to Customize the card settings.
    * @Default {Object}
    */
  var cardSettings: js.UndefOr[CardSettings] = js.native
  /** Triggers after the cell is clicked.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates to render the Kanban with specified columns.
    * @Default {Array}
    */
  var columns: js.UndefOr[js.Array[Column]] = js.native
  /** Triggered when context menu item is clicked in Kanban
    */
  var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to customize the context menu behavior of the Kanban.
    * @Default {Object}
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  /** Triggered before the context menu is opened.
    */
  var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, Unit]] = js.native
  /** Triggered when the Kanban is rendered completely
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates to render the Kanban with custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to add customToolbarItems within the toolbar to perform any action in the Kanban.
    * @Default {[]}
    */
  var customToolbarItems: js.UndefOr[js.Array[CustomToolbarItem]] = js.native
  /** Triggered the Kanban is bound with data during initial rendering.
    */
  var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, Unit]] = js.native
  /** Gets or sets the data to render the Kanban with cards.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Triggered when Kanban going to destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Get or sets an object that indicates whether to customize the editing behavior of the Kanban.
    * @Default {Object}
    */
  var editSettings: js.UndefOr[EditSettings] = js.native
  /** Align content in the Kanban control align from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** To show total count of cards in each column.
    * @Default {false}
    */
  var enableTotalCount: js.UndefOr[Boolean] = js.native
  /** To perform kanban functionalities with touch interaction.
    * @Default {true}
    */
  var enableTouch: js.UndefOr[Boolean] = js.native
  /** Triggered after the card is deleted.
    */
  var endDelete: js.UndefOr[js.Function1[/* e */ EndDeleteEventArgs, Unit]] = js.native
  /** Triggered after the card is edited.
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.native
  /** To customize field mappings for card , editing title and control key parameters
    * @Default {Object}
    */
  var fields: js.UndefOr[Fields] = js.native
  /** To customize the filtering behavior based on queries given.
    * @Default {Array}
    */
  var filterSettings: js.UndefOr[js.Array[FilterSetting]] = js.native
  /** Triggers after the header is clicked.
    */
  var headerClick: js.UndefOr[js.Function1[/* e */ HeaderClickEventArgs, Unit]] = js.native
  /** When set to true, adapts the Kanban layout to fit the screen size of devices on which it renders.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** To map datasource field for column values mapping
    * @Default {null}
    */
  var keyField: js.UndefOr[String] = js.native
  /** To change the key in keyboard interaction to Kanban control.
    * @Default {null}
    */
  var keySettings: js.UndefOr[js.Any] = js.native
  /** Triggered initial load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
    * a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to set the minimum width of the responsive Kanban while isResponsive property is true.
    * @Default {0}
    */
  var minWidth: js.UndefOr[Double] = js.native
  /** ej Query to query database of Kanban.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Triggered every time a single card rendered request is made to access particular card information.
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to customize the scrolling behavior of the Kanban.
    * @Default {Object}
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.native
  /** To customize the searching behavior of the Kanban.
    * @Default {Object}
    */
  var searchSettings: js.UndefOr[SearchSettings] = js.native
  /** To allow customize selection type. Accepting types are &quot;single&quot; and &quot;multiple&quot;.
    * @Default {ej.Kanban.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.native
  /** Gets or sets a value that indicates whether to render kanban columns using without data source.
    * @Default {false}
    */
  var showColumnWhenEmpty: js.UndefOr[Boolean] = js.native
  /** Gets or sets an object that indicates to managing the collection of stacked header rows for the Kanban.
    * @Default {Array}
    */
  var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.native
  /** Triggers before swim lane expand or collapse icon is clicked.
    */
  var swimlaneClick: js.UndefOr[js.Function1[/* e */ SwimlaneClickEventArgs, Unit]] = js.native
  /** Customize the settings for swim lane.
    * @Default {Object}
    */
  var swimlaneSettings: js.UndefOr[SwimlaneSettings] = js.native
  /** Triggered when toolbar item is clicked in Kanban.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.native
  /** The tooltip allows to display card details in a tooltip while hovering on it.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.native
  /** Gets or sets an object that indicates to render the Kanban with specified workflows.
    * @Default {Array}
    */
  var workflows: js.UndefOr[js.Array[Workflow]] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = this.set("actionBegin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionBegin: Self = this.set("actionBegin", js.undefined)
    @scala.inline
    def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = this.set("actionComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionComplete: Self = this.set("actionComplete", js.undefined)
    @scala.inline
    def setActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = this.set("actionFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionFailure: Self = this.set("actionFailure", js.undefined)
    @scala.inline
    def setAllowDragAndDrop(value: Boolean): Self = this.set("allowDragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDragAndDrop: Self = this.set("allowDragAndDrop", js.undefined)
    @scala.inline
    def setAllowExternalDragAndDrop(value: Boolean): Self = this.set("allowExternalDragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowExternalDragAndDrop: Self = this.set("allowExternalDragAndDrop", js.undefined)
    @scala.inline
    def setAllowFiltering(value: Boolean): Self = this.set("allowFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFiltering: Self = this.set("allowFiltering", js.undefined)
    @scala.inline
    def setAllowHover(value: Boolean): Self = this.set("allowHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHover: Self = this.set("allowHover", js.undefined)
    @scala.inline
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    @scala.inline
    def setAllowPrinting(value: Boolean): Self = this.set("allowPrinting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPrinting: Self = this.set("allowPrinting", js.undefined)
    @scala.inline
    def setAllowScrolling(value: Boolean): Self = this.set("allowScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowScrolling: Self = this.set("allowScrolling", js.undefined)
    @scala.inline
    def setAllowSearching(value: Boolean): Self = this.set("allowSearching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSearching: Self = this.set("allowSearching", js.undefined)
    @scala.inline
    def setAllowSelection(value: Boolean): Self = this.set("allowSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSelection: Self = this.set("allowSelection", js.undefined)
    @scala.inline
    def setAllowTitle(value: Boolean): Self = this.set("allowTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTitle: Self = this.set("allowTitle", js.undefined)
    @scala.inline
    def setAllowToggleColumn(value: Boolean): Self = this.set("allowToggleColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowToggleColumn: Self = this.set("allowToggleColumn", js.undefined)
    @scala.inline
    def setBeforeCardSelect(value: /* e */ BeforeCardSelectEventArgs => Unit): Self = this.set("beforeCardSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeCardSelect: Self = this.set("beforeCardSelect", js.undefined)
    @scala.inline
    def setBeginEdit(value: /* e */ BeginEditEventArgs => Unit): Self = this.set("beginEdit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeginEdit: Self = this.set("beginEdit", js.undefined)
    @scala.inline
    def setCardClick(value: /* e */ CardClickEventArgs => Unit): Self = this.set("cardClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCardClick: Self = this.set("cardClick", js.undefined)
    @scala.inline
    def setCardDoubleClick(value: /* e */ CardDoubleClickEventArgs => Unit): Self = this.set("cardDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCardDoubleClick: Self = this.set("cardDoubleClick", js.undefined)
    @scala.inline
    def setCardDrag(value: /* e */ CardDragEventArgs => Unit): Self = this.set("cardDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCardDrag: Self = this.set("cardDrag", js.undefined)
    @scala.inline
    def setCardDragStart(value: /* e */ CardDragStartEventArgs => Unit): Self = this.set("cardDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCardDragStart: Self = this.set("cardDragStart", js.undefined)
    @scala.inline
    def setCardDragStop(value: /* e */ CardDragStopEventArgs => Unit): Self = this.set("cardDragStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCardDragStop: Self = this.set("cardDragStop", js.undefined)
    @scala.inline
    def setCardDrop(value: /* e */ CardDropEventArgs => Unit): Self = this.set("cardDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCardDrop: Self = this.set("cardDrop", js.undefined)
    @scala.inline
    def setCardSelect(value: /* e */ CardSelectEventArgs => Unit): Self = this.set("cardSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCardSelect: Self = this.set("cardSelect", js.undefined)
    @scala.inline
    def setCardSelecting(value: /* e */ CardSelectingEventArgs => Unit): Self = this.set("cardSelecting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCardSelecting: Self = this.set("cardSelecting", js.undefined)
    @scala.inline
    def setCardSettings(value: CardSettings): Self = this.set("cardSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardSettings: Self = this.set("cardSettings", js.undefined)
    @scala.inline
    def setCellClick(value: /* e */ CellClickEventArgs => Unit): Self = this.set("cellClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellClick: Self = this.set("cellClick", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setContextClick(value: /* e */ ContextClickEventArgs => Unit): Self = this.set("contextClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContextClick: Self = this.set("contextClick", js.undefined)
    @scala.inline
    def setContextMenuSettings(value: ContextMenuSettings): Self = this.set("contextMenuSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenuSettings: Self = this.set("contextMenuSettings", js.undefined)
    @scala.inline
    def setContextOpen(value: /* e */ ContextOpenEventArgs => Unit): Self = this.set("contextOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContextOpen: Self = this.set("contextOpen", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setCustomToolbarItemsVarargs(value: CustomToolbarItem*): Self = this.set("customToolbarItems", js.Array(value :_*))
    @scala.inline
    def setCustomToolbarItems(value: js.Array[CustomToolbarItem]): Self = this.set("customToolbarItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomToolbarItems: Self = this.set("customToolbarItems", js.undefined)
    @scala.inline
    def setDataBound(value: /* e */ DataBoundEventArgs => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEditSettings(value: EditSettings): Self = this.set("editSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditSettings: Self = this.set("editSettings", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnableTotalCount(value: Boolean): Self = this.set("enableTotalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTotalCount: Self = this.set("enableTotalCount", js.undefined)
    @scala.inline
    def setEnableTouch(value: Boolean): Self = this.set("enableTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTouch: Self = this.set("enableTouch", js.undefined)
    @scala.inline
    def setEndDelete(value: /* e */ EndDeleteEventArgs => Unit): Self = this.set("endDelete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEndDelete: Self = this.set("endDelete", js.undefined)
    @scala.inline
    def setEndEdit(value: /* e */ EndEditEventArgs => Unit): Self = this.set("endEdit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEndEdit: Self = this.set("endEdit", js.undefined)
    @scala.inline
    def setFields(value: Fields): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFilterSettingsVarargs(value: FilterSetting*): Self = this.set("filterSettings", js.Array(value :_*))
    @scala.inline
    def setFilterSettings(value: js.Array[FilterSetting]): Self = this.set("filterSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterSettings: Self = this.set("filterSettings", js.undefined)
    @scala.inline
    def setHeaderClick(value: /* e */ HeaderClickEventArgs => Unit): Self = this.set("headerClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderClick: Self = this.set("headerClick", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setKeyField(value: String): Self = this.set("keyField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyField: Self = this.set("keyField", js.undefined)
    @scala.inline
    def setKeySettings(value: js.Any): Self = this.set("keySettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySettings: Self = this.set("keySettings", js.undefined)
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = this.set("queryCellInfo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQueryCellInfo: Self = this.set("queryCellInfo", js.undefined)
    @scala.inline
    def setScrollSettings(value: ScrollSettings): Self = this.set("scrollSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSettings: Self = this.set("scrollSettings", js.undefined)
    @scala.inline
    def setSearchSettings(value: SearchSettings): Self = this.set("searchSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchSettings: Self = this.set("searchSettings", js.undefined)
    @scala.inline
    def setSelectionType(value: SelectionType | String): Self = this.set("selectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionType: Self = this.set("selectionType", js.undefined)
    @scala.inline
    def setShowColumnWhenEmpty(value: Boolean): Self = this.set("showColumnWhenEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowColumnWhenEmpty: Self = this.set("showColumnWhenEmpty", js.undefined)
    @scala.inline
    def setStackedHeaderRowsVarargs(value: StackedHeaderRow*): Self = this.set("stackedHeaderRows", js.Array(value :_*))
    @scala.inline
    def setStackedHeaderRows(value: js.Array[StackedHeaderRow]): Self = this.set("stackedHeaderRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackedHeaderRows: Self = this.set("stackedHeaderRows", js.undefined)
    @scala.inline
    def setSwimlaneClick(value: /* e */ SwimlaneClickEventArgs => Unit): Self = this.set("swimlaneClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSwimlaneClick: Self = this.set("swimlaneClick", js.undefined)
    @scala.inline
    def setSwimlaneSettings(value: SwimlaneSettings): Self = this.set("swimlaneSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwimlaneSettings: Self = this.set("swimlaneSettings", js.undefined)
    @scala.inline
    def setToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = this.set("toolbarClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToolbarClick: Self = this.set("toolbarClick", js.undefined)
    @scala.inline
    def setTooltipSettings(value: TooltipSettings): Self = this.set("tooltipSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipSettings: Self = this.set("tooltipSettings", js.undefined)
    @scala.inline
    def setWorkflowsVarargs(value: Workflow*): Self = this.set("workflows", js.Array(value :_*))
    @scala.inline
    def setWorkflows(value: js.Array[Workflow]): Self = this.set("workflows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflows: Self = this.set("workflows", js.undefined)
  }
  
}

