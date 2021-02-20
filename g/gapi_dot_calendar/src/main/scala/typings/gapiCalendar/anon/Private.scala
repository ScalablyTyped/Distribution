package typings.gapiCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Private extends StObject {
  
  def `private`(key: String): String = js.native
  
  def shared(key: String): String = js.native
}
object Private {
  
  @scala.inline
  def apply(`private`: String => String, shared: String => String): Private = {
    val __obj = js.Dynamic.literal(shared = js.Any.fromFunction1(shared))
    __obj.updateDynamic("private")(js.Any.fromFunction1(`private`))
    __obj.asInstanceOf[Private]
  }
  
  @scala.inline
  implicit class PrivateMutableBuilder[Self <: Private] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivate(value: String => String): Self = StObject.set(x, "private", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShared(value: String => String): Self = StObject.set(x, "shared", js.Any.fromFunction1(value))
  }
}
