package typings.ellipsize

import typings.ellipsize.anon.Chars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ellipsize", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): String = js.native
  def apply(/**
    * text to ellipsize.
    */
  text: String): String = js.native
  def apply(
    /**
    * text to ellipsize.
    */
  text: String,
    /**
    * maxLength of the text before it is ellipsized (default: 140)
    */
  maxLength: Double
  ): String = js.native
  def apply(
    /**
    * text to ellipsize.
    */
  text: String,
    /**
    * maxLength of the text before it is ellipsized (default: 140)
    */
  maxLength: Double,
    /**
    * additional options to customize the result and rules
    */
  options: Chars
  ): String = js.native
}

