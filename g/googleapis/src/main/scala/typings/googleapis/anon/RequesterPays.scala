package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequesterPays extends StObject {
  
  var requesterPays: js.UndefOr[Boolean] = js.native
}
object RequesterPays {
  
  @scala.inline
  def apply(): RequesterPays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequesterPays]
  }
  
  @scala.inline
  implicit class RequesterPaysMutableBuilder[Self <: RequesterPays] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequesterPays(value: Boolean): Self = StObject.set(x, "requesterPays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterPaysUndefined: Self = StObject.set(x, "requesterPays", js.undefined)
  }
}
