package typings.dojo.dojo._base

import typings.std.HTMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/window.html
  *
  * API to save/set/restore the global/document scope.
  *
  */
@JSName("window")
@js.native
trait window_ extends js.Object {
  /**
    * Alias for the current document. 'doc' can be modified
    * for temporary context shifting. See also withDoc().
    *
    */
  var doc: js.Object = js.native
  /**
    * Alias for the current window. 'global' can be modified
    * for temporary context shifting. See also withGlobal().
    *
    */
  var global: js.Object = js.native
  /**
    * Return the body element of the specified document or of dojo/_base/window::doc.
    *
    * @param doc               Optional
    */
  def body(): js.Any = js.native
  def body(doc: HTMLDocument): js.Any = js.native
  /**
    * changes the behavior of many core Dojo functions that deal with
    * namespace and DOM lookup, changing them to work in a new global
    * context (e.g., an iframe). The varibles dojo.global and dojo.doc
    * are modified as a result of calling this function and the result of
    * dojo.body() likewise differs.
    *
    * @param globalObject
    * @param globalDocument
    */
  def setContext(globalObject: js.Object, globalDocument: HTMLDocument): Unit = js.native
  /**
    * Invoke callback with documentObject as dojo/_base/window::doc.
    * Invoke callback with documentObject as dojo/_base/window::doc. If provided,
    * callback will be executed in the context of object thisObject
    * When callback() returns or throws an error, the dojo/_base/window::doc will
    * be restored to its previous state.
    *
    * @param documentObject
    * @param callback
    * @param thisObject               Optional
    * @param cbArguments               Optional
    */
  def withDoc(documentObject: HTMLDocument, callback: js.Function): js.Any = js.native
  def withDoc(documentObject: HTMLDocument, callback: js.Function, thisObject: js.Object): js.Any = js.native
  def withDoc(
    documentObject: HTMLDocument,
    callback: js.Function,
    thisObject: js.Object,
    cbArguments: js.Array[_]
  ): js.Any = js.native
  /**
    * Invoke callback with globalObject as dojo.global and
    * globalObject.document as dojo.doc.
    * Invoke callback with globalObject as dojo.global and
    * globalObject.document as dojo.doc. If provided, globalObject
    * will be executed in the context of object thisObject
    * When callback() returns or throws an error, the dojo.global
    * and dojo.doc will be restored to its previous state.
    *
    * @param globalObject
    * @param callback
    * @param thisObject               Optional
    * @param cbArguments               Optional
    */
  def withGlobal(globalObject: js.Object, callback: js.Function): js.Any = js.native
  def withGlobal(globalObject: js.Object, callback: js.Function, thisObject: js.Object): js.Any = js.native
  def withGlobal(globalObject: js.Object, callback: js.Function, thisObject: js.Object, cbArguments: js.Array[_]): js.Any = js.native
}

