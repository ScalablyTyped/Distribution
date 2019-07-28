package typings.firebird.firebirdMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebird.firebirdNumbers.`false`
import typings.firebird.firebirdNumbers.`true`
import typings.firebird.firebirdStrings.all
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents results of SQL query if any.
  * You should use this object to fetch rows from database.
  * Each row may be represented as array of field values or as object with named fields.
  *
  * @see DataType
  */
@JSImport("firebird", "FBResult")
@js.native
class FBResult () extends js.Object {
  /**
    * Asynchronously fetches rows one by one.
    *
    * @param rowCount number of rows to fetch from results
    * @param asObject format of returned rows. When false - methods returns array of array, when true - array of objects
    * @param rowCallback function(row), row - Array or Object (depends on asObject parameter) representing single row from result; called for each fetched row.
    * @param eofCallback function(err,eof), err - Error object in case of error, or null; eof - true | false. called when whole operation is complete.
    */
  def fetch(
    rowCount: Double,
    asObject: Boolean,
    rowCallback: js.Function1[/* row */ js.Array[DataType] | StringDictionary[DataType], Unit],
    eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
  ): Unit = js.native
  def fetch(
    rowCount: all,
    asObject: `false`,
    rowCallback: js.Function1[/* row */ js.Array[DataType], Unit],
    eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
  ): Unit = js.native
  def fetch(
    rowCount: all,
    asObject: `true`,
    rowCallback: js.Function1[/* row */ StringDictionary[DataType], Unit],
    eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
  ): Unit = js.native
  /**
    * @summary
    * Synchronously fetches result rows.
    *
    * @desc
    * If you pass "all" as rowCount - it will fetch all result rows.
    * If you pass less rowCount than are actually in result, it will return specified number of rows.
    * You may call fetchSync multiple times until all rows will be fetched.
    * If you specify more rowCount than available it will return only actual number of rows.
    *
    * @param rowCount number of rows to fetch from results;
    * @param asObject format of returned rows. When false - methods returns array of array, when true - array of objects.
    */
  def fetchSync(rowCount: Double, asObject: Boolean): js.Array[js.Array[DataType] | StringDictionary[DataType]] = js.native
  def fetchSync(rowCount: all, asObject: `false`): js.Array[js.Array[DataType]] = js.native
  def fetchSync(rowCount: all, asObject: `true`): js.Array[StringDictionary[DataType]] = js.native
  @JSName("fetchSync")
  def fetchSync_T_Object[T /* <: js.Object */](rowCount: all, asObject: `true`): js.Array[T] = js.native
  @JSName("fetchSync")
  def fetchSync_all(rowCount: all, asObject: Boolean): js.Array[js.Array[DataType] | StringDictionary[DataType]] = js.native
  @JSName("fetchSync")
  def fetchSync_false(rowCount: Double, asObject: `false`): js.Array[js.Array[DataType]] = js.native
  @JSName("fetchSync")
  def fetchSync_true(rowCount: Double, asObject: `true`): js.Array[StringDictionary[DataType]] = js.native
  @JSName("fetchSync")
  def fetchSync_true_T_Object[T /* <: js.Object */](rowCount: Double, asObject: `true`): js.Array[T] = js.native
  @JSName("fetch")
  def fetch_T_Object[T /* <: js.Object */](
    rowCount: all,
    asObject: `true`,
    rowCallback: js.Function1[/* row */ T, Unit],
    eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
  ): Unit = js.native
  @JSName("fetch")
  def fetch_all(
    rowCount: all,
    asObject: Boolean,
    rowCallback: js.Function1[/* row */ js.Array[DataType] | StringDictionary[DataType], Unit],
    eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
  ): Unit = js.native
  @JSName("fetch")
  def fetch_false(
    rowCount: Double,
    asObject: `false`,
    rowCallback: js.Function1[/* row */ js.Array[DataType], Unit],
    eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
  ): Unit = js.native
  @JSName("fetch")
  def fetch_true(
    rowCount: Double,
    asObject: `true`,
    rowCallback: js.Function1[/* row */ StringDictionary[DataType], Unit],
    eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
  ): Unit = js.native
  @JSName("fetch")
  def fetch_true_T_Object[T /* <: js.Object */](
    rowCount: Double,
    asObject: `true`,
    rowCallback: js.Function1[/* row */ T, Unit],
    eofCallback: js.Function2[/* err */ Error | Null, /* eof */ Boolean, Unit]
  ): Unit = js.native
}

