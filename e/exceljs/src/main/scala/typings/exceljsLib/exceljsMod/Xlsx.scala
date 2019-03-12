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
  def readFile(path: java.lang.String): js.Promise[scala.Unit]
  /**
  	 * write to a stream
  	 */
  def write(stream: nodeLib.streamMod.Stream): js.Promise[scala.Unit]
  /**
  	 * write to a file
  	 */
  def writeFile(path: java.lang.String): js.Promise[scala.Unit]
}

object Xlsx {
  @scala.inline
  def apply(
    createInputStream: () => nodeLib.streamMod.Writable,
    readFile: java.lang.String => js.Promise[scala.Unit],
    write: nodeLib.streamMod.Stream => js.Promise[scala.Unit],
    writeFile: java.lang.String => js.Promise[scala.Unit]
  ): Xlsx = {
    val __obj = js.Dynamic.literal(createInputStream = js.Any.fromFunction0(createInputStream), readFile = js.Any.fromFunction1(readFile), write = js.Any.fromFunction1(write), writeFile = js.Any.fromFunction1(writeFile))
  
    __obj.asInstanceOf[Xlsx]
  }
}

