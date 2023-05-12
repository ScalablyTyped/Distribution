package typings.fullcalendarTimegrid

import typings.fullcalendarTimegrid.anon.AllDay
import typings.fullcalendarTimegrid.anon.DayMaxEventRows
import typings.fullcalendarTimegrid.anon.SlatCoords
import typings.fullcalendarTimegrid.fullcalendarTimegridStrings.day
import typings.preact.mod.RefObject
import typings.preact.mod.VNode
import typings.preact.mod.createElement.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalMod {
  
  @JSImport("@fullcalendar/timegrid/internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<DayTimeColsProps> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<DayTimeColsProps> * / any */ @JSImport("@fullcalendar/timegrid/internal", "DayTimeCols")
  @js.native
  open class DayTimeCols () extends StObject {
    
    /* private */ var buildDayRanges: Any = js.native
    
    def render(): Element = js.native
    
    /* private */ var slicer: Any = js.native
    
    /* private */ var timeColsRef: Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slicer<TimeColsSeg, [Array<DateRange>]> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slicer<TimeColsSeg, [Array<DateRange>]> * / any */ @JSImport("@fullcalendar/timegrid/internal", "DayTimeColsSlicer")
  @js.native
  open class DayTimeColsSlicer () extends StObject {
    
    def sliceRange(
      range: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any,
      dayRanges: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any
        ]
    ): js.Array[TimeColsSeg] = js.native
  }
  
  @JSImport("@fullcalendar/timegrid/internal", "DayTimeColsView")
  @js.native
  open class DayTimeColsView () extends TimeColsView {
    
    /* private */ var buildSlatMetas: Any = js.native
    
    /* private */ var buildTimeColsModel: Any = js.native
    
    def render(): Element = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<TimeColsProps, TimeColsState> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<TimeColsProps, TimeColsState> * / any */ @JSImport("@fullcalendar/timegrid/internal", "TimeCols")
  @js.native
  open class TimeCols () extends StObject {
    
    /* private */ var colCoords: Any = js.native
    
    def componentDidMount(): Unit = js.native
    
    def componentDidUpdate(prevProps: TimeColsProps): Unit = js.native
    
    def componentWillUnmount(): Unit = js.native
    
    def handleColCoords(): Unit = js.native
    def handleColCoords(
      colCoords: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositionCache */ Any
    ): Unit = js.native
    
    def handleRootEl(): Unit = js.native
    def handleRootEl(el: HTMLElement): Unit = js.native
    
    def handleScrollRequest(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScrollRequest */ Any
    ): Boolean = js.native
    
    def handleSlatCoords(): Unit = js.native
    def handleSlatCoords(slatCoords: TimeColsSlatsCoords): Unit = js.native
    
    /* private */ var processSlotOptions: Any = js.native
    
    def queryHit(positionLeft: Double, positionTop: Double): Any = js.native
    
    def render(): Element = js.native
    
    /* private */ var scrollResponder: Any = js.native
    
    var state: SlatCoords = js.native
  }
  
  @JSImport("@fullcalendar/timegrid/internal", "TimeColsSlatsCoords")
  @js.native
  open class TimeColsSlatsCoords protected () extends StObject {
    def this(
      positions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositionCache */ Any,
      dateProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any,
      slotDuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
    ) = this()
    
    def computeDateTop(
      when: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any
    ): Double = js.native
    def computeDateTop(
      when: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any,
      startOfDayDate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any
    ): Double = js.native
    
    def computeTimeTop(
      duration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
    ): Double = js.native
    
    /* private */ var dateProfile: Any = js.native
    
    var positions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositionCache */ Any = js.native
    
    def safeComputeTop(
      date: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any
    ): Double = js.native
    
    /* private */ var slotDuration: Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<ViewProps, TimeColsViewState> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateComponent<ViewProps, TimeColsViewState> * / any */ /* note: abstract class */ @JSImport("@fullcalendar/timegrid/internal", "TimeColsView")
  @js.native
  open class TimeColsView () extends StObject {
    
    /* protected */ var allDaySplitter: AllDaySplitter = js.native
    
    def getAllDayMaxEventProps(): DayMaxEventRows = js.native
    
    def handleScrollTopRequest(scrollTop: Double): Unit = js.native
    
    def handleSlatCoords(slatCoords: TimeColsSlatsCoords): Unit = js.native
    
    /* protected */ var headerElRef: RefObject[HTMLTableCellElement] = js.native
    
    def renderHScrollLayout(
      headerRowContent: Null,
      allDayContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      timeContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta]
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: Null,
      allDayContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      timeContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta],
      slatCoords: TimeColsSlatsCoords
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: Null,
      allDayContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      timeContent: Null,
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta]
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: Null,
      allDayContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      timeContent: Null,
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta],
      slatCoords: TimeColsSlatsCoords
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: Null,
      allDayContent: Null,
      timeContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta]
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: Null,
      allDayContent: Null,
      timeContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta],
      slatCoords: TimeColsSlatsCoords
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: Null,
      allDayContent: Null,
      timeContent: Null,
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta]
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: Null,
      allDayContent: Null,
      timeContent: Null,
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta],
      slatCoords: TimeColsSlatsCoords
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: VNode[js.Object],
      allDayContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      timeContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta]
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: VNode[js.Object],
      allDayContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      timeContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta],
      slatCoords: TimeColsSlatsCoords
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: VNode[js.Object],
      allDayContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      timeContent: Null,
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta]
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: VNode[js.Object],
      allDayContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      timeContent: Null,
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta],
      slatCoords: TimeColsSlatsCoords
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: VNode[js.Object],
      allDayContent: Null,
      timeContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta]
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: VNode[js.Object],
      allDayContent: Null,
      timeContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta],
      slatCoords: TimeColsSlatsCoords
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: VNode[js.Object],
      allDayContent: Null,
      timeContent: Null,
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta]
    ): Element = js.native
    def renderHScrollLayout(
      headerRowContent: VNode[js.Object],
      allDayContent: Null,
      timeContent: Null,
      colCnt: Double,
      dayMinWidth: Double,
      slatMetas: js.Array[TimeSlatMeta],
      slatCoords: TimeColsSlatsCoords
    ): Element = js.native
    
    def renderHeadAxis(rowKey: String): Element = js.native
    def renderHeadAxis(
      rowKey: String,
      frameHeight: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any
    ): Element = js.native
    @JSName("renderHeadAxis")
    def renderHeadAxis_day(rowKey: day): Element = js.native
    @JSName("renderHeadAxis")
    def renderHeadAxis_day(
      rowKey: day,
      frameHeight: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any
    ): Element = js.native
    
    def renderSimpleLayout(): Element = js.native
    def renderSimpleLayout(
      headerRowContent: Null,
      allDayContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ]
    ): Element = js.native
    def renderSimpleLayout(
      headerRowContent: Null,
      allDayContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      timeContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ]
    ): Element = js.native
    def renderSimpleLayout(
      headerRowContent: Null,
      allDayContent: Null,
      timeContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ]
    ): Element = js.native
    def renderSimpleLayout(headerRowContent: VNode[js.Object]): Element = js.native
    def renderSimpleLayout(
      headerRowContent: VNode[js.Object],
      allDayContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ]
    ): Element = js.native
    def renderSimpleLayout(
      headerRowContent: VNode[js.Object],
      allDayContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ],
      timeContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ]
    ): Element = js.native
    def renderSimpleLayout(
      headerRowContent: VNode[js.Object],
      allDayContent: Null,
      timeContent: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChunkContentCallbackArgs */ /* contentArg */ Any, 
          VNode[js.Object]
        ]
    ): Element = js.native
    
    def renderTableRowAxis(): Element = js.native
    def renderTableRowAxis(rowHeight: Double): Element = js.native
    
    /* private */ var rootElRef: Any = js.native
    
    /* private */ var scrollerElRef: Any = js.native
    
    var state: SlatCoords = js.native
  }
  
  inline def buildDayRanges(
    dayTableModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableModel */ Any,
    dateProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any,
    dateEnv: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateEnv */ Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDayRanges")(dayTableModel.asInstanceOf[js.Any], dateProfile.asInstanceOf[js.Any], dateEnv.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any
  ]]
  
  inline def buildSlatMetas(
    slotMinTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any,
    slotMaxTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any,
    explicitLabelInterval: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any,
    slotDuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any,
    dateEnv: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateEnv */ Any
  ): js.Array[TimeSlatMeta] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSlatMetas")(slotMinTime.asInstanceOf[js.Any], slotMaxTime.asInstanceOf[js.Any], explicitLabelInterval.asInstanceOf[js.Any], slotDuration.asInstanceOf[js.Any], dateEnv.asInstanceOf[js.Any])).asInstanceOf[js.Array[TimeSlatMeta]]
  inline def buildSlatMetas(
    slotMinTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any,
    slotMaxTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any,
    explicitLabelInterval: Null,
    slotDuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any,
    dateEnv: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateEnv */ Any
  ): js.Array[TimeSlatMeta] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSlatMetas")(slotMinTime.asInstanceOf[js.Any], slotMaxTime.asInstanceOf[js.Any], explicitLabelInterval.asInstanceOf[js.Any], slotDuration.asInstanceOf[js.Any], dateEnv.asInstanceOf[js.Any])).asInstanceOf[js.Array[TimeSlatMeta]]
  
  inline def buildTimeColsModel(
    dateProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any,
    dateProfileGenerator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfileGenerator */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("buildTimeColsModel")(dateProfile.asInstanceOf[js.Any], dateProfileGenerator.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Splitter * / any */ trait AllDaySplitter extends StObject {
    
    def getKeyInfo(): AllDay
    
    def getKeysForDateSpan(
      dateSpan: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateSpan */ Any
    ): js.Array[String]
    
    def getKeysForEventDef(
      eventDef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDef */ Any
    ): js.Array[String]
  }
  object AllDaySplitter {
    
    inline def apply(
      getKeyInfo: () => AllDay,
      getKeysForDateSpan: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateSpan */ Any => js.Array[String],
      getKeysForEventDef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDef */ Any => js.Array[String]
    ): AllDaySplitter = {
      val __obj = js.Dynamic.literal(getKeyInfo = js.Any.fromFunction0(getKeyInfo), getKeysForDateSpan = js.Any.fromFunction1(getKeysForDateSpan), getKeysForEventDef = js.Any.fromFunction1(getKeysForEventDef))
      __obj.asInstanceOf[AllDaySplitter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllDaySplitter] (val x: Self) extends AnyVal {
      
      inline def setGetKeyInfo(value: () => AllDay): Self = StObject.set(x, "getKeyInfo", js.Any.fromFunction0(value))
      
      inline def setGetKeysForDateSpan(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateSpan */ Any => js.Array[String]
      ): Self = StObject.set(x, "getKeysForDateSpan", js.Any.fromFunction1(value))
      
      inline def setGetKeysForEventDef(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDef */ Any => js.Array[String]
      ): Self = StObject.set(x, "getKeysForEventDef", js.Any.fromFunction1(value))
    }
  }
  
  trait DayTimeColsProps extends StObject {
    
    var axis: Boolean
    
    var businessHours: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStore */ Any
    
    var clientHeight: Double | Null
    
    var clientWidth: Double | Null
    
    var dateProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any
    
    var dateSelection: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateSpan */ Any) | Null
    
    var dayTableModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableModel */ Any
    
    var eventDrag: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInteractionState */ Any) | Null
    
    var eventResize: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInteractionState */ Any) | Null
    
    var eventSelection: String
    
    var eventStore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStore */ Any
    
    var eventUiBases: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventUiHash */ Any
    
    var expandRows: Boolean
    
    var forPrint: Boolean
    
    var onScrollTopRequest: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.undefined
    
    var onSlatCoords: js.UndefOr[js.Function1[/* slatCoords */ TimeColsSlatsCoords, Unit]] = js.undefined
    
    var slatMetas: js.Array[TimeSlatMeta]
    
    var slotDuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
    
    var tableColGroupNode: VNode[js.Object]
    
    var tableMinWidth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any
  }
  object DayTimeColsProps {
    
    inline def apply(
      axis: Boolean,
      businessHours: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStore */ Any,
      dateProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any,
      dayTableModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableModel */ Any,
      eventSelection: String,
      eventStore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStore */ Any,
      eventUiBases: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventUiHash */ Any,
      expandRows: Boolean,
      forPrint: Boolean,
      slatMetas: js.Array[TimeSlatMeta],
      slotDuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any,
      tableColGroupNode: VNode[js.Object],
      tableMinWidth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any
    ): DayTimeColsProps = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], businessHours = businessHours.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], dayTableModel = dayTableModel.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], eventStore = eventStore.asInstanceOf[js.Any], eventUiBases = eventUiBases.asInstanceOf[js.Any], expandRows = expandRows.asInstanceOf[js.Any], forPrint = forPrint.asInstanceOf[js.Any], slatMetas = slatMetas.asInstanceOf[js.Any], slotDuration = slotDuration.asInstanceOf[js.Any], tableColGroupNode = tableColGroupNode.asInstanceOf[js.Any], tableMinWidth = tableMinWidth.asInstanceOf[js.Any], clientHeight = null, clientWidth = null, dateSelection = null, eventDrag = null, eventResize = null)
      __obj.asInstanceOf[DayTimeColsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DayTimeColsProps] (val x: Self) extends AnyVal {
      
      inline def setAxis(value: Boolean): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setBusinessHours(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStore */ Any
      ): Self = StObject.set(x, "businessHours", value.asInstanceOf[js.Any])
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setClientHeightNull: Self = StObject.set(x, "clientHeight", null)
      
      inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      inline def setClientWidthNull: Self = StObject.set(x, "clientWidth", null)
      
      inline def setDateProfile(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any
      ): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
      
      inline def setDateSelection(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateSpan */ Any
      ): Self = StObject.set(x, "dateSelection", value.asInstanceOf[js.Any])
      
      inline def setDateSelectionNull: Self = StObject.set(x, "dateSelection", null)
      
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
      
      inline def setOnScrollTopRequest(value: /* scrollTop */ Double => Unit): Self = StObject.set(x, "onScrollTopRequest", js.Any.fromFunction1(value))
      
      inline def setOnScrollTopRequestUndefined: Self = StObject.set(x, "onScrollTopRequest", js.undefined)
      
      inline def setOnSlatCoords(value: /* slatCoords */ TimeColsSlatsCoords => Unit): Self = StObject.set(x, "onSlatCoords", js.Any.fromFunction1(value))
      
      inline def setOnSlatCoordsUndefined: Self = StObject.set(x, "onSlatCoords", js.undefined)
      
      inline def setSlatMetas(value: js.Array[TimeSlatMeta]): Self = StObject.set(x, "slatMetas", value.asInstanceOf[js.Any])
      
      inline def setSlatMetasVarargs(value: TimeSlatMeta*): Self = StObject.set(x, "slatMetas", js.Array(value*))
      
      inline def setSlotDuration(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
      ): Self = StObject.set(x, "slotDuration", value.asInstanceOf[js.Any])
      
      inline def setTableColGroupNode(value: VNode[js.Object]): Self = StObject.set(x, "tableColGroupNode", value.asInstanceOf[js.Any])
      
      inline def setTableMinWidth(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any
      ): Self = StObject.set(x, "tableMinWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeColsProps extends StObject {
    
    var axis: Boolean
    
    var bgEventSegs: js.Array[TimeColsSeg]
    
    var businessHourSegs: js.Array[TimeColsSeg]
    
    var cells: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableCell */ Any
      ]
    
    var clientHeight: Double | Null
    
    var clientWidth: Double | Null
    
    var dateProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any
    
    var dateSelectionSegs: js.Array[TimeColsSeg]
    
    var eventDrag: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventSegUiInteractionState */ Any) | Null
    
    var eventResize: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventSegUiInteractionState */ Any) | Null
    
    var eventSelection: String
    
    var expandRows: Boolean
    
    var fgEventSegs: js.Array[TimeColsSeg]
    
    var forPrint: Boolean
    
    var isHitComboAllowed: js.UndefOr[
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hit */ /* hit0 */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hit */ /* hit1 */ Any, 
          Boolean
        ]
      ] = js.undefined
    
    var nowDate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any
    
    var nowIndicatorSegs: js.Array[TimeColsSeg]
    
    var onScrollTopRequest: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.undefined
    
    var onSlatCoords: js.UndefOr[js.Function1[/* slatCoords */ TimeColsSlatsCoords, Unit]] = js.undefined
    
    var slatMetas: js.Array[TimeSlatMeta]
    
    var slotDuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
    
    var tableColGroupNode: VNode[js.Object]
    
    var tableMinWidth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any
    
    var todayRange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any
  }
  object TimeColsProps {
    
    inline def apply(
      axis: Boolean,
      bgEventSegs: js.Array[TimeColsSeg],
      businessHourSegs: js.Array[TimeColsSeg],
      cells: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableCell */ Any
        ],
      dateProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any,
      dateSelectionSegs: js.Array[TimeColsSeg],
      eventSelection: String,
      expandRows: Boolean,
      fgEventSegs: js.Array[TimeColsSeg],
      forPrint: Boolean,
      nowDate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any,
      nowIndicatorSegs: js.Array[TimeColsSeg],
      slatMetas: js.Array[TimeSlatMeta],
      slotDuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any,
      tableColGroupNode: VNode[js.Object],
      tableMinWidth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any,
      todayRange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any
    ): TimeColsProps = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], bgEventSegs = bgEventSegs.asInstanceOf[js.Any], businessHourSegs = businessHourSegs.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], dateSelectionSegs = dateSelectionSegs.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], expandRows = expandRows.asInstanceOf[js.Any], fgEventSegs = fgEventSegs.asInstanceOf[js.Any], forPrint = forPrint.asInstanceOf[js.Any], nowDate = nowDate.asInstanceOf[js.Any], nowIndicatorSegs = nowIndicatorSegs.asInstanceOf[js.Any], slatMetas = slatMetas.asInstanceOf[js.Any], slotDuration = slotDuration.asInstanceOf[js.Any], tableColGroupNode = tableColGroupNode.asInstanceOf[js.Any], tableMinWidth = tableMinWidth.asInstanceOf[js.Any], todayRange = todayRange.asInstanceOf[js.Any], clientHeight = null, clientWidth = null, eventDrag = null, eventResize = null)
      __obj.asInstanceOf[TimeColsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeColsProps] (val x: Self) extends AnyVal {
      
      inline def setAxis(value: Boolean): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setBgEventSegs(value: js.Array[TimeColsSeg]): Self = StObject.set(x, "bgEventSegs", value.asInstanceOf[js.Any])
      
      inline def setBgEventSegsVarargs(value: TimeColsSeg*): Self = StObject.set(x, "bgEventSegs", js.Array(value*))
      
      inline def setBusinessHourSegs(value: js.Array[TimeColsSeg]): Self = StObject.set(x, "businessHourSegs", value.asInstanceOf[js.Any])
      
      inline def setBusinessHourSegsVarargs(value: TimeColsSeg*): Self = StObject.set(x, "businessHourSegs", js.Array(value*))
      
      inline def setCells(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableCell */ Any
            ]
      ): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayTableCell */ Any)*
      ): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setClientHeightNull: Self = StObject.set(x, "clientHeight", null)
      
      inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      inline def setClientWidthNull: Self = StObject.set(x, "clientWidth", null)
      
      inline def setDateProfile(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateProfile */ Any
      ): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
      
      inline def setDateSelectionSegs(value: js.Array[TimeColsSeg]): Self = StObject.set(x, "dateSelectionSegs", value.asInstanceOf[js.Any])
      
      inline def setDateSelectionSegsVarargs(value: TimeColsSeg*): Self = StObject.set(x, "dateSelectionSegs", js.Array(value*))
      
      inline def setEventDrag(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventSegUiInteractionState */ Any
      ): Self = StObject.set(x, "eventDrag", value.asInstanceOf[js.Any])
      
      inline def setEventDragNull: Self = StObject.set(x, "eventDrag", null)
      
      inline def setEventResize(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventSegUiInteractionState */ Any
      ): Self = StObject.set(x, "eventResize", value.asInstanceOf[js.Any])
      
      inline def setEventResizeNull: Self = StObject.set(x, "eventResize", null)
      
      inline def setEventSelection(value: String): Self = StObject.set(x, "eventSelection", value.asInstanceOf[js.Any])
      
      inline def setExpandRows(value: Boolean): Self = StObject.set(x, "expandRows", value.asInstanceOf[js.Any])
      
      inline def setFgEventSegs(value: js.Array[TimeColsSeg]): Self = StObject.set(x, "fgEventSegs", value.asInstanceOf[js.Any])
      
      inline def setFgEventSegsVarargs(value: TimeColsSeg*): Self = StObject.set(x, "fgEventSegs", js.Array(value*))
      
      inline def setForPrint(value: Boolean): Self = StObject.set(x, "forPrint", value.asInstanceOf[js.Any])
      
      inline def setIsHitComboAllowed(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hit */ /* hit0 */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hit */ /* hit1 */ Any) => Boolean
      ): Self = StObject.set(x, "isHitComboAllowed", js.Any.fromFunction2(value))
      
      inline def setIsHitComboAllowedUndefined: Self = StObject.set(x, "isHitComboAllowed", js.undefined)
      
      inline def setNowDate(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any
      ): Self = StObject.set(x, "nowDate", value.asInstanceOf[js.Any])
      
      inline def setNowIndicatorSegs(value: js.Array[TimeColsSeg]): Self = StObject.set(x, "nowIndicatorSegs", value.asInstanceOf[js.Any])
      
      inline def setNowIndicatorSegsVarargs(value: TimeColsSeg*): Self = StObject.set(x, "nowIndicatorSegs", js.Array(value*))
      
      inline def setOnScrollTopRequest(value: /* scrollTop */ Double => Unit): Self = StObject.set(x, "onScrollTopRequest", js.Any.fromFunction1(value))
      
      inline def setOnScrollTopRequestUndefined: Self = StObject.set(x, "onScrollTopRequest", js.undefined)
      
      inline def setOnSlatCoords(value: /* slatCoords */ TimeColsSlatsCoords => Unit): Self = StObject.set(x, "onSlatCoords", js.Any.fromFunction1(value))
      
      inline def setOnSlatCoordsUndefined: Self = StObject.set(x, "onSlatCoords", js.undefined)
      
      inline def setSlatMetas(value: js.Array[TimeSlatMeta]): Self = StObject.set(x, "slatMetas", value.asInstanceOf[js.Any])
      
      inline def setSlatMetasVarargs(value: TimeSlatMeta*): Self = StObject.set(x, "slatMetas", js.Array(value*))
      
      inline def setSlotDuration(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
      ): Self = StObject.set(x, "slotDuration", value.asInstanceOf[js.Any])
      
      inline def setTableColGroupNode(value: VNode[js.Object]): Self = StObject.set(x, "tableColGroupNode", value.asInstanceOf[js.Any])
      
      inline def setTableMinWidth(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssDimValue */ Any
      ): Self = StObject.set(x, "tableMinWidth", value.asInstanceOf[js.Any])
      
      inline def setTodayRange(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any
      ): Self = StObject.set(x, "todayRange", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Seg * / any */ trait TimeColsSeg extends StObject {
    
    var col: Double
    
    var end: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any
    
    var start: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any
  }
  object TimeColsSeg {
    
    inline def apply(
      col: Double,
      end: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any,
      start: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any
    ): TimeColsSeg = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeColsSeg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeColsSeg] (val x: Self) extends AnyVal {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setEnd(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any
      ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeColsState extends StObject {
    
    var slatCoords: TimeColsSlatsCoords | Null
  }
  object TimeColsState {
    
    inline def apply(): TimeColsState = {
      val __obj = js.Dynamic.literal(slatCoords = null)
      __obj.asInstanceOf[TimeColsState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeColsState] (val x: Self) extends AnyVal {
      
      inline def setSlatCoords(value: TimeColsSlatsCoords): Self = StObject.set(x, "slatCoords", value.asInstanceOf[js.Any])
      
      inline def setSlatCoordsNull: Self = StObject.set(x, "slatCoords", null)
    }
  }
  
  trait TimeColsViewState extends StObject {
    
    var slatCoords: TimeColsSlatsCoords | Null
  }
  object TimeColsViewState {
    
    inline def apply(): TimeColsViewState = {
      val __obj = js.Dynamic.literal(slatCoords = null)
      __obj.asInstanceOf[TimeColsViewState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeColsViewState] (val x: Self) extends AnyVal {
      
      inline def setSlatCoords(value: TimeColsSlatsCoords): Self = StObject.set(x, "slatCoords", value.asInstanceOf[js.Any])
      
      inline def setSlatCoordsNull: Self = StObject.set(x, "slatCoords", null)
    }
  }
  
  trait TimeSlatMeta extends StObject {
    
    var date: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any
    
    var isLabeled: Boolean
    
    var isoTimeStr: String
    
    var key: String
    
    var time: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
  }
  object TimeSlatMeta {
    
    inline def apply(
      date: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any,
      isLabeled: Boolean,
      isoTimeStr: String,
      key: String,
      time: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
    ): TimeSlatMeta = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isLabeled = isLabeled.asInstanceOf[js.Any], isoTimeStr = isoTimeStr.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeSlatMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeSlatMeta] (val x: Self) extends AnyVal {
      
      inline def setDate(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateMarker */ Any
      ): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setIsLabeled(value: Boolean): Self = StObject.set(x, "isLabeled", value.asInstanceOf[js.Any])
      
      inline def setIsoTimeStr(value: String): Self = StObject.set(x, "isoTimeStr", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTime(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Duration */ Any
      ): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
