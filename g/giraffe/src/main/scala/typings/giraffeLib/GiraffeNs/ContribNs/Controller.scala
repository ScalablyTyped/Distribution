package typings
package giraffeLib.GiraffeNs.ContribNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe.Contrib.Controller")
@js.native
class Controller ()
  extends backboneLib.backboneMod.EventsMixin
     with giraffeLib.GiraffeNs.GiraffeObject
     with backboneLib.backboneMod.Events {
  /* CompleteClass */
  override var app: giraffeLib.GiraffeNs.App = js.native
  /**
    * Faulty overgeneralization of Backbone.Events.on, for historical
    * reasons.
    */
  def on(eventName: js.Any): this.type = js.native
  def on(eventName: js.Any, callback: js.Any): this.type = js.native
  def on(eventName: js.Any, callback: js.Any, context: js.Any): this.type = js.native
}

