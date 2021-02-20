package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestHandle[T] extends StObject {
  
  /**
    * Cancels the request.
    * The ResponseCallback will not be invoked, and promises will not be settled.
    * Use the RequestHandle#finally handler will still be called.
    */
  def cancel(): Unit = js.native
  
  /**
    * Registers a callback that will be called when the response is finished, either successfully, or with an error,
    * or having been cancelled. Use this to clean up resources.
    * Returns this handle, for chaining.
    */
  def `finally`(callback: js.Function0[Unit]): RequestHandle[T] = js.native
}
object RequestHandle {
  
  @scala.inline
  def apply[T](cancel: () => Unit, `finally`: js.Function0[Unit] => RequestHandle[T]): RequestHandle[T] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.updateDynamic("finally")(js.Any.fromFunction1(`finally`))
    __obj.asInstanceOf[RequestHandle[T]]
  }
  
  @scala.inline
  implicit class RequestHandleMutableBuilder[Self <: RequestHandle[_], T] (val x: Self with RequestHandle[T]) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: js.Function0[Unit] => RequestHandle[T]): Self = StObject.set(x, "finally", js.Any.fromFunction1(value))
  }
}
