package typings.electron.Electron

import typings.node.bufferMod.global.Buffer
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
  @scala.annotation.targetName("availableFormats_selection_clipboard")
  def availableFormats(`type`: "selection" | "clipboard"): js.Array[String] = js.native
  
  /**
    * Clears the clipboard content.
    */
  def clear(): Unit = js.native
  @JSName("clear")
  @scala.annotation.targetName("clear_selection_clipboard")
  def clear(`type`: "selection" | "clipboard"): Unit = js.native
  
  /**
    * Whether the clipboard supports the specified `format`.
    *
    * @experimental
    */
  def has(format: String): Boolean = js.native
  @JSName("has")
  @scala.annotation.targetName("has_selection_clipboard")
  def has(format: String, `type`: "selection" | "clipboard"): Boolean = js.native
  
  /**
    * Reads `format` type from the clipboard.
    *
    * `format` should contain valid ASCII characters and have `/` separator. `a/c`,
    * `a/bc` are valid formats while `/abc`, `abc/`, `a/`, `/a`, `a` are not valid.
    *
    * @experimental
    */
  def read(format: String): String = js.native
  
  /**
    * * `title` string
    * * `url` string
    *
    * Returns an Object containing `title` and `url` keys representing the bookmark in
    * the clipboard. The `title` and `url` values will be empty strings when the
    * bookmark is unavailable.  The `title` value will always be empty on Windows.
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
  @scala.annotation.targetName("readHTML_selection_clipboard")
  def readHTML(`type`: "selection" | "clipboard"): String = js.native
  
  /**
    * The image content in the clipboard.
    */
  def readImage(): NativeImage_ = js.native
  @JSName("readImage")
  @scala.annotation.targetName("readImage_selection_clipboard")
  def readImage(`type`: "selection" | "clipboard"): NativeImage_ = js.native
  
  /**
    * The content in the clipboard as RTF.
    */
  def readRTF(): String = js.native
  @JSName("readRTF")
  @scala.annotation.targetName("readRTF_selection_clipboard")
  def readRTF(`type`: "selection" | "clipboard"): String = js.native
  
  /**
    * The content in the clipboard as plain text.
    */
  def readText(): String = js.native
  @JSName("readText")
  @scala.annotation.targetName("readText_selection_clipboard")
  def readText(`type`: "selection" | "clipboard"): String = js.native
  
  /**
    * Writes `data` to the clipboard.
    */
  def write(data: Data): Unit = js.native
  @JSName("write")
  @scala.annotation.targetName("write_selection_clipboard")
  def write(data: Data, `type`: "selection" | "clipboard"): Unit = js.native
  
  /**
    * Writes the `title` (macOS only) and `url` into the clipboard as a bookmark.
    *
    * **Note:** Most apps on Windows don't support pasting bookmarks into them so you
    * can use `clipboard.write` to write both a bookmark and fallback text to the
    * clipboard.
    *
    * @platform darwin,win32
    */
  def writeBookmark(title: String, url: String): Unit = js.native
  @JSName("writeBookmark")
  @scala.annotation.targetName("writeBookmark_selection_clipboard")
  def writeBookmark(title: String, url: String, `type`: "selection" | "clipboard"): Unit = js.native
  
  /**
    * Writes the `buffer` into the clipboard as `format`.
    *
    * @experimental
    */
  def writeBuffer(format: String, buffer: Buffer): Unit = js.native
  @JSName("writeBuffer")
  @scala.annotation.targetName("writeBuffer_selection_clipboard")
  def writeBuffer(format: String, buffer: Buffer, `type`: "selection" | "clipboard"): Unit = js.native
  
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
  @scala.annotation.targetName("writeHTML_selection_clipboard")
  def writeHTML(markup: String, `type`: "selection" | "clipboard"): Unit = js.native
  
  /**
    * Writes `image` to the clipboard.
    */
  def writeImage(image: NativeImage_): Unit = js.native
  @JSName("writeImage")
  @scala.annotation.targetName("writeImage_selection_clipboard")
  def writeImage(image: NativeImage_, `type`: "selection" | "clipboard"): Unit = js.native
  
  /**
    * Writes the `text` into the clipboard in RTF.
    */
  def writeRTF(text: String): Unit = js.native
  @JSName("writeRTF")
  @scala.annotation.targetName("writeRTF_selection_clipboard")
  def writeRTF(text: String, `type`: "selection" | "clipboard"): Unit = js.native
  
  /**
    * Writes the `text` into the clipboard as plain text.
    */
  def writeText(text: String): Unit = js.native
  @JSName("writeText")
  @scala.annotation.targetName("writeText_selection_clipboard")
  def writeText(text: String, `type`: "selection" | "clipboard"): Unit = js.native
}
