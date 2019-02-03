package typings
package atFirebaseDatabaseLib.distSrcCoreUtilPathMod

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
  def this(pathOrString: java.lang.String) = this()
  def this(pathOrString: js.Array[java.lang.String]) = this()
  def this(pathOrString: java.lang.String, pieceNum: scala.Double) = this()
  def this(pathOrString: js.Array[java.lang.String], pieceNum: scala.Double) = this()
  var `pieceNum_`: js.Any = js.native
  var `pieces_`: js.Any = js.native
  def child(childPathObj: Path): Path = js.native
  /**
    * @param {string|!Path} childPathObj
    * @return {!Path}
    */
  def child(childPathObj: java.lang.String): Path = js.native
  /**
    *
    * @param {!Path} other
    * @return {boolean} True if this path is a parent (or the same as) other
    */
  def contains(other: Path): scala.Boolean = js.native
  /**
    *
    * @param {Path} other
    * @return {boolean} true if paths are the same.
    */
  def equals(other: Path): scala.Boolean = js.native
  /**
    * @return {?string}
    */
  def getBack(): java.lang.String | scala.Null = js.native
  def getFront(): java.lang.String | scala.Null = js.native
  /**
    * @return {number} The number of segments in this path
    */
  def getLength(): scala.Double = js.native
  /**
    * @return {boolean} True if there are no segments in this path
    */
  def isEmpty(): scala.Boolean = js.native
  /**
    * @return {?Path}
    */
  def parent(): Path | scala.Null = js.native
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
  def slice(): js.Array[java.lang.String] = js.native
  def slice(begin: scala.Double): js.Array[java.lang.String] = js.native
  def toUrlEncodedString(): java.lang.String = js.native
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
  val Empty: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path = js.native
  /**
    * @param {!Path} left
    * @param {!Path} right
    * @return {number} -1, 0, 1 if left is less, equal, or greater than the right.
    */
  def comparePaths(
    left: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    right: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path
  ): scala.Double = js.native
  /**
    * @param {!Path} outerPath
    * @param {!Path} innerPath
    * @return {!Path} The path from outerPath to innerPath
    */
  def relativePath(
    outerPath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    innerPath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path
  ): atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path = js.native
}

