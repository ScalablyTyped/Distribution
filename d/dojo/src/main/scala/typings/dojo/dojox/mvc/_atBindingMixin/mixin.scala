package typings.dojo.dojox.mvc._atBindingMixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/_atBindingMixin.mixin.html
  *
  * The mixin for dijit/_WidgetBase to support data binding.
  *
  */
trait mixin extends js.Object {
  /**
    *
    */
  var `data-mvc-bindings`: String
  /**
    * The attribute name for data binding.
    *
    */
  var dataBindAttr: String
}

object mixin {
  @scala.inline
  def apply(`data-mvc-bindings`: String, dataBindAttr: String): mixin = {
    val __obj = js.Dynamic.literal(dataBindAttr = dataBindAttr.asInstanceOf[js.Any])
    __obj.updateDynamic("data-mvc-bindings")(`data-mvc-bindings`.asInstanceOf[js.Any])
    __obj.asInstanceOf[mixin]
  }
}

