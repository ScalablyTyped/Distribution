package typings.googleMarkerclustererplus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String extends StObject {
  
  def trim(): java.lang.String
}
object String {
  
  @scala.inline
  def apply(trim: () => java.lang.String): String = {
    val __obj = js.Dynamic.literal(trim = js.Any.fromFunction0(trim))
    __obj.asInstanceOf[String]
  }
  
  @scala.inline
  implicit class StringMutableBuilder[Self <: String] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrim(value: () => java.lang.String): Self = StObject.set(x, "trim", js.Any.fromFunction0(value))
  }
}
