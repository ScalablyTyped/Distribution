package typings.googleCloudSpanner.anon

import typings.googleCloudPreciseDate.mod.PreciseDate
import typings.googleCloudSpanner.buildSrcCodecMod.Float
import typings.googleCloudSpanner.buildSrcCodecMod.Int
import typings.googleCloudSpanner.buildSrcCodecMod.Numeric
import typings.googleCloudSpanner.buildSrcCodecMod.PGNumeric
import typings.googleCloudSpanner.buildSrcCodecMod.Struct
import typings.protobufjs.mod.common.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSpanner extends StObject {
  
  /**
    * Placeholder used to auto populate a column with the commit timestamp.
    * This can only be used for timestamp columns that have set the option
    * "(allow_commit_timestamp=true)" in the schema.
    *
    * @type {string}
    */
  /* static member */
  var COMMIT_TIMESTAMP: String = js.native
  
  /* static member */
  var GOOGLE_STANDARD_SQL: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.admin.database.v1.DatabaseDialect */ Any = js.native
  
  /* static member */
  var POSTGRESQL: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.admin.database.v1.DatabaseDialect */ Any = js.native
  
  /* static member */
  def date(): Any = js.native
  def date(dateString: String): Any = js.native
  /* static member */
  def date(year: Double, month: Double, date: Double): Any = js.native
  
  /**
    * Helper function to get a Cloud Spanner Float64 object.
    *
    * @param {string|number} value The float as a number or string.
    * @returns {Float}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const float = Spanner.float(10);
    * ```
    */
  /* static member */
  def float(value: Any): Float = js.native
  
  /**
    * Gets the configured Spanner emulator host from an environment variable.
    */
  /* static member */
  def getSpannerEmulatorHost(): js.UndefOr[Endpoint] = js.native
  
  /**
    * Helper function to get a Cloud Spanner Int64 object.
    *
    * @param {string|number} value The int as a number or string.
    * @returns {Int}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const int = Spanner.int(10);
    * ```
    */
  /* static member */
  def int(value: Any): Int = js.native
  
  /**
    * Helper function to get a Cloud Spanner Numeric object.
    *
    * @param {string} value The numeric value as a string.
    * @returns {Numeric}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const numeric = Spanner.numeric("3.141592653");
    * ```
    */
  /* static member */
  def numeric(value: Any): Numeric = js.native
  
  /**
    * Helper function to get a Cloud Spanner pgNumeric object.
    *
    * @param {string} value The pgNumeric value as a string.
    * @returns {PGNumeric}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const pgNumeric = Spanner.pgNumeric("3.141592653");
    * ```
    */
  /* static member */
  def pgNumeric(value: Any): PGNumeric = js.native
  
  /**
    * Helper function to get a Cloud Spanner Struct object.
    *
    * @param {object} value The struct as a JSON object.
    * @returns {Struct}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const struct = Spanner.struct({
    *   user: 'bob',
    *   age: 32
    * });
    * ```
    */
  /* static member */
  def struct(): Struct = js.native
  def struct(value: Any): Struct = js.native
  
  /**
    * Date object with nanosecond precision. Supports all standard Date arguments
    * in addition to several custom types.
    * @external PreciseDate
    * @see {@link https://github.com/googleapis/nodejs-precise-date|PreciseDate}
    */
  /**
    * Helper function to get a Cloud Spanner Timestamp object.
    *
    * String timestamps should have a canonical format of
    * `YYYY-[M]M-[D]D[( |T)[H]H:[M]M:[S]S[.DDDDDDDDD]]Z`
    *
    * **Timestamp values must be expressed in Zulu time and cannot include a UTC
    * offset.**
    *
    * @see https://cloud.google.com/spanner/docs/data-types#timestamp-type
    *
    * @param {string|number|google.protobuf.Timestamp|external:PreciseDate}
    *     [timestamp] Either a RFC 3339 timestamp formatted string or a
    *     {@link google.protobuf.Timestamp} object. If a PreciseDate is given, it
    *     will return that timestamp as is.
    * @returns {external:PreciseDate}
    *
    * @example
    * ```
    * const timestamp = Spanner.timestamp('2019-02-08T10:34:29.481145231Z');
    *
    * ```
    * @example With a `google.protobuf.Timestamp` object
    * ```
    * const [seconds, nanos] = process.hrtime();
    * const timestamp = Spanner.timestamp({seconds, nanos});
    * ```
    *
    * @example With a Date timestamp
    * ```
    * const timestamp = Spanner.timestamp(Date.now());
    * ```
    */
  /* static member */
  def timestamp(): PreciseDate = js.native
  def timestamp(value: String): PreciseDate = js.native
  def timestamp(value: Double): PreciseDate = js.native
  def timestamp(value: PreciseDate): PreciseDate = js.native
  def timestamp(value: ITimestamp): PreciseDate = js.native
}
