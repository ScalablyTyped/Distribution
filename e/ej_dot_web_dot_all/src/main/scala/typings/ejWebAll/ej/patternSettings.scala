package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait patternSettings extends js.Object {
  var D: String = js.native
  var F: String = js.native
  var M: String = js.native
  var S: String = js.native
  var T: String = js.native
  var Y: String = js.native
  var d: String = js.native
  var f: String = js.native
  var t: String = js.native
}

object patternSettings {
  @scala.inline
  def apply(D: String, F: String, M: String, S: String, T: String, Y: String, d: String, f: String, t: String): patternSettings = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], F = F.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[patternSettings]
  }
  @scala.inline
  implicit class patternSettingsOps[Self <: patternSettings] (val x: Self) extends AnyVal {
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
    def setD(value: String): Self = this.set("D", value.asInstanceOf[js.Any])
    @scala.inline
    def setF(value: String): Self = this.set("F", value.asInstanceOf[js.Any])
    @scala.inline
    def setM(value: String): Self = this.set("M", value.asInstanceOf[js.Any])
    @scala.inline
    def setS(value: String): Self = this.set("S", value.asInstanceOf[js.Any])
    @scala.inline
    def setT(value: String): Self = this.set("T", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: String): Self = this.set("Y", value.asInstanceOf[js.Any])
  }
  
}

