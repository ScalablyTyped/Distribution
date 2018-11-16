package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Csv extends js.Object {
  /**
  	 * Create input stream for reading
  	 */
  def createInputStream(): nodeLib.streamMod.Writable = js.native
  /**
  	 * read from a stream
  	 */
  def read(stream: nodeLib.streamMod.Stream): stdLib.Promise[Worksheet] = js.native
  /**
  	 * read from a stream
  	 */
  def read(stream: nodeLib.streamMod.Stream, options: CsvReadOptions): stdLib.Promise[Worksheet] = js.native
  /**
  	 * read from a file
  	 */
  def readFile(path: java.lang.String): stdLib.Promise[Worksheet] = js.native
  /**
  	 * read from a file
  	 */
  def readFile(path: java.lang.String, options: CsvReadOptions): stdLib.Promise[Worksheet] = js.native
  /**
  	 * write to a stream
  	 */
  def write(stream: nodeLib.streamMod.Stream): stdLib.Promise[scala.Unit] = js.native
  /**
  	 * write to a stream
  	 */
  def write(stream: nodeLib.streamMod.Stream, options: CsvWriteOptions): stdLib.Promise[scala.Unit] = js.native
  /**
  	 * write to a file
  	 */
  def writeFile(path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
  	 * write to a file
  	 */
  def writeFile(path: java.lang.String, options: CsvWriteOptions): stdLib.Promise[scala.Unit] = js.native
}

