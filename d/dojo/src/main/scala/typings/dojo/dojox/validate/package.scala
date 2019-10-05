package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validate {
  import typings.std.HTMLFormElement

  type _base = _base_
  type br = br_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/check.html
    *
    * validates user input of an HTML form based on input profile
    * returns an object that contains several methods summarizing the results of the validation
    *
    * @param form form to be validated
    * @param profile specifies how the form fields are to be validated{trim:Array, uppercase:Array, lowercase:Array, ucfirst:Array, digit:Array,required:Array, dependencies:Object, constraints:Object, confirm:Object}
    */
  type check = js.Function2[/* form */ HTMLFormElement, /* profile */ js.Object, Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/isbn.html
    *
    * Validate ISBN-10 or ISBN-13 based on the length of value
    *
    * @param value An ISBN to validate
    */
  type isbn = js.Function1[/* value */ String, Unit]
  type regexp = regexp_
  type us = us_
  type web = web_
}
