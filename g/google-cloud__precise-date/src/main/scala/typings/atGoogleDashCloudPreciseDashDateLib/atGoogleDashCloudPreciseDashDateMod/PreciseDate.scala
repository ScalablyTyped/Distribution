package typings
package atGoogleDashCloudPreciseDashDateLib.atGoogleDashCloudPreciseDashDateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/precise-date", "PreciseDate")
@js.native
class PreciseDate ()
  extends stdLib.Date {
  def this(preciseTime: DateTuple) = this()
  def this(preciseTime: ProtobufDate) = this()
  def this(preciseTime: java.lang.String) = this()
  def this(preciseTime: stdLib.BigInt) = this()
  def this(time: scala.Double) = this()
  def this(time: stdLib.Date) = this()
  def this(year: scala.Double, month: js.UndefOr[scala.Double], date: js.UndefOr[scala.Double], hours: js.UndefOr[scala.Double], minutes: js.UndefOr[scala.Double], seconds: js.UndefOr[scala.Double], milliseconds: js.UndefOr[scala.Double], microseconds: js.UndefOr[scala.Double], nanoseconds: js.UndefOr[scala.Double]) = this()
  /**
    * Returns the sub-second precision of the specified date. This will always be
    * a positive number.
    *
    * @private
    *
    * @returns {number}
    */
  var _getNanos: js.Any = js.native
  /**
    * Returns the total number of seconds in the specified date since Unix epoch.
    * Numbers representing < epoch will be negative.
    *
    * @private
    *
    * @returns {number}
    */
  var _getSeconds: js.Any = js.native
  var _micros: js.Any = js.native
  var _nanos: js.Any = js.native
  /**
    * Returns the specified date represented in nanoseconds according to
    * universal time.
    *
    * **NOTE:** Because this method returns a `BigInt` it requires Node >= v10.7.
    * Use {@link PreciseDate#getFullTimeString} to get the time as a string.
    *
    * @see {@link https://github.com/tc39/proposal-bigint|BigInt}
    *
    * @throws {error} If `BigInt` is unavailable.
    * @returns {bigint}
    *
    * @example
    * const date = new PreciseDate('2019-02-08T10:34:29.481145231Z');
    *
    * console.log(date.getFullTime());
    * // expected output: 1549622069481145231n
    */
  def getFullTime(): stdLib.BigInt = js.native
  /**
    * Returns a string of the specified date represented in nanoseconds according
    * to universal time.
    *
    * @returns {string}
    *
    * @example
    * const date = new PreciseDate('2019-02-08T10:34:29.481145231Z');
    *
    * console.log(date.getFullTimeString());
    * // expected output: "1549622069481145231"
    */
  def getFullTimeString(): java.lang.String = js.native
  /**
    * Returns the microseconds in the specified date according to universal time.
    *
    * @returns {number}
    *
    * @example
    * const date = new PreciseDate('2019-02-08T10:34:29.481145Z');
    *
    * console.log(date.getMicroseconds());
    * // expected output: 145
    */
  def getMicroseconds(): scala.Double = js.native
  /**
    * Returns the nanoseconds in the specified date according to universal time.
    *
    * @returns {number}
    *
    * @example
    * const date = new PreciseDate('2019-02-08T10:34:29.481145231Z');
    *
    * console.log(date.getNanoseconds());
    * // expected output: 231
    */
  def getNanoseconds(): scala.Double = js.native
  /**
    * Sets the PreciseDate object to the time represented by a number of
    * nanoseconds since January 1, 1970, 00:00:00 UTC.
    *
    * @param {bigint|number|string} time Value representing the number of
    *     nanoseconds since January 1, 1970, 00:00:00 UTC.
    * @returns {string} Returns a string representing the nanoseconds in the
    *     specified date according to universal time (effectively, the value of
    *     the argument).
    *
    * @see {@link https://github.com/tc39/proposal-bigint|BigInt}
    *
    * @example <caption>With a nanosecond string.</caption>
    * const date = new PreciseDate();
    * date.setFullTime('1549622069481145231');
    *
    * @example <caption>With a BigInt</caption>
    * date.setFullTime(1549622069481145231n);
    */
  def setFullTime(time: java.lang.String): java.lang.String = js.native
  def setFullTime(time: scala.Double): java.lang.String = js.native
  def setFullTime(time: stdLib.BigInt): java.lang.String = js.native
  /**
    * Sets the microseconds for a specified date according to universal time.
    *
    * @param {number} microseconds A number representing the microseconds.
    * @returns {string} Returns a string representing the nanoseconds in the
    *     specified date according to universal time.
    *
    * @example
    * const date = new PreciseDate();
    *
    * date.setMicroseconds(149);
    *
    * console.log(date.getMicroseconds());
    * // expected output: 149
    */
  def setMicroseconds(micros: scala.Double): java.lang.String = js.native
  /**
    * Sets the nanoseconds for a specified date according to universal time.
    *
    * @param {number} nanoseconds A number representing the nanoseconds.
    * @returns {string} Returns a string representing the nanoseconds in the
    *     specified date according to universal time.
    *
    * @example
    * const date = new PreciseDate();
    *
    * date.setNanoseconds(231);
    *
    * console.log(date.getNanoseconds());
    * // expected output: 231
    */
  def setNanoseconds(nanos: scala.Double): java.lang.String = js.native
  /**
    * Returns an object representing the specified date according to universal
    * time.
    *
    * @see {@link https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#timestamp|google.protobuf.Timestamp}
    *
    * @returns {DateStruct}
    *
    * @example
    * const date = new PreciseDate('2019-02-08T10:34:29.481145231Z');
    *
    * console.log(date.toStruct());
    * // expected output: {seconds: 1549622069, nanos: 481145231}
    */
  def toStruct(): DateStruct = js.native
  /**
    * Returns a tuple representing the specified date according to universal
    * time.
    *
    * @returns {DateTuple}
    *
    * @example
    * const date = new PreciseDate('2019-02-08T10:34:29.481145231Z');
    *
    * console.log(date.toTuple());
    * // expected output: [1549622069, 481145231]
    */
  def toTuple(): DateTuple = js.native
}

