package typings.atFormatjsIntlDashUtils

import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.boolean
import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.string
import typings.std.Record
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/lib/polyfill-utils", JSImport.Namespace)
@js.native
object libPolyfillDashUtilsMod extends js.Object {
  def getAliasesByLang(lang: String): Record[String, String] = js.native
  def getInternalSlot[Instance /* <: js.Object */, Internal, Field /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, field: Field): /* import warning: ImportType.apply Failed type conversion: Internal[Field] */ js.Any = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: String */](opts: T, prop: K, `type`: boolean): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: String */](
    opts: T,
    prop: K,
    `type`: boolean,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: String */](
    opts: T,
    prop: K,
    `type`: boolean,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any],
    fallback: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: String */](opts: T, prop: K, `type`: string): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: String */](
    opts: T,
    prop: K,
    `type`: string,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: String */](
    opts: T,
    prop: K,
    `type`: string,
    values: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any],
    fallback: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def getParentLocalesByLang(lang: String): Record[String, String] = js.native
  def setInternalSlot[Instance /* <: js.Object */, Internal, Field /* <: String */](
    map: WeakMap[Instance, Internal],
    pl: Instance,
    field: Field,
    value: /* import warning: ImportType.apply Failed type conversion: Internal[Field] */ js.Any
  ): Unit = js.native
  def toObject[T](arg: T): T = js.native
}

