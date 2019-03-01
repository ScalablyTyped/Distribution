package typings
package fuzzaldrinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key[K /* <: java.lang.String */] extends js.Object {
  var key: K
  var maxResults: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply[K /* <: java.lang.String */](key: K, maxResults: scala.Int | scala.Double = null): Anon_Key[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key[K]]
  }
}

