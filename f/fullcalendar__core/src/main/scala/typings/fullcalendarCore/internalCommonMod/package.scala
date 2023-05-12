package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.fullcalendarCore.anon.Arialabel
import typings.fullcalendarCore.anon.ArialabelString
import typings.fullcalendarCore.anon.Bg
import typings.fullcalendarCore.anon.Bottom
import typings.fullcalendarCore.anon.CalendarContextviewApiVie
import typings.fullcalendarCore.anon.Datanavlink
import typings.fullcalendarCore.anon.Days
import typings.fullcalendarCore.anon.El
import typings.fullcalendarCore.anon.Extra
import typings.fullcalendarCore.anon.Href
import typings.fullcalendarCore.anon.HrefUndefined
import typings.fullcalendarCore.anon.IsFuture
import typings.fullcalendarCore.anon.IsTimeUnspecified
import typings.fullcalendarCore.anon.Liquid
import typings.fullcalendarCore.anon.OnKeyDown
import typings.fullcalendarCore.anon.PartialEventDef
import typings.fullcalendarCore.anon.Refined
import typings.fullcalendarCore.anon.ViewPropsdateProfileDateP
import typings.fullcalendarCore.fullcalendarCoreBooleans.`false`
import typings.fullcalendarCore.fullcalendarCoreBooleans.`true`
import typings.fullcalendarCore.internalCommonMod.^
import typings.preact.mod.ComponentChildren
import typings.preact.mod.ComponentType
import typings.preact.mod.Context
import typings.preact.mod.FunctionalComponent
import typings.preact.mod.Ref
import typings.preact.mod.VNode
import typings.preact.mod.createElement.JSX.Element
import typings.preact.srcJsxMod.JSXInternal.HTMLAttributes
import typings.preact.srcJsxMod.JSXInternal.SVGAttributes
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.NodeListOf
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.std.Required
import typings.std.Response
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def a(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("a$")().asInstanceOf[Unit]

inline def aC[T](raw: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("aC")(raw.asInstanceOf[js.Any]).asInstanceOf[T]

inline def aD[Refiners /* <: GenericRefiners */, Raw /* <: RawOptionsFromRefiners[Refiners] */](input: Raw, refiners: Refiners): Extra[Refiners] = (^.asInstanceOf[js.Dynamic].applyDynamic("aD")(input.asInstanceOf[js.Any], refiners.asInstanceOf[js.Any])).asInstanceOf[Extra[Refiners]]

inline def aI(defId: String, range: DateRange): EventInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("aI")(defId.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[EventInstance]
inline def aI(defId: String, range: DateRange, forcedStartTzo: Double): EventInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("aI")(defId.asInstanceOf[js.Any], range.asInstanceOf[js.Any], forcedStartTzo.asInstanceOf[js.Any])).asInstanceOf[EventInstance]
inline def aI(defId: String, range: DateRange, forcedStartTzo: Double, forcedEndTzo: Double): EventInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("aI")(defId.asInstanceOf[js.Any], range.asInstanceOf[js.Any], forcedStartTzo.asInstanceOf[js.Any], forcedEndTzo.asInstanceOf[js.Any])).asInstanceOf[EventInstance]
inline def aI(defId: String, range: DateRange, forcedStartTzo: Unit, forcedEndTzo: Double): EventInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("aI")(defId.asInstanceOf[js.Any], range.asInstanceOf[js.Any], forcedStartTzo.asInstanceOf[js.Any], forcedEndTzo.asInstanceOf[js.Any])).asInstanceOf[EventInstance]

