package typings.feedparser.feedparserMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Duplex
import typings.sax.saxMod.SAXStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedParser extends Duplex {
  var _emitted_meta: Boolean = js.native
  var errors: js.Array[Error] = js.native
  var in_xhtml: Boolean = js.native
  var meta: StringDictionary[js.Any] = js.native
  var options: Options = js.native
  var stack: js.Array[_] = js.native
  var stream: SAXStream = js.native
  var xhtml: StringDictionary[js.Any] = js.native
  var xmlbase: js.Array[_] = js.native
  /* private */ def _flush(done: js.Function0[_]): Unit = js.native
  /* private */ def _transform(data: js.Any, encoding: String, done: js.Function0[_]): Unit = js.native
  def addListener(ev: js.Any, fn: js.Any): js.Any = js.native
  def handleAttributes(attrs: Attrs, el: String): js.Any = js.native
  def handleCloseTag(el: String): Unit = js.native
  def handleEnd(): js.Any = js.native
  def handleError(e: Error): Unit = js.native
  def handleItem(node: Node, `type`: Type, options: Options): Item = js.native
  def handleMeta(node: Node, `type`: Type, options: Options): Meta = js.native
  def handleOpenTag(node: Node): Unit = js.native
  def handleProcessingInstruction(node: Node): Unit = js.native
  def handleSaxError(e: Error): Unit = js.native
  def handleText(text: String): Unit = js.native
  def init(): Unit = js.native
  def listenerCount(`type`: Type): js.Any = js.native
  def listeners(`type`: Type): js.Any = js.native
  def on(ev: js.Any, fn: js.Any): js.Any = js.native
  def pipe(dest: js.Any, pipeOpts: js.Any): js.Any = js.native
  def push(chunk: js.Any, encoding: js.Any): js.Any = js.native
  def removeAllListeners(`type`: Type, args: js.Any*): js.Any = js.native
  def resumeSaxError(): Unit = js.native
  def setDefaultEncoding(encoding: js.Any): js.Any = js.native
  def setEncoding(enc: js.Any): js.Any = js.native
  def setMaxListeners(n: js.Any): js.Any = js.native
  def unpipe(dest: js.Any): js.Any = js.native
  def wrap(stream: SAXStream, args: js.Any*): js.Any = js.native
}

