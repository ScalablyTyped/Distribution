package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AuthOptions extends js.Object {
  /** The authorization master key to use to create the client. */
  var masterKey: js.UndefOr[java.lang.String] = js.undefined
  /** An array of {@link Permission} objects. */
  var permissionFeed: js.UndefOr[js.Array[Permission]] = js.undefined
  /** An object that contains resources tokens. Keys for the object are resource Ids and values are the resource tokens. */
  var resourceTokens: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

