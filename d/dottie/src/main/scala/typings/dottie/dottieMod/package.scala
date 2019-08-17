package typings.dottie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dottieMod {
  import org.scalablytyped.runtime.StringDictionary

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
