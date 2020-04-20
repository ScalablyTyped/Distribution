package typings.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.text.html
  *
  * Style of text
  *
  */
trait text extends js.Object {
  /**
    *
    */
  var color: String
  /**
    *
    */
  var deleteEmptyCreate: Boolean
  /**
    *
    */
  var deleteEmptyModify: Boolean
  /**
    *
    */
  var family: String
  /**
    *
    */
  var minWidth: Double
  /**
    *
    */
  var pad: Double
  /**
    *
    */
  var size: String
  /**
    *
    */
  var weight: String
}

object text {
  @scala.inline
  def apply(
    color: String,
    deleteEmptyCreate: Boolean,
    deleteEmptyModify: Boolean,
    family: String,
    minWidth: Double,
    pad: Double,
    size: String,
    weight: String
  ): text = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], deleteEmptyCreate = deleteEmptyCreate.asInstanceOf[js.Any], deleteEmptyModify = deleteEmptyModify.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[text]
  }
}

