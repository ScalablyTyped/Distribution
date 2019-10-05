package typings.firebaseDashAdmin.admin.credential

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.credential.applicationDefault")
@js.native
object applicationDefault extends js.Object {
  /**
    * Returns a credential created from the
    * {@link
    *    https://developers.google.com/identity/protocols/application-default-credentials
    *    Google Application Default Credentials}
    * that grants admin access to Firebase services. This credential can be used
    * in the call to
    * {@link
    *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
    *  `admin.initializeApp()`}.
    *
    * Google Application Default Credentials are available on any Google
    * infrastructure, such as Google App Engine and Google Compute Engine.
    *
    * See
    * {@link
    *   https://firebase.google.com/docs/admin/setup#initialize_the_sdk
    *   Initialize the SDK}
    * for more details.
    *
    * @example
    * ```javascript
    * admin.initializeApp({
    *   credential: admin.credential.applicationDefault(),
    *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
    * });
    * ```
    *
    * @param {!Object=} httpAgent Optional [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
    *   to be used when retrieving access tokens from Google token servers.
    *
    * @return {!admin.credential.Credential} A credential authenticated via Google
    *   Application Default Credentials that can be used to initialize an app.
    */
  def apply(): Credential = js.native
  def apply(httpAgent: Agent): Credential = js.native
}

