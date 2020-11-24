package typings.emberData.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipMetaOptions
  extends /* k */ StringDictionary[js.Any] {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var inverse: js.UndefOr[String] = js.native
  
  var polymorphic: js.UndefOr[Boolean] = js.native
}
object RelationshipMetaOptions {
  
  @scala.inline
  def apply(): RelationshipMetaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipMetaOptions]
  }
  
  @scala.inline
  implicit class RelationshipMetaOptionsOps[Self <: RelationshipMetaOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setInverse(value: String): Self = this.set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    
    @scala.inline
    def setPolymorphic(value: Boolean): Self = this.set("polymorphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolymorphic: Self = this.set("polymorphic", js.undefined)
  }
}
