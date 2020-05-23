package typings.firebaseDatabase

import typings.firebaseDatabase.anon.RepoInfo
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.pathMod.ValidationPath
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/validation", JSImport.Namespace)
@js.native
object validationMod extends js.Object {
  val INVALID_KEY_REGEX_ : RegExp = js.native
  val INVALID_PATH_REGEX_ : RegExp = js.native
  val MAX_LEAF_SIZE_ : Double = js.native
  def isValidKey(key: js.Any): Boolean = js.native
  def isValidPathString(pathString: String): Boolean = js.native
  def isValidPriority(priority: js.Any): Boolean = js.native
  def isValidRootPathString(pathString: String): Boolean = js.native
  def validateBoolean(fnName: String, argumentNumber: Double, bool: js.Any, optional: Boolean): Unit = js.native
  def validateCredential(fnName: String, argumentNumber: Double, cred: js.Any, optional: Boolean): Unit = js.native
  def validateEventType(fnName: String, argumentNumber: Double, eventType: String, optional: Boolean): Unit = js.native
  def validateFirebaseData(errorPrefix: String, data: js.Any, path_ : Path): Unit = js.native
  def validateFirebaseData(errorPrefix: String, data: js.Any, path_ : ValidationPath): Unit = js.native
  def validateFirebaseDataArg(fnName: String, argumentNumber: Double, data: js.Any, path: Path, optional: Boolean): Unit = js.native
  def validateFirebaseMergeDataArg(fnName: String, argumentNumber: Double, data: js.Any, path: Path, optional: Boolean): Unit = js.native
  def validateFirebaseMergePaths(errorPrefix: String, mergePaths: js.Array[Path]): Unit = js.native
  def validateKey(fnName: String, argumentNumber: Double, key: String, optional: Boolean): Unit = js.native
  def validateObject(fnName: String, argumentNumber: Double, obj: js.Any, optional: Boolean): Unit = js.native
  def validateObjectContainsKey(fnName: String, argumentNumber: Double, obj: js.Any, key: String, optional: Boolean): Unit = js.native
  def validateObjectContainsKey(
    fnName: String,
    argumentNumber: Double,
    obj: js.Any,
    key: String,
    optional: Boolean,
    optType: String
  ): Unit = js.native
  def validatePathString(fnName: String, argumentNumber: Double, pathString: String, optional: Boolean): Unit = js.native
  def validatePriority(fnName: String, argumentNumber: Double, priority: js.Any, optional: Boolean): Unit = js.native
  def validateRootPathString(fnName: String, argumentNumber: Double, pathString: String, optional: Boolean): Unit = js.native
  def validateString(fnName: String, argumentNumber: Double, string: js.Any, optional: Boolean): Unit = js.native
  def validateUrl(fnName: String, argumentNumber: Double, parsedUrl: RepoInfo): Unit = js.native
  def validateWritablePath(fnName: String, path: Path): Unit = js.native
}

