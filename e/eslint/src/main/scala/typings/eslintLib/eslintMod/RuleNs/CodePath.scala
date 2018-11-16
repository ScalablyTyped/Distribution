package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CodePath extends js.Object {
  var childCodePaths: js.Array[CodePath]
  var currentSegments: js.Array[CodePathSegment]
  var finalSegments: js.Array[CodePathSegment]
  var id: java.lang.String
  var initialSegment: CodePathSegment
  var returnedSegments: js.Array[CodePathSegment]
  var thrownSegments: js.Array[CodePathSegment]
  var upper: CodePath | scala.Null
}

