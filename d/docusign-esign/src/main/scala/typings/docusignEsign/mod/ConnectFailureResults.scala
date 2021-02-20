package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectFailureResults extends StObject {
  
  /**
    * Details about a Connect failure result.
    */
  var retryQueue: js.UndefOr[
    js.Array[
      /* This object contains details about a Connect failure result. */ ConnectFailureResult
    ]
  ] = js.native
}
object ConnectFailureResults {
  
  @scala.inline
  def apply(): ConnectFailureResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectFailureResults]
  }
  
  @scala.inline
  implicit class ConnectFailureResultsMutableBuilder[Self <: ConnectFailureResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetryQueue(
      value: js.Array[
          /* This object contains details about a Connect failure result. */ ConnectFailureResult
        ]
    ): Self = StObject.set(x, "retryQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryQueueUndefined: Self = StObject.set(x, "retryQueue", js.undefined)
    
    @scala.inline
    def setRetryQueueVarargs(value: (/* This object contains details about a Connect failure result. */ ConnectFailureResult)*): Self = StObject.set(x, "retryQueue", js.Array(value :_*))
  }
}
