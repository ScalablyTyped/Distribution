package typings
package documentdbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object documentdbMod {
  type DatabaseMeta = AbstractMeta
  type DocumentQuery = SqlQuerySpec | java.lang.String
  type PartitionKind = documentdbLib.documentdbLibStrings.Hash
  type Procedure = UserScriptable
  type RequestCallback[TResult] = js.Function3[
    /* error */ QueryError, 
    /* resource */ TResult, 
    /* responseHeaders */ js.Any, 
    scala.Unit
  ]
  type UserDefinedFunctionMeta = AbstractMeta
  type UserDefinedFunctionType = documentdbLib.documentdbLibStrings.Javascript
  type UserFunction = (js.Function1[/* repeated */ js.Any, scala.Unit]) | java.lang.String
}
