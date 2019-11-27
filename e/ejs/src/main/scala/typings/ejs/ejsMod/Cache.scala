package typings.ejs.ejsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  /**
  	 * Get the cached intermediate JavaScript function for a template.
  	 *
  	 * @param key key for caching
  	 */
  def get(key: String): js.UndefOr[TemplateFunction]
  /**
  	 * Clear the entire cache.
  	 */
  def reset(): Unit
  /**
  	 * Cache the intermediate JavaScript function for a template.
  	 *
  	 * @param key key for caching
  	 * @param val cached function
  	 */
  def set(key: String, `val`: TemplateFunction): Unit
}

object Cache {
  @scala.inline
  def apply(
    get: String => js.UndefOr[TemplateFunction],
    reset: () => Unit,
    set: (String, TemplateFunction) => Unit
  ): Cache = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Cache]
  }
}

@JSImport("ejs", "cache")
@js.native
object cache extends TopLevel[Cache]

