package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxRefs extends js.Object {
  var bg: JQuery
  var caption: JQuery
  var container: JQuery
  var infobar: JQuery
  var inner: JQuery
  var navigation: JQuery
  var stage: JQuery
  var toolbar: JQuery
}

object FancyBoxRefs {
  @scala.inline
  def apply(
    bg: JQuery,
    caption: JQuery,
    container: JQuery,
    infobar: JQuery,
    inner: JQuery,
    navigation: JQuery,
    stage: JQuery,
    toolbar: JQuery
  ): FancyBoxRefs = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], infobar = infobar.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxRefs]
  }
}

