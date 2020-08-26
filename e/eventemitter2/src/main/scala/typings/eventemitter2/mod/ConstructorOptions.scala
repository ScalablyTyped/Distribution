package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorOptions extends js.Object {
  /**
    * @default '.'
    * @description the delimiter used to segment namespaces.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * @default false
    * @description disable throwing uncaughtException if an error event is emitted and it has no listeners
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  /**
    * @default 10
    * @description the maximum amount of listeners that can be assigned to an event.
    */
  var maxListeners: js.UndefOr[Double] = js.native
  /**
    * @default false
    * @description set this to `true` if you want to emit the newListener events.
    */
  var newListener: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    * @description set this to `true` if you want to emit the removeListener events.
    */
  var removeListener: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    * @description show event name in memory leak message when more than maximum amount of listeners is assigned, default false
    */
  var verboseMemoryLeak: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    * @description set this to `true` to use wildcards.
    */
  var wildcard: js.UndefOr[Boolean] = js.native
}

object ConstructorOptions {
  @scala.inline
  def apply(): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptions]
  }
  @scala.inline
  implicit class ConstructorOptionsOps[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setIgnoreErrors(value: Boolean): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("ignoreErrors", js.undefined)
    @scala.inline
    def setMaxListeners(value: Double): Self = this.set("maxListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxListeners: Self = this.set("maxListeners", js.undefined)
    @scala.inline
    def setNewListener(value: Boolean): Self = this.set("newListener", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewListener: Self = this.set("newListener", js.undefined)
    @scala.inline
    def setRemoveListener(value: Boolean): Self = this.set("removeListener", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveListener: Self = this.set("removeListener", js.undefined)
    @scala.inline
    def setVerboseMemoryLeak(value: Boolean): Self = this.set("verboseMemoryLeak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerboseMemoryLeak: Self = this.set("verboseMemoryLeak", js.undefined)
    @scala.inline
    def setWildcard(value: Boolean): Self = this.set("wildcard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWildcard: Self = this.set("wildcard", js.undefined)
  }
  
}

