package typings.gitParse

import typings.gitParse.anon.Stderr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCheckoutCommitMod {
  
  @JSImport("git-parse/dist/checkout_commit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pathToRepo: String, hash: String): js.Promise[Stderr] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathToRepo.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stderr]]
  inline def default(pathToRepo: String, hash: String, options: CheckoutCommmitOptions): js.Promise[Stderr] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathToRepo.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stderr]]
  
  trait CheckoutCommmitOptions extends StObject {
    
    var force: js.UndefOr[Boolean] = js.undefined
  }
  object CheckoutCommmitOptions {
    
    inline def apply(): CheckoutCommmitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckoutCommmitOptions]
    }
    
    extension [Self <: CheckoutCommmitOptions](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
}
