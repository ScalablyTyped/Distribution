package typings.firebird

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * @desc
    * Here is Firebird to Node data type accordance:
    *
    * | Firebird  | Node      |
    * | :-------  | :-------- |
    * | DATE	   |	Date   |
    * | TIME	   |	Date   |
    * | TIMESTAMP | 	Date   |
    * | CHAR      | 	String |
    * | VARCHAR   | 	String |
    * | SMALLINT  | 	Integer|
    * | INTEGER   | 	Integer|
    * | NUMERIC   | 	Number |
    * | DECIMAL   | 	Number |
    * | FLOAT     | 	Number |
    * | DOUBLE    | 	Number |
    * | BLOB      | 	FBblob |
    */
  type DataType = typings.std.Date | java.lang.String | scala.Double | typings.firebird.mod.FBBlob
}
