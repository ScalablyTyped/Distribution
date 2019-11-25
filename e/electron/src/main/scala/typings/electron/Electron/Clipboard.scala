package typings.electron.Electron

import org.scalablytyped.runtime.TopLevel
import typings.electron.electronStrings.selection
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clipboard extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/clipboard
  def availableFormats(): js.Array[String] = js.native
  @JSName("availableFormats")
  def availableFormats_clipboard(`type`: typings.electron.electronStrings.clipboard): js.Array[String] = js.native
  @JSName("availableFormats")
  def availableFormats_selection(`type`: selection): js.Array[String] = js.native
  /**
    * Clears the clipboard content.
    */
  def clear(): Unit = js.native
  @JSName("clear")
  def clear_clipboard(`type`: typings.electron.electronStrings.clipboard): Unit = js.native
  @JSName("clear")
  def clear_selection(`type`: selection): Unit = js.native
  def has(format: String): Boolean = js.native
  @JSName("has")
  def has_clipboard(format: String, `type`: typings.electron.electronStrings.clipboard): Boolean = js.native
  @JSName("has")
  def has_selection(format: String, `type`: selection): Boolean = js.native
  def read(format: String): String = js.native
  /**
    * Returns an Object containing title and url keys representing the bookmark in the
    * clipboard. The title and url values will be empty strings when the bookmark is
    * unavailable.
    */
  def readBookmark(): ReadBookmark = js.native
  def readBuffer(format: String): Buffer = js.native
  /**
    * This method uses synchronous IPC when called from the renderer process. The
    * cached value is reread from the find pasteboard whenever the application is
    * activated.
    */
  def readFindText(): String = js.native
  def readHTML(): String = js.native
  @JSName("readHTML")
  def readHTML_clipboard(`type`: typings.electron.electronStrings.clipboard): String = js.native
  @JSName("readHTML")
  def readHTML_selection(`type`: selection): String = js.native
  def readImage(): NativeImage = js.native
  @JSName("readImage")
  def readImage_clipboard(`type`: typings.electron.electronStrings.clipboard): NativeImage = js.native
  @JSName("readImage")
  def readImage_selection(`type`: selection): NativeImage = js.native
  def readRTF(): String = js.native
  @JSName("readRTF")
  def readRTF_clipboard(`type`: typings.electron.electronStrings.clipboard): String = js.native
  @JSName("readRTF")
  def readRTF_selection(`type`: selection): String = js.native
  def readText(): String = js.native
  @JSName("readText")
  def readText_clipboard(`type`: typings.electron.electronStrings.clipboard): String = js.native
  @JSName("readText")
  def readText_selection(`type`: selection): String = js.native
  /**
    * Writes data to the clipboard.
    */
  def write(data: Data): Unit = js.native
  /**
    * Writes the title and url into the clipboard as a bookmark. Note: Most apps on
    * Windows don't support pasting bookmarks into them so you can use clipboard.write
    * to write both a bookmark and fallback text to the clipboard.
    */
  def writeBookmark(title: String, url: String): Unit = js.native
  @JSName("writeBookmark")
  def writeBookmark_clipboard(title: String, url: String, `type`: typings.electron.electronStrings.clipboard): Unit = js.native
  @JSName("writeBookmark")
  def writeBookmark_selection(title: String, url: String, `type`: selection): Unit = js.native
  /**
    * Writes the buffer into the clipboard as format.
    */
  def writeBuffer(format: String, buffer: Buffer): Unit = js.native
  @JSName("writeBuffer")
  def writeBuffer_clipboard(format: String, buffer: Buffer, `type`: typings.electron.electronStrings.clipboard): Unit = js.native
  @JSName("writeBuffer")
  def writeBuffer_selection(format: String, buffer: Buffer, `type`: selection): Unit = js.native
  /**
    * Writes the text into the find pasteboard (the pasteboard that holds information
    * about the current state of the active application’s find panel) as plain text.
    * This method uses synchronous IPC when called from the renderer process.
    */
  def writeFindText(text: String): Unit = js.native
  /**
    * Writes markup to the clipboard.
    */
  def writeHTML(markup: String): Unit = js.native
  @JSName("writeHTML")
  def writeHTML_clipboard(markup: String, `type`: typings.electron.electronStrings.clipboard): Unit = js.native
  @JSName("writeHTML")
  def writeHTML_selection(markup: String, `type`: selection): Unit = js.native
  /**
    * Writes image to the clipboard.
    */
  def writeImage(image: NativeImage): Unit = js.native
  @JSName("writeImage")
  def writeImage_clipboard(image: NativeImage, `type`: typings.electron.electronStrings.clipboard): Unit = js.native
  @JSName("writeImage")
  def writeImage_selection(image: NativeImage, `type`: selection): Unit = js.native
  /**
    * Writes the text into the clipboard in RTF.
    */
  def writeRTF(text: String): Unit = js.native
  @JSName("writeRTF")
  def writeRTF_clipboard(text: String, `type`: typings.electron.electronStrings.clipboard): Unit = js.native
  @JSName("writeRTF")
  def writeRTF_selection(text: String, `type`: selection): Unit = js.native
  /**
    * Writes the text into the clipboard as plain text.
    */
  def writeText(text: String): Unit = js.native
  @JSName("writeText")
  def writeText_clipboard(text: String, `type`: typings.electron.electronStrings.clipboard): Unit = js.native
  @JSName("writeText")
  def writeText_selection(text: String, `type`: selection): Unit = js.native
  @JSName("write")
  def write_clipboard(data: Data, `type`: typings.electron.electronStrings.clipboard): Unit = js.native
  @JSName("write")
  def write_selection(data: Data, `type`: selection): Unit = js.native
}

@JSGlobal("Electron.clipboard")
@js.native
object clipboard extends TopLevel[Clipboard]

