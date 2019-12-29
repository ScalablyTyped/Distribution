package typings.atFormatjsIntlDashUtils

import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.boolean
import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.string
import typings.atFormatjsIntlDashUtils.distDiffMod.Thresholds
import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatDigitInternalSlots
import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatDigitOptions
import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatNotation
import typings.atFormatjsIntlDashUtils.distPolyfillDashUtilsMod.LiteralPart
import typings.atFormatjsIntlDashUtils.distResolveDashLocaleMod.ResolveLocaleResult
import typings.atFormatjsIntlDashUtils.distTypesMod.LocaleData
import typings.std.Date
import typings.std.Error
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils", JSImport.Namespace)
@js.native
object atFormatjsIntlDashUtilsMod extends js.Object {
  val SANCTIONED_UNITS: js.Array[String] = js.native
  def createResolveLocale[K /* <: String */, D /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]: any}
    */ typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.createResolveLocale with js.Any */](getDefaultLocale: js.Function0[String]): js.Function5[
    /* availableLocales */ js.Array[String], 
    /* requestedLocales */ js.Array[String], 
    /* options */ Anon_K, 
    /* relevantExtensionKeys */ js.Array[K], 
    /* localeData */ Record[String, D], 
    ResolveLocaleResult
  ] = js.native
  def defaultNumberOption(`val`: js.Any, min: Double, max: Double, fallback: Double): Double = js.native
  def getAliasesByLang(lang: String): Record[String, String] = js.native
  def getCanonicalLocales(): js.Array[String] = js.native
  def getCanonicalLocales(locales: String): js.Array[String] = js.native
  def getCanonicalLocales(locales: js.Array[String]): js.Array[String] = js.native
  def getInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, field: Field): /* import warning: importer.ImportType#apply Failed type conversion: Internal[Field] */ js.Any = js.native
  def getLocaleHierarchy(locale: String, aliases: Record[String, String], parentLocales: Record[String, String]): js.Array[String] = js.native
  def getMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, fields: Field*): Pick[Internal, Field] = js.native
  def getNumberOption[T /* <: js.Object */, K /* <: String */](options: T, property: K, minimum: Double, maximum: Double, fallback: Double): Double = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: String */, F](opts: T, prop: K, `type`: boolean, values: js.UndefOr[scala.Nothing], fallback: F): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: String */, F](
    opts: T,
    prop: K,
    `type`: boolean,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ],
    fallback: F
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: String */, F](opts: T, prop: K, `type`: string, values: js.UndefOr[scala.Nothing], fallback: F): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: String */, F](
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
  def getParentLocalesByLang(lang: String): Record[String, String] = js.native
  def invariant(condition: Boolean, message: String): /* asserts condition */ Boolean = js.native
  def invariant(condition: Boolean, message: String, Err: js.Any): /* asserts condition */ Boolean = js.native
  def isLiteralPart(patternPart: Anon_Type): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/polyfill-utils.LiteralPart */ Boolean = js.native
  def isLiteralPart(patternPart: LiteralPart): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/polyfill-utils.LiteralPart */ Boolean = js.native
  def isMissingLocaleDataError(e: Error): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/resolve-locale.MissingLocaleDataError */ Boolean = js.native
  def objectIs(x: js.Any, y: js.Any): Boolean = js.native
  def partitionPattern(pattern: String): js.Array[Anon_TypeValue | Anon_TypeValueString] = js.native
  def removeUnitNamespace(unit: String): String = js.native
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
  def setInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: String */](
    map: WeakMap[Instance, Internal],
    pl: Instance,
    field: Field,
    value: /* import warning: importer.ImportType#apply Failed type conversion: Internal[Field] */ js.Any
  ): Unit = js.native
  def setMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, K /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, props: Pick[Internal, K]): Unit = js.native
  def setNumberFormatDigitOptions[TObject /* <: js.Object */, TInternalSlots /* <: NumberFormatDigitInternalSlots */](
    internalSlotMap: WeakMap[TObject, TInternalSlots],
    pl: TObject,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double,
    notation: NumberFormatNotation
  ): Unit = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String]): js.Array[String] = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String], options: Anon_Bestfit): js.Array[String] = js.native
  def toObject[T](arg: T): T = js.native
  def unpackData[T /* <: Record[String, _] */](locale: String, localeData: LocaleData[T]): T = js.native
  def unpackData[T /* <: Record[String, _] */](
    locale: String,
    localeData: LocaleData[T],
    /** By default shallow merge the dictionaries. */
  reducer: js.Function2[/* all */ T, /* d */ T, T]
  ): T = js.native
  @js.native
  object InternalSlotToken extends js.Object {
    /* "compactName" */ val compactName: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.compactName with String = js.native
    /* "compactSymbol" */ val compactSymbol: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.compactSymbol with String = js.native
    /* "currencyCode" */ val currencyCode: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.currencyCode with String = js.native
    /* "currencyName" */ val currencyName: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.currencyName with String = js.native
    /* "currencyNarrowSymbol" */ val currencyNarrowSymbol: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.currencyNarrowSymbol with String = js.native
    /* "currencySymbol" */ val currencySymbol: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.currencySymbol with String = js.native
    /* "minusSign" */ val minusSign: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.minusSign with String = js.native
    /* "number" */ val number: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.number with String = js.native
    /* "percentSign" */ val percentSign: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.percentSign with String = js.native
    /* "plusSign" */ val plusSign: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.plusSign with String = js.native
    /* "scientificExponent" */ val scientificExponent: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.scientificExponent with String = js.native
    /* "scientificSeparator" */ val scientificSeparator: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.scientificSeparator with String = js.native
    /* "unitName" */ val unitName: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.unitName with String = js.native
    /* "unitNarrowSymbol" */ val unitNarrowSymbol: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.unitNarrowSymbol with String = js.native
    /* "unitSymbol" */ val unitSymbol: typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken.unitSymbol with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.InternalSlotToken with String
      ] = js.native
  }
  
}

