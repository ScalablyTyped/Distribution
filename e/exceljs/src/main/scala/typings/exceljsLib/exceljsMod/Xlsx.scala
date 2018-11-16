package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Xlsx extends js.Object {
  /**
  	 * Create input stream for reading
  	 */
  def createInputStream(): nodeLib.streamMod.Writable
  /**
  	 * read from a file
  	 */
  def readFile(path: java.lang.String): stdLib.Promise[scala.Unit]
  /**
  	 * write to a stream
  	 */
  def write(stream: nodeLib.streamMod.Stream): stdLib.Promise[scala.Unit]
  /**
  	 * write to a file
  	 */
  def writeFile(path: java.lang.String): stdLib.Promise[scala.Unit]
}

