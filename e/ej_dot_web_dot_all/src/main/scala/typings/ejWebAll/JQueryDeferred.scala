package typings.ejWebAll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryDeferred[T] extends StObject {
  
  /**
    * Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
}
object JQueryDeferred {
  
  @scala.inline
  def apply[T](): JQueryDeferred[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryDeferred[T]]
  }
  
  @scala.inline
  implicit class JQueryDeferredMutableBuilder[Self <: JQueryDeferred[?], T] (val x: Self & JQueryDeferred[T]) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
  }
}
