package typings.firebaseRemoteConfig.remoteConfigFetchClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchResponse extends js.Object {
  
  /**
    * Defines the map of parameters returned as "entries" in the fetch response body.
    *
    * <p>Only defined for 200 responses.
    */
  var config: js.UndefOr[FirebaseRemoteConfigObject] = js.native
  
  /**
    * Defines the ETag response header value.
    *
    * <p>Only defined for 200 and 304 responses.
    */
  var eTag: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status, which is useful for differentiating success responses with data from
    * those without.
    *
    * <p>{@link RemoteConfigClient} is modeled after the native {@link GlobalFetch} interface, so
    * HTTP status is first-class.
    *
    * <p>Disambiguation: the fetch response returns a legacy "state" value that is redundant with the
    * HTTP status code. The former is normalized into the latter.
    */
  var status: Double = js.native
}
object FetchResponse {
  
  @scala.inline
  def apply(status: Double): FetchResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResponse]
  }
  
  @scala.inline
  implicit class FetchResponseOps[Self <: FetchResponse] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: FirebaseRemoteConfigObject): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = this.set("eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("eTag", js.undefined)
  }
}
