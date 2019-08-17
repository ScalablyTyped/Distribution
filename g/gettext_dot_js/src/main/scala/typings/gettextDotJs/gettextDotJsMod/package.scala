package typings.gettextDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gettextDotJsMod {
  import org.scalablytyped.runtime.StringDictionary

  type GettextStatic = js.Function1[/* options */ js.UndefOr[GettextOptions], Gettext]
  type JsonDataMessages = StringDictionary[String | js.Array[String] | JsonDataHeader]
  type PluralForm = js.Function1[/* n */ Double, Double]
}