inline def aM(
  refined: EventRefined,
  extra: Dictionary,
  sourceId: String,
  allDay: Boolean,
  hasEnd: Boolean,
  context: CalendarContext
): EventDef = (^.asInstanceOf[js.Dynamic].applyDynamic("aM")(refined.asInstanceOf[js.Any], extra.asInstanceOf[js.Any], sourceId.asInstanceOf[js.Any], allDay.asInstanceOf[js.Any], hasEnd.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventDef]
inline def aM(
  refined: EventRefined,
  extra: Dictionary,
  sourceId: String,
  allDay: Boolean,
  hasEnd: Boolean,
  context: CalendarContext,
  defIdMap: EventDefIdMap
): EventDef = (^.asInstanceOf[js.Dynamic].applyDynamic("aM")(refined.asInstanceOf[js.Any], extra.asInstanceOf[js.Any], sourceId.asInstanceOf[js.Any], allDay.asInstanceOf[js.Any], hasEnd.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defIdMap.asInstanceOf[js.Any])).asInstanceOf[EventDef]

inline def aN(raw: EventInput, context: CalendarContext): Refined = (^.asInstanceOf[js.Dynamic].applyDynamic("aN")(raw.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Refined]
inline def aN(raw: EventInput, context: CalendarContext, refiners: GenericRefiners): Refined = (^.asInstanceOf[js.Dynamic].applyDynamic("aN")(raw.asInstanceOf[js.Any], context.asInstanceOf[js.Any], refiners.asInstanceOf[js.Any])).asInstanceOf[Refined]

inline def aO(input: BusinessHoursInput, context: CalendarContext): EventStore = (^.asInstanceOf[js.Dynamic].applyDynamic("aO")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventStore]

inline def aQ(`val`: Any, len: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("aQ")(`val`.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]

inline def aR(n: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("aR")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def aS[Subject](input: FieldSpecInput[Subject]): js.Array[OrderSpec[Subject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("aS")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[OrderSpec[Subject]]]

inline def aT[Subject](obj0: Subject, obj1: Subject, fieldSpecs: js.Array[OrderSpec[Subject]]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("aT")(obj0.asInstanceOf[js.Any], obj1.asInstanceOf[js.Any], fieldSpecs.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def aU(a: Any, b: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("aU")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def aV(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("aV")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def aW(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("aW")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def aX(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("aX")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def aY(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("aY")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def aZ(a: Any, b: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("aZ")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def a_(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("a_")().asInstanceOf[Unit]

inline def b(outerRange: OpenDateRange, innerRange: OpenDateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("b$")(outerRange.asInstanceOf[js.Any], innerRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def b0(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("b0")().asInstanceOf[String]

inline def b1(timedRange: OpenDateRange): OpenDateRange = ^.asInstanceOf[js.Dynamic].applyDynamic("b1")(timedRange.asInstanceOf[js.Any]).asInstanceOf[OpenDateRange]
inline def b1(timedRange: OpenDateRange, nextDayThreshold: Duration): OpenDateRange = (^.asInstanceOf[js.Dynamic].applyDynamic("b1")(timedRange.asInstanceOf[js.Any], nextDayThreshold.asInstanceOf[js.Any])).asInstanceOf[OpenDateRange]

inline def b2(range: DateRange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("b2")(range.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def b3(date0: js.Date, date1: js.Date, dateEnv: DateEnv): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("b3")(date0.asInstanceOf[js.Any], date1.asInstanceOf[js.Any], dateEnv.asInstanceOf[js.Any])).asInstanceOf[Duration]
inline def b3(date0: js.Date, date1: js.Date, dateEnv: DateEnv, largeUnit: String): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("b3")(date0.asInstanceOf[js.Any], date1.asInstanceOf[js.Any], dateEnv.asInstanceOf[js.Any], largeUnit.asInstanceOf[js.Any])).asInstanceOf[Duration]

inline def b4(array: Any, exactVal: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("b4")(array.asInstanceOf[js.Any], exactVal.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def b5(a0: Any, a1: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("b5")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def b5(a0: Any, a1: Any, equalityFunc: js.Function2[/* v0 */ Any, /* v1 */ Any, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("b5")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], equalityFunc.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def b8[Args /* <: js.Array[Any] */, Res](workerFunc: js.Function1[/* args */ Args, Res]): js.Function1[/* args */ Args, Res] = ^.asInstanceOf[js.Dynamic].applyDynamic("b8")(workerFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, Res]]
inline def b8[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean]
): js.Function1[/* args */ Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("b8")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Args, Res]]
inline def b8[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean],
  teardownFunc: js.Function1[/* res */ Res, Unit]
): js.Function1[/* args */ Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("b8")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Args, Res]]
inline def b8[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: Unit,
  teardownFunc: js.Function1[/* res */ Res, Unit]
): js.Function1[/* args */ Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("b8")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Args, Res]]

inline def b9[Arg /* <: Dictionary */, Res](workerFunc: js.Function1[/* arg */ Arg, Res]): js.Function1[/* arg */ Arg, Res] = ^.asInstanceOf[js.Dynamic].applyDynamic("b9")(workerFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg */ Arg, Res]]
inline def b9[Arg /* <: Dictionary */, Res](
  workerFunc: js.Function1[/* arg */ Arg, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean]
): js.Function1[/* arg */ Arg, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("b9")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg */ Arg, Res]]
inline def b9[Arg /* <: Dictionary */, Res](
  workerFunc: js.Function1[/* arg */ Arg, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean],
  teardownFunc: js.Function1[/* res */ Res, Unit]
): js.Function1[/* arg */ Arg, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("b9")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg */ Arg, Res]]
inline def b9[Arg /* <: Dictionary */, Res](
  workerFunc: js.Function1[/* arg */ Arg, Res],
  resEquality: Unit,
  teardownFunc: js.Function1[/* res */ Res, Unit]
): js.Function1[/* arg */ Arg, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("b9")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg */ Arg, Res]]

inline def bA_(): EventStore = ^.asInstanceOf[js.Dynamic].applyDynamic("bA")().asInstanceOf[EventStore]

inline def bB_(store0: EventStore, store1: EventStore): EventStore = (^.asInstanceOf[js.Dynamic].applyDynamic("bB")(store0.asInstanceOf[js.Any], store1.asInstanceOf[js.Any])).asInstanceOf[EventStore]

inline def bC(eventStore: EventStore, instanceId: String): EventStore = (^.asInstanceOf[js.Dynamic].applyDynamic("bC")(eventStore.asInstanceOf[js.Any], instanceId.asInstanceOf[js.Any])).asInstanceOf[EventStore]

inline def bD(tuple: EventTuple): EventStore = ^.asInstanceOf[js.Dynamic].applyDynamic("bD")(tuple.asInstanceOf[js.Any]).asInstanceOf[EventStore]
inline def bD(tuple: EventTuple, eventStore: EventStore): EventStore = (^.asInstanceOf[js.Dynamic].applyDynamic("bD")(tuple.asInstanceOf[js.Any], eventStore.asInstanceOf[js.Any])).asInstanceOf[EventStore]

inline def bG_(uis: js.Array[EventUi]): EventUi = ^.asInstanceOf[js.Dynamic].applyDynamic("bG")(uis.asInstanceOf[js.Any]).asInstanceOf[EventUi]

inline def bH_(refined: EventUiRefined, context: CalendarContext): EventUi = (^.asInstanceOf[js.Dynamic].applyDynamic("bH")(refined.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventUi]

inline def bK_(meta: DateMeta, theme: Theme): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("bK")(meta.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def bL_(date: js.Date): DateMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("bL")(date.asInstanceOf[js.Any]).asInstanceOf[DateMeta]
inline def bL_(date: js.Date, todayRange: Unit, nowDate: js.Date): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("bL")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any])).asInstanceOf[DateMeta]
inline def bL_(date: js.Date, todayRange: Unit, nowDate: js.Date, dateProfile: DateProfile): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("bL")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any], dateProfile.asInstanceOf[js.Any])).asInstanceOf[DateMeta]
inline def bL_(date: js.Date, todayRange: Unit, nowDate: Unit, dateProfile: DateProfile): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("bL")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any], dateProfile.asInstanceOf[js.Any])).asInstanceOf[DateMeta]
inline def bL_(date: js.Date, todayRange: DateRange): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("bL")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any])).asInstanceOf[DateMeta]
inline def bL_(date: js.Date, todayRange: DateRange, nowDate: js.Date): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("bL")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any])).asInstanceOf[DateMeta]
inline def bL_(date: js.Date, todayRange: DateRange, nowDate: js.Date, dateProfile: DateProfile): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("bL")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any], dateProfile.asInstanceOf[js.Any])).asInstanceOf[DateMeta]
inline def bL_(date: js.Date, todayRange: DateRange, nowDate: Unit, dateProfile: DateProfile): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("bL")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any], dateProfile.asInstanceOf[js.Any])).asInstanceOf[DateMeta]

