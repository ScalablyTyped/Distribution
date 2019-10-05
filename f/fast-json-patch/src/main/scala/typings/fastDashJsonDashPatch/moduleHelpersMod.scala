package typings.fastDashJsonDashPatch

import typings.fastDashJsonDashPatch.moduleHelpersMod.JsonPatchErrorName
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch/module/helpers", JSImport.Namespace)
@js.native
object moduleHelpersMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.SEQUENCE_NOT_AN_ARRAY
    - typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.OPERATION_NOT_AN_OBJECT
    - typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.OPERATION_OP_INVALID
    - typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.OPERATION_PATH_INVALID
    - typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.OPERATION_FROM_REQUIRED
    - typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.OPERATION_VALUE_REQUIRED
    - typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.OPERATION_VALUE_CANNOT_CONTAIN_UNDEFINED
    - typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.OPERATION_PATH_CANNOT_ADD
    - typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.OPERATION_PATH_UNRESOLVABLE
    - typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.OPERATION_FROM_UNRESOLVABLE
    - typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.OPERATION_PATH_ILLEGAL_ARRAY_INDEX
    - typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.OPERATION_VALUE_OUT_OF_BOUNDS
    - typings.fastDashJsonDashPatch.fastDashJsonDashPatchStrings.TEST_OPERATION_FAILED
  */
  trait JsonPatchErrorName extends js.Object
  
  @js.native
  class PatchError protected () extends Error {
    def this(message: String, name: JsonPatchErrorName) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any, tree: js.Any) = this()
    var index: js.UndefOr[Double] = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    @JSName("name")
    var name_PatchError: JsonPatchErrorName = js.native
    var operation: js.UndefOr[js.Any] = js.native
    var tree: js.UndefOr[js.Any] = js.native
  }
  
  def _deepClone(obj: js.Any): js.Any = js.native
  def _getPathRecursive(root: js.Object, obj: js.Object): String = js.native
  def _objectKeys(obj: js.Any): js.Array[_] = js.native
  def escapePathComponent(path: String): String = js.native
  def getPath(root: js.Object, obj: js.Object): String = js.native
  def hasOwnProperty(obj: js.Any, key: js.Any): js.Any = js.native
  def hasUndefined(obj: js.Any): Boolean = js.native
  def isInteger(str: String): Boolean = js.native
  def unescapePathComponent(path: String): String = js.native
}

