package typings.ecmarkup.mod

import typings.ecmarkup.ecmarkupStrings.`inline`
import typings.ecmarkup.ecmarkupStrings.draft
import typings.ecmarkup.ecmarkupStrings.external
import typings.ecmarkup.ecmarkupStrings.none
import typings.ecmarkup.ecmarkupStrings.proposal
import typings.ecmarkup.ecmarkupStrings.standard
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var assets: js.UndefOr[none | `inline` | external] = js.native
  
  var boilerplate: js.UndefOr[Boilerplate] = js.native
  
  var contributors: js.UndefOr[String] = js.native
  
  var copyright: js.UndefOr[Boolean] = js.native
  
  var cssOut: js.UndefOr[String] = js.native
  
  var date: js.UndefOr[Date] = js.native
  
  var ecma262Biblio: js.UndefOr[Boolean] = js.native
  
  var jsOut: js.UndefOr[String] = js.native
  
  var lintSpec: js.UndefOr[Boolean] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var log: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  
  var oldToc: js.UndefOr[Boolean] = js.native
  
  var outfile: js.UndefOr[String] = js.native
  
  var shortname: js.UndefOr[String] = js.native
  
  var stage: js.UndefOr[String | Null] = js.native
  
  var status: js.UndefOr[proposal | draft | standard] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var toc: js.UndefOr[Boolean] = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var warn: js.UndefOr[js.Function1[/* err */ EcmarkupError, Unit]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAssets(value: none | `inline` | external): Self = this.set("assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssets: Self = this.set("assets", js.undefined)
    
    @scala.inline
    def setBoilerplate(value: Boilerplate): Self = this.set("boilerplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoilerplate: Self = this.set("boilerplate", js.undefined)
    
    @scala.inline
    def setContributors(value: String): Self = this.set("contributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributors: Self = this.set("contributors", js.undefined)
    
    @scala.inline
    def setCopyright(value: Boolean): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setCssOut(value: String): Self = this.set("cssOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssOut: Self = this.set("cssOut", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setEcma262Biblio(value: Boolean): Self = this.set("ecma262Biblio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcma262Biblio: Self = this.set("ecma262Biblio", js.undefined)
    
    @scala.inline
    def setJsOut(value: String): Self = this.set("jsOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsOut: Self = this.set("jsOut", js.undefined)
    
    @scala.inline
    def setLintSpec(value: Boolean): Self = this.set("lintSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLintSpec: Self = this.set("lintSpec", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLog(value: /* msg */ String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setOldToc(value: Boolean): Self = this.set("oldToc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldToc: Self = this.set("oldToc", js.undefined)
    
    @scala.inline
    def setOutfile(value: String): Self = this.set("outfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutfile: Self = this.set("outfile", js.undefined)
    
    @scala.inline
    def setShortname(value: String): Self = this.set("shortname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortname: Self = this.set("shortname", js.undefined)
    
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
    
    @scala.inline
    def setStageNull: Self = this.set("stage", null)
    
    @scala.inline
    def setStatus(value: proposal | draft | standard): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setToc(value: Boolean): Self = this.set("toc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToc: Self = this.set("toc", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWarn(value: /* err */ EcmarkupError => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
}
