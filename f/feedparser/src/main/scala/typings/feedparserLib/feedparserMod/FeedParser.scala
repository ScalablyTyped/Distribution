package typings
package feedparserLib.feedparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedParser
  extends nodeLib.streamMod.Duplex {
  var _emitted_meta: scala.Boolean = js.native
  var errors: js.Array[nodeLib.Error] = js.native
  var in_xhtml: scala.Boolean = js.native
  var meta: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var options: feedparserLib.feedparserMod.FeedParserNs.Options = js.native
  var stack: js.Array[_] = js.native
  var stream: saxLib.saxMod.SAXStream = js.native
  var xhtml: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var xmlbase: js.Array[_] = js.native
  /* private */ def _flush(done: js.Function0[_]): scala.Unit = js.native
  /* private */ def _transform(data: js.Any, encoding: java.lang.String, done: js.Function0[_]): scala.Unit = js.native
  def addListener(ev: js.Any, fn: js.Any): js.Any = js.native
  def handleAttributes(attrs: feedparserLib.feedparserMod.FeedParserNs.Attrs, el: java.lang.String): js.Any = js.native
  def handleCloseTag(el: java.lang.String): scala.Unit = js.native
  def handleEnd(): js.Any = js.native
  def handleError(e: nodeLib.Error): scala.Unit = js.native
  def handleItem(
    node: feedparserLib.feedparserMod.FeedParserNs.Node,
    `type`: feedparserLib.feedparserMod.FeedParserNs.Type,
    options: feedparserLib.feedparserMod.FeedParserNs.Options
  ): feedparserLib.feedparserMod.FeedParserNs.Item = js.native
  def handleMeta(
    node: feedparserLib.feedparserMod.FeedParserNs.Node,
    `type`: feedparserLib.feedparserMod.FeedParserNs.Type,
    options: feedparserLib.feedparserMod.FeedParserNs.Options
  ): feedparserLib.feedparserMod.FeedParserNs.Meta = js.native
  def handleOpenTag(node: feedparserLib.feedparserMod.FeedParserNs.Node): scala.Unit = js.native
  def handleProcessingInstruction(node: feedparserLib.feedparserMod.FeedParserNs.Node): scala.Unit = js.native
  def handleSaxError(e: nodeLib.Error): scala.Unit = js.native
  def handleText(text: java.lang.String): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def listenerCount(`type`: feedparserLib.feedparserMod.FeedParserNs.Type): js.Any = js.native
  def listeners(`type`: feedparserLib.feedparserMod.FeedParserNs.Type): js.Any = js.native
  def on(ev: js.Any, fn: js.Any): js.Any = js.native
  def pipe(dest: js.Any, pipeOpts: js.Any): js.Any = js.native
  def push(chunk: js.Any, encoding: js.Any): js.Any = js.native
  def removeAllListeners(`type`: feedparserLib.feedparserMod.FeedParserNs.Type, args: js.Any*): js.Any = js.native
  def resumeSaxError(): scala.Unit = js.native
  def setDefaultEncoding(encoding: js.Any): js.Any = js.native
  def setEncoding(enc: js.Any): js.Any = js.native
  def setMaxListeners(n: js.Any): js.Any = js.native
  def unpipe(dest: js.Any): js.Any = js.native
  def wrap(stream: saxLib.saxMod.SAXStream, args: js.Any*): js.Any = js.native
}

