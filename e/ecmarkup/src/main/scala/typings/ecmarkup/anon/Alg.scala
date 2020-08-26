package typings.ecmarkup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alg extends js.Object {
  var alg: typings.std.Element = js.native
  var grammar: typings.std.Element = js.native
}

object Alg {
  @scala.inline
  def apply(alg: typings.std.Element, grammar: typings.std.Element): Alg = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], grammar = grammar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alg]
  }
  @scala.inline
  implicit class AlgOps[Self <: Alg] (val x: Self) extends AnyVal {
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
    def setAlg(value: typings.std.Element): Self = this.set("alg", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrammar(value: typings.std.Element): Self = this.set("grammar", value.asInstanceOf[js.Any])
  }
  
}

