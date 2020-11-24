package typings.ejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache_ extends js.Object {
  
  /**
    * Get the cached intermediate JavaScript function for a template.
    *
    * @param key key for caching
    */
  def get(key: String): js.UndefOr[TemplateFunction] = js.native
  
  /**
    * Clear the entire cache.
    */
  def reset(): Unit = js.native
  
  /**
    * Cache the intermediate JavaScript function for a template.
    *
    * @param key key for caching
    * @param val cached function
    */
  def set(key: String, `val`: TemplateFunction): Unit = js.native
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
  
  @scala.inline
  implicit class Cache_Ops[Self <: Cache_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: String => js.UndefOr[TemplateFunction]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (String, TemplateFunction) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
