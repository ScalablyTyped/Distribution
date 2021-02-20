package typings.flexmonster.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blocking extends StObject {
  
  var blocking: js.UndefOr[Boolean] = js.native
  
  var buttons: js.UndefOr[js.Array[Handler]] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Blocking {
  
  @scala.inline
  def apply(): Blocking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blocking]
  }
  
  @scala.inline
  implicit class BlockingMutableBuilder[Self <: Blocking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockingUndefined: Self = StObject.set(x, "blocking", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Array[Handler]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: Handler*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
