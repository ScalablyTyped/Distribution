package typings.firebaseRemoteConfig.remoteConfigFetchClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchRequest extends js.Object {
  /**
    * Uses cached config if it is younger than this age.
    *
    * <p>Required because it's defined by settings, which always have a value.
    *
    * <p>Comparable to passing `headers = { 'Cache-Control': max-age <maxAge> }` to the native
    * Fetch API.
    */
  var cacheMaxAgeMillis: Double = js.native
  /**
    * The ETag header value from the last response.
    *
    * <p>Optional in case this is the first request.
    *
    * <p>Comparable to passing `headers = { 'If-None-Match': <eTag> }` to the native Fetch API.
    */
  var eTag: js.UndefOr[String] = js.native
  /**
    * An event bus for the signal to abort a request.
    *
    * <p>Required because all requests should be abortable.
    *
    * <p>Comparable to the native
    * Fetch API's "signal" field on its request configuration object
    * https://fetch.spec.whatwg.org/#dom-requestinit-signal.
    *
    * <p>Disambiguation: Remote Config commonly refers to API inputs as
    * "signals". See the private ConfigFetchRequestBody interface for those:
    * http://google3/firebase/remote_config/web/src/core/rest_client.ts?l=14&rcl=255515243.
    */
  var signal: RemoteConfigAbortSignal = js.native
}

object FetchRequest {
  @scala.inline
  def apply(cacheMaxAgeMillis: Double, signal: RemoteConfigAbortSignal): FetchRequest = {
    val __obj = js.Dynamic.literal(cacheMaxAgeMillis = cacheMaxAgeMillis.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchRequest]
  }
  @scala.inline
  implicit class FetchRequestOps[Self <: FetchRequest] (val x: Self) extends AnyVal {
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
    def setCacheMaxAgeMillis(value: Double): Self = this.set("cacheMaxAgeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignal(value: RemoteConfigAbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def setETag(value: String): Self = this.set("eTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("eTag", js.undefined)
  }
  
}

