package typings.documentdb.documentdbMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  /** The authorization master key to use to create the client. */
  var masterKey: js.UndefOr[String] = js.undefined
  /** An array of {@link Permission} objects. */
  var permissionFeed: js.UndefOr[js.Array[Permission]] = js.undefined
  /** An object that contains resources tokens. Keys for the object are resource Ids and values are the resource tokens. */
  var resourceTokens: js.UndefOr[StringDictionary[String]] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    masterKey: String = null,
    permissionFeed: js.Array[Permission] = null,
    resourceTokens: StringDictionary[String] = null
  ): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (masterKey != null) __obj.updateDynamic("masterKey")(masterKey.asInstanceOf[js.Any])
    if (permissionFeed != null) __obj.updateDynamic("permissionFeed")(permissionFeed.asInstanceOf[js.Any])
    if (resourceTokens != null) __obj.updateDynamic("resourceTokens")(resourceTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
}

