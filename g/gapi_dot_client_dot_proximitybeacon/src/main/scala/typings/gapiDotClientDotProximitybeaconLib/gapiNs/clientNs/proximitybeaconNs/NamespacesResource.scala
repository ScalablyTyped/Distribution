package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespacesResource extends js.Object {
  /**
    * Lists all attachment namespaces owned by your Google Developers Console
    * project. Attachment data associated with a beacon must include a
    * namespaced type, and the namespace must be owned by your project.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    */
  def list(request: gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ListNamespacesResponse]
  /**
    * Updates the information about the specified namespace. Only the namespace
    * visibility can be updated.
    */
  def update(request: gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Namespace]
}

object NamespacesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListNamespacesResponse]
    ],
    update: js.Function1[
      gapiDotClientDotProximitybeaconLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Namespace]
    ]
  ): NamespacesResource = {
    val __obj = js.Dynamic.literal(list = list, update = update)
  
    __obj.asInstanceOf[NamespacesResource]
  }
}

