package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clipboard extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/clipboard
  def availableFormats(): js.Array[java.lang.String] = js.native
  @JSName("availableFormats")
  def availableFormats_clipboard(`type`: electronLib.electronLibStrings.clipboard): js.Array[java.lang.String] = js.native
  @JSName("availableFormats")
  def availableFormats_selection(`type`: electronLib.electronLibStrings.selection): js.Array[java.lang.String] = js.native
  /**
    * Clears the clipboard content.
    */
  def clear(): scala.Unit = js.native
  @JSName("clear")
  def clear_clipboard(`type`: electronLib.electronLibStrings.clipboard): scala.Unit = js.native
  @JSName("clear")
  def clear_selection(`type`: electronLib.electronLibStrings.selection): scala.Unit = js.native
  def has(format: java.lang.String): scala.Boolean = js.native
  @JSName("has")
  def has_clipboard(format: java.lang.String, `type`: electronLib.electronLibStrings.clipboard): scala.Boolean = js.native
  @JSName("has")
  def has_selection(format: java.lang.String, `type`: electronLib.electronLibStrings.selection): scala.Boolean = js.native
  def read(format: java.lang.String): java.lang.String = js.native
  /**
    * Returns an Object containing title and url keys representing the bookmark in the
    * clipboard. The title and url values will be empty strings when the bookmark is
    * unavailable.
    */
  def readBookmark(): ReadBookmark = js.native
  def readBuffer(format: java.lang.String): nodeLib.Buffer = js.native
  def readFindText(): java.lang.String = js.native
  def readHTML(): java.lang.String = js.native
  @JSName("readHTML")
  def readHTML_clipboard(`type`: electronLib.electronLibStrings.clipboard): java.lang.String = js.native
  @JSName("readHTML")
  def readHTML_selection(`type`: electronLib.electronLibStrings.selection): java.lang.String = js.native
  def readImage(): NativeImage = js.native
  @JSName("readImage")
  def readImage_clipboard(`type`: electronLib.electronLibStrings.clipboard): NativeImage = js.native
  @JSName("readImage")
  def readImage_selection(`type`: electronLib.electronLibStrings.selection): NativeImage = js.native
  def readRTF(): java.lang.String = js.native
  @JSName("readRTF")
  def readRTF_clipboard(`type`: electronLib.electronLibStrings.clipboard): java.lang.String = js.native
  @JSName("readRTF")
  def readRTF_selection(`type`: electronLib.electronLibStrings.selection): java.lang.String = js.native
  def readText(): java.lang.String = js.native
  @JSName("readText")
  def readText_clipboard(`type`: electronLib.electronLibStrings.clipboard): java.lang.String = js.native
  @JSName("readText")
  def readText_selection(`type`: electronLib.electronLibStrings.selection): java.lang.String = js.native
  /**
    * Writes data to the clipboard.
    */
  def write(data: Data): scala.Unit = js.native
  /**
    * Writes the title and url into the clipboard as a bookmark. Note: Most apps on
    * Windows don't support pasting bookmarks into them so you can use clipboard.write
    * to write both a bookmark and fallback text to the clipboard.
    */
  def writeBookmark(title: java.lang.String, url: java.lang.String): scala.Unit = js.native
  @JSName("writeBookmark")
  def writeBookmark_clipboard(title: java.lang.String, url: java.lang.String, `type`: electronLib.electronLibStrings.clipboard): scala.Unit = js.native
  @JSName("writeBookmark")
  def writeBookmark_selection(title: java.lang.String, url: java.lang.String, `type`: electronLib.electronLibStrings.selection): scala.Unit = js.native
  /**
    * Writes the buffer into the clipboard as format.
    */
  def writeBuffer(format: java.lang.String, buffer: nodeLib.Buffer): scala.Unit = js.native
  @JSName("writeBuffer")
  def writeBuffer_clipboard(format: java.lang.String, buffer: nodeLib.Buffer, `type`: electronLib.electronLibStrings.clipboard): scala.Unit = js.native
  @JSName("writeBuffer")
  def writeBuffer_selection(format: java.lang.String, buffer: nodeLib.Buffer, `type`: electronLib.electronLibStrings.selection): scala.Unit = js.native
  /**
    * Writes the text into the find pasteboard as plain text. This method uses
    * synchronous IPC when called from the renderer process.
    */
  def writeFindText(text: java.lang.String): scala.Unit = js.native
  /**
    * Writes markup to the clipboard.
    */
  def writeHTML(markup: java.lang.String): scala.Unit = js.native
  @JSName("writeHTML")
  def writeHTML_clipboard(markup: java.lang.String, `type`: electronLib.electronLibStrings.clipboard): scala.Unit = js.native
  @JSName("writeHTML")
  def writeHTML_selection(markup: java.lang.String, `type`: electronLib.electronLibStrings.selection): scala.Unit = js.native
  /**
    * Writes image to the clipboard.
    */
  def writeImage(image: NativeImage): scala.Unit = js.native
  @JSName("writeImage")
  def writeImage_clipboard(image: NativeImage, `type`: electronLib.electronLibStrings.clipboard): scala.Unit = js.native
  @JSName("writeImage")
  def writeImage_selection(image: NativeImage, `type`: electronLib.electronLibStrings.selection): scala.Unit = js.native
  /**
    * Writes the text into the clipboard in RTF.
    */
  def writeRTF(text: java.lang.String): scala.Unit = js.native
  @JSName("writeRTF")
  def writeRTF_clipboard(text: java.lang.String, `type`: electronLib.electronLibStrings.clipboard): scala.Unit = js.native
  @JSName("writeRTF")
  def writeRTF_selection(text: java.lang.String, `type`: electronLib.electronLibStrings.selection): scala.Unit = js.native
  /**
    * Writes the text into the clipboard as plain text.
    */
  def writeText(text: java.lang.String): scala.Unit = js.native
  @JSName("writeText")
  def writeText_clipboard(text: java.lang.String, `type`: electronLib.electronLibStrings.clipboard): scala.Unit = js.native
  @JSName("writeText")
  def writeText_selection(text: java.lang.String, `type`: electronLib.electronLibStrings.selection): scala.Unit = js.native
  @JSName("write")
  def write_clipboard(data: Data, `type`: electronLib.electronLibStrings.clipboard): scala.Unit = js.native
  @JSName("write")
  def write_selection(data: Data, `type`: electronLib.electronLibStrings.selection): scala.Unit = js.native
}

