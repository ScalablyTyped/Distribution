package typings
package enhancedDashResolveLib.libCommonDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResolveError
  extends nodeLib.Error {
  var details: java.lang.String
  var missing: js.Array[java.lang.String]
  var recursion: scala.Boolean
}

