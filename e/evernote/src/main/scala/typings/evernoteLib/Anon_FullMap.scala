package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FullMap extends js.Object {
  var fullMap: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var keysOnly: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_FullMap {
  @scala.inline
  def apply(
    fullMap: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    keysOnly: js.Array[java.lang.String] = null
  ): Anon_FullMap = {
    val __obj = js.Dynamic.literal()
    if (fullMap != null) __obj.updateDynamic("fullMap")(fullMap)
    if (keysOnly != null) __obj.updateDynamic("keysOnly")(keysOnly)
    __obj.asInstanceOf[Anon_FullMap]
  }
}

