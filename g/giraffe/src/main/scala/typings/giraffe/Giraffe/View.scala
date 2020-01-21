package typings.giraffe.Giraffe

import typings.jquery.JQuery_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.giraffe.Giraffe.GiraffeObject because var conflicts: initialize. Inlined app, appEvents, dataEvents, defaultOptions, beforeInitialize, afterInitialize, dispose, beforeDispose, afterDispose */ @JSGlobal("Giraffe.View")
@js.native
class View[TModel /* <: Model */] ()
  extends typings.backbone.mod.View[TModel] {
  var afterInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  var app: App_ = js.native
  var appEvents: js.UndefOr[StringMap] = js.native
  var beforeInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  var children: js.Array[View[TModel]] = js.native
  var dataEvents: js.UndefOr[StringMap] = js.native
  var defaultOptions: js.UndefOr[DefaultOptions_] = js.native
  var documentTitle: String = js.native
  var parent: View[TModel] = js.native
  var template: js.Any = js.native
  var ui: StringMap = js.native
  def addChild(child: View[TModel]): View[TModel] = js.native
  def addChildren(children: js.Array[View[TModel]]): View[TModel] = js.native
  def afterDispose(): View[TModel] = js.native
  def afterRender(): js.Any = js.native
  def attach(view: View[TModel]): View[TModel] = js.native
  def attach(view: View[TModel], options: AttachmentOptions): View[TModel] = js.native
  def attachTo(el: js.Any): View[TModel] = js.native
  def attachTo(el: js.Any, options: AttachmentOptions): View[TModel] = js.native
  def beforeDispose(): View[TModel] = js.native
  def beforeRender(): js.Any = js.native
  def detach(): View[TModel] = js.native
  def detach(preserve: Boolean): View[TModel] = js.native
  def detachChildren(): View[TModel] = js.native
  def detachChildren(preserve: Boolean): View[TModel] = js.native
  def dispose(): View[TModel] = js.native
  def invoke(method: String, args: js.Any*): js.Any = js.native
  def isAttached(el: js.Any): Boolean = js.native
  def removeChild(child: View[TModel]): View[TModel] = js.native
  def removeChild(child: View[TModel], preserve: Boolean): View[TModel] = js.native
  def removeChildren(): View[TModel] = js.native
  def removeChildren(preserve: Boolean): View[TModel] = js.native
  def render(options: js.Any): View[TModel] = js.native
  def serialize(): js.Any = js.native
  def setParent(parent: View[TModel]): View[TModel] = js.native
  def templateStrategy(): String = js.native
}

/* static members */
@JSGlobal("Giraffe.View")
@js.native
object View extends js.Object {
  def detachByElement(el: js.Any): View[Model] = js.native
  def detachByElement(el: js.Any, preserve: Boolean): View[Model] = js.native
  def getByCid(cid: String): View[Model] = js.native
  def getClosestView[TModel](el: js.Any): View[Model] = js.native
  def removeDocumentEvents(): js.Any = js.native
  def removeDocumentEvents(prefix: String): js.Any = js.native
  def setDocumentEventPrefix(): js.Any = js.native
  def setDocumentEventPrefix(prefix: String): js.Any = js.native
  def setDocumentEvents(events: js.Array[String]): js.Array[String] = js.native
  def setDocumentEvents(events: js.Array[String], prefix: String): js.Array[String] = js.native
  def setTemplateStrategy(strategy: js.Any): js.Any = js.native
  def setTemplateStrategy(strategy: js.Any, instance: js.Any): js.Any = js.native
  @JSName("to$El")
  def to$El(el: js.Any): JQuery_[HTMLElement] = js.native
  @JSName("to$El")
  def to$El(el: js.Any, parent: js.Any): JQuery_[HTMLElement] = js.native
  @JSName("to$El")
  def to$El(el: js.Any, parent: js.Any, allowParentMatch: Boolean): JQuery_[HTMLElement] = js.native
}

