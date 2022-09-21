package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.mod.AllowFunc
import typings.fullcalendarCommon.mod.ClassNamesInput
import typings.fullcalendarCommon.mod.DateInput
import typings.fullcalendarCommon.mod.Dictionary
import typings.fullcalendarCommon.mod.Identity_
import typings.std.BooleanConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allow extends StObject {
  
  /* standard es5 */
  def allDay[T](): Boolean
  def allDay[T](value: T): Boolean
  @JSName("allDay")
  var allDay_Original: BooleanConstructor
  
  def allow(raw: AllowFunc): AllowFunc
  @JSName("allow")
  var allow_Original: Identity_[AllowFunc]
  
  /* standard es5 */
  def backgroundColor(): String
  def backgroundColor(value: Any): String
  @JSName("backgroundColor")
  var backgroundColor_Original: StringConstructor
  
  /* standard es5 */
  def borderColor(): String
  def borderColor(value: Any): String
  @JSName("borderColor")
  var borderColor_Original: StringConstructor
  
  def className(raw: ClassNamesInput): js.Array[String]
  @JSName("className")
  var className_Original: js.Function1[/* raw */ ClassNamesInput, js.Array[String]]
  
  def classNames(raw: ClassNamesInput): js.Array[String]
  @JSName("classNames")
  var classNames_Original: js.Function1[/* raw */ ClassNamesInput, js.Array[String]]
  
  /* standard es5 */
  def color(): String
  def color(value: Any): String
  @JSName("color")
  var color_Original: StringConstructor
  
  def constraint(raw: Any): Any
  @JSName("constraint")
  var constraint_Original: Identity_[Any]
  
  def date(raw: DateInput): DateInput
  @JSName("date")
  var date_Original: Identity_[DateInput]
  
  /* standard es5 */
  def display(): String
  def display(value: Any): String
  @JSName("display")
  var display_Original: StringConstructor
  
  /* standard es5 */
  def durationEditable[T](): Boolean
  def durationEditable[T](value: T): Boolean
  @JSName("durationEditable")
  var durationEditable_Original: BooleanConstructor
  
  /* standard es5 */
  def editable[T](): Boolean
  def editable[T](value: T): Boolean
  @JSName("editable")
  var editable_Original: BooleanConstructor
  
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
  
  def overlap(raw: Boolean): Boolean
  @JSName("overlap")
  var overlap_Original: Identity_[Boolean]
  
  def start(raw: DateInput): DateInput
  
  /* standard es5 */
  def startEditable[T](): Boolean
  def startEditable[T](value: T): Boolean
  @JSName("startEditable")
  var startEditable_Original: BooleanConstructor
  
  @JSName("start")
  var start_Original: Identity_[DateInput]
  
  /* standard es5 */
  def textColor(): String
  def textColor(value: Any): String
  @JSName("textColor")
  var textColor_Original: StringConstructor
  
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
object Allow {
  
  inline def apply(
    allDay: BooleanConstructor,
    allow: AllowFunc => AllowFunc,
    backgroundColor: StringConstructor,
    borderColor: StringConstructor,
    className: /* raw */ ClassNamesInput => js.Array[String],
    classNames: /* raw */ ClassNamesInput => js.Array[String],
    color: StringConstructor,
    constraint: Any => Any,
    date: DateInput => DateInput,
    display: StringConstructor,
    durationEditable: BooleanConstructor,
    editable: BooleanConstructor,
    end: DateInput => DateInput,
    extendedProps: Dictionary => Dictionary,
    groupId: StringConstructor,
    id: StringConstructor,
    interactive: BooleanConstructor,
    overlap: Boolean => Boolean,
    start: DateInput => DateInput,
    startEditable: BooleanConstructor,
    textColor: StringConstructor,
    title: StringConstructor,
    url: StringConstructor
  ): Allow = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], allow = js.Any.fromFunction1(allow), backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], className = js.Any.fromFunction1(className), classNames = js.Any.fromFunction1(classNames), color = color.asInstanceOf[js.Any], constraint = js.Any.fromFunction1(constraint), date = js.Any.fromFunction1(date), display = display.asInstanceOf[js.Any], durationEditable = durationEditable.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), extendedProps = js.Any.fromFunction1(extendedProps), groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], overlap = js.Any.fromFunction1(overlap), start = js.Any.fromFunction1(start), startEditable = startEditable.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allow]
  }
  
  extension [Self <: Allow](x: Self) {
    
    inline def setAllDay(value: BooleanConstructor): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllow(value: AllowFunc => AllowFunc): Self = StObject.set(x, "allow", js.Any.fromFunction1(value))
    
    inline def setBackgroundColor(value: StringConstructor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: StringConstructor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: /* raw */ ClassNamesInput => js.Array[String]): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
    
    inline def setClassNames(value: /* raw */ ClassNamesInput => js.Array[String]): Self = StObject.set(x, "classNames", js.Any.fromFunction1(value))
    
    inline def setColor(value: StringConstructor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setConstraint(value: Any => Any): Self = StObject.set(x, "constraint", js.Any.fromFunction1(value))
    
    inline def setDate(value: DateInput => DateInput): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
    
    inline def setDisplay(value: StringConstructor): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDurationEditable(value: BooleanConstructor): Self = StObject.set(x, "durationEditable", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: BooleanConstructor): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: DateInput => DateInput): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    inline def setExtendedProps(value: Dictionary => Dictionary): Self = StObject.set(x, "extendedProps", js.Any.fromFunction1(value))
    
    inline def setGroupId(value: StringConstructor): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setId(value: StringConstructor): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: BooleanConstructor): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setOverlap(value: Boolean => Boolean): Self = StObject.set(x, "overlap", js.Any.fromFunction1(value))
    
    inline def setStart(value: DateInput => DateInput): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartEditable(value: BooleanConstructor): Self = StObject.set(x, "startEditable", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: StringConstructor): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: StringConstructor): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: StringConstructor): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
