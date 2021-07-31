package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryOptions extends StObject {
  
  /** If a transient server error occurs, how long to wait before retrying the request, in milliseconds. (Default: 500 ms). */
  var interval: js.UndefOr[Double] = js.undefined
}
object RetryOptions {
  
  @scala.inline
  def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  
  @scala.inline
  implicit class RetryOptionsMutableBuilder[Self <: RetryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
