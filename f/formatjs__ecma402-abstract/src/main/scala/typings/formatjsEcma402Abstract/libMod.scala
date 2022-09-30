package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.BoundTargetFunction
import typings.formatjsEcma402Abstract.anon.Currency
import typings.formatjsEcma402Abstract.anon.CurrencyDigitsData
import typings.formatjsEcma402Abstract.anon.FormattedString
import typings.formatjsEcma402Abstract.anon.GetDefaultLocale
import typings.formatjsEcma402Abstract.anon.LocaleMatcher
import typings.formatjsEcma402Abstract.anon.PickNumberFormatDigitInteMaximumFractionDigits
import typings.formatjsEcma402Abstract.anon.Type
import typings.formatjsEcma402Abstract.anon.TzData
import typings.formatjsEcma402Abstract.anon.Value
import typings.formatjsEcma402Abstract.anon.`0`
import typings.formatjsEcma402Abstract.anon.valueanyThisTypeany
import typings.formatjsEcma402Abstract.formatToPartsMod.NumberResult
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`10`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`11`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`1`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`2`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`365`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`366`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`3`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`4`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`5`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`6`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`7`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`8`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`9`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.BigInt
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Null
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Number
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Object
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Symbol
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Undefined
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.boolean_
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.string_
import typings.formatjsEcma402Abstract.numberMod.NumberFormatDigitInternalSlots
import typings.formatjsEcma402Abstract.numberMod.NumberFormatDigitOptions
import typings.formatjsEcma402Abstract.numberMod.NumberFormatLocaleInternalData
import typings.formatjsEcma402Abstract.numberMod.NumberFormatNotation
import typings.formatjsEcma402Abstract.numberMod.NumberFormatOptions
import typings.formatjsEcma402Abstract.numberMod.NumberFormatPart
import typings.formatjsEcma402Abstract.numberMod.RawNumberFormatResult
import typings.formatjsEcma402Abstract.utilsMod.LiteralPart
import typings.std.Exclude
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import typings.std.NonNullable
import typings.std.Pick
import typings.std.Set
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArrayCreate(len: Double): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayCreate")(len.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def CanonicalizeLocaleList(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("CanonicalizeLocaleList")().asInstanceOf[js.Array[String]]
  inline def CanonicalizeLocaleList(locales: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("CanonicalizeLocaleList")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def CanonicalizeLocaleList(locales: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("CanonicalizeLocaleList")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def CanonicalizeTimeZoneName(tz: String, hasTzDataUppercaseLinks: TzData): String = (^.asInstanceOf[js.Dynamic].applyDynamic("CanonicalizeTimeZoneName")(tz.asInstanceOf[js.Any], hasTzDataUppercaseLinks.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def CoerceOptionsToObject[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("CoerceOptionsToObject")().asInstanceOf[T]
  inline def CoerceOptionsToObject[T](options: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("CoerceOptionsToObject")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def ComputeExponent(numberFormat: NumberFormat, x: Double, hasGetInternalSlots: `0`): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("ComputeExponent")(numberFormat.asInstanceOf[js.Any], x.asInstanceOf[js.Any], hasGetInternalSlots.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def ComputeExponentForMagnitude(numberFormat: NumberFormat, magnitude: Double, hasGetInternalSlots: `0`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ComputeExponentForMagnitude")(numberFormat.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], hasGetInternalSlots.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def CurrencyDigits(c: String, hasCurrencyDigitsData: CurrencyDigitsData): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CurrencyDigits")(c.asInstanceOf[js.Any], hasCurrencyDigitsData.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def DateFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("DateFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def Day(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Day")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def DayFromYear(y: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("DayFromYear")(y.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def DayWithinYear(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("DayWithinYear")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def DaysInYear(y: Double): `365` | `366` = ^.asInstanceOf[js.Dynamic].applyDynamic("DaysInYear")(y.asInstanceOf[js.Any]).asInstanceOf[`365` | `366`]
  
  inline def FormatNumericToParts(nf: NumberFormat, x: Double, implDetails: `0`): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatNumericToParts")(nf.asInstanceOf[js.Any], x.asInstanceOf[js.Any], implDetails.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  
  inline def FormatNumericToString(intlObject: PickNumberFormatDigitInteMaximumFractionDigits, x: Double): FormattedString = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatNumericToString")(intlObject.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[FormattedString]
  
  inline def GetNumberOption[T /* <: js.Object */, K /* <: /* keyof T */ String */](options: T, property: K, minimum: Double, maximum: Double, fallback: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetNumberOption")(options.asInstanceOf[js.Any], property.asInstanceOf[js.Any], minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def GetOption[T /* <: js.Object */, K /* <: /* keyof T */ String */, F](
    opts: T,
    prop: K,
    `type`: string_ | boolean_,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ],
    fallback: F
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    Unit
  ]) | F = (^.asInstanceOf[js.Dynamic].applyDynamic("GetOption")(opts.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], values.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[(Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    Unit
  ]) | F]
  inline def GetOption[T /* <: js.Object */, K /* <: /* keyof T */ String */, F](opts: T, prop: K, `type`: string_ | boolean_, values: Unit, fallback: F): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    Unit
  ]) | F = (^.asInstanceOf[js.Dynamic].applyDynamic("GetOption")(opts.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], values.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[(Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    Unit
  ]) | F]
  
  inline def GetOptionsObject[T /* <: js.Object */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("GetOptionsObject")().asInstanceOf[T]
  inline def GetOptionsObject[T /* <: js.Object */](options: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("GetOptionsObject")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def HasOwnProperty(o: js.Object, prop: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("HasOwnProperty")(o.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def HourFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("HourFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def InLeapYear(t: Double): typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`0` | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("InLeapYear")(t.asInstanceOf[js.Any]).asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`0` | `1`]
  
  inline def InitializeNumberFormat(
    nf: NumberFormat,
    locales: String,
    opts: Unit,
    hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData: GetDefaultLocale
  ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("InitializeNumberFormat")(nf.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
  inline def InitializeNumberFormat(
    nf: NumberFormat,
    locales: String,
    opts: NumberFormatOptions,
    hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData: GetDefaultLocale
  ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("InitializeNumberFormat")(nf.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
  inline def InitializeNumberFormat(
    nf: NumberFormat,
    locales: js.Array[String],
    opts: Unit,
    hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData: GetDefaultLocale
  ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("InitializeNumberFormat")(nf.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
  inline def InitializeNumberFormat(
    nf: NumberFormat,
    locales: js.Array[String],
    opts: NumberFormatOptions,
    hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData: GetDefaultLocale
  ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("InitializeNumberFormat")(nf.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
  inline def InitializeNumberFormat(
    nf: NumberFormat,
    locales: Unit,
    opts: Unit,
    hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData: GetDefaultLocale
  ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("InitializeNumberFormat")(nf.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
  inline def InitializeNumberFormat(
    nf: NumberFormat,
    locales: Unit,
    opts: NumberFormatOptions,
    hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData: GetDefaultLocale
  ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("InitializeNumberFormat")(nf.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], hasGetInternalSlotsLocaleDataAvailableLocalesNumberingSystemNamesGetDefaultLocaleCurrencyDigitsData.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
  
  inline def IsSanctionedSimpleUnitIdentifier(unitIdentifier: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSanctionedSimpleUnitIdentifier")(unitIdentifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def IsValidTimeZoneName(tz: String, hasTzDataUppercaseLinks: TzData): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IsValidTimeZoneName")(tz.asInstanceOf[js.Any], hasTzDataUppercaseLinks.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def IsWellFormedCurrencyCode(currency: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWellFormedCurrencyCode")(currency.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def IsWellFormedUnitIdentifier(unit: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWellFormedUnitIdentifier")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def MinFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("MinFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def MonthFromTime(t: Double): typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`0` | `1` | `4` | `7` | `2` | `3` | `5` | `6` | `8` | `9` | `10` | `11` = ^.asInstanceOf[js.Dynamic].applyDynamic("MonthFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[typings.formatjsEcma402Abstract.formatjsEcma402AbstractInts.`0` | `1` | `4` | `7` | `2` | `3` | `5` | `6` | `8` | `9` | `10` | `11`]
  
  inline def OrdinaryHasInstance(C: js.Object, O: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("OrdinaryHasInstance")(C.asInstanceOf[js.Any], O.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def OrdinaryHasInstance(C: js.Object, O: Any, internalSlots: BoundTargetFunction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("OrdinaryHasInstance")(C.asInstanceOf[js.Any], O.asInstanceOf[js.Any], internalSlots.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def PartitionNumberPattern(numberFormat: NumberFormat, x: Double, hasGetInternalSlots: `0`): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("PartitionNumberPattern")(numberFormat.asInstanceOf[js.Any], x.asInstanceOf[js.Any], hasGetInternalSlots.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  
  inline def PartitionPattern[T /* <: String */](pattern: String): js.Array[Type[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("PartitionPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[Type[T]]]
  
  @JSImport("@formatjs/ecma402-abstract/lib", "RangePatternType")
  @js.native
  object RangePatternType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.formatjsEcma402Abstract.dateTimeMod.RangePatternType & String] = js.native
    
    /* "endRange" */ val endRange: typings.formatjsEcma402Abstract.dateTimeMod.RangePatternType.endRange & String = js.native
    
    /* "shared" */ val shared: typings.formatjsEcma402Abstract.dateTimeMod.RangePatternType.shared & String = js.native
    
    /* "startRange" */ val startRange: typings.formatjsEcma402Abstract.dateTimeMod.RangePatternType.startRange & String = js.native
  }
  
  @JSImport("@formatjs/ecma402-abstract/lib", "SANCTIONED_UNITS")
  @js.native
  val SANCTIONED_UNITS: js.Array[String] = js.native
  
  @JSImport("@formatjs/ecma402-abstract/lib", "SIMPLE_UNITS")
  @js.native
  val SIMPLE_UNITS: js.Array[String] = js.native
  
  inline def SameValue(x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("SameValue")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def SecFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("SecFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def SetNumberFormatDigitOptions(
    internalSlots: NumberFormatDigitInternalSlots,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double,
    notation: NumberFormatNotation
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetNumberFormatDigitOptions")(internalSlots.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], mnfdDefault.asInstanceOf[js.Any], mxfdDefault.asInstanceOf[js.Any], notation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def SetNumberFormatUnitOptions(nf: NumberFormat, options: Unit, hasGetInternalSlots: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetNumberFormatUnitOptions")(nf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hasGetInternalSlots.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def SetNumberFormatUnitOptions(nf: NumberFormat, options: NumberFormatOptions, hasGetInternalSlots: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetNumberFormatUnitOptions")(nf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hasGetInternalSlots.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def SupportedLocales(availableLocales: Set[String], requestedLocales: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("SupportedLocales")(availableLocales.asInstanceOf[js.Any], requestedLocales.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def SupportedLocales(availableLocales: Set[String], requestedLocales: js.Array[String], options: LocaleMatcher): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("SupportedLocales")(availableLocales.asInstanceOf[js.Any], requestedLocales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def TimeClip(time: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("TimeClip")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def TimeFromYear(y: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("TimeFromYear")(y.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def ToNumber(`val`: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ToNumber")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def ToObject[T](arg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("ToObject")(arg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def ToRawFixed(x: Double, minFraction: Double, maxFraction: Double): RawNumberFormatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("ToRawFixed")(x.asInstanceOf[js.Any], minFraction.asInstanceOf[js.Any], maxFraction.asInstanceOf[js.Any])).asInstanceOf[RawNumberFormatResult]
  
  inline def ToRawPrecision(x: Double, minPrecision: Double, maxPrecision: Double): RawNumberFormatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("ToRawPrecision")(x.asInstanceOf[js.Any], minPrecision.asInstanceOf[js.Any], maxPrecision.asInstanceOf[js.Any])).asInstanceOf[RawNumberFormatResult]
  
  inline def ToString(o: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(o.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def Type(x: Any): js.UndefOr[
    Null | Undefined | Object | Number | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Boolean | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.String | Symbol | BigInt
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")(x.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    Null | Undefined | Object | Number | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.Boolean | typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.String | Symbol | BigInt
  ]]
  
  inline def WeekDay(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("WeekDay")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def YearFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("YearFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def defineProperty[T /* <: js.Object */](target: T, name: String, hasValue: valueanyThisTypeany): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], hasValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def defineProperty[T /* <: js.Object */](target: T, name: js.Symbol, hasValue: valueanyThisTypeany): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], hasValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def formatToParts(
    numberResult: NumberResult,
    data: NumberFormatLocaleInternalData,
    pl: PluralRules,
    options: Currency
  ): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("_formatToParts")(numberResult.asInstanceOf[js.Any], data.asInstanceOf[js.Any], pl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  
  inline def getInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, field: Field): /* import warning: importer.ImportType#apply Failed type conversion: Internal[Field] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getInternalSlot")(map.asInstanceOf[js.Any], pl.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: Internal[Field] */ js.Any]
  
  inline def getMagnitude(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMagnitude")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, fields: Field*): Pick[Internal, Field] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiInternalSlots")((scala.List(map.asInstanceOf[js.Any], pl.asInstanceOf[js.Any])).`++`(fields.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Pick[Internal, Field]]
  
  inline def invariant(condition: Boolean, message: String): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
  inline def invariant(condition: Boolean, message: String, Err: Any): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], Err.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
  
  inline def isLiteralPart(patternPart: Value): /* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/utils.LiteralPart */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralPart")(patternPart.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/utils.LiteralPart */ Boolean]
  inline def isLiteralPart(patternPart: LiteralPart): /* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/utils.LiteralPart */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralPart")(patternPart.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/utils.LiteralPart */ Boolean]
  
  inline def isMissingLocaleDataError(e: js.Error): /* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/data.MissingLocaleDataError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMissingLocaleDataError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/data.MissingLocaleDataError */ Boolean]
  
  inline def msFromTime(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("msFromTime")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeUnitNamespace(unit: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUnitNamespace")(unit.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](
    map: WeakMap[Instance, Internal],
    pl: Instance,
    field: Field,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Internal>[Field] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setInternalSlot")(map.asInstanceOf[js.Any], pl.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, K /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, props: Pick[NonNullable[Internal], K]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMultiInternalSlots")(map.asInstanceOf[js.Any], pl.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
