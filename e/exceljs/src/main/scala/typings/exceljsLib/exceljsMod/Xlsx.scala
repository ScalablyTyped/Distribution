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
    createInputStream: js.Function0[nodeLib.streamMod.Writable],
    readFile: js.Function1[java.lang.String, js.Promise[scala.Unit]],
    write: js.Function1[nodeLib.streamMod.Stream, js.Promise[scala.Unit]],
    writeFile: js.Function1[java.lang.String, js.Promise[scala.Unit]]
  ): Xlsx = {
    val __obj = js.Dynamic.literal(createInputStream = createInputStream, readFile = readFile, write = write, writeFile = writeFile)
  
    __obj.asInstanceOf[Xlsx]
  }
}

