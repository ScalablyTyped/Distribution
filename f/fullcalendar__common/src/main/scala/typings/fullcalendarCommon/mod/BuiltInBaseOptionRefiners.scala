package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.fullcalendarCommon.fullcalendarCommonBooleans.`false`
import typings.fullcalendarCommon.fullcalendarCommonStrings.auto
import typings.fullcalendarCommon.fullcalendarCommonStrings.ltr
import typings.fullcalendarCommon.fullcalendarCommonStrings.rtl
import typings.std.BooleanConstructor
import typings.std.NumberConstructor
import typings.std.StringConstructor
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltInBaseOptionRefiners extends StObject {
  
  def allDayClassNames(raw: ClassNamesGenerator[AllDayContentArg]): ClassNamesGenerator[AllDayContentArg]
  @JSName("allDayClassNames")
  var allDayClassNames_Original: Identity_[ClassNamesGenerator[AllDayContentArg]]
  
  def allDayContent(raw: CustomContentGenerator[AllDayContentArg]): CustomContentGenerator[AllDayContentArg]
  @JSName("allDayContent")
  var allDayContent_Original: Identity_[CustomContentGenerator[AllDayContentArg]]
  
  def allDayDidMount(raw: DidMountHandler[AllDayMountArg]): DidMountHandler[AllDayMountArg]
  @JSName("allDayDidMount")
  var allDayDidMount_Original: Identity_[DidMountHandler[AllDayMountArg]]
  
  /* standard es5 */
  def allDayMaintainDuration[T](): Boolean
  def allDayMaintainDuration[T](value: T): Boolean
  @JSName("allDayMaintainDuration")
  var allDayMaintainDuration_Original: BooleanConstructor
  
  /* standard es5 */
  def allDayText(): String
  def allDayText(value: Any): String
  @JSName("allDayText")
  var allDayText_Original: StringConstructor
  
  def allDayWillUnmount(raw: WillUnmountHandler[AllDayMountArg]): WillUnmountHandler[AllDayMountArg]
  @JSName("allDayWillUnmount")
  var allDayWillUnmount_Original: Identity_[WillUnmountHandler[AllDayMountArg]]
  
  /* standard es5 */
  def aspectRatio(): Double
  def aspectRatio(value: Any): Double
  @JSName("aspectRatio")
  var aspectRatio_Original: NumberConstructor
  
  def bootstrapFontAwesome(raw: ButtonIconsInput): `false` | ButtonIconsInput
  @JSName("bootstrapFontAwesome")
  var bootstrapFontAwesome_Original: Identity_[`false` | ButtonIconsInput]
  @JSName("bootstrapFontAwesome")
  def bootstrapFontAwesome_false(raw: `false`): `false` | ButtonIconsInput
  
  def businessHours(raw: BusinessHoursInput): BusinessHoursInput
  @JSName("businessHours")
  var businessHours_Original: Identity_[BusinessHoursInput]
  
  def buttonIcons(raw: ButtonIconsInput): `false` | ButtonIconsInput
  @JSName("buttonIcons")
  var buttonIcons_Original: Identity_[`false` | ButtonIconsInput]
  @JSName("buttonIcons")
  def buttonIcons_false(raw: `false`): `false` | ButtonIconsInput
  
  /* standard es5 */
  def closeHint(): String
  def closeHint(value: Any): String
  @JSName("closeHint")
  var closeHint_Original: StringConstructor
  
  def contentHeight(raw: CssDimValue): CssDimValue
  @JSName("contentHeight")
  var contentHeight_Original: Identity_[CssDimValue]
  
  def customButtons(raw: StringDictionary[CustomButtonInput]): StringDictionary[CustomButtonInput]
  @JSName("customButtons")
  var customButtons_Original: Identity_[StringDictionary[CustomButtonInput]]
  
  /* standard es5 */
  def dateAlignment(): String
  def dateAlignment(value: Any): String
  @JSName("dateAlignment")
  var dateAlignment_Original: StringConstructor
  
  def dayCellClassNames(raw: ClassNamesGenerator[DayCellContentArg]): ClassNamesGenerator[DayCellContentArg]
  @JSName("dayCellClassNames")
  var dayCellClassNames_Original: Identity_[ClassNamesGenerator[DayCellContentArg]]
  
  def dayCellContent(raw: CustomContentGenerator[DayCellContentArg]): CustomContentGenerator[DayCellContentArg]
  @JSName("dayCellContent")
  var dayCellContent_Original: Identity_[CustomContentGenerator[DayCellContentArg]]
  
  def dayCellDidMount(raw: DidMountHandler[DayCellMountArg]): DidMountHandler[DayCellMountArg]
  @JSName("dayCellDidMount")
  var dayCellDidMount_Original: Identity_[DidMountHandler[DayCellMountArg]]
  
  def dayCellWillUnmount(raw: WillUnmountHandler[DayCellMountArg]): WillUnmountHandler[DayCellMountArg]
  @JSName("dayCellWillUnmount")
  var dayCellWillUnmount_Original: Identity_[WillUnmountHandler[DayCellMountArg]]
  
  /* standard es5 */
  def dayCount(): Double
  def dayCount(value: Any): Double
  @JSName("dayCount")
  var dayCount_Original: NumberConstructor
  
  def dayHeaderClassNames(raw: ClassNamesGenerator[DayHeaderContentArg]): ClassNamesGenerator[DayHeaderContentArg]
  @JSName("dayHeaderClassNames")
  var dayHeaderClassNames_Original: Identity_[ClassNamesGenerator[DayHeaderContentArg]]
  
  def dayHeaderContent(raw: CustomContentGenerator[DayHeaderContentArg]): CustomContentGenerator[DayHeaderContentArg]
  @JSName("dayHeaderContent")
  var dayHeaderContent_Original: Identity_[CustomContentGenerator[DayHeaderContentArg]]
  
  def dayHeaderDidMount(raw: DidMountHandler[DayHeaderMountArg]): DidMountHandler[DayHeaderMountArg]
  @JSName("dayHeaderDidMount")
  var dayHeaderDidMount_Original: Identity_[DidMountHandler[DayHeaderMountArg]]
  
  def dayHeaderWillUnmount(raw: WillUnmountHandler[DayHeaderMountArg]): WillUnmountHandler[DayHeaderMountArg]
  @JSName("dayHeaderWillUnmount")
  var dayHeaderWillUnmount_Original: Identity_[WillUnmountHandler[DayHeaderMountArg]]
  
  /* standard es5 */
  def dayHeaders[T](): Boolean
  def dayHeaders[T](value: T): Boolean
  @JSName("dayHeaders")
  var dayHeaders_Original: BooleanConstructor
  
  def dayMaxEventRows(raw: Boolean): Double | Boolean
  def dayMaxEventRows(raw: Double): Double | Boolean
  @JSName("dayMaxEventRows")
  var dayMaxEventRows_Original: Identity_[Double | Boolean]
  
  def dayMaxEvents(raw: Boolean): Double | Boolean
  def dayMaxEvents(raw: Double): Double | Boolean
  @JSName("dayMaxEvents")
  var dayMaxEvents_Original: Identity_[Double | Boolean]
  
  /* standard es5 */
  def dayMinWidth(): Double
  def dayMinWidth(value: Any): Double
  @JSName("dayMinWidth")
  var dayMinWidth_Original: NumberConstructor
  
  /* standard es5 */
  def defaultAllDay[T](): Boolean
  def defaultAllDay[T](value: T): Boolean
  @JSName("defaultAllDay")
  var defaultAllDay_Original: BooleanConstructor
  
  /* standard es5 */
  def defaultRangeSeparator(): String
  def defaultRangeSeparator(value: Any): String
  @JSName("defaultRangeSeparator")
  var defaultRangeSeparator_Original: StringConstructor
  
  def direction(raw: ltr | rtl): ltr | rtl
  @JSName("direction")
  var direction_Original: Identity_[ltr | rtl]
  
  /* standard es5 */
  def displayEventEnd[T](): Boolean
  def displayEventEnd[T](value: T): Boolean
  @JSName("displayEventEnd")
  var displayEventEnd_Original: BooleanConstructor
  
  /* standard es5 */
  def displayEventTime[T](): Boolean
  def displayEventTime[T](value: T): Boolean
  @JSName("displayEventTime")
  var displayEventTime_Original: BooleanConstructor
  
  /* standard es5 */
  def dragRevertDuration(): Double
  def dragRevertDuration(value: Any): Double
  @JSName("dragRevertDuration")
  var dragRevertDuration_Original: NumberConstructor
  
  /* standard es5 */
  def dragScroll[T](): Boolean
  def dragScroll[T](value: T): Boolean
  @JSName("dragScroll")
  var dragScroll_Original: BooleanConstructor
  
  def dropAccept(raw: String): String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean])
  def dropAccept(raw: js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean]): String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean])
  @JSName("dropAccept")
  var dropAccept_Original: Identity_[
    String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean])
  ]
  
  /* standard es5 */
  def droppable[T](): Boolean
  def droppable[T](value: T): Boolean
  @JSName("droppable")
  var droppable_Original: BooleanConstructor
  
  /* standard es5 */
  def editable[T](): Boolean
  def editable[T](value: T): Boolean
  @JSName("editable")
  var editable_Original: BooleanConstructor
  
  /* standard es5 */
  def endParam(): String
  def endParam(value: Any): String
  @JSName("endParam")
  var endParam_Original: StringConstructor
  
  def eventAllow(raw: AllowFunc): AllowFunc
  @JSName("eventAllow")
  var eventAllow_Original: Identity_[AllowFunc]
  
  /* standard es5 */
  def eventBackgroundColor(): String
  def eventBackgroundColor(value: Any): String
  @JSName("eventBackgroundColor")
  var eventBackgroundColor_Original: StringConstructor
  
  /* standard es5 */
  def eventBorderColor(): String
  def eventBorderColor(value: Any): String
  @JSName("eventBorderColor")
  var eventBorderColor_Original: StringConstructor
  
  def eventClassNames(raw: ClassNamesGenerator[EventContentArg]): ClassNamesGenerator[EventContentArg]
  @JSName("eventClassNames")
  var eventClassNames_Original: Identity_[ClassNamesGenerator[EventContentArg]]
  
  /* standard es5 */
  def eventColor(): String
  def eventColor(value: Any): String
  @JSName("eventColor")
  var eventColor_Original: StringConstructor
  
  def eventConstraint(raw: ConstraintInput): ConstraintInput
  @JSName("eventConstraint")
  var eventConstraint_Original: Identity_[ConstraintInput]
  
  def eventContent(raw: CustomContentGenerator[EventContentArg]): CustomContentGenerator[EventContentArg]
  @JSName("eventContent")
  var eventContent_Original: Identity_[CustomContentGenerator[EventContentArg]]
  
  def eventDataTransform(raw: EventInputTransformer): EventInputTransformer
  @JSName("eventDataTransform")
  var eventDataTransform_Original: Identity_[EventInputTransformer]
  
  def eventDidMount(raw: DidMountHandler[EventMountArg]): DidMountHandler[EventMountArg]
  @JSName("eventDidMount")
  var eventDidMount_Original: Identity_[DidMountHandler[EventMountArg]]
  
  /* standard es5 */
  def eventDisplay(): String
  def eventDisplay(value: Any): String
  @JSName("eventDisplay")
  var eventDisplay_Original: StringConstructor
  
  /* standard es5 */
  def eventDragMinDistance(): Double
  def eventDragMinDistance(value: Any): Double
  @JSName("eventDragMinDistance")
  var eventDragMinDistance_Original: NumberConstructor
  
  /* standard es5 */
  def eventDurationEditable[T](): Boolean
  def eventDurationEditable[T](value: T): Boolean
  @JSName("eventDurationEditable")
  var eventDurationEditable_Original: BooleanConstructor
  
  /* standard es5 */
  def eventHint(): String
  def eventHint(value: Any): String
  @JSName("eventHint")
  var eventHint_Original: StringConstructor
  
  /* standard es5 */
  def eventInteractive[T](): Boolean
  def eventInteractive[T](value: T): Boolean
  @JSName("eventInteractive")
  var eventInteractive_Original: BooleanConstructor
  
  /* standard es5 */
  def eventLongPressDelay(): Double
  def eventLongPressDelay(value: Any): Double
  @JSName("eventLongPressDelay")
  var eventLongPressDelay_Original: NumberConstructor
  
  /* standard es5 */
  def eventMaxStack(): Double
  def eventMaxStack(value: Any): Double
  @JSName("eventMaxStack")
  var eventMaxStack_Original: NumberConstructor
  
  /* standard es5 */
  def eventMinHeight(): Double
  def eventMinHeight(value: Any): Double
  @JSName("eventMinHeight")
  var eventMinHeight_Original: NumberConstructor
  
  /* standard es5 */
  def eventMinWidth(): Double
  def eventMinWidth(value: Any): Double
  @JSName("eventMinWidth")
  var eventMinWidth_Original: NumberConstructor
  
  /* standard es5 */
  def eventOrderStrict[T](): Boolean
  def eventOrderStrict[T](value: T): Boolean
  @JSName("eventOrderStrict")
  var eventOrderStrict_Original: BooleanConstructor
  
  def eventOverlap(raw: Boolean): Boolean | OverlapFunc
  def eventOverlap(raw: OverlapFunc): Boolean | OverlapFunc
  @JSName("eventOverlap")
  var eventOverlap_Original: Identity_[Boolean | OverlapFunc]
  
  /* standard es5 */
  def eventResizableFromStart[T](): Boolean
  def eventResizableFromStart[T](value: T): Boolean
  @JSName("eventResizableFromStart")
  var eventResizableFromStart_Original: BooleanConstructor
  
  /* standard es5 */
  def eventShortHeight(): Double
  def eventShortHeight(value: Any): Double
  @JSName("eventShortHeight")
  var eventShortHeight_Original: NumberConstructor
  
  def eventSourceFailure(raw: js.ThisFunction1[/* this */ CalendarApi, /* error */ Any, Unit]): js.ThisFunction1[/* this */ CalendarApi, /* error */ Any, Unit]
  @JSName("eventSourceFailure")
  var eventSourceFailure_Original: Identity_[js.ThisFunction1[/* this */ CalendarApi, /* error */ Any, Unit]]
  
  def eventSourceSuccess(
    raw: js.ThisFunction2[
      /* this */ CalendarApi, 
      /* eventsInput */ js.Array[EventInput], 
      /* xhr */ js.UndefOr[XMLHttpRequest], 
      js.Array[EventInput] | Unit
    ]
  ): js.ThisFunction2[
    /* this */ CalendarApi, 
    /* eventsInput */ js.Array[EventInput], 
    /* xhr */ js.UndefOr[XMLHttpRequest], 
    js.Array[EventInput] | Unit
  ]
  @JSName("eventSourceSuccess")
  var eventSourceSuccess_Original: Identity_[
    js.ThisFunction2[
      /* this */ CalendarApi, 
      /* eventsInput */ js.Array[EventInput], 
      /* xhr */ js.UndefOr[XMLHttpRequest], 
      js.Array[EventInput] | Unit
    ]
  ]
  
  /* standard es5 */
  def eventStartEditable[T](): Boolean
  def eventStartEditable[T](value: T): Boolean
  @JSName("eventStartEditable")
  var eventStartEditable_Original: BooleanConstructor
  
  /* standard es5 */
  def eventTextColor(): String
  def eventTextColor(value: Any): String
  @JSName("eventTextColor")
  var eventTextColor_Original: StringConstructor
  
  def eventWillUnmount(raw: WillUnmountHandler[EventMountArg]): WillUnmountHandler[EventMountArg]
  @JSName("eventWillUnmount")
  var eventWillUnmount_Original: Identity_[WillUnmountHandler[EventMountArg]]
  
  /* standard es5 */
  def expandRows[T](): Boolean
  def expandRows[T](value: T): Boolean
  @JSName("expandRows")
  var expandRows_Original: BooleanConstructor
  
  /* standard es5 */
  def firstDay(): Double
  def firstDay(value: Any): Double
  @JSName("firstDay")
  var firstDay_Original: NumberConstructor
  
  /* standard es5 */
  def fixedWeekCount[T](): Boolean
  def fixedWeekCount[T](value: T): Boolean
  @JSName("fixedWeekCount")
  var fixedWeekCount_Original: BooleanConstructor
  
  def footerToolbar(raw: ToolbarInput): `false` | ToolbarInput
  @JSName("footerToolbar")
  var footerToolbar_Original: Identity_[`false` | ToolbarInput]
  @JSName("footerToolbar")
  def footerToolbar_false(raw: `false`): `false` | ToolbarInput
  
  /* standard es5 */
  def forceEventDuration[T](): Boolean
  def forceEventDuration[T](value: T): Boolean
  @JSName("forceEventDuration")
  var forceEventDuration_Original: BooleanConstructor
  
  /* standard es5 */
  def handleWindowResize[T](): Boolean
  def handleWindowResize[T](value: T): Boolean
  @JSName("handleWindowResize")
  var handleWindowResize_Original: BooleanConstructor
  
  def headerToolbar(raw: ToolbarInput): `false` | ToolbarInput
  @JSName("headerToolbar")
  var headerToolbar_Original: Identity_[`false` | ToolbarInput]
  @JSName("headerToolbar")
  def headerToolbar_false(raw: `false`): `false` | ToolbarInput
  
  def height(raw: CssDimValue): CssDimValue
  @JSName("height")
  var height_Original: Identity_[CssDimValue]
  
  def hiddenDays(raw: js.Array[Double]): js.Array[Double]
  @JSName("hiddenDays")
  var hiddenDays_Original: Identity_[js.Array[Double]]
  
  def initialDate(raw: DateInput): DateInput
  @JSName("initialDate")
  var initialDate_Original: Identity_[DateInput]
  
  /* standard es5 */
  def initialView(): String
  def initialView(value: Any): String
  @JSName("initialView")
  var initialView_Original: StringConstructor
  
  /* standard es5 */
  def lazyFetching[T](): Boolean
  def lazyFetching[T](value: T): Boolean
  @JSName("lazyFetching")
  var lazyFetching_Original: BooleanConstructor
  
  def locale(raw: LocaleSingularArg): LocaleSingularArg
  @JSName("locale")
  var locale_Original: Identity_[LocaleSingularArg]
  
  def locales(raw: js.Array[LocaleInput]): js.Array[LocaleInput]
  @JSName("locales")
  var locales_Original: Identity_[js.Array[LocaleInput]]
  
  /* standard es5 */
  def longPressDelay(): Double
  def longPressDelay(value: Any): Double
  @JSName("longPressDelay")
  var longPressDelay_Original: NumberConstructor
  
  /* standard es5 */
  def monthMode[T](): Boolean
  def monthMode[T](value: T): Boolean
  @JSName("monthMode")
  var monthMode_Original: BooleanConstructor
  
  def moreLinkClassNames(raw: ClassNamesGenerator[MoreLinkContentArg]): ClassNamesGenerator[MoreLinkContentArg]
  @JSName("moreLinkClassNames")
  var moreLinkClassNames_Original: Identity_[ClassNamesGenerator[MoreLinkContentArg]]
  
  def moreLinkClick(raw: MoreLinkAction): MoreLinkAction
  @JSName("moreLinkClick")
  var moreLinkClick_Original: Identity_[MoreLinkAction]
  
  def moreLinkContent(raw: CustomContentGenerator[MoreLinkContentArg]): CustomContentGenerator[MoreLinkContentArg]
  @JSName("moreLinkContent")
  var moreLinkContent_Original: Identity_[CustomContentGenerator[MoreLinkContentArg]]
  
  def moreLinkDidMount(raw: DidMountHandler[MoreLinkMountArg]): DidMountHandler[MoreLinkMountArg]
  @JSName("moreLinkDidMount")
  var moreLinkDidMount_Original: Identity_[DidMountHandler[MoreLinkMountArg]]
  
  def moreLinkHint(raw: String): String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])
  def moreLinkHint(raw: js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]): String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])
  @JSName("moreLinkHint")
  var moreLinkHint_Original: Identity_[String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])]
  
  def moreLinkText(raw: String): String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])
  def moreLinkText(raw: js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]): String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])
  @JSName("moreLinkText")
  var moreLinkText_Original: Identity_[String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])]
  
  def moreLinkWillUnmount(raw: WillUnmountHandler[MoreLinkMountArg]): WillUnmountHandler[MoreLinkMountArg]
  @JSName("moreLinkWillUnmount")
  var moreLinkWillUnmount_Original: Identity_[WillUnmountHandler[MoreLinkMountArg]]
  
  def navLinkDayClick(raw: String): String | (js.ThisFunction2[
    /* this */ CalendarApi, 
    /* date */ js.Date, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
    Unit
  ])
  def navLinkDayClick(
    raw: js.ThisFunction2[
      /* this */ CalendarApi, 
      /* date */ js.Date, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
      Unit
    ]
  ): String | (js.ThisFunction2[
    /* this */ CalendarApi, 
    /* date */ js.Date, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
    Unit
  ])
  @JSName("navLinkDayClick")
  var navLinkDayClick_Original: Identity_[
    String | (js.ThisFunction2[
      /* this */ CalendarApi, 
      /* date */ js.Date, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
      Unit
    ])
  ]
  
  def navLinkHint(raw: String): String | (js.Function1[/* repeated */ Any, String])
  def navLinkHint(raw: js.Function1[/* repeated */ Any, String]): String | (js.Function1[/* repeated */ Any, String])
  @JSName("navLinkHint")
  var navLinkHint_Original: Identity_[String | (js.Function1[/* repeated */ Any, String])]
  
  def navLinkWeekClick(raw: String): String | (js.ThisFunction2[
    /* this */ CalendarApi, 
    /* weekStart */ js.Date, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
    Unit
  ])
  def navLinkWeekClick(
    raw: js.ThisFunction2[
      /* this */ CalendarApi, 
      /* weekStart */ js.Date, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
      Unit
    ]
  ): String | (js.ThisFunction2[
    /* this */ CalendarApi, 
    /* weekStart */ js.Date, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
    Unit
  ])
  @JSName("navLinkWeekClick")
  var navLinkWeekClick_Original: Identity_[
    String | (js.ThisFunction2[
      /* this */ CalendarApi, 
      /* weekStart */ js.Date, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
      Unit
    ])
  ]
  
  /* standard es5 */
  def navLinks[T](): Boolean
  def navLinks[T](value: T): Boolean
  @JSName("navLinks")
  var navLinks_Original: BooleanConstructor
  
  /* standard es5 */
  def noEventsText(): String
  def noEventsText(value: Any): String
  @JSName("noEventsText")
  var noEventsText_Original: StringConstructor
  
  def now(raw: js.ThisFunction0[/* this */ CalendarApi, DateInput]): DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput])
  def now(raw: DateInput): DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput])
  
  /* standard es5 */
  def nowIndicator[T](): Boolean
  def nowIndicator[T](value: T): Boolean
  
  def nowIndicatorClassNames(raw: ClassNamesGenerator[NowIndicatorContentArg]): ClassNamesGenerator[NowIndicatorContentArg]
  @JSName("nowIndicatorClassNames")
  var nowIndicatorClassNames_Original: Identity_[ClassNamesGenerator[NowIndicatorContentArg]]
  
  def nowIndicatorContent(raw: CustomContentGenerator[NowIndicatorContentArg]): CustomContentGenerator[NowIndicatorContentArg]
  @JSName("nowIndicatorContent")
  var nowIndicatorContent_Original: Identity_[CustomContentGenerator[NowIndicatorContentArg]]
  
  def nowIndicatorDidMount(raw: DidMountHandler[NowIndicatorMountArg]): DidMountHandler[NowIndicatorMountArg]
  @JSName("nowIndicatorDidMount")
  var nowIndicatorDidMount_Original: Identity_[DidMountHandler[NowIndicatorMountArg]]
  
  def nowIndicatorWillUnmount(raw: WillUnmountHandler[NowIndicatorMountArg]): WillUnmountHandler[NowIndicatorMountArg]
  @JSName("nowIndicatorWillUnmount")
  var nowIndicatorWillUnmount_Original: Identity_[WillUnmountHandler[NowIndicatorMountArg]]
  
  @JSName("nowIndicator")
  var nowIndicator_Original: BooleanConstructor
  
  @JSName("now")
  var now_Original: Identity_[DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput])]
  
  def plugins(raw: js.Array[PluginDef]): js.Array[PluginDef]
  @JSName("plugins")
  var plugins_Original: Identity_[js.Array[PluginDef]]
  
  /* standard es5 */
  def progressiveEventRendering[T](): Boolean
  def progressiveEventRendering[T](value: T): Boolean
  @JSName("progressiveEventRendering")
  var progressiveEventRendering_Original: BooleanConstructor
  
  /* standard es5 */
  def rerenderDelay(): Double
  def rerenderDelay(value: Any): Double
  @JSName("rerenderDelay")
  var rerenderDelay_Original: NumberConstructor
  
  /* standard es5 */
  def scrollTimeReset[T](): Boolean
  def scrollTimeReset[T](value: T): Boolean
  @JSName("scrollTimeReset")
  var scrollTimeReset_Original: BooleanConstructor
  
  def selectAllow(raw: AllowFunc): AllowFunc
  @JSName("selectAllow")
  var selectAllow_Original: Identity_[AllowFunc]
  
  def selectConstraint(raw: ConstraintInput): ConstraintInput
  @JSName("selectConstraint")
  var selectConstraint_Original: Identity_[ConstraintInput]
  
  /* standard es5 */
  def selectLongPressDelay(): Double
  def selectLongPressDelay(value: Any): Double
  @JSName("selectLongPressDelay")
  var selectLongPressDelay_Original: NumberConstructor
  
  /* standard es5 */
  def selectMinDistance(): Double
  def selectMinDistance(value: Any): Double
  @JSName("selectMinDistance")
  var selectMinDistance_Original: NumberConstructor
  
  /* standard es5 */
  def selectMirror[T](): Boolean
  def selectMirror[T](value: T): Boolean
  @JSName("selectMirror")
  var selectMirror_Original: BooleanConstructor
  
  def selectOverlap(raw: Boolean): Boolean | OverlapFunc
  def selectOverlap(raw: OverlapFunc): Boolean | OverlapFunc
  @JSName("selectOverlap")
  var selectOverlap_Original: Identity_[Boolean | OverlapFunc]
  
  /* standard es5 */
  def selectable[T](): Boolean
  def selectable[T](value: T): Boolean
  @JSName("selectable")
  var selectable_Original: BooleanConstructor
  
  /* standard es5 */
  def showNonCurrentDates[T](): Boolean
  def showNonCurrentDates[T](value: T): Boolean
  @JSName("showNonCurrentDates")
  var showNonCurrentDates_Original: BooleanConstructor
  
  /* standard es5 */
  def slotEventOverlap[T](): Boolean
  def slotEventOverlap[T](value: T): Boolean
  @JSName("slotEventOverlap")
  var slotEventOverlap_Original: BooleanConstructor
  
  def slotLabelClassNames(raw: ClassNamesGenerator[SlotLabelContentArg]): ClassNamesGenerator[SlotLabelContentArg]
  @JSName("slotLabelClassNames")
  var slotLabelClassNames_Original: Identity_[ClassNamesGenerator[SlotLabelContentArg]]
  
  def slotLabelContent(raw: CustomContentGenerator[SlotLabelContentArg]): CustomContentGenerator[SlotLabelContentArg]
  @JSName("slotLabelContent")
  var slotLabelContent_Original: Identity_[CustomContentGenerator[SlotLabelContentArg]]
  
  def slotLabelDidMount(raw: DidMountHandler[SlotLabelMountArg]): DidMountHandler[SlotLabelMountArg]
  @JSName("slotLabelDidMount")
  var slotLabelDidMount_Original: Identity_[DidMountHandler[SlotLabelMountArg]]
  
  def slotLabelFormat(raw: js.Array[FormatterInput]): FormatterInput | js.Array[FormatterInput]
  def slotLabelFormat(raw: FormatterInput): FormatterInput | js.Array[FormatterInput]
  @JSName("slotLabelFormat")
  var slotLabelFormat_Original: Identity_[FormatterInput | js.Array[FormatterInput]]
  
  def slotLabelWillUnmount(raw: WillUnmountHandler[SlotLabelMountArg]): WillUnmountHandler[SlotLabelMountArg]
  @JSName("slotLabelWillUnmount")
  var slotLabelWillUnmount_Original: Identity_[WillUnmountHandler[SlotLabelMountArg]]
  
  def slotLaneClassNames(raw: ClassNamesGenerator[SlotLaneContentArg]): ClassNamesGenerator[SlotLaneContentArg]
  @JSName("slotLaneClassNames")
  var slotLaneClassNames_Original: Identity_[ClassNamesGenerator[SlotLaneContentArg]]
  
  def slotLaneContent(raw: CustomContentGenerator[SlotLaneContentArg]): CustomContentGenerator[SlotLaneContentArg]
  @JSName("slotLaneContent")
  var slotLaneContent_Original: Identity_[CustomContentGenerator[SlotLaneContentArg]]
  
  def slotLaneDidMount(raw: DidMountHandler[SlotLaneMountArg]): DidMountHandler[SlotLaneMountArg]
  @JSName("slotLaneDidMount")
  var slotLaneDidMount_Original: Identity_[DidMountHandler[SlotLaneMountArg]]
  
  def slotLaneWillUnmount(raw: WillUnmountHandler[SlotLaneMountArg]): WillUnmountHandler[SlotLaneMountArg]
  @JSName("slotLaneWillUnmount")
  var slotLaneWillUnmount_Original: Identity_[WillUnmountHandler[SlotLaneMountArg]]
  
  /* standard es5 */
  def slotMinWidth(): Double
  def slotMinWidth(value: Any): Double
  @JSName("slotMinWidth")
  var slotMinWidth_Original: NumberConstructor
  
  /* standard es5 */
  def startParam(): String
  def startParam(value: Any): String
  @JSName("startParam")
  var startParam_Original: StringConstructor
  
  def stickyFooterScrollbar(raw: Boolean): Boolean | auto
  @JSName("stickyFooterScrollbar")
  var stickyFooterScrollbar_Original: Identity_[Boolean | auto]
  @JSName("stickyFooterScrollbar")
  def stickyFooterScrollbar_auto(raw: auto): Boolean | auto
  
  def stickyHeaderDates(raw: Boolean): Boolean | auto
  @JSName("stickyHeaderDates")
  var stickyHeaderDates_Original: Identity_[Boolean | auto]
  @JSName("stickyHeaderDates")
  def stickyHeaderDates_auto(raw: auto): Boolean | auto
  
  def themeSystem(raw: String): String
  @JSName("themeSystem")
  var themeSystem_Original: Identity_[String]
  
  /* standard es5 */
  def timeHint(): String
  def timeHint(value: Any): String
  @JSName("timeHint")
  var timeHint_Original: StringConstructor
  
  /* standard es5 */
  def timeZone(): String
  def timeZone(value: Any): String
  
  /* standard es5 */
  def timeZoneParam(): String
  def timeZoneParam(value: Any): String
  @JSName("timeZoneParam")
  var timeZoneParam_Original: StringConstructor
  
  @JSName("timeZone")
  var timeZone_Original: StringConstructor
  
  def titleFormat(raw: FormatterInput): FormatterInput
  @JSName("titleFormat")
  var titleFormat_Original: Identity_[FormatterInput]
  
  /* standard es5 */
  def titleRangeSeparator(): String
  def titleRangeSeparator(value: Any): String
  @JSName("titleRangeSeparator")
  var titleRangeSeparator_Original: StringConstructor
  
  /* standard es5 */
  def unselectAuto[T](): Boolean
  def unselectAuto[T](value: T): Boolean
  @JSName("unselectAuto")
  var unselectAuto_Original: BooleanConstructor
  
  /* standard es5 */
  def unselectCancel(): String
  def unselectCancel(value: Any): String
  @JSName("unselectCancel")
  var unselectCancel_Original: StringConstructor
  
  def validRange(raw: js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput]): DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput])
  def validRange(raw: DateRangeInput): DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput])
  @JSName("validRange")
  var validRange_Original: Identity_[
    DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput])
  ]
  
  def viewClassNames(raw: ClassNamesGenerator[ViewContentArg]): ClassNamesGenerator[ViewContentArg]
  @JSName("viewClassNames")
  var viewClassNames_Original: Identity_[ClassNamesGenerator[ViewContentArg]]
  
  def viewDidMount(raw: DidMountHandler[ViewMountArg]): DidMountHandler[ViewMountArg]
  @JSName("viewDidMount")
  var viewDidMount_Original: Identity_[DidMountHandler[ViewMountArg]]
  
  def viewHeight(raw: CssDimValue): CssDimValue
  @JSName("viewHeight")
  var viewHeight_Original: Identity_[CssDimValue]
  
  def viewHint(raw: String): String | (js.Function1[/* repeated */ Any, String])
  def viewHint(raw: js.Function1[/* repeated */ Any, String]): String | (js.Function1[/* repeated */ Any, String])
  @JSName("viewHint")
  var viewHint_Original: Identity_[String | (js.Function1[/* repeated */ Any, String])]
  
  def viewWillUnmount(raw: WillUnmountHandler[ViewMountArg]): WillUnmountHandler[ViewMountArg]
  @JSName("viewWillUnmount")
  var viewWillUnmount_Original: Identity_[WillUnmountHandler[ViewMountArg]]
  
  def visibleRange(raw: js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput]): DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput])
  def visibleRange(raw: DateRangeInput): DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput])
  @JSName("visibleRange")
  var visibleRange_Original: Identity_[
    DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput])
  ]
  
  def weekNumberCalculation(raw: WeekNumberCalculation): WeekNumberCalculation
  @JSName("weekNumberCalculation")
  var weekNumberCalculation_Original: Identity_[WeekNumberCalculation]
  
  def weekNumberClassNames(raw: ClassNamesGenerator[WeekNumberContentArg]): ClassNamesGenerator[WeekNumberContentArg]
  @JSName("weekNumberClassNames")
  var weekNumberClassNames_Original: Identity_[ClassNamesGenerator[WeekNumberContentArg]]
  
  def weekNumberContent(raw: CustomContentGenerator[WeekNumberContentArg]): CustomContentGenerator[WeekNumberContentArg]
  @JSName("weekNumberContent")
  var weekNumberContent_Original: Identity_[CustomContentGenerator[WeekNumberContentArg]]
  
  def weekNumberDidMount(raw: DidMountHandler[WeekNumberMountArg]): DidMountHandler[WeekNumberMountArg]
  @JSName("weekNumberDidMount")
  var weekNumberDidMount_Original: Identity_[DidMountHandler[WeekNumberMountArg]]
  
  def weekNumberWillUnmount(raw: WillUnmountHandler[WeekNumberMountArg]): WillUnmountHandler[WeekNumberMountArg]
  @JSName("weekNumberWillUnmount")
  var weekNumberWillUnmount_Original: Identity_[WillUnmountHandler[WeekNumberMountArg]]
  
  /* standard es5 */
  def weekNumbers[T](): Boolean
  def weekNumbers[T](value: T): Boolean
  @JSName("weekNumbers")
  var weekNumbers_Original: BooleanConstructor
  
  /* standard es5 */
  def weekText(): String
  def weekText(value: Any): String
  
  /* standard es5 */
  def weekTextLong(): String
  def weekTextLong(value: Any): String
  @JSName("weekTextLong")
  var weekTextLong_Original: StringConstructor
  
  @JSName("weekText")
  var weekText_Original: StringConstructor
  
  /* standard es5 */
  def weekends[T](): Boolean
  def weekends[T](value: T): Boolean
  @JSName("weekends")
  var weekends_Original: BooleanConstructor
  
  /* standard es5 */
  def windowResizeDelay(): Double
  def windowResizeDelay(value: Any): Double
  @JSName("windowResizeDelay")
  var windowResizeDelay_Original: NumberConstructor
}
object BuiltInBaseOptionRefiners {
  
