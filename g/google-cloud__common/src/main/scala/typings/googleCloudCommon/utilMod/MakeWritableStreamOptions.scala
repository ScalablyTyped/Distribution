package typings.googleCloudCommon.utilMod

import typings.googleCloudCommon.anon.ContentType
import typings.googleCloudCommon.anon.OnAuthenticated
import typings.teenyRequest.mod.Options
import typings.teenyRequest.mod.OptionsWithUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeWritableStreamOptions extends js.Object {
  
  /**
    * A connection instance used to get a token with and send the request
    * through.
    */
  var connection: js.UndefOr[js.Object] = js.native
  
  def makeAuthenticatedRequest(reqOpts: OptionsWithUri, fnobj: OnAuthenticated): Unit = js.native
  
  /**
    * Metadata to send at the head of the request.
    */
  var metadata: js.UndefOr[ContentType] = js.native
  
  /**
    * Request object, in the format of a standard Node.js http.request() object.
    */
  var request: js.UndefOr[Options] = js.native
}
object MakeWritableStreamOptions {
  
  @scala.inline
  def apply(makeAuthenticatedRequest: (OptionsWithUri, OnAuthenticated) => Unit): MakeWritableStreamOptions = {
    val __obj = js.Dynamic.literal(makeAuthenticatedRequest = js.Any.fromFunction2(makeAuthenticatedRequest))
    __obj.asInstanceOf[MakeWritableStreamOptions]
  }
  
  @scala.inline
  implicit class MakeWritableStreamOptionsOps[Self <: MakeWritableStreamOptions] (val x: Self) extends AnyVal {
    
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
    def setMakeAuthenticatedRequest(value: (OptionsWithUri, OnAuthenticated) => Unit): Self = this.set("makeAuthenticatedRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConnection(value: js.Object): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setMetadata(value: ContentType): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setRequest(value: Options): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
}
