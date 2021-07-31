package typings.fastJsonPatch

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleHelpersMod {
  
  @JSImport("fast-json-patch/module/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fast-json-patch/module/helpers", "PatchError")
  @js.native
  class PatchError protected ()
    extends StObject
       with Error {
    def this(message: String, name: JsonPatchErrorName) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Unit, operation: js.Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any, tree: js.Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: Unit, tree: js.Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Unit, operation: js.Any, tree: js.Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Unit, operation: Unit, tree: js.Any) = this()
    
    var index: js.UndefOr[Double] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_PatchError: JsonPatchErrorName = js.native
    
    var operation: js.UndefOr[js.Any] = js.native
    
    var tree: js.UndefOr[js.Any] = js.native
  }
  
  @scala.inline
  def deepClone(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_deepClone")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def escapePathComponent(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapePathComponent")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getPath(root: js.Object, obj: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(root.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getPathRecursive(root: js.Object, obj: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getPathRecursive")(root.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def hasOwnProperty_(obj: js.Any, key: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def hasUndefined(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isInteger(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def objectKeys(obj: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_objectKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def unescapePathComponent(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapePathComponent")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastJsonPatch.fastJsonPatchStrings.SEQUENCE_NOT_AN_ARRAY
    - typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_NOT_AN_OBJECT
    - typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_OP_INVALID
    - typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_PATH_INVALID
    - typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_FROM_REQUIRED
    - typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_VALUE_REQUIRED
    - typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_VALUE_CANNOT_CONTAIN_UNDEFINED
    - typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_PATH_CANNOT_ADD
    - typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_PATH_UNRESOLVABLE
    - typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_FROM_UNRESOLVABLE
    - typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_PATH_ILLEGAL_ARRAY_INDEX
    - typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_VALUE_OUT_OF_BOUNDS
    - typings.fastJsonPatch.fastJsonPatchStrings.TEST_OPERATION_FAILED
  */
  trait JsonPatchErrorName extends StObject
  object JsonPatchErrorName {
    
    @scala.inline
    def OPERATION_FROM_REQUIRED: typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_FROM_REQUIRED = "OPERATION_FROM_REQUIRED".asInstanceOf[typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_FROM_REQUIRED]
    
    @scala.inline
    def OPERATION_FROM_UNRESOLVABLE: typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_FROM_UNRESOLVABLE = "OPERATION_FROM_UNRESOLVABLE".asInstanceOf[typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_FROM_UNRESOLVABLE]
    
    @scala.inline
    def OPERATION_NOT_AN_OBJECT: typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_NOT_AN_OBJECT = "OPERATION_NOT_AN_OBJECT".asInstanceOf[typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_NOT_AN_OBJECT]
    
    @scala.inline
    def OPERATION_OP_INVALID: typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_OP_INVALID = "OPERATION_OP_INVALID".asInstanceOf[typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_OP_INVALID]
    
    @scala.inline
    def OPERATION_PATH_CANNOT_ADD: typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_PATH_CANNOT_ADD = "OPERATION_PATH_CANNOT_ADD".asInstanceOf[typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_PATH_CANNOT_ADD]
    
    @scala.inline
    def OPERATION_PATH_ILLEGAL_ARRAY_INDEX: typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_PATH_ILLEGAL_ARRAY_INDEX = "OPERATION_PATH_ILLEGAL_ARRAY_INDEX".asInstanceOf[typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_PATH_ILLEGAL_ARRAY_INDEX]
    
    @scala.inline
    def OPERATION_PATH_INVALID: typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_PATH_INVALID = "OPERATION_PATH_INVALID".asInstanceOf[typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_PATH_INVALID]
    
    @scala.inline
    def OPERATION_PATH_UNRESOLVABLE: typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_PATH_UNRESOLVABLE = "OPERATION_PATH_UNRESOLVABLE".asInstanceOf[typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_PATH_UNRESOLVABLE]
    
    @scala.inline
    def OPERATION_VALUE_CANNOT_CONTAIN_UNDEFINED: typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_VALUE_CANNOT_CONTAIN_UNDEFINED = "OPERATION_VALUE_CANNOT_CONTAIN_UNDEFINED".asInstanceOf[typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_VALUE_CANNOT_CONTAIN_UNDEFINED]
    
    @scala.inline
    def OPERATION_VALUE_OUT_OF_BOUNDS: typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_VALUE_OUT_OF_BOUNDS = "OPERATION_VALUE_OUT_OF_BOUNDS".asInstanceOf[typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_VALUE_OUT_OF_BOUNDS]
    
    @scala.inline
    def OPERATION_VALUE_REQUIRED: typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_VALUE_REQUIRED = "OPERATION_VALUE_REQUIRED".asInstanceOf[typings.fastJsonPatch.fastJsonPatchStrings.OPERATION_VALUE_REQUIRED]
    
    @scala.inline
    def SEQUENCE_NOT_AN_ARRAY: typings.fastJsonPatch.fastJsonPatchStrings.SEQUENCE_NOT_AN_ARRAY = "SEQUENCE_NOT_AN_ARRAY".asInstanceOf[typings.fastJsonPatch.fastJsonPatchStrings.SEQUENCE_NOT_AN_ARRAY]
    
    @scala.inline
    def TEST_OPERATION_FAILED: typings.fastJsonPatch.fastJsonPatchStrings.TEST_OPERATION_FAILED = "TEST_OPERATION_FAILED".asInstanceOf[typings.fastJsonPatch.fastJsonPatchStrings.TEST_OPERATION_FAILED]
  }
}
