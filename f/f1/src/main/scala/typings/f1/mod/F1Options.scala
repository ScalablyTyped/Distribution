package typings.f1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait F1Options extends js.Object {
  
  var name: String = js.native
  
  var onState: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var onUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var parsers: js.Any = js.native
  
  var states: js.Any = js.native
  
  var targets: js.Any = js.native
  
  var transitions: js.Array[_] = js.native
}
object F1Options {
  
  @scala.inline
  def apply(name: String, parsers: js.Any, states: js.Any, targets: js.Any, transitions: js.Array[_]): F1Options = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parsers = parsers.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[F1Options]
  }
  
  @scala.inline
  implicit class F1OptionsOps[Self <: F1Options] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsers(value: js.Any): Self = this.set("parsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: js.Any): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargets(value: js.Any): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsVarargs(value: js.Any*): Self = this.set("transitions", js.Array(value :_*))
    
    @scala.inline
    def setTransitions(value: js.Array[_]): Self = this.set("transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnState(value: /* repeated */ js.Any => Unit): Self = this.set("onState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnState: Self = this.set("onState", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: /* repeated */ js.Any => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
  }
}
