package typings
package firebirdLib.firebirdMod

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
  def fetch(
    rowCount: firebirdLib.firebirdLibStrings.all,
    asObject: firebirdLib.firebirdLibNumbers.`false`,
    rowCallback: js.Function1[/* row */ js.Array[DataType], scala.Unit],
    eofCallback: js.Function2[/* err */ stdLib.Error | scala.Null, /* eof */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def fetch(
    rowCount: firebirdLib.firebirdLibStrings.all,
    asObject: firebirdLib.firebirdLibNumbers.`true`,
    rowCallback: js.Function1[/* row */ org.scalablytyped.runtime.StringDictionary[DataType], scala.Unit],
    eofCallback: js.Function2[/* err */ stdLib.Error | scala.Null, /* eof */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Asynchronously fetches rows one by one.
    *
    * @param rowCount number of rows to fetch from results
    * @param asObject format of returned rows. When false - methods returns array of array, when true - array of objects
    * @param rowCallback function(row), row - Array or Object (depends on asObject parameter) representing single row from result; called for each fetched row.
    * @param eofCallback function(err,eof), err - Error object in case of error, or null; eof - true | false. called when whole operation is complete.
    */
  def fetch(
    rowCount: scala.Double,
    asObject: scala.Boolean,
    rowCallback: js.Function1[
      /* row */ js.Array[DataType] | org.scalablytyped.runtime.StringDictionary[DataType], 
      scala.Unit
    ],
    eofCallback: js.Function2[/* err */ stdLib.Error | scala.Null, /* eof */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def fetchSync(rowCount: firebirdLib.firebirdLibStrings.all, asObject: firebirdLib.firebirdLibNumbers.`false`): js.Array[js.Array[DataType]] = js.native
  def fetchSync(rowCount: firebirdLib.firebirdLibStrings.all, asObject: firebirdLib.firebirdLibNumbers.`true`): js.Array[org.scalablytyped.runtime.StringDictionary[DataType]] = js.native
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
  def fetchSync(rowCount: scala.Double, asObject: scala.Boolean): js.Array[js.Array[DataType] | org.scalablytyped.runtime.StringDictionary[DataType]] = js.native
  @JSName("fetchSync")
  def fetchSync_TObject[T /* <: js.Object */](rowCount: firebirdLib.firebirdLibStrings.all, asObject: firebirdLib.firebirdLibNumbers.`true`): js.Array[T] = js.native
  @JSName("fetchSync")
  def fetchSync_all(rowCount: firebirdLib.firebirdLibStrings.all, asObject: scala.Boolean): js.Array[js.Array[DataType] | org.scalablytyped.runtime.StringDictionary[DataType]] = js.native
  @JSName("fetchSync")
  def fetchSync_false(rowCount: scala.Double, asObject: firebirdLib.firebirdLibNumbers.`false`): js.Array[js.Array[DataType]] = js.native
  @JSName("fetchSync")
  def fetchSync_true(rowCount: scala.Double, asObject: firebirdLib.firebirdLibNumbers.`true`): js.Array[org.scalablytyped.runtime.StringDictionary[DataType]] = js.native
  @JSName("fetchSync")
  def fetchSync_true_TObject[T /* <: js.Object */](rowCount: scala.Double, asObject: firebirdLib.firebirdLibNumbers.`true`): js.Array[T] = js.native
  @JSName("fetch")
  def fetch_TObject[T /* <: js.Object */](
    rowCount: firebirdLib.firebirdLibStrings.all,
    asObject: firebirdLib.firebirdLibNumbers.`true`,
    rowCallback: js.Function1[/* row */ T, scala.Unit],
    eofCallback: js.Function2[/* err */ stdLib.Error | scala.Null, /* eof */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  @JSName("fetch")
  def fetch_all(
    rowCount: firebirdLib.firebirdLibStrings.all,
    asObject: scala.Boolean,
    rowCallback: js.Function1[
      /* row */ js.Array[DataType] | org.scalablytyped.runtime.StringDictionary[DataType], 
      scala.Unit
    ],
    eofCallback: js.Function2[/* err */ stdLib.Error | scala.Null, /* eof */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  @JSName("fetch")
  def fetch_false(
    rowCount: scala.Double,
    asObject: firebirdLib.firebirdLibNumbers.`false`,
    rowCallback: js.Function1[/* row */ js.Array[DataType], scala.Unit],
    eofCallback: js.Function2[/* err */ stdLib.Error | scala.Null, /* eof */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  @JSName("fetch")
  def fetch_true(
    rowCount: scala.Double,
    asObject: firebirdLib.firebirdLibNumbers.`true`,
    rowCallback: js.Function1[/* row */ org.scalablytyped.runtime.StringDictionary[DataType], scala.Unit],
    eofCallback: js.Function2[/* err */ stdLib.Error | scala.Null, /* eof */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  @JSName("fetch")
  def fetch_true_TObject[T /* <: js.Object */](
    rowCount: scala.Double,
    asObject: firebirdLib.firebirdLibNumbers.`true`,
    rowCallback: js.Function1[/* row */ T, scala.Unit],
    eofCallback: js.Function2[/* err */ stdLib.Error | scala.Null, /* eof */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
}

