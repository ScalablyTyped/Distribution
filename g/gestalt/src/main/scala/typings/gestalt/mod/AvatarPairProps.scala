package typings.gestalt.mod

import typings.gestalt.anon.Name
import typings.gestalt.gestaltStrings.fit
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvatarPairProps extends js.Object {
  
  var collaborators: js.Array[Name] = js.native
  
  var size: js.UndefOr[md | lg | fit] = js.native
}
object AvatarPairProps {
  
  @scala.inline
  def apply(collaborators: js.Array[Name]): AvatarPairProps = {
    val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarPairProps]
  }
  
  @scala.inline
  implicit class AvatarPairPropsOps[Self <: AvatarPairProps] (val x: Self) extends AnyVal {
    
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
    def setCollaboratorsVarargs(value: Name*): Self = this.set("collaborators", js.Array(value :_*))
    
    @scala.inline
    def setCollaborators(value: js.Array[Name]): Self = this.set("collaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: md | lg | fit): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
