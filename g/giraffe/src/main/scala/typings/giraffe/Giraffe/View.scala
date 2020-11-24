package typings.giraffe.Giraffe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.giraffe.Giraffe.GiraffeObject because var conflicts: initialize. Inlined app, appEvents, dataEvents, defaultOptions, beforeInitialize, afterInitialize, dispose, beforeDispose, afterDispose */ @js.native
trait View[TModel /* <: Model */]
  extends typings.backbone.mod.View[TModel] {
  
  def addChild(child: View[TModel]): View[TModel] = js.native
  
  def addChildren(children: js.Array[View[TModel]]): View[TModel] = js.native
  
  def afterDispose(): View[TModel] = js.native
  
  var afterInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  
  def afterRender(): js.Any = js.native
  
  var app: App = js.native
  
  var appEvents: js.UndefOr[StringMap] = js.native
  
  def attach(view: View[TModel]): View[TModel] = js.native
  def attach(view: View[TModel], options: AttachmentOptions): View[TModel] = js.native
  
  def attachTo(el: js.Any): View[TModel] = js.native
  def attachTo(el: js.Any, options: AttachmentOptions): View[TModel] = js.native
  
  def beforeDispose(): View[TModel] = js.native
  
  var beforeInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  
  def beforeRender(): js.Any = js.native
  
  var children: js.Array[View[TModel]] = js.native
  
  var dataEvents: js.UndefOr[StringMap] = js.native
  
  var defaultOptions: js.UndefOr[DefaultOptions] = js.native
  
  def detach(): View[TModel] = js.native
  def detach(preserve: Boolean): View[TModel] = js.native
  
  def detachChildren(): View[TModel] = js.native
  def detachChildren(preserve: Boolean): View[TModel] = js.native
  
  def dispose(): View[TModel] = js.native
  
  var documentTitle: String = js.native
  
  def invoke(method: String, args: js.Any*): js.Any = js.native
  
  def isAttached(el: js.Any): Boolean = js.native
  
  var parent: View[TModel] = js.native
  
  def removeChild(child: View[TModel]): View[TModel] = js.native
  def removeChild(child: View[TModel], preserve: Boolean): View[TModel] = js.native
  
  def removeChildren(): View[TModel] = js.native
  def removeChildren(preserve: Boolean): View[TModel] = js.native
  
  def render(options: js.Any): View[TModel] = js.native
  
  def serialize(): js.Any = js.native
  
  def setParent(parent: View[TModel]): View[TModel] = js.native
  
  var template: js.Any = js.native
  
  def templateStrategy(): String = js.native
  
  var ui: StringMap = js.native
}
