package typings.fullcalendarCore.internalCommonMod

import typings.fullcalendarCore.anon.Dow
import typings.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var codeArg: LocaleCodeArg
  
  var codes: js.Array[String]
  
  var options: CalendarOptionsRefined
  
  var simpleNumberFormat: NumberFormat
  
  var week: Dow
}
object Locale {
  
  inline def apply(
    codeArg: LocaleCodeArg,
    codes: js.Array[String],
    options: CalendarOptionsRefined,
    simpleNumberFormat: NumberFormat,
    week: Dow
  ): Locale = {
    val __obj = js.Dynamic.literal(codeArg = codeArg.asInstanceOf[js.Any], codes = codes.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], simpleNumberFormat = simpleNumberFormat.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
    
    inline def setCodeArg(value: LocaleCodeArg): Self = StObject.set(x, "codeArg", value.asInstanceOf[js.Any])
    
    inline def setCodeArgVarargs(value: String*): Self = StObject.set(x, "codeArg", js.Array(value*))
    
    inline def setCodes(value: js.Array[String]): Self = StObject.set(x, "codes", value.asInstanceOf[js.Any])
    
    inline def setCodesVarargs(value: String*): Self = StObject.set(x, "codes", js.Array(value*))
    
    inline def setOptions(value: CalendarOptionsRefined): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSimpleNumberFormat(value: NumberFormat): Self = StObject.set(x, "simpleNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setWeek(value: Dow): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
  }
}
