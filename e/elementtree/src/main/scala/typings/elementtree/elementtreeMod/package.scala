package typings.elementtree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elementtreeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.elementtree.Anon_ToString

  type Attributes = StringDictionary[js.UndefOr[String]]
  type ElementTag = (js.Function1[js.UndefOr[ElementText], Element]) | (js.Function2[/* target */ ElementText, /* text */ js.UndefOr[ElementText], Element]) | String
  type ElementText = Anon_ToString | String
}
