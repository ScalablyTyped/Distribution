package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationPage extends js.Object {
  
  /** Parse the current window.location in order to determine the target page */
  def init(): Unit = js.native
  
  /**
    * Check if the paginate feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean = js.native
  
  /**
    * Set the page in the dataset
    *
    * @param page The new page number
    */
  def set(page: Double): Unit = js.native
}
object PaginationPage {
  
  @scala.inline
  def apply(init: () => Unit, initOnLoad: () => Boolean, set: Double => Unit): PaginationPage = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[PaginationPage]
  }
  
  @scala.inline
  implicit class PaginationPageOps[Self <: PaginationPage] (val x: Self) extends AnyVal {
    
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
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitOnLoad(value: () => Boolean): Self = this.set("initOnLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: Double => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
}
