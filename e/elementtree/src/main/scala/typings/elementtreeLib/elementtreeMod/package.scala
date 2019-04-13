package typings
package elementtreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elementtreeMod {
  type Attributes = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type ElementTag = (js.Function1[/* text */ js.UndefOr[ElementText], Element]) | (js.Function2[/* target */ ElementText, /* text */ js.UndefOr[ElementText], Element]) | java.lang.String
  type ElementText = elementtreeLib.Anon_ToString | java.lang.String
}
