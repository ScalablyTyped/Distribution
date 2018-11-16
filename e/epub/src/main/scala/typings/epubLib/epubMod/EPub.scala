package typings
package epubLib.epubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EPub
  extends nodeLib.eventsMod.EventEmitter {
  var flow: js.Array[js.Object] = js.native
  var manifest: js.Object = js.native
  var metadata: js.Object = js.native
  var spine: js.Object = js.native
  var toc: js.Array[TocElement] = js.native
  def getChapter(
    chapterId: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getChapterRaw(
    chapterId: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getFile(
    id: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* data */ nodeLib.Buffer, 
      /* mimeType */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getImage(
    id: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* data */ nodeLib.Buffer, 
      /* mimeType */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def parse(): scala.Unit = js.native
}

