package typings
package gapiDotClientLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseMap[T]
  extends /* id */ org.scalablytyped.runtime.StringDictionary[Response[T]]

object ResponseMap {
  @scala.inline
  def apply[T](StringDictionary: /* id */ org.scalablytyped.runtime.StringDictionary[Response[T]] = null): ResponseMap[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ResponseMap[T]]
  }
}

