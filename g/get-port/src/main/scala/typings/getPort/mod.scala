package typings.getPort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-port", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Double]]
  inline def default(options: Options): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  inline def portNumbers(from: Double, to: Double): js.Iterable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("portNumbers")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[Double]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ListenOptions * / any, 'port'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ListenOptions * / any[P]} */ trait Options extends StObject {
    
    /**
    	Ports that should not be returned.
    	You could, for example, pass it the return value of the `portNumbers()` function.
    	*/
    val exclude: js.UndefOr[js.Iterable[Double]] = js.undefined
    
    /**
    	The host on which port resolution should be performed. Can be either an IPv4 or IPv6 address.
    	By default, it checks availability on all local addresses defined in [OS network interfaces](https://nodejs.org/api/os.html#os_os_networkinterfaces). If this option is set, it will only check the given host.
    	*/
    val host: js.UndefOr[String] = js.undefined
    
    /**
    	A preferred port or an iterable of preferred ports to use.
    	*/
    val port: js.UndefOr[Double | js.Iterable[Double]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExclude(value: js.Iterable[Double]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double | js.Iterable[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