  inline def apply(
    allDayClassNames: ClassNamesGenerator[AllDayContentArg] => ClassNamesGenerator[AllDayContentArg],
    allDayContent: CustomContentGenerator[AllDayContentArg] => CustomContentGenerator[AllDayContentArg],
    allDayDidMount: DidMountHandler[AllDayMountArg] => DidMountHandler[AllDayMountArg],
    allDayMaintainDuration: BooleanConstructor,
    allDayText: StringConstructor,
    allDayWillUnmount: WillUnmountHandler[AllDayMountArg] => WillUnmountHandler[AllDayMountArg],
    aspectRatio: NumberConstructor,
    bootstrapFontAwesome: `false` | ButtonIconsInput => `false` | ButtonIconsInput,
    businessHours: BusinessHoursInput => BusinessHoursInput,
    buttonIcons: `false` | ButtonIconsInput => `false` | ButtonIconsInput,
    closeHint: StringConstructor,
    contentHeight: CssDimValue => CssDimValue,
    customButtons: StringDictionary[CustomButtonInput] => StringDictionary[CustomButtonInput],
    dateAlignment: StringConstructor,
    dayCellClassNames: ClassNamesGenerator[DayCellContentArg] => ClassNamesGenerator[DayCellContentArg],
    dayCellContent: CustomContentGenerator[DayCellContentArg] => CustomContentGenerator[DayCellContentArg],
    dayCellDidMount: DidMountHandler[DayCellMountArg] => DidMountHandler[DayCellMountArg],
    dayCellWillUnmount: WillUnmountHandler[DayCellMountArg] => WillUnmountHandler[DayCellMountArg],
    dayCount: NumberConstructor,
    dayHeaderClassNames: ClassNamesGenerator[DayHeaderContentArg] => ClassNamesGenerator[DayHeaderContentArg],
    dayHeaderContent: CustomContentGenerator[DayHeaderContentArg] => CustomContentGenerator[DayHeaderContentArg],
    dayHeaderDidMount: DidMountHandler[DayHeaderMountArg] => DidMountHandler[DayHeaderMountArg],
    dayHeaderWillUnmount: WillUnmountHandler[DayHeaderMountArg] => WillUnmountHandler[DayHeaderMountArg],
    dayHeaders: BooleanConstructor,
    dayMaxEventRows: Double | Boolean => Double | Boolean,
    dayMaxEvents: Double | Boolean => Double | Boolean,
    dayMinWidth: NumberConstructor,
    defaultAllDay: BooleanConstructor,
    defaultRangeSeparator: StringConstructor,
    direction: ltr | rtl => ltr | rtl,
    displayEventEnd: BooleanConstructor,
    displayEventTime: BooleanConstructor,
    dragRevertDuration: NumberConstructor,
    dragScroll: BooleanConstructor,
    dropAccept: String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean]) => String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean]),
    droppable: BooleanConstructor,
    editable: BooleanConstructor,
    endParam: StringConstructor,
    eventAllow: AllowFunc => AllowFunc,
    eventBackgroundColor: StringConstructor,
    eventBorderColor: StringConstructor,
    eventClassNames: ClassNamesGenerator[EventContentArg] => ClassNamesGenerator[EventContentArg],
    eventColor: StringConstructor,
    eventConstraint: ConstraintInput => ConstraintInput,
    eventContent: CustomContentGenerator[EventContentArg] => CustomContentGenerator[EventContentArg],
    eventDataTransform: EventInputTransformer => EventInputTransformer,
    eventDidMount: DidMountHandler[EventMountArg] => DidMountHandler[EventMountArg],
    eventDisplay: StringConstructor,
    eventDragMinDistance: NumberConstructor,
    eventDurationEditable: BooleanConstructor,
    eventHint: StringConstructor,
    eventInteractive: BooleanConstructor,
    eventLongPressDelay: NumberConstructor,
    eventMaxStack: NumberConstructor,
    eventMinHeight: NumberConstructor,
    eventMinWidth: NumberConstructor,
    eventOrderStrict: BooleanConstructor,
    eventOverlap: Boolean | OverlapFunc => Boolean | OverlapFunc,
    eventResizableFromStart: BooleanConstructor,
    eventShortHeight: NumberConstructor,
    eventSourceFailure: js.ThisFunction1[/* this */ CalendarApi, /* error */ Any, Unit] => js.ThisFunction1[/* this */ CalendarApi, /* error */ Any, Unit],
    eventSourceSuccess: js.ThisFunction2[
      /* this */ CalendarApi, 
      /* eventsInput */ js.Array[EventInput], 
      /* xhr */ js.UndefOr[XMLHttpRequest], 
      js.Array[EventInput] | Unit
    ] => js.ThisFunction2[
      /* this */ CalendarApi, 
      /* eventsInput */ js.Array[EventInput], 
      /* xhr */ js.UndefOr[XMLHttpRequest], 
      js.Array[EventInput] | Unit
    ],
    eventStartEditable: BooleanConstructor,
    eventTextColor: StringConstructor,
    eventWillUnmount: WillUnmountHandler[EventMountArg] => WillUnmountHandler[EventMountArg],
    expandRows: BooleanConstructor,
    firstDay: NumberConstructor,
    fixedWeekCount: BooleanConstructor,
    footerToolbar: `false` | ToolbarInput => `false` | ToolbarInput,
    forceEventDuration: BooleanConstructor,
    handleWindowResize: BooleanConstructor,
    headerToolbar: `false` | ToolbarInput => `false` | ToolbarInput,
    height: CssDimValue => CssDimValue,
    hiddenDays: js.Array[Double] => js.Array[Double],
    initialDate: DateInput => DateInput,
    initialView: StringConstructor,
    lazyFetching: BooleanConstructor,
    locale: LocaleSingularArg => LocaleSingularArg,
    locales: js.Array[LocaleInput] => js.Array[LocaleInput],
    longPressDelay: NumberConstructor,
    monthMode: BooleanConstructor,
    moreLinkClassNames: ClassNamesGenerator[MoreLinkContentArg] => ClassNamesGenerator[MoreLinkContentArg],
    moreLinkClick: MoreLinkAction => MoreLinkAction,
    moreLinkContent: CustomContentGenerator[MoreLinkContentArg] => CustomContentGenerator[MoreLinkContentArg],
    moreLinkDidMount: DidMountHandler[MoreLinkMountArg] => DidMountHandler[MoreLinkMountArg],
    moreLinkHint: String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]) => String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]),
    moreLinkText: String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]) => String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]),
    moreLinkWillUnmount: WillUnmountHandler[MoreLinkMountArg] => WillUnmountHandler[MoreLinkMountArg],
    navLinkDayClick: String | (js.ThisFunction2[
      /* this */ CalendarApi, 
      /* date */ js.Date, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
      Unit
    ]) => String | (js.ThisFunction2[
      /* this */ CalendarApi, 
      /* date */ js.Date, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
      Unit
    ]),
    navLinkHint: String | (js.Function1[/* repeated */ Any, String]) => String | (js.Function1[/* repeated */ Any, String]),
    navLinkWeekClick: String | (js.ThisFunction2[
      /* this */ CalendarApi, 
      /* weekStart */ js.Date, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
      Unit
    ]) => String | (js.ThisFunction2[
      /* this */ CalendarApi, 
      /* weekStart */ js.Date, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
      Unit
    ]),
    navLinks: BooleanConstructor,
    noEventsText: StringConstructor,
    now: DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput]) => DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput]),
    nowIndicator: BooleanConstructor,
    nowIndicatorClassNames: ClassNamesGenerator[NowIndicatorContentArg] => ClassNamesGenerator[NowIndicatorContentArg],
    nowIndicatorContent: CustomContentGenerator[NowIndicatorContentArg] => CustomContentGenerator[NowIndicatorContentArg],
    nowIndicatorDidMount: DidMountHandler[NowIndicatorMountArg] => DidMountHandler[NowIndicatorMountArg],
    nowIndicatorWillUnmount: WillUnmountHandler[NowIndicatorMountArg] => WillUnmountHandler[NowIndicatorMountArg],
    plugins: js.Array[PluginDef] => js.Array[PluginDef],
    progressiveEventRendering: BooleanConstructor,
    rerenderDelay: NumberConstructor,
    scrollTimeReset: BooleanConstructor,
    selectAllow: AllowFunc => AllowFunc,
    selectConstraint: ConstraintInput => ConstraintInput,
    selectLongPressDelay: NumberConstructor,
    selectMinDistance: NumberConstructor,
    selectMirror: BooleanConstructor,
    selectOverlap: Boolean | OverlapFunc => Boolean | OverlapFunc,
    selectable: BooleanConstructor,
    showNonCurrentDates: BooleanConstructor,
    slotEventOverlap: BooleanConstructor,
    slotLabelClassNames: ClassNamesGenerator[SlotLabelContentArg] => ClassNamesGenerator[SlotLabelContentArg],
    slotLabelContent: CustomContentGenerator[SlotLabelContentArg] => CustomContentGenerator[SlotLabelContentArg],
    slotLabelDidMount: DidMountHandler[SlotLabelMountArg] => DidMountHandler[SlotLabelMountArg],
    slotLabelFormat: FormatterInput | js.Array[FormatterInput] => FormatterInput | js.Array[FormatterInput],
    slotLabelWillUnmount: WillUnmountHandler[SlotLabelMountArg] => WillUnmountHandler[SlotLabelMountArg],
    slotLaneClassNames: ClassNamesGenerator[SlotLaneContentArg] => ClassNamesGenerator[SlotLaneContentArg],
    slotLaneContent: CustomContentGenerator[SlotLaneContentArg] => CustomContentGenerator[SlotLaneContentArg],
    slotLaneDidMount: DidMountHandler[SlotLaneMountArg] => DidMountHandler[SlotLaneMountArg],
    slotLaneWillUnmount: WillUnmountHandler[SlotLaneMountArg] => WillUnmountHandler[SlotLaneMountArg],
    slotMinWidth: NumberConstructor,
    startParam: StringConstructor,
    stickyFooterScrollbar: Boolean | auto => Boolean | auto,
    stickyHeaderDates: Boolean | auto => Boolean | auto,
    themeSystem: String => String,
    timeHint: StringConstructor,
    timeZone: StringConstructor,
    timeZoneParam: StringConstructor,
    titleFormat: FormatterInput => FormatterInput,
    titleRangeSeparator: StringConstructor,
    unselectAuto: BooleanConstructor,
    unselectCancel: StringConstructor,
    validRange: DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput]) => DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput]),
    viewClassNames: ClassNamesGenerator[ViewContentArg] => ClassNamesGenerator[ViewContentArg],
    viewDidMount: DidMountHandler[ViewMountArg] => DidMountHandler[ViewMountArg],
    viewHeight: CssDimValue => CssDimValue,
    viewHint: String | (js.Function1[/* repeated */ Any, String]) => String | (js.Function1[/* repeated */ Any, String]),
    viewWillUnmount: WillUnmountHandler[ViewMountArg] => WillUnmountHandler[ViewMountArg],
    visibleRange: DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput]) => DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput]),
    weekNumberCalculation: WeekNumberCalculation => WeekNumberCalculation,
    weekNumberClassNames: ClassNamesGenerator[WeekNumberContentArg] => ClassNamesGenerator[WeekNumberContentArg],
    weekNumberContent: CustomContentGenerator[WeekNumberContentArg] => CustomContentGenerator[WeekNumberContentArg],
    weekNumberDidMount: DidMountHandler[WeekNumberMountArg] => DidMountHandler[WeekNumberMountArg],
    weekNumberWillUnmount: WillUnmountHandler[WeekNumberMountArg] => WillUnmountHandler[WeekNumberMountArg],
    weekNumbers: BooleanConstructor,
    weekText: StringConstructor,
    weekTextLong: StringConstructor,
    weekends: BooleanConstructor,
    windowResizeDelay: NumberConstructor
  ): BuiltInBaseOptionRefiners = {
    val __obj = js.Dynamic.literal(allDayClassNames = js.Any.fromFunction1(allDayClassNames), allDayContent = js.Any.fromFunction1(allDayContent), allDayDidMount = js.Any.fromFunction1(allDayDidMount), allDayMaintainDuration = allDayMaintainDuration.asInstanceOf[js.Any], allDayText = allDayText.asInstanceOf[js.Any], allDayWillUnmount = js.Any.fromFunction1(allDayWillUnmount), aspectRatio = aspectRatio.asInstanceOf[js.Any], bootstrapFontAwesome = js.Any.fromFunction1(bootstrapFontAwesome), businessHours = js.Any.fromFunction1(businessHours), buttonIcons = js.Any.fromFunction1(buttonIcons), closeHint = closeHint.asInstanceOf[js.Any], contentHeight = js.Any.fromFunction1(contentHeight), customButtons = js.Any.fromFunction1(customButtons), dateAlignment = dateAlignment.asInstanceOf[js.Any], dayCellClassNames = js.Any.fromFunction1(dayCellClassNames), dayCellContent = js.Any.fromFunction1(dayCellContent), dayCellDidMount = js.Any.fromFunction1(dayCellDidMount), dayCellWillUnmount = js.Any.fromFunction1(dayCellWillUnmount), dayCount = dayCount.asInstanceOf[js.Any], dayHeaderClassNames = js.Any.fromFunction1(dayHeaderClassNames), dayHeaderContent = js.Any.fromFunction1(dayHeaderContent), dayHeaderDidMount = js.Any.fromFunction1(dayHeaderDidMount), dayHeaderWillUnmount = js.Any.fromFunction1(dayHeaderWillUnmount), dayHeaders = dayHeaders.asInstanceOf[js.Any], dayMaxEventRows = js.Any.fromFunction1(dayMaxEventRows), dayMaxEvents = js.Any.fromFunction1(dayMaxEvents), dayMinWidth = dayMinWidth.asInstanceOf[js.Any], defaultAllDay = defaultAllDay.asInstanceOf[js.Any], defaultRangeSeparator = defaultRangeSeparator.asInstanceOf[js.Any], direction = js.Any.fromFunction1(direction), displayEventEnd = displayEventEnd.asInstanceOf[js.Any], displayEventTime = displayEventTime.asInstanceOf[js.Any], dragRevertDuration = dragRevertDuration.asInstanceOf[js.Any], dragScroll = dragScroll.asInstanceOf[js.Any], dropAccept = js.Any.fromFunction1(dropAccept), droppable = droppable.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], endParam = endParam.asInstanceOf[js.Any], eventAllow = js.Any.fromFunction1(eventAllow), eventBackgroundColor = eventBackgroundColor.asInstanceOf[js.Any], eventBorderColor = eventBorderColor.asInstanceOf[js.Any], eventClassNames = js.Any.fromFunction1(eventClassNames), eventColor = eventColor.asInstanceOf[js.Any], eventConstraint = js.Any.fromFunction1(eventConstraint), eventContent = js.Any.fromFunction1(eventContent), eventDataTransform = js.Any.fromFunction1(eventDataTransform), eventDidMount = js.Any.fromFunction1(eventDidMount), eventDisplay = eventDisplay.asInstanceOf[js.Any], eventDragMinDistance = eventDragMinDistance.asInstanceOf[js.Any], eventDurationEditable = eventDurationEditable.asInstanceOf[js.Any], eventHint = eventHint.asInstanceOf[js.Any], eventInteractive = eventInteractive.asInstanceOf[js.Any], eventLongPressDelay = eventLongPressDelay.asInstanceOf[js.Any], eventMaxStack = eventMaxStack.asInstanceOf[js.Any], eventMinHeight = eventMinHeight.asInstanceOf[js.Any], eventMinWidth = eventMinWidth.asInstanceOf[js.Any], eventOrderStrict = eventOrderStrict.asInstanceOf[js.Any], eventOverlap = js.Any.fromFunction1(eventOverlap), eventResizableFromStart = eventResizableFromStart.asInstanceOf[js.Any], eventShortHeight = eventShortHeight.asInstanceOf[js.Any], eventSourceFailure = js.Any.fromFunction1(eventSourceFailure), eventSourceSuccess = js.Any.fromFunction1(eventSourceSuccess), eventStartEditable = eventStartEditable.asInstanceOf[js.Any], eventTextColor = eventTextColor.asInstanceOf[js.Any], eventWillUnmount = js.Any.fromFunction1(eventWillUnmount), expandRows = expandRows.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], fixedWeekCount = fixedWeekCount.asInstanceOf[js.Any], footerToolbar = js.Any.fromFunction1(footerToolbar), forceEventDuration = forceEventDuration.asInstanceOf[js.Any], handleWindowResize = handleWindowResize.asInstanceOf[js.Any], headerToolbar = js.Any.fromFunction1(headerToolbar), height = js.Any.fromFunction1(height), hiddenDays = js.Any.fromFunction1(hiddenDays), initialDate = js.Any.fromFunction1(initialDate), initialView = initialView.asInstanceOf[js.Any], lazyFetching = lazyFetching.asInstanceOf[js.Any], locale = js.Any.fromFunction1(locale), locales = js.Any.fromFunction1(locales), longPressDelay = longPressDelay.asInstanceOf[js.Any], monthMode = monthMode.asInstanceOf[js.Any], moreLinkClassNames = js.Any.fromFunction1(moreLinkClassNames), moreLinkClick = js.Any.fromFunction1(moreLinkClick), moreLinkContent = js.Any.fromFunction1(moreLinkContent), moreLinkDidMount = js.Any.fromFunction1(moreLinkDidMount), moreLinkHint = js.Any.fromFunction1(moreLinkHint), moreLinkText = js.Any.fromFunction1(moreLinkText), moreLinkWillUnmount = js.Any.fromFunction1(moreLinkWillUnmount), navLinkDayClick = js.Any.fromFunction1(navLinkDayClick), navLinkHint = js.Any.fromFunction1(navLinkHint), navLinkWeekClick = js.Any.fromFunction1(navLinkWeekClick), navLinks = navLinks.asInstanceOf[js.Any], noEventsText = noEventsText.asInstanceOf[js.Any], now = js.Any.fromFunction1(now), nowIndicator = nowIndicator.asInstanceOf[js.Any], nowIndicatorClassNames = js.Any.fromFunction1(nowIndicatorClassNames), nowIndicatorContent = js.Any.fromFunction1(nowIndicatorContent), nowIndicatorDidMount = js.Any.fromFunction1(nowIndicatorDidMount), nowIndicatorWillUnmount = js.Any.fromFunction1(nowIndicatorWillUnmount), plugins = js.Any.fromFunction1(plugins), progressiveEventRendering = progressiveEventRendering.asInstanceOf[js.Any], rerenderDelay = rerenderDelay.asInstanceOf[js.Any], scrollTimeReset = scrollTimeReset.asInstanceOf[js.Any], selectAllow = js.Any.fromFunction1(selectAllow), selectConstraint = js.Any.fromFunction1(selectConstraint), selectLongPressDelay = selectLongPressDelay.asInstanceOf[js.Any], selectMinDistance = selectMinDistance.asInstanceOf[js.Any], selectMirror = selectMirror.asInstanceOf[js.Any], selectOverlap = js.Any.fromFunction1(selectOverlap), selectable = selectable.asInstanceOf[js.Any], showNonCurrentDates = showNonCurrentDates.asInstanceOf[js.Any], slotEventOverlap = slotEventOverlap.asInstanceOf[js.Any], slotLabelClassNames = js.Any.fromFunction1(slotLabelClassNames), slotLabelContent = js.Any.fromFunction1(slotLabelContent), slotLabelDidMount = js.Any.fromFunction1(slotLabelDidMount), slotLabelFormat = js.Any.fromFunction1(slotLabelFormat), slotLabelWillUnmount = js.Any.fromFunction1(slotLabelWillUnmount), slotLaneClassNames = js.Any.fromFunction1(slotLaneClassNames), slotLaneContent = js.Any.fromFunction1(slotLaneContent), slotLaneDidMount = js.Any.fromFunction1(slotLaneDidMount), slotLaneWillUnmount = js.Any.fromFunction1(slotLaneWillUnmount), slotMinWidth = slotMinWidth.asInstanceOf[js.Any], startParam = startParam.asInstanceOf[js.Any], stickyFooterScrollbar = js.Any.fromFunction1(stickyFooterScrollbar), stickyHeaderDates = js.Any.fromFunction1(stickyHeaderDates), themeSystem = js.Any.fromFunction1(themeSystem), timeHint = timeHint.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], timeZoneParam = timeZoneParam.asInstanceOf[js.Any], titleFormat = js.Any.fromFunction1(titleFormat), titleRangeSeparator = titleRangeSeparator.asInstanceOf[js.Any], unselectAuto = unselectAuto.asInstanceOf[js.Any], unselectCancel = unselectCancel.asInstanceOf[js.Any], validRange = js.Any.fromFunction1(validRange), viewClassNames = js.Any.fromFunction1(viewClassNames), viewDidMount = js.Any.fromFunction1(viewDidMount), viewHeight = js.Any.fromFunction1(viewHeight), viewHint = js.Any.fromFunction1(viewHint), viewWillUnmount = js.Any.fromFunction1(viewWillUnmount), visibleRange = js.Any.fromFunction1(visibleRange), weekNumberCalculation = js.Any.fromFunction1(weekNumberCalculation), weekNumberClassNames = js.Any.fromFunction1(weekNumberClassNames), weekNumberContent = js.Any.fromFunction1(weekNumberContent), weekNumberDidMount = js.Any.fromFunction1(weekNumberDidMount), weekNumberWillUnmount = js.Any.fromFunction1(weekNumberWillUnmount), weekNumbers = weekNumbers.asInstanceOf[js.Any], weekText = weekText.asInstanceOf[js.Any], weekTextLong = weekTextLong.asInstanceOf[js.Any], weekends = weekends.asInstanceOf[js.Any], windowResizeDelay = windowResizeDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltInBaseOptionRefiners]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuiltInBaseOptionRefiners] (val x: Self) extends AnyVal {
    
    inline def setAllDayClassNames(value: ClassNamesGenerator[AllDayContentArg] => ClassNamesGenerator[AllDayContentArg]): Self = StObject.set(x, "allDayClassNames", js.Any.fromFunction1(value))
    
    inline def setAllDayContent(value: CustomContentGenerator[AllDayContentArg] => CustomContentGenerator[AllDayContentArg]): Self = StObject.set(x, "allDayContent", js.Any.fromFunction1(value))
    
    inline def setAllDayDidMount(value: DidMountHandler[AllDayMountArg] => DidMountHandler[AllDayMountArg]): Self = StObject.set(x, "allDayDidMount", js.Any.fromFunction1(value))
    
    inline def setAllDayMaintainDuration(value: BooleanConstructor): Self = StObject.set(x, "allDayMaintainDuration", value.asInstanceOf[js.Any])
    
    inline def setAllDayText(value: StringConstructor): Self = StObject.set(x, "allDayText", value.asInstanceOf[js.Any])
    
    inline def setAllDayWillUnmount(value: WillUnmountHandler[AllDayMountArg] => WillUnmountHandler[AllDayMountArg]): Self = StObject.set(x, "allDayWillUnmount", js.Any.fromFunction1(value))
    
    inline def setAspectRatio(value: NumberConstructor): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setBootstrapFontAwesome(value: `false` | ButtonIconsInput => `false` | ButtonIconsInput): Self = StObject.set(x, "bootstrapFontAwesome", js.Any.fromFunction1(value))
    
    inline def setBusinessHours(value: BusinessHoursInput => BusinessHoursInput): Self = StObject.set(x, "businessHours", js.Any.fromFunction1(value))
    
    inline def setButtonIcons(value: `false` | ButtonIconsInput => `false` | ButtonIconsInput): Self = StObject.set(x, "buttonIcons", js.Any.fromFunction1(value))
    
    inline def setCloseHint(value: StringConstructor): Self = StObject.set(x, "closeHint", value.asInstanceOf[js.Any])
    
    inline def setContentHeight(value: CssDimValue => CssDimValue): Self = StObject.set(x, "contentHeight", js.Any.fromFunction1(value))
    
    inline def setCustomButtons(value: StringDictionary[CustomButtonInput] => StringDictionary[CustomButtonInput]): Self = StObject.set(x, "customButtons", js.Any.fromFunction1(value))
    
    inline def setDateAlignment(value: StringConstructor): Self = StObject.set(x, "dateAlignment", value.asInstanceOf[js.Any])
    
    inline def setDayCellClassNames(value: ClassNamesGenerator[DayCellContentArg] => ClassNamesGenerator[DayCellContentArg]): Self = StObject.set(x, "dayCellClassNames", js.Any.fromFunction1(value))
    
    inline def setDayCellContent(value: CustomContentGenerator[DayCellContentArg] => CustomContentGenerator[DayCellContentArg]): Self = StObject.set(x, "dayCellContent", js.Any.fromFunction1(value))
    
    inline def setDayCellDidMount(value: DidMountHandler[DayCellMountArg] => DidMountHandler[DayCellMountArg]): Self = StObject.set(x, "dayCellDidMount", js.Any.fromFunction1(value))
    
    inline def setDayCellWillUnmount(value: WillUnmountHandler[DayCellMountArg] => WillUnmountHandler[DayCellMountArg]): Self = StObject.set(x, "dayCellWillUnmount", js.Any.fromFunction1(value))
    
    inline def setDayCount(value: NumberConstructor): Self = StObject.set(x, "dayCount", value.asInstanceOf[js.Any])
    
    inline def setDayHeaderClassNames(value: ClassNamesGenerator[DayHeaderContentArg] => ClassNamesGenerator[DayHeaderContentArg]): Self = StObject.set(x, "dayHeaderClassNames", js.Any.fromFunction1(value))
    
    inline def setDayHeaderContent(value: CustomContentGenerator[DayHeaderContentArg] => CustomContentGenerator[DayHeaderContentArg]): Self = StObject.set(x, "dayHeaderContent", js.Any.fromFunction1(value))
    
    inline def setDayHeaderDidMount(value: DidMountHandler[DayHeaderMountArg] => DidMountHandler[DayHeaderMountArg]): Self = StObject.set(x, "dayHeaderDidMount", js.Any.fromFunction1(value))
    
    inline def setDayHeaderWillUnmount(value: WillUnmountHandler[DayHeaderMountArg] => WillUnmountHandler[DayHeaderMountArg]): Self = StObject.set(x, "dayHeaderWillUnmount", js.Any.fromFunction1(value))
    
    inline def setDayHeaders(value: BooleanConstructor): Self = StObject.set(x, "dayHeaders", value.asInstanceOf[js.Any])
    
    inline def setDayMaxEventRows(value: Double | Boolean => Double | Boolean): Self = StObject.set(x, "dayMaxEventRows", js.Any.fromFunction1(value))
    
    inline def setDayMaxEvents(value: Double | Boolean => Double | Boolean): Self = StObject.set(x, "dayMaxEvents", js.Any.fromFunction1(value))
    
    inline def setDayMinWidth(value: NumberConstructor): Self = StObject.set(x, "dayMinWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultAllDay(value: BooleanConstructor): Self = StObject.set(x, "defaultAllDay", value.asInstanceOf[js.Any])
    
    inline def setDefaultRangeSeparator(value: StringConstructor): Self = StObject.set(x, "defaultRangeSeparator", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: ltr | rtl => ltr | rtl): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
    
    inline def setDisplayEventEnd(value: BooleanConstructor): Self = StObject.set(x, "displayEventEnd", value.asInstanceOf[js.Any])
    
    inline def setDisplayEventTime(value: BooleanConstructor): Self = StObject.set(x, "displayEventTime", value.asInstanceOf[js.Any])
    
    inline def setDragRevertDuration(value: NumberConstructor): Self = StObject.set(x, "dragRevertDuration", value.asInstanceOf[js.Any])
    
    inline def setDragScroll(value: BooleanConstructor): Self = StObject.set(x, "dragScroll", value.asInstanceOf[js.Any])
    
    inline def setDropAccept(
      value: String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean]) => String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean])
    ): Self = StObject.set(x, "dropAccept", js.Any.fromFunction1(value))
    
    inline def setDroppable(value: BooleanConstructor): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: BooleanConstructor): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEndParam(value: StringConstructor): Self = StObject.set(x, "endParam", value.asInstanceOf[js.Any])
    
    inline def setEventAllow(value: AllowFunc => AllowFunc): Self = StObject.set(x, "eventAllow", js.Any.fromFunction1(value))
    
    inline def setEventBackgroundColor(value: StringConstructor): Self = StObject.set(x, "eventBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setEventBorderColor(value: StringConstructor): Self = StObject.set(x, "eventBorderColor", value.asInstanceOf[js.Any])
    
    inline def setEventClassNames(value: ClassNamesGenerator[EventContentArg] => ClassNamesGenerator[EventContentArg]): Self = StObject.set(x, "eventClassNames", js.Any.fromFunction1(value))
    
    inline def setEventColor(value: StringConstructor): Self = StObject.set(x, "eventColor", value.asInstanceOf[js.Any])
    
    inline def setEventConstraint(value: ConstraintInput => ConstraintInput): Self = StObject.set(x, "eventConstraint", js.Any.fromFunction1(value))
    
    inline def setEventContent(value: CustomContentGenerator[EventContentArg] => CustomContentGenerator[EventContentArg]): Self = StObject.set(x, "eventContent", js.Any.fromFunction1(value))
    
    inline def setEventDataTransform(value: EventInputTransformer => EventInputTransformer): Self = StObject.set(x, "eventDataTransform", js.Any.fromFunction1(value))
    
    inline def setEventDidMount(value: DidMountHandler[EventMountArg] => DidMountHandler[EventMountArg]): Self = StObject.set(x, "eventDidMount", js.Any.fromFunction1(value))
    
    inline def setEventDisplay(value: StringConstructor): Self = StObject.set(x, "eventDisplay", value.asInstanceOf[js.Any])
    
    inline def setEventDragMinDistance(value: NumberConstructor): Self = StObject.set(x, "eventDragMinDistance", value.asInstanceOf[js.Any])
    
    inline def setEventDurationEditable(value: BooleanConstructor): Self = StObject.set(x, "eventDurationEditable", value.asInstanceOf[js.Any])
    
    inline def setEventHint(value: StringConstructor): Self = StObject.set(x, "eventHint", value.asInstanceOf[js.Any])
    
    inline def setEventInteractive(value: BooleanConstructor): Self = StObject.set(x, "eventInteractive", value.asInstanceOf[js.Any])
    
    inline def setEventLongPressDelay(value: NumberConstructor): Self = StObject.set(x, "eventLongPressDelay", value.asInstanceOf[js.Any])
    
    inline def setEventMaxStack(value: NumberConstructor): Self = StObject.set(x, "eventMaxStack", value.asInstanceOf[js.Any])
    
    inline def setEventMinHeight(value: NumberConstructor): Self = StObject.set(x, "eventMinHeight", value.asInstanceOf[js.Any])
    
    inline def setEventMinWidth(value: NumberConstructor): Self = StObject.set(x, "eventMinWidth", value.asInstanceOf[js.Any])
    
    inline def setEventOrderStrict(value: BooleanConstructor): Self = StObject.set(x, "eventOrderStrict", value.asInstanceOf[js.Any])
    
    inline def setEventOverlap(value: Boolean | OverlapFunc => Boolean | OverlapFunc): Self = StObject.set(x, "eventOverlap", js.Any.fromFunction1(value))
    
    inline def setEventResizableFromStart(value: BooleanConstructor): Self = StObject.set(x, "eventResizableFromStart", value.asInstanceOf[js.Any])
    
    inline def setEventShortHeight(value: NumberConstructor): Self = StObject.set(x, "eventShortHeight", value.asInstanceOf[js.Any])
    
    inline def setEventSourceFailure(
      value: js.ThisFunction1[/* this */ CalendarApi, /* error */ Any, Unit] => js.ThisFunction1[/* this */ CalendarApi, /* error */ Any, Unit]
    ): Self = StObject.set(x, "eventSourceFailure", js.Any.fromFunction1(value))
    
    inline def setEventSourceSuccess(
      value: js.ThisFunction2[
          /* this */ CalendarApi, 
          /* eventsInput */ js.Array[EventInput], 
          /* xhr */ js.UndefOr[XMLHttpRequest], 
          js.Array[EventInput] | Unit
        ] => js.ThisFunction2[
          /* this */ CalendarApi, 
          /* eventsInput */ js.Array[EventInput], 
          /* xhr */ js.UndefOr[XMLHttpRequest], 
          js.Array[EventInput] | Unit
        ]
    ): Self = StObject.set(x, "eventSourceSuccess", js.Any.fromFunction1(value))
    
    inline def setEventStartEditable(value: BooleanConstructor): Self = StObject.set(x, "eventStartEditable", value.asInstanceOf[js.Any])
    
    inline def setEventTextColor(value: StringConstructor): Self = StObject.set(x, "eventTextColor", value.asInstanceOf[js.Any])
    
    inline def setEventWillUnmount(value: WillUnmountHandler[EventMountArg] => WillUnmountHandler[EventMountArg]): Self = StObject.set(x, "eventWillUnmount", js.Any.fromFunction1(value))
    
    inline def setExpandRows(value: BooleanConstructor): Self = StObject.set(x, "expandRows", value.asInstanceOf[js.Any])
    
    inline def setFirstDay(value: NumberConstructor): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    inline def setFixedWeekCount(value: BooleanConstructor): Self = StObject.set(x, "fixedWeekCount", value.asInstanceOf[js.Any])
    
    inline def setFooterToolbar(value: `false` | ToolbarInput => `false` | ToolbarInput): Self = StObject.set(x, "footerToolbar", js.Any.fromFunction1(value))
    
    inline def setForceEventDuration(value: BooleanConstructor): Self = StObject.set(x, "forceEventDuration", value.asInstanceOf[js.Any])
    
    inline def setHandleWindowResize(value: BooleanConstructor): Self = StObject.set(x, "handleWindowResize", value.asInstanceOf[js.Any])
    
    inline def setHeaderToolbar(value: `false` | ToolbarInput => `false` | ToolbarInput): Self = StObject.set(x, "headerToolbar", js.Any.fromFunction1(value))
    
    inline def setHeight(value: CssDimValue => CssDimValue): Self = StObject.set(x, "height", js.Any.fromFunction1(value))
    
    inline def setHiddenDays(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "hiddenDays", js.Any.fromFunction1(value))
    
    inline def setInitialDate(value: DateInput => DateInput): Self = StObject.set(x, "initialDate", js.Any.fromFunction1(value))
    
    inline def setInitialView(value: StringConstructor): Self = StObject.set(x, "initialView", value.asInstanceOf[js.Any])
    
    inline def setLazyFetching(value: BooleanConstructor): Self = StObject.set(x, "lazyFetching", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: LocaleSingularArg => LocaleSingularArg): Self = StObject.set(x, "locale", js.Any.fromFunction1(value))
    
    inline def setLocales(value: js.Array[LocaleInput] => js.Array[LocaleInput]): Self = StObject.set(x, "locales", js.Any.fromFunction1(value))
    
    inline def setLongPressDelay(value: NumberConstructor): Self = StObject.set(x, "longPressDelay", value.asInstanceOf[js.Any])
    
    inline def setMonthMode(value: BooleanConstructor): Self = StObject.set(x, "monthMode", value.asInstanceOf[js.Any])
    
    inline def setMoreLinkClassNames(value: ClassNamesGenerator[MoreLinkContentArg] => ClassNamesGenerator[MoreLinkContentArg]): Self = StObject.set(x, "moreLinkClassNames", js.Any.fromFunction1(value))
    
    inline def setMoreLinkClick(value: MoreLinkAction => MoreLinkAction): Self = StObject.set(x, "moreLinkClick", js.Any.fromFunction1(value))
    
    inline def setMoreLinkContent(value: CustomContentGenerator[MoreLinkContentArg] => CustomContentGenerator[MoreLinkContentArg]): Self = StObject.set(x, "moreLinkContent", js.Any.fromFunction1(value))
    
    inline def setMoreLinkDidMount(value: DidMountHandler[MoreLinkMountArg] => DidMountHandler[MoreLinkMountArg]): Self = StObject.set(x, "moreLinkDidMount", js.Any.fromFunction1(value))
    
    inline def setMoreLinkHint(
      value: String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]) => String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])
    ): Self = StObject.set(x, "moreLinkHint", js.Any.fromFunction1(value))
    
    inline def setMoreLinkText(
      value: String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]) => String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])
    ): Self = StObject.set(x, "moreLinkText", js.Any.fromFunction1(value))
    
    inline def setMoreLinkWillUnmount(value: WillUnmountHandler[MoreLinkMountArg] => WillUnmountHandler[MoreLinkMountArg]): Self = StObject.set(x, "moreLinkWillUnmount", js.Any.fromFunction1(value))
    
    inline def setNavLinkDayClick(
      value: String | (js.ThisFunction2[
          /* this */ CalendarApi, 
          /* date */ js.Date, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
          Unit
        ]) => String | (js.ThisFunction2[
          /* this */ CalendarApi, 
          /* date */ js.Date, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
          Unit
        ])
    ): Self = StObject.set(x, "navLinkDayClick", js.Any.fromFunction1(value))
    
    inline def setNavLinkHint(
      value: String | (js.Function1[/* repeated */ Any, String]) => String | (js.Function1[/* repeated */ Any, String])
    ): Self = StObject.set(x, "navLinkHint", js.Any.fromFunction1(value))
    
    inline def setNavLinkWeekClick(
      value: String | (js.ThisFunction2[
          /* this */ CalendarApi, 
          /* weekStart */ js.Date, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
          Unit
        ]) => String | (js.ThisFunction2[
          /* this */ CalendarApi, 
          /* weekStart */ js.Date, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
          Unit
        ])
    ): Self = StObject.set(x, "navLinkWeekClick", js.Any.fromFunction1(value))
    
    inline def setNavLinks(value: BooleanConstructor): Self = StObject.set(x, "navLinks", value.asInstanceOf[js.Any])
    
    inline def setNoEventsText(value: StringConstructor): Self = StObject.set(x, "noEventsText", value.asInstanceOf[js.Any])
    
    inline def setNow(
      value: DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput]) => DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput])
    ): Self = StObject.set(x, "now", js.Any.fromFunction1(value))
    
    inline def setNowIndicator(value: BooleanConstructor): Self = StObject.set(x, "nowIndicator", value.asInstanceOf[js.Any])
    
    inline def setNowIndicatorClassNames(value: ClassNamesGenerator[NowIndicatorContentArg] => ClassNamesGenerator[NowIndicatorContentArg]): Self = StObject.set(x, "nowIndicatorClassNames", js.Any.fromFunction1(value))
    
    inline def setNowIndicatorContent(
      value: CustomContentGenerator[NowIndicatorContentArg] => CustomContentGenerator[NowIndicatorContentArg]
    ): Self = StObject.set(x, "nowIndicatorContent", js.Any.fromFunction1(value))
    
    inline def setNowIndicatorDidMount(value: DidMountHandler[NowIndicatorMountArg] => DidMountHandler[NowIndicatorMountArg]): Self = StObject.set(x, "nowIndicatorDidMount", js.Any.fromFunction1(value))
    
    inline def setNowIndicatorWillUnmount(value: WillUnmountHandler[NowIndicatorMountArg] => WillUnmountHandler[NowIndicatorMountArg]): Self = StObject.set(x, "nowIndicatorWillUnmount", js.Any.fromFunction1(value))
    
    inline def setPlugins(value: js.Array[PluginDef] => js.Array[PluginDef]): Self = StObject.set(x, "plugins", js.Any.fromFunction1(value))
    
    inline def setProgressiveEventRendering(value: BooleanConstructor): Self = StObject.set(x, "progressiveEventRendering", value.asInstanceOf[js.Any])
    
    inline def setRerenderDelay(value: NumberConstructor): Self = StObject.set(x, "rerenderDelay", value.asInstanceOf[js.Any])
    
    inline def setScrollTimeReset(value: BooleanConstructor): Self = StObject.set(x, "scrollTimeReset", value.asInstanceOf[js.Any])
    
    inline def setSelectAllow(value: AllowFunc => AllowFunc): Self = StObject.set(x, "selectAllow", js.Any.fromFunction1(value))
    
    inline def setSelectConstraint(value: ConstraintInput => ConstraintInput): Self = StObject.set(x, "selectConstraint", js.Any.fromFunction1(value))
    
    inline def setSelectLongPressDelay(value: NumberConstructor): Self = StObject.set(x, "selectLongPressDelay", value.asInstanceOf[js.Any])
    
    inline def setSelectMinDistance(value: NumberConstructor): Self = StObject.set(x, "selectMinDistance", value.asInstanceOf[js.Any])
    
    inline def setSelectMirror(value: BooleanConstructor): Self = StObject.set(x, "selectMirror", value.asInstanceOf[js.Any])
    
    inline def setSelectOverlap(value: Boolean | OverlapFunc => Boolean | OverlapFunc): Self = StObject.set(x, "selectOverlap", js.Any.fromFunction1(value))
    
    inline def setSelectable(value: BooleanConstructor): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setShowNonCurrentDates(value: BooleanConstructor): Self = StObject.set(x, "showNonCurrentDates", value.asInstanceOf[js.Any])
    
    inline def setSlotEventOverlap(value: BooleanConstructor): Self = StObject.set(x, "slotEventOverlap", value.asInstanceOf[js.Any])
    
    inline def setSlotLabelClassNames(value: ClassNamesGenerator[SlotLabelContentArg] => ClassNamesGenerator[SlotLabelContentArg]): Self = StObject.set(x, "slotLabelClassNames", js.Any.fromFunction1(value))
    
    inline def setSlotLabelContent(value: CustomContentGenerator[SlotLabelContentArg] => CustomContentGenerator[SlotLabelContentArg]): Self = StObject.set(x, "slotLabelContent", js.Any.fromFunction1(value))
    
    inline def setSlotLabelDidMount(value: DidMountHandler[SlotLabelMountArg] => DidMountHandler[SlotLabelMountArg]): Self = StObject.set(x, "slotLabelDidMount", js.Any.fromFunction1(value))
    
    inline def setSlotLabelFormat(value: FormatterInput | js.Array[FormatterInput] => FormatterInput | js.Array[FormatterInput]): Self = StObject.set(x, "slotLabelFormat", js.Any.fromFunction1(value))
    
    inline def setSlotLabelWillUnmount(value: WillUnmountHandler[SlotLabelMountArg] => WillUnmountHandler[SlotLabelMountArg]): Self = StObject.set(x, "slotLabelWillUnmount", js.Any.fromFunction1(value))
    
    inline def setSlotLaneClassNames(value: ClassNamesGenerator[SlotLaneContentArg] => ClassNamesGenerator[SlotLaneContentArg]): Self = StObject.set(x, "slotLaneClassNames", js.Any.fromFunction1(value))
    
    inline def setSlotLaneContent(value: CustomContentGenerator[SlotLaneContentArg] => CustomContentGenerator[SlotLaneContentArg]): Self = StObject.set(x, "slotLaneContent", js.Any.fromFunction1(value))
    
    inline def setSlotLaneDidMount(value: DidMountHandler[SlotLaneMountArg] => DidMountHandler[SlotLaneMountArg]): Self = StObject.set(x, "slotLaneDidMount", js.Any.fromFunction1(value))
    
    inline def setSlotLaneWillUnmount(value: WillUnmountHandler[SlotLaneMountArg] => WillUnmountHandler[SlotLaneMountArg]): Self = StObject.set(x, "slotLaneWillUnmount", js.Any.fromFunction1(value))
    
    inline def setSlotMinWidth(value: NumberConstructor): Self = StObject.set(x, "slotMinWidth", value.asInstanceOf[js.Any])
    
    inline def setStartParam(value: StringConstructor): Self = StObject.set(x, "startParam", value.asInstanceOf[js.Any])
    
    inline def setStickyFooterScrollbar(value: Boolean | auto => Boolean | auto): Self = StObject.set(x, "stickyFooterScrollbar", js.Any.fromFunction1(value))
    
    inline def setStickyHeaderDates(value: Boolean | auto => Boolean | auto): Self = StObject.set(x, "stickyHeaderDates", js.Any.fromFunction1(value))
    
    inline def setThemeSystem(value: String => String): Self = StObject.set(x, "themeSystem", js.Any.fromFunction1(value))
    
    inline def setTimeHint(value: StringConstructor): Self = StObject.set(x, "timeHint", value.asInstanceOf[js.Any])
    
    inline def setTimeZone(value: StringConstructor): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneParam(value: StringConstructor): Self = StObject.set(x, "timeZoneParam", value.asInstanceOf[js.Any])
    
    inline def setTitleFormat(value: FormatterInput => FormatterInput): Self = StObject.set(x, "titleFormat", js.Any.fromFunction1(value))
    
    inline def setTitleRangeSeparator(value: StringConstructor): Self = StObject.set(x, "titleRangeSeparator", value.asInstanceOf[js.Any])
    
    inline def setUnselectAuto(value: BooleanConstructor): Self = StObject.set(x, "unselectAuto", value.asInstanceOf[js.Any])
    
    inline def setUnselectCancel(value: StringConstructor): Self = StObject.set(x, "unselectCancel", value.asInstanceOf[js.Any])
    
    inline def setValidRange(
      value: DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput]) => DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput])
    ): Self = StObject.set(x, "validRange", js.Any.fromFunction1(value))
    
    inline def setViewClassNames(value: ClassNamesGenerator[ViewContentArg] => ClassNamesGenerator[ViewContentArg]): Self = StObject.set(x, "viewClassNames", js.Any.fromFunction1(value))
    
    inline def setViewDidMount(value: DidMountHandler[ViewMountArg] => DidMountHandler[ViewMountArg]): Self = StObject.set(x, "viewDidMount", js.Any.fromFunction1(value))
    
    inline def setViewHeight(value: CssDimValue => CssDimValue): Self = StObject.set(x, "viewHeight", js.Any.fromFunction1(value))
    
    inline def setViewHint(
      value: String | (js.Function1[/* repeated */ Any, String]) => String | (js.Function1[/* repeated */ Any, String])
    ): Self = StObject.set(x, "viewHint", js.Any.fromFunction1(value))
    
    inline def setViewWillUnmount(value: WillUnmountHandler[ViewMountArg] => WillUnmountHandler[ViewMountArg]): Self = StObject.set(x, "viewWillUnmount", js.Any.fromFunction1(value))
    
    inline def setVisibleRange(
      value: DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput]) => DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput])
    ): Self = StObject.set(x, "visibleRange", js.Any.fromFunction1(value))
    
    inline def setWeekNumberCalculation(value: WeekNumberCalculation => WeekNumberCalculation): Self = StObject.set(x, "weekNumberCalculation", js.Any.fromFunction1(value))
    
    inline def setWeekNumberClassNames(value: ClassNamesGenerator[WeekNumberContentArg] => ClassNamesGenerator[WeekNumberContentArg]): Self = StObject.set(x, "weekNumberClassNames", js.Any.fromFunction1(value))
    
    inline def setWeekNumberContent(
      value: CustomContentGenerator[WeekNumberContentArg] => CustomContentGenerator[WeekNumberContentArg]
    ): Self = StObject.set(x, "weekNumberContent", js.Any.fromFunction1(value))
    
    inline def setWeekNumberDidMount(value: DidMountHandler[WeekNumberMountArg] => DidMountHandler[WeekNumberMountArg]): Self = StObject.set(x, "weekNumberDidMount", js.Any.fromFunction1(value))
    
    inline def setWeekNumberWillUnmount(value: WillUnmountHandler[WeekNumberMountArg] => WillUnmountHandler[WeekNumberMountArg]): Self = StObject.set(x, "weekNumberWillUnmount", js.Any.fromFunction1(value))
    
    inline def setWeekNumbers(value: BooleanConstructor): Self = StObject.set(x, "weekNumbers", value.asInstanceOf[js.Any])
    
    inline def setWeekText(value: StringConstructor): Self = StObject.set(x, "weekText", value.asInstanceOf[js.Any])
    
    inline def setWeekTextLong(value: StringConstructor): Self = StObject.set(x, "weekTextLong", value.asInstanceOf[js.Any])
    
    inline def setWeekends(value: BooleanConstructor): Self = StObject.set(x, "weekends", value.asInstanceOf[js.Any])
    
    inline def setWindowResizeDelay(value: NumberConstructor): Self = StObject.set(x, "windowResizeDelay", value.asInstanceOf[js.Any])
  }
}
