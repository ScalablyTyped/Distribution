package typings.electron.Electron

import typings.electron.electronStrings.clipboard
import typings.electron.electronStrings.selection
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clipboard extends StObject {
  
  // Docs: https://electronjs.org/docs/api/clipboard
  /**
    * An array of supported formats for the clipboard `type`.
    */
  def availableFormats(): js.Array[String] = js.native
  @JSName("availableFormats")
  def availableFormats_clipboard(`type`: clipboard): js.Array[String] = js.native
  @JSName("availableFormats")
  def availableFormats_selection(`type`: selection): js.Array[String] = js.native
  
  /**
    * Clears the clipboard content.
    */
  def clear(): Unit = js.native
  @JSName("clear")
  def clear_clipboard(`type`: clipboard): Unit = js.native
  @JSName("clear")
  def clear_selection(`type`: selection): Unit = js.native
  
  /**
    * Whether the clipboard supports the specified `format`.
    *
    * @experimental
    */
  def has(format: String): Boolean = js.native
  @JSName("has")
  def has_clipboard(format: String, `type`: clipboard): Boolean = js.native
  @JSName("has")
  def has_selection(format: String, `type`: selection): Boolean = js.native
  
  /**
    * Reads `format` type from the clipboard.
    *
    * @experimental
    */
  def read(format: String): String = js.native
  
  /**
    * * `title` String
    * * `url` String
    *
    * Returns an Object containing `title` and `url` keys representing the bookmark in
    * the clipboard. The `title` and `url` values will be empty strings when the
    * bookmark is unavailable.
    *
    * @platform darwin,win32
    */
  def readBookmark(): ReadBookmark = js.native
  
  /**
    * Reads `format` type from the clipboard.
    *
    * @experimental
    */
  def readBuffer(format: String): Buffer = js.native
  
  /**
    * The text on the find pasteboard, which is the pasteboard that holds information
    * about the current state of the active application’s find panel.
    *
    * This method uses synchronous IPC when called from the renderer process. The
    * cached value is reread from the find pasteboard whenever the application is
    * activated.
    *
    * @platform darwin
    */
  def readFindText(): String = js.native
  
  /**
    * The content in the clipboard as markup.
    */
  def readHTML(): String = js.native
  @JSName("readHTML")
  def readHTML_clipboard(`type`: clipboard): String = js.native
  @JSName("readHTML")
  def readHTML_selection(`type`: selection): String = js.native
  
  /**
    * The image content in the clipboard.
    */
  def readImage(): NativeImage_ = js.native
  @JSName("readImage")
  def readImage_clipboard(`type`: clipboard): NativeImage_ = js.native
  @JSName("readImage")
  def readImage_selection(`type`: selection): NativeImage_ = js.native
  
  /**
    * The content in the clipboard as RTF.
    */
  def readRTF(): String = js.native
  @JSName("readRTF")
  def readRTF_clipboard(`type`: clipboard): String = js.native
  @JSName("readRTF")
  def readRTF_selection(`type`: selection): String = js.native
  
  /**
    * The content in the clipboard as plain text.
    */
  def readText(): String = js.native
  @JSName("readText")
  def readText_clipboard(`type`: clipboard): String = js.native
  @JSName("readText")
  def readText_selection(`type`: selection): String = js.native
  
  /**
    * Writes `data` to the clipboard.
    */
  def write(data: Data): Unit = js.native
  
  /**
    * Writes the `title` and `url` into the clipboard as a bookmark.
    *
    * **Note:** Most apps on Windows don't support pasting bookmarks into them so you
    * can use `clipboard.write` to write both a bookmark and fallback text to the
    * clipboard.
    *
    * @platform darwin,win32
    */
  def writeBookmark(title: String, url: String): Unit = js.native
  @JSName("writeBookmark")
  def writeBookmark_clipboard(title: String, url: String, `type`: clipboard): Unit = js.native
  @JSName("writeBookmark")
  def writeBookmark_selection(title: String, url: String, `type`: selection): Unit = js.native
  
  /**
    * Writes the `buffer` into the clipboard as `format`.
    *
    * @experimental
    */
  def writeBuffer(format: String, buffer: Buffer): Unit = js.native
  @JSName("writeBuffer")
  def writeBuffer_clipboard(format: String, buffer: Buffer, `type`: clipboard): Unit = js.native
  @JSName("writeBuffer")
  def writeBuffer_selection(format: String, buffer: Buffer, `type`: selection): Unit = js.native
  
  /**
    * Writes the `text` into the find pasteboard (the pasteboard that holds
    * information about the current state of the active application’s find panel) as
    * plain text. This method uses synchronous IPC when called from the renderer
    * process.
    *
    * @platform darwin
    */
  def writeFindText(text: String): Unit = js.native
  
  /**
    * Writes `markup` to the clipboard.
    */
  def writeHTML(markup: String): Unit = js.native
  @JSName("writeHTML")
  def writeHTML_clipboard(markup: String, `type`: clipboard): Unit = js.native
  @JSName("writeHTML")
  def writeHTML_selection(markup: String, `type`: selection): Unit = js.native
  
  /**
    * Writes `image` to the clipboard.
    */
  def writeImage(image: NativeImage_): Unit = js.native
  @JSName("writeImage")
  def writeImage_clipboard(image: NativeImage_, `type`: clipboard): Unit = js.native
  @JSName("writeImage")
  def writeImage_selection(image: NativeImage_, `type`: selection): Unit = js.native
  
  /**
    * Writes the `text` into the clipboard in RTF.
    */
  def writeRTF(text: String): Unit = js.native
  @JSName("writeRTF")
  def writeRTF_clipboard(text: String, `type`: clipboard): Unit = js.native
  @JSName("writeRTF")
  def writeRTF_selection(text: String, `type`: selection): Unit = js.native
  
  /**
    * Writes the `text` into the clipboard as plain text.
    */
  def writeText(text: String): Unit = js.native
  @JSName("writeText")
  def writeText_clipboard(text: String, `type`: clipboard): Unit = js.native
  @JSName("writeText")
  def writeText_selection(text: String, `type`: selection): Unit = js.native
  
  @JSName("write")
  def write_clipboard(data: Data, `type`: clipboard): Unit = js.native
  @JSName("write")
  def write_selection(data: Data, `type`: selection): Unit = js.native
}
