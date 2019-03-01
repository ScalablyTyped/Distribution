package typings
package dottieLib.dottieMod.dottieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @example:
  * {
  *  'foo.bar.baz': 'baz',
  *  'foo.baz': 'baz',
  * }
  */
trait FlatPaths
  extends /* path */ org.scalablytyped.runtime.StringDictionary[js.Any]

object FlatPaths {
  @scala.inline
  def apply(StringDictionary: /* path */ org.scalablytyped.runtime.StringDictionary[js.Any] = null): FlatPaths = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FlatPaths]
  }
}

