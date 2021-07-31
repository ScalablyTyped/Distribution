package typings.gestalt.mod

import typings.gestalt.anon.Name
import typings.gestalt.gestaltStrings.fit
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.xl
import typings.gestalt.gestaltStrings.xs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupAvatarProps extends StObject {
  
  var collaborators: js.Array[Name]
  
  var outline: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[xs | sm | md | lg | xl | fit] = js.undefined
}
object GroupAvatarProps {
  
  @scala.inline
  def apply(collaborators: js.Array[Name]): GroupAvatarProps = {
    val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupAvatarProps]
  }
  
  @scala.inline
  implicit class GroupAvatarPropsMutableBuilder[Self <: GroupAvatarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollaborators(value: js.Array[Name]): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollaboratorsVarargs(value: Name*): Self = StObject.set(x, "collaborators", js.Array(value :_*))
    
    @scala.inline
    def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setSize(value: xs | sm | md | lg | xl | fit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
