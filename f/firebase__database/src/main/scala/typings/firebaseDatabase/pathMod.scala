package typings.firebaseDatabase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("@firebase/database/dist/src/core/util/Path", "Path")
  @js.native
  class Path protected () extends StObject {
    /**
      * @param {string|Array.<string>} pathOrString Path string to parse,
      *      or another path, or the raw tokens array
      * @param {number=} pieceNum
      */
    def this(pathOrString: String) = this()
    def this(pathOrString: js.Array[String]) = this()
    def this(pathOrString: String, pieceNum: Double) = this()
    def this(pathOrString: js.Array[String], pieceNum: Double) = this()
    
    /**
      * @param {string|!Path} childPathObj
      * @return {!Path}
      */
    def child(childPathObj: String): Path = js.native
    def child(childPathObj: Path): Path = js.native
    
    /**
      *
      * @param {!Path} other
      * @return {boolean} True if this path is a parent (or the same as) other
      */
    def contains(other: Path): Boolean = js.native
    
    /**
      *
      * @param {Path} other
      * @return {boolean} true if paths are the same.
      */
    def equals(other: Path): Boolean = js.native
    
    /**
      * @return {?string}
      */
    def getBack(): String | Null = js.native
    
    def getFront(): String | Null = js.native
    
    /**
      * @return {number} The number of segments in this path
      */
    def getLength(): Double = js.native
    
    /**
      * @return {boolean} True if there are no segments in this path
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * @return {?Path}
      */
    def parent(): Path | Null = js.native
    
    var pieceNum_ : js.Any = js.native
    
    var pieces_ : js.Any = js.native
    
    /**
      * @return {!Path}
      */
    def popFront(): Path = js.native
    
    /**
      * Shallow copy of the parts of the path.
      *
      * @param {number=} begin
      * @return {!Array<string>}
      */
    def slice(): js.Array[String] = js.native
    def slice(begin: Double): js.Array[String] = js.native
    
    def toUrlEncodedString(): String = js.native
  }
  /* static members */
  object Path {
    
    @JSImport("@firebase/database/dist/src/core/util/Path", "Path")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {!Path} left
      * @param {!Path} right
      * @return {number} -1, 0, 1 if left is less, equal, or greater than the right.
      */
    @scala.inline
    def comparePaths(left: Path, right: Path): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("comparePaths")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * @param {!Path} outerPath
      * @param {!Path} innerPath
      * @return {!Path} The path from outerPath to innerPath
      */
    @scala.inline
    def relativePath(outerPath: Path, innerPath: Path): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("relativePath")(outerPath.asInstanceOf[js.Any], innerPath.asInstanceOf[js.Any])).asInstanceOf[Path]
  }
  
  @JSImport("@firebase/database/dist/src/core/util/Path", "ValidationPath")
  @js.native
  class ValidationPath protected () extends StObject {
    /**
      * @param {!Path} path Initial Path.
      * @param {string} errorPrefix_ Prefix for any error messages.
      */
    def this(path: Path, errorPrefix_ : String) = this()
    
    /** @type {number} Initialize to number of '/' chars needed in path. */
    var byteLength_ : js.Any = js.native
    
    var checkValid_ : js.Any = js.native
    
    var errorPrefix_ : js.Any = js.native
    
    /** @type {!Array<string>} */
    var parts_ : js.Any = js.native
    
    def pop(): Unit = js.native
    
    /** @param {string} child */
    def push(child: String): Unit = js.native
    
    /**
      * String for use in error messages - uses '.' notation for path.
      *
      * @return {string}
      */
    def toErrorString(): String = js.native
  }
}
