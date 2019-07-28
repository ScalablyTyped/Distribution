package typings.atFeathersjsFeathers.atFeathersjsFeathersMod

import typings.node.eventsMod.EventEmitter
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAddons[T] extends EventEmitter {
  def hooks(hooks: Partial[HooksObject]): this.type = js.native
}

