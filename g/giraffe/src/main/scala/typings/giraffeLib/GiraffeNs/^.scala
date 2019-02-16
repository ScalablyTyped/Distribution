package typings
package giraffeLib.GiraffeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe")
@js.native
object ^ extends js.Object {
  var app: giraffeLib.GiraffeNs.App = js.native
  var apps: giraffeLib.GiraffeNs.AppMap = js.native
  var defaultOptions: giraffeLib.GiraffeNs.DefaultOptions = js.native
  var version: java.lang.String = js.native
  var views: giraffeLib.GiraffeNs.ViewMap[giraffeLib.GiraffeNs.Model] = js.native
  def bindAppEvents(instance: giraffeLib.GiraffeNs.GiraffeObject): giraffeLib.GiraffeNs.GiraffeObject = js.native
  def bindDataEvents(instance: giraffeLib.GiraffeNs.GiraffeObject): giraffeLib.GiraffeNs.GiraffeObject = js.native
  def bindEvent(
    context: backboneLib.backboneMod.BackboneNs.Events,
    target: backboneLib.backboneMod.BackboneNs.Events,
    event: js.Any,
    callback: js.Function
  ): js.Any = js.native
  def bindEventMap(
    context: backboneLib.backboneMod.BackboneNs.Events,
    target: backboneLib.backboneMod.BackboneNs.Events,
    eventMap: js.Any
  ): js.Any = js.native
  def configure(instance: js.Any): js.Any = js.native
  def configure(instance: js.Any, options: js.Any): js.Any = js.native
  def dispose(instance: giraffeLib.GiraffeNs.GiraffeObject, args: js.Any*): giraffeLib.GiraffeNs.GiraffeObject = js.native
  def disposeThis(args: js.Any*): giraffeLib.GiraffeNs.GiraffeObject = js.native
  def unbindEvent(
    context: backboneLib.backboneMod.BackboneNs.Events,
    target: backboneLib.backboneMod.BackboneNs.Events,
    event: js.Any,
    callback: js.Function
  ): js.Any = js.native
  def unbindEventMap(
    context: backboneLib.backboneMod.BackboneNs.Events,
    target: backboneLib.backboneMod.BackboneNs.Events,
    eventMap: js.Any
  ): js.Any = js.native
  def wrapFn(obj: js.Any, name: java.lang.String, before: js.Function, after: js.Function): js.Any = js.native
}

