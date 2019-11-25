package typings.dojo.dojo.dom_prop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dom-prop.names.html
  *
  *
  */
trait names extends js.Object {
  /**
    *
    */
  var `class`: String
  /**
    *
    */
  var colspan: String
  /**
    *
    */
  var `for`: String
  /**
    *
    */
  var frameborder: String
  /**
    *
    */
  var readonly: String
  /**
    *
    */
  var rowspan: String
  /**
    *
    */
  var tabindex: String
  /**
    *
    */
  var valuetype: String
}

object names {
  @scala.inline
  def apply(
    `class`: String,
    colspan: String,
    `for`: String,
    frameborder: String,
    readonly: String,
    rowspan: String,
    tabindex: String,
    valuetype: String
  ): names = {
    val __obj = js.Dynamic.literal(colspan = colspan.asInstanceOf[js.Any], frameborder = frameborder.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], rowspan = rowspan.asInstanceOf[js.Any], tabindex = tabindex.asInstanceOf[js.Any], valuetype = valuetype.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    __obj.asInstanceOf[names]
  }
}

