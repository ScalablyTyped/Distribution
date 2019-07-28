package typings.dottie

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dottieMod {
  type DottiePath = String | js.Array[String]
  /**
    * @example:
    * {
    *  'foo.bar.baz': 'baz',
    *  'foo.baz': 'baz',
    * }
    */
  type FlatPaths = StringDictionary[js.Any]
}
