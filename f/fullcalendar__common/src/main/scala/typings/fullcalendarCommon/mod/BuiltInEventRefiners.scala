package typings.fullcalendarCommon.mod

import typings.std.BooleanConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltInEventRefiners extends StObject {
  
  /* standard es5 */
  def allDay[T](): Boolean
  def allDay[T](value: T): Boolean
  @JSName("allDay")
  var allDay_Original: BooleanConstructor
  
  def date(raw: DateInput): DateInput
  @JSName("date")
  var date_Original: Identity_[DateInput]
  
  def end(raw: DateInput): DateInput
  @JSName("end")
  var end_Original: Identity_[DateInput]
  
  def extendedProps(raw: Dictionary): Dictionary
  @JSName("extendedProps")
  var extendedProps_Original: Identity_[Dictionary]
  
  /* standard es5 */
  def groupId(): String
  def groupId(value: Any): String
  @JSName("groupId")
  var groupId_Original: StringConstructor
  
  /* standard es5 */
  def id(): String
  def id(value: Any): String
  @JSName("id")
  var id_Original: StringConstructor
  
  /* standard es5 */
  def interactive[T](): Boolean
  def interactive[T](value: T): Boolean
  @JSName("interactive")
  var interactive_Original: BooleanConstructor
  
  def start(raw: DateInput): DateInput
  @JSName("start")
  var start_Original: Identity_[DateInput]
  
  /* standard es5 */
  def title(): String
  def title(value: Any): String
  @JSName("title")
  var title_Original: StringConstructor
  
  /* standard es5 */
  def url(): String
  def url(value: Any): String
  @JSName("url")
  var url_Original: StringConstructor
}
object BuiltInEventRefiners {
  
  inline def apply(
    allDay: BooleanConstructor,
    date: DateInput => DateInput,
    end: DateInput => DateInput,
    extendedProps: Dictionary => Dictionary,
    groupId: StringConstructor,
    id: StringConstructor,
    interactive: BooleanConstructor,
    start: DateInput => DateInput,
    title: StringConstructor,
    url: StringConstructor
  ): BuiltInEventRefiners = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], date = js.Any.fromFunction1(date), end = js.Any.fromFunction1(end), extendedProps = js.Any.fromFunction1(extendedProps), groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltInEventRefiners]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuiltInEventRefiners] (val x: Self) extends AnyVal {
    
    inline def setAllDay(value: BooleanConstructor): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setDate(value: DateInput => DateInput): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
    
    inline def setEnd(value: DateInput => DateInput): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    inline def setExtendedProps(value: Dictionary => Dictionary): Self = StObject.set(x, "extendedProps", js.Any.fromFunction1(value))
    
    inline def setGroupId(value: StringConstructor): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setId(value: StringConstructor): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: BooleanConstructor): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setStart(value: DateInput => DateInput): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setTitle(value: StringConstructor): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: StringConstructor): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
