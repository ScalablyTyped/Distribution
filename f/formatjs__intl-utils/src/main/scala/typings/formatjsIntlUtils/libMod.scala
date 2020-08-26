package typings.formatjsIntlUtils

import org.scalablytyped.runtime.TopLevel
import typings.formatjsIntlUtils.anon.Dictk
import typings.formatjsIntlUtils.anon.FormattedString
import typings.formatjsIntlUtils.anon.LocaleMatcher
import typings.formatjsIntlUtils.anon.PartialThresholds
import typings.formatjsIntlUtils.anon.PickNumberFormatDigitInteMaximumSignificantDigits
import typings.formatjsIntlUtils.anon.Type
import typings.formatjsIntlUtils.anon.TypeValue
import typings.formatjsIntlUtils.anon.UnitUnit
import typings.formatjsIntlUtils.anon.Value
import typings.formatjsIntlUtils.anon.valueanyThisTypeany
import typings.formatjsIntlUtils.formatjsIntlUtilsStrings.boolean
import typings.formatjsIntlUtils.formatjsIntlUtilsStrings.string
import typings.formatjsIntlUtils.numberTypesMod.NumberFormatDigitInternalSlots
import typings.formatjsIntlUtils.numberTypesMod.NumberFormatDigitOptions
import typings.formatjsIntlUtils.numberTypesMod.NumberFormatNotation
import typings.formatjsIntlUtils.numberTypesMod.RawNumberFormatResult
import typings.formatjsIntlUtils.polyfillUtilsMod.LiteralPart
import typings.formatjsIntlUtils.resolveLocaleMod.ResolveLocaleResult
import typings.formatjsIntlUtils.typesMod.LocaleData
import typings.std.Date
import typings.std.Error
import typings.std.Exclude
import typings.std.NonNullable
import typings.std.Pick
import typings.std.Record
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  val SANCTIONED_UNITS: js.Array[String] = js.native
  def createResolveLocale[K /* <: String */, D /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]: any}
    */ typings.formatjsIntlUtils.formatjsIntlUtilsStrings.createResolveLocale with TopLevel[js.Any] */](getDefaultLocale: js.Function0[String]): js.Function5[
    /* availableLocales */ js.Array[String], 
    /* requestedLocales */ js.Array[String], 
    /* options */ Dictk, 
    /* relevantExtensionKeys */ js.Array[K], 
    /* localeData */ Record[String, D], 
    ResolveLocaleResult
  ] = js.native
  def defaultNumberOption(`val`: js.Any, min: Double, max: Double, fallback: Double): Double = js.native
  def defineProperty[T /* <: js.Object */](target: T, name: String, hasValue: valueanyThisTypeany): Unit = js.native
  def defineProperty[T /* <: js.Object */](target: T, name: js.Symbol, hasValue: valueanyThisTypeany): Unit = js.native
  def formatNumericToString(internalSlots: PickNumberFormatDigitInteMaximumSignificantDigits, x: Double): FormattedString = js.native
  def getInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, field: Field): /* import warning: importer.ImportType#apply Failed type conversion: Internal[Field] */ js.Any = js.native
  def getLocaleHierarchy(locale: String): js.Array[String] = js.native
  def getMagnitude(x: Double): Double = js.native
  def getMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, fields: Field*): Pick[Internal, Field] = js.native
  def getNumberOption[T /* <: js.Object */, K /* <: /* keyof T */ String */](options: T, property: K, minimum: Double, maximum: Double, fallback: Double): Double = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: /* keyof T */ String */, F](opts: T, prop: K, `type`: boolean, values: js.UndefOr[scala.Nothing], fallback: F): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: /* keyof T */ String */, F](
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
  def getOption_string[T /* <: js.Object */, K /* <: /* keyof T */ String */, F](opts: T, prop: K, `type`: string, values: js.UndefOr[scala.Nothing], fallback: F): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: /* keyof T */ String */, F](
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
  def hasOwnProperty(o: js.Any, key: String): Boolean = js.native
  def invariant(condition: Boolean, message: String): /* asserts condition */ Boolean = js.native
  def invariant(condition: Boolean, message: String, Err: js.Any): /* asserts condition */ Boolean = js.native
  def isLiteralPart(patternPart: Type): /* is @formatjs/intl-utils.@formatjs/intl-utils/lib/src/polyfill-utils.LiteralPart */ Boolean = js.native
  def isLiteralPart(patternPart: LiteralPart): /* is @formatjs/intl-utils.@formatjs/intl-utils/lib/src/polyfill-utils.LiteralPart */ Boolean = js.native
  def isMissingLocaleDataError(e: Error): /* is @formatjs/intl-utils.@formatjs/intl-utils/lib/src/resolve-locale.MissingLocaleDataError */ Boolean = js.native
  def isWellFormedCurrencyCode(currency: String): Boolean = js.native
  def isWellFormedUnitIdentifier(unit: String): Boolean = js.native
  def objectIs(x: js.Any, y: js.Any): Boolean = js.native
  def partitionPattern(pattern: String): js.Array[Value | TypeValue] = js.native
  def removeUnitNamespace(unit: String): String = js.native
  def repeat(s: String, times: Double): String = js.native
  def selectUnit(from: Double): UnitUnit = js.native
  def selectUnit(from: Double, to: js.UndefOr[scala.Nothing], thresholds: PartialThresholds): UnitUnit = js.native
  def selectUnit(from: Double, to: Double): UnitUnit = js.native
  def selectUnit(from: Double, to: Double, thresholds: PartialThresholds): UnitUnit = js.native
  def selectUnit(from: Double, to: Date): UnitUnit = js.native
  def selectUnit(from: Double, to: Date, thresholds: PartialThresholds): UnitUnit = js.native
  def selectUnit(from: Date): UnitUnit = js.native
  def selectUnit(from: Date, to: js.UndefOr[scala.Nothing], thresholds: PartialThresholds): UnitUnit = js.native
  def selectUnit(from: Date, to: Double): UnitUnit = js.native
  def selectUnit(from: Date, to: Double, thresholds: PartialThresholds): UnitUnit = js.native
  def selectUnit(from: Date, to: Date): UnitUnit = js.native
  def selectUnit(from: Date, to: Date, thresholds: PartialThresholds): UnitUnit = js.native
  def setInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](
    map: WeakMap[Instance, Internal],
    pl: Instance,
    field: Field,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Internal>[Field] */ js.Any
  ): Unit = js.native
  def setMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, K /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, props: Pick[NonNullable[Internal], K]): Unit = js.native
  def setNumberFormatDigitOptions(
    internalSlots: NumberFormatDigitInternalSlots,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double,
    notation: NumberFormatNotation
  ): Unit = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String]): js.Array[String] = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String], options: LocaleMatcher): js.Array[String] = js.native
  def toObject[T](arg: T): T = js.native
  def toRawFixed(x: Double, minFraction: Double, maxFraction: Double): RawNumberFormatResult = js.native
  def toRawPrecision(x: Double, minPrecision: Double, maxPrecision: Double): RawNumberFormatResult = js.native
  def toString(o: js.Any): String = js.native
  def unpackData[T /* <: Record[String, _] */](locale: String, localeData: LocaleData[T]): T = js.native
  def unpackData[T /* <: Record[String, _] */](
    locale: String,
    localeData: LocaleData[T],
    /** By default shallow merge the dictionaries. */
  reducer: js.Function2[/* all */ T, /* d */ T, T]
  ): T = js.native
}

