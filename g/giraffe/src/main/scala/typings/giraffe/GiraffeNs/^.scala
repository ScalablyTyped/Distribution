package typings.giraffe.GiraffeNs

import typings.backbone.backboneMod.Events
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe")
@js.native
object ^ extends js.Object {
  var app: App = js.native
  var apps: AppMap = js.native
  var defaultOptions: DefaultOptions = js.native
  var version: String = js.native
  var views: ViewMap[Model] = js.native
  def bindAppEvents(instance: GiraffeObject): GiraffeObject = js.native
  def bindDataEvents(instance: GiraffeObject): GiraffeObject = js.native
  def bindEvent(context: Events, target: Events, event: js.Any, callback: js.Function): js.Any = js.native
  def bindEventMap(context: Events, target: Events, eventMap: js.Any): js.Any = js.native
  def configure(instance: js.Any): js.Any = js.native
  def configure(instance: js.Any, options: js.Any): js.Any = js.native
  def dispose(instance: GiraffeObject, args: js.Any*): GiraffeObject = js.native
  def disposeThis(args: js.Any*): GiraffeObject = js.native
  def unbindEvent(context: Events, target: Events, event: js.Any, callback: js.Function): js.Any = js.native
  def unbindEventMap(context: Events, target: Events, eventMap: js.Any): js.Any = js.native
  def wrapFn(obj: js.Any, name: String, before: js.Function, after: js.Function): js.Any = js.native
}

