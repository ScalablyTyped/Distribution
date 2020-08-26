package typings.domhandler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domhandler/lib", "DomHandler")
@js.native
/**
  * Initiate a new DomHandler.
  *
  * @param callback Called once parsing has completed.
  * @param options Settings for the handler.
  * @param elementCB Callback whenever a tag is closed.
  */
class DomHandler () extends js.Object {
  def this(callback: Callback) = this()
  def this(callback: js.UndefOr[scala.Nothing], options: DomHandlerOptions) = this()
  def this(callback: Null, options: DomHandlerOptions) = this()
  def this(callback: Callback, options: DomHandlerOptions) = this()
  def this(
    callback: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    elementCB: ElementCallback
  ) = this()
  def this(callback: js.UndefOr[scala.Nothing], options: Null, elementCB: ElementCallback) = this()
  def this(callback: js.UndefOr[scala.Nothing], options: DomHandlerOptions, elementCB: ElementCallback) = this()
  def this(callback: Null, options: js.UndefOr[scala.Nothing], elementCB: ElementCallback) = this()
  def this(callback: Null, options: Null, elementCB: ElementCallback) = this()
  def this(callback: Null, options: DomHandlerOptions, elementCB: ElementCallback) = this()
  def this(callback: Callback, options: js.UndefOr[scala.Nothing], elementCB: ElementCallback) = this()
  def this(callback: Callback, options: Null, elementCB: ElementCallback) = this()
  def this(callback: Callback, options: DomHandlerOptions, elementCB: ElementCallback) = this()
  /** Called once parsing has completed. */
  var _callback: js.Any = js.native
  /** Indicated whether parsing has been completed. */
  var _done: js.Any = js.native
  /** Callback whenever a tag is closed. */
  var _elementCB: js.Any = js.native
  /** A data node that is still being written to. */
  var _lastNode: js.Any = js.native
  /** Settings for the handler. */
  var _options: js.Any = js.native
  /** Reference to the parser instance. Used for location information. */
  var _parser: js.Any = js.native
  /** Stack of open tags. */
  var _tagStack: js.Any = js.native
  /** The constructed DOM */
  var dom: js.Array[typings.domhandler.nodeMod.Node] = js.native
  /* protected */ def addDataNode(node: typings.domhandler.nodeMod.DataNode): Unit = js.native
  /* protected */ def addNode(node: typings.domhandler.nodeMod.Node): Unit = js.native
  /* protected */ def handleCallback(): Unit = js.native
  /* protected */ def handleCallback(error: Error): Unit = js.native
  def oncdataend(): Unit = js.native
  def oncdatastart(): Unit = js.native
  def onclosetag(): Unit = js.native
  def oncomment(data: String): Unit = js.native
  def oncommentend(): Unit = js.native
  def onend(): Unit = js.native
  def onerror(error: Error): Unit = js.native
  def onopentag(name: String, attribs: StringDictionary[String]): Unit = js.native
  def onparserinit(parser: ParserInterface): Unit = js.native
  def onprocessinginstruction(name: String, data: String): Unit = js.native
  def onreset(): Unit = js.native
  def ontext(data: String): Unit = js.native
}

