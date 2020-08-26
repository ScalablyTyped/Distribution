package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domains2 extends js.Object {
  var domains: js.UndefOr[js.Array[Domains]] = js.native
  var etag: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
}

object Domains2 {
  @scala.inline
  def apply(): Domains2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domains2]
  }
  @scala.inline
  implicit class Domains2Ops[Self <: Domains2] (val x: Self) extends AnyVal {
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
    def setDomainsVarargs(value: Domains*): Self = this.set("domains", js.Array(value :_*))
    @scala.inline
    def setDomains(value: js.Array[Domains]): Self = this.set("domains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomains: Self = this.set("domains", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

