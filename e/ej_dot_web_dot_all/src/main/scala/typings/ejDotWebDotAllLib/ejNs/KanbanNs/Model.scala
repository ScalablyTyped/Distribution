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

