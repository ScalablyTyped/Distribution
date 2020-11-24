package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.Boundary
import typings.googleapis.anon.Lang
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGeolayerdata extends js.Object {
  
  var common: js.UndefOr[Lang] = js.native
  
  var geo: js.UndefOr[Boundary] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object SchemaGeolayerdata {
  
  @scala.inline
  def apply(): SchemaGeolayerdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeolayerdata]
  }
  
  @scala.inline
  implicit class SchemaGeolayerdataOps[Self <: SchemaGeolayerdata] (val x: Self) extends AnyVal {
    
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
    def setCommon(value: Lang): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setGeo(value: Boundary): Self = this.set("geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeo: Self = this.set("geo", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
