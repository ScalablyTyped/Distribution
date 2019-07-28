package typings.exceljs.exceljsMod

import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Csv extends js.Object {
  /**
  	 * Create input stream for reading
  	 */
  def createInputStream(): Writable = js.native
  /**
  	 * read from a stream
  	 */
  def read(stream: Stream): js.Promise[Worksheet] = js.native
  def read(stream: Stream, options: CsvReadOptions): js.Promise[Worksheet] = js.native
  /**
  	 * read from a file
  	 */
  def readFile(path: String): js.Promise[Worksheet] = js.native
  def readFile(path: String, options: CsvReadOptions): js.Promise[Worksheet] = js.native
  /**
  	 * write to a stream
  	 */
  def write(stream: Stream): js.Promise[Unit] = js.native
  def write(stream: Stream, options: CsvWriteOptions): js.Promise[Unit] = js.native
  /**
  	 * write to a file
  	 */
  def writeFile(path: String): js.Promise[Unit] = js.native
  def writeFile(path: String, options: CsvWriteOptions): js.Promise[Unit] = js.native
}

