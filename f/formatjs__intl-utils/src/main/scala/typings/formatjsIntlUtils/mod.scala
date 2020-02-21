package typings.formatjsIntlUtils

import typings.formatjsIntlUtils.diffMod.Thresholds
import typings.formatjsIntlUtils.formatjsIntlUtilsStrings.boolean
import typings.formatjsIntlUtils.formatjsIntlUtilsStrings.string
import typings.formatjsIntlUtils.numberTypesMod.NumberFormatDigitInternalSlots
import typings.formatjsIntlUtils.numberTypesMod.NumberFormatDigitOptions
import typings.formatjsIntlUtils.polyfillUtilsMod.LiteralPart
import typings.formatjsIntlUtils.resolveLocaleMod.ResolveLocaleResult
import typings.formatjsIntlUtils.typesMod.LocaleData
import typings.std.Date
import typings.std.Error
import typings.std.Exclude
import typings.std.NonNullable
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val SANCTIONED_UNITS: js.Array[String] = js.native
  def createResolveLocale[K /* <: String */, D /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]: any}
    */ typings.formatjsIntlUtils.formatjsIntlUtilsStrings.createResolveLocale with js.Any */](getDefaultLocale: js.Function0[String]): js.Function5[
    /* availableLocales */ js.Array[String], 
    /* requestedLocales */ js.Array[String], 
    /* options */ AnonK, 
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
  def invariant(condition: Boolean, message: String): Unit = js.native
  def invariant(condition: Boolean, message: String, Err: js.Any): Unit = js.native
  def isLiteralPart(patternPart: AnonType): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/polyfill-utils.LiteralPart */ Boolean = js.native
  def isLiteralPart(patternPart: LiteralPart): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/polyfill-utils.LiteralPart */ Boolean = js.native
  def isMissingLocaleDataError(e: Error): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/resolve-locale.MissingLocaleDataError */ Boolean = js.native
  def isWellFormedCurrencyCode(currency: String): Boolean = js.native
  def objectIs(x: js.Any, y: js.Any): Boolean = js.native
  def partitionPattern(pattern: String): js.Array[AnonTypeValue | AnonTypeValueString] = js.native
  def removeUnitNamespace(unit: String): String = js.native
  def selectUnit(from: Double): AnonUnit = js.native
  def selectUnit(from: Double, to: Double): AnonUnit = js.native
  def selectUnit(from: Double, to: Double, thresholds: Partial[Thresholds]): AnonUnit = js.native
  def selectUnit(from: Double, to: Date): AnonUnit = js.native
  def selectUnit(from: Double, to: Date, thresholds: Partial[Thresholds]): AnonUnit = js.native
  def selectUnit(from: Date): AnonUnit = js.native
  def selectUnit(from: Date, to: Double): AnonUnit = js.native
  def selectUnit(from: Date, to: Double, thresholds: Partial[Thresholds]): AnonUnit = js.native
  def selectUnit(from: Date, to: Date): AnonUnit = js.native
  def selectUnit(from: Date, to: Date, thresholds: Partial[Thresholds]): AnonUnit = js.native
  def setInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: String */](
    map: WeakMap[Instance, Internal],
    pl: Instance,
    field: Field,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Internal>[Field] */ js.Any
  ): Unit = js.native
  def setMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, K /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, props: Pick[NonNullable[Internal], K]): Unit = js.native
  def setNumberFormatDigitOptions[TObject /* <: js.Object */, TInternalSlots /* <: NumberFormatDigitInternalSlots */](
    internalSlotMap: WeakMap[TObject, TInternalSlots],
    intlObj: TObject,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double
  ): Unit = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String]): js.Array[String] = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String], options: AnonBestfit): js.Array[String] = js.native
  def toObject[T](arg: T): T = js.native
  def toString(o: js.Any): String = js.native
  def unpackData[T /* <: Record[String, _] */](locale: String, localeData: LocaleData[T]): T = js.native
  def unpackData[T /* <: Record[String, _] */](
    locale: String,
    localeData: LocaleData[T],
    /** By default shallow merge the dictionaries. */
  reducer: js.Function2[/* all */ T, /* d */ T, T]
  ): T = js.native
  @js.native
  object InternalSlotToken extends js.Object {
    /* "compactName" */ val compactName: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.compactName with String = js.native
    /* "compactSymbol" */ val compactSymbol: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.compactSymbol with String = js.native
    /* "currencyCode" */ val currencyCode: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.currencyCode with String = js.native
    /* "currencyName" */ val currencyName: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.currencyName with String = js.native
    /* "currencyNarrowSymbol" */ val currencyNarrowSymbol: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.currencyNarrowSymbol with String = js.native
    /* "currencySymbol" */ val currencySymbol: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.currencySymbol with String = js.native
    /* "minusSign" */ val minusSign: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.minusSign with String = js.native
    /* "number" */ val number: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.number with String = js.native
    /* "percentSign" */ val percentSign: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.percentSign with String = js.native
    /* "plusSign" */ val plusSign: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.plusSign with String = js.native
    /* "scientificExponent" */ val scientificExponent: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.scientificExponent with String = js.native
    /* "scientificSeparator" */ val scientificSeparator: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.scientificSeparator with String = js.native
    /* "unitName" */ val unitName: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.unitName with String = js.native
    /* "unitNarrowSymbol" */ val unitNarrowSymbol: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.unitNarrowSymbol with String = js.native
    /* "unitSymbol" */ val unitSymbol: typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken.unitSymbol with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.formatjsIntlUtils.numberTypesMod.InternalSlotToken with String] = js.native
  }
  
}

