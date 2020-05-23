package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides efficient API resolving using globs, allowing you to quickly
  * find functions by name, with globs permitted.
  */
trait ApiResolver extends js.Object {
  /**
    * Performs the resolver-specific query.
    *
    * @param query Resolver-specific query.
    */
  def enumerateMatches(query: String): js.Array[ApiResolverMatch]
}

object ApiResolver {
  @scala.inline
  def apply(enumerateMatches: String => js.Array[ApiResolverMatch]): ApiResolver = {
    val __obj = js.Dynamic.literal(enumerateMatches = js.Any.fromFunction1(enumerateMatches))
    __obj.asInstanceOf[ApiResolver]
  }
}

