package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides efficient API resolving using globs, allowing you to quickly
  * find functions by name, with globs permitted.
  */
trait ApiResolver extends StObject {
  
  /**
    * Performs the resolver-specific query.
    *
    * @param query Resolver-specific query, optionally suffixed with `/i` to
    *              perform case-insensitive matching.
    */
  def enumerateMatches(query: String): js.Array[ApiResolverMatch]
}
object ApiResolver {
  
  inline def apply(enumerateMatches: String => js.Array[ApiResolverMatch]): ApiResolver = {
    val __obj = js.Dynamic.literal(enumerateMatches = js.Any.fromFunction1(enumerateMatches))
    __obj.asInstanceOf[ApiResolver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiResolver] (val x: Self) extends AnyVal {
    
    inline def setEnumerateMatches(value: String => js.Array[ApiResolverMatch]): Self = StObject.set(x, "enumerateMatches", js.Any.fromFunction1(value))
  }
}
