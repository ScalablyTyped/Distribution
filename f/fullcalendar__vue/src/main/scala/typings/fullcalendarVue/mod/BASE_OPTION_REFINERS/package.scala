package typings.fullcalendarVue.mod.BASE_OPTION_REFINERS

import org.scalablytyped.runtime.StringDictionary
import typings.fullcalendarCommon.anon.FnCall
import typings.fullcalendarCommon.mod.AllDayContentArg
import typings.fullcalendarCommon.mod.AllDayMountArg
import typings.fullcalendarCommon.mod.AllowFunc
import typings.fullcalendarCommon.mod.BusinessHoursInput
import typings.fullcalendarCommon.mod.ButtonIconsInput
import typings.fullcalendarCommon.mod.CalendarApi
import typings.fullcalendarCommon.mod.ClassNamesGenerator
import typings.fullcalendarCommon.mod.ConstraintInput
import typings.fullcalendarCommon.mod.CssDimValue
import typings.fullcalendarCommon.mod.CustomButtonInput
import typings.fullcalendarCommon.mod.CustomContentGenerator
import typings.fullcalendarCommon.mod.DateFormatter
import typings.fullcalendarCommon.mod.DateInput
import typings.fullcalendarCommon.mod.DateRangeInput
import typings.fullcalendarCommon.mod.DayCellContentArg
import typings.fullcalendarCommon.mod.DayCellMountArg
import typings.fullcalendarCommon.mod.DayHeaderContentArg
import typings.fullcalendarCommon.mod.DayHeaderMountArg
import typings.fullcalendarCommon.mod.DidMountHandler
import typings.fullcalendarCommon.mod.Duration
import typings.fullcalendarCommon.mod.DurationInput
import typings.fullcalendarCommon.mod.EventContentArg
import typings.fullcalendarCommon.mod.EventInput
import typings.fullcalendarCommon.mod.EventInputTransformer
import typings.fullcalendarCommon.mod.EventMountArg
import typings.fullcalendarCommon.mod.FieldSpecInput
import typings.fullcalendarCommon.mod.FormatterInput
import typings.fullcalendarCommon.mod.Identity_
import typings.fullcalendarCommon.mod.LocaleInput
import typings.fullcalendarCommon.mod.LocaleSingularArg
import typings.fullcalendarCommon.mod.MoreLinkAction
import typings.fullcalendarCommon.mod.MoreLinkContentArg
import typings.fullcalendarCommon.mod.MoreLinkMountArg
import typings.fullcalendarCommon.mod.NowIndicatorContentArg
import typings.fullcalendarCommon.mod.NowIndicatorMountArg
import typings.fullcalendarCommon.mod.OrderSpec
import typings.fullcalendarCommon.mod.OverlapFunc
import typings.fullcalendarCommon.mod.PluginDef
import typings.fullcalendarCommon.mod.SlotLabelContentArg
import typings.fullcalendarCommon.mod.SlotLabelMountArg
import typings.fullcalendarCommon.mod.SlotLaneContentArg
import typings.fullcalendarCommon.mod.SlotLaneMountArg
import typings.fullcalendarCommon.mod.ToolbarInput
import typings.fullcalendarCommon.mod.ViewContentArg
import typings.fullcalendarCommon.mod.ViewMountArg
import typings.fullcalendarCommon.mod.WeekNumberCalculation
import typings.fullcalendarCommon.mod.WeekNumberContentArg
import typings.fullcalendarCommon.mod.WeekNumberMountArg
import typings.fullcalendarCommon.mod.WillUnmountHandler
import typings.fullcalendarVue.fullcalendarVueBooleans.`false`
import typings.fullcalendarVue.fullcalendarVueStrings.auto
import typings.fullcalendarVue.fullcalendarVueStrings.ltr
import typings.fullcalendarVue.fullcalendarVueStrings.rtl
import typings.fullcalendarVue.mod.BASE_OPTION_REFINERS.^
import typings.std.BooleanConstructor
import typings.std.NumberConstructor
import typings.std.StringConstructor
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def allDayClassNames: Identity_[ClassNamesGenerator[AllDayContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("allDayClassNames").asInstanceOf[Identity_[ClassNamesGenerator[AllDayContentArg]]]
inline def allDayClassNames(raw: ClassNamesGenerator[AllDayContentArg]): ClassNamesGenerator[AllDayContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDayClassNames")(raw.asInstanceOf[js.Any]).asInstanceOf[ClassNamesGenerator[AllDayContentArg]]
inline def allDayClassNames_=(x: Identity_[ClassNamesGenerator[AllDayContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allDayClassNames")(x.asInstanceOf[js.Any])

inline def allDayContent: Identity_[CustomContentGenerator[AllDayContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("allDayContent").asInstanceOf[Identity_[CustomContentGenerator[AllDayContentArg]]]
inline def allDayContent(raw: CustomContentGenerator[AllDayContentArg]): CustomContentGenerator[AllDayContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDayContent")(raw.asInstanceOf[js.Any]).asInstanceOf[CustomContentGenerator[AllDayContentArg]]
inline def allDayContent_=(x: Identity_[CustomContentGenerator[AllDayContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allDayContent")(x.asInstanceOf[js.Any])

inline def allDayDidMount: Identity_[DidMountHandler[AllDayMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("allDayDidMount").asInstanceOf[Identity_[DidMountHandler[AllDayMountArg]]]
inline def allDayDidMount(raw: DidMountHandler[AllDayMountArg]): DidMountHandler[AllDayMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDayDidMount")(raw.asInstanceOf[js.Any]).asInstanceOf[DidMountHandler[AllDayMountArg]]
inline def allDayDidMount_=(x: Identity_[DidMountHandler[AllDayMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allDayDidMount")(x.asInstanceOf[js.Any])

inline def allDayMaintainDuration_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("allDayMaintainDuration").asInstanceOf[BooleanConstructor]
inline def allDayMaintainDuration_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allDayMaintainDuration")(x.asInstanceOf[js.Any])

inline def allDayText_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("allDayText").asInstanceOf[StringConstructor]
inline def allDayText_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allDayText")(x.asInstanceOf[js.Any])

inline def allDayWillUnmount: Identity_[WillUnmountHandler[AllDayMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("allDayWillUnmount").asInstanceOf[Identity_[WillUnmountHandler[AllDayMountArg]]]
inline def allDayWillUnmount(raw: WillUnmountHandler[AllDayMountArg]): WillUnmountHandler[AllDayMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDayWillUnmount")(raw.asInstanceOf[js.Any]).asInstanceOf[WillUnmountHandler[AllDayMountArg]]
inline def allDayWillUnmount_=(x: Identity_[WillUnmountHandler[AllDayMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allDayWillUnmount")(x.asInstanceOf[js.Any])

inline def aspectRatio_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("aspectRatio").asInstanceOf[NumberConstructor]
inline def aspectRatio_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(x.asInstanceOf[js.Any])

inline def bootstrapFontAwesome: Identity_[`false` | ButtonIconsInput] = ^.asInstanceOf[js.Dynamic].selectDynamic("bootstrapFontAwesome").asInstanceOf[Identity_[`false` | ButtonIconsInput]]
inline def bootstrapFontAwesome(raw: ButtonIconsInput): `false` | ButtonIconsInput = ^.asInstanceOf[js.Dynamic].applyDynamic("bootstrapFontAwesome")(raw.asInstanceOf[js.Any]).asInstanceOf[`false` | ButtonIconsInput]
inline def bootstrapFontAwesome_=(x: Identity_[`false` | ButtonIconsInput]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bootstrapFontAwesome")(x.asInstanceOf[js.Any])

inline def bootstrapFontAwesome_false(raw: `false`): `false` | ButtonIconsInput = ^.asInstanceOf[js.Dynamic].applyDynamic("bootstrapFontAwesome")(raw.asInstanceOf[js.Any]).asInstanceOf[`false` | ButtonIconsInput]

inline def businessHours: Identity_[BusinessHoursInput] = ^.asInstanceOf[js.Dynamic].selectDynamic("businessHours").asInstanceOf[Identity_[BusinessHoursInput]]
inline def businessHours(raw: BusinessHoursInput): BusinessHoursInput = ^.asInstanceOf[js.Dynamic].applyDynamic("businessHours")(raw.asInstanceOf[js.Any]).asInstanceOf[BusinessHoursInput]
inline def businessHours_=(x: Identity_[BusinessHoursInput]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("businessHours")(x.asInstanceOf[js.Any])

inline def buttonIcons: Identity_[`false` | ButtonIconsInput] = ^.asInstanceOf[js.Dynamic].selectDynamic("buttonIcons").asInstanceOf[Identity_[`false` | ButtonIconsInput]]
inline def buttonIcons(raw: ButtonIconsInput): `false` | ButtonIconsInput = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonIcons")(raw.asInstanceOf[js.Any]).asInstanceOf[`false` | ButtonIconsInput]
inline def buttonIcons_=(x: Identity_[`false` | ButtonIconsInput]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buttonIcons")(x.asInstanceOf[js.Any])

inline def buttonIcons_false(raw: `false`): `false` | ButtonIconsInput = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonIcons")(raw.asInstanceOf[js.Any]).asInstanceOf[`false` | ButtonIconsInput]

inline def closeHint_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("closeHint").asInstanceOf[StringConstructor]
inline def closeHint_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeHint")(x.asInstanceOf[js.Any])

inline def contentHeight: Identity_[CssDimValue] = ^.asInstanceOf[js.Dynamic].selectDynamic("contentHeight").asInstanceOf[Identity_[CssDimValue]]
inline def contentHeight(raw: CssDimValue): CssDimValue = ^.asInstanceOf[js.Dynamic].applyDynamic("contentHeight")(raw.asInstanceOf[js.Any]).asInstanceOf[CssDimValue]
inline def contentHeight_=(x: Identity_[CssDimValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentHeight")(x.asInstanceOf[js.Any])

inline def customButtons: Identity_[StringDictionary[CustomButtonInput]] = ^.asInstanceOf[js.Dynamic].selectDynamic("customButtons").asInstanceOf[Identity_[StringDictionary[CustomButtonInput]]]
inline def customButtons(raw: StringDictionary[CustomButtonInput]): StringDictionary[CustomButtonInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("customButtons")(raw.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[CustomButtonInput]]
inline def customButtons_=(x: Identity_[StringDictionary[CustomButtonInput]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customButtons")(x.asInstanceOf[js.Any])

inline def dateAlignment_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("dateAlignment").asInstanceOf[StringConstructor]
inline def dateAlignment_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateAlignment")(x.asInstanceOf[js.Any])

inline def dateIncrement: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("dateIncrement").asInstanceOf[js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]]
inline def dateIncrement(input: DurationInput): Duration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("dateIncrement")(input.asInstanceOf[js.Any]).asInstanceOf[Duration | Null]
inline def dateIncrement(input: DurationInput, unit: String): Duration | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("dateIncrement")(input.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration | Null]
inline def dateIncrement_=(x: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateIncrement")(x.asInstanceOf[js.Any])

inline def dayCellClassNames: Identity_[ClassNamesGenerator[DayCellContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("dayCellClassNames").asInstanceOf[Identity_[ClassNamesGenerator[DayCellContentArg]]]
inline def dayCellClassNames(raw: ClassNamesGenerator[DayCellContentArg]): ClassNamesGenerator[DayCellContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("dayCellClassNames")(raw.asInstanceOf[js.Any]).asInstanceOf[ClassNamesGenerator[DayCellContentArg]]
inline def dayCellClassNames_=(x: Identity_[ClassNamesGenerator[DayCellContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayCellClassNames")(x.asInstanceOf[js.Any])

inline def dayCellContent: Identity_[CustomContentGenerator[DayCellContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("dayCellContent").asInstanceOf[Identity_[CustomContentGenerator[DayCellContentArg]]]
inline def dayCellContent(raw: CustomContentGenerator[DayCellContentArg]): CustomContentGenerator[DayCellContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("dayCellContent")(raw.asInstanceOf[js.Any]).asInstanceOf[CustomContentGenerator[DayCellContentArg]]
inline def dayCellContent_=(x: Identity_[CustomContentGenerator[DayCellContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayCellContent")(x.asInstanceOf[js.Any])

inline def dayCellDidMount: Identity_[DidMountHandler[DayCellMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("dayCellDidMount").asInstanceOf[Identity_[DidMountHandler[DayCellMountArg]]]
inline def dayCellDidMount(raw: DidMountHandler[DayCellMountArg]): DidMountHandler[DayCellMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("dayCellDidMount")(raw.asInstanceOf[js.Any]).asInstanceOf[DidMountHandler[DayCellMountArg]]
inline def dayCellDidMount_=(x: Identity_[DidMountHandler[DayCellMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayCellDidMount")(x.asInstanceOf[js.Any])

inline def dayCellWillUnmount: Identity_[WillUnmountHandler[DayCellMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("dayCellWillUnmount").asInstanceOf[Identity_[WillUnmountHandler[DayCellMountArg]]]
inline def dayCellWillUnmount(raw: WillUnmountHandler[DayCellMountArg]): WillUnmountHandler[DayCellMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("dayCellWillUnmount")(raw.asInstanceOf[js.Any]).asInstanceOf[WillUnmountHandler[DayCellMountArg]]
inline def dayCellWillUnmount_=(x: Identity_[WillUnmountHandler[DayCellMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayCellWillUnmount")(x.asInstanceOf[js.Any])

inline def dayCount_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("dayCount").asInstanceOf[NumberConstructor]
inline def dayCount_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayCount")(x.asInstanceOf[js.Any])

inline def dayHeaderClassNames: Identity_[ClassNamesGenerator[DayHeaderContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("dayHeaderClassNames").asInstanceOf[Identity_[ClassNamesGenerator[DayHeaderContentArg]]]
inline def dayHeaderClassNames(raw: ClassNamesGenerator[DayHeaderContentArg]): ClassNamesGenerator[DayHeaderContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("dayHeaderClassNames")(raw.asInstanceOf[js.Any]).asInstanceOf[ClassNamesGenerator[DayHeaderContentArg]]
inline def dayHeaderClassNames_=(x: Identity_[ClassNamesGenerator[DayHeaderContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderClassNames")(x.asInstanceOf[js.Any])

inline def dayHeaderContent: Identity_[CustomContentGenerator[DayHeaderContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("dayHeaderContent").asInstanceOf[Identity_[CustomContentGenerator[DayHeaderContentArg]]]
inline def dayHeaderContent(raw: CustomContentGenerator[DayHeaderContentArg]): CustomContentGenerator[DayHeaderContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("dayHeaderContent")(raw.asInstanceOf[js.Any]).asInstanceOf[CustomContentGenerator[DayHeaderContentArg]]
inline def dayHeaderContent_=(x: Identity_[CustomContentGenerator[DayHeaderContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderContent")(x.asInstanceOf[js.Any])

inline def dayHeaderDidMount: Identity_[DidMountHandler[DayHeaderMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("dayHeaderDidMount").asInstanceOf[Identity_[DidMountHandler[DayHeaderMountArg]]]
inline def dayHeaderDidMount(raw: DidMountHandler[DayHeaderMountArg]): DidMountHandler[DayHeaderMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("dayHeaderDidMount")(raw.asInstanceOf[js.Any]).asInstanceOf[DidMountHandler[DayHeaderMountArg]]
inline def dayHeaderDidMount_=(x: Identity_[DidMountHandler[DayHeaderMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderDidMount")(x.asInstanceOf[js.Any])

inline def dayHeaderFormat: js.Function1[/* input */ FormatterInput, DateFormatter] = ^.asInstanceOf[js.Dynamic].selectDynamic("dayHeaderFormat").asInstanceOf[js.Function1[/* input */ FormatterInput, DateFormatter]]
inline def dayHeaderFormat(input: FormatterInput): DateFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("dayHeaderFormat")(input.asInstanceOf[js.Any]).asInstanceOf[DateFormatter]
inline def dayHeaderFormat_=(x: js.Function1[/* input */ FormatterInput, DateFormatter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderFormat")(x.asInstanceOf[js.Any])

inline def dayHeaderWillUnmount: Identity_[WillUnmountHandler[DayHeaderMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("dayHeaderWillUnmount").asInstanceOf[Identity_[WillUnmountHandler[DayHeaderMountArg]]]
inline def dayHeaderWillUnmount(raw: WillUnmountHandler[DayHeaderMountArg]): WillUnmountHandler[DayHeaderMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("dayHeaderWillUnmount")(raw.asInstanceOf[js.Any]).asInstanceOf[WillUnmountHandler[DayHeaderMountArg]]
inline def dayHeaderWillUnmount_=(x: Identity_[WillUnmountHandler[DayHeaderMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderWillUnmount")(x.asInstanceOf[js.Any])

inline def dayHeaders_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("dayHeaders").asInstanceOf[BooleanConstructor]
inline def dayHeaders_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayHeaders")(x.asInstanceOf[js.Any])

inline def dayMaxEventRows: Identity_[Double | Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("dayMaxEventRows").asInstanceOf[Identity_[Double | Boolean]]
inline def dayMaxEventRows(raw: Boolean): Double | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dayMaxEventRows")(raw.asInstanceOf[js.Any]).asInstanceOf[Double | Boolean]
inline def dayMaxEventRows(raw: Double): Double | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dayMaxEventRows")(raw.asInstanceOf[js.Any]).asInstanceOf[Double | Boolean]
inline def dayMaxEventRows_=(x: Identity_[Double | Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayMaxEventRows")(x.asInstanceOf[js.Any])

inline def dayMaxEvents: Identity_[Double | Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("dayMaxEvents").asInstanceOf[Identity_[Double | Boolean]]
inline def dayMaxEvents(raw: Boolean): Double | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dayMaxEvents")(raw.asInstanceOf[js.Any]).asInstanceOf[Double | Boolean]
inline def dayMaxEvents(raw: Double): Double | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dayMaxEvents")(raw.asInstanceOf[js.Any]).asInstanceOf[Double | Boolean]
inline def dayMaxEvents_=(x: Identity_[Double | Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayMaxEvents")(x.asInstanceOf[js.Any])

inline def dayMinWidth_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("dayMinWidth").asInstanceOf[NumberConstructor]
inline def dayMinWidth_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayMinWidth")(x.asInstanceOf[js.Any])

inline def dayPopoverFormat: js.Function1[/* input */ FormatterInput, DateFormatter] = ^.asInstanceOf[js.Dynamic].selectDynamic("dayPopoverFormat").asInstanceOf[js.Function1[/* input */ FormatterInput, DateFormatter]]
inline def dayPopoverFormat(input: FormatterInput): DateFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("dayPopoverFormat")(input.asInstanceOf[js.Any]).asInstanceOf[DateFormatter]
inline def dayPopoverFormat_=(x: js.Function1[/* input */ FormatterInput, DateFormatter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayPopoverFormat")(x.asInstanceOf[js.Any])

inline def defaultAllDayEventDuration: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultAllDayEventDuration").asInstanceOf[js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]]
inline def defaultAllDayEventDuration(input: DurationInput): Duration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultAllDayEventDuration")(input.asInstanceOf[js.Any]).asInstanceOf[Duration | Null]
inline def defaultAllDayEventDuration(input: DurationInput, unit: String): Duration | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultAllDayEventDuration")(input.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration | Null]
inline def defaultAllDayEventDuration_=(x: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultAllDayEventDuration")(x.asInstanceOf[js.Any])

inline def defaultAllDay_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultAllDay").asInstanceOf[BooleanConstructor]
inline def defaultAllDay_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultAllDay")(x.asInstanceOf[js.Any])

inline def defaultRangeSeparator_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultRangeSeparator").asInstanceOf[StringConstructor]
inline def defaultRangeSeparator_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRangeSeparator")(x.asInstanceOf[js.Any])

inline def defaultTimedEventDuration: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultTimedEventDuration").asInstanceOf[js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]]
inline def defaultTimedEventDuration(input: DurationInput): Duration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultTimedEventDuration")(input.asInstanceOf[js.Any]).asInstanceOf[Duration | Null]
inline def defaultTimedEventDuration(input: DurationInput, unit: String): Duration | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTimedEventDuration")(input.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration | Null]
inline def defaultTimedEventDuration_=(x: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTimedEventDuration")(x.asInstanceOf[js.Any])

inline def direction: Identity_[ltr | rtl] = ^.asInstanceOf[js.Dynamic].selectDynamic("direction").asInstanceOf[Identity_[ltr | rtl]]
inline def direction(raw: ltr | rtl): ltr | rtl = ^.asInstanceOf[js.Dynamic].applyDynamic("direction")(raw.asInstanceOf[js.Any]).asInstanceOf[ltr | rtl]
inline def direction_=(x: Identity_[ltr | rtl]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])

inline def displayEventEnd_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("displayEventEnd").asInstanceOf[BooleanConstructor]
inline def displayEventEnd_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayEventEnd")(x.asInstanceOf[js.Any])

inline def displayEventTime_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("displayEventTime").asInstanceOf[BooleanConstructor]
inline def displayEventTime_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayEventTime")(x.asInstanceOf[js.Any])

inline def dragRevertDuration_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("dragRevertDuration").asInstanceOf[NumberConstructor]
inline def dragRevertDuration_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragRevertDuration")(x.asInstanceOf[js.Any])

inline def dragScroll_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("dragScroll").asInstanceOf[BooleanConstructor]
inline def dragScroll_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragScroll")(x.asInstanceOf[js.Any])

inline def dropAccept: Identity_[
String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean])] = ^.asInstanceOf[js.Dynamic].selectDynamic("dropAccept").asInstanceOf[Identity_[
String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean])]]
inline def dropAccept(raw: String): String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean]) = ^.asInstanceOf[js.Dynamic].applyDynamic("dropAccept")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean])]
inline def dropAccept(raw: js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean]): String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean]) = ^.asInstanceOf[js.Dynamic].applyDynamic("dropAccept")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean])]
inline def dropAccept_=(
  x: Identity_[
  String | (js.ThisFunction1[/* this */ CalendarApi, /* draggable */ Any, Boolean])
]
): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropAccept")(x.asInstanceOf[js.Any])

inline def droppable_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("droppable").asInstanceOf[BooleanConstructor]
inline def droppable_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("droppable")(x.asInstanceOf[js.Any])

inline def duration: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("duration").asInstanceOf[js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]]
inline def duration(input: DurationInput): Duration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("duration")(input.asInstanceOf[js.Any]).asInstanceOf[Duration | Null]
inline def duration(input: DurationInput, unit: String): Duration | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("duration")(input.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration | Null]
inline def duration_=(x: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("duration")(x.asInstanceOf[js.Any])

inline def editable_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("editable").asInstanceOf[BooleanConstructor]
inline def editable_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editable")(x.asInstanceOf[js.Any])

inline def endParam_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("endParam").asInstanceOf[StringConstructor]
inline def endParam_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endParam")(x.asInstanceOf[js.Any])

inline def eventAllow: Identity_[AllowFunc] = ^.asInstanceOf[js.Dynamic].selectDynamic("eventAllow").asInstanceOf[Identity_[AllowFunc]]
inline def eventAllow(raw: AllowFunc): AllowFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("eventAllow")(raw.asInstanceOf[js.Any]).asInstanceOf[AllowFunc]
inline def eventAllow_=(x: Identity_[AllowFunc]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventAllow")(x.asInstanceOf[js.Any])

inline def eventBackgroundColor_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventBackgroundColor").asInstanceOf[StringConstructor]
inline def eventBackgroundColor_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventBackgroundColor")(x.asInstanceOf[js.Any])

inline def eventBorderColor_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventBorderColor").asInstanceOf[StringConstructor]
inline def eventBorderColor_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventBorderColor")(x.asInstanceOf[js.Any])

inline def eventClassNames: Identity_[ClassNamesGenerator[EventContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("eventClassNames").asInstanceOf[Identity_[ClassNamesGenerator[EventContentArg]]]
inline def eventClassNames(raw: ClassNamesGenerator[EventContentArg]): ClassNamesGenerator[EventContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventClassNames")(raw.asInstanceOf[js.Any]).asInstanceOf[ClassNamesGenerator[EventContentArg]]
inline def eventClassNames_=(x: Identity_[ClassNamesGenerator[EventContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventClassNames")(x.asInstanceOf[js.Any])

inline def eventColor_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventColor").asInstanceOf[StringConstructor]
inline def eventColor_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventColor")(x.asInstanceOf[js.Any])

inline def eventConstraint: Identity_[ConstraintInput] = ^.asInstanceOf[js.Dynamic].selectDynamic("eventConstraint").asInstanceOf[Identity_[ConstraintInput]]
inline def eventConstraint(raw: ConstraintInput): ConstraintInput = ^.asInstanceOf[js.Dynamic].applyDynamic("eventConstraint")(raw.asInstanceOf[js.Any]).asInstanceOf[ConstraintInput]
inline def eventConstraint_=(x: Identity_[ConstraintInput]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventConstraint")(x.asInstanceOf[js.Any])

inline def eventContent: Identity_[CustomContentGenerator[EventContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("eventContent").asInstanceOf[Identity_[CustomContentGenerator[EventContentArg]]]
inline def eventContent(raw: CustomContentGenerator[EventContentArg]): CustomContentGenerator[EventContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventContent")(raw.asInstanceOf[js.Any]).asInstanceOf[CustomContentGenerator[EventContentArg]]
inline def eventContent_=(x: Identity_[CustomContentGenerator[EventContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventContent")(x.asInstanceOf[js.Any])

inline def eventDataTransform: Identity_[EventInputTransformer] = ^.asInstanceOf[js.Dynamic].selectDynamic("eventDataTransform").asInstanceOf[Identity_[EventInputTransformer]]
inline def eventDataTransform(raw: EventInputTransformer): EventInputTransformer = ^.asInstanceOf[js.Dynamic].applyDynamic("eventDataTransform")(raw.asInstanceOf[js.Any]).asInstanceOf[EventInputTransformer]
inline def eventDataTransform_=(x: Identity_[EventInputTransformer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventDataTransform")(x.asInstanceOf[js.Any])

inline def eventDidMount: Identity_[DidMountHandler[EventMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("eventDidMount").asInstanceOf[Identity_[DidMountHandler[EventMountArg]]]
inline def eventDidMount(raw: DidMountHandler[EventMountArg]): DidMountHandler[EventMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventDidMount")(raw.asInstanceOf[js.Any]).asInstanceOf[DidMountHandler[EventMountArg]]
inline def eventDidMount_=(x: Identity_[DidMountHandler[EventMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventDidMount")(x.asInstanceOf[js.Any])

inline def eventDisplay_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventDisplay").asInstanceOf[StringConstructor]
inline def eventDisplay_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventDisplay")(x.asInstanceOf[js.Any])

inline def eventDragMinDistance_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventDragMinDistance").asInstanceOf[NumberConstructor]
inline def eventDragMinDistance_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventDragMinDistance")(x.asInstanceOf[js.Any])

inline def eventDurationEditable_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventDurationEditable").asInstanceOf[BooleanConstructor]
inline def eventDurationEditable_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventDurationEditable")(x.asInstanceOf[js.Any])

inline def eventHint_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventHint").asInstanceOf[StringConstructor]
inline def eventHint_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventHint")(x.asInstanceOf[js.Any])

inline def eventInteractive_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventInteractive").asInstanceOf[BooleanConstructor]
inline def eventInteractive_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventInteractive")(x.asInstanceOf[js.Any])

inline def eventLongPressDelay_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventLongPressDelay").asInstanceOf[NumberConstructor]
inline def eventLongPressDelay_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventLongPressDelay")(x.asInstanceOf[js.Any])

inline def eventMaxStack_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventMaxStack").asInstanceOf[NumberConstructor]
inline def eventMaxStack_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventMaxStack")(x.asInstanceOf[js.Any])

inline def eventMinHeight_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventMinHeight").asInstanceOf[NumberConstructor]
inline def eventMinHeight_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventMinHeight")(x.asInstanceOf[js.Any])

inline def eventMinWidth_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventMinWidth").asInstanceOf[NumberConstructor]
inline def eventMinWidth_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventMinWidth")(x.asInstanceOf[js.Any])

inline def eventOrder: FnCall = ^.asInstanceOf[js.Dynamic].selectDynamic("eventOrder").asInstanceOf[FnCall]
inline def eventOrder[Subject](input: FieldSpecInput[Subject]): js.Array[OrderSpec[Subject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventOrder")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[OrderSpec[Subject]]]

inline def eventOrderStrict_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventOrderStrict").asInstanceOf[BooleanConstructor]
inline def eventOrderStrict_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventOrderStrict")(x.asInstanceOf[js.Any])

inline def eventOrder_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventOrder")(x.asInstanceOf[js.Any])

inline def eventOverlap: Identity_[Boolean | OverlapFunc] = ^.asInstanceOf[js.Dynamic].selectDynamic("eventOverlap").asInstanceOf[Identity_[Boolean | OverlapFunc]]
inline def eventOverlap(raw: Boolean): Boolean | OverlapFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("eventOverlap")(raw.asInstanceOf[js.Any]).asInstanceOf[Boolean | OverlapFunc]
inline def eventOverlap(raw: OverlapFunc): Boolean | OverlapFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("eventOverlap")(raw.asInstanceOf[js.Any]).asInstanceOf[Boolean | OverlapFunc]
inline def eventOverlap_=(x: Identity_[Boolean | OverlapFunc]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventOverlap")(x.asInstanceOf[js.Any])

inline def eventResizableFromStart_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventResizableFromStart").asInstanceOf[BooleanConstructor]
inline def eventResizableFromStart_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventResizableFromStart")(x.asInstanceOf[js.Any])

inline def eventShortHeight_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventShortHeight").asInstanceOf[NumberConstructor]
inline def eventShortHeight_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventShortHeight")(x.asInstanceOf[js.Any])

inline def eventSourceFailure: Identity_[js.ThisFunction1[/* this */ CalendarApi, /* error */ Any, Unit]] = ^.asInstanceOf[js.Dynamic].selectDynamic("eventSourceFailure").asInstanceOf[Identity_[js.ThisFunction1[/* this */ CalendarApi, /* error */ Any, Unit]]]
inline def eventSourceFailure(raw: js.ThisFunction1[/* this */ CalendarApi, /* error */ Any, Unit]): js.ThisFunction1[/* this */ CalendarApi, /* error */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventSourceFailure")(raw.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction1[/* this */ CalendarApi, /* error */ Any, Unit]]
inline def eventSourceFailure_=(x: Identity_[js.ThisFunction1[/* this */ CalendarApi, /* error */ Any, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventSourceFailure")(x.asInstanceOf[js.Any])

inline def eventSourceSuccess: Identity_[
js.ThisFunction2[
  /* this */ CalendarApi, 
  /* eventsInput */ js.Array[EventInput], 
  /* xhr */ js.UndefOr[XMLHttpRequest], 
  js.Array[EventInput] | Unit
]] = ^.asInstanceOf[js.Dynamic].selectDynamic("eventSourceSuccess").asInstanceOf[Identity_[
js.ThisFunction2[
  /* this */ CalendarApi, 
  /* eventsInput */ js.Array[EventInput], 
  /* xhr */ js.UndefOr[XMLHttpRequest], 
  js.Array[EventInput] | Unit
]]]
inline def eventSourceSuccess(
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
js.Array[EventInput] | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventSourceSuccess")(raw.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction2[
/* this */ CalendarApi, 
/* eventsInput */ js.Array[EventInput], 
/* xhr */ js.UndefOr[XMLHttpRequest], 
js.Array[EventInput] | Unit]]
inline def eventSourceSuccess_=(
  x: Identity_[
  js.ThisFunction2[
    /* this */ CalendarApi, 
    /* eventsInput */ js.Array[EventInput], 
    /* xhr */ js.UndefOr[XMLHttpRequest], 
    js.Array[EventInput] | Unit
  ]
]
): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventSourceSuccess")(x.asInstanceOf[js.Any])

inline def eventStartEditable_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventStartEditable").asInstanceOf[BooleanConstructor]
inline def eventStartEditable_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventStartEditable")(x.asInstanceOf[js.Any])

inline def eventTextColor_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("eventTextColor").asInstanceOf[StringConstructor]
inline def eventTextColor_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventTextColor")(x.asInstanceOf[js.Any])

inline def eventTimeFormat: js.Function1[/* input */ FormatterInput, DateFormatter] = ^.asInstanceOf[js.Dynamic].selectDynamic("eventTimeFormat").asInstanceOf[js.Function1[/* input */ FormatterInput, DateFormatter]]
inline def eventTimeFormat(input: FormatterInput): DateFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("eventTimeFormat")(input.asInstanceOf[js.Any]).asInstanceOf[DateFormatter]
inline def eventTimeFormat_=(x: js.Function1[/* input */ FormatterInput, DateFormatter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventTimeFormat")(x.asInstanceOf[js.Any])

inline def eventWillUnmount: Identity_[WillUnmountHandler[EventMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("eventWillUnmount").asInstanceOf[Identity_[WillUnmountHandler[EventMountArg]]]
inline def eventWillUnmount(raw: WillUnmountHandler[EventMountArg]): WillUnmountHandler[EventMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventWillUnmount")(raw.asInstanceOf[js.Any]).asInstanceOf[WillUnmountHandler[EventMountArg]]
inline def eventWillUnmount_=(x: Identity_[WillUnmountHandler[EventMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventWillUnmount")(x.asInstanceOf[js.Any])

inline def expandRows_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("expandRows").asInstanceOf[BooleanConstructor]
inline def expandRows_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expandRows")(x.asInstanceOf[js.Any])

inline def firstDay_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("firstDay").asInstanceOf[NumberConstructor]
inline def firstDay_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(x.asInstanceOf[js.Any])

inline def fixedWeekCount_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("fixedWeekCount").asInstanceOf[BooleanConstructor]
inline def fixedWeekCount_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixedWeekCount")(x.asInstanceOf[js.Any])

inline def footerToolbar: Identity_[`false` | ToolbarInput] = ^.asInstanceOf[js.Dynamic].selectDynamic("footerToolbar").asInstanceOf[Identity_[`false` | ToolbarInput]]
inline def footerToolbar(raw: ToolbarInput): `false` | ToolbarInput = ^.asInstanceOf[js.Dynamic].applyDynamic("footerToolbar")(raw.asInstanceOf[js.Any]).asInstanceOf[`false` | ToolbarInput]
inline def footerToolbar_=(x: Identity_[`false` | ToolbarInput]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footerToolbar")(x.asInstanceOf[js.Any])

inline def footerToolbar_false(raw: `false`): `false` | ToolbarInput = ^.asInstanceOf[js.Dynamic].applyDynamic("footerToolbar")(raw.asInstanceOf[js.Any]).asInstanceOf[`false` | ToolbarInput]

inline def forceEventDuration_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("forceEventDuration").asInstanceOf[BooleanConstructor]
inline def forceEventDuration_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceEventDuration")(x.asInstanceOf[js.Any])

inline def handleWindowResize_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("handleWindowResize").asInstanceOf[BooleanConstructor]
inline def handleWindowResize_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleWindowResize")(x.asInstanceOf[js.Any])

inline def headerToolbar: Identity_[`false` | ToolbarInput] = ^.asInstanceOf[js.Dynamic].selectDynamic("headerToolbar").asInstanceOf[Identity_[`false` | ToolbarInput]]
inline def headerToolbar(raw: ToolbarInput): `false` | ToolbarInput = ^.asInstanceOf[js.Dynamic].applyDynamic("headerToolbar")(raw.asInstanceOf[js.Any]).asInstanceOf[`false` | ToolbarInput]
inline def headerToolbar_=(x: Identity_[`false` | ToolbarInput]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerToolbar")(x.asInstanceOf[js.Any])

inline def headerToolbar_false(raw: `false`): `false` | ToolbarInput = ^.asInstanceOf[js.Dynamic].applyDynamic("headerToolbar")(raw.asInstanceOf[js.Any]).asInstanceOf[`false` | ToolbarInput]

inline def height: Identity_[CssDimValue] = ^.asInstanceOf[js.Dynamic].selectDynamic("height").asInstanceOf[Identity_[CssDimValue]]
inline def height(raw: CssDimValue): CssDimValue = ^.asInstanceOf[js.Dynamic].applyDynamic("height")(raw.asInstanceOf[js.Any]).asInstanceOf[CssDimValue]
inline def height_=(x: Identity_[CssDimValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])

inline def hiddenDays: Identity_[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].selectDynamic("hiddenDays").asInstanceOf[Identity_[js.Array[Double]]]
inline def hiddenDays(raw: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("hiddenDays")(raw.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
inline def hiddenDays_=(x: Identity_[js.Array[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hiddenDays")(x.asInstanceOf[js.Any])

inline def initialDate: Identity_[DateInput] = ^.asInstanceOf[js.Dynamic].selectDynamic("initialDate").asInstanceOf[Identity_[DateInput]]
inline def initialDate(raw: DateInput): DateInput = ^.asInstanceOf[js.Dynamic].applyDynamic("initialDate")(raw.asInstanceOf[js.Any]).asInstanceOf[DateInput]
inline def initialDate_=(x: Identity_[DateInput]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialDate")(x.asInstanceOf[js.Any])

inline def initialView_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("initialView").asInstanceOf[StringConstructor]
inline def initialView_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialView")(x.asInstanceOf[js.Any])

inline def lazyFetching_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("lazyFetching").asInstanceOf[BooleanConstructor]
inline def lazyFetching_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lazyFetching")(x.asInstanceOf[js.Any])

inline def locale: Identity_[LocaleSingularArg] = ^.asInstanceOf[js.Dynamic].selectDynamic("locale").asInstanceOf[Identity_[LocaleSingularArg]]
inline def locale(raw: LocaleSingularArg): LocaleSingularArg = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(raw.asInstanceOf[js.Any]).asInstanceOf[LocaleSingularArg]
inline def locale_=(x: Identity_[LocaleSingularArg]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])

inline def locales: Identity_[js.Array[LocaleInput]] = ^.asInstanceOf[js.Dynamic].selectDynamic("locales").asInstanceOf[Identity_[js.Array[LocaleInput]]]
inline def locales(raw: js.Array[LocaleInput]): js.Array[LocaleInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("locales")(raw.asInstanceOf[js.Any]).asInstanceOf[js.Array[LocaleInput]]
inline def locales_=(x: Identity_[js.Array[LocaleInput]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locales")(x.asInstanceOf[js.Any])

inline def longPressDelay_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("longPressDelay").asInstanceOf[NumberConstructor]
inline def longPressDelay_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longPressDelay")(x.asInstanceOf[js.Any])

inline def monthMode_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("monthMode").asInstanceOf[BooleanConstructor]
inline def monthMode_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthMode")(x.asInstanceOf[js.Any])

inline def moreLinkClassNames: Identity_[ClassNamesGenerator[MoreLinkContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("moreLinkClassNames").asInstanceOf[Identity_[ClassNamesGenerator[MoreLinkContentArg]]]
inline def moreLinkClassNames(raw: ClassNamesGenerator[MoreLinkContentArg]): ClassNamesGenerator[MoreLinkContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("moreLinkClassNames")(raw.asInstanceOf[js.Any]).asInstanceOf[ClassNamesGenerator[MoreLinkContentArg]]
inline def moreLinkClassNames_=(x: Identity_[ClassNamesGenerator[MoreLinkContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moreLinkClassNames")(x.asInstanceOf[js.Any])

inline def moreLinkClick: Identity_[MoreLinkAction] = ^.asInstanceOf[js.Dynamic].selectDynamic("moreLinkClick").asInstanceOf[Identity_[MoreLinkAction]]
inline def moreLinkClick(raw: MoreLinkAction): MoreLinkAction = ^.asInstanceOf[js.Dynamic].applyDynamic("moreLinkClick")(raw.asInstanceOf[js.Any]).asInstanceOf[MoreLinkAction]
inline def moreLinkClick_=(x: Identity_[MoreLinkAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moreLinkClick")(x.asInstanceOf[js.Any])

inline def moreLinkContent: Identity_[CustomContentGenerator[MoreLinkContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("moreLinkContent").asInstanceOf[Identity_[CustomContentGenerator[MoreLinkContentArg]]]
inline def moreLinkContent(raw: CustomContentGenerator[MoreLinkContentArg]): CustomContentGenerator[MoreLinkContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("moreLinkContent")(raw.asInstanceOf[js.Any]).asInstanceOf[CustomContentGenerator[MoreLinkContentArg]]
inline def moreLinkContent_=(x: Identity_[CustomContentGenerator[MoreLinkContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moreLinkContent")(x.asInstanceOf[js.Any])

inline def moreLinkDidMount: Identity_[DidMountHandler[MoreLinkMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("moreLinkDidMount").asInstanceOf[Identity_[DidMountHandler[MoreLinkMountArg]]]
inline def moreLinkDidMount(raw: DidMountHandler[MoreLinkMountArg]): DidMountHandler[MoreLinkMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("moreLinkDidMount")(raw.asInstanceOf[js.Any]).asInstanceOf[DidMountHandler[MoreLinkMountArg]]
inline def moreLinkDidMount_=(x: Identity_[DidMountHandler[MoreLinkMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moreLinkDidMount")(x.asInstanceOf[js.Any])

inline def moreLinkHint: Identity_[String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])] = ^.asInstanceOf[js.Dynamic].selectDynamic("moreLinkHint").asInstanceOf[Identity_[String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])]]
inline def moreLinkHint(raw: String): String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]) = ^.asInstanceOf[js.Dynamic].applyDynamic("moreLinkHint")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])]
inline def moreLinkHint(raw: js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]): String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]) = ^.asInstanceOf[js.Dynamic].applyDynamic("moreLinkHint")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])]
inline def moreLinkHint_=(x: Identity_[String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moreLinkHint")(x.asInstanceOf[js.Any])

inline def moreLinkText: Identity_[String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])] = ^.asInstanceOf[js.Dynamic].selectDynamic("moreLinkText").asInstanceOf[Identity_[String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])]]
inline def moreLinkText(raw: String): String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]) = ^.asInstanceOf[js.Dynamic].applyDynamic("moreLinkText")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])]
inline def moreLinkText(raw: js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]): String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String]) = ^.asInstanceOf[js.Dynamic].applyDynamic("moreLinkText")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])]
inline def moreLinkText_=(x: Identity_[String | (js.ThisFunction1[/* this */ CalendarApi, /* num */ Double, String])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moreLinkText")(x.asInstanceOf[js.Any])

inline def moreLinkWillUnmount: Identity_[WillUnmountHandler[MoreLinkMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("moreLinkWillUnmount").asInstanceOf[Identity_[WillUnmountHandler[MoreLinkMountArg]]]
inline def moreLinkWillUnmount(raw: WillUnmountHandler[MoreLinkMountArg]): WillUnmountHandler[MoreLinkMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("moreLinkWillUnmount")(raw.asInstanceOf[js.Any]).asInstanceOf[WillUnmountHandler[MoreLinkMountArg]]
inline def moreLinkWillUnmount_=(x: Identity_[WillUnmountHandler[MoreLinkMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moreLinkWillUnmount")(x.asInstanceOf[js.Any])

inline def navLinkDayClick: Identity_[
String | (js.ThisFunction2[
  /* this */ CalendarApi, 
  /* date */ js.Date, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
  Unit
])] = ^.asInstanceOf[js.Dynamic].selectDynamic("navLinkDayClick").asInstanceOf[Identity_[
String | (js.ThisFunction2[
  /* this */ CalendarApi, 
  /* date */ js.Date, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
  Unit
])]]
inline def navLinkDayClick(raw: String): String | (js.ThisFunction2[
/* this */ CalendarApi, 
/* date */ js.Date, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("navLinkDayClick")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.ThisFunction2[
/* this */ CalendarApi, 
/* date */ js.Date, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
Unit])]
inline def navLinkDayClick(
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
Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("navLinkDayClick")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.ThisFunction2[
/* this */ CalendarApi, 
/* date */ js.Date, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
Unit])]
inline def navLinkDayClick_=(
  x: Identity_[
  String | (js.ThisFunction2[
    /* this */ CalendarApi, 
    /* date */ js.Date, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
    Unit
  ])
]
): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navLinkDayClick")(x.asInstanceOf[js.Any])

inline def navLinkHint: Identity_[String | (js.Function1[/* repeated */ Any, String])] = ^.asInstanceOf[js.Dynamic].selectDynamic("navLinkHint").asInstanceOf[Identity_[String | (js.Function1[/* repeated */ Any, String])]]
inline def navLinkHint(raw: String): String | (js.Function1[/* repeated */ Any, String]) = ^.asInstanceOf[js.Dynamic].applyDynamic("navLinkHint")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.Function1[/* repeated */ Any, String])]
inline def navLinkHint(raw: js.Function1[/* repeated */ Any, String]): String | (js.Function1[/* repeated */ Any, String]) = ^.asInstanceOf[js.Dynamic].applyDynamic("navLinkHint")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.Function1[/* repeated */ Any, String])]
inline def navLinkHint_=(x: Identity_[String | (js.Function1[/* repeated */ Any, String])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navLinkHint")(x.asInstanceOf[js.Any])

inline def navLinkWeekClick: Identity_[
String | (js.ThisFunction2[
  /* this */ CalendarApi, 
  /* weekStart */ js.Date, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
  Unit
])] = ^.asInstanceOf[js.Dynamic].selectDynamic("navLinkWeekClick").asInstanceOf[Identity_[
String | (js.ThisFunction2[
  /* this */ CalendarApi, 
  /* weekStart */ js.Date, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
  Unit
])]]
inline def navLinkWeekClick(raw: String): String | (js.ThisFunction2[
/* this */ CalendarApi, 
/* weekStart */ js.Date, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("navLinkWeekClick")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.ThisFunction2[
/* this */ CalendarApi, 
/* weekStart */ js.Date, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
Unit])]
inline def navLinkWeekClick(
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
Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("navLinkWeekClick")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.ThisFunction2[
/* this */ CalendarApi, 
/* weekStart */ js.Date, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
Unit])]
inline def navLinkWeekClick_=(
  x: Identity_[
  String | (js.ThisFunction2[
    /* this */ CalendarApi, 
    /* weekStart */ js.Date, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VUIEvent */ /* jsEvent */ Any, 
    Unit
  ])
]
): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navLinkWeekClick")(x.asInstanceOf[js.Any])

inline def navLinks_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("navLinks").asInstanceOf[BooleanConstructor]
inline def navLinks_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navLinks")(x.asInstanceOf[js.Any])

inline def nextDayThreshold: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("nextDayThreshold").asInstanceOf[js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]]
inline def nextDayThreshold(input: DurationInput): Duration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("nextDayThreshold")(input.asInstanceOf[js.Any]).asInstanceOf[Duration | Null]
inline def nextDayThreshold(input: DurationInput, unit: String): Duration | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("nextDayThreshold")(input.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration | Null]
inline def nextDayThreshold_=(x: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextDayThreshold")(x.asInstanceOf[js.Any])

inline def noEventsText_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("noEventsText").asInstanceOf[StringConstructor]
inline def noEventsText_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noEventsText")(x.asInstanceOf[js.Any])

inline def now: Identity_[DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput])] = ^.asInstanceOf[js.Dynamic].selectDynamic("now").asInstanceOf[Identity_[DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput])]]
inline def now(raw: js.ThisFunction0[/* this */ CalendarApi, DateInput]): DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput]) = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(raw.asInstanceOf[js.Any]).asInstanceOf[DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput])]
inline def now(raw: DateInput): DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput]) = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(raw.asInstanceOf[js.Any]).asInstanceOf[DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput])]

inline def nowIndicatorClassNames: Identity_[ClassNamesGenerator[NowIndicatorContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("nowIndicatorClassNames").asInstanceOf[Identity_[ClassNamesGenerator[NowIndicatorContentArg]]]
inline def nowIndicatorClassNames(raw: ClassNamesGenerator[NowIndicatorContentArg]): ClassNamesGenerator[NowIndicatorContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("nowIndicatorClassNames")(raw.asInstanceOf[js.Any]).asInstanceOf[ClassNamesGenerator[NowIndicatorContentArg]]
inline def nowIndicatorClassNames_=(x: Identity_[ClassNamesGenerator[NowIndicatorContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nowIndicatorClassNames")(x.asInstanceOf[js.Any])

inline def nowIndicatorContent: Identity_[CustomContentGenerator[NowIndicatorContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("nowIndicatorContent").asInstanceOf[Identity_[CustomContentGenerator[NowIndicatorContentArg]]]
inline def nowIndicatorContent(raw: CustomContentGenerator[NowIndicatorContentArg]): CustomContentGenerator[NowIndicatorContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("nowIndicatorContent")(raw.asInstanceOf[js.Any]).asInstanceOf[CustomContentGenerator[NowIndicatorContentArg]]
inline def nowIndicatorContent_=(x: Identity_[CustomContentGenerator[NowIndicatorContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nowIndicatorContent")(x.asInstanceOf[js.Any])

inline def nowIndicatorDidMount: Identity_[DidMountHandler[NowIndicatorMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("nowIndicatorDidMount").asInstanceOf[Identity_[DidMountHandler[NowIndicatorMountArg]]]
inline def nowIndicatorDidMount(raw: DidMountHandler[NowIndicatorMountArg]): DidMountHandler[NowIndicatorMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("nowIndicatorDidMount")(raw.asInstanceOf[js.Any]).asInstanceOf[DidMountHandler[NowIndicatorMountArg]]
inline def nowIndicatorDidMount_=(x: Identity_[DidMountHandler[NowIndicatorMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nowIndicatorDidMount")(x.asInstanceOf[js.Any])

inline def nowIndicatorWillUnmount: Identity_[WillUnmountHandler[NowIndicatorMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("nowIndicatorWillUnmount").asInstanceOf[Identity_[WillUnmountHandler[NowIndicatorMountArg]]]
inline def nowIndicatorWillUnmount(raw: WillUnmountHandler[NowIndicatorMountArg]): WillUnmountHandler[NowIndicatorMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("nowIndicatorWillUnmount")(raw.asInstanceOf[js.Any]).asInstanceOf[WillUnmountHandler[NowIndicatorMountArg]]
inline def nowIndicatorWillUnmount_=(x: Identity_[WillUnmountHandler[NowIndicatorMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nowIndicatorWillUnmount")(x.asInstanceOf[js.Any])

inline def nowIndicator_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("nowIndicator").asInstanceOf[BooleanConstructor]
inline def nowIndicator_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nowIndicator")(x.asInstanceOf[js.Any])

inline def now_=(x: Identity_[DateInput | (js.ThisFunction0[/* this */ CalendarApi, DateInput])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("now")(x.asInstanceOf[js.Any])

inline def plugins: Identity_[js.Array[PluginDef]] = ^.asInstanceOf[js.Dynamic].selectDynamic("plugins").asInstanceOf[Identity_[js.Array[PluginDef]]]
inline def plugins(raw: js.Array[PluginDef]): js.Array[PluginDef] = ^.asInstanceOf[js.Dynamic].applyDynamic("plugins")(raw.asInstanceOf[js.Any]).asInstanceOf[js.Array[PluginDef]]
inline def plugins_=(x: Identity_[js.Array[PluginDef]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])

inline def progressiveEventRendering_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("progressiveEventRendering").asInstanceOf[BooleanConstructor]
inline def progressiveEventRendering_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progressiveEventRendering")(x.asInstanceOf[js.Any])

inline def rerenderDelay_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("rerenderDelay").asInstanceOf[NumberConstructor]
inline def rerenderDelay_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rerenderDelay")(x.asInstanceOf[js.Any])

inline def scrollTime: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("scrollTime").asInstanceOf[js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]]
inline def scrollTime(input: DurationInput): Duration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollTime")(input.asInstanceOf[js.Any]).asInstanceOf[Duration | Null]
inline def scrollTime(input: DurationInput, unit: String): Duration | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTime")(input.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration | Null]

inline def scrollTimeReset_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("scrollTimeReset").asInstanceOf[BooleanConstructor]
inline def scrollTimeReset_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollTimeReset")(x.asInstanceOf[js.Any])

inline def scrollTime_=(x: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollTime")(x.asInstanceOf[js.Any])

inline def selectAllow: Identity_[AllowFunc] = ^.asInstanceOf[js.Dynamic].selectDynamic("selectAllow").asInstanceOf[Identity_[AllowFunc]]
inline def selectAllow(raw: AllowFunc): AllowFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("selectAllow")(raw.asInstanceOf[js.Any]).asInstanceOf[AllowFunc]
inline def selectAllow_=(x: Identity_[AllowFunc]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectAllow")(x.asInstanceOf[js.Any])

inline def selectConstraint: Identity_[ConstraintInput] = ^.asInstanceOf[js.Dynamic].selectDynamic("selectConstraint").asInstanceOf[Identity_[ConstraintInput]]
inline def selectConstraint(raw: ConstraintInput): ConstraintInput = ^.asInstanceOf[js.Dynamic].applyDynamic("selectConstraint")(raw.asInstanceOf[js.Any]).asInstanceOf[ConstraintInput]
inline def selectConstraint_=(x: Identity_[ConstraintInput]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectConstraint")(x.asInstanceOf[js.Any])

inline def selectLongPressDelay_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("selectLongPressDelay").asInstanceOf[NumberConstructor]
inline def selectLongPressDelay_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectLongPressDelay")(x.asInstanceOf[js.Any])

inline def selectMinDistance_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("selectMinDistance").asInstanceOf[NumberConstructor]
inline def selectMinDistance_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectMinDistance")(x.asInstanceOf[js.Any])

inline def selectMirror_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("selectMirror").asInstanceOf[BooleanConstructor]
inline def selectMirror_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectMirror")(x.asInstanceOf[js.Any])

inline def selectOverlap: Identity_[Boolean | OverlapFunc] = ^.asInstanceOf[js.Dynamic].selectDynamic("selectOverlap").asInstanceOf[Identity_[Boolean | OverlapFunc]]
inline def selectOverlap(raw: Boolean): Boolean | OverlapFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("selectOverlap")(raw.asInstanceOf[js.Any]).asInstanceOf[Boolean | OverlapFunc]
inline def selectOverlap(raw: OverlapFunc): Boolean | OverlapFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("selectOverlap")(raw.asInstanceOf[js.Any]).asInstanceOf[Boolean | OverlapFunc]
inline def selectOverlap_=(x: Identity_[Boolean | OverlapFunc]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectOverlap")(x.asInstanceOf[js.Any])

inline def selectable_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("selectable").asInstanceOf[BooleanConstructor]
inline def selectable_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectable")(x.asInstanceOf[js.Any])

inline def showNonCurrentDates_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("showNonCurrentDates").asInstanceOf[BooleanConstructor]
inline def showNonCurrentDates_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showNonCurrentDates")(x.asInstanceOf[js.Any])

inline def slotDuration: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("slotDuration").asInstanceOf[js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]]
inline def slotDuration(input: DurationInput): Duration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("slotDuration")(input.asInstanceOf[js.Any]).asInstanceOf[Duration | Null]
inline def slotDuration(input: DurationInput, unit: String): Duration | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("slotDuration")(input.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration | Null]
inline def slotDuration_=(x: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotDuration")(x.asInstanceOf[js.Any])

inline def slotEventOverlap_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("slotEventOverlap").asInstanceOf[BooleanConstructor]
inline def slotEventOverlap_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotEventOverlap")(x.asInstanceOf[js.Any])

inline def slotLabelClassNames: Identity_[ClassNamesGenerator[SlotLabelContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("slotLabelClassNames").asInstanceOf[Identity_[ClassNamesGenerator[SlotLabelContentArg]]]
inline def slotLabelClassNames(raw: ClassNamesGenerator[SlotLabelContentArg]): ClassNamesGenerator[SlotLabelContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("slotLabelClassNames")(raw.asInstanceOf[js.Any]).asInstanceOf[ClassNamesGenerator[SlotLabelContentArg]]
inline def slotLabelClassNames_=(x: Identity_[ClassNamesGenerator[SlotLabelContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotLabelClassNames")(x.asInstanceOf[js.Any])

inline def slotLabelContent: Identity_[CustomContentGenerator[SlotLabelContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("slotLabelContent").asInstanceOf[Identity_[CustomContentGenerator[SlotLabelContentArg]]]
inline def slotLabelContent(raw: CustomContentGenerator[SlotLabelContentArg]): CustomContentGenerator[SlotLabelContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("slotLabelContent")(raw.asInstanceOf[js.Any]).asInstanceOf[CustomContentGenerator[SlotLabelContentArg]]
inline def slotLabelContent_=(x: Identity_[CustomContentGenerator[SlotLabelContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotLabelContent")(x.asInstanceOf[js.Any])

inline def slotLabelDidMount: Identity_[DidMountHandler[SlotLabelMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("slotLabelDidMount").asInstanceOf[Identity_[DidMountHandler[SlotLabelMountArg]]]
inline def slotLabelDidMount(raw: DidMountHandler[SlotLabelMountArg]): DidMountHandler[SlotLabelMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("slotLabelDidMount")(raw.asInstanceOf[js.Any]).asInstanceOf[DidMountHandler[SlotLabelMountArg]]
inline def slotLabelDidMount_=(x: Identity_[DidMountHandler[SlotLabelMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotLabelDidMount")(x.asInstanceOf[js.Any])

inline def slotLabelFormat: Identity_[FormatterInput | js.Array[FormatterInput]] = ^.asInstanceOf[js.Dynamic].selectDynamic("slotLabelFormat").asInstanceOf[Identity_[FormatterInput | js.Array[FormatterInput]]]
inline def slotLabelFormat(raw: js.Array[FormatterInput]): FormatterInput | js.Array[FormatterInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("slotLabelFormat")(raw.asInstanceOf[js.Any]).asInstanceOf[FormatterInput | js.Array[FormatterInput]]
inline def slotLabelFormat(raw: FormatterInput): FormatterInput | js.Array[FormatterInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("slotLabelFormat")(raw.asInstanceOf[js.Any]).asInstanceOf[FormatterInput | js.Array[FormatterInput]]
inline def slotLabelFormat_=(x: Identity_[FormatterInput | js.Array[FormatterInput]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotLabelFormat")(x.asInstanceOf[js.Any])

inline def slotLabelInterval: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("slotLabelInterval").asInstanceOf[js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]]
inline def slotLabelInterval(input: DurationInput): Duration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("slotLabelInterval")(input.asInstanceOf[js.Any]).asInstanceOf[Duration | Null]
inline def slotLabelInterval(input: DurationInput, unit: String): Duration | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("slotLabelInterval")(input.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration | Null]
inline def slotLabelInterval_=(x: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotLabelInterval")(x.asInstanceOf[js.Any])

inline def slotLabelWillUnmount: Identity_[WillUnmountHandler[SlotLabelMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("slotLabelWillUnmount").asInstanceOf[Identity_[WillUnmountHandler[SlotLabelMountArg]]]
inline def slotLabelWillUnmount(raw: WillUnmountHandler[SlotLabelMountArg]): WillUnmountHandler[SlotLabelMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("slotLabelWillUnmount")(raw.asInstanceOf[js.Any]).asInstanceOf[WillUnmountHandler[SlotLabelMountArg]]
inline def slotLabelWillUnmount_=(x: Identity_[WillUnmountHandler[SlotLabelMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotLabelWillUnmount")(x.asInstanceOf[js.Any])

inline def slotLaneClassNames: Identity_[ClassNamesGenerator[SlotLaneContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("slotLaneClassNames").asInstanceOf[Identity_[ClassNamesGenerator[SlotLaneContentArg]]]
inline def slotLaneClassNames(raw: ClassNamesGenerator[SlotLaneContentArg]): ClassNamesGenerator[SlotLaneContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("slotLaneClassNames")(raw.asInstanceOf[js.Any]).asInstanceOf[ClassNamesGenerator[SlotLaneContentArg]]
inline def slotLaneClassNames_=(x: Identity_[ClassNamesGenerator[SlotLaneContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotLaneClassNames")(x.asInstanceOf[js.Any])

inline def slotLaneContent: Identity_[CustomContentGenerator[SlotLaneContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("slotLaneContent").asInstanceOf[Identity_[CustomContentGenerator[SlotLaneContentArg]]]
inline def slotLaneContent(raw: CustomContentGenerator[SlotLaneContentArg]): CustomContentGenerator[SlotLaneContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("slotLaneContent")(raw.asInstanceOf[js.Any]).asInstanceOf[CustomContentGenerator[SlotLaneContentArg]]
inline def slotLaneContent_=(x: Identity_[CustomContentGenerator[SlotLaneContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotLaneContent")(x.asInstanceOf[js.Any])

inline def slotLaneDidMount: Identity_[DidMountHandler[SlotLaneMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("slotLaneDidMount").asInstanceOf[Identity_[DidMountHandler[SlotLaneMountArg]]]
inline def slotLaneDidMount(raw: DidMountHandler[SlotLaneMountArg]): DidMountHandler[SlotLaneMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("slotLaneDidMount")(raw.asInstanceOf[js.Any]).asInstanceOf[DidMountHandler[SlotLaneMountArg]]
inline def slotLaneDidMount_=(x: Identity_[DidMountHandler[SlotLaneMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotLaneDidMount")(x.asInstanceOf[js.Any])

inline def slotLaneWillUnmount: Identity_[WillUnmountHandler[SlotLaneMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("slotLaneWillUnmount").asInstanceOf[Identity_[WillUnmountHandler[SlotLaneMountArg]]]
inline def slotLaneWillUnmount(raw: WillUnmountHandler[SlotLaneMountArg]): WillUnmountHandler[SlotLaneMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("slotLaneWillUnmount")(raw.asInstanceOf[js.Any]).asInstanceOf[WillUnmountHandler[SlotLaneMountArg]]
inline def slotLaneWillUnmount_=(x: Identity_[WillUnmountHandler[SlotLaneMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotLaneWillUnmount")(x.asInstanceOf[js.Any])

inline def slotMaxTime: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("slotMaxTime").asInstanceOf[js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]]
inline def slotMaxTime(input: DurationInput): Duration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("slotMaxTime")(input.asInstanceOf[js.Any]).asInstanceOf[Duration | Null]
inline def slotMaxTime(input: DurationInput, unit: String): Duration | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("slotMaxTime")(input.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration | Null]
inline def slotMaxTime_=(x: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotMaxTime")(x.asInstanceOf[js.Any])

inline def slotMinTime: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("slotMinTime").asInstanceOf[js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]]
inline def slotMinTime(input: DurationInput): Duration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("slotMinTime")(input.asInstanceOf[js.Any]).asInstanceOf[Duration | Null]
inline def slotMinTime(input: DurationInput, unit: String): Duration | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("slotMinTime")(input.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration | Null]
inline def slotMinTime_=(x: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotMinTime")(x.asInstanceOf[js.Any])

inline def slotMinWidth_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("slotMinWidth").asInstanceOf[NumberConstructor]
inline def slotMinWidth_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotMinWidth")(x.asInstanceOf[js.Any])

inline def snapDuration: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("snapDuration").asInstanceOf[js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]]
inline def snapDuration(input: DurationInput): Duration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("snapDuration")(input.asInstanceOf[js.Any]).asInstanceOf[Duration | Null]
inline def snapDuration(input: DurationInput, unit: String): Duration | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("snapDuration")(input.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration | Null]
inline def snapDuration_=(x: js.Function2[/* input */ DurationInput, /* unit */ js.UndefOr[String], Duration | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snapDuration")(x.asInstanceOf[js.Any])

inline def startParam_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("startParam").asInstanceOf[StringConstructor]
inline def startParam_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startParam")(x.asInstanceOf[js.Any])

inline def stickyFooterScrollbar: Identity_[Boolean | auto] = ^.asInstanceOf[js.Dynamic].selectDynamic("stickyFooterScrollbar").asInstanceOf[Identity_[Boolean | auto]]
inline def stickyFooterScrollbar(raw: Boolean): Boolean | auto = ^.asInstanceOf[js.Dynamic].applyDynamic("stickyFooterScrollbar")(raw.asInstanceOf[js.Any]).asInstanceOf[Boolean | auto]
inline def stickyFooterScrollbar_=(x: Identity_[Boolean | auto]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stickyFooterScrollbar")(x.asInstanceOf[js.Any])

inline def stickyFooterScrollbar_auto(raw: auto): Boolean | auto = ^.asInstanceOf[js.Dynamic].applyDynamic("stickyFooterScrollbar")(raw.asInstanceOf[js.Any]).asInstanceOf[Boolean | auto]

inline def stickyHeaderDates: Identity_[Boolean | auto] = ^.asInstanceOf[js.Dynamic].selectDynamic("stickyHeaderDates").asInstanceOf[Identity_[Boolean | auto]]
inline def stickyHeaderDates(raw: Boolean): Boolean | auto = ^.asInstanceOf[js.Dynamic].applyDynamic("stickyHeaderDates")(raw.asInstanceOf[js.Any]).asInstanceOf[Boolean | auto]
inline def stickyHeaderDates_=(x: Identity_[Boolean | auto]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaderDates")(x.asInstanceOf[js.Any])

inline def stickyHeaderDates_auto(raw: auto): Boolean | auto = ^.asInstanceOf[js.Dynamic].applyDynamic("stickyHeaderDates")(raw.asInstanceOf[js.Any]).asInstanceOf[Boolean | auto]

inline def themeSystem: Identity_[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("themeSystem").asInstanceOf[Identity_[String]]
inline def themeSystem(raw: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("themeSystem")(raw.asInstanceOf[js.Any]).asInstanceOf[String]
inline def themeSystem_=(x: Identity_[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("themeSystem")(x.asInstanceOf[js.Any])

inline def timeHint_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("timeHint").asInstanceOf[StringConstructor]
inline def timeHint_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeHint")(x.asInstanceOf[js.Any])

inline def timeZoneParam_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("timeZoneParam").asInstanceOf[StringConstructor]
inline def timeZoneParam_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZoneParam")(x.asInstanceOf[js.Any])

inline def timeZone_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("timeZone").asInstanceOf[StringConstructor]
inline def timeZone_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(x.asInstanceOf[js.Any])

inline def titleFormat: Identity_[FormatterInput] = ^.asInstanceOf[js.Dynamic].selectDynamic("titleFormat").asInstanceOf[Identity_[FormatterInput]]
inline def titleFormat(raw: FormatterInput): FormatterInput = ^.asInstanceOf[js.Dynamic].applyDynamic("titleFormat")(raw.asInstanceOf[js.Any]).asInstanceOf[FormatterInput]
inline def titleFormat_=(x: Identity_[FormatterInput]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFormat")(x.asInstanceOf[js.Any])

inline def titleRangeSeparator_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("titleRangeSeparator").asInstanceOf[StringConstructor]
inline def titleRangeSeparator_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleRangeSeparator")(x.asInstanceOf[js.Any])

inline def unselectAuto_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("unselectAuto").asInstanceOf[BooleanConstructor]
inline def unselectAuto_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unselectAuto")(x.asInstanceOf[js.Any])

inline def unselectCancel_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("unselectCancel").asInstanceOf[StringConstructor]
inline def unselectCancel_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unselectCancel")(x.asInstanceOf[js.Any])

inline def validRange: Identity_[
DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput])] = ^.asInstanceOf[js.Dynamic].selectDynamic("validRange").asInstanceOf[Identity_[
DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput])]]
inline def validRange(raw: js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput]): DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput]) = ^.asInstanceOf[js.Dynamic].applyDynamic("validRange")(raw.asInstanceOf[js.Any]).asInstanceOf[DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput])]
inline def validRange(raw: DateRangeInput): DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput]) = ^.asInstanceOf[js.Dynamic].applyDynamic("validRange")(raw.asInstanceOf[js.Any]).asInstanceOf[DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput])]
inline def validRange_=(
  x: Identity_[
  DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput])
]
): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validRange")(x.asInstanceOf[js.Any])

inline def viewClassNames: Identity_[ClassNamesGenerator[ViewContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("viewClassNames").asInstanceOf[Identity_[ClassNamesGenerator[ViewContentArg]]]
inline def viewClassNames(raw: ClassNamesGenerator[ViewContentArg]): ClassNamesGenerator[ViewContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("viewClassNames")(raw.asInstanceOf[js.Any]).asInstanceOf[ClassNamesGenerator[ViewContentArg]]
inline def viewClassNames_=(x: Identity_[ClassNamesGenerator[ViewContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("viewClassNames")(x.asInstanceOf[js.Any])

inline def viewDidMount: Identity_[DidMountHandler[ViewMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("viewDidMount").asInstanceOf[Identity_[DidMountHandler[ViewMountArg]]]
inline def viewDidMount(raw: DidMountHandler[ViewMountArg]): DidMountHandler[ViewMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("viewDidMount")(raw.asInstanceOf[js.Any]).asInstanceOf[DidMountHandler[ViewMountArg]]
inline def viewDidMount_=(x: Identity_[DidMountHandler[ViewMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("viewDidMount")(x.asInstanceOf[js.Any])

inline def viewHeight: Identity_[CssDimValue] = ^.asInstanceOf[js.Dynamic].selectDynamic("viewHeight").asInstanceOf[Identity_[CssDimValue]]
inline def viewHeight(raw: CssDimValue): CssDimValue = ^.asInstanceOf[js.Dynamic].applyDynamic("viewHeight")(raw.asInstanceOf[js.Any]).asInstanceOf[CssDimValue]
inline def viewHeight_=(x: Identity_[CssDimValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("viewHeight")(x.asInstanceOf[js.Any])

inline def viewHint: Identity_[String | (js.Function1[/* repeated */ Any, String])] = ^.asInstanceOf[js.Dynamic].selectDynamic("viewHint").asInstanceOf[Identity_[String | (js.Function1[/* repeated */ Any, String])]]
inline def viewHint(raw: String): String | (js.Function1[/* repeated */ Any, String]) = ^.asInstanceOf[js.Dynamic].applyDynamic("viewHint")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.Function1[/* repeated */ Any, String])]
inline def viewHint(raw: js.Function1[/* repeated */ Any, String]): String | (js.Function1[/* repeated */ Any, String]) = ^.asInstanceOf[js.Dynamic].applyDynamic("viewHint")(raw.asInstanceOf[js.Any]).asInstanceOf[String | (js.Function1[/* repeated */ Any, String])]
inline def viewHint_=(x: Identity_[String | (js.Function1[/* repeated */ Any, String])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("viewHint")(x.asInstanceOf[js.Any])

inline def viewWillUnmount: Identity_[WillUnmountHandler[ViewMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("viewWillUnmount").asInstanceOf[Identity_[WillUnmountHandler[ViewMountArg]]]
inline def viewWillUnmount(raw: WillUnmountHandler[ViewMountArg]): WillUnmountHandler[ViewMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("viewWillUnmount")(raw.asInstanceOf[js.Any]).asInstanceOf[WillUnmountHandler[ViewMountArg]]
inline def viewWillUnmount_=(x: Identity_[WillUnmountHandler[ViewMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("viewWillUnmount")(x.asInstanceOf[js.Any])

inline def visibleRange: Identity_[
DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput])] = ^.asInstanceOf[js.Dynamic].selectDynamic("visibleRange").asInstanceOf[Identity_[
DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput])]]
inline def visibleRange(raw: js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput]): DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput]) = ^.asInstanceOf[js.Dynamic].applyDynamic("visibleRange")(raw.asInstanceOf[js.Any]).asInstanceOf[DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput])]
inline def visibleRange(raw: DateRangeInput): DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput]) = ^.asInstanceOf[js.Dynamic].applyDynamic("visibleRange")(raw.asInstanceOf[js.Any]).asInstanceOf[DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput])]
inline def visibleRange_=(
  x: Identity_[
  DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* currentDate */ js.Date, DateRangeInput])
]
): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visibleRange")(x.asInstanceOf[js.Any])

inline def weekNumberCalculation: Identity_[WeekNumberCalculation] = ^.asInstanceOf[js.Dynamic].selectDynamic("weekNumberCalculation").asInstanceOf[Identity_[WeekNumberCalculation]]
inline def weekNumberCalculation(raw: WeekNumberCalculation): WeekNumberCalculation = ^.asInstanceOf[js.Dynamic].applyDynamic("weekNumberCalculation")(raw.asInstanceOf[js.Any]).asInstanceOf[WeekNumberCalculation]
inline def weekNumberCalculation_=(x: Identity_[WeekNumberCalculation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekNumberCalculation")(x.asInstanceOf[js.Any])

inline def weekNumberClassNames: Identity_[ClassNamesGenerator[WeekNumberContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("weekNumberClassNames").asInstanceOf[Identity_[ClassNamesGenerator[WeekNumberContentArg]]]
inline def weekNumberClassNames(raw: ClassNamesGenerator[WeekNumberContentArg]): ClassNamesGenerator[WeekNumberContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekNumberClassNames")(raw.asInstanceOf[js.Any]).asInstanceOf[ClassNamesGenerator[WeekNumberContentArg]]
inline def weekNumberClassNames_=(x: Identity_[ClassNamesGenerator[WeekNumberContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekNumberClassNames")(x.asInstanceOf[js.Any])

inline def weekNumberContent: Identity_[CustomContentGenerator[WeekNumberContentArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("weekNumberContent").asInstanceOf[Identity_[CustomContentGenerator[WeekNumberContentArg]]]
inline def weekNumberContent(raw: CustomContentGenerator[WeekNumberContentArg]): CustomContentGenerator[WeekNumberContentArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekNumberContent")(raw.asInstanceOf[js.Any]).asInstanceOf[CustomContentGenerator[WeekNumberContentArg]]
inline def weekNumberContent_=(x: Identity_[CustomContentGenerator[WeekNumberContentArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekNumberContent")(x.asInstanceOf[js.Any])

inline def weekNumberDidMount: Identity_[DidMountHandler[WeekNumberMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("weekNumberDidMount").asInstanceOf[Identity_[DidMountHandler[WeekNumberMountArg]]]
inline def weekNumberDidMount(raw: DidMountHandler[WeekNumberMountArg]): DidMountHandler[WeekNumberMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekNumberDidMount")(raw.asInstanceOf[js.Any]).asInstanceOf[DidMountHandler[WeekNumberMountArg]]
inline def weekNumberDidMount_=(x: Identity_[DidMountHandler[WeekNumberMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekNumberDidMount")(x.asInstanceOf[js.Any])

inline def weekNumberFormat: js.Function1[/* input */ FormatterInput, DateFormatter] = ^.asInstanceOf[js.Dynamic].selectDynamic("weekNumberFormat").asInstanceOf[js.Function1[/* input */ FormatterInput, DateFormatter]]
inline def weekNumberFormat(input: FormatterInput): DateFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("weekNumberFormat")(input.asInstanceOf[js.Any]).asInstanceOf[DateFormatter]
inline def weekNumberFormat_=(x: js.Function1[/* input */ FormatterInput, DateFormatter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekNumberFormat")(x.asInstanceOf[js.Any])

inline def weekNumberWillUnmount: Identity_[WillUnmountHandler[WeekNumberMountArg]] = ^.asInstanceOf[js.Dynamic].selectDynamic("weekNumberWillUnmount").asInstanceOf[Identity_[WillUnmountHandler[WeekNumberMountArg]]]
inline def weekNumberWillUnmount(raw: WillUnmountHandler[WeekNumberMountArg]): WillUnmountHandler[WeekNumberMountArg] = ^.asInstanceOf[js.Dynamic].applyDynamic("weekNumberWillUnmount")(raw.asInstanceOf[js.Any]).asInstanceOf[WillUnmountHandler[WeekNumberMountArg]]
inline def weekNumberWillUnmount_=(x: Identity_[WillUnmountHandler[WeekNumberMountArg]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekNumberWillUnmount")(x.asInstanceOf[js.Any])

inline def weekNumbers_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("weekNumbers").asInstanceOf[BooleanConstructor]
inline def weekNumbers_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekNumbers")(x.asInstanceOf[js.Any])

inline def weekTextLong_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("weekTextLong").asInstanceOf[StringConstructor]
inline def weekTextLong_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekTextLong")(x.asInstanceOf[js.Any])

inline def weekText_FBASE_OPTION_REFINERS: StringConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("weekText").asInstanceOf[StringConstructor]
inline def weekText_FBASE_OPTION_REFINERS_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekText")(x.asInstanceOf[js.Any])

inline def weekends_FBASE_OPTION_REFINERS: BooleanConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("weekends").asInstanceOf[BooleanConstructor]
inline def weekends_FBASE_OPTION_REFINERS_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekends")(x.asInstanceOf[js.Any])

inline def windowResizeDelay_FBASE_OPTION_REFINERS: NumberConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("windowResizeDelay").asInstanceOf[NumberConstructor]
inline def windowResizeDelay_FBASE_OPTION_REFINERS_=(x: NumberConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windowResizeDelay")(x.asInstanceOf[js.Any])
