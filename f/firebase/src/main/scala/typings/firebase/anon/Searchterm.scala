package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Searchterm
  extends /* key */ StringDictionary[js.Any] {
  var search_term: js.UndefOr[String] = js.native
}

object Searchterm {
  @scala.inline
  def apply(): Searchterm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Searchterm]
  }
  @scala.inline
  implicit class SearchtermOps[Self <: Searchterm] (val x: Self) extends AnyVal {
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
    def setSearch_term(value: String): Self = this.set("search_term", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch_term: Self = this.set("search_term", js.undefined)
  }
  
}

