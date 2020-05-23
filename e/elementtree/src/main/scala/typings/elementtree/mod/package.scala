package typings.elementtree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Attributes = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type ElementTag = (js.Function1[js.UndefOr[typings.elementtree.mod.ElementText], typings.elementtree.mod.Element]) | (js.Function2[
    /* target */ typings.elementtree.mod.ElementText, 
    /* text */ js.UndefOr[typings.elementtree.mod.ElementText], 
    typings.elementtree.mod.Element
  ]) | java.lang.String
  type ElementText = typings.elementtree.anon.ToString | java.lang.String
}
