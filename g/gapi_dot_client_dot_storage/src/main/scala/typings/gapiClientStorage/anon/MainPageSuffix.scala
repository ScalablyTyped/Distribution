package typings.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MainPageSuffix extends js.Object {
  /**
    * If the requested object path is missing, the service will ensure the path has a trailing '/', append this suffix, and attempt to retrieve the resulting
    * object. This allows the creation of index.html objects to represent directory pages.
    */
  var mainPageSuffix: js.UndefOr[String] = js.native
  /**
    * If the requested object path is missing, and any mainPageSuffix object is missing, if applicable, the service will return the named object from this
    * bucket as the content for a 404 Not Found result.
    */
  var notFoundPage: js.UndefOr[String] = js.native
}

object MainPageSuffix {
  @scala.inline
  def apply(): MainPageSuffix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MainPageSuffix]
  }
  @scala.inline
  implicit class MainPageSuffixOps[Self <: MainPageSuffix] (val x: Self) extends AnyVal {
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
    def setMainPageSuffix(value: String): Self = this.set("mainPageSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainPageSuffix: Self = this.set("mainPageSuffix", js.undefined)
    @scala.inline
    def setNotFoundPage(value: String): Self = this.set("notFoundPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundPage: Self = this.set("notFoundPage", js.undefined)
  }
  
}

