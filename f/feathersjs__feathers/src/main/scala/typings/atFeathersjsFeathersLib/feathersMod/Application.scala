package typings
package atFeathersjsFeathersLib.feathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application[ServiceTypes]
  extends nodeLib.eventsMod.EventEmitter {
  var version: java.lang.String = js.native
  def configure(callback: js.ThisFunction1[/* this */ this.type, /* app */ this.type, scala.Unit]): this.type = js.native
  def disable(name: java.lang.String): this.type = js.native
  def disabled(name: java.lang.String): scala.Boolean = js.native
  def enable(name: java.lang.String): this.type = js.native
  def enabled(name: java.lang.String): scala.Boolean = js.native
  def get(name: java.lang.String): js.Any = js.native
  def hooks(hooks: stdLib.Partial[HooksObject]): this.type = js.native
  def service(location: java.lang.String): Service[_] = js.native
  def service[L /* <: java.lang.String */](location: L): Service[
    /* import warning: ImportType.apply Failed type conversion: ServiceTypes[L] */ js.Any
  ] = js.native
  def set(name: java.lang.String, value: js.Any): this.type = js.native
  def setup(): this.type = js.native
  def setup(server: js.Any): this.type = js.native
  def use(path: java.lang.String, service: Application[_]): this.type = js.native
  def use(path: java.lang.String, service: Application[_], options: js.Any): this.type = js.native
  def use(path: java.lang.String, service: stdLib.Partial[ServiceMethods[_] with SetupMethod]): this.type = js.native
  def use(
    path: java.lang.String,
    service: stdLib.Partial[ServiceMethods[_] with SetupMethod],
    options: js.Any
  ): this.type = js.native
}

