package typings.atFormatjsIntlDashUtils

import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.boolean
import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.string
import typings.atFormatjsIntlDashUtils.distDiffMod.Thresholds
import typings.atFormatjsIntlDashUtils.distResolveDashLocaleMod.ResolveLocaleResult
import typings.atFormatjsIntlDashUtils.distTypesMod.LocaleData
import typings.std.Date
import typings.std.Error
import typings.std.Partial
import typings.std.Record
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils", JSImport.Namespace)
@js.native
object atFormatjsIntlDashUtilsMod extends js.Object {
  val SANCTIONED_UNITS: js.Array[String] = js.native
  def createResolveLocale[K /* <: String */, D /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in K ]: any}
    */ typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.createResolveLocale with js.Any */](getDefaultLocale: js.Function0[String]): js.Function5[
    /* availableLocales */ js.Array[String], 
    /* requestedLocales */ js.Array[String], 
    /* options */ Anon_K, 
    /* relevantExtensionKeys */ js.Array[K], 
    /* localeData */ Record[String, D], 
    ResolveLocaleResult
  ] = js.native
  def getAliasesByLang(lang: String): Record[String, String] = js.native
  def getCanonicalLocales(): js.Array[String] = js.native
  def getCanonicalLocales(locales: String): js.Array[String] = js.native
  def getCanonicalLocales(locales: js.Array[String]): js.Array[String] = js.native
  def getInternalSlot[Instance /* <: js.Object */, Internal, Field /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, field: Field): /* import warning: ImportType.apply Failed type conversion: Internal[Field] */ js.Any = js.native
  def getLocaleHierarchy(locale: String, aliases: Record[String, String], parentLocales: Record[String, String]): js.Array[String] = js.native
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
  def invariant(condition: Boolean, message: String): Unit = js.native
  def invariant(condition: Boolean, message: String, Err: js.Any): Unit = js.native
  def isMissingLocaleDataError(e: Error): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/resolve-locale.MissingLocaleDataError */ Boolean = js.native
  def selectUnit(from: Double): Anon_Unit = js.native
  def selectUnit(from: Double, to: Double): Anon_Unit = js.native
  def selectUnit(from: Double, to: Double, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def selectUnit(from: Double, to: Date): Anon_Unit = js.native
  def selectUnit(from: Double, to: Date, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def selectUnit(from: Date): Anon_Unit = js.native
  def selectUnit(from: Date, to: Double): Anon_Unit = js.native
  def selectUnit(from: Date, to: Double, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def selectUnit(from: Date, to: Date): Anon_Unit = js.native
  def selectUnit(from: Date, to: Date, thresholds: Partial[Thresholds]): Anon_Unit = js.native
  def setInternalSlot[Instance /* <: js.Object */, Internal, Field /* <: String */](
    map: WeakMap[Instance, Internal],
    pl: Instance,
    field: Field,
    value: /* import warning: ImportType.apply Failed type conversion: Internal[Field] */ js.Any
  ): Unit = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String]): js.Array[String] = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String], options: Anon_Bestfit): js.Array[String] = js.native
  def toObject[T](arg: T): T = js.native
  def unpackData[T /* <: Record[String, _] */](locale: String, localeData: LocaleData[T]): T = js.native
}

