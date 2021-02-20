package typings.ejWebAll.anon

import typings.ejWebAll.ej.Rating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRating extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Rating = js.native
}
object TypeofRating {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Rating): TypeofRating = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRating]
  }
  
  @scala.inline
  implicit class TypeofRatingMutableBuilder[Self <: TypeofRating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Rating): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
