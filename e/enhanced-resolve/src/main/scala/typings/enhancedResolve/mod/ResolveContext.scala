package typings.enhancedResolve.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resolve context
  */
trait ResolveContext extends StObject {
  
  var contextDependencies: js.UndefOr[WriteOnlySet[String]] = js.undefined
  
  /**
  	 * files that was found on file system
  	 */
  var fileDependencies: js.UndefOr[WriteOnlySet[String]] = js.undefined
  
  /**
  	 * log function
  	 */
  var log: js.UndefOr[js.Function1[/* arg0 */ String, Unit]] = js.undefined
  
  /**
  	 * dependencies that was not found on file system
  	 */
  var missingDependencies: js.UndefOr[WriteOnlySet[String]] = js.undefined
  
  /**
  	 * set of hooks' calls. For instance, `resolve → parsedResolve → describedResolve`,
  	 */
  var stack: js.UndefOr[Set[String]] = js.undefined
  
  /**
  	 * yield result, if provided plugins can return several results
  	 */
  var `yield`: js.UndefOr[js.Function1[/* arg0 */ ResolveRequest, Unit]] = js.undefined
}
object ResolveContext {
  
  inline def apply(): ResolveContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveContext]
  }
  
  extension [Self <: ResolveContext](x: Self) {
    
    inline def setContextDependencies(value: WriteOnlySet[String]): Self = StObject.set(x, "contextDependencies", value.asInstanceOf[js.Any])
    
    inline def setContextDependenciesUndefined: Self = StObject.set(x, "contextDependencies", js.undefined)
    
    inline def setFileDependencies(value: WriteOnlySet[String]): Self = StObject.set(x, "fileDependencies", value.asInstanceOf[js.Any])
    
    inline def setFileDependenciesUndefined: Self = StObject.set(x, "fileDependencies", js.undefined)
    
    inline def setLog(value: /* arg0 */ String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setMissingDependencies(value: WriteOnlySet[String]): Self = StObject.set(x, "missingDependencies", value.asInstanceOf[js.Any])
    
    inline def setMissingDependenciesUndefined: Self = StObject.set(x, "missingDependencies", js.undefined)
    
    inline def setStack(value: Set[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setYield(value: /* arg0 */ ResolveRequest => Unit): Self = StObject.set(x, "yield", js.Any.fromFunction1(value))
    
    inline def setYieldUndefined: Self = StObject.set(x, "yield", js.undefined)
  }
}
