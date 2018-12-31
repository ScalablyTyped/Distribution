package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Database extends js.Object {
  /**
    * Required. The name of the database. Values are of the form
    * `projects/<project>/instances/<instance>/databases/<database>`,
    * where `<database>` is as specified in the `CREATE DATABASE`
    * statement. This name can be passed to other API methods to
    * identify the database.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The current database state. */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

