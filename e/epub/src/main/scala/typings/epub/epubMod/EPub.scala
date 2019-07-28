package typings.epub.epubMod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EPub extends EventEmitter {
  var flow: js.Array[js.Object] = js.native
  var manifest: js.Object = js.native
  var metadata: js.Object = js.native
  var spine: js.Object = js.native
  var toc: js.Array[TocElement] = js.native
  def getChapter(chapterId: String, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def getChapterRaw(chapterId: String, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def getFile(
    id: String,
    callback: js.Function3[/* error */ Error, /* data */ Buffer, /* mimeType */ String, Unit]
  ): Unit = js.native
  def getImage(
    id: String,
    callback: js.Function3[/* error */ Error, /* data */ Buffer, /* mimeType */ String, Unit]
  ): Unit = js.native
  def parse(): Unit = js.native
}

