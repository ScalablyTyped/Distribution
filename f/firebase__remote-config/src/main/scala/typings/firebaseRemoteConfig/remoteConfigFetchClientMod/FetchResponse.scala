package typings.firebaseRemoteConfig.remoteConfigFetchClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchResponse extends js.Object {
  /**
    * Defines the map of parameters returned as "entries" in the fetch response body.
    *
    * <p>Only defined for 200 responses.
    */
  var config: js.UndefOr[FirebaseRemoteConfigObject] = js.undefined
  /**
    * Defines the ETag response header value.
    *
    * <p>Only defined for 200 and 304 responses.
    */
  var eTag: js.UndefOr[String] = js.undefined
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
  var status: Double
}

object FetchResponse {
  @scala.inline
  def apply(status: Double, config: FirebaseRemoteConfigObject = null, eTag: String = null): FetchResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (eTag != null) __obj.updateDynamic("eTag")(eTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResponse]
  }
}

