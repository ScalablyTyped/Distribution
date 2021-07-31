package typings.ejWebAll

import typings.ejWebAll.anon.Typeofej
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var ej: Typeofej
}
object Window {
  
  @scala.inline
  def apply(ej: Typeofej): Window = {
    val __obj = js.Dynamic.literal(ej = ej.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEj(value: Typeofej): Self = StObject.set(x, "ej", value.asInstanceOf[js.Any])
  }
}
