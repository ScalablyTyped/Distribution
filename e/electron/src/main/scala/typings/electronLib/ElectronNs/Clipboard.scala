package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clipboard extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/clipboard
  def availableFormats(): js.Array[java.lang.String] = js.native
  // Docs: http://electronjs.org/docs/api/clipboard
  def availableFormats(`type`: java.lang.String): js.Array[java.lang.String] = js.native
  /**
       * Clears the clipboard content.
       */
  def clear(): scala.Unit = js.native
  /**
       * Clears the clipboard content.
       */
  def clear(`type`: java.lang.String): scala.Unit = js.native
  def has(format: java.lang.String): scala.Boolean = js.native
  def has(format: java.lang.String, `type`: java.lang.String): scala.Boolean = js.native
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
  def readHTML(`type`: java.lang.String): java.lang.String = js.native
  def readImage(): NativeImage = js.native
  def readImage(`type`: java.lang.String): NativeImage = js.native
  def readRTF(): java.lang.String = js.native
  def readRTF(`type`: java.lang.String): java.lang.String = js.native
  def readText(): java.lang.String = js.native
  def readText(`type`: java.lang.String): java.lang.String = js.native
  /**
       * Writes data to the clipboard.
       */
  def write(data: Data): scala.Unit = js.native
  /**
       * Writes data to the clipboard.
       */
  def write(data: Data, `type`: java.lang.String): scala.Unit = js.native
  /**
       * Writes the title and url into the clipboard as a bookmark. Note: Most apps on
       * Windows don't support pasting bookmarks into them so you can use clipboard.write
       * to write both a bookmark and fallback text to the clipboard.
       */
  def writeBookmark(title: java.lang.String, url: java.lang.String): scala.Unit = js.native
  /**
       * Writes the title and url into the clipboard as a bookmark. Note: Most apps on
       * Windows don't support pasting bookmarks into them so you can use clipboard.write
       * to write both a bookmark and fallback text to the clipboard.
       */
  def writeBookmark(title: java.lang.String, url: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  /**
       * Writes the buffer into the clipboard as format.
       */
  def writeBuffer(format: java.lang.String, buffer: nodeLib.Buffer): scala.Unit = js.native
  /**
       * Writes the buffer into the clipboard as format.
       */
  def writeBuffer(format: java.lang.String, buffer: nodeLib.Buffer, `type`: java.lang.String): scala.Unit = js.native
  /**
       * Writes the text into the find pasteboard as plain text. This method uses
       * synchronous IPC when called from the renderer process.
       */
  def writeFindText(text: java.lang.String): scala.Unit = js.native
  /**
       * Writes markup to the clipboard.
       */
  def writeHTML(markup: java.lang.String): scala.Unit = js.native
  /**
       * Writes markup to the clipboard.
       */
  def writeHTML(markup: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  /**
       * Writes image to the clipboard.
       */
  def writeImage(image: NativeImage): scala.Unit = js.native
  /**
       * Writes image to the clipboard.
       */
  def writeImage(image: NativeImage, `type`: java.lang.String): scala.Unit = js.native
  /**
       * Writes the text into the clipboard in RTF.
       */
  def writeRTF(text: java.lang.String): scala.Unit = js.native
  /**
       * Writes the text into the clipboard in RTF.
       */
  def writeRTF(text: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  /**
       * Writes the text into the clipboard as plain text.
       */
  def writeText(text: java.lang.String): scala.Unit = js.native
  /**
       * Writes the text into the clipboard as plain text.
       */
  def writeText(text: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
}

