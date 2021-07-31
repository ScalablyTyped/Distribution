package typings.fpTs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait URI[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
  
  val URI: F
}
object URI {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](URI: F): URI[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[URI[F]]
  }
  
  @scala.inline
  implicit class URIMutableBuilder[Self <: URI[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & URI[F]) extends AnyVal {
    
    @scala.inline
    def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
  }
}
