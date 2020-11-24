package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectFailureResults extends js.Object {
  
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
  implicit class ConnectFailureResultsOps[Self <: ConnectFailureResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRetryQueueVarargs(value: (/* This object contains details about a Connect failure result. */ ConnectFailureResult)*): Self = this.set("retryQueue", js.Array(value :_*))
    
    @scala.inline
    def setRetryQueue(
      value: js.Array[
          /* This object contains details about a Connect failure result. */ ConnectFailureResult
        ]
    ): Self = this.set("retryQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryQueue: Self = this.set("retryQueue", js.undefined)
  }
}
