package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountResource extends js.Object {
  /** Get the email address of this project's Google Cloud Storage service account. */
  def get(request: gapiDotClientDotStorageLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ServiceAccount]
}

object ServiceAccountResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[ServiceAccount]
    ]
  ): ServiceAccountResource = {
    val __obj = js.Dynamic.literal(get = get)
  
    __obj.asInstanceOf[ServiceAccountResource]
  }
}

