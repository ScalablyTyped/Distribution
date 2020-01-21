package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BootstrapSchedulerRecurrenceRange extends js.Object

@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerRecurrenceRange")
@js.native
object BootstrapSchedulerRecurrenceRange extends js.Object {
  @js.native
  sealed trait EndByDate extends BootstrapSchedulerRecurrenceRange
  
  @js.native
  sealed trait NoEndDate extends BootstrapSchedulerRecurrenceRange
  
  @js.native
  sealed trait OccurrenceCount extends BootstrapSchedulerRecurrenceRange
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BootstrapSchedulerRecurrenceRange with String] = js.native
  /* "EndByDate" */ @js.native
  object EndByDate extends TopLevel[EndByDate with String]
  
  /* "NoEndDate" */ @js.native
  object NoEndDate extends TopLevel[NoEndDate with String]
  
  /* "OccurrenceCount" */ @js.native
  object OccurrenceCount extends TopLevel[OccurrenceCount with String]
  
}

