package typings.exceljs.exceljsMod

import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Xlsx extends js.Object {
  /**
  	 * Create input stream for reading
  	 */
  def createInputStream(): Writable
  /**
  	 * read from a file
  	 */
  def readFile(path: String): js.Promise[Unit]
  /**
  	 * write to a stream
  	 */
  def write(stream: Stream): js.Promise[Unit]
  /**
  	 * write to a file
  	 */
  def writeFile(path: String): js.Promise[Unit]
}

object Xlsx {
  @scala.inline
  def apply(
    createInputStream: () => Writable,
    readFile: String => js.Promise[Unit],
    write: Stream => js.Promise[Unit],
    writeFile: String => js.Promise[Unit]
  ): Xlsx = {
    val __obj = js.Dynamic.literal(createInputStream = js.Any.fromFunction0(createInputStream), readFile = js.Any.fromFunction1(readFile), write = js.Any.fromFunction1(write), writeFile = js.Any.fromFunction1(writeFile))
  
    __obj.asInstanceOf[Xlsx]
  }
}

