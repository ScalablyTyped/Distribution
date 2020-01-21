package typings.ejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache_ extends js.Object {
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

object Cache_ {
  @scala.inline
  def apply(
    get: String => js.UndefOr[TemplateFunction],
    reset: () => Unit,
    set: (String, TemplateFunction) => Unit
  ): Cache_ = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Cache_]
  }
}

