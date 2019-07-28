package typings.elementtree

import org.scalablytyped.runtime.StringDictionary
import typings.elementtree.Anon_ToString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elementtreeMod {
  type Attributes = StringDictionary[js.UndefOr[String]]
  type ElementTag = (js.Function1[js.UndefOr[ElementText], Element]) | (js.Function2[/* target */ ElementText, /* text */ js.UndefOr[ElementText], Element]) | String
  type ElementText = Anon_ToString | String
}
