package typings.firebaseDashAdmin.admin.credential

import typings.firebaseDashAdmin.admin.ServiceAccount
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.credential.cert")
@js.native
object cert extends js.Object {
  /**
    * Returns a credential created from the provided service account that grants
    * admin access to Firebase services. This credential can be used in the call
    * to
    * {@link
    *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
    *   `admin.initializeApp()`}.
    *
    * See
    * {@link
    *   https://firebase.google.com/docs/admin/setup#initialize_the_sdk
    *   Initialize the SDK}
    * for more details.
    *
    * @example
    * ```javascript
    * // Providing a path to a service account key JSON file
    * var serviceAccount = require("path/to/serviceAccountKey.json");
    * admin.initializeApp({
    *   credential: admin.credential.cert(serviceAccount),
    *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
    * });
    * ```
    *
    * @example
    * ```javascript
    * // Providing a service account object inline
    * admin.initializeApp({
    *   credential: admin.credential.cert({
    *     projectId: "<PROJECT_ID>",
    *     clientEmail: "foo@<PROJECT_ID>.iam.gserviceaccount.com",
    *     privateKey: "-----BEGIN PRIVATE KEY-----<KEY>-----END PRIVATE KEY-----\n"
    *   }),
    *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
    * });
    * ```
    *
    * @param serviceAccountPathOrObject The path to a service
    *   account key JSON file or an object representing a service account key.
    * @param httpAgent Optional [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
    *   to be used when retrieving access tokens from Google token servers.
    *
    * @return A credential authenticated via the
    *   provided service account that can be used to initialize an app.
    */
  def apply(serviceAccountPathOrObject: String): Credential = js.native
  def apply(serviceAccountPathOrObject: String, httpAgent: Agent): Credential = js.native
  def apply(serviceAccountPathOrObject: ServiceAccount): Credential = js.native
  def apply(serviceAccountPathOrObject: ServiceAccount, httpAgent: Agent): Credential = js.native
}

