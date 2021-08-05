package typings.firebaseDatabase

import typings.firebaseDatabase.anon.RepoInfo
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.pathMod.ValidationPath
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationMod {
  
  @JSImport("@firebase/database/dist/src/core/util/validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/validation", "INVALID_KEY_REGEX_")
  @js.native
  val INVALID_KEY_REGEX_ : RegExp = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/validation", "INVALID_PATH_REGEX_")
  @js.native
  val INVALID_PATH_REGEX_ : RegExp = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/validation", "MAX_LEAF_SIZE_")
  @js.native
  val MAX_LEAF_SIZE_ : Double = js.native
  
  inline def isValidKey(key: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPathString(pathString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPathString")(pathString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPriority(priority: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPriority")(priority.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidRootPathString(pathString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidRootPathString")(pathString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateBoolean(fnName: String, argumentNumber: Double, bool: js.Any, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateBoolean")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], bool.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateCredential(fnName: String, argumentNumber: Double, cred: js.Any, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCredential")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], cred.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateEventType(fnName: String, argumentNumber: Double, eventType: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateEventType")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateFirebaseData(errorPrefix: String, data: js.Any, path_ : Path): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateFirebaseData")(errorPrefix.asInstanceOf[js.Any], data.asInstanceOf[js.Any], path_.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateFirebaseData(errorPrefix: String, data: js.Any, path_ : ValidationPath): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateFirebaseData")(errorPrefix.asInstanceOf[js.Any], data.asInstanceOf[js.Any], path_.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateFirebaseDataArg(fnName: String, argumentNumber: Double, data: js.Any, path: Path, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateFirebaseDataArg")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], data.asInstanceOf[js.Any], path.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateFirebaseMergeDataArg(fnName: String, argumentNumber: Double, data: js.Any, path: Path, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateFirebaseMergeDataArg")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], data.asInstanceOf[js.Any], path.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateFirebaseMergePaths(errorPrefix: String, mergePaths: js.Array[Path]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateFirebaseMergePaths")(errorPrefix.asInstanceOf[js.Any], mergePaths.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateKey(fnName: String, argumentNumber: Double, key: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateKey")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], key.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateObject(fnName: String, argumentNumber: Double, obj: js.Any, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateObject")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateObjectContainsKey(fnName: String, argumentNumber: Double, obj: js.Any, key: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateObjectContainsKey")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateObjectContainsKey(
    fnName: String,
    argumentNumber: Double,
    obj: js.Any,
    key: String,
    optional: Boolean,
    optType: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateObjectContainsKey")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], optional.asInstanceOf[js.Any], optType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validatePathString(fnName: String, argumentNumber: Double, pathString: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePathString")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], pathString.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validatePriority(fnName: String, argumentNumber: Double, priority: js.Any, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePriority")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], priority.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateRootPathString(fnName: String, argumentNumber: Double, pathString: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRootPathString")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], pathString.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateString(fnName: String, argumentNumber: Double, string: js.Any, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateString")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], string.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateUrl(fnName: String, argumentNumber: Double, parsedUrl: RepoInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateUrl")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], parsedUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateWritablePath(fnName: String, path: Path): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateWritablePath")(fnName.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
