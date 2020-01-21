package typings.gettextJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GettextStatic = js.Function1[
    /* options */ js.UndefOr[typings.gettextJs.mod.GettextOptions], 
    typings.gettextJs.mod.Gettext
  ]
  type JsonDataMessages = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | js.Array[java.lang.String] | typings.gettextJs.mod.JsonDataHeader
  ]
  type PluralForm = js.Function1[/* n */ scala.Double, scala.Double]
}
