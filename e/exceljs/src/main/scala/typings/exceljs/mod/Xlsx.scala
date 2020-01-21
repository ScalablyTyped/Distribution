package typings.exceljs.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xlsx extends js.Object {
  /**
  	 * Create input stream for reading
  	 */
  def createInputStream(): Writable = js.native
  /**
  	 * load from an array buffer
  	 * @param buffer
  	 */
  def load(buffer: Buffer): js.Promise[Workbook] = js.native
  /**
  	 * read from a stream
  	 * @param stream
  	 */
  def read(stream: Stream_): js.Promise[Workbook] = js.native
  /**
  	 * read from a file
  	 */
  def readFile(path: String): js.Promise[Workbook] = js.native
  /**
  	 * write to a stream
  	 */
  def write(stream: Stream_): js.Promise[Unit] = js.native
  def write(stream: Stream_, options: Partial[XlsxWriteOptions]): js.Promise[Unit] = js.native
  /**
  	 * write to a buffer
  	 */
  def writeBuffer(): js.Promise[Buffer] = js.native
  def writeBuffer(options: Partial[XlsxWriteOptions]): js.Promise[Buffer] = js.native
  /**
  	 * write to a file
  	 */
  def writeFile(path: String): js.Promise[Unit] = js.native
  def writeFile(path: String, options: Partial[XlsxWriteOptions]): js.Promise[Unit] = js.native
}

