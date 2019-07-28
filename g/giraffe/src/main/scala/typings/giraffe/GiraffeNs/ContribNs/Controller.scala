package typings.giraffe.GiraffeNs.ContribNs

import typings.backbone.backboneMod.Events
import typings.backbone.backboneMod.EventsMixin
import typings.giraffe.GiraffeNs.App
import typings.giraffe.GiraffeNs.GiraffeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe.Contrib.Controller")
@js.native
class Controller ()
  extends EventsMixin
     with GiraffeObject
     with Events {
  /* CompleteClass */
  override var app: App = js.native
  /**
    * Faulty overgeneralization of Backbone.Events.on, for historical
    * reasons.
    */
  def on(eventName: js.Any): this.type = js.native
  def on(eventName: js.Any, callback: js.Any): this.type = js.native
  def on(eventName: js.Any, callback: js.Any, context: js.Any): this.type = js.native
}

