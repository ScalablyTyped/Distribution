package typings
package documentdbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object documentdbMod {
  type ConsistencyLevel = documentdbLib.documentdbLibStrings.Strong | documentdbLib.documentdbLibStrings.BoundedStaleness | documentdbLib.documentdbLibStrings.Session | documentdbLib.documentdbLibStrings.Eventual
  type DatabaseMeta = AbstractMeta
  type DocumentQuery = SqlQuerySpec | java.lang.String
  type IndexKind = documentdbLib.documentdbLibStrings.Hash | documentdbLib.documentdbLibStrings.Range | documentdbLib.documentdbLibStrings.Spatial
  type IndexingMode = documentdbLib.documentdbLibStrings.Consistent | documentdbLib.documentdbLibStrings.Lazy
  type MediaReadMode = documentdbLib.documentdbLibStrings.Buffered | documentdbLib.documentdbLibStrings.Streamed
  type PartitionKind = documentdbLib.documentdbLibStrings.Hash
  type PermissionMode = documentdbLib.documentdbLibStrings.None | documentdbLib.documentdbLibStrings.Read | documentdbLib.documentdbLibStrings.All
  type Procedure = UserScriptable
  type RequestCallback[TResult] = js.Function3[
    /* error */ QueryError, 
    /* resource */ TResult, 
    /* responseHeaders */ js.Any, 
    scala.Unit
  ]
  type TriggerOperation = documentdbLib.documentdbLibStrings.All | documentdbLib.documentdbLibStrings.Create | documentdbLib.documentdbLibStrings.Update | documentdbLib.documentdbLibStrings.Delete | documentdbLib.documentdbLibStrings.Replace | documentdbLib.documentdbLibStrings.all | documentdbLib.documentdbLibStrings.create | documentdbLib.documentdbLibStrings.update | documentdbLib.documentdbLibStrings.delete | documentdbLib.documentdbLibStrings.replace
  type TriggerType = documentdbLib.documentdbLibStrings.Pre | documentdbLib.documentdbLibStrings.Post | documentdbLib.documentdbLibStrings.pre | documentdbLib.documentdbLibStrings.post
  type UserDefinedFunctionMeta = AbstractMeta
  type UserDefinedFunctionType = documentdbLib.documentdbLibStrings.Javascript
  type UserFunction = (js.Function1[/* repeated */ js.Any, scala.Unit]) | java.lang.String
}
