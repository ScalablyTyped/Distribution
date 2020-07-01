package typings.gapiClientCalendar.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Private extends js.Object {
  /** Properties that are private to the copy of the event that appears on this calendar. */
  var `private`: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.gapiClientCalendar.gapiClientCalendarStrings.Private with TopLevel[js.Any]
  ] = js.undefined
  /** Properties that are shared between copies of the event on other attendees' calendars. */
  var shared: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.gapiClientCalendar.gapiClientCalendarStrings.Private with TopLevel[js.Any]
  ] = js.undefined
}

object Private {
  @scala.inline
  def apply(
    `private`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.gapiClientCalendar.gapiClientCalendarStrings.Private with TopLevel[js.Any] = null,
    shared: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.gapiClientCalendar.gapiClientCalendarStrings.Private with TopLevel[js.Any] = null
  ): Private = {
    val __obj = js.Dynamic.literal()
    if (`private` != null) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (shared != null) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    __obj.asInstanceOf[Private]
  }
}

