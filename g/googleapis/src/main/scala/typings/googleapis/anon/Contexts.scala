package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contexts extends StObject {
  
  var contexts: js.UndefOr[js.Array[AuctionType]] = js.undefined
  
  var details: js.UndefOr[js.Array[String]] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
}
object Contexts {
  
  @scala.inline
  def apply(): Contexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contexts]
  }
  
  @scala.inline
  implicit class ContextsMutableBuilder[Self <: Contexts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: js.Array[AuctionType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: AuctionType*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
