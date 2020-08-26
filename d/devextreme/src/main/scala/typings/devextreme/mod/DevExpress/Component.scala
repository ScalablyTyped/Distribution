package typings.devextreme.mod.DevExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends js.Object {
  /** @name Component.beginUpdate() */
  def beginUpdate(): Unit = js.native
  /** @name Component.endUpdate() */
  def endUpdate(): Unit = js.native
  /** @name Component.instance() */
  def instance(): this.type = js.native
  /** @name Component.off(eventName) */
  def off(eventName: String): this.type = js.native
  /** @name Component.off(eventName, eventHandler) */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  /** @name Component.on(eventName, eventHandler) */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /** @name Component.on(events) */
  def on(events: js.Any): this.type = js.native
  /** @name Component.option() */
  def option(): js.Any = js.native
  /** @name Component.option(optionName) */
  def option(optionName: String): js.Any = js.native
  /** @name Component.option(optionName, optionValue) */
  def option(optionName: String, optionValue: js.Any): Unit = js.native
  /** @name Component.option(options) */
  def option(options: js.Any): Unit = js.native
  /** @name Component.resetOption(optionName) */
  def resetOption(optionName: String): Unit = js.native
}

