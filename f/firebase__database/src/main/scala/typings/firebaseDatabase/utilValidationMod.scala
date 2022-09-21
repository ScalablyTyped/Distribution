package typings.firebaseDatabase

import typings.firebaseDatabase.anon.PathRepoInfo
import typings.firebaseDatabase.utilPathMod.Path
import typings.firebaseDatabase.utilPathMod.ValidationPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilValidationMod {
  
  @JSImport("@firebase/database/dist/src/core/util/validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/validation", "INVALID_KEY_REGEX_")
  @js.native
  val INVALID_KEY_REGEX_ : js.RegExp = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/validation", "INVALID_PATH_REGEX_")
  @js.native
  val INVALID_PATH_REGEX_ : js.RegExp = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/validation", "MAX_LEAF_SIZE_")
  @js.native
  val MAX_LEAF_SIZE_ : Double = js.native
  
  inline def isValidKey(key: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPathString(pathString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPathString")(pathString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPriority(priority: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPriority")(priority.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidRootPathString(pathString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidRootPathString")(pathString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateFirebaseData(errorPrefix: String, data: Any, path_ : Path): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateFirebaseData")(errorPrefix.asInstanceOf[js.Any], data.asInstanceOf[js.Any], path_.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateFirebaseData(errorPrefix: String, data: Any, path_ : ValidationPath): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateFirebaseData")(errorPrefix.asInstanceOf[js.Any], data.asInstanceOf[js.Any], path_.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateFirebaseDataArg(fnName: String, value: Any, path: Path, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateFirebaseDataArg")(fnName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], path.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateFirebaseMergeDataArg(fnName: String, data: Any, path: Path, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateFirebaseMergeDataArg")(fnName.asInstanceOf[js.Any], data.asInstanceOf[js.Any], path.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateFirebaseMergePaths(errorPrefix: String, mergePaths: js.Array[Path]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateFirebaseMergePaths")(errorPrefix.asInstanceOf[js.Any], mergePaths.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateKey(fnName: String, argumentName: String, key: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateKey")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], key.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateObject(fnName: String, argumentName: String, obj: Any, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateObject")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateObjectContainsKey(fnName: String, argumentName: String, obj: Any, key: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateObjectContainsKey")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateObjectContainsKey(fnName: String, argumentName: String, obj: Any, key: String, optional: Boolean, optType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateObjectContainsKey")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], optional.asInstanceOf[js.Any], optType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validatePathString(fnName: String, argumentName: String, pathString: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePathString")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], pathString.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validatePriority(fnName: String, priority: Any, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePriority")(fnName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateRootPathString(fnName: String, argumentName: String, pathString: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRootPathString")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], pathString.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateString(fnName: String, argumentName: String, string: Any, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateString")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], string.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateUrl(fnName: String, parsedUrl: PathRepoInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateUrl")(fnName.asInstanceOf[js.Any], parsedUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateWritablePath(fnName: String, path: Path): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateWritablePath")(fnName.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
