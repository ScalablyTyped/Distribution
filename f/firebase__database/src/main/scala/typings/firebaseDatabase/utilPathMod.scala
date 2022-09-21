package typings.firebaseDatabase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilPathMod {
  
  @JSImport("@firebase/database/dist/src/core/util/Path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/Path", "Path")
  @js.native
  open class Path protected () extends StObject {
    /**
      * @param pathOrString - Path string to parse, or another path, or the raw
      * tokens array
      */
    def this(pathOrString: String) = this()
    def this(pathOrString: js.Array[String]) = this()
    def this(pathOrString: String, pieceNum: Double) = this()
    def this(pathOrString: js.Array[String], pieceNum: Double) = this()
    
    var pieceNum_ : Double = js.native
    
    var pieces_ : js.Array[String] = js.native
  }
  
  @JSImport("@firebase/database/dist/src/core/util/Path", "ValidationPath")
  @js.native
  open class ValidationPath protected () extends StObject {
    /**
      * @param path - Initial Path.
      * @param errorPrefix_ - Prefix for any error messages.
      */
    def this(path: Path, errorPrefix_ : String) = this()
    
    /** Initialize to number of '/' chars needed in path. */
    var byteLength_ : Double = js.native
    
    var errorPrefix_ : String = js.native
    
    var parts_ : js.Array[String] = js.native
  }
  
  inline def newEmptyPath(): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("newEmptyPath")().asInstanceOf[Path]
  
  inline def newRelativePath(outerPath: Path, innerPath: Path): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("newRelativePath")(outerPath.asInstanceOf[js.Any], innerPath.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  inline def pathChild(path: Path, childPathObj: String): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("pathChild")(path.asInstanceOf[js.Any], childPathObj.asInstanceOf[js.Any])).asInstanceOf[Path]
  inline def pathChild(path: Path, childPathObj: Path): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("pathChild")(path.asInstanceOf[js.Any], childPathObj.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  inline def pathCompare(left: Path, right: Path): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pathCompare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def pathContains(path: Path, other: Path): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pathContains")(path.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pathEquals(path: Path, other: Path): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pathEquals")(path.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pathGetBack(path: Path): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("pathGetBack")(path.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def pathGetFront(path: Path): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("pathGetFront")(path.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def pathGetLength(path: Path): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pathGetLength")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def pathIsEmpty(path: Path): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pathIsEmpty")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pathParent(path: Path): Path | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("pathParent")(path.asInstanceOf[js.Any]).asInstanceOf[Path | Null]
  
  inline def pathPopFront(path: Path): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("pathPopFront")(path.asInstanceOf[js.Any]).asInstanceOf[Path]
  
  inline def pathSlice(path: Path): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathSlice")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def pathSlice(path: Path, begin: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathSlice")(path.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def pathToUrlEncodedString(path: Path): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToUrlEncodedString")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validationPathPop(validationPath: ValidationPath): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validationPathPop")(validationPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validationPathPush(validationPath: ValidationPath, child: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validationPathPush")(validationPath.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validationPathToErrorString(validationPath: ValidationPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validationPathToErrorString")(validationPath.asInstanceOf[js.Any]).asInstanceOf[String]
}
