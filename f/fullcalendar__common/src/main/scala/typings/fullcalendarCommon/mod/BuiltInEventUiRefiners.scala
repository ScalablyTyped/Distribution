package typings.fullcalendarCommon.mod

import typings.std.BooleanConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltInEventUiRefiners extends StObject {
  
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
  
  /* standard es5 */
  def color(): String
  def color(value: Any): String
  @JSName("color")
  var color_Original: StringConstructor
  
  def constraint(raw: Any): Any
  @JSName("constraint")
  var constraint_Original: Identity_[Any]
  
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
  
  def overlap(raw: Boolean): Boolean
  @JSName("overlap")
  var overlap_Original: Identity_[Boolean]
  
  /* standard es5 */
  def startEditable[T](): Boolean
  def startEditable[T](value: T): Boolean
  @JSName("startEditable")
  var startEditable_Original: BooleanConstructor
  
  /* standard es5 */
  def textColor(): String
  def textColor(value: Any): String
  @JSName("textColor")
  var textColor_Original: StringConstructor
}
object BuiltInEventUiRefiners {
  
  inline def apply(
    allow: AllowFunc => AllowFunc,
    backgroundColor: StringConstructor,
    borderColor: StringConstructor,
    color: StringConstructor,
    constraint: Any => Any,
    display: StringConstructor,
    durationEditable: BooleanConstructor,
    editable: BooleanConstructor,
    overlap: Boolean => Boolean,
    startEditable: BooleanConstructor,
    textColor: StringConstructor
  ): BuiltInEventUiRefiners = {
    val __obj = js.Dynamic.literal(allow = js.Any.fromFunction1(allow), backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], constraint = js.Any.fromFunction1(constraint), display = display.asInstanceOf[js.Any], durationEditable = durationEditable.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], overlap = js.Any.fromFunction1(overlap), startEditable = startEditable.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltInEventUiRefiners]
  }
  
  extension [Self <: BuiltInEventUiRefiners](x: Self) {
    
    inline def setAllow(value: AllowFunc => AllowFunc): Self = StObject.set(x, "allow", js.Any.fromFunction1(value))
    
    inline def setBackgroundColor(value: StringConstructor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: StringConstructor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setColor(value: StringConstructor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setConstraint(value: Any => Any): Self = StObject.set(x, "constraint", js.Any.fromFunction1(value))
    
    inline def setDisplay(value: StringConstructor): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDurationEditable(value: BooleanConstructor): Self = StObject.set(x, "durationEditable", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: BooleanConstructor): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setOverlap(value: Boolean => Boolean): Self = StObject.set(x, "overlap", js.Any.fromFunction1(value))
    
    inline def setStartEditable(value: BooleanConstructor): Self = StObject.set(x, "startEditable", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: StringConstructor): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
  }
}
