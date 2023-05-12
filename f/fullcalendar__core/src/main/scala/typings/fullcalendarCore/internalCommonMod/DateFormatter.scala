package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateFormatter extends StObject {
  
  def format(date: ZonedMarker, context: DateFormattingContext): String = js.native
  
  def formatRange(start: ZonedMarker, end: ZonedMarker, context: DateFormattingContext): String = js.native
  def formatRange(
    start: ZonedMarker,
    end: ZonedMarker,
    context: DateFormattingContext,
    betterDefaultSeparator: String
  ): String = js.native
}
