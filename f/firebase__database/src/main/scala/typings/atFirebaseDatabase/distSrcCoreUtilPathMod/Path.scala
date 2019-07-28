package typings.atFirebaseDatabase.distSrcCoreUtilPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/Path", "Path")
@js.native
class Path protected () extends js.Object {
  /**
    * @param {string|Array.<string>} pathOrString Path string to parse,
    *      or another path, or the raw tokens array
    * @param {number=} pieceNum
    */
  def this(pathOrString: String) = this()
  def this(pathOrString: js.Array[String]) = this()
  def this(pathOrString: String, pieceNum: Double) = this()
  def this(pathOrString: js.Array[String], pieceNum: Double) = this()
  var pieceNum_ : js.Any = js.native
  var pieces_ : js.Any = js.native
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
@JSImport("@firebase/database/dist/src/core/util/Path", "Path")
@js.native
object Path extends js.Object {
  /**
    * Singleton to represent an empty path
    *
    * @const
    */
  val Empty: Path = js.native
  /**
    * @param {!Path} left
    * @param {!Path} right
    * @return {number} -1, 0, 1 if left is less, equal, or greater than the right.
    */
  def comparePaths(left: Path, right: Path): Double = js.native
  /**
    * @param {!Path} outerPath
    * @param {!Path} innerPath
    * @return {!Path} The path from outerPath to innerPath
    */
  def relativePath(outerPath: Path, innerPath: Path): Path = js.native
}