/* static members */
@JSImport("@google-cloud/precise-date", "PreciseDate")
@js.native
object PreciseDate extends js.Object {
  /**
    * Accepts the same number parameters as the PreciseDate constructor, but
    * treats them as UTC. It returns a string that represents the number of
    * nanoseconds since January 1, 1970, 00:00:00 UTC.
    *
    * **NOTE:** Because this method returns a `BigInt` it requires Node >= v10.7.
    *
    * @see {@link https://github.com/tc39/proposal-bigint|BigInt}
    *
    * @static
    *
    * @throws {error} If `BigInt` is unavailable.
    *
    * @param {...number} [dateFields] The date fields.
    * @returns {bigint}
    *
    * @example
    * const time = PreciseDate.fullUTC(2019, 1, 8, 10, 34, 29, 481, 145, 231);
    * console.log(time); // expected output: 1549622069481145231n
    */
  def fullUTC(args: scala.Double*): stdLib.BigInt = js.native
  /**
    * Accepts the same number parameters as the PreciseDate constructor, but
    * treats them as UTC. It returns a string that represents the number of
    * nanoseconds since January 1, 1970, 00:00:00 UTC.
    *
    * @static
    *
    * @param {...number} [dateFields] The date fields.
    * @returns {string}
    *
    * @example
    * const time = PreciseDate.fullUTCString(2019, 1, 8, 10, 34, 29, 481, 145,
    * 231); console.log(time); // expected output: '1549622069481145231'
    */
  def fullUTCString(args: scala.Double*): java.lang.String = js.native
  def parseFull(time: atGoogleDashCloudPreciseDashDateLib.atGoogleDashCloudPreciseDashDateMod.DateTuple): java.lang.String = js.native
  def parseFull(time: atGoogleDashCloudPreciseDashDateLib.atGoogleDashCloudPreciseDashDateMod.ProtobufDate): java.lang.String = js.native
  /**
    * Parses a precise time.
    *
    * @static
    *
    * @param {string|bigint|DateTuple|DateStruct} time The precise time value.
    * @returns {string} Returns a string representing the nanoseconds in the
    *     specified date according to universal time.
    *
    * @example <caption>From a RFC 3339 formatted string.</caption>
    * const time = PreciseDate.parseFull('2019-02-08T10:34:29.481145231Z');
    * console.log(time); // expected output: "1549622069481145231"
    *
    * @example <caption>From a nanosecond timestamp string.</caption>
    * const time = PreciseDate.parseFull('1549622069481145231');
    * console.log(time); // expected output: "1549622069481145231"
    *
    * @example <caption>From a BigInt (requires Node >= v10.7)</caption>
    * const time = PreciseDate.parseFull(1549622069481145231n);
    * console.log(time); // expected output: "1549622069481145231"
    *
    * @example <caption>From a tuple.</caption>
    * const time = PreciseDate.parseFull([1549622069, 481145231]);
    * console.log(time); // expected output: "1549622069481145231"
    *
    * @example <caption>From an object.</caption>
    * const struct = {seconds: 1549622069, nanos: 481145231};
    * const time = PreciseDate.parseFull(struct);
    * console.log(time); // expected output: "1549622069481145231"
    */
  def parseFull(time: java.lang.String): java.lang.String = js.native
  def parseFull(time: stdLib.BigInt): java.lang.String = js.native
}

