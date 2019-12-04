package typings.atFirebaseDatabase.distSrcCoreOperationOperationMod

import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  /**
    * @type {!Path}
    */
  var path: Path
  /**
    * @type {!OperationSource}
    */
  var source: OperationSource
  /**
    * @type {!OperationType}
    */
  var `type`: OperationType
  /**
    * @param {string} childName
    * @return {?Operation}
    */
  def operationForChild(childName: String): Operation | Null
}

object Operation {
  @scala.inline
  def apply(
    operationForChild: String => Operation | Null,
    path: Path,
    source: OperationSource,
    `type`: OperationType
  ): Operation = {
    val __obj = js.Dynamic.literal(operationForChild = js.Any.fromFunction1(operationForChild), path = path.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

