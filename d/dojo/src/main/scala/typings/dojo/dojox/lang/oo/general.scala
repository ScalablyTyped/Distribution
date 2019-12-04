package typings.dojo.dojox.lang.oo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/oo/general.html
  *
  *
  */
trait general extends js.Object {
  /**
    *
    */
  var after: js.Object
  /**
    *
    */
  var augment: js.Object
  /**
    *
    */
  var before: js.Object
  /**
    *
    */
  var `override`: js.Object
  /**
    *
    */
  var shuffle: js.Object
  /**
    *
    */
  var tap: js.Object
  /**
    *
    */
  var wrap: js.Object
}

object general {
  @scala.inline
  def apply(
    after: js.Object,
    augment: js.Object,
    before: js.Object,
    `override`: js.Object,
    shuffle: js.Object,
    tap: js.Object,
    wrap: js.Object
  ): general = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], augment = augment.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], shuffle = shuffle.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[general]
  }
}

