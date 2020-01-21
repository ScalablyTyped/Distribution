package typings.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_css3.html
  *
  * This module provide some cross-browser support for CSS3 properties.
  *
  */
trait css3 extends js.Object {
  /**
    * Prefixes all property names in "css3Styles" and adds the prefixed properties in "styles".
    * Used as a convenience when an object is passed to domStyle.set to set multiple styles.
    *
    * @param styles
    * @param css3Styles
    */
  def add(styles: js.Object, css3Styles: js.Object): js.Any
  /**
    * Returns the name of a CSS3 property with the correct prefix depending on the browser.
    *
    * @param p The (non-prefixed) property name. The property name is assumed to be consistent withthe hyphen argument, for example "transition-property" if hyphen is true, or "transitionProperty"if hyphen is false. If the browser supports the non-prefixed property, the property name will bereturned unchanged.
    * @param hyphen               OptionalOptional, true if hyphen notation should be used (for example "transition-property" or "-webkit-transition-property"),false for camel-case notation (for example "transitionProperty" or "webkitTransitionProperty").
    */
  def name(p: String, hyphen: Boolean): String
}

object css3 {
  @scala.inline
  def apply(add: (js.Object, js.Object) => js.Any, name: (String, Boolean) => String): css3 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), name = js.Any.fromFunction2(name))
  
    __obj.asInstanceOf[css3]
  }
}

