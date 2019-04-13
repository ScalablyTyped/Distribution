package typings
package dineroDotJsLib.dineroDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dinero extends js.Object {
  def add(addend: Dinero): Dinero = js.native
  def allocate(ratios: js.Array[scala.Double]): js.Array[Dinero] = js.native
  def convert(currency: java.lang.String): js.Promise[Dinero] = js.native
  def convert(currency: java.lang.String, options: ExchangeRatesApiOptions): js.Promise[Dinero] = js.native
  def convertPrecision(newPrecision: scala.Double): Dinero = js.native
  def divide(divisor: scala.Double): Dinero = js.native
  def divide(divisor: scala.Double, roundingMode: RoundingMode): Dinero = js.native
  def equalsTo(comparator: Dinero): scala.Boolean = js.native
  def getAmount(): scala.Double = js.native
  def getCurrency(): java.lang.String = js.native
  def getLocale(): java.lang.String = js.native
  def getPrecision(): scala.Double = js.native
  def greaterThan(comparator: Dinero): scala.Boolean = js.native
  def greaterThanOrEqual(comparator: Dinero): scala.Boolean = js.native
  /**
    * @deprecated since version 2.0
    */
  def hasCents(): scala.Boolean = js.native
  def hasSameAmount(comparator: Dinero): scala.Boolean = js.native
  def hasSameCurrency(comparator: Dinero): scala.Boolean = js.native
  def hasSubUnits(): scala.Boolean = js.native
  def isNegative(): scala.Boolean = js.native
  def isPositive(): scala.Boolean = js.native
  def isZero(): scala.Boolean = js.native
  def lessThan(comparator: Dinero): scala.Boolean = js.native
  def lessThanOrEqual(comparator: Dinero): scala.Boolean = js.native
  def multiply(multiplier: scala.Double): Dinero = js.native
  def multiply(multiplier: scala.Double, roundingMode: RoundingMode): Dinero = js.native
  def percentage(percentage: scala.Double): Dinero = js.native
  def setLocale(newLocale: java.lang.String): Dinero = js.native
  def subtract(subtrahend: Dinero): Dinero = js.native
  def toFormat(): java.lang.String = js.native
  def toFormat(format: java.lang.String): java.lang.String = js.native
  def toFormat(format: java.lang.String, roundingMode: RoundingMode): java.lang.String = js.native
  def toObject(): DineroObject = js.native
  def toRoundedUnit(digits: scala.Double): scala.Double = js.native
  def toRoundedUnit(digits: scala.Double, roundingMode: RoundingMode): scala.Double = js.native
  def toUnit(): scala.Double = js.native
}

