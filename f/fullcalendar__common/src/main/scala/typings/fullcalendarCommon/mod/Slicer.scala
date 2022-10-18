package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@fullcalendar/common", "Slicer")
@js.native
open class Slicer[SegType /* <: Seg */, ExtraArgs /* <: js.Array[Any] */] () extends StObject {
  
  /* private */ var _sliceBusinessHours: Any = js.native
  
  /* private */ var _sliceDateSpan: Any = js.native
  
  /* private */ var _sliceEventStore: Any = js.native
  
  /* private */ var _sliceInteraction: Any = js.native
  
  /* protected */ var forceDayIfListItem: Boolean = js.native
  
  /* private */ var sliceBusinessHours: Any = js.native
  
  /* private */ var sliceDateSelection: Any = js.native
  
  /* private */ var sliceEventDrag: Any = js.native
  
  /* private */ var sliceEventRange: Any = js.native
  
  /* private */ var sliceEventRanges: Any = js.native
  
  /* private */ var sliceEventResize: Any = js.native
  
  /* private */ var sliceEventStore: Any = js.native
  
  def sliceNowDate(
    date: js.Date,
    context: CalendarContext,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param extraArgs because its type ExtraArgs is not an array type */ extraArgs: ExtraArgs
  ): js.Array[SegType] = js.native
  
  def sliceProps(
    props: SliceableProps,
    dateProfile: DateProfile,
    nextDayThreshold: Null,
    context: CalendarContext,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param extraArgs because its type ExtraArgs is not an array type */ extraArgs: ExtraArgs
  ): SlicedProps[SegType] = js.native
  def sliceProps(
    props: SliceableProps,
    dateProfile: DateProfile,
    nextDayThreshold: Duration,
    context: CalendarContext,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param extraArgs because its type ExtraArgs is not an array type */ extraArgs: ExtraArgs
  ): SlicedProps[SegType] = js.native
  
  def sliceRange(
    dateRange: DateRange,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param extraArgs because its type ExtraArgs is not an array type */ extraArgs: ExtraArgs
  ): js.Array[SegType] = js.native
}