inline def bM_(meta: DateMeta, theme: Theme): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("bM")(meta.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def bN_(context: ViewContext, dateMarker: js.Date): Arialabel | Datanavlink | ArialabelString = (^.asInstanceOf[js.Dynamic].applyDynamic("bN")(context.asInstanceOf[js.Any], dateMarker.asInstanceOf[js.Any])).asInstanceOf[Arialabel | Datanavlink | ArialabelString]
inline def bN_(context: ViewContext, dateMarker: js.Date, viewType: String): Arialabel | Datanavlink | ArialabelString = (^.asInstanceOf[js.Dynamic].applyDynamic("bN")(context.asInstanceOf[js.Any], dateMarker.asInstanceOf[js.Any], viewType.asInstanceOf[js.Any])).asInstanceOf[Arialabel | Datanavlink | ArialabelString]
inline def bN_(context: ViewContext, dateMarker: js.Date, viewType: String, isTabbable: Boolean): Arialabel | Datanavlink | ArialabelString = (^.asInstanceOf[js.Dynamic].applyDynamic("bN")(context.asInstanceOf[js.Any], dateMarker.asInstanceOf[js.Any], viewType.asInstanceOf[js.Any], isTabbable.asInstanceOf[js.Any])).asInstanceOf[Arialabel | Datanavlink | ArialabelString]
inline def bN_(context: ViewContext, dateMarker: js.Date, viewType: Unit, isTabbable: Boolean): Arialabel | Datanavlink | ArialabelString = (^.asInstanceOf[js.Dynamic].applyDynamic("bN")(context.asInstanceOf[js.Any], dateMarker.asInstanceOf[js.Any], viewType.asInstanceOf[js.Any], isTabbable.asInstanceOf[js.Any])).asInstanceOf[Arialabel | Datanavlink | ArialabelString]

inline def bO_(ev: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bO")(ev.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def bP_(el: HTMLElement, callback: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bP")(el.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def bQ_(el: Any): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("bQ")(el.asInstanceOf[js.Any]).asInstanceOf[Bottom]
inline def bQ_(el: Any, goWithinPadding: Boolean): Bottom = (^.asInstanceOf[js.Dynamic].applyDynamic("bQ")(el.asInstanceOf[js.Any], goWithinPadding.asInstanceOf[js.Any])).asInstanceOf[Bottom]
inline def bQ_(el: Any, goWithinPadding: Boolean, doFromWindowViewport: Boolean): Bottom = (^.asInstanceOf[js.Dynamic].applyDynamic("bQ")(el.asInstanceOf[js.Any], goWithinPadding.asInstanceOf[js.Any], doFromWindowViewport.asInstanceOf[js.Any])).asInstanceOf[Bottom]
inline def bQ_(el: Any, goWithinPadding: Unit, doFromWindowViewport: Boolean): Bottom = (^.asInstanceOf[js.Dynamic].applyDynamic("bQ")(el.asInstanceOf[js.Any], goWithinPadding.asInstanceOf[js.Any], doFromWindowViewport.asInstanceOf[js.Any])).asInstanceOf[Bottom]

inline def bR_(el: HTMLElement): EdgeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("bR")(el.asInstanceOf[js.Any]).asInstanceOf[EdgeInfo]
inline def bR_(el: HTMLElement, getPadding: Boolean): EdgeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("bR")(el.asInstanceOf[js.Any], getPadding.asInstanceOf[js.Any])).asInstanceOf[EdgeInfo]

inline def bS_(el: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("bS")(el.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]

inline def bT_(el: Any): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("bT")(el.asInstanceOf[js.Any]).asInstanceOf[Rect]

inline def bU_[Res](
  func: js.Function2[
  /* successCallback */ js.Function1[/* res */ Res, Unit], 
  /* failureCallback */ js.Function1[/* error */ js.Error, Unit], 
  js.Promise[Res] | Unit
],
  normalizedSuccessCallback: js.Function1[/* res */ Res, Unit],
  normalizedFailureCallback: js.Function1[/* error */ js.Error, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bU")(func.asInstanceOf[js.Any], normalizedSuccessCallback.asInstanceOf[js.Any], normalizedFailureCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def bX_(range: OpenDateRange, date: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bX")(range.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def bX_(range: OpenDateRange, date: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bX")(range.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def bY_(range0: OpenDateRange, range1: OpenDateRange): OpenDateRange = (^.asInstanceOf[js.Dynamic].applyDynamic("bY")(range0.asInstanceOf[js.Any], range1.asInstanceOf[js.Any])).asInstanceOf[OpenDateRange]

inline def bZ(range0: OpenDateRange, range1: OpenDateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bZ")(range0.asInstanceOf[js.Any], range1.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def b_(range0: OpenDateRange, range1: OpenDateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("b_")(range0.asInstanceOf[js.Any], range1.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def ba[Args /* <: js.Array[Any] */, Res](// used at all?
workerFunc: js.Function1[/* args */ Args, Res]): MemoiseArrayFunc[Args, Res] = ^.asInstanceOf[js.Dynamic].applyDynamic("ba")(workerFunc.asInstanceOf[js.Any]).asInstanceOf[MemoiseArrayFunc[Args, Res]]
inline def ba[Args /* <: js.Array[Any] */, Res](
  // used at all?
workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean]
): MemoiseArrayFunc[Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("ba")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any])).asInstanceOf[MemoiseArrayFunc[Args, Res]]
inline def ba[Args /* <: js.Array[Any] */, Res](
  // used at all?
workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean],
  teardownFunc: js.Function1[/* res */ Res, Unit]
): MemoiseArrayFunc[Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("ba")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[MemoiseArrayFunc[Args, Res]]
inline def ba[Args /* <: js.Array[Any] */, Res](
  // used at all?
workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: Unit,
  teardownFunc: js.Function1[/* res */ Res, Unit]
): MemoiseArrayFunc[Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("ba")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[MemoiseArrayFunc[Args, Res]]

inline def bb[Args /* <: js.Array[Any] */, Res](workerFunc: js.Function1[/* args */ Args, Res]): MemoizeHashFunc[Args, Res] = ^.asInstanceOf[js.Dynamic].applyDynamic("bb")(workerFunc.asInstanceOf[js.Any]).asInstanceOf[MemoizeHashFunc[Args, Res]]
inline def bb[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean]
): MemoizeHashFunc[Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("bb")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any])).asInstanceOf[MemoizeHashFunc[Args, Res]]
inline def bb[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean],
  teardownFunc: js.Function1[/* res */ Res, Unit]
): MemoizeHashFunc[Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("bb")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[MemoizeHashFunc[Args, Res]]
inline def bb[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: Unit,
  teardownFunc: js.Function1[/* res */ Res, Unit]
): MemoizeHashFunc[Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("bb")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[MemoizeHashFunc[Args, Res]]

inline def be(rect1: Rect, rect2: Rect): Rect | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("be")(rect1.asInstanceOf[js.Any], rect2.asInstanceOf[js.Any])).asInstanceOf[Rect | `false`]

inline def bf(point: Point, rect: Rect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bf")(point.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def bg(point: Point, rect: Rect): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("bg")(point.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Point]

inline def bh(rect: Rect): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("bh")(rect.asInstanceOf[js.Any]).asInstanceOf[Point]

inline def bi(point1: Point, point2: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("bi")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[Point]

inline def bj(rect: Rect, deltaX: Double, deltaY: Double): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("bj")(rect.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any], deltaY.asInstanceOf[js.Any])).asInstanceOf[Rect]

inline def bk[InputItem, OutputItem](
  hash: StringDictionary[InputItem],
  func: js.Function2[/* input */ InputItem, /* key */ String, OutputItem]
): StringDictionary[OutputItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("bk")(hash.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[OutputItem]]

inline def bl(hash: Any, func: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("bl")(hash.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def bm(obj0: Any, obj1: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bm")(obj0.asInstanceOf[js.Any], obj1.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def bn(oldProps: Any, newProps: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bn")(oldProps.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def bn(oldProps: Any, newProps: Any, equalityFuncs: EqualityFuncs[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bn")(oldProps.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], equalityFuncs.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def bo[Item](hash: StringDictionary[Item]): js.Array[Item] = ^.asInstanceOf[js.Dynamic].applyDynamic("bo")(hash.asInstanceOf[js.Any]).asInstanceOf[js.Array[Item]]
inline def bo[Item](hash: StringDictionary[Item], startIndex: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("bo")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
inline def bo[Item](hash: StringDictionary[Item], startIndex: Double, endIndex: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("bo")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
inline def bo[Item](hash: StringDictionary[Item], startIndex: Double, endIndex: Double, step: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("bo")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
inline def bo[Item](hash: StringDictionary[Item], startIndex: Double, endIndex: Unit, step: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("bo")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
inline def bo[Item](hash: StringDictionary[Item], startIndex: Unit, endIndex: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("bo")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
inline def bo[Item](hash: StringDictionary[Item], startIndex: Unit, endIndex: Double, step: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("bo")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
inline def bo[Item](hash: StringDictionary[Item], startIndex: Unit, endIndex: Unit, step: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("bo")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]

inline def bp(container: js.Array[HTMLElement], selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("bp")(container.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
inline def bp(container: HTMLElement, selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("bp")(container.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
inline def bp(container: NodeListOf[HTMLElement], selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("bp")(container.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]

inline def bq(parent: js.Array[HTMLElement]): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("bq")(parent.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
inline def bq(parent: js.Array[HTMLElement], selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("bq")(parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
inline def bq(parent: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("bq")(parent.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
inline def bq(parent: HTMLElement, selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("bq")(parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]

inline def br(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("br")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def bs(el: HTMLElement, props: Dictionary): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bs")(el.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def bt(el: HTMLElement, selector: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("bt")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]

inline def bu(el: HTMLElement, selector: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("bu")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]

inline def bv(ev: Event): EventTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("bv")(ev.asInstanceOf[js.Any]).asInstanceOf[EventTarget]

inline def bw(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bw")().asInstanceOf[String]

inline def bx(raw: ClassNamesInput): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("bx")(raw.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def by(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("by")().asInstanceOf[Boolean]

inline def c6: Context[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("c6").asInstanceOf[Context[Any]]

inline def cA(dur: Duration): typings.fullcalendarCore.anon.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cA")(dur.asInstanceOf[js.Any]).asInstanceOf[typings.fullcalendarCore.anon.Unit]

inline def cC(input: FormatterInput): DateFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("cC")(input.asInstanceOf[js.Any]).asInstanceOf[DateFormatter]

inline def cF(marker: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cF")(marker.asInstanceOf[js.Any]).asInstanceOf[String]

inline def cG_(marker: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cG")(marker.asInstanceOf[js.Any]).asInstanceOf[String]

inline def cH(marker: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cH")(marker.asInstanceOf[js.Any]).asInstanceOf[String]
inline def cH(marker: js.Date, timeZoneOffset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cH")(marker.asInstanceOf[js.Any], timeZoneOffset.asInstanceOf[js.Any])).asInstanceOf[String]
inline def cH(marker: js.Date, timeZoneOffset: Double, stripZeroTime: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cH")(marker.asInstanceOf[js.Any], timeZoneOffset.asInstanceOf[js.Any], stripZeroTime.asInstanceOf[js.Any])).asInstanceOf[String]
inline def cH(marker: js.Date, timeZoneOffset: Unit, stripZeroTime: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cH")(marker.asInstanceOf[js.Any], timeZoneOffset.asInstanceOf[js.Any], stripZeroTime.asInstanceOf[js.Any])).asInstanceOf[String]

inline def cI_(marker: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cI")(marker.asInstanceOf[js.Any]).asInstanceOf[String]

inline def cK_(str: Any): IsTimeUnspecified = ^.asInstanceOf[js.Dynamic].applyDynamic("cK")(str.asInstanceOf[js.Any]).asInstanceOf[IsTimeUnspecified]

inline def cU_(entry: SegEntry): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cU")(entry.asInstanceOf[js.Any]).asInstanceOf[String]

inline def cV_(entry: SegEntry): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cV")(entry.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def cW_[Item](a: js.Array[Item], searchVal: Double, getItemVal: js.Function1[/* item */ Item, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cW")(a.asInstanceOf[js.Any], searchVal.asInstanceOf[js.Any], getItemVal.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]

inline def cX_(entries: js.Array[SegEntry]): js.Array[SegEntryGroup] = ^.asInstanceOf[js.Dynamic].applyDynamic("cX")(entries.asInstanceOf[js.Any]).asInstanceOf[js.Array[SegEntryGroup]]

inline def cY_(span0: SegSpan, span1: SegSpan): SegSpan | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("cY")(span0.asInstanceOf[js.Any], span1.asInstanceOf[js.Any])).asInstanceOf[SegSpan | Null]

inline def cg(span0: DateSpan, span1: DateSpan): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cg")(span0.asInstanceOf[js.Any], span1.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def ci(m: js.Date, n: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("ci")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Date]

inline def cj(m: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("cj")(m.asInstanceOf[js.Any]).asInstanceOf[js.Date]

inline def ck(m: js.Date, n: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("ck")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Date]

inline def cl(m: js.Date, n: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("cl")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Date]

inline def cm(m0: Any, m1: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cm")(m0.asInstanceOf[js.Any], m1.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def cn(m0: js.Date, m1: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cn")(m0.asInstanceOf[js.Any], m1.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def co(m0: js.Date, m1: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("co")(m0.asInstanceOf[js.Any], m1.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def cp(m0: js.Date, m1: js.Date): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(m0.asInstanceOf[js.Any], m1.asInstanceOf[js.Any])).asInstanceOf[Duration]

inline def cq(m0: Any, m1: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cq")(m0.asInstanceOf[js.Any], m1.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def cr(m: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cr")(m.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def cs(input: DurationInput): Duration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cs")(input.asInstanceOf[js.Any]).asInstanceOf[Duration | Null]
inline def cs(input: DurationInput, unit: String): Duration | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("cs")(input.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration | Null]

inline def ct(dur: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ct")(dur.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def cu(d: Duration, n: Double): Days = (^.asInstanceOf[js.Dynamic].applyDynamic("cu")(d.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Days]

inline def cv(d0: Duration, d1: Duration): Days = (^.asInstanceOf[js.Dynamic].applyDynamic("cv")(d0.asInstanceOf[js.Any], d1.asInstanceOf[js.Any])).asInstanceOf[Days]

inline def cw(dur: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cw")(dur.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def cx(dur: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cx")(dur.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def cy(dur: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cy")(dur.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def cz(numerator: Duration, denominator: Duration): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cz")(numerator.asInstanceOf[js.Any], denominator.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def d(props: Liquid, sectionConfig: SectionConfig): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("d$")(props.asInstanceOf[js.Any], sectionConfig.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def d0(settings: InteractionSettings): StringDictionary[InteractionSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("d0")(settings.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[InteractionSettings]]

inline def d1: InteractionSettingsStore = ^.asInstanceOf[js.Dynamic].selectDynamic("d1").asInstanceOf[InteractionSettingsStore]

inline def d8: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("d8").asInstanceOf[Any]

inline def dC_(
  eventStore: EventStore,
  eventConfigBase: EventUiHash,
  mutation: EventMutation,
  context: CalendarContext
): EventStore = (^.asInstanceOf[js.Dynamic].applyDynamic("dC")(eventStore.asInstanceOf[js.Any], eventConfigBase.asInstanceOf[js.Any], mutation.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventStore]

inline def dE(state: SplittableProps, context: CalendarContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dE")(state.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def dE(state: SplittableProps, context: CalendarContext, dateSpanMeta: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dE")(state.asInstanceOf[js.Any], context.asInstanceOf[js.Any], dateSpanMeta.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def dE(state: SplittableProps, context: CalendarContext, dateSpanMeta: js.Object, filterConfig: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dE")(state.asInstanceOf[js.Any], context.asInstanceOf[js.Any], dateSpanMeta.asInstanceOf[js.Any], filterConfig.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def dE(state: SplittableProps, context: CalendarContext, dateSpanMeta: Unit, filterConfig: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dE")(state.asInstanceOf[js.Any], context.asInstanceOf[js.Any], dateSpanMeta.asInstanceOf[js.Any], filterConfig.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def dF(interaction: EventInteractionState, dateProfile: DateProfile, context: CalendarContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dF")(interaction.asInstanceOf[js.Any], dateProfile.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def dG(dateSelection: DateSpan, dateProfile: DateProfile, context: CalendarContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dG")(dateSelection.asInstanceOf[js.Any], dateProfile.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def dH_[ParsedResponse](method: String, url: String, params: Dictionary): js.Promise[js.Tuple2[ParsedResponse, Response]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dH")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[ParsedResponse, Response]]]

inline def dJ_[RefType](ref: Unit, current: RefType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dJ")(ref.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def dJ_[RefType](ref: Ref[RefType], current: RefType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dJ")(ref.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def dW_(cols: js.Array[ColProps]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dW")(cols.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def dX(cols: js.Array[ColProps]): VNode[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("dX")(cols.asInstanceOf[js.Any]).asInstanceOf[VNode[js.Object]]
inline def dX(cols: js.Array[ColProps], shrinkWidth: Double): VNode[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("dX")(cols.asInstanceOf[js.Any], shrinkWidth.asInstanceOf[js.Any])).asInstanceOf[VNode[js.Object]]

inline def dY_(liquid: Boolean, context: ViewContext): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("dY")(liquid.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def dZ(sectionConfig: SectionConfig, wholeTableVGrow: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("dZ")(sectionConfig.asInstanceOf[js.Any], wholeTableVGrow.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def d_(props: Liquid, sectionConfig: SectionConfig): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("d_")(props.asInstanceOf[js.Any], sectionConfig.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def dc(raw: DragMetaInput): DragMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("dc")(raw.asInstanceOf[js.Any]).asInstanceOf[DragMeta]

inline def dj(datesRepDistinctDays: Boolean, dayCnt: Double): DateFormatter = (^.asInstanceOf[js.Dynamic].applyDynamic("dj")(datesRepDistinctDays.asInstanceOf[js.Any], dayCnt.asInstanceOf[js.Any])).asInstanceOf[DateFormatter]

inline def dp(eventStore: EventStore, eventUiBases: EventUiHash, framingRange: DateRange): Bg = (^.asInstanceOf[js.Dynamic].applyDynamic("dp")(eventStore.asInstanceOf[js.Any], eventUiBases.asInstanceOf[js.Any], framingRange.asInstanceOf[js.Any])).asInstanceOf[Bg]
inline def dp(
  eventStore: EventStore,
  eventUiBases: EventUiHash,
  framingRange: DateRange,
  nextDayThreshold: Duration
): Bg = (^.asInstanceOf[js.Dynamic].applyDynamic("dp")(eventStore.asInstanceOf[js.Any], eventUiBases.asInstanceOf[js.Any], framingRange.asInstanceOf[js.Any], nextDayThreshold.asInstanceOf[js.Any])).asInstanceOf[Bg]

inline def dq(`def`: EventDef): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dq")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def dr(el: HTMLElement): Seg | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("dr")(el.asInstanceOf[js.Any]).asInstanceOf[Seg | Null]

inline def ds(seg: Seg, timeFormat: DateFormatter, context: ViewContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(seg: Seg, timeFormat: DateFormatter, context: ViewContext, defaultDisplayEventTime: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  // defaults to true
defaultDisplayEventEnd: Boolean
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  // defaults to true
defaultDisplayEventEnd: Boolean,
  // defaults to true
startOverride: js.Date
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  // defaults to true
defaultDisplayEventEnd: Boolean,
  // defaults to true
startOverride: js.Date,
  endOverride: js.Date
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  // defaults to true
defaultDisplayEventEnd: Boolean,
  // defaults to true
startOverride: Unit,
  endOverride: js.Date
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  // defaults to true
defaultDisplayEventEnd: Unit,
  // defaults to true
startOverride: js.Date
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  // defaults to true
defaultDisplayEventEnd: Unit,
  // defaults to true
startOverride: js.Date,
  endOverride: js.Date
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  // defaults to true
defaultDisplayEventEnd: Unit,
  // defaults to true
startOverride: Unit,
  endOverride: js.Date
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  // defaults to true
defaultDisplayEventEnd: Boolean
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  // defaults to true
defaultDisplayEventEnd: Boolean,
  // defaults to true
startOverride: js.Date
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  // defaults to true
defaultDisplayEventEnd: Boolean,
  // defaults to true
startOverride: js.Date,
  endOverride: js.Date
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  // defaults to true
defaultDisplayEventEnd: Boolean,
  // defaults to true
startOverride: Unit,
  endOverride: js.Date
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  // defaults to true
defaultDisplayEventEnd: Unit,
  // defaults to true
startOverride: js.Date
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  // defaults to true
defaultDisplayEventEnd: Unit,
  // defaults to true
startOverride: js.Date,
  endOverride: js.Date
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ds(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  // defaults to true
defaultDisplayEventEnd: Unit,
  // defaults to true
startOverride: Unit,
  endOverride: js.Date
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ds")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]

inline def dt(segs: Any, eventOrderSpecs: js.Array[OrderSpec[EventImpl]]): js.Array[Seg] = (^.asInstanceOf[js.Dynamic].applyDynamic("dt")(segs.asInstanceOf[js.Any], eventOrderSpecs.asInstanceOf[js.Any])).asInstanceOf[js.Array[Seg]]

inline def du(seg: Seg, todayRange: DateRange): IsFuture = (^.asInstanceOf[js.Dynamic].applyDynamic("du")(seg.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any])).asInstanceOf[IsFuture]
inline def du(seg: Seg, todayRange: DateRange, nowDate: js.Date): IsFuture = (^.asInstanceOf[js.Dynamic].applyDynamic("du")(seg.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any])).asInstanceOf[IsFuture]

inline def dv(eventRange: EventRenderRange): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dv")(eventRange.asInstanceOf[js.Any]).asInstanceOf[String]

inline def dw(seg: Seg, context: ViewContext): OnKeyDown | Href | HrefUndefined = (^.asInstanceOf[js.Dynamic].applyDynamic("dw")(seg.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[OnKeyDown | Href | HrefUndefined]

inline def e0(
  sectionConfig: SectionConfig,
  chunkConfig: ChunkConfig,
  arg: ChunkContentCallbackArgs,
  isHeader: Boolean
): VNode[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("e0")(sectionConfig.asInstanceOf[js.Any], chunkConfig.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], isHeader.asInstanceOf[js.Any])).asInstanceOf[VNode[js.Object]]

inline def e1(chunkEls: js.Array[HTMLElement]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("e1")(chunkEls.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def e2(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("e2")().asInstanceOf[Double]
inline def e2(shrinkWidth: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("e2")(shrinkWidth.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def e3(cols0: js.Array[ColProps], cols1: js.Array[ColProps]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("e3")(cols0.asInstanceOf[js.Any], cols1.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def e4(arg: ChunkContentCallbackArgs): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("e4")(arg.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def e5(options: BaseOptionsRefined): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("e5")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def e6(options: BaseOptionsRefined): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("e6")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def e9(): ScrollbarWidths = ^.asInstanceOf[js.Dynamic].applyDynamic("e9")().asInstanceOf[ScrollbarWidths]

inline def eA_(eventStore: EventStore, context: CalendarContext): js.Array[EventImpl] = (^.asInstanceOf[js.Dynamic].applyDynamic("eA")(eventStore.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[EventImpl]]
inline def eA_(eventStore: EventStore, context: CalendarContext, excludeInstance: EventInstance): js.Array[EventImpl] = (^.asInstanceOf[js.Dynamic].applyDynamic("eA")(eventStore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], excludeInstance.asInstanceOf[js.Any])).asInstanceOf[js.Array[EventImpl]]

inline def eC_(props: ElAttrsProps): ElAttrs = ^.asInstanceOf[js.Dynamic].applyDynamic("eC")(props.asInstanceOf[js.Any]).asInstanceOf[ElAttrs]
inline def eC_(props: ElAttrsProps, extraClassNames: js.Array[String]): ElAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("eC")(props.asInstanceOf[js.Any], extraClassNames.asInstanceOf[js.Any])).asInstanceOf[ElAttrs]

inline def eb(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("eb")().asInstanceOf[Boolean]

inline def eh(props: NowIndicatorContainerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("eh")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def ej(options: ViewOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ej")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def em(fillType: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("em")(fillType.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def ep(props: WeekNumberContainerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ep")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def er(segs: js.Array[Seg]): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("er")(segs.asInstanceOf[js.Any]).asInstanceOf[js.Date]

inline def ew(selection: DateSpan, pev: Null, context: CalendarContextviewApiVie): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ew")(selection.asInstanceOf[js.Any], pev.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def ew(selection: DateSpan, pev: PointerDragEvent, context: CalendarContextviewApiVie): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ew")(selection.asInstanceOf[js.Any], pev.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ex(allDay: Boolean, marker: js.Date, context: CalendarContext): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("ex")(allDay.asInstanceOf[js.Any], marker.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Date]

inline def ey(styleText: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ey")(styleText.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def s(props: ViewPropsdateProfileDateP): js.Array[EventRenderRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("s")(props.asInstanceOf[js.Any]).asInstanceOf[js.Array[EventRenderRange]]
inline def s(props: ViewPropsdateProfileDateP, allDay: Boolean): js.Array[EventRenderRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("s")(props.asInstanceOf[js.Any], allDay.asInstanceOf[js.Any])).asInstanceOf[js.Array[EventRenderRange]]

type AllowFunc = js.Function2[/* span */ DateSpanApi, /* movingEvent */ EventImpl | Null, Boolean]

type BaseOptionRefiners = BuiltInBaseOptionRefiners

type BuiltInViewOptionRefiners = StringDictionary[Any]

type BusinessHoursInput = Boolean | EventInput | js.Array[EventInput]

type CalendarListenerRefiners = BuiltInCalendarListenerRefiners

type CalendarOptionRefiners = BuiltInCalendarOptionRefiners

type ChunkConfigContent = js.Function1[/* contentProps */ ChunkContentCallbackArgs, VNode[js.Object]]

type ChunkConfigRowContent = VNode[js.Object] | ChunkConfigContent

type ClassNamesGenerator[RenderProps] = ClassNamesInput | (js.Function1[/* renderProps */ RenderProps, ClassNamesInput])

type ClassNamesInput = String | js.Array[String]

type CmdFormatterFunc = js.Function2[/* cmd */ String, /* arg */ VerboseFormattingArg, String]

/* Rewritten from type alias, can be one of: 
  - typings.fullcalendarCore.fullcalendarCoreStrings.businessHours
  - java.lang.String
  - typings.fullcalendarCore.internalCommonMod.EventStore
  - typings.fullcalendarCore.fullcalendarCoreBooleans.`false`
*/
type Constraint = _Constraint | String

/* Rewritten from type alias, can be one of: 
  - typings.fullcalendarCore.fullcalendarCoreStrings.businessHours
  - java.lang.String
  - typings.fullcalendarCore.internalCommonMod.EventInput
  - js.Array[typings.fullcalendarCore.internalCommonMod.EventInput]
*/
type ConstraintInput = _ConstraintInput | js.Array[EventInput] | String

type CssDimValue = String | Double

type CustomContent = ComponentChildren | ObjCustomContent

type CustomContentGenerator[RenderProps] = CustomContent | (js.Function2[/* renderProps */ RenderProps, /* createElement */ Any, CustomContent | `true`])

type CustomRenderingHandler[RenderProps] = js.Function1[/* customRender */ CustomRendering[RenderProps], Unit]

type DateInput = js.Date | String | Double | js.Array[Double]

type DateMarker = js.Date

type DatePointTransform = js.Function2[/* dateSpan */ DateSpan, /* context */ CalendarContext, Any]

type DateSpanTransform = js.Function2[/* dateSpan */ DateSpan, /* context */ CalendarContext, Any]

type DefaultedRefinedOptions[RefinedOptions /* <: Dictionary */, DefaultKey /* <: /* keyof RefinedOptions */ String */] = (Required[Pick[RefinedOptions, DefaultKey]]) & (Partial[Omit[RefinedOptions, DefaultKey]])

type Dictionary = Record[String, Any]

type DidMountHandler[TheMountArg /* <: El */] = js.Function1[/* mountArg */ TheMountArg, Unit]

type DurationInput = DurationObjectInput | String | Double

type ElAttrs = HTMLAttributes[EventTarget] & SVGAttributes[SVGElement] & typings.fullcalendarCore.anon.Ref & (Record[String, Any])

type ElRef = Ref[HTMLElement]

type EqualityFunc[T] = js.Function2[/* a */ T, /* b */ T, Boolean]

type EqualityThing[T] = EqualityFunc[T] | `true`

type EventDefHash = StringDictionary[EventDef]

type EventDefIdMap = StringDictionary[String]

type EventDefMemberAdder = js.Function1[/* refined */ EventRefined, PartialEventDef]

type EventDropTransformers = js.Function2[/* mutation */ EventMutation, /* context */ CalendarContext, Dictionary]

type EventInputTransformer = js.Function1[/* input */ EventInput, EventInput]

type EventInstanceHash = StringDictionary[EventInstance]

type EventRefiners = BuiltInEventRefiners

type EventSourceErrorResponseHandler = js.Function1[/* error */ js.Error, Unit]

type EventSourceFetcher[Meta] = js.Function3[
/* arg */ typings.fullcalendarCore.anon.Context[Meta], 
/* successCallback */ js.Function1[/* res */ EventSourceFetcherRes, Unit], 
/* errorCallback */ js.Function1[/* error */ js.Error, Unit], 
Unit]

type EventSourceFunc = (js.Function3[
/* arg */ EventSourceFuncArg, 
/* successCallback */ js.Function1[/* eventInputs */ js.Array[EventInput], Unit], 
/* failureCallback */ js.Function1[/* error */ js.Error, Unit], 
Unit]) | (js.Function1[/* arg */ EventSourceFuncArg, js.Promise[js.Array[EventInput]]])

type EventSourceHash = StringDictionary[EventSource[Any]]

type EventSourceInput = EventSourceInputObject | (js.Array[// object in extended form
EventInput]) | EventSourceFunc | (// just a function
String)

type EventSourceRefiners = BuiltInEventSourceRefiners

type EventSourceSuccessResponseHandler = js.ThisFunction2[
/* this */ CalendarImpl, 
/* rawData */ Any, 
/* response */ Any, 
js.Array[EventInput] | Unit]

type EventUiHash = StringDictionary[EventUi]

type EventUiRefiners = BuiltInEventUiRefiners

type ExternalDefTransform = js.Function2[/* dateSpan */ DateSpan, /* dragMeta */ DragMeta, Any]

type FieldSpecInput[Subject] = String | (js.Array[FieldSpecInputFunc[Subject] | String]) | FieldSpecInputFunc[Subject]

type FieldSpecInputFunc[Subject] = js.Function2[/* a */ Subject, /* b */ Subject, Double]

type FormatterInput = NativeFormatterOptions | String | FuncFormatterFunc

type FuncFormatterFunc = js.Function1[/* arg */ VerboseFormattingArg, String]

type GenericListenerRefiners = StringDictionary[Identity[js.ThisFunction1[/* this */ CalendarApi, /* repeated */ Any, Unit]]]

type GenericRefiners = StringDictionary[js.Function1[/* input */ Any, Any]]

type HandlerFuncTypeHash = StringDictionary[js.Function1[/* repeated */ Any, Any]]

type Identity[T] = js.Function1[/* raw */ T, T]

type InnerContainerComponent = FunctionalComponent[ElProps]

type InnerContainerFunc[RenderProps] = js.Function3[
/* InnerContainer */ InnerContainerComponent, 
/* renderProps */ RenderProps, 
/* elAttrs */ ElAttrs, 
ComponentChildren]

type InteractionSettingsStore = StringDictionary[InteractionSettings]

type LocaleCodeArg = String | js.Array[String]

type LocaleInputMap = StringDictionary[LocaleInput]

type LocaleSingularArg = LocaleCodeArg | LocaleInput

type MemoiseArrayFunc[Args /* <: js.Array[Any] */, Res] = js.Function1[/* argSets */ js.Array[Args], js.Array[Res]]

type MemoizeHashFunc[Args /* <: js.Array[Any] */, Res] = js.Function1[/* argHash */ StringDictionary[Args], StringDictionary[Res]]

type MoreLinkAction = MoreLinkSimpleAction | MoreLinkHandler

type MoreLinkHandler = js.Function1[/* arg */ MoreLinkArg, MoreLinkSimpleAction | Unit]

/* Rewritten from type alias, can be one of: 
  - typings.fullcalendarCore.fullcalendarCoreStrings.popover
  - typings.fullcalendarCore.fullcalendarCoreStrings.week
  - typings.fullcalendarCore.fullcalendarCoreStrings.day
  - typings.fullcalendarCore.fullcalendarCoreStrings.timeGridWeek
  - typings.fullcalendarCore.fullcalendarCoreStrings.timeGridDay
  - java.lang.String
*/
type MoreLinkSimpleAction = _MoreLinkSimpleAction | String

type MountArg[ContentArg] = ContentArg & El

type OptionChangeHandler = js.Function2[/* propValue */ Any, /* context */ CalendarContext, Unit]

type OptionChangeHandlerMap = StringDictionary[OptionChangeHandler]

type OverlapFunc = js.Function2[/* stillEvent */ EventImpl, /* movingEvent */ EventImpl | Null, Boolean]

type ReducerFunc = js.Function3[
/* currentState */ Dictionary | Null, 
/* action */ Action | Null, 
/* context */ CalendarContext & CalendarDataManagerState, 
Dictionary]

type ResizeHandler = js.Function1[/* force */ Boolean, Unit]

type ScrollRequestHandler = js.Function1[/* request */ ScrollRequest, Boolean]

type ViewComponentType = ComponentType[ViewProps]

type ViewConfigInput = ViewComponentType | ViewOptions

type ViewConfigInputHash = StringDictionary[ViewConfigInput]

type ViewContainerAppend = js.Function1[/* context */ CalendarContext, ComponentChildren]

type ViewOptionRefiners = BuiltInViewOptionRefiners

type ViewPropsTransformerClass = Instantiable0[ViewPropsTransformer]

type ViewSpecHash = StringDictionary[ViewSpec]

/* Rewritten from type alias, can be one of: 
  - typings.fullcalendarCore.fullcalendarCoreStrings.local
  - typings.fullcalendarCore.fullcalendarCoreStrings.ISO
  - js.Function1[/ * m * / js.Date, scala.Double]
*/
type WeekNumberCalculation = _WeekNumberCalculation | (js.Function1[/* m */ js.Date, Double])

type WillUnmountHandler[TheMountArg /* <: El */] = js.Function1[/* mountArg */ TheMountArg, Unit]

type dateSelectionJoinTransformer = js.Function2[/* hit0 */ Hit, /* hit1 */ Hit, Any]

type eventDefMutationApplier = js.Function3[
/* eventDef */ EventDef, 
/* mutation */ EventMutation, 
/* context */ CalendarContext, 
Unit]

type eventDragMutationMassager = js.Function3[/* mutation */ EventMutation, /* hit0 */ Hit, /* hit1 */ Hit, Unit]

type eventIsDraggableTransformer = js.Function4[
/* val */ Boolean, 
/* eventDef */ EventDef, 
/* eventUi */ EventUi, 
/* context */ CalendarContext, 
Boolean]

type isPropsValidTester = js.Function2[/* props */ SplittableProps, /* context */ CalendarContext, Boolean]
