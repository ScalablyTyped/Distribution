package typings
package giraffeLib.GiraffeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe.View")
@js.native
class View[TModel /* <: Model */] ()
  extends backboneLib.backboneMod.View[TModel]
     with GiraffeObject {
  /* CompleteClass */
  override var app: App = js.native
  @JSName("appEvents")
  var appEvents_View: StringMap = js.native
  var children: js.Array[View[TModel]] = js.native
  @JSName("dataEvents")
  var dataEvents_View: StringMap = js.native
  @JSName("defaultOptions")
  var defaultOptions_View: DefaultOptions = js.native
  var documentTitle: java.lang.String = js.native
  var parent: View[TModel] = js.native
  var template: js.Any = js.native
  var ui: StringMap = js.native
  def addChild(child: View[TModel]): View[TModel] = js.native
  def addChildren(children: js.Array[View[TModel]]): View[TModel] = js.native
  @JSName("afterDispose")
  def afterDispose_MView(): View[TModel] = js.native
  def afterRender(): js.Any = js.native
  def attach(view: View[TModel]): View[TModel] = js.native
  def attach(view: View[TModel], options: AttachmentOptions): View[TModel] = js.native
  def attachTo(el: js.Any): View[TModel] = js.native
  def attachTo(el: js.Any, options: AttachmentOptions): View[TModel] = js.native
  @JSName("beforeDispose")
  def beforeDispose_MView(): View[TModel] = js.native
  def beforeRender(): js.Any = js.native
  def detach(): View[TModel] = js.native
  def detach(preserve: scala.Boolean): View[TModel] = js.native
  def detachChildren(): View[TModel] = js.native
  def detachChildren(preserve: scala.Boolean): View[TModel] = js.native
  @JSName("dispose")
  def dispose_MView(): View[TModel] = js.native
  def invoke(method: java.lang.String, args: js.Any*): js.Any = js.native
  def isAttached(el: js.Any): scala.Boolean = js.native
  def removeChild(child: View[TModel]): View[TModel] = js.native
  def removeChild(child: View[TModel], preserve: scala.Boolean): View[TModel] = js.native
  def removeChildren(): View[TModel] = js.native
  def removeChildren(preserve: scala.Boolean): View[TModel] = js.native
  def render(): View[TModel] = js.native
  def render(options: js.Any): View[TModel] = js.native
  def serialize(): js.Any = js.native
  def setParent(parent: View[TModel]): View[TModel] = js.native
  def templateStrategy(): java.lang.String = js.native
}

/* static members */
@JSGlobal("Giraffe.View")
@js.native
object View extends js.Object {
  def detachByElement(el: js.Any): giraffeLib.GiraffeNs.View[giraffeLib.GiraffeNs.Model] = js.native
  def detachByElement(el: js.Any, preserve: scala.Boolean): giraffeLib.GiraffeNs.View[giraffeLib.GiraffeNs.Model] = js.native
  def getByCid(cid: java.lang.String): giraffeLib.GiraffeNs.View[giraffeLib.GiraffeNs.Model] = js.native
  def getClosestView[TModel](el: js.Any): giraffeLib.GiraffeNs.View[giraffeLib.GiraffeNs.Model] = js.native
  def removeDocumentEvents(): js.Any = js.native
  def removeDocumentEvents(prefix: java.lang.String): js.Any = js.native
  def setDocumentEventPrefix(): js.Any = js.native
  def setDocumentEventPrefix(prefix: java.lang.String): js.Any = js.native
  def setDocumentEvents(events: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def setDocumentEvents(events: js.Array[java.lang.String], prefix: java.lang.String): js.Array[java.lang.String] = js.native
  def setTemplateStrategy(strategy: js.Any): js.Any = js.native
  def setTemplateStrategy(strategy: js.Any, instance: js.Any): js.Any = js.native
  @JSName("to$El")
  def to$El(el: js.Any): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  @JSName("to$El")
  def to$El(el: js.Any, parent: js.Any): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  @JSName("to$El")
  def to$El(el: js.Any, parent: js.Any, allowParentMatch: scala.Boolean): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
}

