package typings.ejWebAll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryPromise[T] extends StObject {
  
  /**
    * Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
}
object JQueryPromise {
  
  @scala.inline
  def apply[T](): JQueryPromise[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryPromise[T]]
  }
  
  @scala.inline
  implicit class JQueryPromiseMutableBuilder[Self <: JQueryPromise[_], T] (val x: Self with JQueryPromise[T]) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
  }
}
