package typings.dineroDotJs.dineroDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dinero extends js.Object {
  def add(addend: Dinero): Dinero = js.native
  def allocate(ratios: js.Array[Double]): js.Array[Dinero] = js.native
  def convert(currency: String): js.Promise[Dinero] = js.native
  def convert(currency: String, options: ExchangeRatesApiOptions): js.Promise[Dinero] = js.native
  def convertPrecision(newPrecision: Double): Dinero = js.native
  def divide(divisor: Double): Dinero = js.native
  def divide(divisor: Double, roundingMode: RoundingMode): Dinero = js.native
  def equalsTo(comparator: Dinero): Boolean = js.native
  def getAmount(): Double = js.native
  def getCurrency(): String = js.native
  def getLocale(): String = js.native
  def getPrecision(): Double = js.native
  def greaterThan(comparator: Dinero): Boolean = js.native
  def greaterThanOrEqual(comparator: Dinero): Boolean = js.native
  /**
    * @deprecated since version 2.0
    */
  def hasCents(): Boolean = js.native
  def hasSameAmount(comparator: Dinero): Boolean = js.native
  def hasSameCurrency(comparator: Dinero): Boolean = js.native
  def hasSubUnits(): Boolean = js.native
  def isNegative(): Boolean = js.native
  def isPositive(): Boolean = js.native
  def isZero(): Boolean = js.native
  def lessThan(comparator: Dinero): Boolean = js.native
  def lessThanOrEqual(comparator: Dinero): Boolean = js.native
  def multiply(multiplier: Double): Dinero = js.native
  def multiply(multiplier: Double, roundingMode: RoundingMode): Dinero = js.native
  def percentage(percentage: Double): Dinero = js.native
  def setLocale(newLocale: String): Dinero = js.native
  def subtract(subtrahend: Dinero): Dinero = js.native
  def toFormat(): String = js.native
  def toFormat(format: String): String = js.native
  def toFormat(format: String, roundingMode: RoundingMode): String = js.native
  def toObject(): DineroObject = js.native
  def toRoundedUnit(digits: Double): Double = js.native
  def toRoundedUnit(digits: Double, roundingMode: RoundingMode): Double = js.native
  def toUnit(): Double = js.native
}

