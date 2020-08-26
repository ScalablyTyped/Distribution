package typings.formatjsIntlUtils.mod

import typings.formatjsIntlUtils.formatjsIntlUtilsStrings.string
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils", "getOption")
@js.native
object getOption_string extends js.Object {
  def apply[T /* <: js.Object */, K /* <: /* keyof T */ String */, F](opts: T, prop: K, `type`: string, values: js.UndefOr[scala.Nothing], fallback: F): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  def apply[T /* <: js.Object */, K /* <: /* keyof T */ String */, F](
    opts: T,
    prop: K,
    `type`: string,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ],
    fallback: F
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
}

