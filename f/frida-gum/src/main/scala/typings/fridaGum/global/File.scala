package typings.fridaGum.global

import typings.fridaGum.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides basic filesystem access.
  */
@JSGlobal("File")
@js.native
open class File protected ()
  extends StObject
     with typings.fridaGum.File {
  /**
    * Opens or creates the file at `filePath` with `mode` specifying how
    * it should be opened. For example `"wb"` to open the file for writing
    * in binary mode. This is the same format as `fopen()` from the C
    * standard library.
    *
    * @param filePath Path to file to open or create.
    * @param mode Mode to use.
    */
  def this(filePath: String, mode: String) = this()
}
object File {
  
  @JSGlobal("File")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Passed to `seek()` to specify that the offset is relative to the current
    * file position.
    */
  /* static member */
  @JSGlobal("File.SEEK_CUR")
  @js.native
  def SEEK_CUR: Double = js.native
  inline def SEEK_CUR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEEK_CUR")(x.asInstanceOf[js.Any])
  
  /**
    * Passed to `seek()` to specify that the offset is relative to the end of
    * the file.
    */
  /* static member */
  @JSGlobal("File.SEEK_END")
  @js.native
  def SEEK_END: Double = js.native
  inline def SEEK_END_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEEK_END")(x.asInstanceOf[js.Any])
  
  /**
    * Passed to `seek()` to specify that the offset is relative to the start
    * of the file.
    */
  /* static member */
  @JSGlobal("File.SEEK_SET")
  @js.native
  def SEEK_SET: Double = js.native
  inline def SEEK_SET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEEK_SET")(x.asInstanceOf[js.Any])
  
  /**
    * Opens the binary file at `filePath`, reads all of its content into an
    * ArrayBuffer, and then closes the file.
    *
    * @param filePath The file to read from.
    */
  /* static member */
  inline def readAllBytes(filePath: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readAllBytes")(filePath.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  /**
    * Opens the UTF-8 encoded text file at `filePath`, reads all of its text
    * into a string, and then closes the file.
    *
    * @param filePath The file to read from.
    */
  /* static member */
  inline def readAllText(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readAllText")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def writeAllBytes(filePath: String, bytes: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAllBytes")(filePath.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Creates a new file at `filePath`, writes the specified bytes to it, and
    * then closes the file. The target file is overwritten in case it already
    * exists.
    *
    * @param filePath The file to write to.
    * @param bytes The bytes to write to the file.
    */
  /* static member */
  inline def writeAllBytes(filePath: String, bytes: ArrayBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAllBytes")(filePath.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new file at `filePath`, writes the specified text to it
    * encoded as UTF-8, and then closes the file. The target file is
    * overwritten in case it already exists.
    *
    * @param filePath The file to write to.
    * @param text The string to write to the file.
    */
  /* static member */
  inline def writeAllText(filePath: String, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAllText")(filePath.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
