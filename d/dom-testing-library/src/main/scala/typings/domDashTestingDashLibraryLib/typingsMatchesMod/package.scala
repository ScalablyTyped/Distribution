package typings
package domDashTestingDashLibraryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typingsMatchesMod {
  type Match = js.Function4[
    /* textToMatch */ java.lang.String, 
    /* node */ stdLib.HTMLElement | scala.Null, 
    /* matcher */ Matcher, 
    /* options */ js.UndefOr[MatcherOptions], 
    scala.Boolean
  ]
  type Matcher = java.lang.String | stdLib.RegExp | MatcherFunction
  type MatcherFunction = js.Function2[/* content */ java.lang.String, /* element */ stdLib.HTMLElement, scala.Boolean]
  type NormalizerFn = js.Function1[/* text */ java.lang.String, java.lang.String]
}
