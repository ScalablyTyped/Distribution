package typings.fullcalendarInteraction.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraOptionRefiners extends StObject {
  
  var fixedMirrorParent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<HTMLElement> */ Any
}
object ExtraOptionRefiners {
  
  inline def apply(
    fixedMirrorParent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<HTMLElement> */ Any
  ): ExtraOptionRefiners = {
    val __obj = js.Dynamic.literal(fixedMirrorParent = fixedMirrorParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraOptionRefiners]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtraOptionRefiners] (val x: Self) extends AnyVal {
    
    inline def setFixedMirrorParent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<HTMLElement> */ Any
    ): Self = StObject.set(x, "fixedMirrorParent", value.asInstanceOf[js.Any])
  }
}
