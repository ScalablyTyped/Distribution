package typings.gettextDotJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gettextDotJsMod {
  type GettextStatic = js.Function1[/* options */ js.UndefOr[GettextOptions], Gettext]
  type JsonDataMessages = StringDictionary[String | js.Array[String] | JsonDataHeader]
  type PluralForm = js.Function1[/* n */ Double, Double]
}
