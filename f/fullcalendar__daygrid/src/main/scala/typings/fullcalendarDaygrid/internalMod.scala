package typings.fullcalendarDaygrid

import typings.fullcalendarDaygrid.anon.CurrentRange
import typings.preact.mod.RefObject
import typings.preact.mod.VNode
import typings.preact.mod.createElement.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalMod {
  
  @JSImport("@fullcalendar/daygrid/internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fullcalendar/daygrid/internal", "DayGridView")
  @js.native
  open class DayGridView () extends DayTableView
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<DayTableProps, ViewContext> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<DayTableProps, ViewContext> * / any */ @JSImport("@fullcalendar/daygrid/internal", "DayTable")
  @js.native
  open class DayTable () extends StObject {
    
    def render(): Element = js.native
    
    /* private */ var slicer: Any = js.native
    
    /* private */ var tableRef: Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slicer<TableSeg, [DayTableModel]> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slicer<TableSeg, [DayTableModel]> * / any */ @JSImport("@fullcalendar/daygrid/internal", "DayTableSlicer")
  @js.native
  open class DayTableSlicer () extends StObject {
    
    var forceDayIfListItem: Boolean = js.native
    
    def sliceRange(
      dateRange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any,
      dayTableModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableModel */ Any
    ): js.Array[TableSeg] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<TableProps> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<TableProps> * / any */ @JSImport("@fullcalendar/daygrid/internal", "Table")
  @js.native
  open class Table () extends StObject {
    
    def componentDidMount(): Unit = js.native
    
    def componentDidUpdate(prevProps: TableProps): Unit = js.native
    
    /* private */ var elRef: Any = js.native
    
    def flushScrollReset(): Unit = js.native
    
    /* private */ var needsScrollReset: Any = js.native
    
    def render(): Element = js.native
    
    def requestScrollReset(): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfileGenerator * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfileGenerator * / any */ @JSImport("@fullcalendar/daygrid/internal", "TableDateProfileGenerator")
  @js.native
  open class TableDateProfileGenerator () extends StObject {
    
    def buildRenderRange(currentRange: Any, currentRangeUnit: Any, isRangeAllDay: Any): Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<TableRowsProps> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<TableRowsProps> * / any */ @JSImport("@fullcalendar/daygrid/internal", "TableRows")
  @js.native
  open class TableRows () extends StObject {
    
    /* private */ var colPositions: Any = js.native
    
    def componentDidMount(): Unit = js.native
    
    def componentWillUnmount(): Unit = js.native
    
    /* private */ var getCellEl: Any = js.native
    
    /* private */ var getCellRange: Any = js.native
    
    def prepareHits(): Unit = js.native
    
    def queryHit(positionLeft: Double, positionTop: Double): Any = js.native
    
    def render(): Element = js.native
    
    /* private */ var rootEl: Any = js.native
    
    /* private */ var rowPositions: Any = js.native
    
    /* private */ var rowRefs: Any = js.native
    
    /* private */ var splitBgEventSegs: Any = js.native
    
    /* private */ var splitBusinessHourSegs: Any = js.native
    
    /* private */ var splitDateSelectionSegs: Any = js.native
    
    /* private */ var splitEventDrag: Any = js.native
    
    /* private */ var splitEventResize: Any = js.native
    
    /* private */ var splitFgEventSegs: Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<ViewProps, State> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<ViewProps, State> * / any */ /* note: abstract class */ @JSImport("@fullcalendar/daygrid/internal", "TableView")
  @js.native
  open class TableView[State] () extends StObject {
    
    /* protected */ var headerElRef: RefObject[HTMLTableCellElement] = js.native
    
    def renderHScrollLayout(
      headerRowContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkConfigRowContent */ Any,
      bodyContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      colCnt: Double,
      dayMinWidth: Double
    ): Element = js.native
    
    def renderSimpleLayout(
      headerRowContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkConfigRowContent */ Any,
      bodyContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ]
    ): Element = js.native
  }
  
  inline def buildDayTableModel(
    dateProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any,
    dateProfileGenerator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfileGenerator */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDayTableModel")(dateProfile.asInstanceOf[js.Any], dateProfileGenerator.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def buildDayTableRenderRange(props: CurrentRange): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDayTableRenderRange")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait DayTableProps extends StObject {
    
    var businessHours: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStore */ Any
    
    var clientHeight: Double | Null
    
    var clientWidth: Double | Null
    
    var colGroupNode: VNode[js.Object]
    
    var dateProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any
    
    var dateSelection: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateSpan */ Any) | Null
    
    var dayMaxEventRows: Boolean | Double
    
    var dayMaxEvents: Boolean | Double
    
    var dayTableModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableModel */ Any
    
    var eventDrag: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInteractionState */ Any) | Null
    
    var eventResize: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInteractionState */ Any) | Null
    
    var eventSelection: String
    
    var eventStore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStore */ Any
    
    var eventUiBases: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventUiHash */ Any
    
    var expandRows: Boolean
    
    var forPrint: Boolean
    
    var headerAlignElRef: js.UndefOr[RefObject[HTMLElement]] = js.undefined
    
    var nextDayThreshold: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
    
    var renderRowIntro: js.UndefOr[js.Function0[VNode[js.Object]]] = js.undefined
    
    var showWeekNumbers: Boolean
    
    var tableMinWidth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any
  }
  object DayTableProps {
    
    inline def apply(
      businessHours: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStore */ Any,
      colGroupNode: VNode[js.Object],
      dateProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any,
      dayMaxEventRows: Boolean | Double,
      dayMaxEvents: Boolean | Double,
      dayTableModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableModel */ Any,
      eventSelection: String,
      eventStore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStore */ Any,
      eventUiBases: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventUiHash */ Any,
      expandRows: Boolean,
      forPrint: Boolean,
      nextDayThreshold: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any,
      showWeekNumbers: Boolean,
      tableMinWidth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any
    ): DayTableProps = {
      val __obj = js.Dynamic.literal(businessHours = businessHours.asInstanceOf[js.Any], colGroupNode = colGroupNode.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], dayMaxEventRows = dayMaxEventRows.asInstanceOf[js.Any], dayMaxEvents = dayMaxEvents.asInstanceOf[js.Any], dayTableModel = dayTableModel.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], eventStore = eventStore.asInstanceOf[js.Any], eventUiBases = eventUiBases.asInstanceOf[js.Any], expandRows = expandRows.asInstanceOf[js.Any], forPrint = forPrint.asInstanceOf[js.Any], nextDayThreshold = nextDayThreshold.asInstanceOf[js.Any], showWeekNumbers = showWeekNumbers.asInstanceOf[js.Any], tableMinWidth = tableMinWidth.asInstanceOf[js.Any], clientHeight = null, clientWidth = null, dateSelection = null, eventDrag = null, eventResize = null)
      __obj.asInstanceOf[DayTableProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DayTableProps] (val x: Self) extends AnyVal {
      
      inline def setBusinessHours(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStore */ Any
      ): Self = StObject.set(x, "businessHours", value.asInstanceOf[js.Any])
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setClientHeightNull: Self = StObject.set(x, "clientHeight", null)
      
      inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      inline def setClientWidthNull: Self = StObject.set(x, "clientWidth", null)
      
      inline def setColGroupNode(value: VNode[js.Object]): Self = StObject.set(x, "colGroupNode", value.asInstanceOf[js.Any])
      
      inline def setDateProfile(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any
      ): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
      
      inline def setDateSelection(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateSpan */ Any
      ): Self = StObject.set(x, "dateSelection", value.asInstanceOf[js.Any])
      
      inline def setDateSelectionNull: Self = StObject.set(x, "dateSelection", null)
      
      inline def setDayMaxEventRows(value: Boolean | Double): Self = StObject.set(x, "dayMaxEventRows", value.asInstanceOf[js.Any])
      
      inline def setDayMaxEvents(value: Boolean | Double): Self = StObject.set(x, "dayMaxEvents", value.asInstanceOf[js.Any])
      
      inline def setDayTableModel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableModel */ Any
      ): Self = StObject.set(x, "dayTableModel", value.asInstanceOf[js.Any])
      
      inline def setEventDrag(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInteractionState */ Any
      ): Self = StObject.set(x, "eventDrag", value.asInstanceOf[js.Any])
      
      inline def setEventDragNull: Self = StObject.set(x, "eventDrag", null)
      
      inline def setEventResize(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInteractionState */ Any
      ): Self = StObject.set(x, "eventResize", value.asInstanceOf[js.Any])
      
      inline def setEventResizeNull: Self = StObject.set(x, "eventResize", null)
      
      inline def setEventSelection(value: String): Self = StObject.set(x, "eventSelection", value.asInstanceOf[js.Any])
      
      inline def setEventStore(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStore */ Any
      ): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
      
      inline def setEventUiBases(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventUiHash */ Any
      ): Self = StObject.set(x, "eventUiBases", value.asInstanceOf[js.Any])
      
      inline def setExpandRows(value: Boolean): Self = StObject.set(x, "expandRows", value.asInstanceOf[js.Any])
      
      inline def setForPrint(value: Boolean): Self = StObject.set(x, "forPrint", value.asInstanceOf[js.Any])
      
      inline def setHeaderAlignElRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "headerAlignElRef", value.asInstanceOf[js.Any])
      
      inline def setHeaderAlignElRefUndefined: Self = StObject.set(x, "headerAlignElRef", js.undefined)
      
      inline def setNextDayThreshold(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
      ): Self = StObject.set(x, "nextDayThreshold", value.asInstanceOf[js.Any])
      
      inline def setRenderRowIntro(value: () => VNode[js.Object]): Self = StObject.set(x, "renderRowIntro", js.Any.fromFunction0(value))
      
      inline def setRenderRowIntroUndefined: Self = StObject.set(x, "renderRowIntro", js.undefined)
      
      inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      inline def setTableMinWidth(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any
      ): Self = StObject.set(x, "tableMinWidth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DayTableView
    extends TableView[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary */ Any
        ] {
    
    /* private */ var buildDayTableModel: Any = js.native
    
    /* private */ var headerRef: Any = js.native
    
    def render(): Element = js.native
    
    /* private */ var tableRef: Any = js.native
  }
  
  trait TableProps
    extends StObject
       with TableRowsProps {
    
    var colGroupNode: VNode[js.Object]
    
    var expandRows: Boolean
    
    var headerAlignElRef: js.UndefOr[RefObject[HTMLElement]] = js.undefined
    
    var tableMinWidth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any
  }
  object TableProps {
    
    inline def apply(
      bgEventSegs: js.Array[TableSeg],
      businessHourSegs: js.Array[TableSeg],
      cells: js.Array[
          js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableCell */ Any
          ]
        ],
      colGroupNode: VNode[js.Object],
      dateProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any,
      dateSelectionSegs: js.Array[TableSeg],
      dayMaxEventRows: Boolean | Double,
      dayMaxEvents: Boolean | Double,
      eventSelection: String,
      expandRows: Boolean,
      fgEventSegs: js.Array[TableSeg],
      forPrint: Boolean,
      showWeekNumbers: Boolean,
      tableMinWidth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any
    ): TableProps = {
      val __obj = js.Dynamic.literal(bgEventSegs = bgEventSegs.asInstanceOf[js.Any], businessHourSegs = businessHourSegs.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], colGroupNode = colGroupNode.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], dateSelectionSegs = dateSelectionSegs.asInstanceOf[js.Any], dayMaxEventRows = dayMaxEventRows.asInstanceOf[js.Any], dayMaxEvents = dayMaxEvents.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], expandRows = expandRows.asInstanceOf[js.Any], fgEventSegs = fgEventSegs.asInstanceOf[js.Any], forPrint = forPrint.asInstanceOf[js.Any], showWeekNumbers = showWeekNumbers.asInstanceOf[js.Any], tableMinWidth = tableMinWidth.asInstanceOf[js.Any], clientHeight = null, clientWidth = null, eventDrag = null, eventResize = null)
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      inline def setColGroupNode(value: VNode[js.Object]): Self = StObject.set(x, "colGroupNode", value.asInstanceOf[js.Any])
      
      inline def setExpandRows(value: Boolean): Self = StObject.set(x, "expandRows", value.asInstanceOf[js.Any])
      
      inline def setHeaderAlignElRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "headerAlignElRef", value.asInstanceOf[js.Any])
      
      inline def setHeaderAlignElRefUndefined: Self = StObject.set(x, "headerAlignElRef", js.undefined)
      
      inline def setTableMinWidth(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any
      ): Self = StObject.set(x, "tableMinWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableRowsProps extends StObject {
    
    var bgEventSegs: js.Array[TableSeg]
    
    var businessHourSegs: js.Array[TableSeg]
    
    var cells: js.Array[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableCell */ Any
        ]
      ]
    
    var clientHeight: Double | Null
    
    var clientWidth: Double | Null
    
    var dateProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any
    
    var dateSelectionSegs: js.Array[TableSeg]
    
    var dayMaxEventRows: Boolean | Double
    
    var dayMaxEvents: Boolean | Double
    
    var eventDrag: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventSegUiInteractionState */ Any) | Null
    
    var eventResize: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventSegUiInteractionState */ Any) | Null
    
    var eventSelection: String
    
    var fgEventSegs: js.Array[TableSeg]
    
    var forPrint: Boolean
    
    var isHitComboAllowed: js.UndefOr[
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hit */ /* hit0 */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hit */ /* hit1 */ Any, 
          Boolean
        ]
      ] = js.undefined
    
    var renderRowIntro: js.UndefOr[js.Function0[VNode[js.Object]]] = js.undefined
    
    var showWeekNumbers: Boolean
  }
  object TableRowsProps {
    
    inline def apply(
      bgEventSegs: js.Array[TableSeg],
      businessHourSegs: js.Array[TableSeg],
      cells: js.Array[
          js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableCell */ Any
          ]
        ],
      dateProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any,
      dateSelectionSegs: js.Array[TableSeg],
      dayMaxEventRows: Boolean | Double,
      dayMaxEvents: Boolean | Double,
      eventSelection: String,
      fgEventSegs: js.Array[TableSeg],
      forPrint: Boolean,
      showWeekNumbers: Boolean
    ): TableRowsProps = {
      val __obj = js.Dynamic.literal(bgEventSegs = bgEventSegs.asInstanceOf[js.Any], businessHourSegs = businessHourSegs.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], dateSelectionSegs = dateSelectionSegs.asInstanceOf[js.Any], dayMaxEventRows = dayMaxEventRows.asInstanceOf[js.Any], dayMaxEvents = dayMaxEvents.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], fgEventSegs = fgEventSegs.asInstanceOf[js.Any], forPrint = forPrint.asInstanceOf[js.Any], showWeekNumbers = showWeekNumbers.asInstanceOf[js.Any], clientHeight = null, clientWidth = null, eventDrag = null, eventResize = null)
      __obj.asInstanceOf[TableRowsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowsProps] (val x: Self) extends AnyVal {
      
      inline def setBgEventSegs(value: js.Array[TableSeg]): Self = StObject.set(x, "bgEventSegs", value.asInstanceOf[js.Any])
      
      inline def setBgEventSegsVarargs(value: TableSeg*): Self = StObject.set(x, "bgEventSegs", js.Array(value*))
      
      inline def setBusinessHourSegs(value: js.Array[TableSeg]): Self = StObject.set(x, "businessHourSegs", value.asInstanceOf[js.Any])
      
      inline def setBusinessHourSegsVarargs(value: TableSeg*): Self = StObject.set(x, "businessHourSegs", js.Array(value*))
      
      inline def setCells(
        value: js.Array[
              js.Array[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableCell */ Any
              ]
            ]
      ): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsVarargs(
        value: (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableCell */ Any
            ])*
      ): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setClientHeightNull: Self = StObject.set(x, "clientHeight", null)
      
      inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      inline def setClientWidthNull: Self = StObject.set(x, "clientWidth", null)
      
      inline def setDateProfile(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any
      ): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
      
      inline def setDateSelectionSegs(value: js.Array[TableSeg]): Self = StObject.set(x, "dateSelectionSegs", value.asInstanceOf[js.Any])
      
      inline def setDateSelectionSegsVarargs(value: TableSeg*): Self = StObject.set(x, "dateSelectionSegs", js.Array(value*))
      
      inline def setDayMaxEventRows(value: Boolean | Double): Self = StObject.set(x, "dayMaxEventRows", value.asInstanceOf[js.Any])
      
      inline def setDayMaxEvents(value: Boolean | Double): Self = StObject.set(x, "dayMaxEvents", value.asInstanceOf[js.Any])
      
      inline def setEventDrag(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventSegUiInteractionState */ Any
      ): Self = StObject.set(x, "eventDrag", value.asInstanceOf[js.Any])
      
      inline def setEventDragNull: Self = StObject.set(x, "eventDrag", null)
      
      inline def setEventResize(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventSegUiInteractionState */ Any
      ): Self = StObject.set(x, "eventResize", value.asInstanceOf[js.Any])
      
      inline def setEventResizeNull: Self = StObject.set(x, "eventResize", null)
      
      inline def setEventSelection(value: String): Self = StObject.set(x, "eventSelection", value.asInstanceOf[js.Any])
      
      inline def setFgEventSegs(value: js.Array[TableSeg]): Self = StObject.set(x, "fgEventSegs", value.asInstanceOf[js.Any])
      
      inline def setFgEventSegsVarargs(value: TableSeg*): Self = StObject.set(x, "fgEventSegs", js.Array(value*))
      
      inline def setForPrint(value: Boolean): Self = StObject.set(x, "forPrint", value.asInstanceOf[js.Any])
      
      inline def setIsHitComboAllowed(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hit */ /* hit0 */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hit */ /* hit1 */ Any) => Boolean
      ): Self = StObject.set(x, "isHitComboAllowed", js.Any.fromFunction2(value))
      
      inline def setIsHitComboAllowedUndefined: Self = StObject.set(x, "isHitComboAllowed", js.undefined)
      
      inline def setRenderRowIntro(value: () => VNode[js.Object]): Self = StObject.set(x, "renderRowIntro", js.Any.fromFunction0(value))
      
      inline def setRenderRowIntroUndefined: Self = StObject.set(x, "renderRowIntro", js.undefined)
      
      inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Seg * / any */ trait TableSeg extends StObject {
    
    var firstCol: Double
    
    var lastCol: Double
    
    var row: Double
  }
  object TableSeg {
    
    inline def apply(firstCol: Double, lastCol: Double, row: Double): TableSeg = {
      val __obj = js.Dynamic.literal(firstCol = firstCol.asInstanceOf[js.Any], lastCol = lastCol.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableSeg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableSeg] (val x: Self) extends AnyVal {
      
      inline def setFirstCol(value: Double): Self = StObject.set(x, "firstCol", value.asInstanceOf[js.Any])
      
      inline def setLastCol(value: Double): Self = StObject.set(x, "lastCol", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
}
