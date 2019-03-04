package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /** Retrieves details of an Android app permission for display to an enterprise admin. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltFieldsKeyLanguage): gapiDotClientLib.gapiNs.clientNs.Request[Permission]
}

object PermissionsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltFieldsKeyLanguage, 
      gapiDotClientLib.gapiNs.clientNs.Request[Permission]
    ]
  ): PermissionsResource = {
    val __obj = js.Dynamic.literal(get = get)
  
    __obj.asInstanceOf[PermissionsResource]
  }
}

