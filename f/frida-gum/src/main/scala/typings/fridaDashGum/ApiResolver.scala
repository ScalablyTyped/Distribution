package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides efficient API resolving using globs, allowing you to quickly
  * find functions by name, with globs permitted.
  */
@JSGlobal("ApiResolver")
@js.native
class ApiResolver protected () extends js.Object {
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
    * @param query Resolver-specific query.
    */
  def enumerateMatches(query: String): js.Array[ApiResolverMatch] = js.native
}

