package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineGlobals extends js.Object {
  /** The userScript global */
  var global: js.Any = js.native
  /** The userScript metadata (as set in userScripts.register) */
  var metadata: js.Any = js.native
  /**
    * Exports all the properties of a given plain object as userScript globals
    * @param sourceObject A plain object whose properties are exported as userScript globals
    */
  def defineGlobals(sourceObject: js.Object): Unit = js.native
  /**
    * Convert a given value to make it accessible to the userScript code
    * @param value A value to convert into an object accessible to the userScript
    */
  def export(value: js.Any): js.Any = js.native
}

object DefineGlobals {
  @scala.inline
  def apply(defineGlobals: js.Object => Unit, export: js.Any => js.Any, global: js.Any, metadata: js.Any): DefineGlobals = {
    val __obj = js.Dynamic.literal(defineGlobals = js.Any.fromFunction1(defineGlobals), export = js.Any.fromFunction1(export), global = global.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineGlobals]
  }
  @scala.inline
  implicit class DefineGlobalsOps[Self <: DefineGlobals] (val x: Self) extends AnyVal {
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
    def setDefineGlobals(value: js.Object => Unit): Self = this.set("defineGlobals", js.Any.fromFunction1(value))
    @scala.inline
    def setExport(value: js.Any => js.Any): Self = this.set("export", js.Any.fromFunction1(value))
    @scala.inline
    def setGlobal(value: js.Any): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
  
}

