package typings.eonasdanBootstrapDatetimepicker.mod

import typings.eonasdanBootstrapDatetimepicker.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyBinds extends js.Object {
  
  var `control down`: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  
  var `control space`: js.UndefOr[js.Function1[/* widget */ JQuery, _]] = js.native
  
  var `control up`: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  
  var delete: js.UndefOr[js.Function0[_]] = js.native
  
  var down: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  
  var enter: js.UndefOr[js.Function0[_]] = js.native
  
  var escape: js.UndefOr[js.Function0[_]] = js.native
  
  var left: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  
  var pageDown: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  
  var pageUp: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  
  var right: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
  
  var t: js.UndefOr[js.Function0[_]] = js.native
  
  var up: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.native
}
object KeyBinds {
  
  @scala.inline
  def apply(): KeyBinds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyBinds]
  }
  
  @scala.inline
  implicit class KeyBindsOps[Self <: KeyBinds] (val x: Self) extends AnyVal {
    
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
    def `setControl down`(value: /* widget */ JQuery | Boolean => _): Self = this.set("control down", js.Any.fromFunction1(value))
    
    @scala.inline
    def `deleteControl down`: Self = this.set("control down", js.undefined)
    
    @scala.inline
    def `setControl space`(value: /* widget */ JQuery => _): Self = this.set("control space", js.Any.fromFunction1(value))
    
    @scala.inline
    def `deleteControl space`: Self = this.set("control space", js.undefined)
    
    @scala.inline
    def `setControl up`(value: /* widget */ JQuery | Boolean => _): Self = this.set("control up", js.Any.fromFunction1(value))
    
    @scala.inline
    def `deleteControl up`: Self = this.set("control up", js.undefined)
    
    @scala.inline
    def setDelete(value: () => _): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setDown(value: /* widget */ JQuery | Boolean => _): Self = this.set("down", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    
    @scala.inline
    def setEnter(value: () => _): Self = this.set("enter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setEscape(value: () => _): Self = this.set("escape", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setLeft(value: /* widget */ JQuery | Boolean => _): Self = this.set("left", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setPageDown(value: /* widget */ JQuery | Boolean => _): Self = this.set("pageDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePageDown: Self = this.set("pageDown", js.undefined)
    
    @scala.inline
    def setPageUp(value: /* widget */ JQuery | Boolean => _): Self = this.set("pageUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePageUp: Self = this.set("pageUp", js.undefined)
    
    @scala.inline
    def setRight(value: /* widget */ JQuery | Boolean => _): Self = this.set("right", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setT(value: () => _): Self = this.set("t", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteT: Self = this.set("t", js.undefined)
    
    @scala.inline
    def setUp(value: /* widget */ JQuery | Boolean => _): Self = this.set("up", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
}
