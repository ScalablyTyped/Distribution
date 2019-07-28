package typings.firebird

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object firebirdMod {
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
  type DataType = Date | String | Double | FBBlob
}
