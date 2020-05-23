package typings.formatjsIntlUtils.polyfillUtilsMod

import typings.formatjsIntlUtils.formatjsIntlUtilsStrings.boolean
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/polyfill-utils", "getOption")
@js.native
object getOption_boolean extends js.Object {
  def apply[T /* <: js.Object */, K /* <: /* keyof T */ String */, F](
    opts: T,
    prop: K,
    `type`: boolean,
    values: js.UndefOr[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ]
    ],
    fallback: F
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
}

