package typings
package fancyboxLib

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
    val __obj = js.Dynamic.literal(bg = bg, caption = caption, container = container, infobar = infobar, inner = inner, navigation = navigation, stage = stage, toolbar = toolbar)
  
    __obj.asInstanceOf[FancyBoxRefs]
  }
}

