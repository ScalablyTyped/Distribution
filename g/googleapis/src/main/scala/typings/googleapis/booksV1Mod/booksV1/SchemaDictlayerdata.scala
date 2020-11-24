package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.Title
import typings.googleapis.anon.Words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDictlayerdata extends js.Object {
  
  var common: js.UndefOr[Title] = js.native
  
  var dict: js.UndefOr[Words] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object SchemaDictlayerdata {
  
  @scala.inline
  def apply(): SchemaDictlayerdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDictlayerdata]
  }
  
  @scala.inline
  implicit class SchemaDictlayerdataOps[Self <: SchemaDictlayerdata] (val x: Self) extends AnyVal {
    
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
    def setCommon(value: Title): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setDict(value: Words): Self = this.set("dict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDict: Self = this.set("dict", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
