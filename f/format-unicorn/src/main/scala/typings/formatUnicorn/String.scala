package typings.formatUnicorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String extends StObject {
  
  def formatUnicorn(replacements: js.Object): java.lang.String
}
object String {
  
  inline def apply(formatUnicorn: js.Object => java.lang.String): String = {
    val __obj = js.Dynamic.literal(formatUnicorn = js.Any.fromFunction1(formatUnicorn))
    __obj.asInstanceOf[String]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: String] (val x: Self) extends AnyVal {
    
    inline def setFormatUnicorn(value: js.Object => java.lang.String): Self = StObject.set(x, "formatUnicorn", js.Any.fromFunction1(value))
  }
}
