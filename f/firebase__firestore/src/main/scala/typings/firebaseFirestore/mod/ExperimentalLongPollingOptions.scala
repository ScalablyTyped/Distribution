package typings.firebaseFirestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentalLongPollingOptions extends StObject {
  
  /**
    * The desired maximum timeout interval, in seconds, to complete a
    * long-polling GET response. Valid values are between 5 and 30, inclusive.
    * Floating point values are allowed and will be rounded to the nearest
    * millisecond.
    *
    * By default, when long-polling is used the "hanging GET" request sent by
    * the client times out after 30 seconds. To request a different timeout
    * from the server, set this setting with the desired timeout.
    *
    * Changing the default timeout may be useful, for example, if the buffering
    * proxy that necessitated enabling long-polling in the first place has a
    * shorter timeout for hanging GET requests, in which case setting the
    * long-polling timeout to a shorter value, such as 25 seconds, may fix
    * prematurely-closed hanging GET requests.
    * For example, see https://github.com/firebase/firebase-js-sdk/issues/6987.
    */
  var timeoutSeconds: js.UndefOr[Double] = js.undefined
}
object ExperimentalLongPollingOptions {
  
  inline def apply(): ExperimentalLongPollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentalLongPollingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentalLongPollingOptions] (val x: Self) extends AnyVal {
    
    inline def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
