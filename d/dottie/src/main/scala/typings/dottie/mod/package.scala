package typings.dottie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DottiePath = java.lang.String | js.Array[java.lang.String]
  /**
    * @example:
    * {
    *  'foo.bar.baz': 'baz',
    *  'foo.baz': 'baz',
    * }
    */
  type FlatPaths = org.scalablytyped.runtime.StringDictionary[js.Any]
}
