package typings
package atFirebaseDatabaseLib.distSrcCoreUtilPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/Path", "ValidationPath")
@js.native
class ValidationPath protected () extends js.Object {
  /**
    * @param {!Path} path Initial Path.
    * @param {string} errorPrefix_ Prefix for any error messages.
    */
  def this(path: Path, `errorPrefix_`: java.lang.String) = this()
  /** @type {number} Initialize to number of '/' chars needed in path. */
  var `byteLength_`: js.Any = js.native
  var `errorPrefix_`: js.Any = js.native
  /** @type {!Array<string>} */
  var `parts_`: js.Any = js.native
  /* private */ def `checkValid_`(): js.Any = js.native
  def pop(): scala.Unit = js.native
  /** @param {string} child */
  def push(child: java.lang.String): scala.Unit = js.native
  /**
    * String for use in error messages - uses '.' notation for path.
    *
    * @return {string}
    */
  def toErrorString(): java.lang.String = js.native
}

/* static members */
@JSImport("@firebase/database/dist/src/core/util/Path", "ValidationPath")
@js.native
object ValidationPath extends js.Object {
  /** @const {number} Maximum key depth. */
  val MAX_PATH_DEPTH: scala.Double = js.native
  /** @const {number} Maximum number of (UTF8) bytes in a Firebase path. */
  val MAX_PATH_LENGTH_BYTES: scala.Double = js.native
}

