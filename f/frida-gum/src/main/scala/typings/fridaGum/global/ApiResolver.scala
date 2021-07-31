package typings.fridaGum.global

import typings.fridaGum.ApiResolverMatch
import typings.fridaGum.ApiResolverType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides efficient API resolving using globs, allowing you to quickly
  * find functions by name, with globs permitted.
  */
@JSGlobal("ApiResolver")
@js.native
class ApiResolver protected ()
  extends StObject
     with typings.fridaGum.ApiResolver {
  /**
    * Creates a new resolver of the given `type`.
    *
    * Precisely which resolvers are available depends on the current
    * platform and runtimes loaded in the current process.
    *
    * The resolver will load the minimum amount of data required on creation,
    * and lazy-load the rest depending on the queries it receives. It is thus
    * recommended to use the same instance for a batch of queries, but
    * recreate it for future batches to avoid looking at stale data.
    *
    * @param type The type of resolver to create.
    */
  def this(`type`: ApiResolverType) = this()
  
  /**
    * Performs the resolver-specific query.
    *
    * @param query Resolver-specific query, optionally suffixed with `/i` to
    *              perform case-insensitive matching.
    */
  /* CompleteClass */
  override def enumerateMatches(query: String): js.Array[ApiResolverMatch] = js.native
}
