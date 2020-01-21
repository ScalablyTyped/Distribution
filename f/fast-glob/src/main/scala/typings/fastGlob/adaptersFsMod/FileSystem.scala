package typings.fastGlob.adaptersFsMod

import typings.fastGlob.typesEntriesMod.Entry
import typings.fastGlob.typesPatternsMod.Pattern
import typings.mrmlncReaddirEnhanced.mod.FilterFunction
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystem[T] extends js.Object {
  val options: js.Any
  /**
    * Return full path to entry.
    */
  def getFullEntryPath(filepath: String): String
  /**
    * Return an implementation of the Entry interface.
    */
  def makeEntry(stat: Stats, pattern: Pattern): Entry
  /**
    * The main logic of reading the entries that must be implemented by each adapter.
    */
  def read(filepaths: js.Array[String], filter: FilterFunction): T
}

object FileSystem {
  @scala.inline
  def apply[T](
    getFullEntryPath: String => String,
    makeEntry: (Stats, Pattern) => Entry,
    options: js.Any,
    read: (js.Array[String], FilterFunction) => T
  ): FileSystem[T] = {
    val __obj = js.Dynamic.literal(getFullEntryPath = js.Any.fromFunction1(getFullEntryPath), makeEntry = js.Any.fromFunction2(makeEntry), options = options.asInstanceOf[js.Any], read = js.Any.fromFunction2(read))
  
    __obj.asInstanceOf[FileSystem[T]]
  }
}

