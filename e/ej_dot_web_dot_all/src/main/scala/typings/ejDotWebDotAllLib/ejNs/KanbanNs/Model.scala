package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered for every Kanban action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, scala.Unit]] = js.undefined
  /** Triggered for every Kanban action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, scala.Unit]] = js.undefined
  /** Triggered for every Kanban action server failure event.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to enable allowDragAndDrop behavior on Kanban.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable drag and drop behavior between Kanban controls.
    * @Default {false}
    */
  var allowExternalDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** To enable filtering behavior on Kanban.User can specify query in filterSettings collection after enabling allowFiltering.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to allow card hover actions.
    * @Default {true}
    */
  var allowHover: js.UndefOr[scala.Boolean] = js.undefined
  /** To allow keyboard navigation actions.
    * @Default {false}
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable printing option.
    * @Default {false}
    */
  var allowPrinting: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the scrollbar in the Kanban and view the card by scroll through the Kanban manually.
    * @Default {false}
    */
  var allowScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /** To enable Searching operation in Kanban.
    * @Default {false}
    */
  var allowSearching: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable allowSelection behavior on Kanban.User can select card and the selected card will be highlighted on Kanban.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** To enable or disable the title of the card.
    * @Default {false}
    */
  var allowTitle: js.UndefOr[scala.Boolean] = js.undefined
  /** To enable or disable the column expand /collapse.
    * @Default {false}
    */
  var allowToggleColumn: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered before the card is selected.
    */
  var beforeCardSelect: js.UndefOr[js.Function1[/* e */ BeforeCardSelectEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the task is going to be edited.
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, scala.Unit]] = js.undefined
  /** Trigger after the card is clicked.
    */
  var cardClick: js.UndefOr[js.Function1[/* e */ CardClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered when card is double clicked.
    */
  var cardDoubleClick: js.UndefOr[js.Function1[/* e */ CardDoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the card is being dragged.
    */
  var cardDrag: js.UndefOr[js.Function1[/* e */ CardDragEventArgs, scala.Unit]] = js.undefined
  /** Triggered when card dragging start.
    */
  var cardDragStart: js.UndefOr[js.Function1[/* e */ CardDragStartEventArgs, scala.Unit]] = js.undefined
  /** Triggered when card dragging stops.
    */
  var cardDragStop: js.UndefOr[js.Function1[/* e */ CardDragStopEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the card is Dropped.
    */
  var cardDrop: js.UndefOr[js.Function1[/* e */ CardDropEventArgs, scala.Unit]] = js.undefined
  /** Triggered after the card is selected.
    */
  var cardSelect: js.UndefOr[js.Function1[/* e */ CardSelectEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the card is selected.
    */
  var cardSelecting: js.UndefOr[js.Function1[/* e */ CardSelectingEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to Customize the card settings.
    * @Default {Object}
    */
  var cardSettings: js.UndefOr[CardSettings] = js.undefined
  /** Triggers after the cell is clicked.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified columns.
    * @Default {Array}
    */
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  /** Triggered when context menu item is clicked in Kanban
    */
  var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to customize the context menu behavior of the Kanban.
    * @Default {Object}
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  /** Triggered before the context menu is opened.
    */
  var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the Kanban is rendered completely
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates to render the Kanban with custom theme.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to add customToolbarItems within the toolbar to perform any action in the Kanban.
    * @Default {[]}
    */
  var customToolbarItems: js.UndefOr[js.Array[CustomToolbarItem]] = js.undefined
  /** Triggered the Kanban is bound with data during initial rendering.
    */
  var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets the data to render the Kanban with cards.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Triggered when Kanban going to destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Get or sets an object that indicates whether to customize the editing behavior of the Kanban.
    * @Default {Object}
    */
  var editSettings: js.UndefOr[EditSettings] = js.undefined
  /** Align content in the Kanban control align from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** To show total count of cards in each column.
    * @Default {false}
    */
  var enableTotalCount: js.UndefOr[scala.Boolean] = js.undefined
  /** To perform kanban functionalities with touch interaction.
    * @Default {true}
    */
  var enableTouch: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered after the card is deleted.
    */
  var endDelete: js.UndefOr[js.Function1[/* e */ EndDeleteEventArgs, scala.Unit]] = js.undefined
  /** Triggered after the card is edited.
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, scala.Unit]] = js.undefined
  /** To customize field mappings for card , editing title and control key parameters
    * @Default {Object}
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** To customize the filtering behavior based on queries given.
    * @Default {Array}
    */
  var filterSettings: js.UndefOr[js.Array[FilterSetting]] = js.undefined
  /** Triggers after the header is clicked.
    */
  var headerClick: js.UndefOr[js.Function1[/* e */ HeaderClickEventArgs, scala.Unit]] = js.undefined
  /** When set to true, adapts the Kanban layout to fit the screen size of devices on which it renders.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** To map datasource field for column values mapping
    * @Default {null}
    */
  var keyField: js.UndefOr[java.lang.String] = js.undefined
  /** To change the key in keyboard interaction to Kanban control.
    * @Default {null}
    */
  var keySettings: js.UndefOr[js.Any] = js.undefined
  /** Triggered initial load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
    * a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to set the minimum width of the responsive Kanban while isResponsive property is true.
    * @Default {0}
    */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /** ej Query to query database of Kanban.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Triggered every time a single card rendered request is made to access particular card information.
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to customize the scrolling behavior of the Kanban.
    * @Default {Object}
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.undefined
  /** To customize the searching behavior of the Kanban.
    * @Default {Object}
    */
  var searchSettings: js.UndefOr[SearchSettings] = js.undefined
  /** To allow customize selection type. Accepting types are &quot;single&quot; and &quot;multiple&quot;.
    * @Default {ej.Kanban.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to render kanban columns using without data source.
    * @Default {false}
    */
  var showColumnWhenEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets an object that indicates to managing the collection of stacked header rows for the Kanban.
    * @Default {Array}
    */
  var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.undefined
  /** Triggers before swim lane expand or collapse icon is clicked.
    */
  var swimlaneClick: js.UndefOr[js.Function1[/* e */ SwimlaneClickEventArgs, scala.Unit]] = js.undefined
  /** Customize the settings for swim lane.
    * @Default {Object}
    */
  var swimlaneSettings: js.UndefOr[SwimlaneSettings] = js.undefined
  /** Triggered when toolbar item is clicked in Kanban.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, scala.Unit]] = js.undefined
  /** The tooltip allows to display card details in a tooltip while hovering on it.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified workflows.
    * @Default {Array}
    */
  var workflows: js.UndefOr[js.Array[Workflow]] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: /* e */ ActionBeginEventArgs => scala.Unit = null,
    actionComplete: /* e */ ActionCompleteEventArgs => scala.Unit = null,
    actionFailure: /* e */ ActionFailureEventArgs => scala.Unit = null,
    allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined,
    allowExternalDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined,
    allowFiltering: js.UndefOr[scala.Boolean] = js.undefined,
    allowHover: js.UndefOr[scala.Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    allowPrinting: js.UndefOr[scala.Boolean] = js.undefined,
    allowScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    allowSearching: js.UndefOr[scala.Boolean] = js.undefined,
    allowSelection: js.UndefOr[scala.Boolean] = js.undefined,
    allowTitle: js.UndefOr[scala.Boolean] = js.undefined,
    allowToggleColumn: js.UndefOr[scala.Boolean] = js.undefined,
    beforeCardSelect: /* e */ BeforeCardSelectEventArgs => scala.Unit = null,
    beginEdit: /* e */ BeginEditEventArgs => scala.Unit = null,
    cardClick: /* e */ CardClickEventArgs => scala.Unit = null,
    cardDoubleClick: /* e */ CardDoubleClickEventArgs => scala.Unit = null,
    cardDrag: /* e */ CardDragEventArgs => scala.Unit = null,
    cardDragStart: /* e */ CardDragStartEventArgs => scala.Unit = null,
    cardDragStop: /* e */ CardDragStopEventArgs => scala.Unit = null,
    cardDrop: /* e */ CardDropEventArgs => scala.Unit = null,
    cardSelect: /* e */ CardSelectEventArgs => scala.Unit = null,
    cardSelecting: /* e */ CardSelectingEventArgs => scala.Unit = null,
    cardSettings: CardSettings = null,
    cellClick: /* e */ CellClickEventArgs => scala.Unit = null,
    columns: js.Array[Column] = null,
    contextClick: /* e */ ContextClickEventArgs => scala.Unit = null,
    contextMenuSettings: ContextMenuSettings = null,
    contextOpen: /* e */ ContextOpenEventArgs => scala.Unit = null,
    create: /* e */ CreateEventArgs => scala.Unit = null,
    cssClass: java.lang.String = null,
    customToolbarItems: js.Array[CustomToolbarItem] = null,
    dataBound: /* e */ DataBoundEventArgs => scala.Unit = null,
    dataSource: js.Any = null,
    destroy: /* e */ DestroyEventArgs => scala.Unit = null,
    editSettings: EditSettings = null,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableTotalCount: js.UndefOr[scala.Boolean] = js.undefined,
    enableTouch: js.UndefOr[scala.Boolean] = js.undefined,
    endDelete: /* e */ EndDeleteEventArgs => scala.Unit = null,
    endEdit: /* e */ EndEditEventArgs => scala.Unit = null,
    fields: Fields = null,
    filterSettings: js.Array[FilterSetting] = null,
    headerClick: /* e */ HeaderClickEventArgs => scala.Unit = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    keyField: java.lang.String = null,
    keySettings: js.Any = null,
    load: /* e */ LoadEventArgs => scala.Unit = null,
    locale: java.lang.String = null,
    minWidth: scala.Int | scala.Double = null,
    query: js.Any = null,
    queryCellInfo: /* e */ QueryCellInfoEventArgs => scala.Unit = null,
    scrollSettings: ScrollSettings = null,
    searchSettings: SearchSettings = null,
    selectionType: SelectionType | java.lang.String = null,
    showColumnWhenEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    stackedHeaderRows: js.Array[StackedHeaderRow] = null,
    swimlaneClick: /* e */ SwimlaneClickEventArgs => scala.Unit = null,
    swimlaneSettings: SwimlaneSettings = null,
    toolbarClick: /* e */ ToolbarClickEventArgs => scala.Unit = null,
    tooltipSettings: TooltipSettings = null,
    workflows: js.Array[Workflow] = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(js.Any.fromFunction1(actionBegin))
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(js.Any.fromFunction1(actionComplete))
    if (actionFailure != null) __obj.updateDynamic("actionFailure")(js.Any.fromFunction1(actionFailure))
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop)
    if (!js.isUndefined(allowExternalDragAndDrop)) __obj.updateDynamic("allowExternalDragAndDrop")(allowExternalDragAndDrop)
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering)
    if (!js.isUndefined(allowHover)) __obj.updateDynamic("allowHover")(allowHover)
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (!js.isUndefined(allowPrinting)) __obj.updateDynamic("allowPrinting")(allowPrinting)
    if (!js.isUndefined(allowScrolling)) __obj.updateDynamic("allowScrolling")(allowScrolling)
    if (!js.isUndefined(allowSearching)) __obj.updateDynamic("allowSearching")(allowSearching)
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection)
    if (!js.isUndefined(allowTitle)) __obj.updateDynamic("allowTitle")(allowTitle)
    if (!js.isUndefined(allowToggleColumn)) __obj.updateDynamic("allowToggleColumn")(allowToggleColumn)
    if (beforeCardSelect != null) __obj.updateDynamic("beforeCardSelect")(js.Any.fromFunction1(beforeCardSelect))
    if (beginEdit != null) __obj.updateDynamic("beginEdit")(js.Any.fromFunction1(beginEdit))
    if (cardClick != null) __obj.updateDynamic("cardClick")(js.Any.fromFunction1(cardClick))
    if (cardDoubleClick != null) __obj.updateDynamic("cardDoubleClick")(js.Any.fromFunction1(cardDoubleClick))
    if (cardDrag != null) __obj.updateDynamic("cardDrag")(js.Any.fromFunction1(cardDrag))
    if (cardDragStart != null) __obj.updateDynamic("cardDragStart")(js.Any.fromFunction1(cardDragStart))
    if (cardDragStop != null) __obj.updateDynamic("cardDragStop")(js.Any.fromFunction1(cardDragStop))
    if (cardDrop != null) __obj.updateDynamic("cardDrop")(js.Any.fromFunction1(cardDrop))
    if (cardSelect != null) __obj.updateDynamic("cardSelect")(js.Any.fromFunction1(cardSelect))
    if (cardSelecting != null) __obj.updateDynamic("cardSelecting")(js.Any.fromFunction1(cardSelecting))
    if (cardSettings != null) __obj.updateDynamic("cardSettings")(cardSettings)
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction1(cellClick))
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (contextClick != null) __obj.updateDynamic("contextClick")(js.Any.fromFunction1(contextClick))
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings)
    if (contextOpen != null) __obj.updateDynamic("contextOpen")(js.Any.fromFunction1(contextOpen))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (customToolbarItems != null) __obj.updateDynamic("customToolbarItems")(customToolbarItems)
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (editSettings != null) __obj.updateDynamic("editSettings")(editSettings)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableTotalCount)) __obj.updateDynamic("enableTotalCount")(enableTotalCount)
    if (!js.isUndefined(enableTouch)) __obj.updateDynamic("enableTouch")(enableTouch)
    if (endDelete != null) __obj.updateDynamic("endDelete")(js.Any.fromFunction1(endDelete))
    if (endEdit != null) __obj.updateDynamic("endEdit")(js.Any.fromFunction1(endEdit))
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filterSettings != null) __obj.updateDynamic("filterSettings")(filterSettings)
    if (headerClick != null) __obj.updateDynamic("headerClick")(js.Any.fromFunction1(headerClick))
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (keyField != null) __obj.updateDynamic("keyField")(keyField)
    if (keySettings != null) __obj.updateDynamic("keySettings")(keySettings)
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (queryCellInfo != null) __obj.updateDynamic("queryCellInfo")(js.Any.fromFunction1(queryCellInfo))
    if (scrollSettings != null) __obj.updateDynamic("scrollSettings")(scrollSettings)
    if (searchSettings != null) __obj.updateDynamic("searchSettings")(searchSettings)
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnWhenEmpty)) __obj.updateDynamic("showColumnWhenEmpty")(showColumnWhenEmpty)
    if (stackedHeaderRows != null) __obj.updateDynamic("stackedHeaderRows")(stackedHeaderRows)
    if (swimlaneClick != null) __obj.updateDynamic("swimlaneClick")(js.Any.fromFunction1(swimlaneClick))
    if (swimlaneSettings != null) __obj.updateDynamic("swimlaneSettings")(swimlaneSettings)
    if (toolbarClick != null) __obj.updateDynamic("toolbarClick")(js.Any.fromFunction1(toolbarClick))
    if (tooltipSettings != null) __obj.updateDynamic("tooltipSettings")(tooltipSettings)
    if (workflows != null) __obj.updateDynamic("workflows")(workflows)
    __obj.asInstanceOf[Model]
  }
}

