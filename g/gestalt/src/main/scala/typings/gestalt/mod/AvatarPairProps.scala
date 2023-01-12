package typings.gestalt.mod

import typings.gestalt.anon.Name
import typings.gestalt.gestaltStrings.fit
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvatarPairProps extends StObject {
  
  var collaborators: js.Array[Name]
  
  var size: js.UndefOr[md | lg | fit] = js.undefined
}
object AvatarPairProps {
  
  inline def apply(collaborators: js.Array[Name]): AvatarPairProps = {
    val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarPairProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvatarPairProps] (val x: Self) extends AnyVal {
    
    inline def setCollaborators(value: js.Array[Name]): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    inline def setCollaboratorsVarargs(value: Name*): Self = StObject.set(x, "collaborators", js.Array(value*))
    
    inline def setSize(value: md | lg | fit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
