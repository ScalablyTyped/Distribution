package typings.gapiDotClientDotPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Url extends js.Object {
  /**
    * The URL of the actor's profile photo. To resize the image and crop it to a square, append the query string ?sz=x, where x is the dimension in pixels of
    * each side.
    */
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Url {
  @scala.inline
  def apply(url: String = null): Anon_Url = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Url]
  }
}

