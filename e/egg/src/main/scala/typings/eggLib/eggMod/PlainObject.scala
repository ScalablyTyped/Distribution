package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// plain object
trait PlainObject[T]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[T]

object PlainObject {
  @scala.inline
  def apply[T](StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[T] = null): PlainObject[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PlainObject[T]]
  }
}

