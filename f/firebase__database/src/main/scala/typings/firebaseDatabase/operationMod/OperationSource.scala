package typings.firebaseDatabase.operationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/operation/Operation", "OperationSource")
@js.native
class OperationSource protected () extends js.Object {
  def this(fromUser: Boolean, fromServer: Boolean, queryId: String, tagged: Boolean) = this()
  def this(fromUser: Boolean, fromServer: Boolean, queryId: Null, tagged: Boolean) = this()
  var fromServer: Boolean = js.native
  var fromUser: Boolean = js.native
  var queryId: String | Null = js.native
  var tagged: Boolean = js.native
}

/* static members */
@JSImport("@firebase/database/dist/src/core/operation/Operation", "OperationSource")
@js.native
object OperationSource extends js.Object {
  /**
    * @const
    * @type {!OperationSource}
    */
  var Server: OperationSource = js.native
  /**
    * @const
    * @type {!OperationSource}
    */
  var User: OperationSource = js.native
  /**
    * @param {string} queryId
    * @return {!OperationSource}
    */
  def forServerTaggedQuery(queryId: String): OperationSource = js.native
}

